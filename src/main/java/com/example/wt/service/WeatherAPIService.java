package com.example.wt.service;

import com.example.wt.entity.WeatherData;

public interface WeatherAPIService {
	public WeatherData getForcast(String city) throws Exception ;

}
