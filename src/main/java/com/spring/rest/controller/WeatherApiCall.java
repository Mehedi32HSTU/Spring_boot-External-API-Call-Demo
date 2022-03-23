package com.spring.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.rest.models.WeatherDetailsDTO;

@RestController
public class WeatherApiCall {
	
	@Value("${api.key}")
	private String apiKey;

	@RequestMapping(value = "/weather", method = RequestMethod.GET)
	public ResponseEntity<?> helloWeather(){
		String helloMessage = "Hello Weather app for externar API call";
		return ResponseEntity.ok().body(helloMessage);
	}
	
	@RequestMapping(value = "/get-weather", method = RequestMethod.GET)
	public ResponseEntity<?> getWeather(@RequestParam(value = "division") String divisionName ){
		String fullUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + divisionName + "&appid="+apiKey; 
		System.out.println(fullUrl);
		RestTemplate restTemplate = new RestTemplate();
		
		WeatherDetailsDTO weatherReport = restTemplate.getForObject(fullUrl, WeatherDetailsDTO.class);
		
		System.out.println("----------------Object parsing done----------------");
		
		System.out.println(weatherReport.toString());
		
		return ResponseEntity.ok().body(weatherReport);
	}
}
