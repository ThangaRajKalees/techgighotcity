package com.java.example.services;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.example.dto.Forecast;
import com.java.example.dto.ForecastParam;
import com.java.example.dto.GeoLocation;

import tk.plogitech.darksky.forecast.APIKey;
import tk.plogitech.darksky.forecast.DarkSkyClient;
import tk.plogitech.darksky.forecast.ForecastException;
import tk.plogitech.darksky.forecast.ForecastRequest;
import tk.plogitech.darksky.forecast.ForecastRequestBuilder;
import tk.plogitech.darksky.forecast.GeoCoordinates;
import tk.plogitech.darksky.forecast.model.Latitude;
import tk.plogitech.darksky.forecast.model.Longitude;

@Scope("singleton")
@Service
public class WeatherForecast {
	private static final Logger log = LoggerFactory.getLogger(WeatherForecast.class);
	
	@Value("${apiKey}")
	private String apiKey;


	
	public List<ForecastParam> nextDayForecast(List<GeoLocation> locations) throws Exception {
		if(locations.size() == 0)
			throw new Exception("locations list size is zero.");
		
		List<ForecastParam> cityWiseNextDayData = new ArrayList<ForecastParam>();
		locations.stream().forEach(loc -> {
			LocalDate tomorrow = LocalDate.now().plusDays(1);

			String json =  getForcast(loc.getLongitude(), loc.getLatitude());
			
			List<ForecastParam> forecastList = this.jsonToObject(json).getDaily().getData();
			
			if(json != null && forecastList.size() !=0 && forecastList != null) {
				List<ForecastParam> i = forecastList.stream().filter(forecast -> {
					log.info("forecast.getTime().getDay() :: " + forecast.getTime().getDate());
					return (forecast.getTime().getDate() == tomorrow.getDayOfMonth()) ? true : false;
				}).collect(Collectors.toList());

				if (i.size() > 0) {
					i.get(0).setCityName(loc.getCityName());
					cityWiseNextDayData.add(i.get(0));
				}
			} else {
				log.error(loc.getCityName() + "(" + loc.getLongitude() +" " + loc.getLatitude() + ") geo location not found." );
			}
		});
		return cityWiseNextDayData;
	}
	
	
	
	public ForecastParam getMaxToAllCites(List<GeoLocation> locations) throws Exception {
		try {
			List<ForecastParam> citylist = nextDayForecast(locations);
			if(citylist.size() == 0)
				throw new Exception("City Wise Next Day date not found!.");
			ForecastParam hottest = getHottestForecast(citylist);
			return hottest;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	

	//Find Hottest forecast
	public ForecastParam getHottestForecast(List<ForecastParam> forecastList) throws Exception {
		log.info("\n getHottestForecast :: " + forecastList);
		if(forecastList.size() == 0)
			throw new Exception("No forecastList found");
		return forecastList.stream().max(Comparator.comparing(ForecastParam::getApparentTemperatureHigh)).orElseThrow(NoSuchElementException::new);
	}
	
	
	//Pull date from DarkSky Api
	public String getForcast(Double longitude, Double latitude) {
		try {
			ForecastRequest request = new ForecastRequestBuilder().key(new APIKey(apiKey))
					.location(new GeoCoordinates(new Longitude(longitude), new Latitude(latitude))).build();
			return new DarkSkyClient().forecastJsonString(request);
		} catch (ForecastException e) {
			log.error("ForecastException :: " + e.getMessage());
			return null;
		}
	}
	
	//Convert json string to Forecast object
	public Forecast jsonToObject(String json) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return (Forecast) mapper.readValue(json, Forecast.class);
		} catch (IOException e) {
			log.error("IOException :: " + e.getMessage());
			return null;
		}
	}
}
