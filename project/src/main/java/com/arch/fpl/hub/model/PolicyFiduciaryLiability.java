package com.arch.fpl.hub.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "fidLiabLmtAmt_11002", "retLmtAmt_11011", "plnAsstCy_11025", "typPlan_11026", "numPartcp_11032",
		"curPctUndPenPrtAct_11033", "atRisk_11034", "hndlInvDecInHseYN_11037", "expCompInvDes_11038",
		"plnERISAYN_11039", "expERISA_11040", "nxt12MntCshBalYN_11041", "tranDate_11042", "stsAsstDist_11043",
		"redBenYN_11044", "commSntPlnPartYN_11045", "nmInsCarrier_11046", "sbjInstReg3YRYN_11047",
		"pst3YRMrgTmFrzPlnYN_11048", "tranDate_11049", "stsAsstDist_11050", "areSimBenOffYN_11051",
		"nmInsCarrier_11052", "fidGulBrchTrstYN_11053", "expFidGulBrchTrst_11054", "fidConvCrmCondYN_11055",
		"expConvCrmCond_11056", "antFeeGovAuthYN_11057", "expAntFeeGovAuth_11058", "plnNm_11024" })
public class PolicyFiduciaryLiability {

	@JsonProperty("fidLiabLmtAmt_11002")
	private Integer fidLiabLmtAmt_11002;
	@JsonProperty("retLmtAmt_11011")
	private Integer retLmtAmt_11011;
	@JsonProperty("plnAsstCy_11025")
	private Double plnAsstCy_11025;
	@JsonProperty("typPlan_11026")
	private String typPlan_11026;
	@JsonProperty("numPartcp_11032")
	private Integer numPartcp_11032;
	@JsonProperty("curPctUndPenPrtAct_11033")
	private Double curPctUndPenPrtAct_11033;
	@JsonProperty("atRisk_11034")
	private Boolean atRisk_11034;
	@JsonProperty("hndlInvDecInHseYN_11037")
	private String hndlInvDecInHseYN_11037;
	@JsonProperty("expCompInvDes_11038")
	private String expCompInvDes_11038;
	@JsonProperty("plnERISAYN_11039")
	private String plnERISAYN_11039;
	@JsonProperty("expERISA_11040")
	private String expERISA_11040;
	@JsonProperty("nxt12MntCshBalYN_11041")
	private String nxt12MntCshBalYN_11041;
	@JsonProperty("tranDate_11042")
	private String tranDate_11042;
	@JsonProperty("stsAsstDist_11043")
	private String stsAsstDist_11043;
	@JsonProperty("redBenYN_11044")
	private String redBenYN_11044;
	@JsonProperty("commSntPlnPartYN_11045")
	private String commSntPlnPartYN_11045;
	@JsonProperty("nmInsCarrier_11046")
	private String nmInsCarrier_11046;
	@JsonProperty("sbjInstReg3YRYN_11047")
	private String sbjInstReg3YRYN_11047;
	@JsonProperty("pst3YRMrgTmFrzPlnYN_11048")
	private String pst3YRMrgTmFrzPlnYN_11048;
	@JsonProperty("tranDate_11049")
	private String tranDate_11049;
	@JsonProperty("stsAsstDist_11050")
	private String stsAsstDist_11050;
	@JsonProperty("areSimBenOffYN_11051")
	private String areSimBenOffYN_11051;
	@JsonProperty("nmInsCarrier_11052")
	private String nmInsCarrier_11052;
	@JsonProperty("fidGulBrchTrstYN_11053")
	private String fidGulBrchTrstYN_11053;
	@JsonProperty("expFidGulBrchTrst_11054")
	private String expFidGulBrchTrst_11054;
	@JsonProperty("fidConvCrmCondYN_11055")
	private String fidConvCrmCondYN_11055;
	@JsonProperty("expConvCrmCond_11056")
	private String expConvCrmCond_11056;
	@JsonProperty("antFeeGovAuthYN_11057")
	private String antFeeGovAuthYN_11057;
	@JsonProperty("expAntFeeGovAuth_11058")
	private String expAntFeeGovAuth_11058;
	@JsonProperty("plnNm_11024")
	private String plnNm_11024;

	@JsonProperty("fidLiabLmtAmt_11002")
	public Integer getFidLiabLmtAmt_11002() {
		return fidLiabLmtAmt_11002;
	}

	@JsonProperty("fidLiabLmtAmt_11002")
	public void setFidLiabLmtAmt_11002(Integer fidLiabLmtAmt_11002) {
		this.fidLiabLmtAmt_11002 = fidLiabLmtAmt_11002;
	}

	@JsonProperty("retLmtAmt_11011")
	public Integer getRetLmtAmt_11011() {
		return retLmtAmt_11011;
	}

	@JsonProperty("retLmtAmt_11011")
	public void setRetLmtAmt_11011(Integer retLmtAmt_11011) {
		this.retLmtAmt_11011 = retLmtAmt_11011;
	}

	@JsonProperty("plnAsstCy_11025")
	public Double getPlnAsstCy_11025() {
		return plnAsstCy_11025;
	}

	@JsonProperty("plnAsstCy_11025")
	public void setPlnAsstCy_11025(Double plnAsstCy_11025) {
		this.plnAsstCy_11025 = plnAsstCy_11025;
	}

	@JsonProperty("typPlan_11026")
	public String getTypPlan_11026() {
		return typPlan_11026;
	}

	@JsonProperty("typPlan_11026")
	public void setTypPlan_11026(String typPlan_11026) {
		this.typPlan_11026 = typPlan_11026;
	}

	@JsonProperty("numPartcp_11032")
	public Integer getNumPartcp_11032() {
		return numPartcp_11032;
	}

	@JsonProperty("numPartcp_11032")
	public void setNumPartcp_11032(Integer numPartcp_11032) {
		this.numPartcp_11032 = numPartcp_11032;
	}

	@JsonProperty("curPctUndPenPrtAct_11033")
	public Double getCurPctUndPenPrtAct_11033() {
		return curPctUndPenPrtAct_11033;
	}

	@JsonProperty("curPctUndPenPrtAct_11033")
	public void setCurPctUndPenPrtAct_11033(Double curPctUndPenPrtAct_11033) {
		this.curPctUndPenPrtAct_11033 = curPctUndPenPrtAct_11033;
	}

	@JsonProperty("atRisk_11034")
	public Boolean getAtRisk_11034() {
		return atRisk_11034;
	}

	@JsonProperty("atRisk_11034")
	public void setAtRisk_11034(Boolean atRisk_11034) {
		this.atRisk_11034 = atRisk_11034;
	}

	@JsonProperty("hndlInvDecInHseYN_11037")
	public String getHndlInvDecInHseYN_11037() {
		return hndlInvDecInHseYN_11037;
	}

	@JsonProperty("hndlInvDecInHseYN_11037")
	public void setHndlInvDecInHseYN_11037(String hndlInvDecInHseYN_11037) {
		this.hndlInvDecInHseYN_11037 = hndlInvDecInHseYN_11037;
	}

	@JsonProperty("expCompInvDes_11038")
	public String getExpCompInvDes_11038() {
		return expCompInvDes_11038;
	}

	@JsonProperty("expCompInvDes_11038")
	public void setExpCompInvDes_11038(String expCompInvDes_11038) {
		this.expCompInvDes_11038 = expCompInvDes_11038;
	}

	@JsonProperty("plnERISAYN_11039")
	public String getPlnERISAYN_11039() {
		return plnERISAYN_11039;
	}

	@JsonProperty("plnERISAYN_11039")
	public void setPlnERISAYN_11039(String plnERISAYN_11039) {
		this.plnERISAYN_11039 = plnERISAYN_11039;
	}

	@JsonProperty("expERISA_11040")
	public String getExpERISA_11040() {
		return expERISA_11040;
	}

	@JsonProperty("expERISA_11040")
	public void setExpERISA_11040(String expERISA_11040) {
		this.expERISA_11040 = expERISA_11040;
	}

	@JsonProperty("nxt12MntCshBalYN_11041")
	public String getNxt12MntCshBalYN_11041() {
		return nxt12MntCshBalYN_11041;
	}

	@JsonProperty("nxt12MntCshBalYN_11041")
	public void setNxt12MntCshBalYN_11041(String nxt12MntCshBalYN_11041) {
		this.nxt12MntCshBalYN_11041 = nxt12MntCshBalYN_11041;
	}

	@JsonProperty("tranDate_11042")
	public String getTranDate_11042() {
		return tranDate_11042;
	}

	@JsonProperty("tranDate_11042")
	public void setTranDate_11042(String tranDate_11042) {
		this.tranDate_11042 = tranDate_11042;
	}

	@JsonProperty("stsAsstDist_11043")
	public String getStsAsstDist_11043() {
		return stsAsstDist_11043;
	}

	@JsonProperty("stsAsstDist_11043")
	public void setStsAsstDist_11043(String stsAsstDist_11043) {
		this.stsAsstDist_11043 = stsAsstDist_11043;
	}

	@JsonProperty("redBenYN_11044")
	public String getRedBenYN_11044() {
		return redBenYN_11044;
	}

	@JsonProperty("redBenYN_11044")
	public void setRedBenYN_11044(String redBenYN_11044) {
		this.redBenYN_11044 = redBenYN_11044;
	}

	@JsonProperty("commSntPlnPartYN_11045")
	public String getCommSntPlnPartYN_11045() {
		return commSntPlnPartYN_11045;
	}

	@JsonProperty("commSntPlnPartYN_11045")
	public void setCommSntPlnPartYN_11045(String commSntPlnPartYN_11045) {
		this.commSntPlnPartYN_11045 = commSntPlnPartYN_11045;
	}

	@JsonProperty("nmInsCarrier_11046")
	public String getNmInsCarrier_11046() {
		return nmInsCarrier_11046;
	}

	@JsonProperty("nmInsCarrier_11046")
	public void setNmInsCarrier_11046(String nmInsCarrier_11046) {
		this.nmInsCarrier_11046 = nmInsCarrier_11046;
	}

	@JsonProperty("sbjInstReg3YRYN_11047")
	public String getSbjInstReg3YRYN_11047() {
		return sbjInstReg3YRYN_11047;
	}

	@JsonProperty("sbjInstReg3YRYN_11047")
	public void setSbjInstReg3YRYN_11047(String sbjInstReg3YRYN_11047) {
		this.sbjInstReg3YRYN_11047 = sbjInstReg3YRYN_11047;
	}

	@JsonProperty("pst3YRMrgTmFrzPlnYN_11048")
	public String getPst3YRMrgTmFrzPlnYN_11048() {
		return pst3YRMrgTmFrzPlnYN_11048;
	}

	@JsonProperty("pst3YRMrgTmFrzPlnYN_11048")
	public void setPst3YRMrgTmFrzPlnYN_11048(String pst3YRMrgTmFrzPlnYN_11048) {
		this.pst3YRMrgTmFrzPlnYN_11048 = pst3YRMrgTmFrzPlnYN_11048;
	}

	@JsonProperty("tranDate_11049")
	public String getTranDate_11049() {
		return tranDate_11049;
	}

	@JsonProperty("tranDate_11049")
	public void setTranDate_11049(String tranDate_11049) {
		this.tranDate_11049 = tranDate_11049;
	}

	@JsonProperty("stsAsstDist_11050")
	public String getStsAsstDist_11050() {
		return stsAsstDist_11050;
	}

	@JsonProperty("stsAsstDist_11050")
	public void setStsAsstDist_11050(String stsAsstDist_11050) {
		this.stsAsstDist_11050 = stsAsstDist_11050;
	}

	@JsonProperty("areSimBenOffYN_11051")
	public String getAreSimBenOffYN_11051() {
		return areSimBenOffYN_11051;
	}

	@JsonProperty("areSimBenOffYN_11051")
	public void setAreSimBenOffYN_11051(String areSimBenOffYN_11051) {
		this.areSimBenOffYN_11051 = areSimBenOffYN_11051;
	}

	@JsonProperty("nmInsCarrier_11052")
	public String getNmInsCarrier_11052() {
		return nmInsCarrier_11052;
	}

	@JsonProperty("nmInsCarrier_11052")
	public void setNmInsCarrier_11052(String nmInsCarrier_11052) {
		this.nmInsCarrier_11052 = nmInsCarrier_11052;
	}

	@JsonProperty("fidGulBrchTrstYN_11053")
	public String getFidGulBrchTrstYN_11053() {
		return fidGulBrchTrstYN_11053;
	}

	@JsonProperty("fidGulBrchTrstYN_11053")
	public void setFidGulBrchTrstYN_11053(String fidGulBrchTrstYN_11053) {
		this.fidGulBrchTrstYN_11053 = fidGulBrchTrstYN_11053;
	}

	@JsonProperty("expFidGulBrchTrst_11054")
	public String getExpFidGulBrchTrst_11054() {
		return expFidGulBrchTrst_11054;
	}

	@JsonProperty("expFidGulBrchTrst_11054")
	public void setExpFidGulBrchTrst_11054(String expFidGulBrchTrst_11054) {
		this.expFidGulBrchTrst_11054 = expFidGulBrchTrst_11054;
	}

	@JsonProperty("fidConvCrmCondYN_11055")
	public String getFidConvCrmCondYN_11055() {
		return fidConvCrmCondYN_11055;
	}

	@JsonProperty("fidConvCrmCondYN_11055")
	public void setFidConvCrmCondYN_11055(String fidConvCrmCondYN_11055) {
		this.fidConvCrmCondYN_11055 = fidConvCrmCondYN_11055;
	}

	@JsonProperty("expConvCrmCond_11056")
	public String getExpConvCrmCond_11056() {
		return expConvCrmCond_11056;
	}

	@JsonProperty("expConvCrmCond_11056")
	public void setExpConvCrmCond_11056(String expConvCrmCond_11056) {
		this.expConvCrmCond_11056 = expConvCrmCond_11056;
	}

	@JsonProperty("antFeeGovAuthYN_11057")
	public String getAntFeeGovAuthYN_11057() {
		return antFeeGovAuthYN_11057;
	}

	@JsonProperty("antFeeGovAuthYN_11057")
	public void setAntFeeGovAuthYN_11057(String antFeeGovAuthYN_11057) {
		this.antFeeGovAuthYN_11057 = antFeeGovAuthYN_11057;
	}

	@JsonProperty("expAntFeeGovAuth_11058")
	public String getExpAntFeeGovAuth_11058() {
		return expAntFeeGovAuth_11058;
	}

	@JsonProperty("expAntFeeGovAuth_11058")
	public void setExpAntFeeGovAuth_11058(String expAntFeeGovAuth_11058) {
		this.expAntFeeGovAuth_11058 = expAntFeeGovAuth_11058;
	}

	@JsonProperty("plnNm_11024")
	public String getPlnNm_11024() {
		return plnNm_11024;
	}

	@JsonProperty("plnNm_11024")
	public void setPlnNm_11024(String plnNm_11024) {
		this.plnNm_11024 = plnNm_11024;
	}

}