package com.c2b.cityweather.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.c2b.cityweather.domain.City;
import com.c2b.cityweather.domain.CityRepository;

public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;

	public void addCity(City city) {

		cityRepository.save(city);

	}

	public City findById(long id) {

		return cityRepository.findOne(id);
	}

	public City updateCity(City city, long id) {

		return cityRepository.save(city);
	}

	public void deleteCityById(long id) {
		cityRepository.delete(id);

	}

}
