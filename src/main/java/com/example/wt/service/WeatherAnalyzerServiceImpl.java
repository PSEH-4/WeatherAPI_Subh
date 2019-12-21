package com.example.wt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wt.repo.WeatherAPIRepo;
import com.example.wt.util.WeatherAnalyzer;

@Service
public class WeatherAnalyzerServiceImpl implements WeatherAnalyzerService {
	
	@Autowired
	private WeatherAPIService service;

	@Override
	public String getWeatherAnalysis(String city) throws Exception {
		
		WeatherAnalyzer analyzer = new WeatherAnalyzer();
		return analyzer.getNextThreeDaysSuggestion(service.getForcast(city));
	}

}
