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
 *         &lt;element name="AlternateAccountInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PartyNameTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Address">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "alternateAccountInfo" })
public  class AlternativeAccountInfo {

	@XmlElement(name = "AlternateAccountInfo")
	protected AlternateAccountInfo alternateAccountInfo;

	/**
	 * Gets the value of the alternateAccountInfo property.
	 * 
	 * @return possible object is
	 *         {@link SubmissionClearanceRequestData.Account.AlternativeAccountInfo.AlternateAccountInfo }
	 * 
	 */
	public AlternateAccountInfo getAlternateAccountInfo() {
		return alternateAccountInfo;
	}

	/**
	 * Sets the value of the alternateAccountInfo property.
	 * 
	 * @param value allowed object is
	 *              {@link SubmissionClearanceRequestData.Account.AlternativeAccountInfo.AlternateAccountInfo }
	 * 
	 */
	public void setAlternateAccountInfo(
			AlternateAccountInfo value) {
		this.alternateAccountInfo = value;
	}
}