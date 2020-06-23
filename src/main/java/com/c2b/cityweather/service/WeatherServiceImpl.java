package com.c2b.cityweather.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.c2b.cityweather.domain.City;
import com.c2b.cityweather.domain.Weather;
import com.c2b.cityweather.domain.WeatherRepository;

public class WeatherServiceImpl implements WeatherService {

	@Autowired
	private WeatherRepository weatherRepository;

	public List<Weather> findWeatherByCityName(String cityName) {

		return weatherRepository.findWeatherByCityName(cityName);

	}

}
