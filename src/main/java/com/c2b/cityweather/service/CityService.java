package com.c2b.cityweather.service;

import com.c2b.cityweather.domain.City;

public interface CityService {
	
	public void addCity(City city);
	public City findById(long id);
	public City updateCity(City city,long id);
	public void deleteCityById(long id);

}
