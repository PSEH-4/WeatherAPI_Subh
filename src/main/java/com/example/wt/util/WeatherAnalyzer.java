package com.example.wt.util;

import java.util.List;

import com.example.wt.entity.Weather;
import com.example.wt.entity.WeatherData;

public class WeatherAnalyzer {
	
	public String getNextThreeDaysSuggestion(WeatherData wData)
	{
		List<com.example.wt.entity.List> list = wData.getList();
		for (com.example.wt.entity.List l : list) {
			
			if (l.getMain().getTempMax() >= 287)
				return "Use Sunscreen lotion";
		}
		for (com.example.wt.entity.List l : list) {
			for (Weather w : l.getWeather()) {
				if (w.getMain().contains("Rain"))
					return "Carry Umberella";
			}
		}
		return "Normal Weather!!";
	
	}

}
