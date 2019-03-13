package com.java.example.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "sources", "nearest-station", "units" })
public class Flags {

	@JsonProperty("sources")
	private List<String> sources = null;
	@JsonProperty("nearest-station")
	private Double nearestStation;
	@JsonProperty("units")
	private String units;

	@JsonProperty("sources")
	public List<String> getSources() {
		return sources;
	}

	@JsonProperty("sources")
	public void setSources(List<String> sources) {
		this.sources = sources;
	}

	@JsonProperty("nearest-station")
	public Double getNearestStation() {
		return nearestStation;
	}

	@JsonProperty("nearest-station")
	public void setNearestStation(Double nearestStation) {
		this.nearestStation = nearestStation;
	}

	@JsonProperty("units")
	public String getUnits() {
		return units;
	}

	@JsonProperty("units")
	public void setUnits(String units) {
		this.units = units;
	}

}