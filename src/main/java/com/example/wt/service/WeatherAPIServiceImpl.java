package com.example.wt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wt.entity.WeatherData;
import com.example.wt.repo.WeatherAPIRepo;

@Service
public class WeatherAPIServiceImpl implements WeatherAPIService {

	@Autowired
	private WeatherAPIRepo WeatherAPIRepo;
	
	@Override
	public WeatherData getForcast(String city) throws Exception {
		return WeatherAPIRepo.getForcast(city);
	}

}
