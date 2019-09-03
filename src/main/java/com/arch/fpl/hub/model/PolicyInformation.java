package com.arch.fpl.hub.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "priCtcFrstNm_5002", "priCtcLsttNm_5003", "ifOwner_5004", "ownerFstNm_5005", "ownerLstNm_5006",
		"phone_5007", "email_5008", "covStartDt_5009" })
public class PolicyInformation {

	@JsonProperty("priCtcFrstNm_5002")
	private String priCtcFrstNm_5002;
	@JsonProperty("priCtcLsttNm_5003")
	private String priCtcLsttNm_5003;
	@JsonProperty("ifOwner_5004")
	private Boolean ifOwner_5004;
	@JsonProperty("ownerFstNm_5005")
	private String ownerFstNm_5005;
	@JsonProperty("ownerLstNm_5006")
	private String ownerLstNm_5006;
	@JsonProperty("phone_5007")
	private String phone_5007;
	@JsonProperty("email_5008")
	private String email_5008;
	@JsonProperty("covStartDt_5009")
	private String covStartDt_5009;

	@JsonProperty("priCtcFrstNm_5002")
	public String getPriCtcFrstNm_5002() {
		return priCtcFrstNm_5002;
	}

	@JsonProperty("priCtcFrstNm_5002")
	public void setPriCtcFrstNm_5002(String priCtcFrstNm_5002) {
		this.priCtcFrstNm_5002 = priCtcFrstNm_5002;
	}

	@JsonProperty("priCtcLsttNm_5003")
	public String getPriCtcLsttNm_5003() {
		return priCtcLsttNm_5003;
	}

	@JsonProperty("priCtcLsttNm_5003")
	public void setPriCtcLsttNm_5003(String priCtcLsttNm_5003) {
		this.priCtcLsttNm_5003 = priCtcLsttNm_5003;
	}

	@JsonProperty("ifOwner_5004")
	public Boolean getIfOwner_5004() {
		return ifOwner_5004;
	}

	@JsonProperty("ifOwner_5004")
	public void setIfOwner_5004(Boolean ifOwner_5004) {
		this.ifOwner_5004 = ifOwner_5004;
	}

	@JsonProperty("ownerFstNm_5005")
	public String getOwnerFstNm_5005() {
		return ownerFstNm_5005;
	}

	@JsonProperty("ownerFstNm_5005")
	public void setOwnerFstNm_5005(String ownerFstNm_5005) {
		this.ownerFstNm_5005 = ownerFstNm_5005;
	}

	@JsonProperty("ownerLstNm_5006")
	public String getOwnerLstNm_5006() {
		return ownerLstNm_5006;
	}

	@JsonProperty("ownerLstNm_5006")
	public void setOwnerLstNm_5006(String ownerLstNm_5006) {
		this.ownerLstNm_5006 = ownerLstNm_5006;
	}

	@JsonProperty("phone_5007")
	public String getPhone_5007() {
		return phone_5007;
	}

	@JsonProperty("phone_5007")
	public void setPhone_5007(String phone_5007) {
		this.phone_5007 = phone_5007;
	}

	@JsonProperty("email_5008")
	public String getEmail_5008() {
		return email_5008;
	}

	@JsonProperty("email_5008")
	public void setEmail_5008(String email_5008) {
		this.email_5008 = email_5008;
	}

	@JsonProperty("covStartDt_5009")
	public String getCovStartDt_5009() {
		return covStartDt_5009;
	}

	@JsonProperty("covStartDt_5009")
	public void setCovStartDt_5009(String covStartDt_5009) {
		this.covStartDt_5009 = covStartDt_5009;
	}

}