package com.arch.fpl.hub.model.common;

import java.io.Serializable;

public class AdhocQuoteDetails implements Serializable{

	private static final long serialVersionUID = 1L;
	private String sicCode;
	private String naicsCode;
	private String declineReasonCd;
	private String referralReason;
	private boolean emailNeeded;
	private String sendEmailTo;

	public String getReferralReason() {
		return referralReason;
	}

	public void setReferralReason(String referralReason) {
		this.referralReason = referralReason;
	}

	public String getSicCode() {
		return sicCode;
	}

	public void setSicCode(String sicCode) {
		this.sicCode = sicCode;
	}

	public String getNaicsCode() {
		return naicsCode;
	}

	public void setNaicsCode(String naicsCode) {
		this.naicsCode = naicsCode;
	}

	public String getDeclineReasonCd() {
		return declineReasonCd;
	}

	public void setDeclineReasonCd(String declineReasonCd) {
		this.declineReasonCd = declineReasonCd;
	}

	public boolean isEmailNeeded() {
		return emailNeeded;
	}

	public void setEmailNeeded(boolean emailNeeded) {
		this.emailNeeded = emailNeeded;
	}

	public String getSendEmailTo() {
		return sendEmailTo;
	}

	public void setSendEmailTo(String sendEmailTo) {
		this.sendEmailTo = sendEmailTo;
	}

}
