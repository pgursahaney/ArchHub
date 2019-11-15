package com.arch.fpl.hub.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "epl_2005", "diroff_2004", "crime_2007", "fiduciary_2006" })
public class PolicyProtection {

	@JsonProperty("epl_2005")
	private Boolean epl_2005;
	@JsonProperty("diroff_2004")
	private Boolean diroff_2004;
	@JsonProperty("crime_2007")
	private Boolean crime_2007;
	@JsonProperty("fiduciary_2006")
	private Boolean fiduciary_2006;

	@JsonProperty("epl_2005")
	public Boolean getEpl_2005() {
		return epl_2005;
	}

	@JsonProperty("epl_2005")
	public void setEpl_2005(Boolean epl_2005) {
		this.epl_2005 = epl_2005;
	}

	@JsonProperty("diroff_2004")
	public Boolean getDiroff_2004() {
		return diroff_2004;
	}

	@JsonProperty("diroff_2004")
	public void setDiroff_2004(Boolean diroff_2004) {
		this.diroff_2004 = diroff_2004;
	}

	@JsonProperty("crime_2007")
	public Boolean getCrime_2007() {
		return crime_2007;
	}

	@JsonProperty("crime_2007")
	public void setCrime_2007(Boolean crime_2007) {
		this.crime_2007 = crime_2007;
	}

	@JsonProperty("fiduciary_2006")
	public Boolean getFiduciary_2006() {
		return fiduciary_2006;
	}

	@JsonProperty("fiduciary_2006")
	public void setFiduciary_2006(Boolean fiduciary_2006) {
		this.fiduciary_2006 = fiduciary_2006;
	}

}