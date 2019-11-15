package com.arch.fpl.hub.model.clearance.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FEIN" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "fein" })
public  class CorporationInformation {

	@XmlElement(name = "FEIN", required = true)
	protected Object fein;

	/**
	 * Gets the value of the fein property.
	 * 
	 * @return possible object is {@link Object }
	 * 
	 */
	public Object getFEIN() {
		return fein;
	}

	/**
	 * Sets the value of the fein property.
	 * 
	 * @param value allowed object is {@link Object }
	 * 
	 */
	public void setFEIN(Object value) {
		this.fein = value;
	}

}


