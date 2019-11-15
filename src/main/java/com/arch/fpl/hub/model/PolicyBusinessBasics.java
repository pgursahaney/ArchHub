package com.arch.fpl.hub.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "descBusKeyBus_7002", "websiteYN_7003", "busWebsite_7004", "profSerForFeeYN_7005",
		"descProfSerForFee_7006", "ownBusOthBusYN_7007", "entPctOwned_7008", "subsCovReqYn_7009", "noOfSub_7010",
		"subName_7011", "subNatBus_7012", "subNftYN_7013", "subTaxExmSts_7014", "descSubTaxExmSts_7021",
		"subTotAsst_7022", "covReqEntYN_7023", "subRelOpnPriBusYN_7024", "descSubRelOpnPriBus_7025", "mgrAcqDivYN_7027",
		"expMgrAcqDiv_7028", "chgOutAudYN_7029", "expChgOutAud_7030", "reogArrngCredYN_7031", "expReogArrngCred_7032",
		"redWrkForceYN_7033", "expRedWrkForce_7034", "crtNewOrgSubDivYN_7035", "expCrtNewOrgSubDiv_7036",
		"engProdServYN_7037", "expEngProdServ_7038", "negLbrCtcServYN_7039", "expNegLbrCtcServ_7040",
		"cndtProfActYN_7041", "expCndtProfAct_7042", "crtfProdServYN_7043", "expCrtfProdServ_7044", "prmtIncMemYN_7045",
		"expPrmtIncMem_7046", "spncrActComYN_7047", "expSpncrActComYN_7048", "prvdRefLglServYN_7049",
		"expPrvdRefLglServ_7050", "prmtTrvlEvtYN_7051", "expPrmtTrvlEvtYN_7052", "admMgntServYN_7053",
		"expAdmMgntServ_7054", "pubNewsLetrYN_7055", "expPubNewsLetr_7056", "mgedThrdPrtyCtcYN_7057",
		"expMgedThrdPrtyCtc_7058" })
public class PolicyBusinessBasics {

	@JsonProperty("descBusKeyBus_7002")
	private String descBusKeyBus_7002;
	@JsonProperty("websiteYN_7003")
	private String websiteYN_7003;
	@JsonProperty("busWebsite_7004")
	private String busWebsite_7004;
	@JsonProperty("profSerForFeeYN_7005")
	private String profSerForFeeYN_7005;
	@JsonProperty("descProfSerForFee_7006")
	private String descProfSerForFee_7006;
	@JsonProperty("ownBusOthBusYN_7007")
	private String ownBusOthBusYN_7007;
	@JsonProperty("entPctOwned_7008")
	private String entPctOwned_7008;
	@JsonProperty("subsCovReqYn_7009")
	private String subsCovReqYn_7009;
	@JsonProperty("noOfSub_7010")
	private Integer noOfSub_7010;
	@JsonProperty("subName_7011")
	private String subName_7011;
	@JsonProperty("subNatBus_7012")
	private String subNatBus_7012;
	@JsonProperty("subNftYN_7013")
	private String subNftYN_7013;
	@JsonProperty("subTaxExmSts_7014")
	private String subTaxExmSts_7014;
	@JsonProperty("descSubTaxExmSts_7021")
	private String descSubTaxExmSts_7021;
	@JsonProperty("subTotAsst_7022")
	private Double subTotAsst_7022;
	@JsonProperty("covReqEntYN_7023")
	private String covReqEntYN_7023;
	@JsonProperty("subRelOpnPriBusYN_7024")
	private String subRelOpnPriBusYN_7024;
	@JsonProperty("descSubRelOpnPriBus_7025")
	private String descSubRelOpnPriBus_7025;
	@JsonProperty("mgrAcqDivYN_7027")
	private String mgrAcqDivYN_7027;
	@JsonProperty("expMgrAcqDiv_7028")
	private String expMgrAcqDiv_7028;
	@JsonProperty("chgOutAudYN_7029")
	private String chgOutAudYN_7029;
	@JsonProperty("expChgOutAud_7030")
	private String expChgOutAud_7030;
	@JsonProperty("reogArrngCredYN_7031")
	private String reogArrngCredYN_7031;
	@JsonProperty("expReogArrngCred_7032")
	private String expReogArrngCred_7032;
	@JsonProperty("redWrkForceYN_7033")
	private String redWrkForceYN_7033;
	@JsonProperty("expRedWrkForce_7034")
	private String expRedWrkForce_7034;
	@JsonProperty("crtNewOrgSubDivYN_7035")
	private String crtNewOrgSubDivYN_7035;
	@JsonProperty("expCrtNewOrgSubDiv_7036")
	private String expCrtNewOrgSubDiv_7036;
	@JsonProperty("engProdServYN_7037")
	private String engProdServYN_7037;
	@JsonProperty("expEngProdServ_7038")
	private String expEngProdServ_7038;
	@JsonProperty("negLbrCtcServYN_7039")
	private String negLbrCtcServYN_7039;
	@JsonProperty("expNegLbrCtcServ_7040")
	private String expNegLbrCtcServ_7040;
	@JsonProperty("cndtProfActYN_7041")
	private String cndtProfActYN_7041;
	@JsonProperty("expCndtProfAct_7042")
	private String expCndtProfAct_7042;
	@JsonProperty("crtfProdServYN_7043")
	private String crtfProdServYN_7043;
	@JsonProperty("expCrtfProdServ_7044")
	private String expCrtfProdServ_7044;
	@JsonProperty("prmtIncMemYN_7045")
	private String prmtIncMemYN_7045;
	@JsonProperty("expPrmtIncMem_7046")
	private String expPrmtIncMem_7046;
	@JsonProperty("spncrActComYN_7047")
	private String spncrActComYN_7047;
	@JsonProperty("expSpncrActComYN_7048")
	private String expSpncrActComYN_7048;
	@JsonProperty("prvdRefLglServYN_7049")
	private String prvdRefLglServYN_7049;
	@JsonProperty("expPrvdRefLglServ_7050")
	private String expPrvdRefLglServ_7050;
	@JsonProperty("prmtTrvlEvtYN_7051")
	private String prmtTrvlEvtYN_7051;
	@JsonProperty("expPrmtTrvlEvtYN_7052")
	private String expPrmtTrvlEvtYN_7052;
	@JsonProperty("admMgntServYN_7053")
	private String admMgntServYN_7053;
	@JsonProperty("expAdmMgntServ_7054")
	private String expAdmMgntServ_7054;
	@JsonProperty("pubNewsLetrYN_7055")
	private String pubNewsLetrYN_7055;
	@JsonProperty("expPubNewsLetr_7056")
	private String expPubNewsLetr_7056;
	@JsonProperty("mgedThrdPrtyCtcYN_7057")
	private String mgedThrdPrtyCtcYN_7057;
	@JsonProperty("expMgedThrdPrtyCtc_7058")
	private String expMgedThrdPrtyCtc_7058;

	@JsonProperty("descBusKeyBus_7002")
	public String getDescBusKeyBus_7002() {
		return descBusKeyBus_7002;
	}

	@JsonProperty("descBusKeyBus_7002")
	public void setDescBusKeyBus_7002(String descBusKeyBus_7002) {
		this.descBusKeyBus_7002 = descBusKeyBus_7002;
	}

	@JsonProperty("websiteYN_7003")
	public String getWebsiteYN_7003() {
		return websiteYN_7003;
	}

	@JsonProperty("websiteYN_7003")
	public void setWebsiteYN_7003(String websiteYN_7003) {
		this.websiteYN_7003 = websiteYN_7003;
	}

	@JsonProperty("busWebsite_7004")
	public String getBusWebsite_7004() {
		return busWebsite_7004;
	}

	@JsonProperty("busWebsite_7004")
	public void setBusWebsite_7004(String busWebsite_7004) {
		this.busWebsite_7004 = busWebsite_7004;
	}

	@JsonProperty("profSerForFeeYN_7005")
	public String getProfSerForFeeYN_7005() {
		return profSerForFeeYN_7005;
	}

	@JsonProperty("profSerForFeeYN_7005")
	public void setProfSerForFeeYN_7005(String profSerForFeeYN_7005) {
		this.profSerForFeeYN_7005 = profSerForFeeYN_7005;
	}

	@JsonProperty("descProfSerForFee_7006")
	public String getDescProfSerForFee_7006() {
		return descProfSerForFee_7006;
	}

	@JsonProperty("descProfSerForFee_7006")
	public void setDescProfSerForFee_7006(String descProfSerForFee_7006) {
		this.descProfSerForFee_7006 = descProfSerForFee_7006;
	}

	@JsonProperty("ownBusOthBusYN_7007")
	public String getOwnBusOthBusYN_7007() {
		return ownBusOthBusYN_7007;
	}

	@JsonProperty("ownBusOthBusYN_7007")
	public void setOwnBusOthBusYN_7007(String ownBusOthBusYN_7007) {
		this.ownBusOthBusYN_7007 = ownBusOthBusYN_7007;
	}

	@JsonProperty("entPctOwned_7008")
	public String getEntPctOwned_7008() {
		return entPctOwned_7008;
	}

	@JsonProperty("entPctOwned_7008")
	public void setEntPctOwned_7008(String entPctOwned_7008) {
		this.entPctOwned_7008 = entPctOwned_7008;
	}

	@JsonProperty("subsCovReqYn_7009")
	public String getSubsCovReqYn_7009() {
		return subsCovReqYn_7009;
	}

	@JsonProperty("subsCovReqYn_7009")
	public void setSubsCovReqYn_7009(String subsCovReqYn_7009) {
		this.subsCovReqYn_7009 = subsCovReqYn_7009;
	}

	@JsonProperty("noOfSub_7010")
	public Integer getNoOfSub_7010() {
		return noOfSub_7010;
	}

	@JsonProperty("noOfSub_7010")
	public void setNoOfSub_7010(Integer noOfSub_7010) {
		this.noOfSub_7010 = noOfSub_7010;
	}

	@JsonProperty("subName_7011")
	public String getSubName_7011() {
		return subName_7011;
	}

	@JsonProperty("subName_7011")
	public void setSubName_7011(String subName_7011) {
		this.subName_7011 = subName_7011;
	}

	@JsonProperty("subNatBus_7012")
	public String getSubNatBus_7012() {
		return subNatBus_7012;
	}

	@JsonProperty("subNatBus_7012")
	public void setSubNatBus_7012(String subNatBus_7012) {
		this.subNatBus_7012 = subNatBus_7012;
	}

	@JsonProperty("subNftYN_7013")
	public String getSubNftYN_7013() {
		return subNftYN_7013;
	}

	@JsonProperty("subNftYN_7013")
	public void setSubNftYN_7013(String subNftYN_7013) {
		this.subNftYN_7013 = subNftYN_7013;
	}

	@JsonProperty("subTaxExmSts_7014")
	public String getSubTaxExmSts_7014() {
		return subTaxExmSts_7014;
	}

	@JsonProperty("subTaxExmSts_7014")
	public void setSubTaxExmSts_7014(String subTaxExmSts_7014) {
		this.subTaxExmSts_7014 = subTaxExmSts_7014;
	}

	@JsonProperty("descSubTaxExmSts_7021")
	public String getDescSubTaxExmSts_7021() {
		return descSubTaxExmSts_7021;
	}

	@JsonProperty("descSubTaxExmSts_7021")
	public void setDescSubTaxExmSts_7021(String descSubTaxExmSts_7021) {
		this.descSubTaxExmSts_7021 = descSubTaxExmSts_7021;
	}

	@JsonProperty("subTotAsst_7022")
	public Double getSubTotAsst_7022() {
		return subTotAsst_7022;
	}

	@JsonProperty("subTotAsst_7022")
	public void setSubTotAsst_7022(Double subTotAsst_7022) {
		this.subTotAsst_7022 = subTotAsst_7022;
	}

	@JsonProperty("covReqEntYN_7023")
	public String getCovReqEntYN_7023() {
		return covReqEntYN_7023;
	}

	@JsonProperty("covReqEntYN_7023")
	public void setCovReqEntYN_7023(String covReqEntYN_7023) {
		this.covReqEntYN_7023 = covReqEntYN_7023;
	}

	@JsonProperty("subRelOpnPriBusYN_7024")
	public String getSubRelOpnPriBusYN_7024() {
		return subRelOpnPriBusYN_7024;
	}

	@JsonProperty("subRelOpnPriBusYN_7024")
	public void setSubRelOpnPriBusYN_7024(String subRelOpnPriBusYN_7024) {
		this.subRelOpnPriBusYN_7024 = subRelOpnPriBusYN_7024;
	}

	@JsonProperty("descSubRelOpnPriBus_7025")
	public String getDescSubRelOpnPriBus_7025() {
		return descSubRelOpnPriBus_7025;
	}

	@JsonProperty("descSubRelOpnPriBus_7025")
	public void setDescSubRelOpnPriBus_7025(String descSubRelOpnPriBus_7025) {
		this.descSubRelOpnPriBus_7025 = descSubRelOpnPriBus_7025;
	}

	@JsonProperty("mgrAcqDivYN_7027")
	public String getMgrAcqDivYN_7027() {
		return mgrAcqDivYN_7027;
	}

	@JsonProperty("mgrAcqDivYN_7027")
	public void setMgrAcqDivYN_7027(String mgrAcqDivYN_7027) {
		this.mgrAcqDivYN_7027 = mgrAcqDivYN_7027;
	}

	@JsonProperty("expMgrAcqDiv_7028")
	public String getExpMgrAcqDiv_7028() {
		return expMgrAcqDiv_7028;
	}

	@JsonProperty("expMgrAcqDiv_7028")
	public void setExpMgrAcqDiv_7028(String expMgrAcqDiv_7028) {
		this.expMgrAcqDiv_7028 = expMgrAcqDiv_7028;
	}

	@JsonProperty("chgOutAudYN_7029")
	public String getChgOutAudYN_7029() {
		return chgOutAudYN_7029;
	}

	@JsonProperty("chgOutAudYN_7029")
	public void setChgOutAudYN_7029(String chgOutAudYN_7029) {
		this.chgOutAudYN_7029 = chgOutAudYN_7029;
	}

	@JsonProperty("expChgOutAud_7030")
	public String getExpChgOutAud_7030() {
		return expChgOutAud_7030;
	}

	@JsonProperty("expChgOutAud_7030")
	public void setExpChgOutAud_7030(String expChgOutAud_7030) {
		this.expChgOutAud_7030 = expChgOutAud_7030;
	}

	@JsonProperty("reogArrngCredYN_7031")
	public String getReogArrngCredYN_7031() {
		return reogArrngCredYN_7031;
	}

	@JsonProperty("reogArrngCredYN_7031")
	public void setReogArrngCredYN_7031(String reogArrngCredYN_7031) {
		this.reogArrngCredYN_7031 = reogArrngCredYN_7031;
	}

	@JsonProperty("expReogArrngCred_7032")
	public String getExpReogArrngCred_7032() {
		return expReogArrngCred_7032;
	}

	@JsonProperty("expReogArrngCred_7032")
	public void setExpReogArrngCred_7032(String expReogArrngCred_7032) {
		this.expReogArrngCred_7032 = expReogArrngCred_7032;
	}

	@JsonProperty("redWrkForceYN_7033")
	public String getRedWrkForceYN_7033() {
		return redWrkForceYN_7033;
	}

	@JsonProperty("redWrkForceYN_7033")
	public void setRedWrkForceYN_7033(String redWrkForceYN_7033) {
		this.redWrkForceYN_7033 = redWrkForceYN_7033;
	}

	@JsonProperty("expRedWrkForce_7034")
	public String getExpRedWrkForce_7034() {
		return expRedWrkForce_7034;
	}

	@JsonProperty("expRedWrkForce_7034")
	public void setExpRedWrkForce_7034(String expRedWrkForce_7034) {
		this.expRedWrkForce_7034 = expRedWrkForce_7034;
	}

	@JsonProperty("crtNewOrgSubDivYN_7035")
	public String getCrtNewOrgSubDivYN_7035() {
		return crtNewOrgSubDivYN_7035;
	}

	@JsonProperty("crtNewOrgSubDivYN_7035")
	public void setCrtNewOrgSubDivYN_7035(String crtNewOrgSubDivYN_7035) {
		this.crtNewOrgSubDivYN_7035 = crtNewOrgSubDivYN_7035;
	}

	@JsonProperty("expCrtNewOrgSubDiv_7036")
	public String getExpCrtNewOrgSubDiv_7036() {
		return expCrtNewOrgSubDiv_7036;
	}

	@JsonProperty("expCrtNewOrgSubDiv_7036")
	public void setExpCrtNewOrgSubDiv_7036(String expCrtNewOrgSubDiv_7036) {
		this.expCrtNewOrgSubDiv_7036 = expCrtNewOrgSubDiv_7036;
	}

	@JsonProperty("engProdServYN_7037")
	public String getEngProdServYN_7037() {
		return engProdServYN_7037;
	}

	@JsonProperty("engProdServYN_7037")
	public void setEngProdServYN_7037(String engProdServYN_7037) {
		this.engProdServYN_7037 = engProdServYN_7037;
	}

	@JsonProperty("expEngProdServ_7038")
	public String getExpEngProdServ_7038() {
		return expEngProdServ_7038;
	}

	@JsonProperty("expEngProdServ_7038")
	public void setExpEngProdServ_7038(String expEngProdServ_7038) {
		this.expEngProdServ_7038 = expEngProdServ_7038;
	}

	@JsonProperty("negLbrCtcServYN_7039")
	public String getNegLbrCtcServYN_7039() {
		return negLbrCtcServYN_7039;
	}

	@JsonProperty("negLbrCtcServYN_7039")
	public void setNegLbrCtcServYN_7039(String negLbrCtcServYN_7039) {
		this.negLbrCtcServYN_7039 = negLbrCtcServYN_7039;
	}

	@JsonProperty("expNegLbrCtcServ_7040")
	public String getExpNegLbrCtcServ_7040() {
		return expNegLbrCtcServ_7040;
	}

	@JsonProperty("expNegLbrCtcServ_7040")
	public void setExpNegLbrCtcServ_7040(String expNegLbrCtcServ_7040) {
		this.expNegLbrCtcServ_7040 = expNegLbrCtcServ_7040;
	}

	@JsonProperty("cndtProfActYN_7041")
	public String getCndtProfActYN_7041() {
		return cndtProfActYN_7041;
	}

	@JsonProperty("cndtProfActYN_7041")
	public void setCndtProfActYN_7041(String cndtProfActYN_7041) {
		this.cndtProfActYN_7041 = cndtProfActYN_7041;
	}

	@JsonProperty("expCndtProfAct_7042")
	public String getExpCndtProfAct_7042() {
		return expCndtProfAct_7042;
	}

	@JsonProperty("expCndtProfAct_7042")
	public void setExpCndtProfAct_7042(String expCndtProfAct_7042) {
		this.expCndtProfAct_7042 = expCndtProfAct_7042;
	}

	@JsonProperty("crtfProdServYN_7043")
	public String getCrtfProdServYN_7043() {
		return crtfProdServYN_7043;
	}

	@JsonProperty("crtfProdServYN_7043")
	public void setCrtfProdServYN_7043(String crtfProdServYN_7043) {
		this.crtfProdServYN_7043 = crtfProdServYN_7043;
	}

	@JsonProperty("expCrtfProdServ_7044")
	public String getExpCrtfProdServ_7044() {
		return expCrtfProdServ_7044;
	}

	@JsonProperty("expCrtfProdServ_7044")
	public void setExpCrtfProdServ_7044(String expCrtfProdServ_7044) {
		this.expCrtfProdServ_7044 = expCrtfProdServ_7044;
	}

	@JsonProperty("prmtIncMemYN_7045")
	public String getPrmtIncMemYN_7045() {
		return prmtIncMemYN_7045;
	}

	@JsonProperty("prmtIncMemYN_7045")
	public void setPrmtIncMemYN_7045(String prmtIncMemYN_7045) {
		this.prmtIncMemYN_7045 = prmtIncMemYN_7045;
	}

	@JsonProperty("expPrmtIncMem_7046")
	public String getExpPrmtIncMem_7046() {
		return expPrmtIncMem_7046;
	}

	@JsonProperty("expPrmtIncMem_7046")
	public void setExpPrmtIncMem_7046(String expPrmtIncMem_7046) {
		this.expPrmtIncMem_7046 = expPrmtIncMem_7046;
	}

	@JsonProperty("spncrActComYN_7047")
	public String getSpncrActComYN_7047() {
		return spncrActComYN_7047;
	}

	@JsonProperty("spncrActComYN_7047")
	public void setSpncrActComYN_7047(String spncrActComYN_7047) {
		this.spncrActComYN_7047 = spncrActComYN_7047;
	}

	@JsonProperty("expSpncrActComYN_7048")
	public String getExpSpncrActComYN_7048() {
		return expSpncrActComYN_7048;
	}

	@JsonProperty("expSpncrActComYN_7048")
	public void setExpSpncrActComYN_7048(String expSpncrActComYN_7048) {
		this.expSpncrActComYN_7048 = expSpncrActComYN_7048;
	}

	@JsonProperty("prvdRefLglServYN_7049")
	public String getPrvdRefLglServYN_7049() {
		return prvdRefLglServYN_7049;
	}

	@JsonProperty("prvdRefLglServYN_7049")
	public void setPrvdRefLglServYN_7049(String prvdRefLglServYN_7049) {
		this.prvdRefLglServYN_7049 = prvdRefLglServYN_7049;
	}

	@JsonProperty("expPrvdRefLglServ_7050")
	public String getExpPrvdRefLglServ_7050() {
		return expPrvdRefLglServ_7050;
	}

	@JsonProperty("expPrvdRefLglServ_7050")
	public void setExpPrvdRefLglServ_7050(String expPrvdRefLglServ_7050) {
		this.expPrvdRefLglServ_7050 = expPrvdRefLglServ_7050;
	}

	@JsonProperty("prmtTrvlEvtYN_7051")
	public String getPrmtTrvlEvtYN_7051() {
		return prmtTrvlEvtYN_7051;
	}

	@JsonProperty("prmtTrvlEvtYN_7051")
	public void setPrmtTrvlEvtYN_7051(String prmtTrvlEvtYN_7051) {
		this.prmtTrvlEvtYN_7051 = prmtTrvlEvtYN_7051;
	}

	@JsonProperty("expPrmtTrvlEvtYN_7052")
	public String getExpPrmtTrvlEvtYN_7052() {
		return expPrmtTrvlEvtYN_7052;
	}

	@JsonProperty("expPrmtTrvlEvtYN_7052")
	public void setExpPrmtTrvlEvtYN_7052(String expPrmtTrvlEvtYN_7052) {
		this.expPrmtTrvlEvtYN_7052 = expPrmtTrvlEvtYN_7052;
	}

	@JsonProperty("admMgntServYN_7053")
	public String getAdmMgntServYN_7053() {
		return admMgntServYN_7053;
	}

	@JsonProperty("admMgntServYN_7053")
	public void setAdmMgntServYN_7053(String admMgntServYN_7053) {
		this.admMgntServYN_7053 = admMgntServYN_7053;
	}

	@JsonProperty("expAdmMgntServ_7054")
	public String getExpAdmMgntServ_7054() {
		return expAdmMgntServ_7054;
	}

	@JsonProperty("expAdmMgntServ_7054")
	public void setExpAdmMgntServ_7054(String expAdmMgntServ_7054) {
		this.expAdmMgntServ_7054 = expAdmMgntServ_7054;
	}

	@JsonProperty("pubNewsLetrYN_7055")
	public String getPubNewsLetrYN_7055() {
		return pubNewsLetrYN_7055;
	}

	@JsonProperty("pubNewsLetrYN_7055")
	public void setPubNewsLetrYN_7055(String pubNewsLetrYN_7055) {
		this.pubNewsLetrYN_7055 = pubNewsLetrYN_7055;
	}

	@JsonProperty("expPubNewsLetr_7056")
	public String getExpPubNewsLetr_7056() {
		return expPubNewsLetr_7056;
	}

	@JsonProperty("expPubNewsLetr_7056")
	public void setExpPubNewsLetr_7056(String expPubNewsLetr_7056) {
		this.expPubNewsLetr_7056 = expPubNewsLetr_7056;
	}

	@JsonProperty("mgedThrdPrtyCtcYN_7057")
	public String getMgedThrdPrtyCtcYN_7057() {
		return mgedThrdPrtyCtcYN_7057;
	}

	@JsonProperty("mgedThrdPrtyCtcYN_7057")
	public void setMgedThrdPrtyCtcYN_7057(String mgedThrdPrtyCtcYN_7057) {
		this.mgedThrdPrtyCtcYN_7057 = mgedThrdPrtyCtcYN_7057;
	}

	@JsonProperty("expMgedThrdPrtyCtc_7058")
	public String getExpMgedThrdPrtyCtc_7058() {
		return expMgedThrdPrtyCtc_7058;
	}

	@JsonProperty("expMgedThrdPrtyCtc_7058")
	public void setExpMgedThrdPrtyCtc_7058(String expMgedThrdPrtyCtc_7058) {
		this.expMgedThrdPrtyCtc_7058 = expMgedThrdPrtyCtc_7058;
	}

}