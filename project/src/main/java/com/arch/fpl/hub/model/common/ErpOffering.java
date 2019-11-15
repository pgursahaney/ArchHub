package com.arch.fpl.hub.model.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "erpTerm", "erpPercent", "erpBindInd", "erpFactor", "riskLevel" })
public class ErpOffering implements Serializable {

	@XmlElement(required = true)
	protected String erpTerm;
	@XmlElement(required = true)
	protected String erpPercent;
	@XmlElement(required = true)
	protected String erpBindInd;
	@XmlElement(required = true)
	protected String erpFactor;
	@XmlElement(required = true)
	protected String riskLevel;
	
	@XmlAttribute(name = "ExtAction")
	protected String extAction;

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
	 * Gets the value of the erpPercent property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErpPercent() {
		return erpPercent;
	}

	/**
	 * Sets the value of the erpPercent property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErpPercent(String value) {
		this.erpPercent = value;
	}

	/**
	 * Gets the value of the erpBindInd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErpBindInd() {
		return erpBindInd;
	}

	/**
	 * Sets the value of the erpBindInd property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErpBindInd(String value) {
		this.erpBindInd = value;
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
	 * Gets the value of the riskLevel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRiskLevel() {
		return riskLevel;
	}

	/**
	 * Sets the value of the riskLevel property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setRiskLevel(String value) {
		this.riskLevel = value;
	}

	public String getExtAction() {
		return extAction;
	}

	public void setExtAction(String extAction) {
		this.extAction = extAction;
	}

}