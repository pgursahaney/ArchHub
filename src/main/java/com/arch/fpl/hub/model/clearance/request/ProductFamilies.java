package com.arch.fpl.hub.model.clearance.request;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="ProductFamilyInfo" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProductFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EachLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="EachPartOf" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="EachAttachement" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="EachSIRDeductible" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="AggregateLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="AggregatePartOf" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="AggregateAttachment" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="AggregateSIRDeductible" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "", propOrder = { "productFamilyInfo" })
public  class ProductFamilies {

	@XmlElement(name = "ProductFamilyInfo", required = true)
	protected List<ProductFamilyInfo> productFamilyInfo;

	/**
	 * Gets the value of the productFamilyInfo property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the productFamilyInfo property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getProductFamilyInfo().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link SubmissionClearanceRequestData.Submission.ProductFamilies.ProductFamilyInfo }
	 * 
	 * 
	 */
	public List<ProductFamilyInfo> getProductFamilyInfo() {
		if (productFamilyInfo == null) {
			productFamilyInfo = new ArrayList<ProductFamilyInfo>();
		}
		return this.productFamilyInfo;
	}

	public void setProductFamilyInfo(
			List<ProductFamilyInfo> productFamilyInfo) {
		this.productFamilyInfo = productFamilyInfo;
	}
}
	

