package com.java.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.example.dto.ForecastParam;
import com.java.example.dto.GeoLocation;
import com.java.example.services.WeatherForecast;

@CrossOrigin("*")
@RequestMapping(value = "/weather/forecast")
@RestController
public class WeatherController {

	@Value("${apiKey}")
	private String apiKey;

	@Autowired
	WeatherForecast weatherForecast = null;

	//Hottest forecast for a given list of cities for the next day
	@RequestMapping(value = "cities/next/day", method = RequestMethod.GET)
	public ResponseEntity<ForecastParam> list() {

		List<GeoLocation> locs = new ArrayList<GeoLocation>();
		locs.add(new GeoLocation("New Delhi", 77.216721, 28.644800));
		locs.add(new GeoLocation("Mumbai, Maharashtra, India", 72.877426, 19.076090));
		// locs.add(new GeoLocation("Chennai, Tamil Nadu, India", 72.799736, 21.192572));
		locs.add(new GeoLocation("Surat", 72.799736, 21.192572));
		// locs.add(new GeoLocation("Pune", 73.856255, 18.516726));
		locs.add(new GeoLocation("Darjeeling", 88.262672, 27.036007));

		ForecastParam tomorrow = null;
		try {
			tomorrow = weatherForecast.getMaxToAllCites(locs);
			return new ResponseEntity<ForecastParam>(tomorrow, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ForecastParam>(tomorrow, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
