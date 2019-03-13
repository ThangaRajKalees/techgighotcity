package com.java.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "latitude", "longitude", "timezone", "currently", "hourly", "daily", "flags", "offset" })
public class Forecast {

	@JsonProperty("latitude")
	private Double latitude;
	@JsonProperty("longitude")
	private Double longitude;
	@JsonProperty("timezone")
	private String timezone;
	@JsonProperty("currently")
	private ForecastParam currently;
	@JsonProperty("hourly")
	private HourlyForecast hourly;
	@JsonProperty("daily")
	private DailyForecast daily;
	@JsonProperty("flags")
	private Flags flags;
	@JsonProperty("offset")
	private Double offset;

	@JsonProperty("latitude")
	public Double getLatitude() {
		return latitude;
	}

	@JsonProperty("latitude")
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	@JsonProperty("longitude")
	public Double getLongitude() {
		return longitude;
	}

	@JsonProperty("longitude")
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	@JsonProperty("timezone")
	public String getTimezone() {
		return timezone;
	}

	@JsonProperty("timezone")
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	@JsonProperty("currently")
	public ForecastParam getCurrently() {
		return currently;
	}

	@JsonProperty("currently")
	public void setCurrently(ForecastParam currently) {
		this.currently = currently;
	}

	@JsonProperty("hourly")
	public HourlyForecast getHourly() {
		return hourly;
	}

	@JsonProperty("hourly")
	public void setHourly(HourlyForecast hourly) {
		this.hourly = hourly;
	}

	@JsonProperty("daily")
	public DailyForecast getDaily() {
		return daily;
	}

	@JsonProperty("daily")
	public void setDaily(DailyForecast daily) {
		this.daily = daily;
	}

	@JsonProperty("flags")
	public Flags getFlags() {
		return flags;
	}

	@JsonProperty("flags")
	public void setFlags(Flags flags) {
		this.flags = flags;
	}

	@JsonProperty("offset")
	public Double getOffset() {
		return offset;
	}

	@JsonProperty("offset")
	public void setOffset(Double offset) {
		this.offset = offset;
	}

	@Override
	public String toString() {
		return "Forecast [latitude=" + latitude + ", longitude=" + longitude + ", timezone=" + timezone + ", currently="
				+ currently + ", hourly=" + hourly + ", daily=" + daily + ", flags=" + flags + ", offset=" + offset
				+ "]";
	}
}