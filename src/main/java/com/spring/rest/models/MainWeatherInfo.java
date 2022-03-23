package com.spring.rest.models;

public class MainWeatherInfo {
	
	private Double temp;
	private Double feels_like;
	private Double temp_min;
	private Double temp_max;
	private Long pressure;
	private Long humidity;
	private Long sea_level;
	private Long grnd_level;
	
	
	public MainWeatherInfo(Double temp, Double feels_like, Double temp_min, Double temp_max, Long pressure,
			Long humidity, Long sea_level, Long grnd_level) {
		this.temp = temp;
		this.feels_like = feels_like;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.pressure = pressure;
		this.humidity = humidity;
		this.sea_level = sea_level;
		this.grnd_level = grnd_level;
	}
	public MainWeatherInfo() {
		
	}
	public Double getTemp() {
		return temp;
	}
	public Double getFeels_like() {
		return feels_like;
	}
	public Double getTemp_min() {
		return temp_min;
	}
	public Double getTemp_max() {
		return temp_max;
	}
	public Long getPressure() {
		return pressure;
	}
	public Long getHumidity() {
		return humidity;
	}
	public Long getSea_level() {
		return sea_level;
	}
	public Long getGrnd_level() {
		return grnd_level;
	}
	public void setTemp(Double temp) {
		this.temp = temp;
	}
	public void setFeels_like(Double feels_like) {
		this.feels_like = feels_like;
	}
	public void setTemp_min(Double temp_min) {
		this.temp_min = temp_min;
	}
	public void setTemp_max(Double temp_max) {
		this.temp_max = temp_max;
	}
	public void setPressure(Long pressure) {
		this.pressure = pressure;
	}
	public void setHumidity(Long humidity) {
		this.humidity = humidity;
	}
	public void setSea_level(Long sea_level) {
		this.sea_level = sea_level;
	}
	public void setGrnd_level(Long grnd_level) {
		this.grnd_level = grnd_level;
	}
	@Override
	public String toString() {
		return "MainWeatherInfo [temp=" + temp + ", feels_like=" + feels_like + ", temp_min=" + temp_min + ", temp_max="
				+ temp_max + ", pressure=" + pressure + ", humidity=" + humidity + ", sea_level=" + sea_level
				+ ", grnd_level=" + grnd_level + "]";
	}
}
