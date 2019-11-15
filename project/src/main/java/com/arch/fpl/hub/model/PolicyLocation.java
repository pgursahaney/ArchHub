package com.arch.fpl.hub.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "priAddr1_6004", "priAddr2_6005", "priAddrCity_6006", "priAddrSt_6007", "priAddrZip_6008",
		"useAsMailAddr_6009", "mailZip_6010", "mailAddr1_6011", "mailAddr2_6012", "mailCity_6013", "mailSt_6014",
		"altAddr1_6017", "altAddr2_6018", "altAddrCity_6019", "altAddrSt_6020", "altAddrZip_6021" })
public class PolicyLocation {

	@JsonProperty("priAddr1_6004")
	private String priAddr1_6004;
	@JsonProperty("priAddr2_6005")
	private String priAddr2_6005;
	@JsonProperty("priAddrCity_6006")
	private String priAddrCity_6006;
	@JsonProperty("priAddrSt_6007")
	private String priAddrSt_6007;
	@JsonProperty("priAddrZip_6008")
	private String priAddrZip_6008;
	@JsonProperty("useAsMailAddr_6009")
	private String useAsMailAddr_6009;
	@JsonProperty("mailZip_6010")
	private String mailZip_6010;
	@JsonProperty("mailAddr1_6011")
	private String mailAddr1_6011;
	@JsonProperty("mailAddr2_6012")
	private String mailAddr2_6012;
	@JsonProperty("mailCity_6013")
	private String mailCity_6013;
	@JsonProperty("mailSt_6014")
	private String mailSt_6014;
	@JsonProperty("altAddr1_6017")
	private String altAddr1_6017;
	@JsonProperty("altAddr2_6018")
	private String altAddr2_6018;
	@JsonProperty("altAddrCity_6019")
	private String altAddrCity_6019;
	@JsonProperty("altAddrSt_6020")
	private String altAddrSt_6020;
	@JsonProperty("altAddrZip_6021")
	private String altAddrZip_6021;

	@JsonProperty("priAddr1_6004")
	public String getPriAddr1_6004() {
		return priAddr1_6004;
	}

	@JsonProperty("priAddr1_6004")
	public void setPriAddr1_6004(String priAddr1_6004) {
		this.priAddr1_6004 = priAddr1_6004;
	}

	@JsonProperty("priAddr2_6005")
	public String getPriAddr2_6005() {
		return priAddr2_6005;
	}

	@JsonProperty("priAddr2_6005")
	public void setPriAddr2_6005(String priAddr2_6005) {
		this.priAddr2_6005 = priAddr2_6005;
	}

	@JsonProperty("priAddrCity_6006")
	public String getPriAddrCity_6006() {
		return priAddrCity_6006;
	}

	@JsonProperty("priAddrCity_6006")
	public void setPriAddrCity_6006(String priAddrCity_6006) {
		this.priAddrCity_6006 = priAddrCity_6006;
	}

	@JsonProperty("priAddrSt_6007")
	public String getPriAddrSt_6007() {
		return priAddrSt_6007;
	}

	@JsonProperty("priAddrSt_6007")
	public void setPriAddrSt_6007(String priAddrSt_6007) {
		this.priAddrSt_6007 = priAddrSt_6007;
	}

	@JsonProperty("priAddrZip_6008")
	public String getPriAddrZip_6008() {
		return priAddrZip_6008;
	}

	@JsonProperty("priAddrZip_6008")
	public void setPriAddrZip_6008(String priAddrZip_6008) {
		this.priAddrZip_6008 = priAddrZip_6008;
	}

	@JsonProperty("useAsMailAddr_6009")
	public String getUseAsMailAddr_6009() {
		return useAsMailAddr_6009;
	}

	@JsonProperty("useAsMailAddr_6009")
	public void setUseAsMailAddr_6009(String useAsMailAddr_6009) {
		this.useAsMailAddr_6009 = useAsMailAddr_6009;
	}

	@JsonProperty("mailZip_6010")
	public String getMailZip_6010() {
		return mailZip_6010;
	}

	@JsonProperty("mailZip_6010")
	public void setMailZip_6010(String mailZip_6010) {
		this.mailZip_6010 = mailZip_6010;
	}

	@JsonProperty("mailAddr1_6011")
	public String getMailAddr1_6011() {
		return mailAddr1_6011;
	}

	@JsonProperty("mailAddr1_6011")
	public void setMailAddr1_6011(String mailAddr1_6011) {
		this.mailAddr1_6011 = mailAddr1_6011;
	}

	@JsonProperty("mailAddr2_6012")
	public String getMailAddr2_6012() {
		return mailAddr2_6012;
	}

	@JsonProperty("mailAddr2_6012")
	public void setMailAddr2_6012(String mailAddr2_6012) {
		this.mailAddr2_6012 = mailAddr2_6012;
	}

	@JsonProperty("mailCity_6013")
	public String getMailCity_6013() {
		return mailCity_6013;
	}

	@JsonProperty("mailCity_6013")
	public void setMailCity_6013(String mailCity_6013) {
		this.mailCity_6013 = mailCity_6013;
	}

	@JsonProperty("mailSt_6014")
	public String getMailSt_6014() {
		return mailSt_6014;
	}

	@JsonProperty("mailSt_6014")
	public void setMailSt_6014(String mailSt_6014) {
		this.mailSt_6014 = mailSt_6014;
	}

	@JsonProperty("altAddr1_6017")
	public String getAltAddr1_6017() {
		return altAddr1_6017;
	}

	@JsonProperty("altAddr1_6017")
	public void setAltAddr1_6017(String altAddr1_6017) {
		this.altAddr1_6017 = altAddr1_6017;
	}

	@JsonProperty("altAddr2_6018")
	public String getAltAddr2_6018() {
		return altAddr2_6018;
	}

	@JsonProperty("altAddr2_6018")
	public void setAltAddr2_6018(String altAddr2_6018) {
		this.altAddr2_6018 = altAddr2_6018;
	}

	@JsonProperty("altAddrCity_6019")
	public String getAltAddrCity_6019() {
		return altAddrCity_6019;
	}

	@JsonProperty("altAddrCity_6019")
	public void setAltAddrCity_6019(String altAddrCity_6019) {
		this.altAddrCity_6019 = altAddrCity_6019;
	}

	@JsonProperty("altAddrSt_6020")
	public String getAltAddrSt_6020() {
		return altAddrSt_6020;
	}

	@JsonProperty("altAddrSt_6020")
	public void setAltAddrSt_6020(String altAddrSt_6020) {
		this.altAddrSt_6020 = altAddrSt_6020;
	}

	@JsonProperty("altAddrZip_6021")
	public String getAltAddrZip_6021() {
		return altAddrZip_6021;
	}

	@JsonProperty("altAddrZip_6021")
	public void setAltAddrZip_6021(String altAddrZip_6021) {
		this.altAddrZip_6021 = altAddrZip_6021;
	}

}