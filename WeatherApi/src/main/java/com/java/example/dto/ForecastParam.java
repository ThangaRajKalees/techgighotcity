package com.java.example.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "temperature", "apparentTemperature", "time", "summary", "icon", "precipIntensity",
		"precipProbability", "dewPoint", "humidity", "pressure", "windSpeed", "windGust", "windBearing", "cloudCover",
		"uvIndex", "visibility", "ozone", "sunriseTime", "sunsetTime", "moonPhase", "precipIntensityMax",
		"precipIntensityMaxTime", "precipType", "temperatureHigh", "temperatureHighTime", "temperatureLow",
		"temperatureLowTime", "apparentTemperatureHigh", "apparentTemperatureHighTime", "apparentTemperatureLow",
		"apparentTemperatureLowTime", "windGustTime", "uvIndexTime", "temperatureMin", "temperatureMinTime",
		"temperatureMax", "temperatureMaxTime", "apparentTemperatureMin", "apparentTemperatureMinTime",
		"apparentTemperatureMax", "apparentTemperatureMaxTime" })
public class ForecastParam {

	String cityName = null;
	
	//HourlyForecast
	@JsonProperty("temperature")
	private Double temperature;
	@JsonProperty("apparentTemperature")
	private Double apparentTemperature;
	
	//Common
	@JsonProperty("time")
	private Date time;
	@JsonProperty("summary")
	private String summary;
	@JsonProperty("icon")
	private String icon;
	@JsonProperty("precipIntensity")
	private Integer precipIntensity;
	@JsonProperty("precipProbability")
	private Integer precipProbability;
	@JsonProperty("dewPoint")
	private Double dewPoint;
	@JsonProperty("humidity")
	private Double humidity;
	@JsonProperty("pressure")
	private Double pressure;
	@JsonProperty("windSpeed")
	private Double windSpeed;
	@JsonProperty("windGust")
	private Double windGust;
	@JsonProperty("windBearing")
	private Integer windBearing;
	@JsonProperty("cloudCover")
	private Integer cloudCover;
	@JsonProperty("uvIndex")
	private Integer uvIndex;
	@JsonProperty("visibility")
	private Double visibility;
	@JsonProperty("ozone")
	private Double ozone;
	
	//DailyForecast
	@JsonProperty("sunriseTime")
	private Date sunriseTime;
	@JsonProperty("sunsetTime")
	private Date sunsetTime;
	@JsonProperty("moonPhase")
	private Double moonPhase;
	@JsonProperty("precipIntensityMax")
	private Double precipIntensityMax;
	@JsonProperty("precipIntensityMaxTime")
	private Date precipIntensityMaxTime;
	@JsonProperty("precipType")
	private String precipType;
	@JsonProperty("temperatureHigh")
	private Double temperatureHigh;
	@JsonProperty("temperatureHighTime")
	private Date temperatureHighTime;
	@JsonProperty("temperatureLow")
	private Double temperatureLow;
	@JsonProperty("temperatureLowTime")
	private Date temperatureLowTime;
	@JsonProperty("apparentTemperatureHigh")
	private Double apparentTemperatureHigh;
	@JsonProperty("apparentTemperatureHighTime")
	private Date apparentTemperatureHighTime;
	@JsonProperty("apparentTemperatureLow")
	private Double apparentTemperatureLow;
	@JsonProperty("apparentTemperatureLowTime")
	private Date apparentTemperatureLowTime;
	@JsonProperty("windGustTime")
	private Date windGustTime;
	@JsonProperty("uvIndexTime")
	private Date uvIndexTime;
	@JsonProperty("temperatureMin")
	private Double temperatureMin;
	@JsonProperty("temperatureMinTime")
	private Date temperatureMinTime;
	@JsonProperty("temperatureMax")
	private Double temperatureMax;
	@JsonProperty("temperatureMaxTime")
	private Date temperatureMaxTime;
	@JsonProperty("apparentTemperatureMin")
	private Double apparentTemperatureMin;
	@JsonProperty("apparentTemperatureMinTime")
	private Date apparentTemperatureMinTime;
	@JsonProperty("apparentTemperatureMax")
	private Double apparentTemperatureMax;
	@JsonProperty("apparentTemperatureMaxTime")
	private Date apparentTemperatureMaxTime;

	@JsonProperty("temperature")
	public Double getTemperature() {
		return temperature;
	}

	@JsonProperty("temperature")
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	@JsonProperty("apparentTemperature")
	public Double getApparentTemperature() {
		return apparentTemperature;
	}

	@JsonProperty("apparentTemperature")
	public void setApparentTemperature(Double apparentTemperature) {
		this.apparentTemperature = apparentTemperature;
	}

	@JsonProperty("time")
	public Date getTime() {
		return time;
	}

	@JsonProperty("time")
	public void setTime(Integer time) {
		this.time = new java.util.Date((long)time*1000);
	}

	@JsonProperty("summary")
	public String getSummary() {
		return summary;
	}

	@JsonProperty("summary")
	public void setSummary(String summary) {
		this.summary = summary;
	}

	@JsonProperty("icon")
	public String getIcon() {
		return icon;
	}

	@JsonProperty("icon")
	public void setIcon(String icon) {
		this.icon = icon;
	}

	@JsonProperty("precipIntensity")
	public Integer getPrecipIntensity() {
		return precipIntensity;
	}

	@JsonProperty("precipIntensity")
	public void setPrecipIntensity(Integer precipIntensity) {
		this.precipIntensity = precipIntensity;
	}

	@JsonProperty("precipProbability")
	public Integer getPrecipProbability() {
		return precipProbability;
	}

	@JsonProperty("precipProbability")
	public void setPrecipProbability(Integer precipProbability) {
		this.precipProbability = precipProbability;
	}

	@JsonProperty("dewPoint")
	public Double getDewPoint() {
		return dewPoint;
	}

	@JsonProperty("dewPoint")
	public void setDewPoint(Double dewPoint) {
		this.dewPoint = dewPoint;
	}

	@JsonProperty("humidity")
	public Double getHumidity() {
		return humidity;
	}

	@JsonProperty("humidity")
	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}

	@JsonProperty("pressure")
	public Double getPressure() {
		return pressure;
	}

	@JsonProperty("pressure")
	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}

	@JsonProperty("windSpeed")
	public Double getWindSpeed() {
		return windSpeed;
	}

	@JsonProperty("windSpeed")
	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}

	@JsonProperty("windGust")
	public Double getWindGust() {
		return windGust;
	}

	@JsonProperty("windGust")
	public void setWindGust(Double windGust) {
		this.windGust = windGust;
	}

	@JsonProperty("windBearing")
	public Integer getWindBearing() {
		return windBearing;
	}

	@JsonProperty("windBearing")
	public void setWindBearing(Integer windBearing) {
		this.windBearing = windBearing;
	}

	@JsonProperty("cloudCover")
	public Integer getCloudCover() {
		return cloudCover;
	}

	@JsonProperty("cloudCover")
	public void setCloudCover(Integer cloudCover) {
		this.cloudCover = cloudCover;
	}

	@JsonProperty("uvIndex")
	public Integer getUvIndex() {
		return uvIndex;
	}

	@JsonProperty("uvIndex")
	public void setUvIndex(Integer uvIndex) {
		this.uvIndex = uvIndex;
	}

	@JsonProperty("visibility")
	public Double getVisibility() {
		return visibility;
	}

	@JsonProperty("visibility")
	public void setVisibility(Double visibility) {
		this.visibility = visibility;
	}

	@JsonProperty("ozone")
	public Double getOzone() {
		return ozone;
	}

	@JsonProperty("ozone")
	public void setOzone(Double ozone) {
		this.ozone = ozone;
	}

	@JsonProperty("sunriseTime")
	public Date getSunriseTime() {
		return sunriseTime;
	}

	@JsonProperty("sunriseTime")
	public void setSunriseTime(Integer sunriseTime) {
		this.sunriseTime = new java.util.Date((long)sunriseTime*1000);
	}

	@JsonProperty("sunsetTime")
	public Date getSunsetTime() {
		return sunsetTime;
	}

	@JsonProperty("sunsetTime")
	public void setSunsetTime(Integer sunsetTime) {
		this.sunsetTime = new java.util.Date((long)sunsetTime*1000);
	}

	@JsonProperty("moonPhase")
	public Double getMoonPhase() {
		return moonPhase;
	}

	@JsonProperty("moonPhase")
	public void setMoonPhase(Double moonPhase) {
		this.moonPhase = moonPhase;
	}

	@JsonProperty("precipIntensityMax")
	public Double getPrecipIntensityMax() {
		return precipIntensityMax;
	}

	@JsonProperty("precipIntensityMax")
	public void setPrecipIntensityMax(Double precipIntensityMax) {
		this.precipIntensityMax = precipIntensityMax;
	}

	@JsonProperty("precipIntensityMaxTime")
	public Date getPrecipIntensityMaxTime() {
		return precipIntensityMaxTime;
	}

	@JsonProperty("precipIntensityMaxTime")
	public void setPrecipIntensityMaxTime(Integer precipIntensityMaxTime) {
		this.precipIntensityMaxTime = new java.util.Date((long)precipIntensityMaxTime*1000);
	}

	@JsonProperty("precipType")
	public String getPrecipType() {
		return precipType;
	}

	@JsonProperty("precipType")
	public void setPrecipType(String precipType) {
		this.precipType = precipType;
	}

	@JsonProperty("temperatureHigh")
	public Double getTemperatureHigh() {
		return temperatureHigh;
	}

	@JsonProperty("temperatureHigh")
	public void setTemperatureHigh(Double temperatureHigh) {
		this.temperatureHigh = temperatureHigh;
	}

	@JsonProperty("temperatureHighTime")
	public Date getTemperatureHighTime() {
		return temperatureHighTime;
	}

	@JsonProperty("temperatureHighTime")
	public void setTemperatureHighTime(Integer temperatureHighTime) {
		this.temperatureHighTime = new java.util.Date((long)temperatureHighTime*1000);
	}

	@JsonProperty("temperatureLow")
	public Double getTemperatureLow() {
		return temperatureLow;
	}

	@JsonProperty("temperatureLow")
	public void setTemperatureLow(Double temperatureLow) {
		this.temperatureLow = temperatureLow;
	}

	@JsonProperty("temperatureLowTime")
	public Date getTemperatureLowTime() {
		return temperatureLowTime;
	}

	@JsonProperty("temperatureLowTime")
	public void setTemperatureLowTime(Integer temperatureLowTime) {
		this.temperatureLowTime = new java.util.Date((long)temperatureLowTime*1000);
	}

	@JsonProperty("apparentTemperatureHigh")
	public Double getApparentTemperatureHigh() {
		return apparentTemperatureHigh;
	}

	@JsonProperty("apparentTemperatureHigh")
	public void setApparentTemperatureHigh(Double apparentTemperatureHigh) {
		this.apparentTemperatureHigh = apparentTemperatureHigh;
	}

	@JsonProperty("apparentTemperatureHighTime")
	public Date getApparentTemperatureHighTime() {
		return apparentTemperatureHighTime;
	}

	@JsonProperty("apparentTemperatureHighTime")
	public void setApparentTemperatureHighTime(Integer apparentTemperatureHighTime) {
		this.apparentTemperatureHighTime = new java.util.Date((long)apparentTemperatureHighTime*1000);
	}

	@JsonProperty("apparentTemperatureLow")
	public Double getApparentTemperatureLow() {
		return apparentTemperatureLow;
	}

	@JsonProperty("apparentTemperatureLow")
	public void setApparentTemperatureLow(Double apparentTemperatureLow) {
		this.apparentTemperatureLow = apparentTemperatureLow;
	}

	@JsonProperty("apparentTemperatureLowTime")
	public Date getApparentTemperatureLowTime() {
		return apparentTemperatureLowTime;
	}

	@JsonProperty("apparentTemperatureLowTime")
	public void setApparentTemperatureLowTime(Integer apparentTemperatureLowTime) {
		this.apparentTemperatureLowTime = new java.util.Date((long)apparentTemperatureLowTime*1000);
	}

	@JsonProperty("windGustTime")
	public Date getWindGustTime() {
		return windGustTime;
	}

	@JsonProperty("windGustTime")
	public void setWindGustTime(Integer windGustTime) {
		this.windGustTime = new java.util.Date((long)windGustTime*1000);
	}

	@JsonProperty("uvIndexTime")
	public Date getUvIndexTime() {
		return uvIndexTime;
	}

	@JsonProperty("uvIndexTime")
	public void setUvIndexTime(Integer uvIndexTime) {
		this.uvIndexTime = new java.util.Date((long)uvIndexTime*1000);
	}

	@JsonProperty("temperatureMin")
	public Double getTemperatureMin() {
		return temperatureMin;
	}

	@JsonProperty("temperatureMin")
	public void setTemperatureMin(Double temperatureMin) {
		this.temperatureMin = temperatureMin;
	}

	@JsonProperty("temperatureMinTime")
	public Date getTemperatureMinTime() {
		return temperatureMinTime;
	}

	@JsonProperty("temperatureMinTime")
	public void setTemperatureMinTime(Integer temperatureMinTime) {
		this.temperatureMinTime = new java.util.Date((long)temperatureMinTime*1000);
	}

	@JsonProperty("temperatureMax")
	public Double getTemperatureMax() {
		return temperatureMax;
	}

	@JsonProperty("temperatureMax")
	public void setTemperatureMax(Double temperatureMax) {
		this.temperatureMax = temperatureMax;
	}

	@JsonProperty("temperatureMaxTime")
	public Date getTemperatureMaxTime() {
		return temperatureMaxTime;
	}

	@JsonProperty("temperatureMaxTime")
	public void setTemperatureMaxTime(Integer temperatureMaxTime) {
		this.temperatureMaxTime = new java.util.Date((long)temperatureMaxTime*1000);
	}

	@JsonProperty("apparentTemperatureMin")
	public Double getApparentTemperatureMin() {
		return apparentTemperatureMin;
	}

	@JsonProperty("apparentTemperatureMin")
	public void setApparentTemperatureMin(Double apparentTemperatureMin) {
		this.apparentTemperatureMin = apparentTemperatureMin;
	}

	@JsonProperty("apparentTemperatureMinTime")
	public Date getApparentTemperatureMinTime() {
		return apparentTemperatureMinTime;
	}

	@JsonProperty("apparentTemperatureMinTime")
	public void setApparentTemperatureMinTime(Integer apparentTemperatureMinTime) {
		this.apparentTemperatureMinTime =  new java.util.Date((long)apparentTemperatureMinTime*1000);
	}

	@JsonProperty("apparentTemperatureMax")
	public Double getApparentTemperatureMax() {
		return apparentTemperatureMax;
	}

	@JsonProperty("apparentTemperatureMax")
	public void setApparentTemperatureMax(Double apparentTemperatureMax) {
		this.apparentTemperatureMax = apparentTemperatureMax;
	}

	@JsonProperty("apparentTemperatureMaxTime")
	public Date getApparentTemperatureMaxTime() {
		return apparentTemperatureMaxTime;
	}

	@JsonProperty("apparentTemperatureMaxTime")
	public void setApparentTemperatureMaxTime(Integer apparentTemperatureMaxTime) {
		this.apparentTemperatureMaxTime = new java.util.Date((long)apparentTemperatureMaxTime*1000);
	}
	
	

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "ForecastParam [temperature=" + temperature + ", apparentTemperature=" + apparentTemperature + ", time="
				+ time + ", summary=" + summary + ", icon=" + icon + ", precipIntensity=" + precipIntensity
				+ ", precipProbability=" + precipProbability + ", dewPoint=" + dewPoint + ", humidity=" + humidity
				+ ", pressure=" + pressure + ", windSpeed=" + windSpeed + ", windGust=" + windGust + ", windBearing="
				+ windBearing + ", cloudCover=" + cloudCover + ", uvIndex=" + uvIndex + ", visibility=" + visibility
				+ ", ozone=" + ozone + ", sunriseTime=" + sunriseTime + ", sunsetTime=" + sunsetTime + ", moonPhase="
				+ moonPhase + ", precipIntensityMax=" + precipIntensityMax + ", precipIntensityMaxTime="
				+ precipIntensityMaxTime + ", precipType=" + precipType + ", temperatureHigh=" + temperatureHigh
				+ ", temperatureHighTime=" + temperatureHighTime + ", temperatureLow=" + temperatureLow
				+ ", temperatureLowTime=" + temperatureLowTime + ", apparentTemperatureHigh=" + apparentTemperatureHigh
				+ ", apparentTemperatureHighTime=" + apparentTemperatureHighTime + ", apparentTemperatureLow="
				+ apparentTemperatureLow + ", apparentTemperatureLowTime=" + apparentTemperatureLowTime
				+ ", windGustTime=" + windGustTime + ", uvIndexTime=" + uvIndexTime + ", temperatureMin="
				+ temperatureMin + ", temperatureMinTime=" + temperatureMinTime + ", temperatureMax=" + temperatureMax
				+ ", temperatureMaxTime=" + temperatureMaxTime + ", apparentTemperatureMin=" + apparentTemperatureMin
				+ ", apparentTemperatureMinTime=" + apparentTemperatureMinTime + ", apparentTemperatureMax="
				+ apparentTemperatureMax + ", apparentTemperatureMaxTime=" + apparentTemperatureMaxTime + "]";
	}
	
	

}