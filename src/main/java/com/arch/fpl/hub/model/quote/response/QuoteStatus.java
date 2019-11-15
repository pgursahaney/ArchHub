package com.arch.fpl.hub.model.quote.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ 
	"statusCode",
	"statusDetail"


})
public class QuoteStatus implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("statusCode")
	private String statusCode ;	
	@JsonProperty("statusDetail")
	private String statusDetail ;
	
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusDetail() {
		return statusDetail;
	}
	public void setStatusDetail(String statusDetail) {
		this.statusDetail = statusDetail;
	}
}