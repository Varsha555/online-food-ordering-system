package com.c2b.cityweather.service;

import java.util.List;

import com.c2b.cityweather.domain.City;
import com.c2b.cityweather.domain.Weather;

public interface WeatherService {

	
	public List<Weather> findWeatherByCityName(String cityName);
}
