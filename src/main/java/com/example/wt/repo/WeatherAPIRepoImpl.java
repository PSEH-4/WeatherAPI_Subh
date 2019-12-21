package com.example.wt.repo;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.wt.entity.WeatherData;

@Repository
public class WeatherAPIRepoImpl implements WeatherAPIRepo {
	private String URL = "http://api.openweathermap.org/data/2.5/forecast?q=city&mode=json&appid=d2929e9483efc82c82c32ee7e02d563e";

	public WeatherData getForcast(String city) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		WeatherData result = restTemplate.getForObject(URL.replace("city",city), WeatherData.class);
		return result;
	}
}
