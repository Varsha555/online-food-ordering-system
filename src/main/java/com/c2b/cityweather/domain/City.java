package com.c2b.cityweather.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CityInfo")
public class City {
	
	  @Id
	  @GeneratedValue
      private Long id;
	  
	  @Column(name="cityName")
	  private String cityName;
	  @Column(name="state")
	  private String state;
	  @Column(name="zipCode")
	  private int zipCode;
	public City(Long id, String cityName, String state, int zipCode) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.state = state;
		this.zipCode = zipCode;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	  
	  
	

}
