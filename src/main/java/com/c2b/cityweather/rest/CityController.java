package com.c2b.cityweather.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.util.UriComponentsBuilder;

import com.c2b.cityweather.domain.City;
import com.c2b.cityweather.domain.CityRepository;
import com.c2b.cityweather.service.CityService;

@RestController
@RequestMapping(value="/city")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@PostMapping(value="/create", headers="Accept=application/json")
	public ResponseEntity<Void> createCity(@RequestBody City city,UriComponentsBuilder ucBuilder)
	{
	     cityService.addCity(city);
	     HttpHeaders header=new HttpHeaders();
    	 header.setLocation(ucBuilder.path("/city/{id}").buildAndExpand(city.getId()).toUri());
    	 return new ResponseEntity<Void>(header,HttpStatus.CREATED);
	     
	}
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<City> findCityById(@PathVariable("id") long id)
	{
		City city=cityService.findById(id);
		if(city==null)
		{
			return new ResponseEntity<City>(HttpStatus.NOT_FOUND);
		}
		else
			return new ResponseEntity<City>(city,HttpStatus.OK);
		
		}
    
	@PutMapping(value="/update",headers="Accept=application/json")
	public ResponseEntity<String> updateCity(@RequestBody City currentCity)
	{
		City city=cityService.findById(currentCity.getId());
		if(city==null)
		{
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		cityService.updateCity(city,currentCity.getId());
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{id}",headers="Accept=application/json")
	public ResponseEntity<City> deleteCity(@PathVariable("id") long id)
	{
		City city=cityService.findById(id);
		if(city==null)
		{
			return new ResponseEntity<City>(HttpStatus.NOT_FOUND);
		}
		cityService.deleteCityById(id);
		return new ResponseEntity<City>(HttpStatus.OK);
	}
}
