package com.arch.fpl.hub.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "empPracLmt_10002", "retLmt_10011", "volTermin12Mon_10025", "volTermin12MonPct_10026",
		"inVolTermin12Mon_10027", "inVolTermin12MonPct_10028", "layOffDnSiz12Mon_10029", "layOffDnSiz12MonPct_10030",
		"volTermin1224Mon_10032", "volTermin1224MonPct_10033", "inVolTermin1224Mon_10034",
		"inVolTermin1224MonPct_10035", "layOffDnSiz1224Mon_10036", "layOffDnSiz1224MonPct_10037",
		"volTermin2436Mon_10039", "volTermin2436MonPct_10040", "inVolTermin2436Mon_10041",
		"inVolTermin2436MonPct_10042", "layOffDnSiz2436Mon_10043", "layOffDnSiz2436MonPct_10044",
		"pctUSCyEmpSal60K_10047", "pctUSCyEmpSal60120K_10048", "pctUSCyEmpSalGT120K_10049", "pctUSPyEmpSal60K_10051",
		"pctUSPyEmpSal60120K_10052", "pctUSPyEmpSalGT120K_10053", "empSalRngLT50K_10055", "empSalRngGT100K_10056",
		"wthPst24InvTermLyOff_10057", "humResPersn_10059", "attWithExpEmpLaw_10060", "noneOfAbove_10061",
		"doProvPkgLdEmpYN_10062", "doSevAgrEmpRtWaivYN_10063", "prosEmpAplPriHreYN_10064", "eqlOppEmplYN_10066",
		"antDisYN_10067", "antSexHarYN_10068", "empAtWilYN_10069", "progDispYN_10070", "hndComSexHarDisYN_10071",
		"rptInvResEmpComYN_10072", "adaAccYN_10073", "clasStsLabStdYN_10074", "fmlaYN_10075", "retalYN_10076",
		"provExpProcPolcInPl_10077", "durPst12RedWrkYN_10079", "wilLayRedTotWrkYN_10080", "procCndtStfRedMgntLvl_10081",
		"anyzPrtClsStfRedYN_10082", "anysRevOutCounYN_10083" })
public class PolicyEmploymentPracticesLiability {

	@JsonProperty("empPracLmt_10002")
	private Integer empPracLmt_10002;
	@JsonProperty("retLmt_10011")
	private Integer retLmt_10011;
	@JsonProperty("volTermin12Mon_10025")
	private Integer volTermin12Mon_10025;
	@JsonProperty("volTermin12MonPct_10026")
	private Double volTermin12MonPct_10026;
	@JsonProperty("inVolTermin12Mon_10027")
	private Integer inVolTermin12Mon_10027;
	@JsonProperty("inVolTermin12MonPct_10028")
	private Double inVolTermin12MonPct_10028;
	@JsonProperty("layOffDnSiz12Mon_10029")
	private Integer layOffDnSiz12Mon_10029;
	@JsonProperty("layOffDnSiz12MonPct_10030")
	private Double layOffDnSiz12MonPct_10030;
	@JsonProperty("volTermin1224Mon_10032")
	private Integer volTermin1224Mon_10032;
	@JsonProperty("volTermin1224MonPct_10033")
	private Double volTermin1224MonPct_10033;
	@JsonProperty("inVolTermin1224Mon_10034")
	private Integer inVolTermin1224Mon_10034;
	@JsonProperty("inVolTermin1224MonPct_10035")
	private Double inVolTermin1224MonPct_10035;
	@JsonProperty("layOffDnSiz1224Mon_10036")
	private Integer layOffDnSiz1224Mon_10036;
	@JsonProperty("layOffDnSiz1224MonPct_10037")
	private Double layOffDnSiz1224MonPct_10037;
	@JsonProperty("volTermin2436Mon_10039")
	private Integer volTermin2436Mon_10039;
	@JsonProperty("volTermin2436MonPct_10040")
	private Double volTermin2436MonPct_10040;
	@JsonProperty("inVolTermin2436Mon_10041")
	private Integer inVolTermin2436Mon_10041;
	@JsonProperty("inVolTermin2436MonPct_10042")
	private Double inVolTermin2436MonPct_10042;
	@JsonProperty("layOffDnSiz2436Mon_10043")
	private Integer layOffDnSiz2436Mon_10043;
	@JsonProperty("layOffDnSiz2436MonPct_10044")
	private Double layOffDnSiz2436MonPct_10044;
	@JsonProperty("pctUSCyEmpSal60K_10047")
	private Double pctUSCyEmpSal60K_10047;
	@JsonProperty("pctUSCyEmpSal60120K_10048")
	private Double pctUSCyEmpSal60120K_10048;
	@JsonProperty("pctUSCyEmpSalGT120K_10049")
	private Double pctUSCyEmpSalGT120K_10049;
	@JsonProperty("pctUSPyEmpSal60K_10051")
	private Double pctUSPyEmpSal60K_10051;
	@JsonProperty("pctUSPyEmpSal60120K_10052")
	private Double pctUSPyEmpSal60120K_10052;
	@JsonProperty("pctUSPyEmpSalGT120K_10053")
	private Double pctUSPyEmpSalGT120K_10053;
	@JsonProperty("empSalRngLT50K_10055")
	private Integer empSalRngLT50K_10055;
	@JsonProperty("empSalRngGT100K_10056")
	private Integer empSalRngGT100K_10056;
	@JsonProperty("wthPst24InvTermLyOff_10057")
	private Integer wthPst24InvTermLyOff_10057;
	@JsonProperty("humResPersn_10059")
	private Boolean humResPersn_10059;
	@JsonProperty("attWithExpEmpLaw_10060")
	private Boolean attWithExpEmpLaw_10060;
	@JsonProperty("noneOfAbove_10061")
	private Boolean noneOfAbove_10061;
	@JsonProperty("doProvPkgLdEmpYN_10062")
	private String doProvPkgLdEmpYN_10062;
	@JsonProperty("doSevAgrEmpRtWaivYN_10063")
	private String doSevAgrEmpRtWaivYN_10063;
	@JsonProperty("prosEmpAplPriHreYN_10064")
	private String prosEmpAplPriHreYN_10064;
	@JsonProperty("eqlOppEmplYN_10066")
	private String eqlOppEmplYN_10066;
	@JsonProperty("antDisYN_10067")
	private String antDisYN_10067;
	@JsonProperty("antSexHarYN_10068")
	private String antSexHarYN_10068;
	@JsonProperty("empAtWilYN_10069")
	private String empAtWilYN_10069;
	@JsonProperty("progDispYN_10070")
	private String progDispYN_10070;
	@JsonProperty("hndComSexHarDisYN_10071")
	private String hndComSexHarDisYN_10071;
	@JsonProperty("rptInvResEmpComYN_10072")
	private String rptInvResEmpComYN_10072;
	@JsonProperty("adaAccYN_10073")
	private String adaAccYN_10073;
	@JsonProperty("clasStsLabStdYN_10074")
	private String clasStsLabStdYN_10074;
	@JsonProperty("fmlaYN_10075")
	private String fmlaYN_10075;
	@JsonProperty("retalYN_10076")
	private String retalYN_10076;
	@JsonProperty("provExpProcPolcInPl_10077")
	private String provExpProcPolcInPl_10077;
	@JsonProperty("durPst12RedWrkYN_10079")
	private String durPst12RedWrkYN_10079;
	@JsonProperty("wilLayRedTotWrkYN_10080")
	private String wilLayRedTotWrkYN_10080;
	@JsonProperty("procCndtStfRedMgntLvl_10081")
	private String procCndtStfRedMgntLvl_10081;
	@JsonProperty("anyzPrtClsStfRedYN_10082")
	private String anyzPrtClsStfRedYN_10082;
	@JsonProperty("anysRevOutCounYN_10083")
	private String anysRevOutCounYN_10083;

	@JsonProperty("empPracLmt_10002")
	public Integer getEmpPracLmt_10002() {
		return empPracLmt_10002;
	}

	@JsonProperty("empPracLmt_10002")
	public void setEmpPracLmt_10002(Integer empPracLmt_10002) {
		this.empPracLmt_10002 = empPracLmt_10002;
	}

	@JsonProperty("retLmt_10011")
	public Integer getRetLmt_10011() {
		return retLmt_10011;
	}

	@JsonProperty("retLmt_10011")
	public void setRetLmt_10011(Integer retLmt_10011) {
		this.retLmt_10011 = retLmt_10011;
	}

	@JsonProperty("volTermin12Mon_10025")
	public Integer getVolTermin12Mon_10025() {
		return volTermin12Mon_10025;
	}

	@JsonProperty("volTermin12Mon_10025")
	public void setVolTermin12Mon_10025(Integer volTermin12Mon_10025) {
		this.volTermin12Mon_10025 = volTermin12Mon_10025;
	}

	@JsonProperty("volTermin12MonPct_10026")
	public Double getVolTermin12MonPct_10026() {
		return volTermin12MonPct_10026;
	}

	@JsonProperty("volTermin12MonPct_10026")
	public void setVolTermin12MonPct_10026(Double volTermin12MonPct_10026) {
		this.volTermin12MonPct_10026 = volTermin12MonPct_10026;
	}

	@JsonProperty("inVolTermin12Mon_10027")
	public Integer getInVolTermin12Mon_10027() {
		return inVolTermin12Mon_10027;
	}

	@JsonProperty("inVolTermin12Mon_10027")
	public void setInVolTermin12Mon_10027(Integer inVolTermin12Mon_10027) {
		this.inVolTermin12Mon_10027 = inVolTermin12Mon_10027;
	}

	@JsonProperty("inVolTermin12MonPct_10028")
	public Double getInVolTermin12MonPct_10028() {
		return inVolTermin12MonPct_10028;
	}

	@JsonProperty("inVolTermin12MonPct_10028")
	public void setInVolTermin12MonPct_10028(Double inVolTermin12MonPct_10028) {
		this.inVolTermin12MonPct_10028 = inVolTermin12MonPct_10028;
	}

	@JsonProperty("layOffDnSiz12Mon_10029")
	public Integer getLayOffDnSiz12Mon_10029() {
		return layOffDnSiz12Mon_10029;
	}

	@JsonProperty("layOffDnSiz12Mon_10029")
	public void setLayOffDnSiz12Mon_10029(Integer layOffDnSiz12Mon_10029) {
		this.layOffDnSiz12Mon_10029 = layOffDnSiz12Mon_10029;
	}

	@JsonProperty("layOffDnSiz12MonPct_10030")
	public Double getLayOffDnSiz12MonPct_10030() {
		return layOffDnSiz12MonPct_10030;
	}

	@JsonProperty("layOffDnSiz12MonPct_10030")
	public void setLayOffDnSiz12MonPct_10030(Double layOffDnSiz12MonPct_10030) {
		this.layOffDnSiz12MonPct_10030 = layOffDnSiz12MonPct_10030;
	}

	@JsonProperty("volTermin1224Mon_10032")
	public Integer getVolTermin1224Mon_10032() {
		return volTermin1224Mon_10032;
	}

	@JsonProperty("volTermin1224Mon_10032")
	public void setVolTermin1224Mon_10032(Integer volTermin1224Mon_10032) {
		this.volTermin1224Mon_10032 = volTermin1224Mon_10032;
	}

	@JsonProperty("volTermin1224MonPct_10033")
	public Double getVolTermin1224MonPct_10033() {
		return volTermin1224MonPct_10033;
	}

	@JsonProperty("volTermin1224MonPct_10033")
	public void setVolTermin1224MonPct_10033(Double volTermin1224MonPct_10033) {
		this.volTermin1224MonPct_10033 = volTermin1224MonPct_10033;
	}

	@JsonProperty("inVolTermin1224Mon_10034")
	public Integer getInVolTermin1224Mon_10034() {
		return inVolTermin1224Mon_10034;
	}

	@JsonProperty("inVolTermin1224Mon_10034")
	public void setInVolTermin1224Mon_10034(Integer inVolTermin1224Mon_10034) {
		this.inVolTermin1224Mon_10034 = inVolTermin1224Mon_10034;
	}

	@JsonProperty("inVolTermin1224MonPct_10035")
	public Double getInVolTermin1224MonPct_10035() {
		return inVolTermin1224MonPct_10035;
	}

	@JsonProperty("inVolTermin1224MonPct_10035")
	public void setInVolTermin1224MonPct_10035(Double inVolTermin1224MonPct_10035) {
		this.inVolTermin1224MonPct_10035 = inVolTermin1224MonPct_10035;
	}

	@JsonProperty("layOffDnSiz1224Mon_10036")
	public Integer getLayOffDnSiz1224Mon_10036() {
		return layOffDnSiz1224Mon_10036;
	}

	@JsonProperty("layOffDnSiz1224Mon_10036")
	public void setLayOffDnSiz1224Mon_10036(Integer layOffDnSiz1224Mon_10036) {
		this.layOffDnSiz1224Mon_10036 = layOffDnSiz1224Mon_10036;
	}

	@JsonProperty("layOffDnSiz1224MonPct_10037")
	public Double getLayOffDnSiz1224MonPct_10037() {
		return layOffDnSiz1224MonPct_10037;
	}

	@JsonProperty("layOffDnSiz1224MonPct_10037")
	public void setLayOffDnSiz1224MonPct_10037(Double layOffDnSiz1224MonPct_10037) {
		this.layOffDnSiz1224MonPct_10037 = layOffDnSiz1224MonPct_10037;
	}

	@JsonProperty("volTermin2436Mon_10039")
	public Integer getVolTermin2436Mon_10039() {
		return volTermin2436Mon_10039;
	}

	@JsonProperty("volTermin2436Mon_10039")
	public void setVolTermin2436Mon_10039(Integer volTermin2436Mon_10039) {
		this.volTermin2436Mon_10039 = volTermin2436Mon_10039;
	}

	@JsonProperty("volTermin2436MonPct_10040")
	public Double getVolTermin2436MonPct_10040() {
		return volTermin2436MonPct_10040;
	}

	@JsonProperty("volTermin2436MonPct_10040")
	public void setVolTermin2436MonPct_10040(Double volTermin2436MonPct_10040) {
		this.volTermin2436MonPct_10040 = volTermin2436MonPct_10040;
	}

	@JsonProperty("inVolTermin2436Mon_10041")
	public Integer getInVolTermin2436Mon_10041() {
		return inVolTermin2436Mon_10041;
	}

	@JsonProperty("inVolTermin2436Mon_10041")
	public void setInVolTermin2436Mon_10041(Integer inVolTermin2436Mon_10041) {
		this.inVolTermin2436Mon_10041 = inVolTermin2436Mon_10041;
	}

	@JsonProperty("inVolTermin2436MonPct_10042")
	public Double getInVolTermin2436MonPct_10042() {
		return inVolTermin2436MonPct_10042;
	}

	@JsonProperty("inVolTermin2436MonPct_10042")
	public void setInVolTermin2436MonPct_10042(Double inVolTermin2436MonPct_10042) {
		this.inVolTermin2436MonPct_10042 = inVolTermin2436MonPct_10042;
	}

	@JsonProperty("layOffDnSiz2436Mon_10043")
	public Integer getLayOffDnSiz2436Mon_10043() {
		return layOffDnSiz2436Mon_10043;
	}

	@JsonProperty("layOffDnSiz2436Mon_10043")
	public void setLayOffDnSiz2436Mon_10043(Integer layOffDnSiz2436Mon_10043) {
		this.layOffDnSiz2436Mon_10043 = layOffDnSiz2436Mon_10043;
	}

	@JsonProperty("layOffDnSiz2436MonPct_10044")
	public Double getLayOffDnSiz2436MonPct_10044() {
		return layOffDnSiz2436MonPct_10044;
	}

	@JsonProperty("layOffDnSiz2436MonPct_10044")
	public void setLayOffDnSiz2436MonPct_10044(Double layOffDnSiz2436MonPct_10044) {
		this.layOffDnSiz2436MonPct_10044 = layOffDnSiz2436MonPct_10044;
	}

	@JsonProperty("pctUSCyEmpSal60K_10047")
	public Double getPctUSCyEmpSal60K_10047() {
		return pctUSCyEmpSal60K_10047;
	}

	@JsonProperty("pctUSCyEmpSal60K_10047")
	public void setPctUSCyEmpSal60K_10047(Double pctUSCyEmpSal60K_10047) {
		this.pctUSCyEmpSal60K_10047 = pctUSCyEmpSal60K_10047;
	}

	@JsonProperty("pctUSCyEmpSal60120K_10048")
	public Double getPctUSCyEmpSal60120K_10048() {
		return pctUSCyEmpSal60120K_10048;
	}

	@JsonProperty("pctUSCyEmpSal60120K_10048")
	public void setPctUSCyEmpSal60120K_10048(Double pctUSCyEmpSal60120K_10048) {
		this.pctUSCyEmpSal60120K_10048 = pctUSCyEmpSal60120K_10048;
	}

	@JsonProperty("pctUSCyEmpSalGT120K_10049")
	public Double getPctUSCyEmpSalGT120K_10049() {
		return pctUSCyEmpSalGT120K_10049;
	}

	@JsonProperty("pctUSCyEmpSalGT120K_10049")
	public void setPctUSCyEmpSalGT120K_10049(Double pctUSCyEmpSalGT120K_10049) {
		this.pctUSCyEmpSalGT120K_10049 = pctUSCyEmpSalGT120K_10049;
	}

	@JsonProperty("pctUSPyEmpSal60K_10051")
	public Double getPctUSPyEmpSal60K_10051() {
		return pctUSPyEmpSal60K_10051;
	}

	@JsonProperty("pctUSPyEmpSal60K_10051")
	public void setPctUSPyEmpSal60K_10051(Double pctUSPyEmpSal60K_10051) {
		this.pctUSPyEmpSal60K_10051 = pctUSPyEmpSal60K_10051;
	}

	@JsonProperty("pctUSPyEmpSal60120K_10052")
	public Double getPctUSPyEmpSal60120K_10052() {
		return pctUSPyEmpSal60120K_10052;
	}

	@JsonProperty("pctUSPyEmpSal60120K_10052")
	public void setPctUSPyEmpSal60120K_10052(Double pctUSPyEmpSal60120K_10052) {
		this.pctUSPyEmpSal60120K_10052 = pctUSPyEmpSal60120K_10052;
	}

	@JsonProperty("pctUSPyEmpSalGT120K_10053")
	public Double getPctUSPyEmpSalGT120K_10053() {
		return pctUSPyEmpSalGT120K_10053;
	}

	@JsonProperty("pctUSPyEmpSalGT120K_10053")
	public void setPctUSPyEmpSalGT120K_10053(Double pctUSPyEmpSalGT120K_10053) {
		this.pctUSPyEmpSalGT120K_10053 = pctUSPyEmpSalGT120K_10053;
	}

	@JsonProperty("empSalRngLT50K_10055")
	public Integer getEmpSalRngLT50K_10055() {
		return empSalRngLT50K_10055;
	}

	@JsonProperty("empSalRngLT50K_10055")
	public void setEmpSalRngLT50K_10055(Integer empSalRngLT50K_10055) {
		this.empSalRngLT50K_10055 = empSalRngLT50K_10055;
	}

	@JsonProperty("empSalRngGT100K_10056")
	public Integer getEmpSalRngGT100K_10056() {
		return empSalRngGT100K_10056;
	}

	@JsonProperty("empSalRngGT100K_10056")
	public void setEmpSalRngGT100K_10056(Integer empSalRngGT100K_10056) {
		this.empSalRngGT100K_10056 = empSalRngGT100K_10056;
	}

	@JsonProperty("wthPst24InvTermLyOff_10057")
	public Integer getWthPst24InvTermLyOff_10057() {
		return wthPst24InvTermLyOff_10057;
	}

	@JsonProperty("wthPst24InvTermLyOff_10057")
	public void setWthPst24InvTermLyOff_10057(Integer wthPst24InvTermLyOff_10057) {
		this.wthPst24InvTermLyOff_10057 = wthPst24InvTermLyOff_10057;
	}

	@JsonProperty("humResPersn_10059")
	public Boolean getHumResPersn_10059() {
		return humResPersn_10059;
	}

	@JsonProperty("humResPersn_10059")
	public void setHumResPersn_10059(Boolean humResPersn_10059) {
		this.humResPersn_10059 = humResPersn_10059;
	}

	@JsonProperty("attWithExpEmpLaw_10060")
	public Boolean getAttWithExpEmpLaw_10060() {
		return attWithExpEmpLaw_10060;
	}

	@JsonProperty("attWithExpEmpLaw_10060")
	public void setAttWithExpEmpLaw_10060(Boolean attWithExpEmpLaw_10060) {
		this.attWithExpEmpLaw_10060 = attWithExpEmpLaw_10060;
	}

	@JsonProperty("noneOfAbove_10061")
	public Boolean getNoneOfAbove_10061() {
		return noneOfAbove_10061;
	}

	@JsonProperty("noneOfAbove_10061")
	public void setNoneOfAbove_10061(Boolean noneOfAbove_10061) {
		this.noneOfAbove_10061 = noneOfAbove_10061;
	}

	@JsonProperty("doProvPkgLdEmpYN_10062")
	public String getDoProvPkgLdEmpYN_10062() {
		return doProvPkgLdEmpYN_10062;
	}

	@JsonProperty("doProvPkgLdEmpYN_10062")
	public void setDoProvPkgLdEmpYN_10062(String doProvPkgLdEmpYN_10062) {
		this.doProvPkgLdEmpYN_10062 = doProvPkgLdEmpYN_10062;
	}

	@JsonProperty("doSevAgrEmpRtWaivYN_10063")
	public String getDoSevAgrEmpRtWaivYN_10063() {
		return doSevAgrEmpRtWaivYN_10063;
	}

	@JsonProperty("doSevAgrEmpRtWaivYN_10063")
	public void setDoSevAgrEmpRtWaivYN_10063(String doSevAgrEmpRtWaivYN_10063) {
		this.doSevAgrEmpRtWaivYN_10063 = doSevAgrEmpRtWaivYN_10063;
	}

	@JsonProperty("prosEmpAplPriHreYN_10064")
	public String getProsEmpAplPriHreYN_10064() {
		return prosEmpAplPriHreYN_10064;
	}

	@JsonProperty("prosEmpAplPriHreYN_10064")
	public void setProsEmpAplPriHreYN_10064(String prosEmpAplPriHreYN_10064) {
		this.prosEmpAplPriHreYN_10064 = prosEmpAplPriHreYN_10064;
	}

	@JsonProperty("eqlOppEmplYN_10066")
	public String getEqlOppEmplYN_10066() {
		return eqlOppEmplYN_10066;
	}

	@JsonProperty("eqlOppEmplYN_10066")
	public void setEqlOppEmplYN_10066(String eqlOppEmplYN_10066) {
		this.eqlOppEmplYN_10066 = eqlOppEmplYN_10066;
	}

	@JsonProperty("antDisYN_10067")
	public String getAntDisYN_10067() {
		return antDisYN_10067;
	}

	@JsonProperty("antDisYN_10067")
	public void setAntDisYN_10067(String antDisYN_10067) {
		this.antDisYN_10067 = antDisYN_10067;
	}

	@JsonProperty("antSexHarYN_10068")
	public String getAntSexHarYN_10068() {
		return antSexHarYN_10068;
	}

	@JsonProperty("antSexHarYN_10068")
	public void setAntSexHarYN_10068(String antSexHarYN_10068) {
		this.antSexHarYN_10068 = antSexHarYN_10068;
	}

	@JsonProperty("empAtWilYN_10069")
	public String getEmpAtWilYN_10069() {
		return empAtWilYN_10069;
	}

	@JsonProperty("empAtWilYN_10069")
	public void setEmpAtWilYN_10069(String empAtWilYN_10069) {
		this.empAtWilYN_10069 = empAtWilYN_10069;
	}

	@JsonProperty("progDispYN_10070")
	public String getProgDispYN_10070() {
		return progDispYN_10070;
	}

	@JsonProperty("progDispYN_10070")
	public void setProgDispYN_10070(String progDispYN_10070) {
		this.progDispYN_10070 = progDispYN_10070;
	}

	@JsonProperty("hndComSexHarDisYN_10071")
	public String getHndComSexHarDisYN_10071() {
		return hndComSexHarDisYN_10071;
	}

	@JsonProperty("hndComSexHarDisYN_10071")
	public void setHndComSexHarDisYN_10071(String hndComSexHarDisYN_10071) {
		this.hndComSexHarDisYN_10071 = hndComSexHarDisYN_10071;
	}

	@JsonProperty("rptInvResEmpComYN_10072")
	public String getRptInvResEmpComYN_10072() {
		return rptInvResEmpComYN_10072;
	}

	@JsonProperty("rptInvResEmpComYN_10072")
	public void setRptInvResEmpComYN_10072(String rptInvResEmpComYN_10072) {
		this.rptInvResEmpComYN_10072 = rptInvResEmpComYN_10072;
	}

	@JsonProperty("adaAccYN_10073")
	public String getAdaAccYN_10073() {
		return adaAccYN_10073;
	}

	@JsonProperty("adaAccYN_10073")
	public void setAdaAccYN_10073(String adaAccYN_10073) {
		this.adaAccYN_10073 = adaAccYN_10073;
	}

	@JsonProperty("clasStsLabStdYN_10074")
	public String getClasStsLabStdYN_10074() {
		return clasStsLabStdYN_10074;
	}

	@JsonProperty("clasStsLabStdYN_10074")
	public void setClasStsLabStdYN_10074(String clasStsLabStdYN_10074) {
		this.clasStsLabStdYN_10074 = clasStsLabStdYN_10074;
	}

	@JsonProperty("fmlaYN_10075")
	public String getFmlaYN_10075() {
		return fmlaYN_10075;
	}

	@JsonProperty("fmlaYN_10075")
	public void setFmlaYN_10075(String fmlaYN_10075) {
		this.fmlaYN_10075 = fmlaYN_10075;
	}

	@JsonProperty("retalYN_10076")
	public String getRetalYN_10076() {
		return retalYN_10076;
	}

	@JsonProperty("retalYN_10076")
	public void setRetalYN_10076(String retalYN_10076) {
		this.retalYN_10076 = retalYN_10076;
	}

	@JsonProperty("provExpProcPolcInPl_10077")
	public String getProvExpProcPolcInPl_10077() {
		return provExpProcPolcInPl_10077;
	}

	@JsonProperty("provExpProcPolcInPl_10077")
	public void setProvExpProcPolcInPl_10077(String provExpProcPolcInPl_10077) {
		this.provExpProcPolcInPl_10077 = provExpProcPolcInPl_10077;
	}

	@JsonProperty("durPst12RedWrkYN_10079")
	public String getDurPst12RedWrkYN_10079() {
		return durPst12RedWrkYN_10079;
	}

	@JsonProperty("durPst12RedWrkYN_10079")
	public void setDurPst12RedWrkYN_10079(String durPst12RedWrkYN_10079) {
		this.durPst12RedWrkYN_10079 = durPst12RedWrkYN_10079;
	}

	@JsonProperty("wilLayRedTotWrkYN_10080")
	public String getWilLayRedTotWrkYN_10080() {
		return wilLayRedTotWrkYN_10080;
	}

	@JsonProperty("wilLayRedTotWrkYN_10080")
	public void setWilLayRedTotWrkYN_10080(String wilLayRedTotWrkYN_10080) {
		this.wilLayRedTotWrkYN_10080 = wilLayRedTotWrkYN_10080;
	}

	@JsonProperty("procCndtStfRedMgntLvl_10081")
	public String getProcCndtStfRedMgntLvl_10081() {
		return procCndtStfRedMgntLvl_10081;
	}

	@JsonProperty("procCndtStfRedMgntLvl_10081")
	public void setProcCndtStfRedMgntLvl_10081(String procCndtStfRedMgntLvl_10081) {
		this.procCndtStfRedMgntLvl_10081 = procCndtStfRedMgntLvl_10081;
	}

	@JsonProperty("anyzPrtClsStfRedYN_10082")
	public String getAnyzPrtClsStfRedYN_10082() {
		return anyzPrtClsStfRedYN_10082;
	}

	@JsonProperty("anyzPrtClsStfRedYN_10082")
	public void setAnyzPrtClsStfRedYN_10082(String anyzPrtClsStfRedYN_10082) {
		this.anyzPrtClsStfRedYN_10082 = anyzPrtClsStfRedYN_10082;
	}

	@JsonProperty("anysRevOutCounYN_10083")
	public String getAnysRevOutCounYN_10083() {
		return anysRevOutCounYN_10083;
	}

	@JsonProperty("anysRevOutCounYN_10083")
	public void setAnysRevOutCounYN_10083(String anysRevOutCounYN_10083) {
		this.anysRevOutCounYN_10083 = anysRevOutCounYN_10083;
	}

}