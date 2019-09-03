package com.arch.fpl.hub.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "policyCompany", "policyInformation", "policyProtection", "policyCompanyHistory",
		"policyFinancialInformation", "policyLocation", "policyBusinessBasics", "policyInsuranceHistory",
		"policyDirectorsAndOfficers", "policyEmploymentPracticesLiability", "policyFiduciaryLiability", "policyCrime" })
public class QuoteRequest {

	@JsonProperty("policyCompany")
	private PolicyCompany policyCompany;
	@JsonProperty("policyInformation")
	private PolicyInformation policyInformation;
	@JsonProperty("policyProtection")
	private PolicyProtection policyProtection;
	@JsonProperty("policyCompanyHistory")
	private PolicyCompanyHistory policyCompanyHistory;
	@JsonProperty("policyFinancialInformation")
	private PolicyFinancialInformation policyFinancialInformation;
	@JsonProperty("policyLocation")
	private List<PolicyLocation> policyLocation = null;
	@JsonProperty("policyBusinessBasics")
	private PolicyBusinessBasics policyBusinessBasics;
	@JsonProperty("policyInsuranceHistory")
	private PolicyInsuranceHistory policyInsuranceHistory;
	@JsonProperty("policyDirectorsAndOfficers")
	private PolicyDirectorsAndOfficers policyDirectorsAndOfficers;
	@JsonProperty("policyEmploymentPracticesLiability")
	private PolicyEmploymentPracticesLiability policyEmploymentPracticesLiability;
	@JsonProperty("policyFiduciaryLiability")
	private PolicyFiduciaryLiability policyFiduciaryLiability;
	@JsonProperty("policyCrime")
	private PolicyCrime policyCrime;

	@JsonProperty("policyCompany")
	public PolicyCompany getPolicyCompany() {
		return policyCompany;
	}

	@JsonProperty("policyCompany")
	public void setPolicyCompany(PolicyCompany policyCompany) {
		this.policyCompany = policyCompany;
	}

	@JsonProperty("policyInformation")
	public PolicyInformation getPolicyInformation() {
		return policyInformation;
	}

	@JsonProperty("policyInformation")
	public void setPolicyInformation(PolicyInformation policyInformation) {
		this.policyInformation = policyInformation;
	}

	@JsonProperty("policyProtection")
	public PolicyProtection getPolicyProtection() {
		return policyProtection;
	}

	@JsonProperty("policyProtection")
	public void setPolicyProtection(PolicyProtection policyProtection) {
		this.policyProtection = policyProtection;
	}

	@JsonProperty("policyCompanyHistory")
	public PolicyCompanyHistory getPolicyCompanyHistory() {
		return policyCompanyHistory;
	}

	@JsonProperty("policyCompanyHistory")
	public void setPolicyCompanyHistory(PolicyCompanyHistory policyCompanyHistory) {
		this.policyCompanyHistory = policyCompanyHistory;
	}

	@JsonProperty("policyFinancialInformation")
	public PolicyFinancialInformation getPolicyFinancialInformation() {
		return policyFinancialInformation;
	}

	@JsonProperty("policyFinancialInformation")
	public void setPolicyFinancialInformation(PolicyFinancialInformation policyFinancialInformation) {
		this.policyFinancialInformation = policyFinancialInformation;
	}

	@JsonProperty("policyLocation")
	public List<PolicyLocation> getPolicyLocation() {
		return policyLocation;
	}

	@JsonProperty("policyLocation")
	public void setPolicyLocation(List<PolicyLocation> policyLocation) {
		this.policyLocation = policyLocation;
	}

	@JsonProperty("policyBusinessBasics")
	public PolicyBusinessBasics getPolicyBusinessBasics() {
		return policyBusinessBasics;
	}

	@JsonProperty("policyBusinessBasics")
	public void setPolicyBusinessBasics(PolicyBusinessBasics policyBusinessBasics) {
		this.policyBusinessBasics = policyBusinessBasics;
	}

	@JsonProperty("policyInsuranceHistory")
	public PolicyInsuranceHistory getPolicyInsuranceHistory() {
		return policyInsuranceHistory;
	}

	@JsonProperty("policyInsuranceHistory")
	public void setPolicyInsuranceHistory(PolicyInsuranceHistory policyInsuranceHistory) {
		this.policyInsuranceHistory = policyInsuranceHistory;
	}

	@JsonProperty("policyDirectorsAndOfficers")
	public PolicyDirectorsAndOfficers getPolicyDirectorsAndOfficers() {
		return policyDirectorsAndOfficers;
	}

	@JsonProperty("policyDirectorsAndOfficers")
	public void setPolicyDirectorsAndOfficers(PolicyDirectorsAndOfficers policyDirectorsAndOfficers) {
		this.policyDirectorsAndOfficers = policyDirectorsAndOfficers;
	}

	@JsonProperty("policyEmploymentPracticesLiability")
	public PolicyEmploymentPracticesLiability getPolicyEmploymentPracticesLiability() {
		return policyEmploymentPracticesLiability;
	}

	@JsonProperty("policyEmploymentPracticesLiability")
	public void setPolicyEmploymentPracticesLiability(
			PolicyEmploymentPracticesLiability policyEmploymentPracticesLiability) {
		this.policyEmploymentPracticesLiability = policyEmploymentPracticesLiability;
	}

	@JsonProperty("policyFiduciaryLiability")
	public PolicyFiduciaryLiability getPolicyFiduciaryLiability() {
		return policyFiduciaryLiability;
	}

	@JsonProperty("policyFiduciaryLiability")
	public void setPolicyFiduciaryLiability(PolicyFiduciaryLiability policyFiduciaryLiability) {
		this.policyFiduciaryLiability = policyFiduciaryLiability;
	}

	@JsonProperty("policyCrime")
	public PolicyCrime getPolicyCrime() {
		return policyCrime;
	}

	@JsonProperty("policyCrime")
	public void setPolicyCrime(PolicyCrime policyCrime) {
		this.policyCrime = policyCrime;
	}

}