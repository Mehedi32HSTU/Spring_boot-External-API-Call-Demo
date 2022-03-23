package com.spring.rest.models;

public class SystemInfo {
	
	
	private String country;
	private Long sunrise; 
	private Long sunset;
	
	
	
	public SystemInfo() {
		
	}
	public SystemInfo(String country, Long sunrise, Long sunset) {
		
		this.country = country;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}
	public String getCountry() {
		return country;
	}
	public Long getSunrise() {
		return sunrise;
	}
	public Long getSunset() {
		return sunset;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setSunrise(Long sunrise) {
		this.sunrise = sunrise;
	}
	public void setSunset(Long sunset) {
		this.sunset = sunset;
	}
	@Override
	public String toString() {
		return "SystemInfo [country=" + country + ", sunrise=" + sunrise + ", sunset=" + sunset + "]";
	} 


}
