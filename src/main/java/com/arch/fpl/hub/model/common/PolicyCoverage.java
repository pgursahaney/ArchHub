package com.arch.fpl.hub.model.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "coverageCd", "sequenceNo", "premiumAmt", "limit1Amt", "coverageTriggerCd",
		"triaElectedRejectedInd", "coverageEffectiveDt", "coverageExpirationDt", "deductible2Amt", "coverageOptions",
		"aprpPremium", "prevCovExpDt", "itdPremium", "aslob", "prevcoverageITDPrem", "tailDate", "prevITDERPPrem",
		"sublineCd", "prevTFSITDPrem", "postOverridePremiumflag", "postEnteredPremium", "litigationDate2Desc",
		"litigationDate3Desc", "conversionID", "prevTotalTransCovCommissionAmt", "totalITDCovCommissionamt",
		"deductible9Pct", "annualAAPHFLPremAmt", "prevAPRP", "partOf1Amt", "coverageAnnualPremAmt", "attachment1Amt",
		"overPremflagPl", "prevTotalITDCovCommissionAmt", "annualFiduciaryPremAmtI", "limitPremiumBearingAAPHFL",
		"entityInvInsPersSECInd", "rolHolder", "polCovLimit1PolCovPartOf", "scopeEntityInvCd", "uwreitInd",
		"manualPremium", "limit2Amt", "deductible1Amt", "minPremium", "limit1ApplicationCd", "deductible1TypeCd",
		"deductible1ApplicationCd", "employeeTheftInd2", "employeeTheftInd", "limitCheck", "coveragecommissionAmt",
		"prevAnnualPremium", "annualPremium", "prorateFactor", "proratedPremium", "netCalculatedPremium",
		"alternateCovCode", "thirdPartyLmtApplication", "thirdPartyDedApplication", "deathBenefitSngleLossLmtApp",
		"rrCostsSngleLossLmtApp", "rrSublimitLmtLiabApp", "insuringAggBDedApp", "insuringAggCDedApp",
		"minEarnedPremPct", "cancelMethodInd", "minEarnedPremFctr", "cancelFctr", "prevAdjustedAnnualPrem",
		"termPremOverrideInput", "adjustedAnnualPremium", "covTransactionEffDate", "totalPremium", "enteredPremium2",
		"cumulativePrem", "schedRatingFct", "overallRatingFct", "erpPremium", "itderpPremium", "limit1TypeCd",
		"deductible1TypeDesc", "erpCovCommissionAmt", "classCode", "eoerpPrevPrem", "postERPRunOffInd", "cancelFctrORP",
		"preverpPremOverrideInd", "mlob", "computerTheftCoverageSelection", "fundsTransferCoverageSelection",
		"riskClass", "crimeDiscovered", "crimeDiscoveryFactor", "investigationCostsLimit", "investigationCostFactor",
		"investigationCostPremium", "sublimit1Amt", "limit2TypeCd", "limit2ApplicationCd", "sublimit1RBAmt",
		"litigationDate1", "esop", "priorActs", "erpRunOffInd", "litigationDate1Desc", "priorActsDesc",
		"sublimit1ApplicationCd", "wpvBusinessInterCost", "dbSingleLossLimit", "rrSingleLossLimit",
		"sublimit3ApplicationCd", "sublimit1TypeCd", "deductible3Amt", "deductible2TypeCd", "deductible3TypeCd",
		"deductible2ApplicationCd", "deductible3ApplicationCd", "thirdPartyLimit", "thirdPartyDeductible",
		"litigationDateThirdParty", "deductible2TypeDesc", "litigationDateThirdPartyDesc", "includeThirdPartyCov",
		"eplThirdPPDate", "overrideEPLThirdValue", "overrideClaimsDeductible", "date3", "date4", "addtlLiabLimits",
		"deductible3TypeDesc", "date3Dropdown", "date4Dropdown", "litigationDate2", "litigationDate3", "sublimit2Amt",
		"sublimit3Amt", "retroactiveDt", "rate", "rrSublimitofLiab", "wastedList", "riskState", "otherDesc",
		"deathLimitofLiab", "mutLimitofLiab", "otherInjLimitofLiab", "totalGLPremiumAmt", "sublimit2ApplicationCd",
		"knrLitigationDate", "addtlLiabLimitFactor", "enteredPremium", "waitingPeriod", "crmCovLimit",
		"crmCovDeductible", "itemType", "municipality", "otherFeePremium", "overridePremiumflag", "addtlLimitOfLiab",
		"erpTerm", "erpPremOverrideInput", "erpAnnualPremium", "erpPremOverrideInd", "sublimit2TypeCd",
		"sublimit3TypeCd", "erpEffectiveDt", "tfsCode", "enteredKRPremium", "retroactiveDtDesc", "errAddLim500",
		"errEPLDed", "errDedCrmNULL", "knrComp", "overPremFlagHolder", "erpdateholder", "errEPLThirdPartyLim",
		"errThirdPartyDed", "errDedAmtDefault", "oosPremiumOverrideFlag", "coverageCode2", "coverageSupressTFS",
		"coverageCode3", "archTotalParticipation", "deductible4ApplicationCd", "deductible4TypeCd",
		"includeDerivDemandInvCostsInd", "subLimit1ApplicationCd", "subLimit1TypeCd", "deductible5ApplicationCd",
		"deductible5TypeCd", "includeNonIndemFIDInd", "erpRiskLevel", "subLimit2Amt", "subLimit2ApplicationCd",
		"subLimit2TypeCd", "reitInsAgrEInd", "deductible6Amt", "deductible6ApplicationCd", "deductible6TypeCd",
		"deductible6TypeDesc", "deductible7Amt", "deductible7ApplicationCd", "deductible7TypeCd", "deductible7TypeDesc",
		"deductible8Amt", "deductible8ApplicationCd", "deductible8TypeCd", "deductible8TypeDesc",
		"deductible9ApplicationCd", "deductible9TypeCd", "deductible9TypeDesc", "deductible10Pct",
		"deductible10ApplicationCd", "deductible10TypeCd", "deductible10TypeDesc", "deductible4Amt", "subLimit1Amt",
		"deductible5Amt", "provideSideAMatchInd", "deductible4TypeDesc", "deductible5TypeDesc", "limit2AmtDOP",
		"deductible2AmtDOP", "deductible3AmtDOP", "subLimit1AmtDOP", "deductible5AmtDOREIT", "advisoryILFFct",
		"annualDOPPremAmt", "thirdPartyLmtType", "thirdPartyDedType", "thirdPartyDedDesc", "excludeFundEPLInd",
		"overrideEPLThirdValueEPL", "includeThirdPartyCovEPL", "thirdPartyLimitEPL", "thirdPartyDeductibleEPL",
		"deductible1AmtAAPFID", "totalTransCovCommissionAmt", "deductible2Exclude", "deductible3Exclude",
		"deductible4Exclude", "deductible5Exclude", "deductible6Exclude", "deductible3AmtEPL", "deductible7Exclude",
		"deductible8Exclude", "deductible9Exclude", "deductible10Exclude", "limitAmtValidation", "dateVAlidation",
		"deductible2AmtAAP", "litigationDateDescAAPHFL", "defValueAAPHFL", "erpDefault", "rolPct", "inclLenderLiabInd",
		"attachment1AmtMAN", "covgOnPartnersInd", "limit2AmtFEMPTHR14", "deductible2AmtFEMPTHR14", "attachment2Amt",
		"partOf2Amt", "deductible3Pct", "isLastCrimeCoverage", "attachment5Amt", "erpFactor", "sublimit1AmtMAN",
		"sublimit2AmtMAN", "sublimit3AmtMAN", "deductible1Exclude", "litigationDate4Desc", "litigationDate4",
		"aaphflTailDateHolder", "erpIndHold", "basePremium", "baseRate1", "baseRate2", "baseRate3", "basicPremium",
		"cancelOverridePrem", "cededPremium", "cededPremiumITD", "cededPremiumOutput", "cedingCommPct",
		"computerBasicPremium", "constantKey", "coverageAddDelind", "crmForeignLocationExposureFct", "decLiabDOLimit",
		"decLiabEPLLimit", "decLiabFIDLimit", "deductibleAmount", "deleteIndicator", "desiredPremium", "displayTest",
		"dopPublicDebtCovFct", "eoAnnualPremium", "eoBusinessInterruptionFct", "eoClaimsHistoryFct",
		"eoCovMinimumPremiumAmt", "eoCovOverridePremiumAmt", "eoDataIncidenceSublimit", "eoDataIncidenceSublimitInd",
		"eoEncryptionControlsFct", "eoEnterpriseControlsFct", "eoExtortionFct", "eoFlexRatingFct", "eoHazardGroup",
		"eoMaximumScheduleRatingFct", "eoMediaLiabilityFct", "eoMinimumScheduleRatingFct", "eoNumberOfRecordsFct",
		"eoOptionalCoveragesPremium", "eoPerClaimLimit", "eoPerClaimRetention", "eoQualityOfManagementFct",
		"eoRegulatoryComplianceControlsFct", "eoSecurityControlsFct", "eoShareLiabilityDiscount",
		"eoSharedLiabilityLimitFct", "eoThirdPartyServicesProviderControlsFct", "eoTotalBasicPremium",
		"eoTotalCappedRating", "eoTotalCumulativePremium", "eoTotalPremiumIncOptionalCoverages",
		"eoTotalPremiumWithDiscount", "eoUnderwritingIntensityFct", "eobintAnnualPremium", "eocybeAnnualPremium",
		"eodireAnnualPremium", "eodireBasicPremium", "eomedlAnnualPremium", "eonsplAnnualPremium", "eonsplBasicPremium",
		"eoShortenedCovEffectiveDt", "eoShortenedCovExpirationDt", "eoShortenedCovTransactionDt",
		"eplThirdPartyPremium", "eplcaEmployeeFactorFct", "eplThirdPartyDeductibleFactor",
		"eplThirdPartyIncreasedLimitFactorFct", "erpEOAnnualPremium", "exposure", "facGrossReCededPremium",
		"facGrossReCededPremiumITD", "facGrossReCededPremiumOutput", "facNetReCededPremium", "facNetReCededPremiumITD",
		"facReinsurerParticipationLimit", "factor", "fundTransferBasicPremium", "ilfDedFactor", "itemid",
		"krAnnualPremiumHolder", "krbeMinPremAmt", "limitAmount", "lobid", "minimumAdjustment", "parentOccurrenceID",
		"prevAPRPPremium", "prevCededPremium", "prevCededPremiumITD", "prevCoverageCededPremium",
		"prevCoverageCededPremiumITD", "prevFacGrossReCededPremium", "prevFacGrossReCededPremiumITD",
		"prevFacNetReCededPremium", "prevFacNetReCededPremiumITD", "proratedPrevAnnualAdjusted",
		"proratedTermPremOverride", "suggestedModifierFactor", "systemCalculatedPremium", "totalModFactor",
		"totalModifierFactorHolder", "totalScheduleRating", "coverage_Ceded_Premium", "coverage_Ceded_Premium_ITD",
		"coverageCededPremium", "coverageCededPremiumITD" })
public class PolicyCoverage implements Serializable {

	@XmlElement(name = "Coverage_Cd", required = true)
	protected String coverageCd;
	@XmlElement(name = "Sequence_No", required = true)
	protected String sequenceNo;
	@XmlElement(name = "Premium_Amt", required = true)
	protected String premiumAmt;
	@XmlElement(name = "Limit_1_Amt", required = true)
	protected String limit1Amt;
	@XmlElement(name = "Coverage_Trigger_Cd", required = true)
	protected String coverageTriggerCd;
	@XmlElement(name = "TRIA_Elected_Rejected_Ind", required = true)
	protected String triaElectedRejectedInd;
	@XmlElement(name = "Coverage_Effective_Dt", required = true)
	protected String coverageEffectiveDt;
	@XmlElement(name = "Coverage_Expiration_Dt", required = true)
	protected String coverageExpirationDt;
	@XmlElement(name = "Deductible_2_Amt", required = true)
	protected String deductible2Amt;
	@XmlElement(required = true)
	protected String coverageOptions;
	@XmlElement(name = "APRPPremium", required = true)
	protected String aprpPremium;
	@XmlElement(name = "Prev_Cov_Exp_Dt", required = true)
	protected String prevCovExpDt;
	@XmlElement(name = "ITDPremium", required = true)
	protected String itdPremium;
	@XmlElement(name = "ASLOB", required = true)
	protected String aslob;
	@XmlElement(required = true)
	protected String prevcoverageITDPrem;
	@XmlElement(required = true)
	protected String tailDate;
	@XmlElement(required = true)
	protected String prevITDERPPrem;
	@XmlElement(name = "Subline_Cd", required = true)
	protected String sublineCd;
	@XmlElement(required = true)
	protected String prevTFSITDPrem;
	@XmlElement(required = true)
	protected String postOverridePremiumflag;
	@XmlElement(required = true)
	protected String postEnteredPremium;
	@XmlElement(name = "litigationDate_2_Desc", required = true)
	protected String litigationDate2Desc;
	@XmlElement(name = "litigationDate_3_Desc", required = true)
	protected String litigationDate3Desc;
	@XmlElement(name = "Conversion_ID", required = true)
	protected String conversionID;
	@XmlElement(required = true)
	protected String prevTotalTransCovCommissionAmt;
	@XmlElement(required = true)
	protected String totalITDCovCommissionamt;
	@XmlElement(name = "Deductible_9_Pct", required = true)
	protected String deductible9Pct;
	@XmlElement(name = "Annual_AAPHFL_Prem_Amt", required = true)
	protected String annualAAPHFLPremAmt;
	@XmlElement(required = true)
	protected String prevAPRP;
	@XmlElement(name = "PartOf_1_Amt", required = true)
	protected String partOf1Amt;
	@XmlElement(name = "Coverage_Annual_Prem_Amt", required = true)
	protected String coverageAnnualPremAmt;
	@XmlElement(name = "Attachment_1_Amt", required = true)
	protected String attachment1Amt;
	@XmlElement(required = true)
	protected String overPremflagPl;
	@XmlElement(required = true)
	protected String prevTotalITDCovCommissionAmt;
	@XmlElement(name = "Annual_Fiduciary_Prem_Amt_i", required = true)
	protected String annualFiduciaryPremAmtI;
	@XmlElement(required = true)
	protected String limitPremiumBearingAAPHFL;
	@XmlElement(required = true)
	protected String entityInvInsPersSECInd;
	@XmlElement(name = "ROLHolder", required = true)
	protected String rolHolder;
	@XmlElement(name = "PolCovLimit1PolCovPartOf", required = true)
	protected String polCovLimit1PolCovPartOf;
	@XmlElement(required = true)
	protected String scopeEntityInvCd;
	@XmlElement(name = "UW_REIT_Ind", required = true)
	protected String uwreitInd;
	@XmlElement(required = true)
	protected String manualPremium;
	@XmlElement(name = "Limit_2_Amt", required = true)
	protected String limit2Amt;
	@XmlElement(name = "Deductible_1_Amt", required = true)
	protected String deductible1Amt;
	@XmlElement(name = "MinPremium", required = true)
	protected String minPremium;
	@XmlElement(name = "Limit_1_Application_Cd", required = true)
	protected String limit1ApplicationCd;
	@XmlElement(name = "Deductible_1_Type_Cd", required = true)
	protected String deductible1TypeCd;
	@XmlElement(name = "Deductible_1_Application_Cd", required = true)
	protected String deductible1ApplicationCd;
	@XmlElement(name = "EmployeeTheftInd2", required = true)
	protected String employeeTheftInd2;
	@XmlElement(name = "EmployeeTheftInd", required = true)
	protected String employeeTheftInd;
	@XmlElement(required = true)
	protected String limitCheck;
	@XmlElement(required = true)
	protected String coveragecommissionAmt;
	@XmlElement(required = true)
	protected String prevAnnualPremium;
	@XmlElement(required = true)
	protected String annualPremium;
	@XmlElement(required = true)
	protected String prorateFactor;
	@XmlElement(required = true)
	protected String proratedPremium;
	@XmlElement(required = true)
	protected String netCalculatedPremium;
	@XmlElement(required = true)
	protected String alternateCovCode;
	@XmlElement(required = true)
	protected String thirdPartyLmtApplication;
	@XmlElement(required = true)
	protected String thirdPartyDedApplication;
	@XmlElement(required = true)
	protected String deathBenefitSngleLossLmtApp;
	@XmlElement(required = true)
	protected String rrCostsSngleLossLmtApp;
	@XmlElement(required = true)
	protected String rrSublimitLmtLiabApp;
	@XmlElement(required = true)
	protected String insuringAggBDedApp;
	@XmlElement(required = true)
	protected String insuringAggCDedApp;
	@XmlElement(name = "Min_Earned_Prem_Pct", required = true)
	protected String minEarnedPremPct;
	@XmlElement(name = "Cancel_Method_Ind", required = true)
	protected String cancelMethodInd;
	@XmlElement(name = "Min_Earned_Prem_Fctr", required = true)
	protected String minEarnedPremFctr;
	@XmlElement(name = "Cancel_Fctr", required = true)
	protected String cancelFctr;
	@XmlElement(required = true)
	protected String prevAdjustedAnnualPrem;
	@XmlElement(required = true)
	protected String termPremOverrideInput;
	@XmlElement(required = true)
	protected String adjustedAnnualPremium;
	@XmlElement(required = true)
	protected String covTransactionEffDate;
	@XmlElement(required = true)
	protected String totalPremium;
	@XmlElement(required = true)
	protected String enteredPremium2;
	@XmlElement(name = "CumulativePrem", required = true)
	protected String cumulativePrem;
	@XmlElement(name = "SchedRatingFct", required = true)
	protected String schedRatingFct;
	@XmlElement(name = "OverallRatingFct", required = true)
	protected String overallRatingFct;
	@XmlElement(required = true)
	protected String erpPremium;
	@XmlElement(name = "ITDERPPremium", required = true)
	protected String itderpPremium;
	@XmlElement(name = "Limit_1_Type_Cd", required = true)
	protected String limit1TypeCd;
	@XmlElement(name = "Deductible_1_Type_Desc", required = true)
	protected String deductible1TypeDesc;
	@XmlElement(required = true)
	protected String erpCovCommissionAmt;
	@XmlElement(required = true)
	protected String classCode;
	@XmlElement(name = "EOERPPrevPrem", required = true)
	protected String eoerpPrevPrem;
	@XmlElement(required = true)
	protected String postERPRunOffInd;
	@XmlElement(name = "Cancel_Fctr_ORP", required = true)
	protected String cancelFctrORP;
	@XmlElement(required = true)
	protected String preverpPremOverrideInd;
	@XmlElement(name = "MLOB", required = true)
	protected String mlob;
	@XmlElement(name = "ComputerTheftCoverageSelection", required = true)
	protected String computerTheftCoverageSelection;
	@XmlElement(name = "FundsTransferCoverageSelection", required = true)
	protected String fundsTransferCoverageSelection;
	@XmlElement(required = true)
	protected String riskClass;
	@XmlElement(required = true)
	protected String crimeDiscovered;
	@XmlElement(required = true)
	protected String crimeDiscoveryFactor;
	@XmlElement(required = true)
	protected String investigationCostsLimit;
	@XmlElement(required = true)
	protected String investigationCostFactor;
	@XmlElement(required = true)
	protected String investigationCostPremium;
	@XmlElement(name = "Sublimit_1_Amt", required = true)
	protected String sublimit1Amt;
	@XmlElement(name = "Limit_2_Type_Cd", required = true)
	protected String limit2TypeCd;
	@XmlElement(name = "Limit_2_Application_Cd", required = true)
	protected String limit2ApplicationCd;
	@XmlElement(name = "Sublimit_1_RB_Amt", required = true)
	protected String sublimit1RBAmt;
	@XmlElement(name = "litigationDate_1", required = true)
	protected String litigationDate1;
	@XmlElement(name = "ESOP", required = true)
	protected String esop;
	@XmlElement(name = "PriorActs", required = true)
	protected String priorActs;
	@XmlElement(required = true)
	protected String erpRunOffInd;
	@XmlElement(name = "litigationDate_1_Desc", required = true)
	protected String litigationDate1Desc;
	@XmlElement(name = "PriorActsDesc", required = true)
	protected String priorActsDesc;
	@XmlElement(name = "Sublimit_1_Application_Cd", required = true)
	protected String sublimit1ApplicationCd;
	@XmlElement(name = "WPVBusinessInterCost", required = true)
	protected String wpvBusinessInterCost;
	@XmlElement(name = "DBSingleLossLimit", required = true)
	protected String dbSingleLossLimit;
	@XmlElement(name = "RRSingleLossLimit", required = true)
	protected String rrSingleLossLimit;
	@XmlElement(name = "Sublimit_3_Application_Cd", required = true)
	protected String sublimit3ApplicationCd;
	@XmlElement(name = "Sublimit_1_Type_Cd", required = true)
	protected String sublimit1TypeCd;
	@XmlElement(name = "Deductible_3_Amt", required = true)
	protected String deductible3Amt;
	@XmlElement(name = "Deductible_2_Type_Cd", required = true)
	protected String deductible2TypeCd;
	@XmlElement(name = "Deductible_3_Type_Cd", required = true)
	protected String deductible3TypeCd;
	@XmlElement(name = "Deductible_2_Application_Cd", required = true)
	protected String deductible2ApplicationCd;
	@XmlElement(name = "Deductible_3_Application_Cd", required = true)
	protected String deductible3ApplicationCd;
	@XmlElement(required = true)
	protected String thirdPartyLimit;
	@XmlElement(required = true)
	protected String thirdPartyDeductible;
	@XmlElement(required = true)
	protected String litigationDateThirdParty;
	@XmlElement(name = "Deductible_2_Type_Desc", required = true)
	protected String deductible2TypeDesc;
	@XmlElement(required = true)
	protected String litigationDateThirdPartyDesc;
	@XmlElement(name = "IncludeThirdPartyCov", required = true)
	protected String includeThirdPartyCov;
	@XmlElement(name = "EPL_Third_PP_Date", required = true)
	protected String eplThirdPPDate;
	@XmlElement(name = "OverrideEPLThirdValue", required = true)
	protected String overrideEPLThirdValue;
	@XmlElement(name = "OverrideClaimsDeductible", required = true)
	protected String overrideClaimsDeductible;
	@XmlElement(name = "Date3", required = true)
	protected String date3;
	@XmlElement(required = true)
	protected String date4;
	@XmlElement(required = true)
	protected String addtlLiabLimits;
	@XmlElement(name = "Deductible_3_Type_Desc", required = true)
	protected String deductible3TypeDesc;
	@XmlElement(name = "date3dropdown", required = true)
	protected String date3Dropdown;
	@XmlElement(name = "date4dropdown", required = true)
	protected String date4Dropdown;
	@XmlElement(name = "litigationDate_2", required = true)
	protected String litigationDate2;
	@XmlElement(name = "litigationDate_3", required = true)
	protected String litigationDate3;
	@XmlElement(name = "Sublimit_2_Amt", required = true)
	protected String sublimit2Amt;
	@XmlElement(name = "Sublimit_3_Amt", required = true)
	protected String sublimit3Amt;
	@XmlElement(name = "Retroactive_Dt", required = true)
	protected String retroactiveDt;
	@XmlElement(required = true)
	protected String rate;
	@XmlElement(required = true)
	protected String rrSublimitofLiab;
	@XmlElement(required = true)
	protected String wastedList;
	@XmlElement(required = true)
	protected String riskState;
	@XmlElement(required = true)
	protected String otherDesc;
	@XmlElement(required = true)
	protected String deathLimitofLiab;
	@XmlElement(required = true)
	protected String mutLimitofLiab;
	@XmlElement(required = true)
	protected String otherInjLimitofLiab;
	@XmlElement(name = "Total_GL_Premium_Amt", required = true)
	protected String totalGLPremiumAmt;
	@XmlElement(name = "Sublimit_2_Application_Cd", required = true)
	protected String sublimit2ApplicationCd;
	@XmlElement(name = "KNRLitigationDate", required = true)
	protected String knrLitigationDate;
	@XmlElement(required = true)
	protected String addtlLiabLimitFactor;
	@XmlElement(required = true)
	protected String enteredPremium;
	@XmlElement(required = true)
	protected String waitingPeriod;
	@XmlElement(name = "CrmCovLimit", required = true)
	protected String crmCovLimit;
	@XmlElement(name = "CrmCovDeductible", required = true)
	protected String crmCovDeductible;
	@XmlElement(required = true)
	protected String itemType;
	@XmlElement(required = true)
	protected String municipality;
	@XmlElement(required = true)
	protected String otherFeePremium;
	@XmlElement(required = true)
	protected String overridePremiumflag;
	@XmlElement(name = "Addtl_Limit_of_Liab", required = true)
	protected String addtlLimitOfLiab;
	@XmlElement(required = true)
	protected String erpTerm;
	@XmlElement(required = true)
	protected String erpPremOverrideInput;
	@XmlElement(required = true)
	protected String erpAnnualPremium;
	@XmlElement(required = true)
	protected String erpPremOverrideInd;
	@XmlElement(name = "Sublimit_2_Type_Cd", required = true)
	protected String sublimit2TypeCd;
	@XmlElement(name = "Sublimit_3_Type_Cd", required = true)
	protected String sublimit3TypeCd;
	@XmlElement(name = "erp_Effective_Dt", required = true)
	protected String erpEffectiveDt;
	@XmlElement(required = true)
	protected String tfsCode;
	@XmlElement(required = true)
	protected String enteredKRPremium;
	@XmlElement(name = "Retroactive_Dt_Desc", required = true)
	protected String retroactiveDtDesc;
	@XmlElement(name = "ErrAddLim500", required = true)
	protected String errAddLim500;
	@XmlElement(name = "ErrEPLDed", required = true)
	protected String errEPLDed;
	@XmlElement(name = "ErrDedCrmNULL", required = true)
	protected String errDedCrmNULL;
	@XmlElement(name = "KNRComp", required = true)
	protected String knrComp;
	@XmlElement(name = "OverPremFlagHolder", required = true)
	protected String overPremFlagHolder;
	@XmlElement(name = "ERP_DATE_HOLDER", required = true)
	protected String erpdateholder;
	@XmlElement(name = "ErrEPLThirdPartyLim", required = true)
	protected String errEPLThirdPartyLim;
	@XmlElement(name = "ErrThirdPartyDed", required = true)
	protected String errThirdPartyDed;
	@XmlElement(name = "ErrDedAmtDefault", required = true)
	protected String errDedAmtDefault;
	@XmlElement(required = true)
	protected String oosPremiumOverrideFlag;
	@XmlElement(name = "Coverage_Code2", required = true)
	protected String coverageCode2;
	@XmlElement(required = true)
	protected String coverageSupressTFS;
	@XmlElement(name = "Coverage_Code3", required = true)
	protected String coverageCode3;
	@XmlElement(name = "Arch_Total_Participation", required = true)
	protected String archTotalParticipation;
	@XmlElement(name = "Deductible_4_Application_Cd", required = true)
	protected String deductible4ApplicationCd;
	@XmlElement(name = "Deductible_4_Type_Cd", required = true)
	protected String deductible4TypeCd;
	@XmlElement(name = "Include_DerivDemand_InvCosts_Ind", required = true)
	protected String includeDerivDemandInvCostsInd;
	@XmlElement(name = "Sub_Limit_1_Application_Cd", required = true)
	protected String subLimit1ApplicationCd;
	@XmlElement(name = "Sub_Limit_1_Type_Cd", required = true)
	protected String subLimit1TypeCd;
	@XmlElement(name = "Deductible_5_Application_Cd", required = true)
	protected String deductible5ApplicationCd;
	@XmlElement(name = "Deductible_5_Type_Cd", required = true)
	protected String deductible5TypeCd;
	@XmlElement(name = "Include_NonIndemFID_Ind", required = true)
	protected String includeNonIndemFIDInd;
	@XmlElement(required = true)
	protected String erpRiskLevel;
	@XmlElement(name = "Sub_Limit_2_Amt", required = true)
	protected String subLimit2Amt;
	@XmlElement(name = "Sub_Limit_2_Application_Cd", required = true)
	protected String subLimit2ApplicationCd;
	@XmlElement(name = "Sub_Limit_2_Type_Cd", required = true)
	protected String subLimit2TypeCd;
	@XmlElement(name = "REIT_Ins_Agr_E_Ind", required = true)
	protected String reitInsAgrEInd;
	@XmlElement(name = "Deductible_6_Amt", required = true)
	protected String deductible6Amt;
	@XmlElement(name = "Deductible_6_Application_Cd", required = true)
	protected String deductible6ApplicationCd;
	@XmlElement(name = "Deductible_6_Type_Cd", required = true)
	protected String deductible6TypeCd;
	@XmlElement(name = "Deductible_6_Type_Desc", required = true)
	protected String deductible6TypeDesc;
	@XmlElement(name = "Deductible_7_Amt", required = true)
	protected String deductible7Amt;
	@XmlElement(name = "Deductible_7_Application_Cd", required = true)
	protected String deductible7ApplicationCd;
	@XmlElement(name = "Deductible_7_Type_Cd", required = true)
	protected String deductible7TypeCd;
	@XmlElement(name = "Deductible_7_Type_Desc", required = true)
	protected String deductible7TypeDesc;
	@XmlElement(name = "Deductible_8_Amt", required = true)
	protected String deductible8Amt;
	@XmlElement(name = "Deductible_8_Application_Cd", required = true)
	protected String deductible8ApplicationCd;
	@XmlElement(name = "Deductible_8_Type_Cd", required = true)
	protected String deductible8TypeCd;
	@XmlElement(name = "Deductible_8_Type_Desc", required = true)
	protected String deductible8TypeDesc;
	@XmlElement(name = "Deductible_9_Application_Cd", required = true)
	protected String deductible9ApplicationCd;
	@XmlElement(name = "Deductible_9_Type_Cd", required = true)
	protected String deductible9TypeCd;
	@XmlElement(name = "Deductible_9_Type_Desc", required = true)
	protected String deductible9TypeDesc;
	@XmlElement(name = "Deductible_10_Pct", required = true)
	protected String deductible10Pct;
	@XmlElement(name = "Deductible_10_Application_Cd", required = true)
	protected String deductible10ApplicationCd;
	@XmlElement(name = "Deductible_10_Type_Cd", required = true)
	protected String deductible10TypeCd;
	@XmlElement(name = "Deductible_10_Type_Desc", required = true)
	protected String deductible10TypeDesc;
	@XmlElement(name = "Deductible_4_Amt", required = true)
	protected String deductible4Amt;
	@XmlElement(name = "Sub_Limit_1_Amt", required = true)
	protected String subLimit1Amt;
	@XmlElement(name = "Deductible_5_Amt", required = true)
	protected String deductible5Amt;
	@XmlElement(name = "Provide_SideAMatch_Ind", required = true)
	protected String provideSideAMatchInd;
	@XmlElement(name = "Deductible_4_Type_Desc", required = true)
	protected String deductible4TypeDesc;
	@XmlElement(name = "Deductible_5_Type_Desc", required = true)
	protected String deductible5TypeDesc;
	@XmlElement(name = "Limit_2_Amt_DOP", required = true)
	protected String limit2AmtDOP;
	@XmlElement(name = "Deductible_2_Amt_DOP", required = true)
	protected String deductible2AmtDOP;
	@XmlElement(name = "Deductible_3_Amt_DOP", required = true)
	protected String deductible3AmtDOP;
	@XmlElement(name = "Sub_Limit_1_Amt_DOP", required = true)
	protected String subLimit1AmtDOP;
	@XmlElement(name = "Deductible_5_Amt_DOREIT", required = true)
	protected String deductible5AmtDOREIT;
	@XmlElement(name = "Advisory_ILF_Fct", required = true)
	protected String advisoryILFFct;
	@XmlElement(name = "Annual_DOP_Prem_Amt", required = true)
	protected String annualDOPPremAmt;
	@XmlElement(required = true)
	protected String thirdPartyLmtType;
	@XmlElement(required = true)
	protected String thirdPartyDedType;
	@XmlElement(required = true)
	protected String thirdPartyDedDesc;
	@XmlElement(name = "ExcludeFundEPL_Ind", required = true)
	protected String excludeFundEPLInd;
	@XmlElement(name = "OverrideEPLThirdValue_EPL", required = true)
	protected String overrideEPLThirdValueEPL;
	@XmlElement(name = "IncludeThirdPartyCov_EPL", required = true)
	protected String includeThirdPartyCovEPL;
	@XmlElement(name = "thirdPartyLimit_EPL", required = true)
	protected String thirdPartyLimitEPL;
	@XmlElement(name = "thirdPartyDeductible_EPL", required = true)
	protected String thirdPartyDeductibleEPL;
	@XmlElement(name = "Deductible_1_Amt_AAP_FID", required = true)
	protected String deductible1AmtAAPFID;
	@XmlElement(required = true)
	protected String totalTransCovCommissionAmt;
	@XmlElement(name = "Deductible_2_Exclude", required = true)
	protected String deductible2Exclude;
	@XmlElement(name = "Deductible_3_Exclude", required = true)
	protected String deductible3Exclude;
	@XmlElement(name = "Deductible_4_Exclude", required = true)
	protected String deductible4Exclude;
	@XmlElement(name = "Deductible_5_Exclude", required = true)
	protected String deductible5Exclude;
	@XmlElement(name = "Deductible_6_Exclude", required = true)
	protected String deductible6Exclude;
	@XmlElement(name = "Deductible_3_Amt_EPL", required = true)
	protected String deductible3AmtEPL;
	@XmlElement(name = "Deductible_7_Exclude", required = true)
	protected String deductible7Exclude;
	@XmlElement(name = "Deductible_8_Exclude", required = true)
	protected String deductible8Exclude;
	@XmlElement(name = "Deductible_9_Exclude", required = true)
	protected String deductible9Exclude;
	@XmlElement(name = "Deductible_10_Exclude", required = true)
	protected String deductible10Exclude;
	@XmlElement(name = "LimitAmtValidation", required = true)
	protected String limitAmtValidation;
	@XmlElement(name = "Date_VAlidation", required = true)
	protected String dateVAlidation;
	@XmlElement(name = "Deductible_2_Amt_AAP", required = true)
	protected String deductible2AmtAAP;
	@XmlElement(name = "litigationDateDesc_AAPHFL", required = true)
	protected String litigationDateDescAAPHFL;
	@XmlElement(required = true)
	protected String defValueAAPHFL;
	@XmlElement(name = "ERPDefault", required = true)
	protected String erpDefault;
	@XmlElement(name = "ROL_pct", required = true)
	protected String rolPct;
	@XmlElement(required = true)
	protected String inclLenderLiabInd;
	@XmlElement(name = "Attachment_1_Amt_MAN", required = true)
	protected String attachment1AmtMAN;
	@XmlElement(required = true)
	protected String covgOnPartnersInd;
	@XmlElement(name = "Limit_2_Amt_FEMPTH_R14", required = true)
	protected String limit2AmtFEMPTHR14;
	@XmlElement(name = "Deductible_2_Amt_FEMPTH_R14", required = true)
	protected String deductible2AmtFEMPTHR14;
	@XmlElement(name = "Attachment_2_Amt", required = true)
	protected String attachment2Amt;
	@XmlElement(name = "PartOf_2_Amt", required = true)
	protected String partOf2Amt;
	@XmlElement(name = "Deductible_3_Pct", required = true)
	protected String deductible3Pct;
	@XmlElement(name = "IsLastCrimeCoverage", required = true)
	protected String isLastCrimeCoverage;
	@XmlElement(name = "Attachment_5_Amt", required = true)
	protected String attachment5Amt;
	@XmlElement(required = true)
	protected String erpFactor;
	@XmlElement(name = "Sublimit_1_Amt_MAN", required = true)
	protected String sublimit1AmtMAN;
	@XmlElement(name = "Sublimit_2_Amt_MAN", required = true)
	protected String sublimit2AmtMAN;
	@XmlElement(name = "Sublimit_3_Amt_MAN", required = true)
	protected String sublimit3AmtMAN;
	@XmlElement(name = "Deductible_1_Exclude", required = true)
	protected String deductible1Exclude;
	@XmlElement(name = "litigationDate_4_Desc", required = true)
	protected String litigationDate4Desc;
	@XmlElement(name = "litigationDate_4", required = true)
	protected String litigationDate4;
	@XmlElement(name = "AAPHFLTailDateHolder", required = true)
	protected String aaphflTailDateHolder;
	@XmlElement(name = "ERPIndHold", required = true)
	protected String erpIndHold;
	@XmlElement(name = "Base_Premium", required = true)
	protected String basePremium;
	@XmlElement(name = "Base_Rate1", required = true)
	protected String baseRate1;
	@XmlElement(name = "Base_Rate2", required = true)
	protected String baseRate2;
	@XmlElement(name = "Base_Rate3", required = true)
	protected String baseRate3;
	@XmlElement(name = "Basic_Premium", required = true)
	protected String basicPremium;
	@XmlElement(name = "Cancel_Override_Prem", required = true)
	protected String cancelOverridePrem;
	@XmlElement(required = true)
	protected String cededPremium;
	@XmlElement(required = true)
	protected String cededPremiumITD;
	@XmlElement(required = true)
	protected String cededPremiumOutput;
	@XmlElement(required = true)
	protected String cedingCommPct;
	@XmlElement(name = "ComputerBasic_Premium", required = true)
	protected String computerBasicPremium;
	@XmlElement(name = "Constant_Key", required = true)
	protected String constantKey;
	@XmlElement(required = true)
	protected String coverageAddDelind;
	@XmlElement(name = "CRMForeignLocationExposureFct", required = true)
	protected String crmForeignLocationExposureFct;
	@XmlElement(name = "Dec_Liab_DOLimit", required = true)
	protected String decLiabDOLimit;
	@XmlElement(name = "Dec_Liab_EPLLimit", required = true)
	protected String decLiabEPLLimit;
	@XmlElement(name = "Dec_Liab_FIDLimit", required = true)
	protected String decLiabFIDLimit;
	@XmlElement(name = "Deductible_Amount", required = true)
	protected String deductibleAmount;
	@XmlElement(name = "DeleteIndicator", required = true)
	protected String deleteIndicator;
	@XmlElement(name = "Desired_Premium", required = true)
	protected String desiredPremium;
	@XmlElement(name = "Display_Test", required = true)
	protected String displayTest;
	@XmlElement(name = "DOPPublicDebtCovFct", required = true)
	protected String dopPublicDebtCovFct;
	@XmlElement(name = "EO_Annual_Premium", required = true)
	protected String eoAnnualPremium;
	@XmlElement(name = "EO_Business_Interruption_Fct", required = true)
	protected String eoBusinessInterruptionFct;
	@XmlElement(name = "EO_Claims_History_Fct", required = true)
	protected String eoClaimsHistoryFct;
	@XmlElement(name = "EO_Cov_Minimum_Premium_Amt", required = true)
	protected String eoCovMinimumPremiumAmt;
	@XmlElement(name = "EO_Cov_Override_Premium_Amt", required = true)
	protected String eoCovOverridePremiumAmt;
	@XmlElement(name = "EO_Data_Incidence_Sublimit", required = true)
	protected String eoDataIncidenceSublimit;
	@XmlElement(name = "EO_Data_Incidence_Sublimit_Ind", required = true)
	protected String eoDataIncidenceSublimitInd;
	@XmlElement(name = "EO_Encryption_Controls_Fct", required = true)
	protected String eoEncryptionControlsFct;
	@XmlElement(name = "EO_Enterprise_Controls_Fct", required = true)
	protected String eoEnterpriseControlsFct;
	@XmlElement(name = "EO_Extortion_Fct", required = true)
	protected String eoExtortionFct;
	@XmlElement(name = "EO_Flex_Rating_Fct", required = true)
	protected String eoFlexRatingFct;
	@XmlElement(name = "EO_Hazard_Group", required = true)
	protected String eoHazardGroup;
	@XmlElement(name = "EO_Maximum_Schedule_Rating_Fct", required = true)
	protected String eoMaximumScheduleRatingFct;
	@XmlElement(name = "EO_Media_Liability_Fct", required = true)
	protected String eoMediaLiabilityFct;
	@XmlElement(name = "EO_Minimum_Schedule_Rating_Fct", required = true)
	protected String eoMinimumScheduleRatingFct;
	@XmlElement(name = "EO_Number_of_Records_Fct", required = true)
	protected String eoNumberOfRecordsFct;
	@XmlElement(name = "EO_Optional_Coverages_Premium", required = true)
	protected String eoOptionalCoveragesPremium;
	@XmlElement(name = "EO_Per_Claim_Limit", required = true)
	protected String eoPerClaimLimit;
	@XmlElement(name = "EO_Per_Claim_Retention", required = true)
	protected String eoPerClaimRetention;
	@XmlElement(name = "EO_Quality_of_Management_Fct", required = true)
	protected String eoQualityOfManagementFct;
	@XmlElement(name = "EO_Regulatory_Compliance_Controls_Fct", required = true)
	protected String eoRegulatoryComplianceControlsFct;
	@XmlElement(name = "EO_Security_Controls_Fct", required = true)
	protected String eoSecurityControlsFct;
	@XmlElement(name = "EO_Share_Liability_Discount", required = true)
	protected String eoShareLiabilityDiscount;
	@XmlElement(name = "EO_Shared_Liability_Limit_Fct", required = true)
	protected String eoSharedLiabilityLimitFct;
	@XmlElement(name = "EO_Third_Party_Services_Provider_Controls_Fct", required = true)
	protected String eoThirdPartyServicesProviderControlsFct;
	@XmlElement(name = "EO_Total_Basic_Premium", required = true)
	protected String eoTotalBasicPremium;
	@XmlElement(name = "EO_Total_Capped_Rating", required = true)
	protected String eoTotalCappedRating;
	@XmlElement(name = "EO_Total_Cumulative_Premium", required = true)
	protected String eoTotalCumulativePremium;
	@XmlElement(name = "EO_Total_Premium_Inc_Optional_Coverages", required = true)
	protected String eoTotalPremiumIncOptionalCoverages;
	@XmlElement(name = "EO_Total_Premium_With_Discount", required = true)
	protected String eoTotalPremiumWithDiscount;
	@XmlElement(name = "EO_Underwriting_Intensity_Fct", required = true)
	protected String eoUnderwritingIntensityFct;
	@XmlElement(name = "EOBINT_Annual_Premium", required = true)
	protected String eobintAnnualPremium;
	@XmlElement(name = "EOCYBE_Annual_Premium", required = true)
	protected String eocybeAnnualPremium;
	@XmlElement(name = "EODIRE_Annual_Premium", required = true)
	protected String eodireAnnualPremium;
	@XmlElement(name = "EODIRE_Basic_Premium", required = true)
	protected String eodireBasicPremium;
	@XmlElement(name = "EOMEDL_Annual_Premium", required = true)
	protected String eomedlAnnualPremium;
	@XmlElement(name = "EONSPL_Annual_Premium", required = true)
	protected String eonsplAnnualPremium;
	@XmlElement(name = "EONSPL_Basic_Premium", required = true)
	protected String eonsplBasicPremium;
	@XmlElement(name = "EOShortened_CovEffective_Dt", required = true)
	protected String eoShortenedCovEffectiveDt;
	@XmlElement(name = "EOShortened_CovExpiration_Dt", required = true)
	protected String eoShortenedCovExpirationDt;
	@XmlElement(name = "EOShortened_CovTransaction_Dt", required = true)
	protected String eoShortenedCovTransactionDt;
	@XmlElement(name = "EPL_ThirdParty_Premium", required = true)
	protected String eplThirdPartyPremium;
	@XmlElement(name = "EPLCAEmployeeFactorFct", required = true)
	protected String eplcaEmployeeFactorFct;
	@XmlElement(name = "EPLThirdPartyDeductibleFactor", required = true)
	protected String eplThirdPartyDeductibleFactor;
	@XmlElement(name = "EPLThirdPartyIncreasedLimitFactorFct", required = true)
	protected String eplThirdPartyIncreasedLimitFactorFct;
	@XmlElement(required = true)
	protected String erpEOAnnualPremium;
	@XmlElement(name = "Exposure", required = true)
	protected String exposure;
	@XmlElement(required = true)
	protected String facGrossReCededPremium;
	@XmlElement(required = true)
	protected String facGrossReCededPremiumITD;
	@XmlElement(required = true)
	protected String facGrossReCededPremiumOutput;
	@XmlElement(required = true)
	protected String facNetReCededPremium;
	@XmlElement(required = true)
	protected String facNetReCededPremiumITD;
	@XmlElement(required = true)
	protected String facReinsurerParticipationLimit;
	@XmlElement(name = "Factor", required = true)
	protected String factor;
	@XmlElement(name = "FundTransferBasic_Premium", required = true)
	protected String fundTransferBasicPremium;
	@XmlElement(name = "ILFDed_Factor", required = true)
	protected String ilfDedFactor;
	@XmlElement(name = "ITEMID", required = true)
	protected String itemid;
	@XmlElement(name = "KRAnnualPremiumHolder", required = true)
	protected String krAnnualPremiumHolder;
	@XmlElement(name = "KRBE_MinPrem_Amt", required = true)
	protected String krbeMinPremAmt;
	@XmlElement(name = "Limit_Amount", required = true)
	protected String limitAmount;
	@XmlElement(name = "LOBID", required = true)
	protected String lobid;
	@XmlElement(required = true)
	protected String minimumAdjustment;
	@XmlElement(name = "ParentOccurrenceID", required = true)
	protected String parentOccurrenceID;
	@XmlElement(required = true)
	protected String prevAPRPPremium;
	@XmlElement(required = true)
	protected String prevCededPremium;
	@XmlElement(required = true)
	protected String prevCededPremiumITD;
	@XmlElement(required = true)
	protected String prevCoverageCededPremium;
	@XmlElement(required = true)
	protected String prevCoverageCededPremiumITD;
	@XmlElement(required = true)
	protected String prevFacGrossReCededPremium;
	@XmlElement(required = true)
	protected String prevFacGrossReCededPremiumITD;
	@XmlElement(required = true)
	protected String prevFacNetReCededPremium;
	@XmlElement(required = true)
	protected String prevFacNetReCededPremiumITD;
	@XmlElement(name = "Prorated_Prev_Annual_Adjusted", required = true)
	protected String proratedPrevAnnualAdjusted;
	@XmlElement(name = "Prorated_termPremOverride", required = true)
	protected String proratedTermPremOverride;
	@XmlElement(name = "Suggested_Modifier_Factor", required = true)
	protected String suggestedModifierFactor;
	@XmlElement(name = "System_Calculated_Premium", required = true)
	protected String systemCalculatedPremium;
	@XmlElement(name = "Total_Mod_Factor", required = true)
	protected String totalModFactor;
	@XmlElement(name = "Total_Modifier_Factor_Holder", required = true)
	protected String totalModifierFactorHolder;
	@XmlElement(name = "TotalScheduleRating", required = true)
	protected String totalScheduleRating;

	@XmlElement(name = "coverage_Ceded_Premium", required = true)
	protected String coverage_Ceded_Premium;

	@XmlElement(name = "coverage_Ceded_Premium_ITD", required = true)
	protected String coverage_Ceded_Premium_ITD;

	@XmlElement(name = "coverageCededPremium", required = true)
	protected String coverageCededPremium;

	@XmlElement(name = "coverageCededPremiumITD", required = true)
	protected String coverageCededPremiumITD;

	@XmlAttribute(name = "ExtAction")
	protected String extAction;
	@XmlAttribute(name = "ID")
	protected String id;

	/**
	 * Gets the value of the coverageCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCoverageCd() {
		return coverageCd;
	}

	/**
	 * Sets the value of the coverageCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCoverageCd(String value) {
		this.coverageCd = value;
	}

	/**
	 * Gets the value of the sequenceNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSequenceNo() {
		return sequenceNo;
	}

	/**
	 * Sets the value of the sequenceNo property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSequenceNo(String value) {
		this.sequenceNo = value;
	}

	/**
	 * Gets the value of the premiumAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPremiumAmt() {
		return premiumAmt;
	}

	/**
	 * Sets the value of the premiumAmt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPremiumAmt(String value) {
		this.premiumAmt = value;
	}

	/**
	 * Gets the value of the limit1Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLimit1Amt() {
		return limit1Amt;
	}

	/**
	 * Sets the value of the limit1Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLimit1Amt(String value) {
		this.limit1Amt = value;
	}

	/**
	 * Gets the value of the coverageTriggerCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCoverageTriggerCd() {
		return coverageTriggerCd;
	}

	/**
	 * Sets the value of the coverageTriggerCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCoverageTriggerCd(String value) {
		this.coverageTriggerCd = value;
	}

	/**
	 * Gets the value of the triaElectedRejectedInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTRIAElectedRejectedInd() {
		return triaElectedRejectedInd;
	}

	/**
	 * Sets the value of the triaElectedRejectedInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTRIAElectedRejectedInd(String value) {
		this.triaElectedRejectedInd = value;
	}

	/**
	 * Gets the value of the coverageEffectiveDt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCoverageEffectiveDt() {
		return coverageEffectiveDt;
	}

	/**
	 * Sets the value of the coverageEffectiveDt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCoverageEffectiveDt(String value) {
		this.coverageEffectiveDt = value;
	}

	/**
	 * Gets the value of the coverageExpirationDt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCoverageExpirationDt() {
		return coverageExpirationDt;
	}

	/**
	 * Sets the value of the coverageExpirationDt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCoverageExpirationDt(String value) {
		this.coverageExpirationDt = value;
	}

	/**
	 * Gets the value of the deductible2Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible2Amt() {
		return deductible2Amt;
	}

	/**
	 * Sets the value of the deductible2Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible2Amt(String value) {
		this.deductible2Amt = value;
	}

	/**
	 * Gets the value of the coverageOptions property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCoverageOptions() {
		return coverageOptions;
	}

	/**
	 * Sets the value of the coverageOptions property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCoverageOptions(String value) {
		this.coverageOptions = value;
	}

	/**
	 * Gets the value of the aprpPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAPRPPremium() {
		return aprpPremium;
	}

	/**
	 * Sets the value of the aprpPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAPRPPremium(String value) {
		this.aprpPremium = value;
	}

	/**
	 * Gets the value of the prevCovExpDt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevCovExpDt() {
		return prevCovExpDt;
	}

	/**
	 * Sets the value of the prevCovExpDt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevCovExpDt(String value) {
		this.prevCovExpDt = value;
	}

	/**
	 * Gets the value of the itdPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getITDPremium() {
		return itdPremium;
	}

	/**
	 * Sets the value of the itdPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setITDPremium(String value) {
		this.itdPremium = value;
	}

	/**
	 * Gets the value of the aslob property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getASLOB() {
		return aslob;
	}

	/**
	 * Sets the value of the aslob property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setASLOB(String value) {
		this.aslob = value;
	}

	/**
	 * Gets the value of the prevcoverageITDPrem property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevcoverageITDPrem() {
		return prevcoverageITDPrem;
	}

	/**
	 * Sets the value of the prevcoverageITDPrem property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevcoverageITDPrem(String value) {
		this.prevcoverageITDPrem = value;
	}

	/**
	 * Gets the value of the tailDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTailDate() {
		return tailDate;
	}

	/**
	 * Sets the value of the tailDate property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTailDate(String value) {
		this.tailDate = value;
	}

	/**
	 * Gets the value of the prevITDERPPrem property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevITDERPPrem() {
		return prevITDERPPrem;
	}

	/**
	 * Sets the value of the prevITDERPPrem property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevITDERPPrem(String value) {
		this.prevITDERPPrem = value;
	}

	/**
	 * Gets the value of the sublineCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSublineCd() {
		return sublineCd;
	}

	/**
	 * Sets the value of the sublineCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSublineCd(String value) {
		this.sublineCd = value;
	}

	/**
	 * Gets the value of the prevTFSITDPrem property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevTFSITDPrem() {
		return prevTFSITDPrem;
	}

	/**
	 * Sets the value of the prevTFSITDPrem property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevTFSITDPrem(String value) {
		this.prevTFSITDPrem = value;
	}

	/**
	 * Gets the value of the postOverridePremiumflag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPostOverridePremiumflag() {
		return postOverridePremiumflag;
	}

	/**
	 * Sets the value of the postOverridePremiumflag property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPostOverridePremiumflag(String value) {
		this.postOverridePremiumflag = value;
	}

	/**
	 * Gets the value of the postEnteredPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPostEnteredPremium() {
		return postEnteredPremium;
	}

	/**
	 * Sets the value of the postEnteredPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPostEnteredPremium(String value) {
		this.postEnteredPremium = value;
	}

	/**
	 * Gets the value of the litigationDate2Desc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLitigationDate2Desc() {
		return litigationDate2Desc;
	}

	/**
	 * Sets the value of the litigationDate2Desc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLitigationDate2Desc(String value) {
		this.litigationDate2Desc = value;
	}

	/**
	 * Gets the value of the litigationDate3Desc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLitigationDate3Desc() {
		return litigationDate3Desc;
	}

	/**
	 * Sets the value of the litigationDate3Desc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLitigationDate3Desc(String value) {
		this.litigationDate3Desc = value;
	}

	/**
	 * Gets the value of the conversionID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConversionID() {
		return conversionID;
	}

	/**
	 * Sets the value of the conversionID property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setConversionID(String value) {
		this.conversionID = value;
	}

	/**
	 * Gets the value of the prevTotalTransCovCommissionAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevTotalTransCovCommissionAmt() {
		return prevTotalTransCovCommissionAmt;
	}

	/**
	 * Sets the value of the prevTotalTransCovCommissionAmt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevTotalTransCovCommissionAmt(String value) {
		this.prevTotalTransCovCommissionAmt = value;
	}

	/**
	 * Gets the value of the totalITDCovCommissionamt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTotalITDCovCommissionamt() {
		return totalITDCovCommissionamt;
	}

	/**
	 * Sets the value of the totalITDCovCommissionamt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTotalITDCovCommissionamt(String value) {
		this.totalITDCovCommissionamt = value;
	}

	/**
	 * Gets the value of the deductible9Pct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible9Pct() {
		return deductible9Pct;
	}

	/**
	 * Sets the value of the deductible9Pct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible9Pct(String value) {
		this.deductible9Pct = value;
	}

	/**
	 * Gets the value of the annualAAPHFLPremAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAnnualAAPHFLPremAmt() {
		return annualAAPHFLPremAmt;
	}

	/**
	 * Sets the value of the annualAAPHFLPremAmt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAnnualAAPHFLPremAmt(String value) {
		this.annualAAPHFLPremAmt = value;
	}

	/**
	 * Gets the value of the prevAPRP property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevAPRP() {
		return prevAPRP;
	}

	/**
	 * Sets the value of the prevAPRP property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevAPRP(String value) {
		this.prevAPRP = value;
	}

	/**
	 * Gets the value of the partOf1Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPartOf1Amt() {
		return partOf1Amt;
	}

	/**
	 * Sets the value of the partOf1Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPartOf1Amt(String value) {
		this.partOf1Amt = value;
	}

	/**
	 * Gets the value of the coverageAnnualPremAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCoverageAnnualPremAmt() {
		return coverageAnnualPremAmt;
	}

	/**
	 * Sets the value of the coverageAnnualPremAmt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCoverageAnnualPremAmt(String value) {
		this.coverageAnnualPremAmt = value;
	}

	/**
	 * Gets the value of the attachment1Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAttachment1Amt() {
		return attachment1Amt;
	}

	/**
	 * Sets the value of the attachment1Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAttachment1Amt(String value) {
		this.attachment1Amt = value;
	}

	/**
	 * Gets the value of the overPremflagPl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOverPremflagPl() {
		return overPremflagPl;
	}

	/**
	 * Sets the value of the overPremflagPl property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setOverPremflagPl(String value) {
		this.overPremflagPl = value;
	}

	/**
	 * Gets the value of the prevTotalITDCovCommissionAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevTotalITDCovCommissionAmt() {
		return prevTotalITDCovCommissionAmt;
	}

	/**
	 * Sets the value of the prevTotalITDCovCommissionAmt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevTotalITDCovCommissionAmt(String value) {
		this.prevTotalITDCovCommissionAmt = value;
	}

	/**
	 * Gets the value of the annualFiduciaryPremAmtI property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAnnualFiduciaryPremAmtI() {
		return annualFiduciaryPremAmtI;
	}

	/**
	 * Sets the value of the annualFiduciaryPremAmtI property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAnnualFiduciaryPremAmtI(String value) {
		this.annualFiduciaryPremAmtI = value;
	}

	/**
	 * Gets the value of the limitPremiumBearingAAPHFL property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLimitPremiumBearingAAPHFL() {
		return limitPremiumBearingAAPHFL;
	}

	/**
	 * Sets the value of the limitPremiumBearingAAPHFL property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLimitPremiumBearingAAPHFL(String value) {
		this.limitPremiumBearingAAPHFL = value;
	}

	/**
	 * Gets the value of the entityInvInsPersSECInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEntityInvInsPersSECInd() {
		return entityInvInsPersSECInd;
	}

	/**
	 * Sets the value of the entityInvInsPersSECInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEntityInvInsPersSECInd(String value) {
		this.entityInvInsPersSECInd = value;
	}

	/**
	 * Gets the value of the rolHolder property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getROLHolder() {
		return rolHolder;
	}

	/**
	 * Sets the value of the rolHolder property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setROLHolder(String value) {
		this.rolHolder = value;
	}

	/**
	 * Gets the value of the polCovLimit1PolCovPartOf property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPolCovLimit1PolCovPartOf() {
		return polCovLimit1PolCovPartOf;
	}

	/**
	 * Sets the value of the polCovLimit1PolCovPartOf property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPolCovLimit1PolCovPartOf(String value) {
		this.polCovLimit1PolCovPartOf = value;
	}

	/**
	 * Gets the value of the scopeEntityInvCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getScopeEntityInvCd() {
		return scopeEntityInvCd;
	}

	/**
	 * Sets the value of the scopeEntityInvCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setScopeEntityInvCd(String value) {
		this.scopeEntityInvCd = value;
	}

	/**
	 * Gets the value of the uwreitInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUWREITInd() {
		return uwreitInd;
	}

	/**
	 * Sets the value of the uwreitInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setUWREITInd(String value) {
		this.uwreitInd = value;
	}

	/**
	 * Gets the value of the manualPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getManualPremium() {
		return manualPremium;
	}

	/**
	 * Sets the value of the manualPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setManualPremium(String value) {
		this.manualPremium = value;
	}

	/**
	 * Gets the value of the limit2Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLimit2Amt() {
		return limit2Amt;
	}

	/**
	 * Sets the value of the limit2Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLimit2Amt(String value) {
		this.limit2Amt = value;
	}

	/**
	 * Gets the value of the deductible1Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible1Amt() {
		return deductible1Amt;
	}

	/**
	 * Sets the value of the deductible1Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible1Amt(String value) {
		this.deductible1Amt = value;
	}

	/**
	 * Gets the value of the minPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMinPremium() {
		return minPremium;
	}

	/**
	 * Sets the value of the minPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setMinPremium(String value) {
		this.minPremium = value;
	}

	/**
	 * Gets the value of the limit1ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLimit1ApplicationCd() {
		return limit1ApplicationCd;
	}

	/**
	 * Sets the value of the limit1ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLimit1ApplicationCd(String value) {
		this.limit1ApplicationCd = value;
	}

	/**
	 * Gets the value of the deductible1TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible1TypeCd() {
		return deductible1TypeCd;
	}

	/**
	 * Sets the value of the deductible1TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible1TypeCd(String value) {
		this.deductible1TypeCd = value;
	}

	/**
	 * Gets the value of the deductible1ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible1ApplicationCd() {
		return deductible1ApplicationCd;
	}

	/**
	 * Sets the value of the deductible1ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible1ApplicationCd(String value) {
		this.deductible1ApplicationCd = value;
	}

	/**
	 * Gets the value of the employeeTheftInd2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmployeeTheftInd2() {
		return employeeTheftInd2;
	}

	/**
	 * Sets the value of the employeeTheftInd2 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEmployeeTheftInd2(String value) {
		this.employeeTheftInd2 = value;
	}

	/**
	 * Gets the value of the employeeTheftInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmployeeTheftInd() {
		return employeeTheftInd;
	}

	/**
	 * Sets the value of the employeeTheftInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEmployeeTheftInd(String value) {
		this.employeeTheftInd = value;
	}

	/**
	 * Gets the value of the limitCheck property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLimitCheck() {
		return limitCheck;
	}

	/**
	 * Sets the value of the limitCheck property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLimitCheck(String value) {
		this.limitCheck = value;
	}

	/**
	 * Gets the value of the coveragecommissionAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCoveragecommissionAmt() {
		return coveragecommissionAmt;
	}

	/**
	 * Sets the value of the coveragecommissionAmt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCoveragecommissionAmt(String value) {
		this.coveragecommissionAmt = value;
	}

	/**
	 * Gets the value of the prevAnnualPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevAnnualPremium() {
		return prevAnnualPremium;
	}

	/**
	 * Sets the value of the prevAnnualPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevAnnualPremium(String value) {
		this.prevAnnualPremium = value;
	}

	/**
	 * Gets the value of the annualPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAnnualPremium() {
		return annualPremium;
	}

	/**
	 * Sets the value of the annualPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAnnualPremium(String value) {
		this.annualPremium = value;
	}

	/**
	 * Gets the value of the prorateFactor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProrateFactor() {
		return prorateFactor;
	}

	/**
	 * Sets the value of the prorateFactor property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setProrateFactor(String value) {
		this.prorateFactor = value;
	}

	/**
	 * Gets the value of the proratedPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProratedPremium() {
		return proratedPremium;
	}

	/**
	 * Sets the value of the proratedPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setProratedPremium(String value) {
		this.proratedPremium = value;
	}

	/**
	 * Gets the value of the netCalculatedPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNetCalculatedPremium() {
		return netCalculatedPremium;
	}

	/**
	 * Sets the value of the netCalculatedPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setNetCalculatedPremium(String value) {
		this.netCalculatedPremium = value;
	}

	/**
	 * Gets the value of the alternateCovCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlternateCovCode() {
		return alternateCovCode;
	}

	/**
	 * Sets the value of the alternateCovCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAlternateCovCode(String value) {
		this.alternateCovCode = value;
	}

	/**
	 * Gets the value of the thirdPartyLmtApplication property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getThirdPartyLmtApplication() {
		return thirdPartyLmtApplication;
	}

	/**
	 * Sets the value of the thirdPartyLmtApplication property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setThirdPartyLmtApplication(String value) {
		this.thirdPartyLmtApplication = value;
	}

	/**
	 * Gets the value of the thirdPartyDedApplication property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getThirdPartyDedApplication() {
		return thirdPartyDedApplication;
	}

	/**
	 * Sets the value of the thirdPartyDedApplication property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setThirdPartyDedApplication(String value) {
		this.thirdPartyDedApplication = value;
	}

	/**
	 * Gets the value of the deathBenefitSngleLossLmtApp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeathBenefitSngleLossLmtApp() {
		return deathBenefitSngleLossLmtApp;
	}

	/**
	 * Sets the value of the deathBenefitSngleLossLmtApp property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeathBenefitSngleLossLmtApp(String value) {
		this.deathBenefitSngleLossLmtApp = value;
	}

	/**
	 * Gets the value of the rrCostsSngleLossLmtApp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRrCostsSngleLossLmtApp() {
		return rrCostsSngleLossLmtApp;
	}

	/**
	 * Sets the value of the rrCostsSngleLossLmtApp property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setRrCostsSngleLossLmtApp(String value) {
		this.rrCostsSngleLossLmtApp = value;
	}

	/**
	 * Gets the value of the rrSublimitLmtLiabApp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRrSublimitLmtLiabApp() {
		return rrSublimitLmtLiabApp;
	}

	/**
	 * Sets the value of the rrSublimitLmtLiabApp property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setRrSublimitLmtLiabApp(String value) {
		this.rrSublimitLmtLiabApp = value;
	}

	/**
	 * Gets the value of the insuringAggBDedApp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInsuringAggBDedApp() {
		return insuringAggBDedApp;
	}

	/**
	 * Sets the value of the insuringAggBDedApp property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInsuringAggBDedApp(String value) {
		this.insuringAggBDedApp = value;
	}

	/**
	 * Gets the value of the insuringAggCDedApp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInsuringAggCDedApp() {
		return insuringAggCDedApp;
	}

	/**
	 * Sets the value of the insuringAggCDedApp property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInsuringAggCDedApp(String value) {
		this.insuringAggCDedApp = value;
	}

	/**
	 * Gets the value of the minEarnedPremPct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMinEarnedPremPct() {
		return minEarnedPremPct;
	}

	/**
	 * Sets the value of the minEarnedPremPct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setMinEarnedPremPct(String value) {
		this.minEarnedPremPct = value;
	}

	/**
	 * Gets the value of the cancelMethodInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCancelMethodInd() {
		return cancelMethodInd;
	}

	/**
	 * Sets the value of the cancelMethodInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCancelMethodInd(String value) {
		this.cancelMethodInd = value;
	}

	/**
	 * Gets the value of the minEarnedPremFctr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMinEarnedPremFctr() {
		return minEarnedPremFctr;
	}

	/**
	 * Sets the value of the minEarnedPremFctr property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setMinEarnedPremFctr(String value) {
		this.minEarnedPremFctr = value;
	}

	/**
	 * Gets the value of the cancelFctr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCancelFctr() {
		return cancelFctr;
	}

	/**
	 * Sets the value of the cancelFctr property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCancelFctr(String value) {
		this.cancelFctr = value;
	}

	/**
	 * Gets the value of the prevAdjustedAnnualPrem property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevAdjustedAnnualPrem() {
		return prevAdjustedAnnualPrem;
	}

	/**
	 * Sets the value of the prevAdjustedAnnualPrem property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevAdjustedAnnualPrem(String value) {
		this.prevAdjustedAnnualPrem = value;
	}

	/**
	 * Gets the value of the termPremOverrideInput property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTermPremOverrideInput() {
		return termPremOverrideInput;
	}

	/**
	 * Sets the value of the termPremOverrideInput property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTermPremOverrideInput(String value) {
		this.termPremOverrideInput = value;
	}

	/**
	 * Gets the value of the adjustedAnnualPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdjustedAnnualPremium() {
		return adjustedAnnualPremium;
	}

	/**
	 * Sets the value of the adjustedAnnualPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAdjustedAnnualPremium(String value) {
		this.adjustedAnnualPremium = value;
	}

	/**
	 * Gets the value of the covTransactionEffDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCovTransactionEffDate() {
		return covTransactionEffDate;
	}

	/**
	 * Sets the value of the covTransactionEffDate property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCovTransactionEffDate(String value) {
		this.covTransactionEffDate = value;
	}

	/**
	 * Gets the value of the totalPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTotalPremium() {
		return totalPremium;
	}

	/**
	 * Sets the value of the totalPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTotalPremium(String value) {
		this.totalPremium = value;
	}

	/**
	 * Gets the value of the enteredPremium2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEnteredPremium2() {
		return enteredPremium2;
	}

	/**
	 * Sets the value of the enteredPremium2 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEnteredPremium2(String value) {
		this.enteredPremium2 = value;
	}

	/**
	 * Gets the value of the cumulativePrem property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCumulativePrem() {
		return cumulativePrem;
	}

	/**
	 * Sets the value of the cumulativePrem property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCumulativePrem(String value) {
		this.cumulativePrem = value;
	}

	/**
	 * Gets the value of the schedRatingFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSchedRatingFct() {
		return schedRatingFct;
	}

	/**
	 * Sets the value of the schedRatingFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSchedRatingFct(String value) {
		this.schedRatingFct = value;
	}

	/**
	 * Gets the value of the overallRatingFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOverallRatingFct() {
		return overallRatingFct;
	}

	/**
	 * Sets the value of the overallRatingFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setOverallRatingFct(String value) {
		this.overallRatingFct = value;
	}

	/**
	 * Gets the value of the erpPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErpPremium() {
		return erpPremium;
	}

	/**
	 * Sets the value of the erpPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErpPremium(String value) {
		this.erpPremium = value;
	}

	/**
	 * Gets the value of the itderpPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getITDERPPremium() {
		return itderpPremium;
	}

	/**
	 * Sets the value of the itderpPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setITDERPPremium(String value) {
		this.itderpPremium = value;
	}

	/**
	 * Gets the value of the limit1TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLimit1TypeCd() {
		return limit1TypeCd;
	}

	/**
	 * Sets the value of the limit1TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLimit1TypeCd(String value) {
		this.limit1TypeCd = value;
	}

	/**
	 * Gets the value of the deductible1TypeDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible1TypeDesc() {
		return deductible1TypeDesc;
	}

	/**
	 * Sets the value of the deductible1TypeDesc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible1TypeDesc(String value) {
		this.deductible1TypeDesc = value;
	}

	/**
	 * Gets the value of the erpCovCommissionAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErpCovCommissionAmt() {
		return erpCovCommissionAmt;
	}

	/**
	 * Sets the value of the erpCovCommissionAmt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErpCovCommissionAmt(String value) {
		this.erpCovCommissionAmt = value;
	}

	/**
	 * Gets the value of the classCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClassCode() {
		return classCode;
	}

	/**
	 * Sets the value of the classCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setClassCode(String value) {
		this.classCode = value;
	}

	/**
	 * Gets the value of the eoerpPrevPrem property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOERPPrevPrem() {
		return eoerpPrevPrem;
	}

	/**
	 * Sets the value of the eoerpPrevPrem property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOERPPrevPrem(String value) {
		this.eoerpPrevPrem = value;
	}

	/**
	 * Gets the value of the postERPRunOffInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPostERPRunOffInd() {
		return postERPRunOffInd;
	}

	/**
	 * Sets the value of the postERPRunOffInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPostERPRunOffInd(String value) {
		this.postERPRunOffInd = value;
	}

	/**
	 * Gets the value of the cancelFctrORP property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCancelFctrORP() {
		return cancelFctrORP;
	}

	/**
	 * Sets the value of the cancelFctrORP property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCancelFctrORP(String value) {
		this.cancelFctrORP = value;
	}

	/**
	 * Gets the value of the preverpPremOverrideInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPreverpPremOverrideInd() {
		return preverpPremOverrideInd;
	}

	/**
	 * Sets the value of the preverpPremOverrideInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPreverpPremOverrideInd(String value) {
		this.preverpPremOverrideInd = value;
	}

	/**
	 * Gets the value of the mlob property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMLOB() {
		return mlob;
	}

	/**
	 * Sets the value of the mlob property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setMLOB(String value) {
		this.mlob = value;
	}

	/**
	 * Gets the value of the computerTheftCoverageSelection property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getComputerTheftCoverageSelection() {
		return computerTheftCoverageSelection;
	}

	/**
	 * Sets the value of the computerTheftCoverageSelection property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setComputerTheftCoverageSelection(String value) {
		this.computerTheftCoverageSelection = value;
	}

	/**
	 * Gets the value of the fundsTransferCoverageSelection property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFundsTransferCoverageSelection() {
		return fundsTransferCoverageSelection;
	}

	/**
	 * Sets the value of the fundsTransferCoverageSelection property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFundsTransferCoverageSelection(String value) {
		this.fundsTransferCoverageSelection = value;
	}

	/**
	 * Gets the value of the riskClass property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRiskClass() {
		return riskClass;
	}

	/**
	 * Sets the value of the riskClass property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setRiskClass(String value) {
		this.riskClass = value;
	}

	/**
	 * Gets the value of the crimeDiscovered property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCrimeDiscovered() {
		return crimeDiscovered;
	}

	/**
	 * Sets the value of the crimeDiscovered property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCrimeDiscovered(String value) {
		this.crimeDiscovered = value;
	}

	/**
	 * Gets the value of the crimeDiscoveryFactor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCrimeDiscoveryFactor() {
		return crimeDiscoveryFactor;
	}

	/**
	 * Sets the value of the crimeDiscoveryFactor property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCrimeDiscoveryFactor(String value) {
		this.crimeDiscoveryFactor = value;
	}

	/**
	 * Gets the value of the investigationCostsLimit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvestigationCostsLimit() {
		return investigationCostsLimit;
	}

	/**
	 * Sets the value of the investigationCostsLimit property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInvestigationCostsLimit(String value) {
		this.investigationCostsLimit = value;
	}

	/**
	 * Gets the value of the investigationCostFactor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvestigationCostFactor() {
		return investigationCostFactor;
	}

	/**
	 * Sets the value of the investigationCostFactor property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInvestigationCostFactor(String value) {
		this.investigationCostFactor = value;
	}

	/**
	 * Gets the value of the investigationCostPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvestigationCostPremium() {
		return investigationCostPremium;
	}

	/**
	 * Sets the value of the investigationCostPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInvestigationCostPremium(String value) {
		this.investigationCostPremium = value;
	}

	/**
	 * Gets the value of the sublimit1Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSublimit1Amt() {
		return sublimit1Amt;
	}

	/**
	 * Sets the value of the sublimit1Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSublimit1Amt(String value) {
		this.sublimit1Amt = value;
	}

	/**
	 * Gets the value of the limit2TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLimit2TypeCd() {
		return limit2TypeCd;
	}

	/**
	 * Sets the value of the limit2TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLimit2TypeCd(String value) {
		this.limit2TypeCd = value;
	}

	/**
	 * Gets the value of the limit2ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLimit2ApplicationCd() {
		return limit2ApplicationCd;
	}

	/**
	 * Sets the value of the limit2ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLimit2ApplicationCd(String value) {
		this.limit2ApplicationCd = value;
	}

	/**
	 * Gets the value of the sublimit1RBAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSublimit1RBAmt() {
		return sublimit1RBAmt;
	}

	/**
	 * Sets the value of the sublimit1RBAmt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSublimit1RBAmt(String value) {
		this.sublimit1RBAmt = value;
	}

	/**
	 * Gets the value of the litigationDate1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLitigationDate1() {
		return litigationDate1;
	}

	/**
	 * Sets the value of the litigationDate1 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLitigationDate1(String value) {
		this.litigationDate1 = value;
	}

	/**
	 * Gets the value of the esop property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getESOP() {
		return esop;
	}

	/**
	 * Sets the value of the esop property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setESOP(String value) {
		this.esop = value;
	}

	/**
	 * Gets the value of the priorActs property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPriorActs() {
		return priorActs;
	}

	/**
	 * Sets the value of the priorActs property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPriorActs(String value) {
		this.priorActs = value;
	}

	/**
	 * Gets the value of the erpRunOffInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErpRunOffInd() {
		return erpRunOffInd;
	}

	/**
	 * Sets the value of the erpRunOffInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErpRunOffInd(String value) {
		this.erpRunOffInd = value;
	}

	/**
	 * Gets the value of the litigationDate1Desc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLitigationDate1Desc() {
		return litigationDate1Desc;
	}

	/**
	 * Sets the value of the litigationDate1Desc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLitigationDate1Desc(String value) {
		this.litigationDate1Desc = value;
	}

	/**
	 * Gets the value of the priorActsDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPriorActsDesc() {
		return priorActsDesc;
	}

	/**
	 * Sets the value of the priorActsDesc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPriorActsDesc(String value) {
		this.priorActsDesc = value;
	}

	/**
	 * Gets the value of the sublimit1ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSublimit1ApplicationCd() {
		return sublimit1ApplicationCd;
	}

	/**
	 * Sets the value of the sublimit1ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSublimit1ApplicationCd(String value) {
		this.sublimit1ApplicationCd = value;
	}

	/**
	 * Gets the value of the wpvBusinessInterCost property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWPVBusinessInterCost() {
		return wpvBusinessInterCost;
	}

	/**
	 * Sets the value of the wpvBusinessInterCost property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setWPVBusinessInterCost(String value) {
		this.wpvBusinessInterCost = value;
	}

	/**
	 * Gets the value of the dbSingleLossLimit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDBSingleLossLimit() {
		return dbSingleLossLimit;
	}

	/**
	 * Sets the value of the dbSingleLossLimit property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDBSingleLossLimit(String value) {
		this.dbSingleLossLimit = value;
	}

	/**
	 * Gets the value of the rrSingleLossLimit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRRSingleLossLimit() {
		return rrSingleLossLimit;
	}

	/**
	 * Sets the value of the rrSingleLossLimit property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setRRSingleLossLimit(String value) {
		this.rrSingleLossLimit = value;
	}

	/**
	 * Gets the value of the sublimit3ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSublimit3ApplicationCd() {
		return sublimit3ApplicationCd;
	}

	/**
	 * Sets the value of the sublimit3ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSublimit3ApplicationCd(String value) {
		this.sublimit3ApplicationCd = value;
	}

	/**
	 * Gets the value of the sublimit1TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSublimit1TypeCd() {
		return sublimit1TypeCd;
	}

	/**
	 * Sets the value of the sublimit1TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSublimit1TypeCd(String value) {
		this.sublimit1TypeCd = value;
	}

	/**
	 * Gets the value of the deductible3Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible3Amt() {
		return deductible3Amt;
	}

	/**
	 * Sets the value of the deductible3Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible3Amt(String value) {
		this.deductible3Amt = value;
	}

	/**
	 * Gets the value of the deductible2TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible2TypeCd() {
		return deductible2TypeCd;
	}

	/**
	 * Sets the value of the deductible2TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible2TypeCd(String value) {
		this.deductible2TypeCd = value;
	}

	/**
	 * Gets the value of the deductible3TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible3TypeCd() {
		return deductible3TypeCd;
	}

	/**
	 * Sets the value of the deductible3TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible3TypeCd(String value) {
		this.deductible3TypeCd = value;
	}

	/**
	 * Gets the value of the deductible2ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible2ApplicationCd() {
		return deductible2ApplicationCd;
	}

	/**
	 * Sets the value of the deductible2ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible2ApplicationCd(String value) {
		this.deductible2ApplicationCd = value;
	}

	/**
	 * Gets the value of the deductible3ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible3ApplicationCd() {
		return deductible3ApplicationCd;
	}

	/**
	 * Sets the value of the deductible3ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible3ApplicationCd(String value) {
		this.deductible3ApplicationCd = value;
	}

	/**
	 * Gets the value of the thirdPartyLimit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getThirdPartyLimit() {
		return thirdPartyLimit;
	}

	/**
	 * Sets the value of the thirdPartyLimit property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setThirdPartyLimit(String value) {
		this.thirdPartyLimit = value;
	}

	/**
	 * Gets the value of the thirdPartyDeductible property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getThirdPartyDeductible() {
		return thirdPartyDeductible;
	}

	/**
	 * Sets the value of the thirdPartyDeductible property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setThirdPartyDeductible(String value) {
		this.thirdPartyDeductible = value;
	}

	/**
	 * Gets the value of the litigationDateThirdParty property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLitigationDateThirdParty() {
		return litigationDateThirdParty;
	}

	/**
	 * Sets the value of the litigationDateThirdParty property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLitigationDateThirdParty(String value) {
		this.litigationDateThirdParty = value;
	}

	/**
	 * Gets the value of the deductible2TypeDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible2TypeDesc() {
		return deductible2TypeDesc;
	}

	/**
	 * Sets the value of the deductible2TypeDesc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible2TypeDesc(String value) {
		this.deductible2TypeDesc = value;
	}

	/**
	 * Gets the value of the litigationDateThirdPartyDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLitigationDateThirdPartyDesc() {
		return litigationDateThirdPartyDesc;
	}

	/**
	 * Sets the value of the litigationDateThirdPartyDesc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLitigationDateThirdPartyDesc(String value) {
		this.litigationDateThirdPartyDesc = value;
	}

	/**
	 * Gets the value of the includeThirdPartyCov property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIncludeThirdPartyCov() {
		return includeThirdPartyCov;
	}

	/**
	 * Sets the value of the includeThirdPartyCov property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setIncludeThirdPartyCov(String value) {
		this.includeThirdPartyCov = value;
	}

	/**
	 * Gets the value of the eplThirdPPDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEPLThirdPPDate() {
		return eplThirdPPDate;
	}

	/**
	 * Sets the value of the eplThirdPPDate property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEPLThirdPPDate(String value) {
		this.eplThirdPPDate = value;
	}

	/**
	 * Gets the value of the overrideEPLThirdValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOverrideEPLThirdValue() {
		return overrideEPLThirdValue;
	}

	/**
	 * Sets the value of the overrideEPLThirdValue property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setOverrideEPLThirdValue(String value) {
		this.overrideEPLThirdValue = value;
	}

	/**
	 * Gets the value of the overrideClaimsDeductible property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOverrideClaimsDeductible() {
		return overrideClaimsDeductible;
	}

	/**
	 * Sets the value of the overrideClaimsDeductible property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setOverrideClaimsDeductible(String value) {
		this.overrideClaimsDeductible = value;
	}

	/**
	 * Gets the value of the date3 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDate3() {
		return date3;
	}

	/**
	 * Sets the value of the date3 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDate3(String value) {
		this.date3 = value;
	}

	/**
	 * Gets the value of the date4 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDate4() {
		return date4;
	}

	/**
	 * Sets the value of the date4 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDate4(String value) {
		this.date4 = value;
	}

	/**
	 * Gets the value of the addtlLiabLimits property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddtlLiabLimits() {
		return addtlLiabLimits;
	}

	/**
	 * Sets the value of the addtlLiabLimits property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAddtlLiabLimits(String value) {
		this.addtlLiabLimits = value;
	}

	/**
	 * Gets the value of the deductible3TypeDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible3TypeDesc() {
		return deductible3TypeDesc;
	}

	/**
	 * Sets the value of the deductible3TypeDesc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible3TypeDesc(String value) {
		this.deductible3TypeDesc = value;
	}

	/**
	 * Gets the value of the date3Dropdown property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDate3Dropdown() {
		return date3Dropdown;
	}

	/**
	 * Sets the value of the date3Dropdown property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDate3Dropdown(String value) {
		this.date3Dropdown = value;
	}

	/**
	 * Gets the value of the date4Dropdown property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDate4Dropdown() {
		return date4Dropdown;
	}

	/**
	 * Sets the value of the date4Dropdown property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDate4Dropdown(String value) {
		this.date4Dropdown = value;
	}

	/**
	 * Gets the value of the litigationDate2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLitigationDate2() {
		return litigationDate2;
	}

	/**
	 * Sets the value of the litigationDate2 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLitigationDate2(String value) {
		this.litigationDate2 = value;
	}

	/**
	 * Gets the value of the litigationDate3 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLitigationDate3() {
		return litigationDate3;
	}

	/**
	 * Sets the value of the litigationDate3 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLitigationDate3(String value) {
		this.litigationDate3 = value;
	}

	/**
	 * Gets the value of the sublimit2Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSublimit2Amt() {
		return sublimit2Amt;
	}

	/**
	 * Sets the value of the sublimit2Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSublimit2Amt(String value) {
		this.sublimit2Amt = value;
	}

	/**
	 * Gets the value of the sublimit3Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSublimit3Amt() {
		return sublimit3Amt;
	}

	/**
	 * Sets the value of the sublimit3Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSublimit3Amt(String value) {
		this.sublimit3Amt = value;
	}

	/**
	 * Gets the value of the retroactiveDt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRetroactiveDt() {
		return retroactiveDt;
	}

	/**
	 * Sets the value of the retroactiveDt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setRetroactiveDt(String value) {
		this.retroactiveDt = value;
	}

	/**
	 * Gets the value of the rate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRate() {
		return rate;
	}

	/**
	 * Sets the value of the rate property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setRate(String value) {
		this.rate = value;
	}

	/**
	 * Gets the value of the rrSublimitofLiab property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRrSublimitofLiab() {
		return rrSublimitofLiab;
	}

	/**
	 * Sets the value of the rrSublimitofLiab property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setRrSublimitofLiab(String value) {
		this.rrSublimitofLiab = value;
	}

	/**
	 * Gets the value of the wastedList property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWastedList() {
		return wastedList;
	}

	/**
	 * Sets the value of the wastedList property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setWastedList(String value) {
		this.wastedList = value;
	}

	/**
	 * Gets the value of the riskState property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRiskState() {
		return riskState;
	}

	/**
	 * Sets the value of the riskState property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setRiskState(String value) {
		this.riskState = value;
	}

	/**
	 * Gets the value of the otherDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOtherDesc() {
		return otherDesc;
	}

	/**
	 * Sets the value of the otherDesc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setOtherDesc(String value) {
		this.otherDesc = value;
	}

	/**
	 * Gets the value of the deathLimitofLiab property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeathLimitofLiab() {
		return deathLimitofLiab;
	}

	/**
	 * Sets the value of the deathLimitofLiab property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeathLimitofLiab(String value) {
		this.deathLimitofLiab = value;
	}

	/**
	 * Gets the value of the mutLimitofLiab property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMutLimitofLiab() {
		return mutLimitofLiab;
	}

	/**
	 * Sets the value of the mutLimitofLiab property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setMutLimitofLiab(String value) {
		this.mutLimitofLiab = value;
	}

	/**
	 * Gets the value of the otherInjLimitofLiab property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOtherInjLimitofLiab() {
		return otherInjLimitofLiab;
	}

	/**
	 * Sets the value of the otherInjLimitofLiab property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setOtherInjLimitofLiab(String value) {
		this.otherInjLimitofLiab = value;
	}

	/**
	 * Gets the value of the totalGLPremiumAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTotalGLPremiumAmt() {
		return totalGLPremiumAmt;
	}

	/**
	 * Sets the value of the totalGLPremiumAmt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTotalGLPremiumAmt(String value) {
		this.totalGLPremiumAmt = value;
	}

	/**
	 * Gets the value of the sublimit2ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSublimit2ApplicationCd() {
		return sublimit2ApplicationCd;
	}

	/**
	 * Sets the value of the sublimit2ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSublimit2ApplicationCd(String value) {
		this.sublimit2ApplicationCd = value;
	}

	/**
	 * Gets the value of the knrLitigationDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getKNRLitigationDate() {
		return knrLitigationDate;
	}

	/**
	 * Sets the value of the knrLitigationDate property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setKNRLitigationDate(String value) {
		this.knrLitigationDate = value;
	}

	/**
	 * Gets the value of the addtlLiabLimitFactor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddtlLiabLimitFactor() {
		return addtlLiabLimitFactor;
	}

	/**
	 * Sets the value of the addtlLiabLimitFactor property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAddtlLiabLimitFactor(String value) {
		this.addtlLiabLimitFactor = value;
	}

	/**
	 * Gets the value of the enteredPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEnteredPremium() {
		return enteredPremium;
	}

	/**
	 * Sets the value of the enteredPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEnteredPremium(String value) {
		this.enteredPremium = value;
	}

	/**
	 * Gets the value of the waitingPeriod property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWaitingPeriod() {
		return waitingPeriod;
	}

	/**
	 * Sets the value of the waitingPeriod property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setWaitingPeriod(String value) {
		this.waitingPeriod = value;
	}

	/**
	 * Gets the value of the crmCovLimit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCrmCovLimit() {
		return crmCovLimit;
	}

	/**
	 * Sets the value of the crmCovLimit property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCrmCovLimit(String value) {
		this.crmCovLimit = value;
	}

	/**
	 * Gets the value of the crmCovDeductible property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCrmCovDeductible() {
		return crmCovDeductible;
	}

	/**
	 * Sets the value of the crmCovDeductible property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCrmCovDeductible(String value) {
		this.crmCovDeductible = value;
	}

	/**
	 * Gets the value of the itemType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getItemType() {
		return itemType;
	}

	/**
	 * Sets the value of the itemType property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setItemType(String value) {
		this.itemType = value;
	}

	/**
	 * Gets the value of the municipality property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMunicipality() {
		return municipality;
	}

	/**
	 * Sets the value of the municipality property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setMunicipality(String value) {
		this.municipality = value;
	}

	/**
	 * Gets the value of the otherFeePremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOtherFeePremium() {
		return otherFeePremium;
	}

	/**
	 * Sets the value of the otherFeePremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setOtherFeePremium(String value) {
		this.otherFeePremium = value;
	}

	/**
	 * Gets the value of the overridePremiumflag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOverridePremiumflag() {
		return overridePremiumflag;
	}

	/**
	 * Sets the value of the overridePremiumflag property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setOverridePremiumflag(String value) {
		this.overridePremiumflag = value;
	}

	/**
	 * Gets the value of the addtlLimitOfLiab property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddtlLimitOfLiab() {
		return addtlLimitOfLiab;
	}

	/**
	 * Sets the value of the addtlLimitOfLiab property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAddtlLimitOfLiab(String value) {
		this.addtlLimitOfLiab = value;
	}

	/**
	 * Gets the value of the erpTerm property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErpTerm() {
		return erpTerm;
	}

	/**
	 * Sets the value of the erpTerm property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErpTerm(String value) {
		this.erpTerm = value;
	}

	/**
	 * Gets the value of the erpPremOverrideInput property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErpPremOverrideInput() {
		return erpPremOverrideInput;
	}

	/**
	 * Sets the value of the erpPremOverrideInput property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErpPremOverrideInput(String value) {
		this.erpPremOverrideInput = value;
	}

	/**
	 * Gets the value of the erpAnnualPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErpAnnualPremium() {
		return erpAnnualPremium;
	}

	/**
	 * Sets the value of the erpAnnualPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErpAnnualPremium(String value) {
		this.erpAnnualPremium = value;
	}

	/**
	 * Gets the value of the erpPremOverrideInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErpPremOverrideInd() {
		return erpPremOverrideInd;
	}

	/**
	 * Sets the value of the erpPremOverrideInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErpPremOverrideInd(String value) {
		this.erpPremOverrideInd = value;
	}

	/**
	 * Gets the value of the sublimit2TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSublimit2TypeCd() {
		return sublimit2TypeCd;
	}

	/**
	 * Sets the value of the sublimit2TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSublimit2TypeCd(String value) {
		this.sublimit2TypeCd = value;
	}

	/**
	 * Gets the value of the sublimit3TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSublimit3TypeCd() {
		return sublimit3TypeCd;
	}

	/**
	 * Sets the value of the sublimit3TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSublimit3TypeCd(String value) {
		this.sublimit3TypeCd = value;
	}

	/**
	 * Gets the value of the erpEffectiveDt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErpEffectiveDt() {
		return erpEffectiveDt;
	}

	/**
	 * Sets the value of the erpEffectiveDt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErpEffectiveDt(String value) {
		this.erpEffectiveDt = value;
	}

	/**
	 * Gets the value of the tfsCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTfsCode() {
		return tfsCode;
	}

	/**
	 * Sets the value of the tfsCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTfsCode(String value) {
		this.tfsCode = value;
	}

	/**
	 * Gets the value of the enteredKRPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEnteredKRPremium() {
		return enteredKRPremium;
	}

	/**
	 * Sets the value of the enteredKRPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEnteredKRPremium(String value) {
		this.enteredKRPremium = value;
	}

	/**
	 * Gets the value of the retroactiveDtDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRetroactiveDtDesc() {
		return retroactiveDtDesc;
	}

	/**
	 * Sets the value of the retroactiveDtDesc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setRetroactiveDtDesc(String value) {
		this.retroactiveDtDesc = value;
	}

	/**
	 * Gets the value of the errAddLim500 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrAddLim500() {
		return errAddLim500;
	}

	/**
	 * Sets the value of the errAddLim500 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErrAddLim500(String value) {
		this.errAddLim500 = value;
	}

	/**
	 * Gets the value of the errEPLDed property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrEPLDed() {
		return errEPLDed;
	}

	/**
	 * Sets the value of the errEPLDed property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErrEPLDed(String value) {
		this.errEPLDed = value;
	}

	/**
	 * Gets the value of the errDedCrmNULL property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrDedCrmNULL() {
		return errDedCrmNULL;
	}

	/**
	 * Sets the value of the errDedCrmNULL property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErrDedCrmNULL(String value) {
		this.errDedCrmNULL = value;
	}

	/**
	 * Gets the value of the knrComp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getKNRComp() {
		return knrComp;
	}

	/**
	 * Sets the value of the knrComp property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setKNRComp(String value) {
		this.knrComp = value;
	}

	/**
	 * Gets the value of the overPremFlagHolder property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOverPremFlagHolder() {
		return overPremFlagHolder;
	}

	/**
	 * Sets the value of the overPremFlagHolder property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setOverPremFlagHolder(String value) {
		this.overPremFlagHolder = value;
	}

	/**
	 * Gets the value of the erpdateholder property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getERPDATEHOLDER() {
		return erpdateholder;
	}

	/**
	 * Sets the value of the erpdateholder property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setERPDATEHOLDER(String value) {
		this.erpdateholder = value;
	}

	/**
	 * Gets the value of the errEPLThirdPartyLim property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrEPLThirdPartyLim() {
		return errEPLThirdPartyLim;
	}

	/**
	 * Sets the value of the errEPLThirdPartyLim property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErrEPLThirdPartyLim(String value) {
		this.errEPLThirdPartyLim = value;
	}

	/**
	 * Gets the value of the errThirdPartyDed property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrThirdPartyDed() {
		return errThirdPartyDed;
	}

	/**
	 * Sets the value of the errThirdPartyDed property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErrThirdPartyDed(String value) {
		this.errThirdPartyDed = value;
	}

	/**
	 * Gets the value of the errDedAmtDefault property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrDedAmtDefault() {
		return errDedAmtDefault;
	}

	/**
	 * Sets the value of the errDedAmtDefault property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErrDedAmtDefault(String value) {
		this.errDedAmtDefault = value;
	}

	/**
	 * Gets the value of the oosPremiumOverrideFlag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOosPremiumOverrideFlag() {
		return oosPremiumOverrideFlag;
	}

	/**
	 * Sets the value of the oosPremiumOverrideFlag property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setOosPremiumOverrideFlag(String value) {
		this.oosPremiumOverrideFlag = value;
	}

	/**
	 * Gets the value of the coverageCode2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCoverageCode2() {
		return coverageCode2;
	}

	/**
	 * Sets the value of the coverageCode2 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCoverageCode2(String value) {
		this.coverageCode2 = value;
	}

	/**
	 * Gets the value of the coverageSupressTFS property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCoverageSupressTFS() {
		return coverageSupressTFS;
	}

	/**
	 * Sets the value of the coverageSupressTFS property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCoverageSupressTFS(String value) {
		this.coverageSupressTFS = value;
	}

	/**
	 * Gets the value of the coverageCode3 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCoverageCode3() {
		return coverageCode3;
	}

	/**
	 * Sets the value of the coverageCode3 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCoverageCode3(String value) {
		this.coverageCode3 = value;
	}

	/**
	 * Gets the value of the archTotalParticipation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArchTotalParticipation() {
		return archTotalParticipation;
	}

	/**
	 * Sets the value of the archTotalParticipation property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setArchTotalParticipation(String value) {
		this.archTotalParticipation = value;
	}

	/**
	 * Gets the value of the deductible4ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible4ApplicationCd() {
		return deductible4ApplicationCd;
	}

	/**
	 * Sets the value of the deductible4ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible4ApplicationCd(String value) {
		this.deductible4ApplicationCd = value;
	}

	/**
	 * Gets the value of the deductible4TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible4TypeCd() {
		return deductible4TypeCd;
	}

	/**
	 * Sets the value of the deductible4TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible4TypeCd(String value) {
		this.deductible4TypeCd = value;
	}

	/**
	 * Gets the value of the includeDerivDemandInvCostsInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIncludeDerivDemandInvCostsInd() {
		return includeDerivDemandInvCostsInd;
	}

	/**
	 * Sets the value of the includeDerivDemandInvCostsInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setIncludeDerivDemandInvCostsInd(String value) {
		this.includeDerivDemandInvCostsInd = value;
	}

	/**
	 * Gets the value of the subLimit1ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubLimit1ApplicationCd() {
		return subLimit1ApplicationCd;
	}

	/**
	 * Sets the value of the subLimit1ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSubLimit1ApplicationCd(String value) {
		this.subLimit1ApplicationCd = value;
	}

	/**
	 * Gets the value of the subLimit1TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubLimit1TypeCd() {
		return subLimit1TypeCd;
	}

	/**
	 * Sets the value of the subLimit1TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSubLimit1TypeCd(String value) {
		this.subLimit1TypeCd = value;
	}

	/**
	 * Gets the value of the deductible5ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible5ApplicationCd() {
		return deductible5ApplicationCd;
	}

	/**
	 * Sets the value of the deductible5ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible5ApplicationCd(String value) {
		this.deductible5ApplicationCd = value;
	}

	/**
	 * Gets the value of the deductible5TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible5TypeCd() {
		return deductible5TypeCd;
	}

	/**
	 * Sets the value of the deductible5TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible5TypeCd(String value) {
		this.deductible5TypeCd = value;
	}

	/**
	 * Gets the value of the includeNonIndemFIDInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIncludeNonIndemFIDInd() {
		return includeNonIndemFIDInd;
	}

	/**
	 * Sets the value of the includeNonIndemFIDInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setIncludeNonIndemFIDInd(String value) {
		this.includeNonIndemFIDInd = value;
	}

	/**
	 * Gets the value of the erpRiskLevel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErpRiskLevel() {
		return erpRiskLevel;
	}

	/**
	 * Sets the value of the erpRiskLevel property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErpRiskLevel(String value) {
		this.erpRiskLevel = value;
	}

	/**
	 * Gets the value of the subLimit2Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubLimit2Amt() {
		return subLimit2Amt;
	}

	/**
	 * Sets the value of the subLimit2Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSubLimit2Amt(String value) {
		this.subLimit2Amt = value;
	}

	/**
	 * Gets the value of the subLimit2ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubLimit2ApplicationCd() {
		return subLimit2ApplicationCd;
	}

	/**
	 * Sets the value of the subLimit2ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSubLimit2ApplicationCd(String value) {
		this.subLimit2ApplicationCd = value;
	}

	/**
	 * Gets the value of the subLimit2TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubLimit2TypeCd() {
		return subLimit2TypeCd;
	}

	/**
	 * Sets the value of the subLimit2TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSubLimit2TypeCd(String value) {
		this.subLimit2TypeCd = value;
	}

	/**
	 * Gets the value of the reitInsAgrEInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getREITInsAgrEInd() {
		return reitInsAgrEInd;
	}

	/**
	 * Sets the value of the reitInsAgrEInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setREITInsAgrEInd(String value) {
		this.reitInsAgrEInd = value;
	}

	/**
	 * Gets the value of the deductible6Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible6Amt() {
		return deductible6Amt;
	}

	/**
	 * Sets the value of the deductible6Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible6Amt(String value) {
		this.deductible6Amt = value;
	}

	/**
	 * Gets the value of the deductible6ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible6ApplicationCd() {
		return deductible6ApplicationCd;
	}

	/**
	 * Sets the value of the deductible6ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible6ApplicationCd(String value) {
		this.deductible6ApplicationCd = value;
	}

	/**
	 * Gets the value of the deductible6TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible6TypeCd() {
		return deductible6TypeCd;
	}

	/**
	 * Sets the value of the deductible6TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible6TypeCd(String value) {
		this.deductible6TypeCd = value;
	}

	/**
	 * Gets the value of the deductible6TypeDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible6TypeDesc() {
		return deductible6TypeDesc;
	}

	/**
	 * Sets the value of the deductible6TypeDesc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible6TypeDesc(String value) {
		this.deductible6TypeDesc = value;
	}

	/**
	 * Gets the value of the deductible7Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible7Amt() {
		return deductible7Amt;
	}

	/**
	 * Sets the value of the deductible7Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible7Amt(String value) {
		this.deductible7Amt = value;
	}

	/**
	 * Gets the value of the deductible7ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible7ApplicationCd() {
		return deductible7ApplicationCd;
	}

	/**
	 * Sets the value of the deductible7ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible7ApplicationCd(String value) {
		this.deductible7ApplicationCd = value;
	}

	/**
	 * Gets the value of the deductible7TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible7TypeCd() {
		return deductible7TypeCd;
	}

	/**
	 * Sets the value of the deductible7TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible7TypeCd(String value) {
		this.deductible7TypeCd = value;
	}

	/**
	 * Gets the value of the deductible7TypeDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible7TypeDesc() {
		return deductible7TypeDesc;
	}

	/**
	 * Sets the value of the deductible7TypeDesc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible7TypeDesc(String value) {
		this.deductible7TypeDesc = value;
	}

	/**
	 * Gets the value of the deductible8Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible8Amt() {
		return deductible8Amt;
	}

	/**
	 * Sets the value of the deductible8Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible8Amt(String value) {
		this.deductible8Amt = value;
	}

	/**
	 * Gets the value of the deductible8ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible8ApplicationCd() {
		return deductible8ApplicationCd;
	}

	/**
	 * Sets the value of the deductible8ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible8ApplicationCd(String value) {
		this.deductible8ApplicationCd = value;
	}

	/**
	 * Gets the value of the deductible8TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible8TypeCd() {
		return deductible8TypeCd;
	}

	/**
	 * Sets the value of the deductible8TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible8TypeCd(String value) {
		this.deductible8TypeCd = value;
	}

	/**
	 * Gets the value of the deductible8TypeDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible8TypeDesc() {
		return deductible8TypeDesc;
	}

	/**
	 * Sets the value of the deductible8TypeDesc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible8TypeDesc(String value) {
		this.deductible8TypeDesc = value;
	}

	/**
	 * Gets the value of the deductible9ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible9ApplicationCd() {
		return deductible9ApplicationCd;
	}

	/**
	 * Sets the value of the deductible9ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible9ApplicationCd(String value) {
		this.deductible9ApplicationCd = value;
	}

	/**
	 * Gets the value of the deductible9TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible9TypeCd() {
		return deductible9TypeCd;
	}

	/**
	 * Sets the value of the deductible9TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible9TypeCd(String value) {
		this.deductible9TypeCd = value;
	}

	/**
	 * Gets the value of the deductible9TypeDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible9TypeDesc() {
		return deductible9TypeDesc;
	}

	/**
	 * Sets the value of the deductible9TypeDesc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible9TypeDesc(String value) {
		this.deductible9TypeDesc = value;
	}

	/**
	 * Gets the value of the deductible10Pct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible10Pct() {
		return deductible10Pct;
	}

	/**
	 * Sets the value of the deductible10Pct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible10Pct(String value) {
		this.deductible10Pct = value;
	}

	/**
	 * Gets the value of the deductible10ApplicationCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible10ApplicationCd() {
		return deductible10ApplicationCd;
	}

	/**
	 * Sets the value of the deductible10ApplicationCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible10ApplicationCd(String value) {
		this.deductible10ApplicationCd = value;
	}

	/**
	 * Gets the value of the deductible10TypeCd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible10TypeCd() {
		return deductible10TypeCd;
	}

	/**
	 * Sets the value of the deductible10TypeCd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible10TypeCd(String value) {
		this.deductible10TypeCd = value;
	}

	/**
	 * Gets the value of the deductible10TypeDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible10TypeDesc() {
		return deductible10TypeDesc;
	}

	/**
	 * Sets the value of the deductible10TypeDesc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible10TypeDesc(String value) {
		this.deductible10TypeDesc = value;
	}

	/**
	 * Gets the value of the deductible4Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible4Amt() {
		return deductible4Amt;
	}

	/**
	 * Sets the value of the deductible4Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible4Amt(String value) {
		this.deductible4Amt = value;
	}

	/**
	 * Gets the value of the subLimit1Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubLimit1Amt() {
		return subLimit1Amt;
	}

	/**
	 * Sets the value of the subLimit1Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSubLimit1Amt(String value) {
		this.subLimit1Amt = value;
	}

	/**
	 * Gets the value of the deductible5Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible5Amt() {
		return deductible5Amt;
	}

	/**
	 * Sets the value of the deductible5Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible5Amt(String value) {
		this.deductible5Amt = value;
	}

	/**
	 * Gets the value of the provideSideAMatchInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProvideSideAMatchInd() {
		return provideSideAMatchInd;
	}

	/**
	 * Sets the value of the provideSideAMatchInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setProvideSideAMatchInd(String value) {
		this.provideSideAMatchInd = value;
	}

	/**
	 * Gets the value of the deductible4TypeDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible4TypeDesc() {
		return deductible4TypeDesc;
	}

	/**
	 * Sets the value of the deductible4TypeDesc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible4TypeDesc(String value) {
		this.deductible4TypeDesc = value;
	}

	/**
	 * Gets the value of the deductible5TypeDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible5TypeDesc() {
		return deductible5TypeDesc;
	}

	/**
	 * Sets the value of the deductible5TypeDesc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible5TypeDesc(String value) {
		this.deductible5TypeDesc = value;
	}

	/**
	 * Gets the value of the limit2AmtDOP property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLimit2AmtDOP() {
		return limit2AmtDOP;
	}

	/**
	 * Sets the value of the limit2AmtDOP property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLimit2AmtDOP(String value) {
		this.limit2AmtDOP = value;
	}

	/**
	 * Gets the value of the deductible2AmtDOP property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible2AmtDOP() {
		return deductible2AmtDOP;
	}

	/**
	 * Sets the value of the deductible2AmtDOP property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible2AmtDOP(String value) {
		this.deductible2AmtDOP = value;
	}

	/**
	 * Gets the value of the deductible3AmtDOP property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible3AmtDOP() {
		return deductible3AmtDOP;
	}

	/**
	 * Sets the value of the deductible3AmtDOP property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible3AmtDOP(String value) {
		this.deductible3AmtDOP = value;
	}

	/**
	 * Gets the value of the subLimit1AmtDOP property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubLimit1AmtDOP() {
		return subLimit1AmtDOP;
	}

	/**
	 * Sets the value of the subLimit1AmtDOP property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSubLimit1AmtDOP(String value) {
		this.subLimit1AmtDOP = value;
	}

	/**
	 * Gets the value of the deductible5AmtDOREIT property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible5AmtDOREIT() {
		return deductible5AmtDOREIT;
	}

	/**
	 * Sets the value of the deductible5AmtDOREIT property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible5AmtDOREIT(String value) {
		this.deductible5AmtDOREIT = value;
	}

	/**
	 * Gets the value of the advisoryILFFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdvisoryILFFct() {
		return advisoryILFFct;
	}

	/**
	 * Sets the value of the advisoryILFFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAdvisoryILFFct(String value) {
		this.advisoryILFFct = value;
	}

	/**
	 * Gets the value of the annualDOPPremAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAnnualDOPPremAmt() {
		return annualDOPPremAmt;
	}

	/**
	 * Sets the value of the annualDOPPremAmt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAnnualDOPPremAmt(String value) {
		this.annualDOPPremAmt = value;
	}

	/**
	 * Gets the value of the thirdPartyLmtType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getThirdPartyLmtType() {
		return thirdPartyLmtType;
	}

	/**
	 * Sets the value of the thirdPartyLmtType property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setThirdPartyLmtType(String value) {
		this.thirdPartyLmtType = value;
	}

	/**
	 * Gets the value of the thirdPartyDedType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getThirdPartyDedType() {
		return thirdPartyDedType;
	}

	/**
	 * Sets the value of the thirdPartyDedType property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setThirdPartyDedType(String value) {
		this.thirdPartyDedType = value;
	}

	/**
	 * Gets the value of the thirdPartyDedDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getThirdPartyDedDesc() {
		return thirdPartyDedDesc;
	}

	/**
	 * Sets the value of the thirdPartyDedDesc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setThirdPartyDedDesc(String value) {
		this.thirdPartyDedDesc = value;
	}

	/**
	 * Gets the value of the excludeFundEPLInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExcludeFundEPLInd() {
		return excludeFundEPLInd;
	}

	/**
	 * Sets the value of the excludeFundEPLInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setExcludeFundEPLInd(String value) {
		this.excludeFundEPLInd = value;
	}

	/**
	 * Gets the value of the overrideEPLThirdValueEPL property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOverrideEPLThirdValueEPL() {
		return overrideEPLThirdValueEPL;
	}

	/**
	 * Sets the value of the overrideEPLThirdValueEPL property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setOverrideEPLThirdValueEPL(String value) {
		this.overrideEPLThirdValueEPL = value;
	}

	/**
	 * Gets the value of the includeThirdPartyCovEPL property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIncludeThirdPartyCovEPL() {
		return includeThirdPartyCovEPL;
	}

	/**
	 * Sets the value of the includeThirdPartyCovEPL property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setIncludeThirdPartyCovEPL(String value) {
		this.includeThirdPartyCovEPL = value;
	}

	/**
	 * Gets the value of the thirdPartyLimitEPL property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getThirdPartyLimitEPL() {
		return thirdPartyLimitEPL;
	}

	/**
	 * Sets the value of the thirdPartyLimitEPL property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setThirdPartyLimitEPL(String value) {
		this.thirdPartyLimitEPL = value;
	}

	/**
	 * Gets the value of the thirdPartyDeductibleEPL property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getThirdPartyDeductibleEPL() {
		return thirdPartyDeductibleEPL;
	}

	/**
	 * Sets the value of the thirdPartyDeductibleEPL property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setThirdPartyDeductibleEPL(String value) {
		this.thirdPartyDeductibleEPL = value;
	}

	/**
	 * Gets the value of the deductible1AmtAAPFID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible1AmtAAPFID() {
		return deductible1AmtAAPFID;
	}

	/**
	 * Sets the value of the deductible1AmtAAPFID property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible1AmtAAPFID(String value) {
		this.deductible1AmtAAPFID = value;
	}

	/**
	 * Gets the value of the totalTransCovCommissionAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTotalTransCovCommissionAmt() {
		return totalTransCovCommissionAmt;
	}

	/**
	 * Sets the value of the totalTransCovCommissionAmt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTotalTransCovCommissionAmt(String value) {
		this.totalTransCovCommissionAmt = value;
	}

	/**
	 * Gets the value of the deductible2Exclude property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible2Exclude() {
		return deductible2Exclude;
	}

	/**
	 * Sets the value of the deductible2Exclude property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible2Exclude(String value) {
		this.deductible2Exclude = value;
	}

	/**
	 * Gets the value of the deductible3Exclude property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible3Exclude() {
		return deductible3Exclude;
	}

	/**
	 * Sets the value of the deductible3Exclude property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible3Exclude(String value) {
		this.deductible3Exclude = value;
	}

	/**
	 * Gets the value of the deductible4Exclude property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible4Exclude() {
		return deductible4Exclude;
	}

	/**
	 * Sets the value of the deductible4Exclude property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible4Exclude(String value) {
		this.deductible4Exclude = value;
	}

	/**
	 * Gets the value of the deductible5Exclude property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible5Exclude() {
		return deductible5Exclude;
	}

	/**
	 * Sets the value of the deductible5Exclude property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible5Exclude(String value) {
		this.deductible5Exclude = value;
	}

	/**
	 * Gets the value of the deductible6Exclude property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible6Exclude() {
		return deductible6Exclude;
	}

	/**
	 * Sets the value of the deductible6Exclude property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible6Exclude(String value) {
		this.deductible6Exclude = value;
	}

	/**
	 * Gets the value of the deductible3AmtEPL property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible3AmtEPL() {
		return deductible3AmtEPL;
	}

	/**
	 * Sets the value of the deductible3AmtEPL property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible3AmtEPL(String value) {
		this.deductible3AmtEPL = value;
	}

	/**
	 * Gets the value of the deductible7Exclude property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible7Exclude() {
		return deductible7Exclude;
	}

	/**
	 * Sets the value of the deductible7Exclude property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible7Exclude(String value) {
		this.deductible7Exclude = value;
	}

	/**
	 * Gets the value of the deductible8Exclude property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible8Exclude() {
		return deductible8Exclude;
	}

	/**
	 * Sets the value of the deductible8Exclude property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible8Exclude(String value) {
		this.deductible8Exclude = value;
	}

	/**
	 * Gets the value of the deductible9Exclude property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible9Exclude() {
		return deductible9Exclude;
	}

	/**
	 * Sets the value of the deductible9Exclude property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible9Exclude(String value) {
		this.deductible9Exclude = value;
	}

	/**
	 * Gets the value of the deductible10Exclude property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible10Exclude() {
		return deductible10Exclude;
	}

	/**
	 * Sets the value of the deductible10Exclude property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible10Exclude(String value) {
		this.deductible10Exclude = value;
	}

	/**
	 * Gets the value of the limitAmtValidation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLimitAmtValidation() {
		return limitAmtValidation;
	}

	/**
	 * Sets the value of the limitAmtValidation property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLimitAmtValidation(String value) {
		this.limitAmtValidation = value;
	}

	/**
	 * Gets the value of the dateVAlidation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDateVAlidation() {
		return dateVAlidation;
	}

	/**
	 * Sets the value of the dateVAlidation property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDateVAlidation(String value) {
		this.dateVAlidation = value;
	}

	/**
	 * Gets the value of the deductible2AmtAAP property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible2AmtAAP() {
		return deductible2AmtAAP;
	}

	/**
	 * Sets the value of the deductible2AmtAAP property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible2AmtAAP(String value) {
		this.deductible2AmtAAP = value;
	}

	/**
	 * Gets the value of the litigationDateDescAAPHFL property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLitigationDateDescAAPHFL() {
		return litigationDateDescAAPHFL;
	}

	/**
	 * Sets the value of the litigationDateDescAAPHFL property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLitigationDateDescAAPHFL(String value) {
		this.litigationDateDescAAPHFL = value;
	}

	/**
	 * Gets the value of the defValueAAPHFL property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDefValueAAPHFL() {
		return defValueAAPHFL;
	}

	/**
	 * Sets the value of the defValueAAPHFL property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDefValueAAPHFL(String value) {
		this.defValueAAPHFL = value;
	}

	/**
	 * Gets the value of the erpDefault property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getERPDefault() {
		return erpDefault;
	}

	/**
	 * Sets the value of the erpDefault property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setERPDefault(String value) {
		this.erpDefault = value;
	}

	/**
	 * Gets the value of the rolPct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getROLPct() {
		return rolPct;
	}

	/**
	 * Sets the value of the rolPct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setROLPct(String value) {
		this.rolPct = value;
	}

	/**
	 * Gets the value of the inclLenderLiabInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInclLenderLiabInd() {
		return inclLenderLiabInd;
	}

	/**
	 * Sets the value of the inclLenderLiabInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInclLenderLiabInd(String value) {
		this.inclLenderLiabInd = value;
	}

	/**
	 * Gets the value of the attachment1AmtMAN property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAttachment1AmtMAN() {
		return attachment1AmtMAN;
	}

	/**
	 * Sets the value of the attachment1AmtMAN property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAttachment1AmtMAN(String value) {
		this.attachment1AmtMAN = value;
	}

	/**
	 * Gets the value of the covgOnPartnersInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCovgOnPartnersInd() {
		return covgOnPartnersInd;
	}

	/**
	 * Sets the value of the covgOnPartnersInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCovgOnPartnersInd(String value) {
		this.covgOnPartnersInd = value;
	}

	/**
	 * Gets the value of the limit2AmtFEMPTHR14 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLimit2AmtFEMPTHR14() {
		return limit2AmtFEMPTHR14;
	}

	/**
	 * Sets the value of the limit2AmtFEMPTHR14 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLimit2AmtFEMPTHR14(String value) {
		this.limit2AmtFEMPTHR14 = value;
	}

	/**
	 * Gets the value of the deductible2AmtFEMPTHR14 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible2AmtFEMPTHR14() {
		return deductible2AmtFEMPTHR14;
	}

	/**
	 * Sets the value of the deductible2AmtFEMPTHR14 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible2AmtFEMPTHR14(String value) {
		this.deductible2AmtFEMPTHR14 = value;
	}

	/**
	 * Gets the value of the attachment2Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAttachment2Amt() {
		return attachment2Amt;
	}

	/**
	 * Sets the value of the attachment2Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAttachment2Amt(String value) {
		this.attachment2Amt = value;
	}

	/**
	 * Gets the value of the partOf2Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPartOf2Amt() {
		return partOf2Amt;
	}

	/**
	 * Sets the value of the partOf2Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPartOf2Amt(String value) {
		this.partOf2Amt = value;
	}

	/**
	 * Gets the value of the deductible3Pct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible3Pct() {
		return deductible3Pct;
	}

	/**
	 * Sets the value of the deductible3Pct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible3Pct(String value) {
		this.deductible3Pct = value;
	}

	/**
	 * Gets the value of the isLastCrimeCoverage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIsLastCrimeCoverage() {
		return isLastCrimeCoverage;
	}

	/**
	 * Sets the value of the isLastCrimeCoverage property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setIsLastCrimeCoverage(String value) {
		this.isLastCrimeCoverage = value;
	}

	/**
	 * Gets the value of the attachment5Amt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAttachment5Amt() {
		return attachment5Amt;
	}

	/**
	 * Sets the value of the attachment5Amt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAttachment5Amt(String value) {
		this.attachment5Amt = value;
	}

	/**
	 * Gets the value of the erpFactor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErpFactor() {
		return erpFactor;
	}

	/**
	 * Sets the value of the erpFactor property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErpFactor(String value) {
		this.erpFactor = value;
	}

	/**
	 * Gets the value of the sublimit1AmtMAN property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSublimit1AmtMAN() {
		return sublimit1AmtMAN;
	}

	/**
	 * Sets the value of the sublimit1AmtMAN property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSublimit1AmtMAN(String value) {
		this.sublimit1AmtMAN = value;
	}

	/**
	 * Gets the value of the sublimit2AmtMAN property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSublimit2AmtMAN() {
		return sublimit2AmtMAN;
	}

	/**
	 * Sets the value of the sublimit2AmtMAN property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSublimit2AmtMAN(String value) {
		this.sublimit2AmtMAN = value;
	}

	/**
	 * Gets the value of the sublimit3AmtMAN property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSublimit3AmtMAN() {
		return sublimit3AmtMAN;
	}

	/**
	 * Sets the value of the sublimit3AmtMAN property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSublimit3AmtMAN(String value) {
		this.sublimit3AmtMAN = value;
	}

	/**
	 * Gets the value of the deductible1Exclude property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductible1Exclude() {
		return deductible1Exclude;
	}

	/**
	 * Sets the value of the deductible1Exclude property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductible1Exclude(String value) {
		this.deductible1Exclude = value;
	}

	/**
	 * Gets the value of the litigationDate4Desc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLitigationDate4Desc() {
		return litigationDate4Desc;
	}

	/**
	 * Sets the value of the litigationDate4Desc property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLitigationDate4Desc(String value) {
		this.litigationDate4Desc = value;
	}

	/**
	 * Gets the value of the litigationDate4 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLitigationDate4() {
		return litigationDate4;
	}

	/**
	 * Sets the value of the litigationDate4 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLitigationDate4(String value) {
		this.litigationDate4 = value;
	}

	/**
	 * Gets the value of the aaphflTailDateHolder property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAAPHFLTailDateHolder() {
		return aaphflTailDateHolder;
	}

	/**
	 * Sets the value of the aaphflTailDateHolder property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAAPHFLTailDateHolder(String value) {
		this.aaphflTailDateHolder = value;
	}

	/**
	 * Gets the value of the erpIndHold property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getERPIndHold() {
		return erpIndHold;
	}

	/**
	 * Sets the value of the erpIndHold property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setERPIndHold(String value) {
		this.erpIndHold = value;
	}

	/**
	 * Gets the value of the basePremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBasePremium() {
		return basePremium;
	}

	/**
	 * Sets the value of the basePremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setBasePremium(String value) {
		this.basePremium = value;
	}

	/**
	 * Gets the value of the baseRate1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBaseRate1() {
		return baseRate1;
	}

	/**
	 * Sets the value of the baseRate1 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setBaseRate1(String value) {
		this.baseRate1 = value;
	}

	/**
	 * Gets the value of the baseRate2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBaseRate2() {
		return baseRate2;
	}

	/**
	 * Sets the value of the baseRate2 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setBaseRate2(String value) {
		this.baseRate2 = value;
	}

	/**
	 * Gets the value of the baseRate3 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBaseRate3() {
		return baseRate3;
	}

	/**
	 * Sets the value of the baseRate3 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setBaseRate3(String value) {
		this.baseRate3 = value;
	}

	/**
	 * Gets the value of the basicPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBasicPremium() {
		return basicPremium;
	}

	/**
	 * Sets the value of the basicPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setBasicPremium(String value) {
		this.basicPremium = value;
	}

	/**
	 * Gets the value of the cancelOverridePrem property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCancelOverridePrem() {
		return cancelOverridePrem;
	}

	/**
	 * Sets the value of the cancelOverridePrem property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCancelOverridePrem(String value) {
		this.cancelOverridePrem = value;
	}

	/**
	 * Gets the value of the cededPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCededPremium() {
		return cededPremium;
	}

	/**
	 * Sets the value of the cededPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCededPremium(String value) {
		this.cededPremium = value;
	}

	/**
	 * Gets the value of the cededPremiumITD property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCededPremiumITD() {
		return cededPremiumITD;
	}

	/**
	 * Sets the value of the cededPremiumITD property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCededPremiumITD(String value) {
		this.cededPremiumITD = value;
	}

	/**
	 * Gets the value of the cededPremiumOutput property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCededPremiumOutput() {
		return cededPremiumOutput;
	}

	/**
	 * Sets the value of the cededPremiumOutput property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCededPremiumOutput(String value) {
		this.cededPremiumOutput = value;
	}

	/**
	 * Gets the value of the cedingCommPct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCedingCommPct() {
		return cedingCommPct;
	}

	/**
	 * Sets the value of the cedingCommPct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCedingCommPct(String value) {
		this.cedingCommPct = value;
	}

	/**
	 * Gets the value of the computerBasicPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getComputerBasicPremium() {
		return computerBasicPremium;
	}

	/**
	 * Sets the value of the computerBasicPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setComputerBasicPremium(String value) {
		this.computerBasicPremium = value;
	}

	/**
	 * Gets the value of the constantKey property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConstantKey() {
		return constantKey;
	}

	/**
	 * Sets the value of the constantKey property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setConstantKey(String value) {
		this.constantKey = value;
	}

	/**
	 * Gets the value of the coverageAddDelind property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCoverageAddDelind() {
		return coverageAddDelind;
	}

	/**
	 * Sets the value of the coverageAddDelind property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCoverageAddDelind(String value) {
		this.coverageAddDelind = value;
	}

	/**
	 * Gets the value of the crmForeignLocationExposureFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCRMForeignLocationExposureFct() {
		return crmForeignLocationExposureFct;
	}

	/**
	 * Sets the value of the crmForeignLocationExposureFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCRMForeignLocationExposureFct(String value) {
		this.crmForeignLocationExposureFct = value;
	}

	/**
	 * Gets the value of the decLiabDOLimit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDecLiabDOLimit() {
		return decLiabDOLimit;
	}

	/**
	 * Sets the value of the decLiabDOLimit property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDecLiabDOLimit(String value) {
		this.decLiabDOLimit = value;
	}

	/**
	 * Gets the value of the decLiabEPLLimit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDecLiabEPLLimit() {
		return decLiabEPLLimit;
	}

	/**
	 * Sets the value of the decLiabEPLLimit property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDecLiabEPLLimit(String value) {
		this.decLiabEPLLimit = value;
	}

	/**
	 * Gets the value of the decLiabFIDLimit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDecLiabFIDLimit() {
		return decLiabFIDLimit;
	}

	/**
	 * Sets the value of the decLiabFIDLimit property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDecLiabFIDLimit(String value) {
		this.decLiabFIDLimit = value;
	}

	/**
	 * Gets the value of the deductibleAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeductibleAmount() {
		return deductibleAmount;
	}

	/**
	 * Sets the value of the deductibleAmount property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeductibleAmount(String value) {
		this.deductibleAmount = value;
	}

	/**
	 * Gets the value of the deleteIndicator property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeleteIndicator() {
		return deleteIndicator;
	}

	/**
	 * Sets the value of the deleteIndicator property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDeleteIndicator(String value) {
		this.deleteIndicator = value;
	}

	/**
	 * Gets the value of the desiredPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDesiredPremium() {
		return desiredPremium;
	}

	/**
	 * Sets the value of the desiredPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDesiredPremium(String value) {
		this.desiredPremium = value;
	}

	/**
	 * Gets the value of the displayTest property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDisplayTest() {
		return displayTest;
	}

	/**
	 * Sets the value of the displayTest property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDisplayTest(String value) {
		this.displayTest = value;
	}

	/**
	 * Gets the value of the dopPublicDebtCovFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDOPPublicDebtCovFct() {
		return dopPublicDebtCovFct;
	}

	/**
	 * Sets the value of the dopPublicDebtCovFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDOPPublicDebtCovFct(String value) {
		this.dopPublicDebtCovFct = value;
	}

	/**
	 * Gets the value of the eoAnnualPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOAnnualPremium() {
		return eoAnnualPremium;
	}

	/**
	 * Sets the value of the eoAnnualPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOAnnualPremium(String value) {
		this.eoAnnualPremium = value;
	}

	/**
	 * Gets the value of the eoBusinessInterruptionFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOBusinessInterruptionFct() {
		return eoBusinessInterruptionFct;
	}

	/**
	 * Sets the value of the eoBusinessInterruptionFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOBusinessInterruptionFct(String value) {
		this.eoBusinessInterruptionFct = value;
	}

	/**
	 * Gets the value of the eoClaimsHistoryFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOClaimsHistoryFct() {
		return eoClaimsHistoryFct;
	}

	/**
	 * Sets the value of the eoClaimsHistoryFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOClaimsHistoryFct(String value) {
		this.eoClaimsHistoryFct = value;
	}

	/**
	 * Gets the value of the eoCovMinimumPremiumAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOCovMinimumPremiumAmt() {
		return eoCovMinimumPremiumAmt;
	}

	/**
	 * Sets the value of the eoCovMinimumPremiumAmt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOCovMinimumPremiumAmt(String value) {
		this.eoCovMinimumPremiumAmt = value;
	}

	/**
	 * Gets the value of the eoCovOverridePremiumAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOCovOverridePremiumAmt() {
		return eoCovOverridePremiumAmt;
	}

	/**
	 * Sets the value of the eoCovOverridePremiumAmt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOCovOverridePremiumAmt(String value) {
		this.eoCovOverridePremiumAmt = value;
	}

	/**
	 * Gets the value of the eoDataIncidenceSublimit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEODataIncidenceSublimit() {
		return eoDataIncidenceSublimit;
	}

	/**
	 * Sets the value of the eoDataIncidenceSublimit property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEODataIncidenceSublimit(String value) {
		this.eoDataIncidenceSublimit = value;
	}

	/**
	 * Gets the value of the eoDataIncidenceSublimitInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEODataIncidenceSublimitInd() {
		return eoDataIncidenceSublimitInd;
	}

	/**
	 * Sets the value of the eoDataIncidenceSublimitInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEODataIncidenceSublimitInd(String value) {
		this.eoDataIncidenceSublimitInd = value;
	}

	/**
	 * Gets the value of the eoEncryptionControlsFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOEncryptionControlsFct() {
		return eoEncryptionControlsFct;
	}

	/**
	 * Sets the value of the eoEncryptionControlsFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOEncryptionControlsFct(String value) {
		this.eoEncryptionControlsFct = value;
	}

	/**
	 * Gets the value of the eoEnterpriseControlsFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOEnterpriseControlsFct() {
		return eoEnterpriseControlsFct;
	}

	/**
	 * Sets the value of the eoEnterpriseControlsFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOEnterpriseControlsFct(String value) {
		this.eoEnterpriseControlsFct = value;
	}

	/**
	 * Gets the value of the eoExtortionFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOExtortionFct() {
		return eoExtortionFct;
	}

	/**
	 * Sets the value of the eoExtortionFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOExtortionFct(String value) {
		this.eoExtortionFct = value;
	}

	/**
	 * Gets the value of the eoFlexRatingFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOFlexRatingFct() {
		return eoFlexRatingFct;
	}

	/**
	 * Sets the value of the eoFlexRatingFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOFlexRatingFct(String value) {
		this.eoFlexRatingFct = value;
	}

	/**
	 * Gets the value of the eoHazardGroup property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOHazardGroup() {
		return eoHazardGroup;
	}

	/**
	 * Sets the value of the eoHazardGroup property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOHazardGroup(String value) {
		this.eoHazardGroup = value;
	}

	/**
	 * Gets the value of the eoMaximumScheduleRatingFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOMaximumScheduleRatingFct() {
		return eoMaximumScheduleRatingFct;
	}

	/**
	 * Sets the value of the eoMaximumScheduleRatingFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOMaximumScheduleRatingFct(String value) {
		this.eoMaximumScheduleRatingFct = value;
	}

	/**
	 * Gets the value of the eoMediaLiabilityFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOMediaLiabilityFct() {
		return eoMediaLiabilityFct;
	}

	/**
	 * Sets the value of the eoMediaLiabilityFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOMediaLiabilityFct(String value) {
		this.eoMediaLiabilityFct = value;
	}

	/**
	 * Gets the value of the eoMinimumScheduleRatingFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOMinimumScheduleRatingFct() {
		return eoMinimumScheduleRatingFct;
	}

	/**
	 * Sets the value of the eoMinimumScheduleRatingFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOMinimumScheduleRatingFct(String value) {
		this.eoMinimumScheduleRatingFct = value;
	}

	/**
	 * Gets the value of the eoNumberOfRecordsFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEONumberOfRecordsFct() {
		return eoNumberOfRecordsFct;
	}

	/**
	 * Sets the value of the eoNumberOfRecordsFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEONumberOfRecordsFct(String value) {
		this.eoNumberOfRecordsFct = value;
	}

	/**
	 * Gets the value of the eoOptionalCoveragesPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOOptionalCoveragesPremium() {
		return eoOptionalCoveragesPremium;
	}

	/**
	 * Sets the value of the eoOptionalCoveragesPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOOptionalCoveragesPremium(String value) {
		this.eoOptionalCoveragesPremium = value;
	}

	/**
	 * Gets the value of the eoPerClaimLimit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOPerClaimLimit() {
		return eoPerClaimLimit;
	}

	/**
	 * Sets the value of the eoPerClaimLimit property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOPerClaimLimit(String value) {
		this.eoPerClaimLimit = value;
	}

	/**
	 * Gets the value of the eoPerClaimRetention property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOPerClaimRetention() {
		return eoPerClaimRetention;
	}

	/**
	 * Sets the value of the eoPerClaimRetention property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOPerClaimRetention(String value) {
		this.eoPerClaimRetention = value;
	}

	/**
	 * Gets the value of the eoQualityOfManagementFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOQualityOfManagementFct() {
		return eoQualityOfManagementFct;
	}

	/**
	 * Sets the value of the eoQualityOfManagementFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOQualityOfManagementFct(String value) {
		this.eoQualityOfManagementFct = value;
	}

	/**
	 * Gets the value of the eoRegulatoryComplianceControlsFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEORegulatoryComplianceControlsFct() {
		return eoRegulatoryComplianceControlsFct;
	}

	/**
	 * Sets the value of the eoRegulatoryComplianceControlsFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEORegulatoryComplianceControlsFct(String value) {
		this.eoRegulatoryComplianceControlsFct = value;
	}

	/**
	 * Gets the value of the eoSecurityControlsFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOSecurityControlsFct() {
		return eoSecurityControlsFct;
	}

	/**
	 * Sets the value of the eoSecurityControlsFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOSecurityControlsFct(String value) {
		this.eoSecurityControlsFct = value;
	}

	/**
	 * Gets the value of the eoShareLiabilityDiscount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOShareLiabilityDiscount() {
		return eoShareLiabilityDiscount;
	}

	/**
	 * Sets the value of the eoShareLiabilityDiscount property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOShareLiabilityDiscount(String value) {
		this.eoShareLiabilityDiscount = value;
	}

	/**
	 * Gets the value of the eoSharedLiabilityLimitFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOSharedLiabilityLimitFct() {
		return eoSharedLiabilityLimitFct;
	}

	/**
	 * Sets the value of the eoSharedLiabilityLimitFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOSharedLiabilityLimitFct(String value) {
		this.eoSharedLiabilityLimitFct = value;
	}

	/**
	 * Gets the value of the eoThirdPartyServicesProviderControlsFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOThirdPartyServicesProviderControlsFct() {
		return eoThirdPartyServicesProviderControlsFct;
	}

	/**
	 * Sets the value of the eoThirdPartyServicesProviderControlsFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOThirdPartyServicesProviderControlsFct(String value) {
		this.eoThirdPartyServicesProviderControlsFct = value;
	}

	/**
	 * Gets the value of the eoTotalBasicPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOTotalBasicPremium() {
		return eoTotalBasicPremium;
	}

	/**
	 * Sets the value of the eoTotalBasicPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOTotalBasicPremium(String value) {
		this.eoTotalBasicPremium = value;
	}

	/**
	 * Gets the value of the eoTotalCappedRating property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOTotalCappedRating() {
		return eoTotalCappedRating;
	}

	/**
	 * Sets the value of the eoTotalCappedRating property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOTotalCappedRating(String value) {
		this.eoTotalCappedRating = value;
	}

	/**
	 * Gets the value of the eoTotalCumulativePremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOTotalCumulativePremium() {
		return eoTotalCumulativePremium;
	}

	/**
	 * Sets the value of the eoTotalCumulativePremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOTotalCumulativePremium(String value) {
		this.eoTotalCumulativePremium = value;
	}

	/**
	 * Gets the value of the eoTotalPremiumIncOptionalCoverages property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOTotalPremiumIncOptionalCoverages() {
		return eoTotalPremiumIncOptionalCoverages;
	}

	/**
	 * Sets the value of the eoTotalPremiumIncOptionalCoverages property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOTotalPremiumIncOptionalCoverages(String value) {
		this.eoTotalPremiumIncOptionalCoverages = value;
	}

	/**
	 * Gets the value of the eoTotalPremiumWithDiscount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOTotalPremiumWithDiscount() {
		return eoTotalPremiumWithDiscount;
	}

	/**
	 * Sets the value of the eoTotalPremiumWithDiscount property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOTotalPremiumWithDiscount(String value) {
		this.eoTotalPremiumWithDiscount = value;
	}

	/**
	 * Gets the value of the eoUnderwritingIntensityFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOUnderwritingIntensityFct() {
		return eoUnderwritingIntensityFct;
	}

	/**
	 * Sets the value of the eoUnderwritingIntensityFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOUnderwritingIntensityFct(String value) {
		this.eoUnderwritingIntensityFct = value;
	}

	/**
	 * Gets the value of the eobintAnnualPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOBINTAnnualPremium() {
		return eobintAnnualPremium;
	}

	/**
	 * Sets the value of the eobintAnnualPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOBINTAnnualPremium(String value) {
		this.eobintAnnualPremium = value;
	}

	/**
	 * Gets the value of the eocybeAnnualPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOCYBEAnnualPremium() {
		return eocybeAnnualPremium;
	}

	/**
	 * Sets the value of the eocybeAnnualPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOCYBEAnnualPremium(String value) {
		this.eocybeAnnualPremium = value;
	}

	/**
	 * Gets the value of the eodireAnnualPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEODIREAnnualPremium() {
		return eodireAnnualPremium;
	}

	/**
	 * Sets the value of the eodireAnnualPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEODIREAnnualPremium(String value) {
		this.eodireAnnualPremium = value;
	}

	/**
	 * Gets the value of the eodireBasicPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEODIREBasicPremium() {
		return eodireBasicPremium;
	}

	/**
	 * Sets the value of the eodireBasicPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEODIREBasicPremium(String value) {
		this.eodireBasicPremium = value;
	}

	/**
	 * Gets the value of the eomedlAnnualPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOMEDLAnnualPremium() {
		return eomedlAnnualPremium;
	}

	/**
	 * Sets the value of the eomedlAnnualPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOMEDLAnnualPremium(String value) {
		this.eomedlAnnualPremium = value;
	}

	/**
	 * Gets the value of the eonsplAnnualPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEONSPLAnnualPremium() {
		return eonsplAnnualPremium;
	}

	/**
	 * Sets the value of the eonsplAnnualPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEONSPLAnnualPremium(String value) {
		this.eonsplAnnualPremium = value;
	}

	/**
	 * Gets the value of the eonsplBasicPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEONSPLBasicPremium() {
		return eonsplBasicPremium;
	}

	/**
	 * Sets the value of the eonsplBasicPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEONSPLBasicPremium(String value) {
		this.eonsplBasicPremium = value;
	}

	/**
	 * Gets the value of the eoShortenedCovEffectiveDt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOShortenedCovEffectiveDt() {
		return eoShortenedCovEffectiveDt;
	}

	/**
	 * Sets the value of the eoShortenedCovEffectiveDt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOShortenedCovEffectiveDt(String value) {
		this.eoShortenedCovEffectiveDt = value;
	}

	/**
	 * Gets the value of the eoShortenedCovExpirationDt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOShortenedCovExpirationDt() {
		return eoShortenedCovExpirationDt;
	}

	/**
	 * Sets the value of the eoShortenedCovExpirationDt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOShortenedCovExpirationDt(String value) {
		this.eoShortenedCovExpirationDt = value;
	}

	/**
	 * Gets the value of the eoShortenedCovTransactionDt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEOShortenedCovTransactionDt() {
		return eoShortenedCovTransactionDt;
	}

	/**
	 * Sets the value of the eoShortenedCovTransactionDt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEOShortenedCovTransactionDt(String value) {
		this.eoShortenedCovTransactionDt = value;
	}

	/**
	 * Gets the value of the eplThirdPartyPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEPLThirdPartyPremium() {
		return eplThirdPartyPremium;
	}

	/**
	 * Sets the value of the eplThirdPartyPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEPLThirdPartyPremium(String value) {
		this.eplThirdPartyPremium = value;
	}

	/**
	 * Gets the value of the eplcaEmployeeFactorFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEPLCAEmployeeFactorFct() {
		return eplcaEmployeeFactorFct;
	}

	/**
	 * Sets the value of the eplcaEmployeeFactorFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEPLCAEmployeeFactorFct(String value) {
		this.eplcaEmployeeFactorFct = value;
	}

	/**
	 * Gets the value of the eplThirdPartyDeductibleFactor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEPLThirdPartyDeductibleFactor() {
		return eplThirdPartyDeductibleFactor;
	}

	/**
	 * Sets the value of the eplThirdPartyDeductibleFactor property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEPLThirdPartyDeductibleFactor(String value) {
		this.eplThirdPartyDeductibleFactor = value;
	}

	/**
	 * Gets the value of the eplThirdPartyIncreasedLimitFactorFct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEPLThirdPartyIncreasedLimitFactorFct() {
		return eplThirdPartyIncreasedLimitFactorFct;
	}

	/**
	 * Sets the value of the eplThirdPartyIncreasedLimitFactorFct property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEPLThirdPartyIncreasedLimitFactorFct(String value) {
		this.eplThirdPartyIncreasedLimitFactorFct = value;
	}

	/**
	 * Gets the value of the erpEOAnnualPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErpEOAnnualPremium() {
		return erpEOAnnualPremium;
	}

	/**
	 * Sets the value of the erpEOAnnualPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErpEOAnnualPremium(String value) {
		this.erpEOAnnualPremium = value;
	}

	/**
	 * Gets the value of the exposure property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExposure() {
		return exposure;
	}

	/**
	 * Sets the value of the exposure property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setExposure(String value) {
		this.exposure = value;
	}

	/**
	 * Gets the value of the facGrossReCededPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFacGrossReCededPremium() {
		return facGrossReCededPremium;
	}

	/**
	 * Sets the value of the facGrossReCededPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFacGrossReCededPremium(String value) {
		this.facGrossReCededPremium = value;
	}

	/**
	 * Gets the value of the facGrossReCededPremiumITD property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFacGrossReCededPremiumITD() {
		return facGrossReCededPremiumITD;
	}

	/**
	 * Sets the value of the facGrossReCededPremiumITD property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFacGrossReCededPremiumITD(String value) {
		this.facGrossReCededPremiumITD = value;
	}

	/**
	 * Gets the value of the facGrossReCededPremiumOutput property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFacGrossReCededPremiumOutput() {
		return facGrossReCededPremiumOutput;
	}

	/**
	 * Sets the value of the facGrossReCededPremiumOutput property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFacGrossReCededPremiumOutput(String value) {
		this.facGrossReCededPremiumOutput = value;
	}

	/**
	 * Gets the value of the facNetReCededPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFacNetReCededPremium() {
		return facNetReCededPremium;
	}

	/**
	 * Sets the value of the facNetReCededPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFacNetReCededPremium(String value) {
		this.facNetReCededPremium = value;
	}

	/**
	 * Gets the value of the facNetReCededPremiumITD property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFacNetReCededPremiumITD() {
		return facNetReCededPremiumITD;
	}

	/**
	 * Sets the value of the facNetReCededPremiumITD property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFacNetReCededPremiumITD(String value) {
		this.facNetReCededPremiumITD = value;
	}

	/**
	 * Gets the value of the facReinsurerParticipationLimit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFacReinsurerParticipationLimit() {
		return facReinsurerParticipationLimit;
	}

	/**
	 * Sets the value of the facReinsurerParticipationLimit property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFacReinsurerParticipationLimit(String value) {
		this.facReinsurerParticipationLimit = value;
	}

	/**
	 * Gets the value of the factor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFactor() {
		return factor;
	}

	/**
	 * Sets the value of the factor property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFactor(String value) {
		this.factor = value;
	}

	/**
	 * Gets the value of the fundTransferBasicPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFundTransferBasicPremium() {
		return fundTransferBasicPremium;
	}

	/**
	 * Sets the value of the fundTransferBasicPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFundTransferBasicPremium(String value) {
		this.fundTransferBasicPremium = value;
	}

	/**
	 * Gets the value of the ilfDedFactor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getILFDedFactor() {
		return ilfDedFactor;
	}

	/**
	 * Sets the value of the ilfDedFactor property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setILFDedFactor(String value) {
		this.ilfDedFactor = value;
	}

	/**
	 * Gets the value of the itemid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getITEMID() {
		return itemid;
	}

	/**
	 * Sets the value of the itemid property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setITEMID(String value) {
		this.itemid = value;
	}

	/**
	 * Gets the value of the krAnnualPremiumHolder property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getKRAnnualPremiumHolder() {
		return krAnnualPremiumHolder;
	}

	/**
	 * Sets the value of the krAnnualPremiumHolder property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setKRAnnualPremiumHolder(String value) {
		this.krAnnualPremiumHolder = value;
	}

	/**
	 * Gets the value of the krbeMinPremAmt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getKRBEMinPremAmt() {
		return krbeMinPremAmt;
	}

	/**
	 * Sets the value of the krbeMinPremAmt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setKRBEMinPremAmt(String value) {
		this.krbeMinPremAmt = value;
	}

	/**
	 * Gets the value of the limitAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLimitAmount() {
		return limitAmount;
	}

	/**
	 * Sets the value of the limitAmount property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLimitAmount(String value) {
		this.limitAmount = value;
	}

	/**
	 * Gets the value of the lobid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLOBID() {
		return lobid;
	}

	/**
	 * Sets the value of the lobid property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLOBID(String value) {
		this.lobid = value;
	}

	/**
	 * Gets the value of the minimumAdjustment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMinimumAdjustment() {
		return minimumAdjustment;
	}

	/**
	 * Sets the value of the minimumAdjustment property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setMinimumAdjustment(String value) {
		this.minimumAdjustment = value;
	}

	/**
	 * Gets the value of the parentOccurrenceID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParentOccurrenceID() {
		return parentOccurrenceID;
	}

	/**
	 * Sets the value of the parentOccurrenceID property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setParentOccurrenceID(String value) {
		this.parentOccurrenceID = value;
	}

	/**
	 * Gets the value of the prevAPRPPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevAPRPPremium() {
		return prevAPRPPremium;
	}

	/**
	 * Sets the value of the prevAPRPPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevAPRPPremium(String value) {
		this.prevAPRPPremium = value;
	}

	/**
	 * Gets the value of the prevCededPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevCededPremium() {
		return prevCededPremium;
	}

	/**
	 * Sets the value of the prevCededPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevCededPremium(String value) {
		this.prevCededPremium = value;
	}

	/**
	 * Gets the value of the prevCededPremiumITD property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevCededPremiumITD() {
		return prevCededPremiumITD;
	}

	/**
	 * Sets the value of the prevCededPremiumITD property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevCededPremiumITD(String value) {
		this.prevCededPremiumITD = value;
	}

	/**
	 * Gets the value of the prevCoverageCededPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevCoverageCededPremium() {
		return prevCoverageCededPremium;
	}

	/**
	 * Sets the value of the prevCoverageCededPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevCoverageCededPremium(String value) {
		this.prevCoverageCededPremium = value;
	}

	/**
	 * Gets the value of the prevCoverageCededPremiumITD property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevCoverageCededPremiumITD() {
		return prevCoverageCededPremiumITD;
	}

	/**
	 * Sets the value of the prevCoverageCededPremiumITD property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevCoverageCededPremiumITD(String value) {
		this.prevCoverageCededPremiumITD = value;
	}

	/**
	 * Gets the value of the prevFacGrossReCededPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevFacGrossReCededPremium() {
		return prevFacGrossReCededPremium;
	}

	/**
	 * Sets the value of the prevFacGrossReCededPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevFacGrossReCededPremium(String value) {
		this.prevFacGrossReCededPremium = value;
	}

	/**
	 * Gets the value of the prevFacGrossReCededPremiumITD property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevFacGrossReCededPremiumITD() {
		return prevFacGrossReCededPremiumITD;
	}

	/**
	 * Sets the value of the prevFacGrossReCededPremiumITD property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevFacGrossReCededPremiumITD(String value) {
		this.prevFacGrossReCededPremiumITD = value;
	}

	/**
	 * Gets the value of the prevFacNetReCededPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevFacNetReCededPremium() {
		return prevFacNetReCededPremium;
	}

	/**
	 * Sets the value of the prevFacNetReCededPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevFacNetReCededPremium(String value) {
		this.prevFacNetReCededPremium = value;
	}

	/**
	 * Gets the value of the prevFacNetReCededPremiumITD property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrevFacNetReCededPremiumITD() {
		return prevFacNetReCededPremiumITD;
	}

	/**
	 * Sets the value of the prevFacNetReCededPremiumITD property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPrevFacNetReCededPremiumITD(String value) {
		this.prevFacNetReCededPremiumITD = value;
	}

	/**
	 * Gets the value of the proratedPrevAnnualAdjusted property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProratedPrevAnnualAdjusted() {
		return proratedPrevAnnualAdjusted;
	}

	/**
	 * Sets the value of the proratedPrevAnnualAdjusted property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setProratedPrevAnnualAdjusted(String value) {
		this.proratedPrevAnnualAdjusted = value;
	}

	/**
	 * Gets the value of the proratedTermPremOverride property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProratedTermPremOverride() {
		return proratedTermPremOverride;
	}

	/**
	 * Sets the value of the proratedTermPremOverride property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setProratedTermPremOverride(String value) {
		this.proratedTermPremOverride = value;
	}

	/**
	 * Gets the value of the suggestedModifierFactor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSuggestedModifierFactor() {
		return suggestedModifierFactor;
	}

	/**
	 * Sets the value of the suggestedModifierFactor property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSuggestedModifierFactor(String value) {
		this.suggestedModifierFactor = value;
	}

	/**
	 * Gets the value of the systemCalculatedPremium property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSystemCalculatedPremium() {
		return systemCalculatedPremium;
	}

	/**
	 * Sets the value of the systemCalculatedPremium property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSystemCalculatedPremium(String value) {
		this.systemCalculatedPremium = value;
	}

	/**
	 * Gets the value of the totalModFactor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTotalModFactor() {
		return totalModFactor;
	}

	/**
	 * Sets the value of the totalModFactor property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTotalModFactor(String value) {
		this.totalModFactor = value;
	}

	/**
	 * Gets the value of the totalModifierFactorHolder property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTotalModifierFactorHolder() {
		return totalModifierFactorHolder;
	}

	/**
	 * Sets the value of the totalModifierFactorHolder property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTotalModifierFactorHolder(String value) {
		this.totalModifierFactorHolder = value;
	}

	/**
	 * Gets the value of the totalScheduleRating property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTotalScheduleRating() {
		return totalScheduleRating;
	}

	/**
	 * Sets the value of the totalScheduleRating property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTotalScheduleRating(String value) {
		this.totalScheduleRating = value;
	}

	public String getCoverage_Ceded_Premium() {
		return coverage_Ceded_Premium;
	}

	public void setCoverage_Ceded_Premium(String coverage_Ceded_Premium) {
		this.coverage_Ceded_Premium = coverage_Ceded_Premium;
	}

	public String getCoverage_Ceded_Premium_ITD() {
		return coverage_Ceded_Premium_ITD;
	}

	public void setCoverage_Ceded_Premium_ITD(String coverage_Ceded_Premium_ITD) {
		this.coverage_Ceded_Premium_ITD = coverage_Ceded_Premium_ITD;
	}

	public String getCoverageCededPremium() {
		return coverageCededPremium;
	}

	public void setCoverageCededPremium(String coverageCededPremium) {
		this.coverageCededPremium = coverageCededPremium;
	}

	public String getCoverageCededPremiumITD() {
		return coverageCededPremiumITD;
	}

	public void setCoverageCededPremiumITD(String coverageCededPremiumITD) {
		this.coverageCededPremiumITD = coverageCededPremiumITD;
	}

	/**
	 * Gets the value of the extAction property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExtAction() {
		return extAction;
	}

	/**
	 * Sets the value of the extAction property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setExtAction(String value) {
		this.extAction = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getID() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setID(String value) {
		this.id = value;
	}

}
