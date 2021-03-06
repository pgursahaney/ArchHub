//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.10 at 11:43:21 AM EDT 
//

package com.arch.fpl.hub.model.clearance.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="MCID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Account">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Address">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DAndBName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DAndBNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AlternativeAccountInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AlternateAccountInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PartyNameTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Address">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                                 &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *                   &lt;element name="CorporationInformation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FEIN" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
 *         &lt;element name="Submission">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ReceivedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ProducerId" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *                   &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BusinessDivisionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BusinessSubDivisionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SectionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="UnderWriterUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ExternalUnderWriterLoginId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ExternalUnderWriterLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ExternalUnderWriterFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TermsInMonth" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                   &lt;element name="DirectOrAssumed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ProductFamilies">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ProductFamilyInfo" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ProductFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="EachLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                       &lt;element name="EachPartOf" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                       &lt;element name="EachAttachement" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="EachSIRDeductible" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                       &lt;element name="AggregateLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                       &lt;element name="AggregatePartOf" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                       &lt;element name="AggregateAttachment" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                       &lt;element name="AggregateSIRDeductible" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
 *         &lt;element name="AttachedDocuments" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "mcid", "transactionId", "sourceSystemId", "account", "submission", "attachedDocuments" })
@XmlRootElement(name = "SubmissionClearanceRequestData")
public class SubmissionClearanceRequestData {

	@XmlElement(name = "MCID")
	protected int mcid;
	@XmlElement(name = "TransactionId")
	protected String transactionId;
	@XmlElement(name = "SourceSystemId")
	protected String sourceSystemId;
	@XmlElement(name = "Account", required = true)
	protected Account account;
	@XmlElement(name = "Submission", required = true)
	protected Submission submission;
	@XmlElement(name = "AttachedDocuments", required = true)
	protected Object attachedDocuments;

	/**
	 * Gets the value of the mcid property.
	 * 
	 */
	public int getMCID() {
		return mcid;
	}

	/**
	 * Sets the value of the mcid property.
	 * 
	 */
	public void setMCID(int value) {
		this.mcid = value;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getSourceSystemId() {
		return sourceSystemId;
	}

	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	/**
	 * Gets the value of the account property.
	 * 
	 * @return possible object is {@link SubmissionClearanceRequestData.Account }
	 * 
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * Sets the value of the account property.
	 * 
	 * @param value allowed object is
	 *              {@link SubmissionClearanceRequestData.Account }
	 * 
	 */
	public void setAccount(Account value) {
		this.account = value;
	}

	/**
	 * Gets the value of the submission property.
	 * 
	 * @return possible object is {@link SubmissionClearanceRequestData.Submission }
	 * 
	 */
	public Submission getSubmission() {
		return submission;
	}

	/**
	 * Sets the value of the submission property.
	 * 
	 * @param value allowed object is
	 *              {@link SubmissionClearanceRequestData.Submission }
	 * 
	 */
	public void setSubmission(Submission value) {
		this.submission = value;
	}

	/**
	 * Gets the value of the attachedDocuments property.
	 * 
	 * @return possible object is {@link Object }
	 * 
	 */
	public Object getAttachedDocuments() {
		return attachedDocuments;
	}
	/**
	 * Sets the value of the attachedDocuments property.
	 * 
	 * @param value allowed object is {@link Object }
	 * 
	 */
	public void setAttachedDocuments(Object value) {
		this.attachedDocuments = value;
	}
}