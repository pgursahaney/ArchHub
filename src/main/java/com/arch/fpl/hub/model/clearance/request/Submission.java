package com.arch.fpl.hub.model.clearance.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="ReceivedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProducerId" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BusinessDivisionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BusinessSubDivisionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SectionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnderWriterUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExternalUnderWriterLoginId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExternalUnderWriterLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExternalUnderWriterFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TermsInMonth" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="DirectOrAssumed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductFamilies">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProductFamilyInfo" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ProductFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="EachLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="EachPartOf" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="EachAttachement" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="EachSIRDeductible" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="AggregateLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="AggregatePartOf" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="AggregateAttachment" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="AggregateSIRDeductible" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "", propOrder = { "receivedDate", "producerId", "branchCode", "businessDivisionCode",
		"businessSubDivisionCode", "sectionCode", "proposedPolicyEffectiveDate", "underWriterUserId", "externalUnderWriterLoginId",
		"externalUnderWriterLastName", "externalUnderWriterFirstName", "currency", "termsInMonth",
		"directOrAssumed", "productFamilies" })
public  class Submission {

	@XmlElement(name = "ReceivedDate", required = true)
	protected String receivedDate;
	@XmlElement(name = "ProducerId")
	@XmlSchemaType(name = "unsignedShort")
	protected int producerId;
	@XmlElement(name = "BranchCode", required = true)
	protected String branchCode;
	@XmlElement(name = "BusinessDivisionCode", required = true)
	protected String businessDivisionCode;
	@XmlElement(name = "BusinessSubDivisionCode", required = true)
	protected String businessSubDivisionCode;
	@XmlElement(name = "SectionCode", required = true)
	protected String sectionCode;
	@XmlElement(name = "ProposedPolicyEffectiveDate", required = true)
	protected String proposedPolicyEffectiveDate;
	@XmlElement(name = "UnderWriterUserId", required = true)
	protected String underWriterUserId;
	@XmlElement(name = "ExternalUnderWriterLoginId", required = true)
	protected String externalUnderWriterLoginId;
	@XmlElement(name = "ExternalUnderWriterLastName", required = true)
	protected String externalUnderWriterLastName;
	@XmlElement(name = "ExternalUnderWriterFirstName", required = true)
	protected String externalUnderWriterFirstName;
	@XmlElement(name = "Currency", required = true)
	protected String currency;
	@XmlElement(name = "TermsInMonth")
	@XmlSchemaType(name = "unsignedByte")
	protected short termsInMonth;
	@XmlElement(name = "DirectOrAssumed", required = true)
	protected String directOrAssumed;
	@XmlElement(name = "ProductFamilies", required = true)
	protected ProductFamilies productFamilies;

	/**
	 * Gets the value of the receivedDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReceivedDate() {
		return receivedDate;
	}

	/**
	 * Sets the value of the receivedDate property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setReceivedDate(String value) {
		this.receivedDate = value;
	}

	/**
	 * Gets the value of the producerId property.
	 * 
	 */
	public int getProducerId() {
		return producerId;
	}

	/**
	 * Sets the value of the producerId property.
	 * 
	 */
	public void setProducerId(int value) {
		this.producerId = value;
	}

	/**
	 * Gets the value of the branchCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBranchCode() {
		return branchCode;
	}

	/**
	 * Sets the value of the branchCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setBranchCode(String value) {
		this.branchCode = value;
	}

	/**
	 * Gets the value of the businessDivisionCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBusinessDivisionCode() {
		return businessDivisionCode;
	}

	/**
	 * Sets the value of the businessDivisionCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setBusinessDivisionCode(String value) {
		this.businessDivisionCode = value;
	}

	/**
	 * Gets the value of the businessSubDivisionCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBusinessSubDivisionCode() {
		return businessSubDivisionCode;
	}

	/**
	 * Sets the value of the businessSubDivisionCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setBusinessSubDivisionCode(String value) {
		this.businessSubDivisionCode = value;
	}

	/**
	 * Gets the value of the sectionCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSectionCode() {
		return sectionCode;
	}

	/**
	 * Sets the value of the sectionCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setSectionCode(String value) {
		this.sectionCode = value;
	}

	public String getProposedPolicyEffectiveDate() {
		return proposedPolicyEffectiveDate;
	}

	public void setProposedPolicyEffectiveDate(String proposedPolicyEffectiveDate) {
		this.proposedPolicyEffectiveDate = proposedPolicyEffectiveDate;
	}

	/**
	 * Gets the value of the underWriterUserId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUnderWriterUserId() {
		return underWriterUserId;
	}

	/**
	 * Sets the value of the underWriterUserId property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setUnderWriterUserId(String value) {
		this.underWriterUserId = value;
	}

	/**
	 * Gets the value of the externalUnderWriterLoginId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExternalUnderWriterLoginId() {
		return externalUnderWriterLoginId;
	}

	/**
	 * Sets the value of the externalUnderWriterLoginId property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setExternalUnderWriterLoginId(String value) {
		this.externalUnderWriterLoginId = value;
	}

	/**
	 * Gets the value of the externalUnderWriterLastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExternalUnderWriterLastName() {
		return externalUnderWriterLastName;
	}

	/**
	 * Sets the value of the externalUnderWriterLastName property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setExternalUnderWriterLastName(String value) {
		this.externalUnderWriterLastName = value;
	}

	/**
	 * Gets the value of the externalUnderWriterFirstName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExternalUnderWriterFirstName() {
		return externalUnderWriterFirstName;
	}

	/**
	 * Sets the value of the externalUnderWriterFirstName property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setExternalUnderWriterFirstName(String value) {
		this.externalUnderWriterFirstName = value;
	}

	/**
	 * Gets the value of the currency property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * Sets the value of the currency property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCurrency(String value) {
		this.currency = value;
	}

	/**
	 * Gets the value of the termsInMonth property.
	 * 
	 */
	public short getTermsInMonth() {
		return termsInMonth;
	}

	/**
	 * Sets the value of the termsInMonth property.
	 * 
	 */
	public void setTermsInMonth(short value) {
		this.termsInMonth = value;
	}

	/**
	 * Gets the value of the directOrAssumed property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDirectOrAssumed() {
		return directOrAssumed;
	}

	/**
	 * Sets the value of the directOrAssumed property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDirectOrAssumed(String value) {
		this.directOrAssumed = value;
	}

	/**
	 * Gets the value of the productFamilies property.
	 * 
	 * @return possible object is
	 *         {@link SubmissionClearanceRequestData.Submission.ProductFamilies }
	 * 
	 */
	public ProductFamilies getProductFamilies() {
		return productFamilies;
	}

	public void setProductFamilies(ProductFamilies productFamilies) {
		this.productFamilies = productFamilies;
		
	}
}