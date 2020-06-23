package com.c2b.cityweather.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<Weather,Long>{
	
	@Query("SELECT w FROM Weather w where w.cityName=?1" )
	public List<Weather> findWeatherByCityName(String cityName);

}
