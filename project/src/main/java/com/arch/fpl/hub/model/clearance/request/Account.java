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
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DAndBName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DAndBNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AlternativeAccountInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AlternateAccountInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PartyNameTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Address">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="CorporationInformation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FEIN" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
@XmlType(name = "", propOrder = { "name", "address", "effectiveDate"
		/*, "dAndBName", "dAndBNumber",
		"alternativeAccountInfo", "corporationInformation"*/ })
public class Account {

	@XmlElement(name = "Name", required = true)
	protected String name;
	@XmlElement(name = "Address", required = true)
	protected Address address;
	@XmlElement(name = "EffectiveDate", required = true)
	protected String effectiveDate;
	/*@XmlElement(name = "DAndBName", required = true)
	protected String dAndBName;
	@XmlElement(name = "DAndBNumber", required = true)
	protected String dAndBNumber;
	@XmlElement(name = "AlternativeAccountInfo", required = true)
	protected AlternativeAccountInfo alternativeAccountInfo;
	@XmlElement(name = "CorporationInformation", required = true)
	protected CorporationInformation corporationInformation;*/

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
	 *         {@link SubmissionClearanceRequestData.Account.Address }
	 * 
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Sets the value of the address property.
	 * 
	 * @param value allowed object is
	 *              {@link SubmissionClearanceRequestData.Account.Address }
	 * 
	 */
	public void setAddress(Address value) {
		this.address = value;
	}

	/**
	 * Gets the value of the effectiveDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * Sets the value of the effectiveDate property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEffectiveDate(String value) {
		this.effectiveDate = value;
	}

	/**
	 * Gets the value of the dAndBName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 *//*
	public String getDAndBName() {
		return dAndBName;
	}

	*//**
	 * Sets the value of the dAndBName property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 *//*
	public void setDAndBName(String value) {
		this.dAndBName = value;
	}

	*//**
	 * Gets the value of the dAndBNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 *//*
	public String getDAndBNumber() {
		return dAndBNumber;
	}

	*//**
	 * Sets the value of the dAndBNumber property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 *//*
	public void setDAndBNumber(String value) {
		this.dAndBNumber = value;
	}

	*//**
	 * Gets the value of the alternativeAccountInfo property.
	 * 
	 * @return possible object is
	 *         {@link SubmissionClearanceRequestData.Account.AlternativeAccountInfo }
	 * 
	 *//*
	public AlternativeAccountInfo getAlternativeAccountInfo() {
		return alternativeAccountInfo;
	}

	*//**
	 * Sets the value of the alternativeAccountInfo property.
	 * 
	 * @param value allowed object is
	 *              {@link SubmissionClearanceRequestData.Account.AlternativeAccountInfo }
	 * 
	 *//*
	public void setAlternativeAccountInfo(AlternativeAccountInfo value) {
		this.alternativeAccountInfo = value;
	}

	*//**
	 * Gets the value of the corporationInformation property.
	 * 
	 * @return possible object is
	 *         {@link SubmissionClearanceRequestData.Account.CorporationInformation }
	 * 
	 *//*
	public CorporationInformation getCorporationInformation() {
		return corporationInformation;
	}

	*//**
	 * Sets the value of the corporationInformation property.
	 * 
	 * @param value allowed object is
	 *              {@link SubmissionClearanceRequestData.Account.CorporationInformation }
	 * 
	 *//*
	public void setCorporationInformation(CorporationInformation value) {
		this.corporationInformation = value;
	}*/
}


	