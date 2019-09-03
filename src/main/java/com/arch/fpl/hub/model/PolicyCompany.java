package com.arch.fpl.hub.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "zipCodePriAddr_1002", "businessName_1003", "haveDBA_1004", "nameDBA_1005" })
public class PolicyCompany {

	@JsonProperty("zipCodePriAddr_1002")
	private String zipCodePriAddr_1002;
	@JsonProperty("businessName_1003")
	private String businessName_1003;
	@JsonProperty("haveDBA_1004")
	private Boolean haveDBA_1004;
	@JsonProperty("nameDBA_1005")
	private String nameDBA_1005;

	@JsonProperty("zipCodePriAddr_1002")
	public String getZipCodePriAddr_1002() {
		return zipCodePriAddr_1002;
	}

	@JsonProperty("zipCodePriAddr_1002")
	public void setZipCodePriAddr_1002(String zipCodePriAddr_1002) {
		this.zipCodePriAddr_1002 = zipCodePriAddr_1002;
	}

	@JsonProperty("businessName_1003")
	public String getBusinessName_1003() {
		return businessName_1003;
	}

	@JsonProperty("businessName_1003")
	public void setBusinessName_1003(String businessName_1003) {
		this.businessName_1003 = businessName_1003;
	}

	@JsonProperty("haveDBA_1004")
	public Boolean getHaveDBA_1004() {
		return haveDBA_1004;
	}

	@JsonProperty("haveDBA_1004")
	public void setHaveDBA_1004(Boolean haveDBA_1004) {
		this.haveDBA_1004 = haveDBA_1004;
	}

	@JsonProperty("nameDBA_1005")
	public String getNameDBA_1005() {
		return nameDBA_1005;
	}

	@JsonProperty("nameDBA_1005")
	public void setNameDBA_1005(String nameDBA_1005) {
		this.nameDBA_1005 = nameDBA_1005;
	}

}