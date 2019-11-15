package com.arch.fpl.hub.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "crmLmtAmt_12002", "retLmtAmt_12011", "insPrmCash_12024", "insPrmRtlCash_12025",
		"insPrmCrdCrdRcpt_12026", "outPrmCash_12028", "outPrmRtlCash_12029", "outPrmCrdCrdRcpt_12030",
		"isIntAudDptYN_12031", "allEmpRecMthStmYN_12032", "expAllEmpRecMthStm_12033", "cpaLtrMgntY_12035",
		"cpaLtrMgntN_12036", "cpaLtrMgntNoLtr_12037", "expMgmtCompRecom_12038", "perfCrmCrdHisYN_12039",
		"extAudInclLocYN_12040", "expExtAudInclLoc_12041", "compPwd_12043", "compUsrId_12044", "compNone_12045",
		"reqAllEmpExtCtcYN_12046", "empSignWreTfrYN_12047", "expEmpSignWreTfr_12048", "intDomesPurProcYN_12049",
		"whyIntDomesPurProc_12050", "chkStkEqpDly_12052", "chkStkEqpWky_12053", "chkStkEqpMty_12054",
		"chkStkEqpYly_12055", "chkStkEqpOtr_12056", "chkStkEqpNvr_12057", "reconOwnr_12060", "reconTrsr_12061",
		"reconAcct_12062", "reconOthr_12063", "expWhoPrfnRecon_12064", "condPerpInvRwMatYN_12065", "precMetGemYN_12066",
		"lstOfAuthYN_12067", "procExstOwnVenLstYN_12068", "exstVenAuthLstYN_12069", "corrExecAuthLstYN_12070",
		"compAuthEleFndTfrYN_12071", "cntrlFndMatCltYN_12072", "cntrlFndMatCltYN_12073" })
public class PolicyCrime {

	@JsonProperty("crmLmtAmt_12002")
	private Integer crmLmtAmt_12002;
	@JsonProperty("retLmtAmt_12011")
	private Integer retLmtAmt_12011;
	@JsonProperty("insPrmCash_12024")
	private Double insPrmCash_12024;
	@JsonProperty("insPrmRtlCash_12025")
	private Double insPrmRtlCash_12025;
	@JsonProperty("insPrmCrdCrdRcpt_12026")
	private Double insPrmCrdCrdRcpt_12026;
	@JsonProperty("outPrmCash_12028")
	private Double outPrmCash_12028;
	@JsonProperty("outPrmRtlCash_12029")
	private Double outPrmRtlCash_12029;
	@JsonProperty("outPrmCrdCrdRcpt_12030")
	private Double outPrmCrdCrdRcpt_12030;
	@JsonProperty("isIntAudDptYN_12031")
	private String isIntAudDptYN_12031;
	@JsonProperty("allEmpRecMthStmYN_12032")
	private String allEmpRecMthStmYN_12032;
	@JsonProperty("expAllEmpRecMthStm_12033")
	private String expAllEmpRecMthStm_12033;
	@JsonProperty("cpaLtrMgntY_12035")
	private Boolean cpaLtrMgntY_12035;
	@JsonProperty("cpaLtrMgntN_12036")
	private Boolean cpaLtrMgntN_12036;
	@JsonProperty("cpaLtrMgntNoLtr_12037")
	private Boolean cpaLtrMgntNoLtr_12037;
	@JsonProperty("expMgmtCompRecom_12038")
	private String expMgmtCompRecom_12038;
	@JsonProperty("perfCrmCrdHisYN_12039")
	private String perfCrmCrdHisYN_12039;
	@JsonProperty("extAudInclLocYN_12040")
	private String extAudInclLocYN_12040;
	@JsonProperty("expExtAudInclLoc_12041")
	private String expExtAudInclLoc_12041;
	@JsonProperty("compPwd_12043")
	private Boolean compPwd_12043;
	@JsonProperty("compUsrId_12044")
	private Boolean compUsrId_12044;
	@JsonProperty("compNone_12045")
	private Boolean compNone_12045;
	@JsonProperty("reqAllEmpExtCtcYN_12046")
	private String reqAllEmpExtCtcYN_12046;
	@JsonProperty("empSignWreTfrYN_12047")
	private String empSignWreTfrYN_12047;
	@JsonProperty("expEmpSignWreTfr_12048")
	private String expEmpSignWreTfr_12048;
	@JsonProperty("intDomesPurProcYN_12049")
	private String intDomesPurProcYN_12049;
	@JsonProperty("whyIntDomesPurProc_12050")
	private String whyIntDomesPurProc_12050;
	@JsonProperty("chkStkEqpDly_12052")
	private Boolean chkStkEqpDly_12052;
	@JsonProperty("chkStkEqpWky_12053")
	private Boolean chkStkEqpWky_12053;
	@JsonProperty("chkStkEqpMty_12054")
	private Boolean chkStkEqpMty_12054;
	@JsonProperty("chkStkEqpYly_12055")
	private Boolean chkStkEqpYly_12055;
	@JsonProperty("chkStkEqpOtr_12056")
	private Boolean chkStkEqpOtr_12056;
	@JsonProperty("chkStkEqpNvr_12057")
	private Boolean chkStkEqpNvr_12057;
	@JsonProperty("reconOwnr_12060")
	private Boolean reconOwnr_12060;
	@JsonProperty("reconTrsr_12061")
	private Boolean reconTrsr_12061;
	@JsonProperty("reconAcct_12062")
	private Boolean reconAcct_12062;
	@JsonProperty("reconOthr_12063")
	private Boolean reconOthr_12063;
	@JsonProperty("expWhoPrfnRecon_12064")
	private String expWhoPrfnRecon_12064;
	@JsonProperty("condPerpInvRwMatYN_12065")
	private String condPerpInvRwMatYN_12065;
	@JsonProperty("precMetGemYN_12066")
	private String precMetGemYN_12066;
	@JsonProperty("lstOfAuthYN_12067")
	private String lstOfAuthYN_12067;
	@JsonProperty("procExstOwnVenLstYN_12068")
	private String procExstOwnVenLstYN_12068;
	@JsonProperty("exstVenAuthLstYN_12069")
	private String exstVenAuthLstYN_12069;
	@JsonProperty("corrExecAuthLstYN_12070")
	private String corrExecAuthLstYN_12070;
	@JsonProperty("compAuthEleFndTfrYN_12071")
	private String compAuthEleFndTfrYN_12071;
	@JsonProperty("cntrlFndMatCltYN_12072")
	private String cntrlFndMatCltYN_12072;
	@JsonProperty("cntrlFndMatCltYN_12073")
	private String cntrlFndMatCltYN_12073;

	@JsonProperty("crmLmtAmt_12002")
	public Integer getCrmLmtAmt_12002() {
		return crmLmtAmt_12002;
	}

	@JsonProperty("crmLmtAmt_12002")
	public void setCrmLmtAmt_12002(Integer crmLmtAmt_12002) {
		this.crmLmtAmt_12002 = crmLmtAmt_12002;
	}

	@JsonProperty("retLmtAmt_12011")
	public Integer getRetLmtAmt_12011() {
		return retLmtAmt_12011;
	}

	@JsonProperty("retLmtAmt_12011")
	public void setRetLmtAmt_12011(Integer retLmtAmt_12011) {
		this.retLmtAmt_12011 = retLmtAmt_12011;
	}

	@JsonProperty("insPrmCash_12024")
	public Double getInsPrmCash_12024() {
		return insPrmCash_12024;
	}

	@JsonProperty("insPrmCash_12024")
	public void setInsPrmCash_12024(Double insPrmCash_12024) {
		this.insPrmCash_12024 = insPrmCash_12024;
	}

	@JsonProperty("insPrmRtlCash_12025")
	public Double getInsPrmRtlCash_12025() {
		return insPrmRtlCash_12025;
	}

	@JsonProperty("insPrmRtlCash_12025")
	public void setInsPrmRtlCash_12025(Double insPrmRtlCash_12025) {
		this.insPrmRtlCash_12025 = insPrmRtlCash_12025;
	}

	@JsonProperty("insPrmCrdCrdRcpt_12026")
	public Double getInsPrmCrdCrdRcpt_12026() {
		return insPrmCrdCrdRcpt_12026;
	}

	@JsonProperty("insPrmCrdCrdRcpt_12026")
	public void setInsPrmCrdCrdRcpt_12026(Double insPrmCrdCrdRcpt_12026) {
		this.insPrmCrdCrdRcpt_12026 = insPrmCrdCrdRcpt_12026;
	}

	@JsonProperty("outPrmCash_12028")
	public Double getOutPrmCash_12028() {
		return outPrmCash_12028;
	}

	@JsonProperty("outPrmCash_12028")
	public void setOutPrmCash_12028(Double outPrmCash_12028) {
		this.outPrmCash_12028 = outPrmCash_12028;
	}

	@JsonProperty("outPrmRtlCash_12029")
	public Double getOutPrmRtlCash_12029() {
		return outPrmRtlCash_12029;
	}

	@JsonProperty("outPrmRtlCash_12029")
	public void setOutPrmRtlCash_12029(Double outPrmRtlCash_12029) {
		this.outPrmRtlCash_12029 = outPrmRtlCash_12029;
	}

	@JsonProperty("outPrmCrdCrdRcpt_12030")
	public Double getOutPrmCrdCrdRcpt_12030() {
		return outPrmCrdCrdRcpt_12030;
	}

	@JsonProperty("outPrmCrdCrdRcpt_12030")
	public void setOutPrmCrdCrdRcpt_12030(Double outPrmCrdCrdRcpt_12030) {
		this.outPrmCrdCrdRcpt_12030 = outPrmCrdCrdRcpt_12030;
	}

	@JsonProperty("isIntAudDptYN_12031")
	public String getIsIntAudDptYN_12031() {
		return isIntAudDptYN_12031;
	}

	@JsonProperty("isIntAudDptYN_12031")
	public void setIsIntAudDptYN_12031(String isIntAudDptYN_12031) {
		this.isIntAudDptYN_12031 = isIntAudDptYN_12031;
	}

	@JsonProperty("allEmpRecMthStmYN_12032")
	public String getAllEmpRecMthStmYN_12032() {
		return allEmpRecMthStmYN_12032;
	}

	@JsonProperty("allEmpRecMthStmYN_12032")
	public void setAllEmpRecMthStmYN_12032(String allEmpRecMthStmYN_12032) {
		this.allEmpRecMthStmYN_12032 = allEmpRecMthStmYN_12032;
	}

	@JsonProperty("expAllEmpRecMthStm_12033")
	public String getExpAllEmpRecMthStm_12033() {
		return expAllEmpRecMthStm_12033;
	}

	@JsonProperty("expAllEmpRecMthStm_12033")
	public void setExpAllEmpRecMthStm_12033(String expAllEmpRecMthStm_12033) {
		this.expAllEmpRecMthStm_12033 = expAllEmpRecMthStm_12033;
	}

	@JsonProperty("cpaLtrMgntY_12035")
	public Boolean getCpaLtrMgntY_12035() {
		return cpaLtrMgntY_12035;
	}

	@JsonProperty("cpaLtrMgntY_12035")
	public void setCpaLtrMgntY_12035(Boolean cpaLtrMgntY_12035) {
		this.cpaLtrMgntY_12035 = cpaLtrMgntY_12035;
	}

	@JsonProperty("cpaLtrMgntN_12036")
	public Boolean getCpaLtrMgntN_12036() {
		return cpaLtrMgntN_12036;
	}

	@JsonProperty("cpaLtrMgntN_12036")
	public void setCpaLtrMgntN_12036(Boolean cpaLtrMgntN_12036) {
		this.cpaLtrMgntN_12036 = cpaLtrMgntN_12036;
	}

	@JsonProperty("cpaLtrMgntNoLtr_12037")
	public Boolean getCpaLtrMgntNoLtr_12037() {
		return cpaLtrMgntNoLtr_12037;
	}

	@JsonProperty("cpaLtrMgntNoLtr_12037")
	public void setCpaLtrMgntNoLtr_12037(Boolean cpaLtrMgntNoLtr_12037) {
		this.cpaLtrMgntNoLtr_12037 = cpaLtrMgntNoLtr_12037;
	}

	@JsonProperty("expMgmtCompRecom_12038")
	public String getExpMgmtCompRecom_12038() {
		return expMgmtCompRecom_12038;
	}

	@JsonProperty("expMgmtCompRecom_12038")
	public void setExpMgmtCompRecom_12038(String expMgmtCompRecom_12038) {
		this.expMgmtCompRecom_12038 = expMgmtCompRecom_12038;
	}

	@JsonProperty("perfCrmCrdHisYN_12039")
	public String getPerfCrmCrdHisYN_12039() {
		return perfCrmCrdHisYN_12039;
	}

	@JsonProperty("perfCrmCrdHisYN_12039")
	public void setPerfCrmCrdHisYN_12039(String perfCrmCrdHisYN_12039) {
		this.perfCrmCrdHisYN_12039 = perfCrmCrdHisYN_12039;
	}

	@JsonProperty("extAudInclLocYN_12040")
	public String getExtAudInclLocYN_12040() {
		return extAudInclLocYN_12040;
	}

	@JsonProperty("extAudInclLocYN_12040")
	public void setExtAudInclLocYN_12040(String extAudInclLocYN_12040) {
		this.extAudInclLocYN_12040 = extAudInclLocYN_12040;
	}

	@JsonProperty("expExtAudInclLoc_12041")
	public String getExpExtAudInclLoc_12041() {
		return expExtAudInclLoc_12041;
	}

	@JsonProperty("expExtAudInclLoc_12041")
	public void setExpExtAudInclLoc_12041(String expExtAudInclLoc_12041) {
		this.expExtAudInclLoc_12041 = expExtAudInclLoc_12041;
	}

	@JsonProperty("compPwd_12043")
	public Boolean getCompPwd_12043() {
		return compPwd_12043;
	}

	@JsonProperty("compPwd_12043")
	public void setCompPwd_12043(Boolean compPwd_12043) {
		this.compPwd_12043 = compPwd_12043;
	}

	@JsonProperty("compUsrId_12044")
	public Boolean getCompUsrId_12044() {
		return compUsrId_12044;
	}

	@JsonProperty("compUsrId_12044")
	public void setCompUsrId_12044(Boolean compUsrId_12044) {
		this.compUsrId_12044 = compUsrId_12044;
	}

	@JsonProperty("compNone_12045")
	public Boolean getCompNone_12045() {
		return compNone_12045;
	}

	@JsonProperty("compNone_12045")
	public void setCompNone_12045(Boolean compNone_12045) {
		this.compNone_12045 = compNone_12045;
	}

	@JsonProperty("reqAllEmpExtCtcYN_12046")
	public String getReqAllEmpExtCtcYN_12046() {
		return reqAllEmpExtCtcYN_12046;
	}

	@JsonProperty("reqAllEmpExtCtcYN_12046")
	public void setReqAllEmpExtCtcYN_12046(String reqAllEmpExtCtcYN_12046) {
		this.reqAllEmpExtCtcYN_12046 = reqAllEmpExtCtcYN_12046;
	}

	@JsonProperty("empSignWreTfrYN_12047")
	public String getEmpSignWreTfrYN_12047() {
		return empSignWreTfrYN_12047;
	}

	@JsonProperty("empSignWreTfrYN_12047")
	public void setEmpSignWreTfrYN_12047(String empSignWreTfrYN_12047) {
		this.empSignWreTfrYN_12047 = empSignWreTfrYN_12047;
	}

	@JsonProperty("expEmpSignWreTfr_12048")
	public String getExpEmpSignWreTfr_12048() {
		return expEmpSignWreTfr_12048;
	}

	@JsonProperty("expEmpSignWreTfr_12048")
	public void setExpEmpSignWreTfr_12048(String expEmpSignWreTfr_12048) {
		this.expEmpSignWreTfr_12048 = expEmpSignWreTfr_12048;
	}

	@JsonProperty("intDomesPurProcYN_12049")
	public String getIntDomesPurProcYN_12049() {
		return intDomesPurProcYN_12049;
	}

	@JsonProperty("intDomesPurProcYN_12049")
	public void setIntDomesPurProcYN_12049(String intDomesPurProcYN_12049) {
		this.intDomesPurProcYN_12049 = intDomesPurProcYN_12049;
	}

	@JsonProperty("whyIntDomesPurProc_12050")
	public String getWhyIntDomesPurProc_12050() {
		return whyIntDomesPurProc_12050;
	}

	@JsonProperty("whyIntDomesPurProc_12050")
	public void setWhyIntDomesPurProc_12050(String whyIntDomesPurProc_12050) {
		this.whyIntDomesPurProc_12050 = whyIntDomesPurProc_12050;
	}

	@JsonProperty("chkStkEqpDly_12052")
	public Boolean getChkStkEqpDly_12052() {
		return chkStkEqpDly_12052;
	}

	@JsonProperty("chkStkEqpDly_12052")
	public void setChkStkEqpDly_12052(Boolean chkStkEqpDly_12052) {
		this.chkStkEqpDly_12052 = chkStkEqpDly_12052;
	}

	@JsonProperty("chkStkEqpWky_12053")
	public Boolean getChkStkEqpWky_12053() {
		return chkStkEqpWky_12053;
	}

	@JsonProperty("chkStkEqpWky_12053")
	public void setChkStkEqpWky_12053(Boolean chkStkEqpWky_12053) {
		this.chkStkEqpWky_12053 = chkStkEqpWky_12053;
	}

	@JsonProperty("chkStkEqpMty_12054")
	public Boolean getChkStkEqpMty_12054() {
		return chkStkEqpMty_12054;
	}

	@JsonProperty("chkStkEqpMty_12054")
	public void setChkStkEqpMty_12054(Boolean chkStkEqpMty_12054) {
		this.chkStkEqpMty_12054 = chkStkEqpMty_12054;
	}

	@JsonProperty("chkStkEqpYly_12055")
	public Boolean getChkStkEqpYly_12055() {
		return chkStkEqpYly_12055;
	}

	@JsonProperty("chkStkEqpYly_12055")
	public void setChkStkEqpYly_12055(Boolean chkStkEqpYly_12055) {
		this.chkStkEqpYly_12055 = chkStkEqpYly_12055;
	}

	@JsonProperty("chkStkEqpOtr_12056")
	public Boolean getChkStkEqpOtr_12056() {
		return chkStkEqpOtr_12056;
	}

	@JsonProperty("chkStkEqpOtr_12056")
	public void setChkStkEqpOtr_12056(Boolean chkStkEqpOtr_12056) {
		this.chkStkEqpOtr_12056 = chkStkEqpOtr_12056;
	}

	@JsonProperty("chkStkEqpNvr_12057")
	public Boolean getChkStkEqpNvr_12057() {
		return chkStkEqpNvr_12057;
	}

	@JsonProperty("chkStkEqpNvr_12057")
	public void setChkStkEqpNvr_12057(Boolean chkStkEqpNvr_12057) {
		this.chkStkEqpNvr_12057 = chkStkEqpNvr_12057;
	}

	@JsonProperty("reconOwnr_12060")
	public Boolean getReconOwnr_12060() {
		return reconOwnr_12060;
	}

	@JsonProperty("reconOwnr_12060")
	public void setReconOwnr_12060(Boolean reconOwnr_12060) {
		this.reconOwnr_12060 = reconOwnr_12060;
	}

	@JsonProperty("reconTrsr_12061")
	public Boolean getReconTrsr_12061() {
		return reconTrsr_12061;
	}

	@JsonProperty("reconTrsr_12061")
	public void setReconTrsr_12061(Boolean reconTrsr_12061) {
		this.reconTrsr_12061 = reconTrsr_12061;
	}

	@JsonProperty("reconAcct_12062")
	public Boolean getReconAcct_12062() {
		return reconAcct_12062;
	}

	@JsonProperty("reconAcct_12062")
	public void setReconAcct_12062(Boolean reconAcct_12062) {
		this.reconAcct_12062 = reconAcct_12062;
	}

	@JsonProperty("reconOthr_12063")
	public Boolean getReconOthr_12063() {
		return reconOthr_12063;
	}

	@JsonProperty("reconOthr_12063")
	public void setReconOthr_12063(Boolean reconOthr_12063) {
		this.reconOthr_12063 = reconOthr_12063;
	}

	@JsonProperty("expWhoPrfnRecon_12064")
	public String getExpWhoPrfnRecon_12064() {
		return expWhoPrfnRecon_12064;
	}

	@JsonProperty("expWhoPrfnRecon_12064")
	public void setExpWhoPrfnRecon_12064(String expWhoPrfnRecon_12064) {
		this.expWhoPrfnRecon_12064 = expWhoPrfnRecon_12064;
	}

	@JsonProperty("condPerpInvRwMatYN_12065")
	public String getCondPerpInvRwMatYN_12065() {
		return condPerpInvRwMatYN_12065;
	}

	@JsonProperty("condPerpInvRwMatYN_12065")
	public void setCondPerpInvRwMatYN_12065(String condPerpInvRwMatYN_12065) {
		this.condPerpInvRwMatYN_12065 = condPerpInvRwMatYN_12065;
	}

	@JsonProperty("precMetGemYN_12066")
	public String getPrecMetGemYN_12066() {
		return precMetGemYN_12066;
	}

	@JsonProperty("precMetGemYN_12066")
	public void setPrecMetGemYN_12066(String precMetGemYN_12066) {
		this.precMetGemYN_12066 = precMetGemYN_12066;
	}

	@JsonProperty("lstOfAuthYN_12067")
	public String getLstOfAuthYN_12067() {
		return lstOfAuthYN_12067;
	}

	@JsonProperty("lstOfAuthYN_12067")
	public void setLstOfAuthYN_12067(String lstOfAuthYN_12067) {
		this.lstOfAuthYN_12067 = lstOfAuthYN_12067;
	}

	@JsonProperty("procExstOwnVenLstYN_12068")
	public String getProcExstOwnVenLstYN_12068() {
		return procExstOwnVenLstYN_12068;
	}

	@JsonProperty("procExstOwnVenLstYN_12068")
	public void setProcExstOwnVenLstYN_12068(String procExstOwnVenLstYN_12068) {
		this.procExstOwnVenLstYN_12068 = procExstOwnVenLstYN_12068;
	}

	@JsonProperty("exstVenAuthLstYN_12069")
	public String getExstVenAuthLstYN_12069() {
		return exstVenAuthLstYN_12069;
	}

	@JsonProperty("exstVenAuthLstYN_12069")
	public void setExstVenAuthLstYN_12069(String exstVenAuthLstYN_12069) {
		this.exstVenAuthLstYN_12069 = exstVenAuthLstYN_12069;
	}

	@JsonProperty("corrExecAuthLstYN_12070")
	public String getCorrExecAuthLstYN_12070() {
		return corrExecAuthLstYN_12070;
	}

	@JsonProperty("corrExecAuthLstYN_12070")
	public void setCorrExecAuthLstYN_12070(String corrExecAuthLstYN_12070) {
		this.corrExecAuthLstYN_12070 = corrExecAuthLstYN_12070;
	}

	@JsonProperty("compAuthEleFndTfrYN_12071")
	public String getCompAuthEleFndTfrYN_12071() {
		return compAuthEleFndTfrYN_12071;
	}

	@JsonProperty("compAuthEleFndTfrYN_12071")
	public void setCompAuthEleFndTfrYN_12071(String compAuthEleFndTfrYN_12071) {
		this.compAuthEleFndTfrYN_12071 = compAuthEleFndTfrYN_12071;
	}

	@JsonProperty("cntrlFndMatCltYN_12072")
	public String getCntrlFndMatCltYN_12072() {
		return cntrlFndMatCltYN_12072;
	}

	@JsonProperty("cntrlFndMatCltYN_12072")
	public void setCntrlFndMatCltYN_12072(String cntrlFndMatCltYN_12072) {
		this.cntrlFndMatCltYN_12072 = cntrlFndMatCltYN_12072;
	}

	@JsonProperty("cntrlFndMatCltYN_12073")
	public String getCntrlFndMatCltYN_12073() {
		return cntrlFndMatCltYN_12073;
	}

	@JsonProperty("cntrlFndMatCltYN_12073")
	public void setCntrlFndMatCltYN_12073(String cntrlFndMatCltYN_12073) {
		this.cntrlFndMatCltYN_12073 = cntrlFndMatCltYN_12073;
	}

}