package com.java.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<ForecastParam> list(@RequestBody List<GeoLocation> locs) {
		ForecastParam tomorrow = null;
		try {
			tomorrow = weatherForecast.getMaxToAllCites(locs);
			return new ResponseEntity<ForecastParam>(tomorrow, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ForecastParam>(tomorrow, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
