package com.arch.fpl.hub.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "fiscalYrMth_4004", "priorFiscalYrMth_4005", "currAsserts_4006", "totAsserts_4007",
		"priorTotAsserts_4008", "currLiabrilities_4009", "lonAsserts_4010", "priorTotAsserts_4011", "netAsserts_4012",
		"priorNetAssert_4013", "totaLiabiltities_4014", "retailEarn_4015", "revenues_4016", "prioRevenuies_4017",
		"sharHolEqty_4018", "netAsserts_4019", "priorNetIncome_4020", "cashFlowOprAct_4021" })
public class PolicyFinancialInformation {

	@JsonProperty("fiscalYrMth_4004")
	private String fiscalYrMth_4004;
	@JsonProperty("priorFiscalYrMth_4005")
	private String priorFiscalYrMth_4005;
	@JsonProperty("currAsserts_4006")
	private Double currAsserts_4006;
	@JsonProperty("totAsserts_4007")
	private Double totAsserts_4007;
	@JsonProperty("priorTotAsserts_4008")
	private Double priorTotAsserts_4008;
	@JsonProperty("currLiabrilities_4009")
	private Double currLiabrilities_4009;
	@JsonProperty("lonAsserts_4010")
	private Double lonAsserts_4010;
	@JsonProperty("priorTotAsserts_4011")
	private Double priorTotAsserts_4011;
	@JsonProperty("netAsserts_4012")
	private Double netAsserts_4012;
	@JsonProperty("priorNetAssert_4013")
	private Double priorNetAssert_4013;
	@JsonProperty("totaLiabiltities_4014")
	private Double totaLiabiltities_4014;
	@JsonProperty("retailEarn_4015")
	private Double retailEarn_4015;
	@JsonProperty("revenues_4016")
	private Double revenues_4016;
	@JsonProperty("prioRevenuies_4017")
	private Double prioRevenuies_4017;
	@JsonProperty("sharHolEqty_4018")
	private Double sharHolEqty_4018;
	@JsonProperty("netAsserts_4019")
	private Double netAsserts_4019;
	@JsonProperty("priorNetIncome_4020")
	private Double priorNetIncome_4020;
	@JsonProperty("cashFlowOprAct_4021")
	private Double cashFlowOprAct_4021;

	@JsonProperty("fiscalYrMth_4004")
	public String getFiscalYrMth_4004() {
		return fiscalYrMth_4004;
	}

	@JsonProperty("fiscalYrMth_4004")
	public void setFiscalYrMth_4004(String fiscalYrMth_4004) {
		this.fiscalYrMth_4004 = fiscalYrMth_4004;
	}

	@JsonProperty("priorFiscalYrMth_4005")
	public String getPriorFiscalYrMth_4005() {
		return priorFiscalYrMth_4005;
	}

	@JsonProperty("priorFiscalYrMth_4005")
	public void setPriorFiscalYrMth_4005(String priorFiscalYrMth_4005) {
		this.priorFiscalYrMth_4005 = priorFiscalYrMth_4005;
	}

	@JsonProperty("currAsserts_4006")
	public Double getCurrAsserts_4006() {
		return currAsserts_4006;
	}

	@JsonProperty("currAsserts_4006")
	public void setCurrAsserts_4006(Double currAsserts_4006) {
		this.currAsserts_4006 = currAsserts_4006;
	}

	@JsonProperty("totAsserts_4007")
	public Double getTotAsserts_4007() {
		return totAsserts_4007;
	}

	@JsonProperty("totAsserts_4007")
	public void setTotAsserts_4007(Double totAsserts_4007) {
		this.totAsserts_4007 = totAsserts_4007;
	}

	@JsonProperty("priorTotAsserts_4008")
	public Double getPriorTotAsserts_4008() {
		return priorTotAsserts_4008;
	}

	@JsonProperty("priorTotAsserts_4008")
	public void setPriorTotAsserts_4008(Double priorTotAsserts_4008) {
		this.priorTotAsserts_4008 = priorTotAsserts_4008;
	}

	@JsonProperty("currLiabrilities_4009")
	public Double getCurrLiabrilities_4009() {
		return currLiabrilities_4009;
	}

	@JsonProperty("currLiabrilities_4009")
	public void setCurrLiabrilities_4009(Double currLiabrilities_4009) {
		this.currLiabrilities_4009 = currLiabrilities_4009;
	}

	@JsonProperty("lonAsserts_4010")
	public Double getLonAsserts_4010() {
		return lonAsserts_4010;
	}

	@JsonProperty("lonAsserts_4010")
	public void setLonAsserts_4010(Double lonAsserts_4010) {
		this.lonAsserts_4010 = lonAsserts_4010;
	}

	@JsonProperty("priorTotAsserts_4011")
	public Double getPriorTotAsserts_4011() {
		return priorTotAsserts_4011;
	}

	@JsonProperty("priorTotAsserts_4011")
	public void setPriorTotAsserts_4011(Double priorTotAsserts_4011) {
		this.priorTotAsserts_4011 = priorTotAsserts_4011;
	}

	@JsonProperty("netAsserts_4012")
	public Double getNetAsserts_4012() {
		return netAsserts_4012;
	}

	@JsonProperty("netAsserts_4012")
	public void setNetAsserts_4012(Double netAsserts_4012) {
		this.netAsserts_4012 = netAsserts_4012;
	}

	@JsonProperty("priorNetAssert_4013")
	public Double getPriorNetAssert_4013() {
		return priorNetAssert_4013;
	}

	@JsonProperty("priorNetAssert_4013")
	public void setPriorNetAssert_4013(Double priorNetAssert_4013) {
		this.priorNetAssert_4013 = priorNetAssert_4013;
	}

	@JsonProperty("totaLiabiltities_4014")
	public Double getTotaLiabiltities_4014() {
		return totaLiabiltities_4014;
	}

	@JsonProperty("totaLiabiltities_4014")
	public void setTotaLiabiltities_4014(Double totaLiabiltities_4014) {
		this.totaLiabiltities_4014 = totaLiabiltities_4014;
	}

	@JsonProperty("retailEarn_4015")
	public Double getRetailEarn_4015() {
		return retailEarn_4015;
	}

	@JsonProperty("retailEarn_4015")
	public void setRetailEarn_4015(Double retailEarn_4015) {
		this.retailEarn_4015 = retailEarn_4015;
	}

	@JsonProperty("revenues_4016")
	public Double getRevenues_4016() {
		return revenues_4016;
	}

	@JsonProperty("revenues_4016")
	public void setRevenues_4016(Double revenues_4016) {
		this.revenues_4016 = revenues_4016;
	}

	@JsonProperty("prioRevenuies_4017")
	public Double getPrioRevenuies_4017() {
		return prioRevenuies_4017;
	}

	@JsonProperty("prioRevenuies_4017")
	public void setPrioRevenuies_4017(Double prioRevenuies_4017) {
		this.prioRevenuies_4017 = prioRevenuies_4017;
	}

	@JsonProperty("sharHolEqty_4018")
	public Double getSharHolEqty_4018() {
		return sharHolEqty_4018;
	}

	@JsonProperty("sharHolEqty_4018")
	public void setSharHolEqty_4018(Double sharHolEqty_4018) {
		this.sharHolEqty_4018 = sharHolEqty_4018;
	}

	@JsonProperty("netAsserts_4019")
	public Double getNetAsserts_4019() {
		return netAsserts_4019;
	}

	@JsonProperty("netAsserts_4019")
	public void setNetAsserts_4019(Double netAsserts_4019) {
		this.netAsserts_4019 = netAsserts_4019;
	}

	@JsonProperty("priorNetIncome_4020")
	public Double getPriorNetIncome_4020() {
		return priorNetIncome_4020;
	}

	@JsonProperty("priorNetIncome_4020")
	public void setPriorNetIncome_4020(Double priorNetIncome_4020) {
		this.priorNetIncome_4020 = priorNetIncome_4020;
	}

	@JsonProperty("cashFlowOprAct_4021")
	public Double getCashFlowOprAct_4021() {
		return cashFlowOprAct_4021;
	}

	@JsonProperty("cashFlowOprAct_4021")
	public void setCashFlowOprAct_4021(Double cashFlowOprAct_4021) {
		this.cashFlowOprAct_4021 = cashFlowOprAct_4021;
	}

}