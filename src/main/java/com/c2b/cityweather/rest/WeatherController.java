package com.c2b.cityweather.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.c2b.cityweather.domain.Weather;
import com.c2b.cityweather.service.WeatherService;

@RestController
@RequestMapping(value="WeatherInfo")
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;
	
	@GetMapping(value = "/get", headers = "Accept=application/json")
	public List<Weather> findWeatherByCityName(@RequestParam("cityName") String cityName)
	{
		List<Weather> list=weatherService.findWeatherByCityName(cityName);
		return list;
	}

}
