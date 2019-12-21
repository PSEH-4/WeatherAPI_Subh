package com.example.wt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wt.entity.WeatherData;
import com.example.wt.repo.WeatherAPIRepo;
import com.example.wt.service.WeatherAnalyzerService;

@RestController
@RequestMapping("/api/weather")
public class WeatherAPIController {

	@Autowired
	private WeatherAnalyzerService weatherAnalyzerService;

	@RequestMapping("/status")
	public String status() {
		return "Weather forcast API working fine!";
	}

	@RequestMapping(value = "/forecast/{city}")
	@CrossOrigin
	public  String forcast(@PathVariable("city") String city) throws Exception {
		
		return weatherAnalyzerService.getWeatherAnalysis(city);
	}
		
}
