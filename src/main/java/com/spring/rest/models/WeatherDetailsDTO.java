package com.spring.rest.models;

public class WeatherDetailsDTO {
	
	private MainWeatherInfo main;
	private SystemInfo sys;
	
	
	public WeatherDetailsDTO() {
		
	}
	
	public WeatherDetailsDTO(MainWeatherInfo main, SystemInfo sys) {
		this.main = main;
		this.sys = sys;
	}
	public MainWeatherInfo getMain() {
		return main;
	}
	public SystemInfo getSys() {
		return sys;
	}
	public void setMain(MainWeatherInfo main) {
		this.main = main;
	}
	public void setSys(SystemInfo sys) {
		this.sys = sys;
	}
	@Override
	public String toString() {
		return "WeatherDetailsDTO [main=" + main + ", sys=" + sys + "]";
	}
	
	

}
