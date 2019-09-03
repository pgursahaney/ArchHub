package com.arch.fpl.hub.model.clearance.request;

import java.math.BigDecimal;

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
 *         &lt;element name="ProductFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EachLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="EachPartOf" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="EachAttachement" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EachSIRDeductible" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AggregateLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AggregatePartOf" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AggregateAttachment" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AggregateSIRDeductible" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "productFamilyCode", "eachLimit", "eachPartOf", "eachAttachement",
		"eachSIRDeductible", "aggregateLimit", "aggregatePartOf", "aggregateAttachment",
		"aggregateSIRDeductible" })
public  class ProductFamilyInfo {

	@XmlElement(name = "ProductFamilyCode", required = true)
	protected String productFamilyCode;
	@XmlElement(name = "EachLimit", required = true)
	protected BigDecimal eachLimit;
	@XmlElement(name = "EachPartOf", required = true)
	protected BigDecimal eachPartOf;
	@XmlElement(name = "EachAttachement")
	protected BigDecimal eachAttachement;
	@XmlElement(name = "EachSIRDeductible", required = true)
	protected BigDecimal eachSIRDeductible;
	@XmlElement(name = "AggregateLimit", required = true)
	protected BigDecimal aggregateLimit;
	@XmlElement(name = "AggregatePartOf", required = true)
	protected BigDecimal aggregatePartOf;
	@XmlElement(name = "AggregateAttachment", required = true)
	protected BigDecimal aggregateAttachment;
	@XmlElement(name = "AggregateSIRDeductible", required = true)
	protected BigDecimal aggregateSIRDeductible;

	/**
	 * Gets the value of the productFamilyCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductFamilyCode() {
		return productFamilyCode;
	}

	/**
	 * Sets the value of the productFamilyCode property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setProductFamilyCode(String value) {
		this.productFamilyCode = value;
	}

	/**
	 * Gets the value of the eachLimit property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getEachLimit() {
		return eachLimit;
	}

	/**
	 * Sets the value of the eachLimit property.
	 * 
	 * @param value allowed object is {@link BigDecimal }
	 * 
	 */
	public void setEachLimit(BigDecimal value) {
		this.eachLimit = value;
	}

	/**
	 * Gets the value of the eachPartOf property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getEachPartOf() {
		return eachPartOf;
	}

	/**
	 * Sets the value of the eachPartOf property.
	 * 
	 * @param value allowed object is {@link BigDecimal }
	 * 
	 */
	public void setEachPartOf(BigDecimal value) {
		this.eachPartOf = value;
	}

	/**
	 * Gets the value of the eachAttachement property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getEachAttachement() {
		return eachAttachement;
	}

	/**
	 * Sets the value of the eachAttachement property.
	 * 
	 * @param value allowed object is {@link BigDecimal }
	 * 
	 */
	public void setEachAttachement(BigDecimal value) {
		this.eachAttachement = value;
	}

	/**
	 * Gets the value of the eachSIRDeductible property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getEachSIRDeductible() {
		return eachSIRDeductible;
	}

	/**
	 * Sets the value of the eachSIRDeductible property.
	 * 
	 * @param value allowed object is {@link BigDecimal }
	 * 
	 */
	public void setEachSIRDeductible(BigDecimal value) {
		this.eachSIRDeductible = value;
	}

	/**
	 * Gets the value of the aggregateLimit property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getAggregateLimit() {
		return aggregateLimit;
	}

	/**
	 * Sets the value of the aggregateLimit property.
	 * 
	 * @param value allowed object is {@link BigDecimal }
	 * 
	 */
	public void setAggregateLimit(BigDecimal value) {
		this.aggregateLimit = value;
	}

	/**
	 * Gets the value of the aggregatePartOf property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getAggregatePartOf() {
		return aggregatePartOf;
	}

	/**
	 * Sets the value of the aggregatePartOf property.
	 * 
	 * @param value allowed object is {@link BigDecimal }
	 * 
	 */
	public void setAggregatePartOf(BigDecimal value) {
		this.aggregatePartOf = value;
	}

	/**
	 * Gets the value of the aggregateAttachment property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getAggregateAttachment() {
		return aggregateAttachment;
	}

	/**
	 * Sets the value of the aggregateAttachment property.
	 * 
	 * @param value allowed object is {@link BigDecimal }
	 * 
	 */
	public void setAggregateAttachment(BigDecimal value) {
		this.aggregateAttachment = value;
	}

	/**
	 * Gets the value of the aggregateSIRDeductible property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getAggregateSIRDeductible() {
		return aggregateSIRDeductible;
	}

	/**
	 * Sets the value of the aggregateSIRDeductible property.
	 * 
	 * @param value allowed object is {@link BigDecimal }
	 * 
	 */
	public void setAggregateSIRDeductible(BigDecimal value) {
		this.aggregateSIRDeductible = value;
	}

}

