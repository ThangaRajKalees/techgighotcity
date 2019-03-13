package com.java.example.dto;

public class GeoLocation {

	private String cityName = null;
	private Double longitude = 0d;
	private Double latitude = 0d;

	public GeoLocation(String cityName, Double longitude, Double latitude) {
		super();
		this.cityName = cityName;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

}
