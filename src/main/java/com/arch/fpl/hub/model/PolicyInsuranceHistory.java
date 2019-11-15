package com.arch.fpl.hub.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "curHaveInsurYN_8002", "actCovDirOff_8004", "actCovEPL_8005", "actCovFID_8006", "actCovCRM_8007",
		"actCovGLP_8008", "dirOffExpLim_8010", "dirOffExpRet_8011", "dirOffNmOfCarrier_8012", "dirOffExpPrem_8013",
		"dirOffPrPendLitDt_8014", "eplExpLim_8016", "eplExpRet_8017", "eplNmOfCarrier_8018", "eplExpPrem_8019",
		"eplPrPendLitDt_8020", "fidExpLim_8022", "fidExpRet_8023", "fidNmOfCarrier_8024", "fidExpPrem_8025",
		"fidPrPendLitDt_8026", "crmOffExpLim_8028", "crmOffExpRet_8029", "crmNmOfCarrier_8030", "crmExpPrem_8031",
		"propLiabCovPartsYN_8033", "expPropLiabCovPart_8034", "invEEOCPst3YrYN_8035", "expInvEEOCPst3YrYN_8036",
		"clmDur5YrYN_8037", "typOfClm_8038", "dtOfLoss_8043", "desOfLoss_8044", "amtLossPaid_8045",
		"invEmpRelCvlSut3YrYN_8048", "invCvlRghtViol3YrYN_8049", "prtClmReg3YrYN_8050", "clmPast5Yr_8051",
		"clmAnyApp_8052", "clmBenPgm_8053", "clmEmpBenPgm_8054", "clmNoneOfAbv_8055" })
public class PolicyInsuranceHistory {

	@JsonProperty("curHaveInsurYN_8002")
	private String curHaveInsurYN_8002;
	@JsonProperty("actCovDirOff_8004")
	private Boolean actCovDirOff_8004;
	@JsonProperty("actCovEPL_8005")
	private Boolean actCovEPL_8005;
	@JsonProperty("actCovFID_8006")
	private Boolean actCovFID_8006;
	@JsonProperty("actCovCRM_8007")
	private Boolean actCovCRM_8007;
	@JsonProperty("actCovGLP_8008")
	private Boolean actCovGLP_8008;
	@JsonProperty("dirOffExpLim_8010")
	private Integer dirOffExpLim_8010;
	@JsonProperty("dirOffExpRet_8011")
	private Integer dirOffExpRet_8011;
	@JsonProperty("dirOffNmOfCarrier_8012")
	private String dirOffNmOfCarrier_8012;
	@JsonProperty("dirOffExpPrem_8013")
	private Double dirOffExpPrem_8013;
	@JsonProperty("dirOffPrPendLitDt_8014")
	private String dirOffPrPendLitDt_8014;
	@JsonProperty("eplExpLim_8016")
	private Integer eplExpLim_8016;
	@JsonProperty("eplExpRet_8017")
	private Integer eplExpRet_8017;
	@JsonProperty("eplNmOfCarrier_8018")
	private String eplNmOfCarrier_8018;
	@JsonProperty("eplExpPrem_8019")
	private Double eplExpPrem_8019;
	@JsonProperty("eplPrPendLitDt_8020")
	private String eplPrPendLitDt_8020;
	@JsonProperty("fidExpLim_8022")
	private Integer fidExpLim_8022;
	@JsonProperty("fidExpRet_8023")
	private Integer fidExpRet_8023;
	@JsonProperty("fidNmOfCarrier_8024")
	private String fidNmOfCarrier_8024;
	@JsonProperty("fidExpPrem_8025")
	private Double fidExpPrem_8025;
	@JsonProperty("fidPrPendLitDt_8026")
	private String fidPrPendLitDt_8026;
	@JsonProperty("crmOffExpLim_8028")
	private Integer crmOffExpLim_8028;
	@JsonProperty("crmOffExpRet_8029")
	private Integer crmOffExpRet_8029;
	@JsonProperty("crmNmOfCarrier_8030")
	private String crmNmOfCarrier_8030;
	@JsonProperty("crmExpPrem_8031")
	private Double crmExpPrem_8031;
	@JsonProperty("propLiabCovPartsYN_8033")
	private String propLiabCovPartsYN_8033;
	@JsonProperty("expPropLiabCovPart_8034")
	private String expPropLiabCovPart_8034;
	@JsonProperty("invEEOCPst3YrYN_8035")
	private String invEEOCPst3YrYN_8035;
	@JsonProperty("expInvEEOCPst3YrYN_8036")
	private String expInvEEOCPst3YrYN_8036;
	@JsonProperty("clmDur5YrYN_8037")
	private String clmDur5YrYN_8037;
	@JsonProperty("typOfClm_8038")
	private String typOfClm_8038;
	@JsonProperty("dtOfLoss_8043")
	private String dtOfLoss_8043;
	@JsonProperty("desOfLoss_8044")
	private String desOfLoss_8044;
	@JsonProperty("amtLossPaid_8045")
	private Integer amtLossPaid_8045;
	@JsonProperty("invEmpRelCvlSut3YrYN_8048")
	private String invEmpRelCvlSut3YrYN_8048;
	@JsonProperty("invCvlRghtViol3YrYN_8049")
	private String invCvlRghtViol3YrYN_8049;
	@JsonProperty("prtClmReg3YrYN_8050")
	private String prtClmReg3YrYN_8050;
	@JsonProperty("clmPast5Yr_8051")
	private Boolean clmPast5Yr_8051;
	@JsonProperty("clmAnyApp_8052")
	private Boolean clmAnyApp_8052;
	@JsonProperty("clmBenPgm_8053")
	private Boolean clmBenPgm_8053;
	@JsonProperty("clmEmpBenPgm_8054")
	private Boolean clmEmpBenPgm_8054;
	@JsonProperty("clmNoneOfAbv_8055")
	private Boolean clmNoneOfAbv_8055;

	@JsonProperty("curHaveInsurYN_8002")
	public String getCurHaveInsurYN_8002() {
		return curHaveInsurYN_8002;
	}

	@JsonProperty("curHaveInsurYN_8002")
	public void setCurHaveInsurYN_8002(String curHaveInsurYN_8002) {
		this.curHaveInsurYN_8002 = curHaveInsurYN_8002;
	}

	@JsonProperty("actCovDirOff_8004")
	public Boolean getActCovDirOff_8004() {
		return actCovDirOff_8004;
	}

	@JsonProperty("actCovDirOff_8004")
	public void setActCovDirOff_8004(Boolean actCovDirOff_8004) {
		this.actCovDirOff_8004 = actCovDirOff_8004;
	}

	@JsonProperty("actCovEPL_8005")
	public Boolean getActCovEPL_8005() {
		return actCovEPL_8005;
	}

	@JsonProperty("actCovEPL_8005")
	public void setActCovEPL_8005(Boolean actCovEPL_8005) {
		this.actCovEPL_8005 = actCovEPL_8005;
	}

	@JsonProperty("actCovFID_8006")
	public Boolean getActCovFID_8006() {
		return actCovFID_8006;
	}

	@JsonProperty("actCovFID_8006")
	public void setActCovFID_8006(Boolean actCovFID_8006) {
		this.actCovFID_8006 = actCovFID_8006;
	}

	@JsonProperty("actCovCRM_8007")
	public Boolean getActCovCRM_8007() {
		return actCovCRM_8007;
	}

	@JsonProperty("actCovCRM_8007")
	public void setActCovCRM_8007(Boolean actCovCRM_8007) {
		this.actCovCRM_8007 = actCovCRM_8007;
	}

	@JsonProperty("actCovGLP_8008")
	public Boolean getActCovGLP_8008() {
		return actCovGLP_8008;
	}

	@JsonProperty("actCovGLP_8008")
	public void setActCovGLP_8008(Boolean actCovGLP_8008) {
		this.actCovGLP_8008 = actCovGLP_8008;
	}

	@JsonProperty("dirOffExpLim_8010")
	public Integer getDirOffExpLim_8010() {
		return dirOffExpLim_8010;
	}

	@JsonProperty("dirOffExpLim_8010")
	public void setDirOffExpLim_8010(Integer dirOffExpLim_8010) {
		this.dirOffExpLim_8010 = dirOffExpLim_8010;
	}

	@JsonProperty("dirOffExpRet_8011")
	public Integer getDirOffExpRet_8011() {
		return dirOffExpRet_8011;
	}

	@JsonProperty("dirOffExpRet_8011")
	public void setDirOffExpRet_8011(Integer dirOffExpRet_8011) {
		this.dirOffExpRet_8011 = dirOffExpRet_8011;
	}

	@JsonProperty("dirOffNmOfCarrier_8012")
	public String getDirOffNmOfCarrier_8012() {
		return dirOffNmOfCarrier_8012;
	}

	@JsonProperty("dirOffNmOfCarrier_8012")
	public void setDirOffNmOfCarrier_8012(String dirOffNmOfCarrier_8012) {
		this.dirOffNmOfCarrier_8012 = dirOffNmOfCarrier_8012;
	}

	@JsonProperty("dirOffExpPrem_8013")
	public Double getDirOffExpPrem_8013() {
		return dirOffExpPrem_8013;
	}

	@JsonProperty("dirOffExpPrem_8013")
	public void setDirOffExpPrem_8013(Double dirOffExpPrem_8013) {
		this.dirOffExpPrem_8013 = dirOffExpPrem_8013;
	}

	@JsonProperty("dirOffPrPendLitDt_8014")
	public String getDirOffPrPendLitDt_8014() {
		return dirOffPrPendLitDt_8014;
	}

	@JsonProperty("dirOffPrPendLitDt_8014")
	public void setDirOffPrPendLitDt_8014(String dirOffPrPendLitDt_8014) {
		this.dirOffPrPendLitDt_8014 = dirOffPrPendLitDt_8014;
	}

	@JsonProperty("eplExpLim_8016")
	public Integer getEplExpLim_8016() {
		return eplExpLim_8016;
	}

	@JsonProperty("eplExpLim_8016")
	public void setEplExpLim_8016(Integer eplExpLim_8016) {
		this.eplExpLim_8016 = eplExpLim_8016;
	}

	@JsonProperty("eplExpRet_8017")
	public Integer getEplExpRet_8017() {
		return eplExpRet_8017;
	}

	@JsonProperty("eplExpRet_8017")
	public void setEplExpRet_8017(Integer eplExpRet_8017) {
		this.eplExpRet_8017 = eplExpRet_8017;
	}

	@JsonProperty("eplNmOfCarrier_8018")
	public String getEplNmOfCarrier_8018() {
		return eplNmOfCarrier_8018;
	}

	@JsonProperty("eplNmOfCarrier_8018")
	public void setEplNmOfCarrier_8018(String eplNmOfCarrier_8018) {
		this.eplNmOfCarrier_8018 = eplNmOfCarrier_8018;
	}

	@JsonProperty("eplExpPrem_8019")
	public Double getEplExpPrem_8019() {
		return eplExpPrem_8019;
	}

	@JsonProperty("eplExpPrem_8019")
	public void setEplExpPrem_8019(Double eplExpPrem_8019) {
		this.eplExpPrem_8019 = eplExpPrem_8019;
	}

	@JsonProperty("eplPrPendLitDt_8020")
	public String getEplPrPendLitDt_8020() {
		return eplPrPendLitDt_8020;
	}

	@JsonProperty("eplPrPendLitDt_8020")
	public void setEplPrPendLitDt_8020(String eplPrPendLitDt_8020) {
		this.eplPrPendLitDt_8020 = eplPrPendLitDt_8020;
	}

	@JsonProperty("fidExpLim_8022")
	public Integer getFidExpLim_8022() {
		return fidExpLim_8022;
	}

	@JsonProperty("fidExpLim_8022")
	public void setFidExpLim_8022(Integer fidExpLim_8022) {
		this.fidExpLim_8022 = fidExpLim_8022;
	}

	@JsonProperty("fidExpRet_8023")
	public Integer getFidExpRet_8023() {
		return fidExpRet_8023;
	}

	@JsonProperty("fidExpRet_8023")
	public void setFidExpRet_8023(Integer fidExpRet_8023) {
		this.fidExpRet_8023 = fidExpRet_8023;
	}

	@JsonProperty("fidNmOfCarrier_8024")
	public String getFidNmOfCarrier_8024() {
		return fidNmOfCarrier_8024;
	}

	@JsonProperty("fidNmOfCarrier_8024")
	public void setFidNmOfCarrier_8024(String fidNmOfCarrier_8024) {
		this.fidNmOfCarrier_8024 = fidNmOfCarrier_8024;
	}

	@JsonProperty("fidExpPrem_8025")
	public Double getFidExpPrem_8025() {
		return fidExpPrem_8025;
	}

	@JsonProperty("fidExpPrem_8025")
	public void setFidExpPrem_8025(Double fidExpPrem_8025) {
		this.fidExpPrem_8025 = fidExpPrem_8025;
	}

	@JsonProperty("fidPrPendLitDt_8026")
	public String getFidPrPendLitDt_8026() {
		return fidPrPendLitDt_8026;
	}

	@JsonProperty("fidPrPendLitDt_8026")
	public void setFidPrPendLitDt_8026(String fidPrPendLitDt_8026) {
		this.fidPrPendLitDt_8026 = fidPrPendLitDt_8026;
	}

	@JsonProperty("crmOffExpLim_8028")
	public Integer getCrmOffExpLim_8028() {
		return crmOffExpLim_8028;
	}

	@JsonProperty("crmOffExpLim_8028")
	public void setCrmOffExpLim_8028(Integer crmOffExpLim_8028) {
		this.crmOffExpLim_8028 = crmOffExpLim_8028;
	}

	@JsonProperty("crmOffExpRet_8029")
	public Integer getCrmOffExpRet_8029() {
		return crmOffExpRet_8029;
	}

	@JsonProperty("crmOffExpRet_8029")
	public void setCrmOffExpRet_8029(Integer crmOffExpRet_8029) {
		this.crmOffExpRet_8029 = crmOffExpRet_8029;
	}

	@JsonProperty("crmNmOfCarrier_8030")
	public String getCrmNmOfCarrier_8030() {
		return crmNmOfCarrier_8030;
	}

	@JsonProperty("crmNmOfCarrier_8030")
	public void setCrmNmOfCarrier_8030(String crmNmOfCarrier_8030) {
		this.crmNmOfCarrier_8030 = crmNmOfCarrier_8030;
	}

	@JsonProperty("crmExpPrem_8031")
	public Double getCrmExpPrem_8031() {
		return crmExpPrem_8031;
	}

	@JsonProperty("crmExpPrem_8031")
	public void setCrmExpPrem_8031(Double crmExpPrem_8031) {
		this.crmExpPrem_8031 = crmExpPrem_8031;
	}

	@JsonProperty("propLiabCovPartsYN_8033")
	public String getPropLiabCovPartsYN_8033() {
		return propLiabCovPartsYN_8033;
	}

	@JsonProperty("propLiabCovPartsYN_8033")
	public void setPropLiabCovPartsYN_8033(String propLiabCovPartsYN_8033) {
		this.propLiabCovPartsYN_8033 = propLiabCovPartsYN_8033;
	}

	@JsonProperty("expPropLiabCovPart_8034")
	public String getExpPropLiabCovPart_8034() {
		return expPropLiabCovPart_8034;
	}

	@JsonProperty("expPropLiabCovPart_8034")
	public void setExpPropLiabCovPart_8034(String expPropLiabCovPart_8034) {
		this.expPropLiabCovPart_8034 = expPropLiabCovPart_8034;
	}

	@JsonProperty("invEEOCPst3YrYN_8035")
	public String getInvEEOCPst3YrYN_8035() {
		return invEEOCPst3YrYN_8035;
	}

	@JsonProperty("invEEOCPst3YrYN_8035")
	public void setInvEEOCPst3YrYN_8035(String invEEOCPst3YrYN_8035) {
		this.invEEOCPst3YrYN_8035 = invEEOCPst3YrYN_8035;
	}

	@JsonProperty("expInvEEOCPst3YrYN_8036")
	public String getExpInvEEOCPst3YrYN_8036() {
		return expInvEEOCPst3YrYN_8036;
	}

	@JsonProperty("expInvEEOCPst3YrYN_8036")
	public void setExpInvEEOCPst3YrYN_8036(String expInvEEOCPst3YrYN_8036) {
		this.expInvEEOCPst3YrYN_8036 = expInvEEOCPst3YrYN_8036;
	}

	@JsonProperty("clmDur5YrYN_8037")
	public String getClmDur5YrYN_8037() {
		return clmDur5YrYN_8037;
	}

	@JsonProperty("clmDur5YrYN_8037")
	public void setClmDur5YrYN_8037(String clmDur5YrYN_8037) {
		this.clmDur5YrYN_8037 = clmDur5YrYN_8037;
	}

	@JsonProperty("typOfClm_8038")
	public String getTypOfClm_8038() {
		return typOfClm_8038;
	}

	@JsonProperty("typOfClm_8038")
	public void setTypOfClm_8038(String typOfClm_8038) {
		this.typOfClm_8038 = typOfClm_8038;
	}

	@JsonProperty("dtOfLoss_8043")
	public String getDtOfLoss_8043() {
		return dtOfLoss_8043;
	}

	@JsonProperty("dtOfLoss_8043")
	public void setDtOfLoss_8043(String dtOfLoss_8043) {
		this.dtOfLoss_8043 = dtOfLoss_8043;
	}

	@JsonProperty("desOfLoss_8044")
	public String getDesOfLoss_8044() {
		return desOfLoss_8044;
	}

	@JsonProperty("desOfLoss_8044")
	public void setDesOfLoss_8044(String desOfLoss_8044) {
		this.desOfLoss_8044 = desOfLoss_8044;
	}

	@JsonProperty("amtLossPaid_8045")
	public Integer getAmtLossPaid_8045() {
		return amtLossPaid_8045;
	}

	@JsonProperty("amtLossPaid_8045")
	public void setAmtLossPaid_8045(Integer amtLossPaid_8045) {
		this.amtLossPaid_8045 = amtLossPaid_8045;
	}

	@JsonProperty("invEmpRelCvlSut3YrYN_8048")
	public String getInvEmpRelCvlSut3YrYN_8048() {
		return invEmpRelCvlSut3YrYN_8048;
	}

	@JsonProperty("invEmpRelCvlSut3YrYN_8048")
	public void setInvEmpRelCvlSut3YrYN_8048(String invEmpRelCvlSut3YrYN_8048) {
		this.invEmpRelCvlSut3YrYN_8048 = invEmpRelCvlSut3YrYN_8048;
	}

	@JsonProperty("invCvlRghtViol3YrYN_8049")
	public String getInvCvlRghtViol3YrYN_8049() {
		return invCvlRghtViol3YrYN_8049;
	}

	@JsonProperty("invCvlRghtViol3YrYN_8049")
	public void setInvCvlRghtViol3YrYN_8049(String invCvlRghtViol3YrYN_8049) {
		this.invCvlRghtViol3YrYN_8049 = invCvlRghtViol3YrYN_8049;
	}

	@JsonProperty("prtClmReg3YrYN_8050")
	public String getPrtClmReg3YrYN_8050() {
		return prtClmReg3YrYN_8050;
	}

	@JsonProperty("prtClmReg3YrYN_8050")
	public void setPrtClmReg3YrYN_8050(String prtClmReg3YrYN_8050) {
		this.prtClmReg3YrYN_8050 = prtClmReg3YrYN_8050;
	}

	@JsonProperty("clmPast5Yr_8051")
	public Boolean getClmPast5Yr_8051() {
		return clmPast5Yr_8051;
	}

	@JsonProperty("clmPast5Yr_8051")
	public void setClmPast5Yr_8051(Boolean clmPast5Yr_8051) {
		this.clmPast5Yr_8051 = clmPast5Yr_8051;
	}

	@JsonProperty("clmAnyApp_8052")
	public Boolean getClmAnyApp_8052() {
		return clmAnyApp_8052;
	}

	@JsonProperty("clmAnyApp_8052")
	public void setClmAnyApp_8052(Boolean clmAnyApp_8052) {
		this.clmAnyApp_8052 = clmAnyApp_8052;
	}

	@JsonProperty("clmBenPgm_8053")
	public Boolean getClmBenPgm_8053() {
		return clmBenPgm_8053;
	}

	@JsonProperty("clmBenPgm_8053")
	public void setClmBenPgm_8053(Boolean clmBenPgm_8053) {
		this.clmBenPgm_8053 = clmBenPgm_8053;
	}

	@JsonProperty("clmEmpBenPgm_8054")
	public Boolean getClmEmpBenPgm_8054() {
		return clmEmpBenPgm_8054;
	}

	@JsonProperty("clmEmpBenPgm_8054")
	public void setClmEmpBenPgm_8054(Boolean clmEmpBenPgm_8054) {
		this.clmEmpBenPgm_8054 = clmEmpBenPgm_8054;
	}

	@JsonProperty("clmNoneOfAbv_8055")
	public Boolean getClmNoneOfAbv_8055() {
		return clmNoneOfAbv_8055;
	}

	@JsonProperty("clmNoneOfAbv_8055")
	public void setClmNoneOfAbv_8055(Boolean clmNoneOfAbv_8055) {
		this.clmNoneOfAbv_8055 = clmNoneOfAbv_8055;
	}

}