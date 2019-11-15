package com.arch.fpl.hub.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "dirOffLmtAmt_9002", "dirOffRetAmt_9011", "shrHldrType_9024", "shrHldrFstNm_9027",
		"shrHldrLstNm_9028", "shrHldrTitle_9029", "pctVotShrOwn_9030", "relFamShrHldr_9031", "brchViolDbtYN_9034",
		"expBrchViolDbt_9035", "pubPrvOffSecYN_9036", "expPubPrvOffSec_9037", "chgDirSenOffYN_9038",
		"expChgDirSenOff_9039", "copyPatLitYN_9041", "expCopyPatLit_9042", "decTrdConFrdYN_9043",
		"expDecTrdConFrd_9044", "cvlCrmAdmLawYN_9045", "expCvlCrmAdmLaw_9046", "anyCrmActYN_9047",
		"expOthCrmAct_9048" })
public class PolicyDirectorsAndOfficers {

	@JsonProperty("dirOffLmtAmt_9002")
	private Integer dirOffLmtAmt_9002;
	@JsonProperty("dirOffRetAmt_9011")
	private Integer dirOffRetAmt_9011;
	@JsonProperty("shrHldrType_9024")
	private String shrHldrType_9024;
	@JsonProperty("shrHldrFstNm_9027")
	private String shrHldrFstNm_9027;
	@JsonProperty("shrHldrLstNm_9028")
	private String shrHldrLstNm_9028;
	@JsonProperty("shrHldrTitle_9029")
	private String shrHldrTitle_9029;
	@JsonProperty("pctVotShrOwn_9030")
	private Double pctVotShrOwn_9030;
	@JsonProperty("relFamShrHldr_9031")
	private Boolean relFamShrHldr_9031;
	@JsonProperty("brchViolDbtYN_9034")
	private String brchViolDbtYN_9034;
	@JsonProperty("expBrchViolDbt_9035")
	private String expBrchViolDbt_9035;
	@JsonProperty("pubPrvOffSecYN_9036")
	private String pubPrvOffSecYN_9036;
	@JsonProperty("expPubPrvOffSec_9037")
	private String expPubPrvOffSec_9037;
	@JsonProperty("chgDirSenOffYN_9038")
	private String chgDirSenOffYN_9038;
	@JsonProperty("expChgDirSenOff_9039")
	private String expChgDirSenOff_9039;
	@JsonProperty("copyPatLitYN_9041")
	private String copyPatLitYN_9041;
	@JsonProperty("expCopyPatLit_9042")
	private String expCopyPatLit_9042;
	@JsonProperty("decTrdConFrdYN_9043")
	private String decTrdConFrdYN_9043;
	@JsonProperty("expDecTrdConFrd_9044")
	private String expDecTrdConFrd_9044;
	@JsonProperty("cvlCrmAdmLawYN_9045")
	private String cvlCrmAdmLawYN_9045;
	@JsonProperty("expCvlCrmAdmLaw_9046")
	private String expCvlCrmAdmLaw_9046;
	@JsonProperty("anyCrmActYN_9047")
	private String anyCrmActYN_9047;
	@JsonProperty("expOthCrmAct_9048")
	private String expOthCrmAct_9048;

	@JsonProperty("dirOffLmtAmt_9002")
	public Integer getDirOffLmtAmt_9002() {
		return dirOffLmtAmt_9002;
	}

	@JsonProperty("dirOffLmtAmt_9002")
	public void setDirOffLmtAmt_9002(Integer dirOffLmtAmt_9002) {
		this.dirOffLmtAmt_9002 = dirOffLmtAmt_9002;
	}

	@JsonProperty("dirOffRetAmt_9011")
	public Integer getDirOffRetAmt_9011() {
		return dirOffRetAmt_9011;
	}

	@JsonProperty("dirOffRetAmt_9011")
	public void setDirOffRetAmt_9011(Integer dirOffRetAmt_9011) {
		this.dirOffRetAmt_9011 = dirOffRetAmt_9011;
	}

	@JsonProperty("shrHldrType_9024")
	public String getShrHldrType_9024() {
		return shrHldrType_9024;
	}

	@JsonProperty("shrHldrType_9024")
	public void setShrHldrType_9024(String shrHldrType_9024) {
		this.shrHldrType_9024 = shrHldrType_9024;
	}

	@JsonProperty("shrHldrFstNm_9027")
	public String getShrHldrFstNm_9027() {
		return shrHldrFstNm_9027;
	}

	@JsonProperty("shrHldrFstNm_9027")
	public void setShrHldrFstNm_9027(String shrHldrFstNm_9027) {
		this.shrHldrFstNm_9027 = shrHldrFstNm_9027;
	}

	@JsonProperty("shrHldrLstNm_9028")
	public String getShrHldrLstNm_9028() {
		return shrHldrLstNm_9028;
	}

	@JsonProperty("shrHldrLstNm_9028")
	public void setShrHldrLstNm_9028(String shrHldrLstNm_9028) {
		this.shrHldrLstNm_9028 = shrHldrLstNm_9028;
	}

	@JsonProperty("shrHldrTitle_9029")
	public String getShrHldrTitle_9029() {
		return shrHldrTitle_9029;
	}

	@JsonProperty("shrHldrTitle_9029")
	public void setShrHldrTitle_9029(String shrHldrTitle_9029) {
		this.shrHldrTitle_9029 = shrHldrTitle_9029;
	}

	@JsonProperty("pctVotShrOwn_9030")
	public Double getPctVotShrOwn_9030() {
		return pctVotShrOwn_9030;
	}

	@JsonProperty("pctVotShrOwn_9030")
	public void setPctVotShrOwn_9030(Double pctVotShrOwn_9030) {
		this.pctVotShrOwn_9030 = pctVotShrOwn_9030;
	}

	@JsonProperty("relFamShrHldr_9031")
	public Boolean getRelFamShrHldr_9031() {
		return relFamShrHldr_9031;
	}

	@JsonProperty("relFamShrHldr_9031")
	public void setRelFamShrHldr_9031(Boolean relFamShrHldr_9031) {
		this.relFamShrHldr_9031 = relFamShrHldr_9031;
	}

	@JsonProperty("brchViolDbtYN_9034")
	public String getBrchViolDbtYN_9034() {
		return brchViolDbtYN_9034;
	}

	@JsonProperty("brchViolDbtYN_9034")
	public void setBrchViolDbtYN_9034(String brchViolDbtYN_9034) {
		this.brchViolDbtYN_9034 = brchViolDbtYN_9034;
	}

	@JsonProperty("expBrchViolDbt_9035")
	public String getExpBrchViolDbt_9035() {
		return expBrchViolDbt_9035;
	}

	@JsonProperty("expBrchViolDbt_9035")
	public void setExpBrchViolDbt_9035(String expBrchViolDbt_9035) {
		this.expBrchViolDbt_9035 = expBrchViolDbt_9035;
	}

	@JsonProperty("pubPrvOffSecYN_9036")
	public String getPubPrvOffSecYN_9036() {
		return pubPrvOffSecYN_9036;
	}

	@JsonProperty("pubPrvOffSecYN_9036")
	public void setPubPrvOffSecYN_9036(String pubPrvOffSecYN_9036) {
		this.pubPrvOffSecYN_9036 = pubPrvOffSecYN_9036;
	}

	@JsonProperty("expPubPrvOffSec_9037")
	public String getExpPubPrvOffSec_9037() {
		return expPubPrvOffSec_9037;
	}

	@JsonProperty("expPubPrvOffSec_9037")
	public void setExpPubPrvOffSec_9037(String expPubPrvOffSec_9037) {
		this.expPubPrvOffSec_9037 = expPubPrvOffSec_9037;
	}

	@JsonProperty("chgDirSenOffYN_9038")
	public String getChgDirSenOffYN_9038() {
		return chgDirSenOffYN_9038;
	}

	@JsonProperty("chgDirSenOffYN_9038")
	public void setChgDirSenOffYN_9038(String chgDirSenOffYN_9038) {
		this.chgDirSenOffYN_9038 = chgDirSenOffYN_9038;
	}

	@JsonProperty("expChgDirSenOff_9039")
	public String getExpChgDirSenOff_9039() {
		return expChgDirSenOff_9039;
	}

	@JsonProperty("expChgDirSenOff_9039")
	public void setExpChgDirSenOff_9039(String expChgDirSenOff_9039) {
		this.expChgDirSenOff_9039 = expChgDirSenOff_9039;
	}

	@JsonProperty("copyPatLitYN_9041")
	public String getCopyPatLitYN_9041() {
		return copyPatLitYN_9041;
	}

	@JsonProperty("copyPatLitYN_9041")
	public void setCopyPatLitYN_9041(String copyPatLitYN_9041) {
		this.copyPatLitYN_9041 = copyPatLitYN_9041;
	}

	@JsonProperty("expCopyPatLit_9042")
	public String getExpCopyPatLit_9042() {
		return expCopyPatLit_9042;
	}

	@JsonProperty("expCopyPatLit_9042")
	public void setExpCopyPatLit_9042(String expCopyPatLit_9042) {
		this.expCopyPatLit_9042 = expCopyPatLit_9042;
	}

	@JsonProperty("decTrdConFrdYN_9043")
	public String getDecTrdConFrdYN_9043() {
		return decTrdConFrdYN_9043;
	}

	@JsonProperty("decTrdConFrdYN_9043")
	public void setDecTrdConFrdYN_9043(String decTrdConFrdYN_9043) {
		this.decTrdConFrdYN_9043 = decTrdConFrdYN_9043;
	}

	@JsonProperty("expDecTrdConFrd_9044")
	public String getExpDecTrdConFrd_9044() {
		return expDecTrdConFrd_9044;
	}

	@JsonProperty("expDecTrdConFrd_9044")
	public void setExpDecTrdConFrd_9044(String expDecTrdConFrd_9044) {
		this.expDecTrdConFrd_9044 = expDecTrdConFrd_9044;
	}

	@JsonProperty("cvlCrmAdmLawYN_9045")
	public String getCvlCrmAdmLawYN_9045() {
		return cvlCrmAdmLawYN_9045;
	}

	@JsonProperty("cvlCrmAdmLawYN_9045")
	public void setCvlCrmAdmLawYN_9045(String cvlCrmAdmLawYN_9045) {
		this.cvlCrmAdmLawYN_9045 = cvlCrmAdmLawYN_9045;
	}

	@JsonProperty("expCvlCrmAdmLaw_9046")
	public String getExpCvlCrmAdmLaw_9046() {
		return expCvlCrmAdmLaw_9046;
	}

	@JsonProperty("expCvlCrmAdmLaw_9046")
	public void setExpCvlCrmAdmLaw_9046(String expCvlCrmAdmLaw_9046) {
		this.expCvlCrmAdmLaw_9046 = expCvlCrmAdmLaw_9046;
	}

	@JsonProperty("anyCrmActYN_9047")
	public String getAnyCrmActYN_9047() {
		return anyCrmActYN_9047;
	}

	@JsonProperty("anyCrmActYN_9047")
	public void setAnyCrmActYN_9047(String anyCrmActYN_9047) {
		this.anyCrmActYN_9047 = anyCrmActYN_9047;
	}

	@JsonProperty("expOthCrmAct_9048")
	public String getExpOthCrmAct_9048() {
		return expOthCrmAct_9048;
	}

	@JsonProperty("expOthCrmAct_9048")
	public void setExpOthCrmAct_9048(String expOthCrmAct_9048) {
		this.expOthCrmAct_9048 = expOthCrmAct_9048;
	}

}