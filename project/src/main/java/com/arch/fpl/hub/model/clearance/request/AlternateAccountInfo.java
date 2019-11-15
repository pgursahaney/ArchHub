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
 *         &lt;element name="PartyNameTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = { "partyNameTypeCode", "name", "address" })
public  class AlternateAccountInfo {

	@XmlElement(name = "PartyNameTypeCode", required = true)
	protected String partyNameTypeCode;
	@XmlElement(name = "Name", required = true)
	protected String name;
	@XmlElement(name = "Address", required = true)
	protected Address address;

	/**
	 * Gets the value of the partyNameTypeCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPartyNameTypeCode() {
		return partyNameTypeCode;
	}

	/**
	 * Sets the value of the partyNameTypeCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPartyNameTypeCode(String value) {
		this.partyNameTypeCode = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the address property.
	 * 
	 * @return possible object is
	 *         {@link SubmissionClearanceRequestData.Account.AlternativeAccountInfo.AlternateAccountInfo.Address }
	 * 
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Sets the value of the address property.
	 * 
	 * @param value allowed object is
	 *              {@link SubmissionClearanceRequestData.Account.AlternativeAccountInfo.AlternateAccountInfo.Address }
	 * 
	 */
	public void setAddress(
			Address value) {
		this.address = value;
	}
}