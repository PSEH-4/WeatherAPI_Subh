package com.example.wt.repo;

import com.example.wt.entity.WeatherData;

public interface WeatherAPIRepo {
	public WeatherData getForcast(String city) throws Exception ;

}
