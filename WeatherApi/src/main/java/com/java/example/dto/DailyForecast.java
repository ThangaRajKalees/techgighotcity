package com.java.example.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "summary", "icon", "data" })
public class DailyForecast {
	@JsonProperty("summary")
	private String summary;
	@JsonProperty("icon")
	private String icon;
	@JsonProperty("data")
	private List<ForecastParam> data = null;

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

	@JsonProperty("data")
	public List<ForecastParam> getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(List<ForecastParam> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DailyForecast [summary=" + summary + ", icon=" + icon + ", data=" + data + "]";
	}
}