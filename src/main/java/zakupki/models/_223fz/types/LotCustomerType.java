//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:17 PM MSK 
//


package zakupki.models._223fz.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lotCustomerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lotCustomerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}lotCustomerBaseType">
 *       &lt;sequence>
 *         &lt;element name="nonResident" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customerInfo" type="{http://zakupki.gov.ru/223fz/types/1}customerMainInfoType" minOccurs="0"/>
 *         &lt;element name="blockedLotCustomer" type="{http://zakupki.gov.ru/223fz/types/1}customerMainInfoType" minOccurs="0"/>
 *         &lt;element name="nonResidentInfo" type="{http://zakupki.gov.ru/223fz/types/1}nonResidentLotCustomerInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lotCustomerType", propOrder = {
    "nonResident",
    "tax",
    "customerInfo",
    "blockedLotCustomer",
    "nonResidentInfo"
})
public class LotCustomerType
    extends LotCustomerBaseType
{

    protected Boolean nonResident;
    protected Boolean tax;
    protected CustomerMainInfoType customerInfo;
    protected CustomerMainInfoType blockedLotCustomer;
    protected NonResidentLotCustomerInfoType nonResidentInfo;

    /**
     * Gets the value of the nonResident property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonResident() {
        return nonResident;
    }

    /**
     * Sets the value of the nonResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonResident(Boolean value) {
        this.nonResident = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTax(Boolean value) {
        this.tax = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerMainInfoType }
     *     
     */
    public CustomerMainInfoType getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerMainInfoType }
     *     
     */
    public void setCustomerInfo(CustomerMainInfoType value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the blockedLotCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerMainInfoType }
     *     
     */
    public CustomerMainInfoType getBlockedLotCustomer() {
        return blockedLotCustomer;
    }

    /**
     * Sets the value of the blockedLotCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerMainInfoType }
     *     
     */
    public void setBlockedLotCustomer(CustomerMainInfoType value) {
        this.blockedLotCustomer = value;
    }

    /**
     * Gets the value of the nonResidentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NonResidentLotCustomerInfoType }
     *     
     */
    public NonResidentLotCustomerInfoType getNonResidentInfo() {
        return nonResidentInfo;
    }

    /**
     * Sets the value of the nonResidentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonResidentLotCustomerInfoType }
     *     
     */
    public void setNonResidentInfo(NonResidentLotCustomerInfoType value) {
        this.nonResidentInfo = value;
    }

}
