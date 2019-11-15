package com.arch.fpl.hub.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "dateBeginBusCurOwnership_3002", "businessRegAs_3003", "isCompCorpYN_3011", "isCompNFTYN_3012",
		"taxExmtStsYN_3013", "taxExmtSts_3014", "othTaxExmtSts_3021", "dispTaxExmtSts_3022", "expDispTaxExmtSts_3023",
		"totNumWrldEmp_3025", "numOfInHseCsel_3026", "numEmpFulCurYr_3029", "numEmpFulPrYr_3030", "numEmpPrtCurYr_3031",
		"numEmpPrtPrYr_3032", "numUnnEmpPrtCurYr_3033", "numUnnEmpPrtPrYr_3034", "numVolCurYr_3035", "numVolPrYr_3036",
		"empLocInCA_3037", "numEmpCACurYr_3040", "numEmpCAPrYr_3041", "empLocOutOfUS_3042", "numEmpOutUSCurYr_3045",
		"numEmpOutUSPrYr_3046", "maxNumLeasEmp_3048", "maxNumSeaEmp_3049", "maxNumTempEmp_3050", "diffCtryAppEmp_3052",
		"numUSLocEmp_3053", "loc1StCd_3057", "numEmpLoc1_3058", "loc2StCd_3059", "numEmpLoc2_3060", "loc3StCd_3061",
		"numEmpLoc3_3062", "loc4StCd_3063", "numEmpLoc4_3064", "loc5StCd_3065", "numEmpLoc5_3066",
		"numLocOutUSWthEmp_3067", "loc1CtryCd_3071", "numEmpLocCtry1_3072", "loc2CtryCd_3073", "numEmpLocCtry2_3074",
		"loc3CtryCd_3075", "numEmpLocCtry3_3076", "loc4CtryCd_3077", "numEmpLocCtry4_3078", "loc5CtryCd_3079",
		"numEmpLocCtry5_3080", "preEmpBkGrndChk_3081", "expProAndProcInPl_3082", "expBkGrndChkNotDn_3083",
		"useIndContrctr_3085", "numOfUSIndContctrCurYr_3086", "numOfUSIndContctrPrYr_3087", "refNBkGrndChkIndCtr_3088",
		"expRefNBkGrndChkIndCtr_3089", "indContrFndsAcctPrpYN_3090", "expIndContrFndsAcctPrp_3091",
		"indContrSubjAppEmpYN_3092", "expIndContrSubjAppEmp_3093", "numChaptr_3095", "numMembr_3096" })
public class PolicyCompanyHistory {

	@JsonProperty("dateBeginBusCurOwnership_3002")
	private String dateBeginBusCurOwnership_3002;
	@JsonProperty("businessRegAs_3003")
	private String businessRegAs_3003;
	@JsonProperty("isCompCorpYN_3011")
	private String isCompCorpYN_3011;
	@JsonProperty("isCompNFTYN_3012")
	private String isCompNFTYN_3012;
	@JsonProperty("taxExmtStsYN_3013")
	private String taxExmtStsYN_3013;
	@JsonProperty("taxExmtSts_3014")
	private String taxExmtSts_3014;
	@JsonProperty("othTaxExmtSts_3021")
	private String othTaxExmtSts_3021;
	@JsonProperty("dispTaxExmtSts_3022")
	private String dispTaxExmtSts_3022;
	@JsonProperty("expDispTaxExmtSts_3023")
	private String expDispTaxExmtSts_3023;
	@JsonProperty("totNumWrldEmp_3025")
	private Integer totNumWrldEmp_3025;
	@JsonProperty("numOfInHseCsel_3026")
	private Integer numOfInHseCsel_3026;
	@JsonProperty("numEmpFulCurYr_3029")
	private Integer numEmpFulCurYr_3029;
	@JsonProperty("numEmpFulPrYr_3030")
	private Integer numEmpFulPrYr_3030;
	@JsonProperty("numEmpPrtCurYr_3031")
	private Integer numEmpPrtCurYr_3031;
	@JsonProperty("numEmpPrtPrYr_3032")
	private Integer numEmpPrtPrYr_3032;
	@JsonProperty("numUnnEmpPrtCurYr_3033")
	private Integer numUnnEmpPrtCurYr_3033;
	@JsonProperty("numUnnEmpPrtPrYr_3034")
	private Integer numUnnEmpPrtPrYr_3034;
	@JsonProperty("numVolCurYr_3035")
	private Integer numVolCurYr_3035;
	@JsonProperty("numVolPrYr_3036")
	private Integer numVolPrYr_3036;
	@JsonProperty("empLocInCA_3037")
	private String empLocInCA_3037;
	@JsonProperty("numEmpCACurYr_3040")
	private Integer numEmpCACurYr_3040;
	@JsonProperty("numEmpCAPrYr_3041")
	private Integer numEmpCAPrYr_3041;
	@JsonProperty("empLocOutOfUS_3042")
	private String empLocOutOfUS_3042;
	@JsonProperty("numEmpOutUSCurYr_3045")
	private Integer numEmpOutUSCurYr_3045;
	@JsonProperty("numEmpOutUSPrYr_3046")
	private Integer numEmpOutUSPrYr_3046;
	@JsonProperty("maxNumLeasEmp_3048")
	private Integer maxNumLeasEmp_3048;
	@JsonProperty("maxNumSeaEmp_3049")
	private Integer maxNumSeaEmp_3049;
	@JsonProperty("maxNumTempEmp_3050")
	private Integer maxNumTempEmp_3050;
	@JsonProperty("diffCtryAppEmp_3052")
	private Integer diffCtryAppEmp_3052;
	@JsonProperty("numUSLocEmp_3053")
	private Integer numUSLocEmp_3053;
	@JsonProperty("loc1StCd_3057")
	private String loc1StCd_3057;
	@JsonProperty("numEmpLoc1_3058")
	private Integer numEmpLoc1_3058;
	@JsonProperty("loc2StCd_3059")
	private String loc2StCd_3059;
	@JsonProperty("numEmpLoc2_3060")
	private Integer numEmpLoc2_3060;
	@JsonProperty("loc3StCd_3061")
	private String loc3StCd_3061;
	@JsonProperty("numEmpLoc3_3062")
	private Integer numEmpLoc3_3062;
	@JsonProperty("loc4StCd_3063")
	private String loc4StCd_3063;
	@JsonProperty("numEmpLoc4_3064")
	private Integer numEmpLoc4_3064;
	@JsonProperty("loc5StCd_3065")
	private String loc5StCd_3065;
	@JsonProperty("numEmpLoc5_3066")
	private Integer numEmpLoc5_3066;
	@JsonProperty("numLocOutUSWthEmp_3067")
	private Integer numLocOutUSWthEmp_3067;
	@JsonProperty("loc1CtryCd_3071")
	private String loc1CtryCd_3071;
	@JsonProperty("numEmpLocCtry1_3072")
	private Integer numEmpLocCtry1_3072;
	@JsonProperty("loc2CtryCd_3073")
	private String loc2CtryCd_3073;
	@JsonProperty("numEmpLocCtry2_3074")
	private Integer numEmpLocCtry2_3074;
	@JsonProperty("loc3CtryCd_3075")
	private String loc3CtryCd_3075;
	@JsonProperty("numEmpLocCtry3_3076")
	private Integer numEmpLocCtry3_3076;
	@JsonProperty("loc4CtryCd_3077")
	private String loc4CtryCd_3077;
	@JsonProperty("numEmpLocCtry4_3078")
	private Integer numEmpLocCtry4_3078;
	@JsonProperty("loc5CtryCd_3079")
	private String loc5CtryCd_3079;
	@JsonProperty("numEmpLocCtry5_3080")
	private Integer numEmpLocCtry5_3080;
	@JsonProperty("preEmpBkGrndChk_3081")
	private String preEmpBkGrndChk_3081;
	@JsonProperty("expProAndProcInPl_3082")
	private String expProAndProcInPl_3082;
	@JsonProperty("expBkGrndChkNotDn_3083")
	private String expBkGrndChkNotDn_3083;
	@JsonProperty("useIndContrctr_3085")
	private String useIndContrctr_3085;
	@JsonProperty("numOfUSIndContctrCurYr_3086")
	private Integer numOfUSIndContctrCurYr_3086;
	@JsonProperty("numOfUSIndContctrPrYr_3087")
	private Integer numOfUSIndContctrPrYr_3087;
	@JsonProperty("refNBkGrndChkIndCtr_3088")
	private String refNBkGrndChkIndCtr_3088;
	@JsonProperty("expRefNBkGrndChkIndCtr_3089")
	private String expRefNBkGrndChkIndCtr_3089;
	@JsonProperty("indContrFndsAcctPrpYN_3090")
	private String indContrFndsAcctPrpYN_3090;
	@JsonProperty("expIndContrFndsAcctPrp_3091")
	private String expIndContrFndsAcctPrp_3091;
	@JsonProperty("indContrSubjAppEmpYN_3092")
	private String indContrSubjAppEmpYN_3092;
	@JsonProperty("expIndContrSubjAppEmp_3093")
	private String expIndContrSubjAppEmp_3093;
	@JsonProperty("numChaptr_3095")
	private Integer numChaptr_3095;
	@JsonProperty("numMembr_3096")
	private Integer numMembr_3096;

	@JsonProperty("dateBeginBusCurOwnership_3002")
	public String getDateBeginBusCurOwnership_3002() {
		return dateBeginBusCurOwnership_3002;
	}

	@JsonProperty("dateBeginBusCurOwnership_3002")
	public void setDateBeginBusCurOwnership_3002(String dateBeginBusCurOwnership_3002) {
		this.dateBeginBusCurOwnership_3002 = dateBeginBusCurOwnership_3002;
	}

	@JsonProperty("businessRegAs_3003")
	public String getBusinessRegAs_3003() {
		return businessRegAs_3003;
	}

	@JsonProperty("businessRegAs_3003")
	public void setBusinessRegAs_3003(String businessRegAs_3003) {
		this.businessRegAs_3003 = businessRegAs_3003;
	}

	@JsonProperty("isCompCorpYN_3011")
	public String getIsCompCorpYN_3011() {
		return isCompCorpYN_3011;
	}

	@JsonProperty("isCompCorpYN_3011")
	public void setIsCompCorpYN_3011(String isCompCorpYN_3011) {
		this.isCompCorpYN_3011 = isCompCorpYN_3011;
	}

	@JsonProperty("isCompNFTYN_3012")
	public String getIsCompNFTYN_3012() {
		return isCompNFTYN_3012;
	}

	@JsonProperty("isCompNFTYN_3012")
	public void setIsCompNFTYN_3012(String isCompNFTYN_3012) {
		this.isCompNFTYN_3012 = isCompNFTYN_3012;
	}

	@JsonProperty("taxExmtStsYN_3013")
	public String getTaxExmtStsYN_3013() {
		return taxExmtStsYN_3013;
	}

	@JsonProperty("taxExmtStsYN_3013")
	public void setTaxExmtStsYN_3013(String taxExmtStsYN_3013) {
		this.taxExmtStsYN_3013 = taxExmtStsYN_3013;
	}

	@JsonProperty("taxExmtSts_3014")
	public String getTaxExmtSts_3014() {
		return taxExmtSts_3014;
	}

	@JsonProperty("taxExmtSts_3014")
	public void setTaxExmtSts_3014(String taxExmtSts_3014) {
		this.taxExmtSts_3014 = taxExmtSts_3014;
	}

	@JsonProperty("othTaxExmtSts_3021")
	public String getOthTaxExmtSts_3021() {
		return othTaxExmtSts_3021;
	}

	@JsonProperty("othTaxExmtSts_3021")
	public void setOthTaxExmtSts_3021(String othTaxExmtSts_3021) {
		this.othTaxExmtSts_3021 = othTaxExmtSts_3021;
	}

	@JsonProperty("dispTaxExmtSts_3022")
	public String getDispTaxExmtSts_3022() {
		return dispTaxExmtSts_3022;
	}

	@JsonProperty("dispTaxExmtSts_3022")
	public void setDispTaxExmtSts_3022(String dispTaxExmtSts_3022) {
		this.dispTaxExmtSts_3022 = dispTaxExmtSts_3022;
	}

	@JsonProperty("expDispTaxExmtSts_3023")
	public String getExpDispTaxExmtSts_3023() {
		return expDispTaxExmtSts_3023;
	}

	@JsonProperty("expDispTaxExmtSts_3023")
	public void setExpDispTaxExmtSts_3023(String expDispTaxExmtSts_3023) {
		this.expDispTaxExmtSts_3023 = expDispTaxExmtSts_3023;
	}

	@JsonProperty("totNumWrldEmp_3025")
	public Integer getTotNumWrldEmp_3025() {
		return totNumWrldEmp_3025;
	}

	@JsonProperty("totNumWrldEmp_3025")
	public void setTotNumWrldEmp_3025(Integer totNumWrldEmp_3025) {
		this.totNumWrldEmp_3025 = totNumWrldEmp_3025;
	}

	@JsonProperty("numOfInHseCsel_3026")
	public Integer getNumOfInHseCsel_3026() {
		return numOfInHseCsel_3026;
	}

	@JsonProperty("numOfInHseCsel_3026")
	public void setNumOfInHseCsel_3026(Integer numOfInHseCsel_3026) {
		this.numOfInHseCsel_3026 = numOfInHseCsel_3026;
	}

	@JsonProperty("numEmpFulCurYr_3029")
	public Integer getNumEmpFulCurYr_3029() {
		return numEmpFulCurYr_3029;
	}

	@JsonProperty("numEmpFulCurYr_3029")
	public void setNumEmpFulCurYr_3029(Integer numEmpFulCurYr_3029) {
		this.numEmpFulCurYr_3029 = numEmpFulCurYr_3029;
	}

	@JsonProperty("numEmpFulPrYr_3030")
	public Integer getNumEmpFulPrYr_3030() {
		return numEmpFulPrYr_3030;
	}

	@JsonProperty("numEmpFulPrYr_3030")
	public void setNumEmpFulPrYr_3030(Integer numEmpFulPrYr_3030) {
		this.numEmpFulPrYr_3030 = numEmpFulPrYr_3030;
	}

	@JsonProperty("numEmpPrtCurYr_3031")
	public Integer getNumEmpPrtCurYr_3031() {
		return numEmpPrtCurYr_3031;
	}

	@JsonProperty("numEmpPrtCurYr_3031")
	public void setNumEmpPrtCurYr_3031(Integer numEmpPrtCurYr_3031) {
		this.numEmpPrtCurYr_3031 = numEmpPrtCurYr_3031;
	}

	@JsonProperty("numEmpPrtPrYr_3032")
	public Integer getNumEmpPrtPrYr_3032() {
		return numEmpPrtPrYr_3032;
	}

	@JsonProperty("numEmpPrtPrYr_3032")
	public void setNumEmpPrtPrYr_3032(Integer numEmpPrtPrYr_3032) {
		this.numEmpPrtPrYr_3032 = numEmpPrtPrYr_3032;
	}

	@JsonProperty("numUnnEmpPrtCurYr_3033")
	public Integer getNumUnnEmpPrtCurYr_3033() {
		return numUnnEmpPrtCurYr_3033;
	}

	@JsonProperty("numUnnEmpPrtCurYr_3033")
	public void setNumUnnEmpPrtCurYr_3033(Integer numUnnEmpPrtCurYr_3033) {
		this.numUnnEmpPrtCurYr_3033 = numUnnEmpPrtCurYr_3033;
	}

	@JsonProperty("numUnnEmpPrtPrYr_3034")
	public Integer getNumUnnEmpPrtPrYr_3034() {
		return numUnnEmpPrtPrYr_3034;
	}

	@JsonProperty("numUnnEmpPrtPrYr_3034")
	public void setNumUnnEmpPrtPrYr_3034(Integer numUnnEmpPrtPrYr_3034) {
		this.numUnnEmpPrtPrYr_3034 = numUnnEmpPrtPrYr_3034;
	}

	@JsonProperty("numVolCurYr_3035")
	public Integer getNumVolCurYr_3035() {
		return numVolCurYr_3035;
	}

	@JsonProperty("numVolCurYr_3035")
	public void setNumVolCurYr_3035(Integer numVolCurYr_3035) {
		this.numVolCurYr_3035 = numVolCurYr_3035;
	}

	@JsonProperty("numVolPrYr_3036")
	public Integer getNumVolPrYr_3036() {
		return numVolPrYr_3036;
	}

	@JsonProperty("numVolPrYr_3036")
	public void setNumVolPrYr_3036(Integer numVolPrYr_3036) {
		this.numVolPrYr_3036 = numVolPrYr_3036;
	}

	@JsonProperty("empLocInCA_3037")
	public String getEmpLocInCA_3037() {
		return empLocInCA_3037;
	}

	@JsonProperty("empLocInCA_3037")
	public void setEmpLocInCA_3037(String empLocInCA_3037) {
		this.empLocInCA_3037 = empLocInCA_3037;
	}

	@JsonProperty("numEmpCACurYr_3040")
	public Integer getNumEmpCACurYr_3040() {
		return numEmpCACurYr_3040;
	}

	@JsonProperty("numEmpCACurYr_3040")
	public void setNumEmpCACurYr_3040(Integer numEmpCACurYr_3040) {
		this.numEmpCACurYr_3040 = numEmpCACurYr_3040;
	}

	@JsonProperty("numEmpCAPrYr_3041")
	public Integer getNumEmpCAPrYr_3041() {
		return numEmpCAPrYr_3041;
	}

	@JsonProperty("numEmpCAPrYr_3041")
	public void setNumEmpCAPrYr_3041(Integer numEmpCAPrYr_3041) {
		this.numEmpCAPrYr_3041 = numEmpCAPrYr_3041;
	}

	@JsonProperty("empLocOutOfUS_3042")
	public String getEmpLocOutOfUS_3042() {
		return empLocOutOfUS_3042;
	}

	@JsonProperty("empLocOutOfUS_3042")
	public void setEmpLocOutOfUS_3042(String empLocOutOfUS_3042) {
		this.empLocOutOfUS_3042 = empLocOutOfUS_3042;
	}

	@JsonProperty("numEmpOutUSCurYr_3045")
	public Integer getNumEmpOutUSCurYr_3045() {
		return numEmpOutUSCurYr_3045;
	}

	@JsonProperty("numEmpOutUSCurYr_3045")
	public void setNumEmpOutUSCurYr_3045(Integer numEmpOutUSCurYr_3045) {
		this.numEmpOutUSCurYr_3045 = numEmpOutUSCurYr_3045;
	}

	@JsonProperty("numEmpOutUSPrYr_3046")
	public Integer getNumEmpOutUSPrYr_3046() {
		return numEmpOutUSPrYr_3046;
	}

	@JsonProperty("numEmpOutUSPrYr_3046")
	public void setNumEmpOutUSPrYr_3046(Integer numEmpOutUSPrYr_3046) {
		this.numEmpOutUSPrYr_3046 = numEmpOutUSPrYr_3046;
	}

	@JsonProperty("maxNumLeasEmp_3048")
	public Integer getMaxNumLeasEmp_3048() {
		return maxNumLeasEmp_3048;
	}

	@JsonProperty("maxNumLeasEmp_3048")
	public void setMaxNumLeasEmp_3048(Integer maxNumLeasEmp_3048) {
		this.maxNumLeasEmp_3048 = maxNumLeasEmp_3048;
	}

	@JsonProperty("maxNumSeaEmp_3049")
	public Integer getMaxNumSeaEmp_3049() {
		return maxNumSeaEmp_3049;
	}

	@JsonProperty("maxNumSeaEmp_3049")
	public void setMaxNumSeaEmp_3049(Integer maxNumSeaEmp_3049) {
		this.maxNumSeaEmp_3049 = maxNumSeaEmp_3049;
	}

	@JsonProperty("maxNumTempEmp_3050")
	public Integer getMaxNumTempEmp_3050() {
		return maxNumTempEmp_3050;
	}

	@JsonProperty("maxNumTempEmp_3050")
	public void setMaxNumTempEmp_3050(Integer maxNumTempEmp_3050) {
		this.maxNumTempEmp_3050 = maxNumTempEmp_3050;
	}

	@JsonProperty("diffCtryAppEmp_3052")
	public Integer getDiffCtryAppEmp_3052() {
		return diffCtryAppEmp_3052;
	}

	@JsonProperty("diffCtryAppEmp_3052")
	public void setDiffCtryAppEmp_3052(Integer diffCtryAppEmp_3052) {
		this.diffCtryAppEmp_3052 = diffCtryAppEmp_3052;
	}

	@JsonProperty("numUSLocEmp_3053")
	public Integer getNumUSLocEmp_3053() {
		return numUSLocEmp_3053;
	}

	@JsonProperty("numUSLocEmp_3053")
	public void setNumUSLocEmp_3053(Integer numUSLocEmp_3053) {
		this.numUSLocEmp_3053 = numUSLocEmp_3053;
	}

	@JsonProperty("loc1StCd_3057")
	public String getLoc1StCd_3057() {
		return loc1StCd_3057;
	}

	@JsonProperty("loc1StCd_3057")
	public void setLoc1StCd_3057(String loc1StCd_3057) {
		this.loc1StCd_3057 = loc1StCd_3057;
	}

	@JsonProperty("numEmpLoc1_3058")
	public Integer getNumEmpLoc1_3058() {
		return numEmpLoc1_3058;
	}

	@JsonProperty("numEmpLoc1_3058")
	public void setNumEmpLoc1_3058(Integer numEmpLoc1_3058) {
		this.numEmpLoc1_3058 = numEmpLoc1_3058;
	}

	@JsonProperty("loc2StCd_3059")
	public String getLoc2StCd_3059() {
		return loc2StCd_3059;
	}

	@JsonProperty("loc2StCd_3059")
	public void setLoc2StCd_3059(String loc2StCd_3059) {
		this.loc2StCd_3059 = loc2StCd_3059;
	}

	@JsonProperty("numEmpLoc2_3060")
	public Integer getNumEmpLoc2_3060() {
		return numEmpLoc2_3060;
	}

	@JsonProperty("numEmpLoc2_3060")
	public void setNumEmpLoc2_3060(Integer numEmpLoc2_3060) {
		this.numEmpLoc2_3060 = numEmpLoc2_3060;
	}

	@JsonProperty("loc3StCd_3061")
	public String getLoc3StCd_3061() {
		return loc3StCd_3061;
	}

	@JsonProperty("loc3StCd_3061")
	public void setLoc3StCd_3061(String loc3StCd_3061) {
		this.loc3StCd_3061 = loc3StCd_3061;
	}

	@JsonProperty("numEmpLoc3_3062")
	public Integer getNumEmpLoc3_3062() {
		return numEmpLoc3_3062;
	}

	@JsonProperty("numEmpLoc3_3062")
	public void setNumEmpLoc3_3062(Integer numEmpLoc3_3062) {
		this.numEmpLoc3_3062 = numEmpLoc3_3062;
	}

	@JsonProperty("loc4StCd_3063")
	public String getLoc4StCd_3063() {
		return loc4StCd_3063;
	}

	@JsonProperty("loc4StCd_3063")
	public void setLoc4StCd_3063(String loc4StCd_3063) {
		this.loc4StCd_3063 = loc4StCd_3063;
	}

	@JsonProperty("numEmpLoc4_3064")
	public Integer getNumEmpLoc4_3064() {
		return numEmpLoc4_3064;
	}

	@JsonProperty("numEmpLoc4_3064")
	public void setNumEmpLoc4_3064(Integer numEmpLoc4_3064) {
		this.numEmpLoc4_3064 = numEmpLoc4_3064;
	}

	@JsonProperty("loc5StCd_3065")
	public String getLoc5StCd_3065() {
		return loc5StCd_3065;
	}

	@JsonProperty("loc5StCd_3065")
	public void setLoc5StCd_3065(String loc5StCd_3065) {
		this.loc5StCd_3065 = loc5StCd_3065;
	}

	@JsonProperty("numEmpLoc5_3066")
	public Integer getNumEmpLoc5_3066() {
		return numEmpLoc5_3066;
	}

	@JsonProperty("numEmpLoc5_3066")
	public void setNumEmpLoc5_3066(Integer numEmpLoc5_3066) {
		this.numEmpLoc5_3066 = numEmpLoc5_3066;
	}

	@JsonProperty("numLocOutUSWthEmp_3067")
	public Integer getNumLocOutUSWthEmp_3067() {
		return numLocOutUSWthEmp_3067;
	}

	@JsonProperty("numLocOutUSWthEmp_3067")
	public void setNumLocOutUSWthEmp_3067(Integer numLocOutUSWthEmp_3067) {
		this.numLocOutUSWthEmp_3067 = numLocOutUSWthEmp_3067;
	}

	@JsonProperty("loc1CtryCd_3071")
	public String getLoc1CtryCd_3071() {
		return loc1CtryCd_3071;
	}

	@JsonProperty("loc1CtryCd_3071")
	public void setLoc1CtryCd_3071(String loc1CtryCd_3071) {
		this.loc1CtryCd_3071 = loc1CtryCd_3071;
	}

	@JsonProperty("numEmpLocCtry1_3072")
	public Integer getNumEmpLocCtry1_3072() {
		return numEmpLocCtry1_3072;
	}

	@JsonProperty("numEmpLocCtry1_3072")
	public void setNumEmpLocCtry1_3072(Integer numEmpLocCtry1_3072) {
		this.numEmpLocCtry1_3072 = numEmpLocCtry1_3072;
	}

	@JsonProperty("loc2CtryCd_3073")
	public String getLoc2CtryCd_3073() {
		return loc2CtryCd_3073;
	}

	@JsonProperty("loc2CtryCd_3073")
	public void setLoc2CtryCd_3073(String loc2CtryCd_3073) {
		this.loc2CtryCd_3073 = loc2CtryCd_3073;
	}

	@JsonProperty("numEmpLocCtry2_3074")
	public Integer getNumEmpLocCtry2_3074() {
		return numEmpLocCtry2_3074;
	}

	@JsonProperty("numEmpLocCtry2_3074")
	public void setNumEmpLocCtry2_3074(Integer numEmpLocCtry2_3074) {
		this.numEmpLocCtry2_3074 = numEmpLocCtry2_3074;
	}

	@JsonProperty("loc3CtryCd_3075")
	public String getLoc3CtryCd_3075() {
		return loc3CtryCd_3075;
	}

	@JsonProperty("loc3CtryCd_3075")
	public void setLoc3CtryCd_3075(String loc3CtryCd_3075) {
		this.loc3CtryCd_3075 = loc3CtryCd_3075;
	}

	@JsonProperty("numEmpLocCtry3_3076")
	public Integer getNumEmpLocCtry3_3076() {
		return numEmpLocCtry3_3076;
	}

	@JsonProperty("numEmpLocCtry3_3076")
	public void setNumEmpLocCtry3_3076(Integer numEmpLocCtry3_3076) {
		this.numEmpLocCtry3_3076 = numEmpLocCtry3_3076;
	}

	@JsonProperty("loc4CtryCd_3077")
	public String getLoc4CtryCd_3077() {
		return loc4CtryCd_3077;
	}

	@JsonProperty("loc4CtryCd_3077")
	public void setLoc4CtryCd_3077(String loc4CtryCd_3077) {
		this.loc4CtryCd_3077 = loc4CtryCd_3077;
	}

	@JsonProperty("numEmpLocCtry4_3078")
	public Integer getNumEmpLocCtry4_3078() {
		return numEmpLocCtry4_3078;
	}

	@JsonProperty("numEmpLocCtry4_3078")
	public void setNumEmpLocCtry4_3078(Integer numEmpLocCtry4_3078) {
		this.numEmpLocCtry4_3078 = numEmpLocCtry4_3078;
	}

	@JsonProperty("loc5CtryCd_3079")
	public String getLoc5CtryCd_3079() {
		return loc5CtryCd_3079;
	}

	@JsonProperty("loc5CtryCd_3079")
	public void setLoc5CtryCd_3079(String loc5CtryCd_3079) {
		this.loc5CtryCd_3079 = loc5CtryCd_3079;
	}

	@JsonProperty("numEmpLocCtry5_3080")
	public Integer getNumEmpLocCtry5_3080() {
		return numEmpLocCtry5_3080;
	}

	@JsonProperty("numEmpLocCtry5_3080")
	public void setNumEmpLocCtry5_3080(Integer numEmpLocCtry5_3080) {
		this.numEmpLocCtry5_3080 = numEmpLocCtry5_3080;
	}

	@JsonProperty("preEmpBkGrndChk_3081")
	public String getPreEmpBkGrndChk_3081() {
		return preEmpBkGrndChk_3081;
	}

	@JsonProperty("preEmpBkGrndChk_3081")
	public void setPreEmpBkGrndChk_3081(String preEmpBkGrndChk_3081) {
		this.preEmpBkGrndChk_3081 = preEmpBkGrndChk_3081;
	}

	@JsonProperty("expProAndProcInPl_3082")
	public String getExpProAndProcInPl_3082() {
		return expProAndProcInPl_3082;
	}

	@JsonProperty("expProAndProcInPl_3082")
	public void setExpProAndProcInPl_3082(String expProAndProcInPl_3082) {
		this.expProAndProcInPl_3082 = expProAndProcInPl_3082;
	}

	@JsonProperty("expBkGrndChkNotDn_3083")
	public String getExpBkGrndChkNotDn_3083() {
		return expBkGrndChkNotDn_3083;
	}

	@JsonProperty("expBkGrndChkNotDn_3083")
	public void setExpBkGrndChkNotDn_3083(String expBkGrndChkNotDn_3083) {
		this.expBkGrndChkNotDn_3083 = expBkGrndChkNotDn_3083;
	}

	@JsonProperty("useIndContrctr_3085")
	public String getUseIndContrctr_3085() {
		return useIndContrctr_3085;
	}

	@JsonProperty("useIndContrctr_3085")
	public void setUseIndContrctr_3085(String useIndContrctr_3085) {
		this.useIndContrctr_3085 = useIndContrctr_3085;
	}

	@JsonProperty("numOfUSIndContctrCurYr_3086")
	public Integer getNumOfUSIndContctrCurYr_3086() {
		return numOfUSIndContctrCurYr_3086;
	}

	@JsonProperty("numOfUSIndContctrCurYr_3086")
	public void setNumOfUSIndContctrCurYr_3086(Integer numOfUSIndContctrCurYr_3086) {
		this.numOfUSIndContctrCurYr_3086 = numOfUSIndContctrCurYr_3086;
	}

	@JsonProperty("numOfUSIndContctrPrYr_3087")
	public Integer getNumOfUSIndContctrPrYr_3087() {
		return numOfUSIndContctrPrYr_3087;
	}

	@JsonProperty("numOfUSIndContctrPrYr_3087")
	public void setNumOfUSIndContctrPrYr_3087(Integer numOfUSIndContctrPrYr_3087) {
		this.numOfUSIndContctrPrYr_3087 = numOfUSIndContctrPrYr_3087;
	}

	@JsonProperty("refNBkGrndChkIndCtr_3088")
	public String getRefNBkGrndChkIndCtr_3088() {
		return refNBkGrndChkIndCtr_3088;
	}

	@JsonProperty("refNBkGrndChkIndCtr_3088")
	public void setRefNBkGrndChkIndCtr_3088(String refNBkGrndChkIndCtr_3088) {
		this.refNBkGrndChkIndCtr_3088 = refNBkGrndChkIndCtr_3088;
	}

	@JsonProperty("expRefNBkGrndChkIndCtr_3089")
	public String getExpRefNBkGrndChkIndCtr_3089() {
		return expRefNBkGrndChkIndCtr_3089;
	}

	@JsonProperty("expRefNBkGrndChkIndCtr_3089")
	public void setExpRefNBkGrndChkIndCtr_3089(String expRefNBkGrndChkIndCtr_3089) {
		this.expRefNBkGrndChkIndCtr_3089 = expRefNBkGrndChkIndCtr_3089;
	}

	@JsonProperty("indContrFndsAcctPrpYN_3090")
	public String getIndContrFndsAcctPrpYN_3090() {
		return indContrFndsAcctPrpYN_3090;
	}

	@JsonProperty("indContrFndsAcctPrpYN_3090")
	public void setIndContrFndsAcctPrpYN_3090(String indContrFndsAcctPrpYN_3090) {
		this.indContrFndsAcctPrpYN_3090 = indContrFndsAcctPrpYN_3090;
	}

	@JsonProperty("expIndContrFndsAcctPrp_3091")
	public String getExpIndContrFndsAcctPrp_3091() {
		return expIndContrFndsAcctPrp_3091;
	}

	@JsonProperty("expIndContrFndsAcctPrp_3091")
	public void setExpIndContrFndsAcctPrp_3091(String expIndContrFndsAcctPrp_3091) {
		this.expIndContrFndsAcctPrp_3091 = expIndContrFndsAcctPrp_3091;
	}

	@JsonProperty("indContrSubjAppEmpYN_3092")
	public String getIndContrSubjAppEmpYN_3092() {
		return indContrSubjAppEmpYN_3092;
	}

	@JsonProperty("indContrSubjAppEmpYN_3092")
	public void setIndContrSubjAppEmpYN_3092(String indContrSubjAppEmpYN_3092) {
		this.indContrSubjAppEmpYN_3092 = indContrSubjAppEmpYN_3092;
	}

	@JsonProperty("expIndContrSubjAppEmp_3093")
	public String getExpIndContrSubjAppEmp_3093() {
		return expIndContrSubjAppEmp_3093;
	}

	@JsonProperty("expIndContrSubjAppEmp_3093")
	public void setExpIndContrSubjAppEmp_3093(String expIndContrSubjAppEmp_3093) {
		this.expIndContrSubjAppEmp_3093 = expIndContrSubjAppEmp_3093;
	}

	@JsonProperty("numChaptr_3095")
	public Integer getNumChaptr_3095() {
		return numChaptr_3095;
	}

	@JsonProperty("numChaptr_3095")
	public void setNumChaptr_3095(Integer numChaptr_3095) {
		this.numChaptr_3095 = numChaptr_3095;
	}

	@JsonProperty("numMembr_3096")
	public Integer getNumMembr_3096() {
		return numMembr_3096;
	}

	@JsonProperty("numMembr_3096")
	public void setNumMembr_3096(Integer numMembr_3096) {
		this.numMembr_3096 = numMembr_3096;
	}

}