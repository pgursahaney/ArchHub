package com.arch.fpl.hub.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "policy")
@XmlAccessorType(XmlAccessType.FIELD)
public class CreatePolicyRequestData {
	
	public CreatePolicyRequestData() {
		super();  
		// TODO Auto-generated constructor stub
	}
	@XmlAttribute(name = "ExtAction")
	public String  ExtAction = "A";
	

	@XmlElement(name="transactionType" )  public String  transactionType = "" ;
	@XmlElement(name="transactionSubType" )  public String  transactionSubType = "" ;
	@XmlElement(name="policyEffDt" )  public String  policyEffDt = "" ;
	@XmlElement(name="polTermLength" )  public Integer polTermLength = 0 ;
	@XmlElement(name="policyExpDt" )  public String  policyExpDt = "" ;
	@XmlElement(name="submissionID" )  public String  submissionID = "" ;
	@XmlElement(name="submissionStatus" )  public String  submissionStatus = "" ;
	@XmlElement(name="productGroup" )  public String  productGroup = "" ;
	@XmlElement(name="country" )  public String  country = "" ;
	@XmlElement(name="governingState" )  public String  governingState = "" ;
	@XmlElement(name="agentCd" )  public String  agentCd = "" ;
	@XmlElement(name="namedInsured" )  public String  namedInsured = "" ;
	@XmlElement(name="agentName" )  public String  agentName = "" ;
	@XmlElement(name="agentAddressLine1" )  public String  agentAddressLine1 = "" ;
	@XmlElement(name="agentAddressLine2" )  public String  agentAddressLine2 = "" ;
	@XmlElement(name="agentCity" )  public String  agentCity = "" ;
	@XmlElement(name="agentState" )  public String  agentState = "" ;
	@XmlElement(name="agentPostalCd" )  public String  agentPostalCd = "" ;
	@XmlElement(name="billingAddressLine1" )  public String  billingAddressLine1 = "" ;
	@XmlElement(name="billingAddressCity" )  public String  billingAddressCity = "" ;
	@XmlElement(name="billingAddressState" )  public String  billingAddressState = "" ;
	@XmlElement(name="billingAddressPostalCd" )  public String  billingAddressPostalCd = "" ;
	@XmlElement(name="producerContactPhoneNbr" )  public String  producerContactPhoneNbr = "" ;
	@XmlElement(name="assignedUnderwriter" )  public String  assignedUnderwriter = "" ;
	@XmlElement(name="Branch_Cd" )  public String  branchCd = "" ;
	@XmlElement(name="IsIssuingBranchCalifornia" )  public String  isIssuingBranchCalifornia = "" ;
	@XmlElement(name="BranchCd1" )  public String  branchCd1 = "" ;
	@XmlElement(name="BranchNm1" )  public String  branchNm1 = "" ;
	@XmlElement(name="BranchAddress1" )  public String  branchAddress1 = "" ;
	@XmlElement(name="customerID" )  public String  customerID = "" ;
	@XmlElement(name="Insured_Address_Postal_Cd" )  public String  insuredAddressPostalCd = "" ;
	@XmlElement(name="Insured_Address_City_Txt" )  public String  insuredAddressCityTxt = "" ;
	@XmlElement(name="Insured_Address_State_Cd" )  public String  insuredAddressStateCd = "" ;
	@XmlElement(name="Insured_Address_Street_Line_1_Txt" )  public String  insuredAddressStreetLine1Txt = "" ;
	@XmlElement(name="Insured_Address_Street_Line_2_Txt" )  public String  insuredAddressStreetLine2Txt = "" ;
	@XmlElement(name="Production_Region_Cd" )  public String  productionRegionCd = "" ;
	@XmlElement(name="polComments" )  public String  polComments = "" ;
	@XmlElement(name="Project_Desc" )  public String  Project_Desc = "" ;
	@XmlElement(name="DAC_Cd" )  public String  dacCd = "" ;
	@XmlElement(name="Primary_Excess_Ind" )  public String  primaryExcessInd = "" ;
	@XmlElement(name="Producer_Contact_Nm" )  public String  producerpContactpNm = "" ;
	@XmlElement(name="Producer_Contact_Email_Txt" )  public String  producerContactEmailTxt = "" ;
	@XmlElement(name="Profit_Center_Cd" )  public String  profitCenterCd = "" ;
	@XmlElement(name="Legal_Entity_Cd" )  public String  legalEntityCd = "" ;
	@XmlElement(name="section" )  public String  section = "" ;
	@XmlElement(name="program" )  public String  program = "" ;
	@XmlElement(name="Stage_Reason_Cd" )  public String  stageReasonCd = "" ;
	@XmlElement(name="QNTReasonTxt" )  public String  QNTReasonTxt = "" ;	
	@XmlElement(name="writingCompany" )  public String  writingCompany = "" ;
	@XmlElement(name="productOffering" )  public String  productOffering = "" ;
	@XmlElement(name="polSym" )  public String  polSym = "" ;
	@XmlElement(name="ratingModel" )  public String  ratingModel = "" ;
	@XmlElement(name="companyType" )  public String  companyType = "" ;
	@XmlElement(name ="ExternalSystemInd", required = true) public String externalSystemInd = "";
	
	public String getExtAction() {
		return ExtAction;
	}
	public void setExtAction(String extAction) {
		ExtAction = extAction;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getTransactionSubType() {
		return transactionSubType;
	}
	public void setTransactionSubType(String transactionSubType) {
		this.transactionSubType = transactionSubType;
	}
	public String getPolicyEffDt() {
		return policyEffDt;
	}
	public void setPolicyEffDt(String policyEffDt) {
		this.policyEffDt = policyEffDt;
	}
	public Integer getPolTermLength() {
		return polTermLength;
	}
	public void setPolTermLength(Integer polTermLength) {
		this.polTermLength = polTermLength;
	}
	public String getPolicyExpDt() {
		return policyExpDt;
	}
	public void setPolicyExpDt(String policyExpDt) {
		this.policyExpDt = policyExpDt;
	}
	public String getSubmissionID() {
		return submissionID;
	}
	public void setSubmissionID(String submissionID) {
		this.submissionID = submissionID;
	}
	public String getSubmissionStatus() {
		return submissionStatus;
	}
	public void setSubmissionStatus(String submissionStatus) {
		this.submissionStatus = submissionStatus;
	}
	public String getProductGroup() {
		return productGroup;
	}
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGoverningState() {
		return governingState;
	}
	public void setGoverningState(String governingState) {
		this.governingState = governingState;
	}
	public String getAgentCd() {
		return agentCd;
	}
	public void setAgentCd(String agentCd) {
		this.agentCd = agentCd;
	}
	public String getNamedInsured() {
		return namedInsured;
	}
	public void setNamedInsured(String namedInsured) {
		this.namedInsured = namedInsured;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentAddressLine1() {
		return agentAddressLine1;
	}
	public void setAgentAddressLine1(String agentAddressLine1) {
		this.agentAddressLine1 = agentAddressLine1;
	}
	public String getAgentAddressLine2() {
		return agentAddressLine2;
	}
	public void setAgentAddressLine2(String agentAddressLine2) {
		this.agentAddressLine2 = agentAddressLine2;
	}
	public String getAgentCity() {
		return agentCity;
	}
	public void setAgentCity(String agentCity) {
		this.agentCity = agentCity;
	}
	public String getAgentState() {
		return agentState;
	}
	public void setAgentState(String agentState) {
		this.agentState = agentState;
	}
	public String getAgentPostalCd() {
		return agentPostalCd;
	}
	public void setAgentPostalCd(String agentPostalCd) {
		this.agentPostalCd = agentPostalCd;
	}
	public String getBillingAddressLine1() {
		return billingAddressLine1;
	}
	public void setBillingAddressLine1(String billingAddressLine1) {
		this.billingAddressLine1 = billingAddressLine1;
	}
	public String getBillingAddressCity() {
		return billingAddressCity;
	}
	public void setBillingAddressCity(String billingAddressCity) {
		this.billingAddressCity = billingAddressCity;
	}
	public String getBillingAddressState() {
		return billingAddressState;
	}
	public void setBillingAddressState(String billingAddressState) {
		this.billingAddressState = billingAddressState;
	}
	public String getBillingAddressPostalCd() {
		return billingAddressPostalCd;
	}
	public void setBillingAddressPostalCd(String billingAddressPostalCd) {
		this.billingAddressPostalCd = billingAddressPostalCd;
	}
	public String getProducerContactPhoneNbr() {
		return producerContactPhoneNbr;
	}
	public void setProducerContactPhoneNbr(String producerContactPhoneNbr) {
		this.producerContactPhoneNbr = producerContactPhoneNbr;
	}
	public String getAssignedUnderwriter() {
		return assignedUnderwriter;
	}
	public void setAssignedUnderwriter(String assignedUnderwriter) {
		this.assignedUnderwriter = assignedUnderwriter;
	}
	public String getBranchCd() {
		return branchCd;
	}
	public void setBranchCd(String branchCd) {
		this.branchCd = branchCd;
	}
	public String getIsIssuingBranchCalifornia() {
		return isIssuingBranchCalifornia;
	}
	public void setIsIssuingBranchCalifornia(String isIssuingBranchCalifornia) {
		this.isIssuingBranchCalifornia = isIssuingBranchCalifornia;
	}
	public String getBranchCd1() {
		return branchCd1;
	}
	public void setBranchCd1(String branchCd1) {
		this.branchCd1 = branchCd1;
	}
	public String getBranchNm1() {
		return branchNm1;
	}
	public void setBranchNm1(String branchNm1) {
		this.branchNm1 = branchNm1;
	}
	public String getBranchAddress1() {
		return branchAddress1;
	}
	public void setBranchAddress1(String branchAddress1) {
		this.branchAddress1 = branchAddress1;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getInsuredAddressPostalCd() {
		return insuredAddressPostalCd;
	}
	public void setInsuredAddressPostalCd(String insuredAddressPostalCd) {
		this.insuredAddressPostalCd = insuredAddressPostalCd;
	}
	public String getInsuredAddressCityTxt() {
		return insuredAddressCityTxt;
	}
	public void setInsuredAddressCityTxt(String insuredAddressCityTxt) {
		this.insuredAddressCityTxt = insuredAddressCityTxt;
	}
	public String getInsuredAddressStateCd() {
		return insuredAddressStateCd;
	}
	public void setInsuredAddressStateCd(String insuredAddressStateCd) {
		this.insuredAddressStateCd = insuredAddressStateCd;
	}
	public String getInsuredAddressStreetLine1Txt() {
		return insuredAddressStreetLine1Txt;
	}
	public void setInsuredAddressStreetLine1Txt(String insuredAddressStreetLine1Txt) {
		this.insuredAddressStreetLine1Txt = insuredAddressStreetLine1Txt;
	}
	public String getInsuredAddressStreetLine2Txt() {
		return insuredAddressStreetLine2Txt;
	}
	public void setInsuredAddressStreetLine2Txt(String insuredAddressStreetLine2Txt) {
		this.insuredAddressStreetLine2Txt = insuredAddressStreetLine2Txt;
	}
	public String getProductionRegionCd() {
		return productionRegionCd;
	}
	public void setProductionRegionCd(String productionRegionCd) {
		this.productionRegionCd = productionRegionCd;
	}
	public String getPolComments() {
		return polComments;
	}
	public void setPolComments(String polComments) {
		this.polComments = polComments;
	}
	public String getProject_Desc() {
		return Project_Desc;
	}
	public void setProject_Desc(String project_Desc) {
		Project_Desc = project_Desc;
	}
	public String getDacCd() {
		return dacCd;
	}
	public void setDacCd(String dacCd) {
		this.dacCd = dacCd;
	}
	public String getPrimaryExcessInd() {
		return primaryExcessInd;
	}
	public void setPrimaryExcessInd(String primaryExcessInd) {
		this.primaryExcessInd = primaryExcessInd;
	}
	public String getProducerpContactpNm() {
		return producerpContactpNm;
	}
	public void setProducerpContactpNm(String producerpContactpNm) {
		this.producerpContactpNm = producerpContactpNm;
	}
	public String getProducerContactEmailTxt() {
		return producerContactEmailTxt;
	}
	public void setProducerContactEmailTxt(String producerContactEmailTxt) {
		this.producerContactEmailTxt = producerContactEmailTxt;
	}
	public String getProfitCenterCd() {
		return profitCenterCd;
	}
	public void setProfitCenterCd(String profitCenterCd) {
		this.profitCenterCd = profitCenterCd;
	}
	public String getLegalEntityCd() {
		return legalEntityCd;
	}
	public void setLegalEntityCd(String legalEntityCd) {
		this.legalEntityCd = legalEntityCd;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getStageReasonCd() {
		return stageReasonCd;
	}
	public void setStageReasonCd(String stageReasonCd) {
		this.stageReasonCd = stageReasonCd;
	}
	public String getQNTReasonTxt() {
		return QNTReasonTxt;
	}
	public void setQNTReasonTxt(String qNTReasonTxt) {
		QNTReasonTxt = qNTReasonTxt;
	}
	public String getWritingCompany() {
		return writingCompany;
	}
	public void setWritingCompany(String writingCompany) {
		this.writingCompany = writingCompany;
	}
	public String getProductOffering() {
		return productOffering;
	}
	public void setProductOffering(String productOffering) {
		this.productOffering = productOffering;
	}
	public String getPolSym() {
		return polSym;
	}
	public void setPolSym(String polSym) {
		this.polSym = polSym;
	}
	public String getRatingModel() {
		return ratingModel;
	}
	public void setRatingModel(String ratingModel) {
		this.ratingModel = ratingModel;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getExternalSystemInd() {
		return externalSystemInd;
	}
	public void setExternalSystemInd(String externalSystemInd) {
		this.externalSystemInd = externalSystemInd;
	}
}