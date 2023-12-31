//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:08 PM MSK 
//


package zakupki.models._223fz.purchase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Информации о направлении запроса разъяснений
 * 
 * <p>Java class for explanationRequestInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="explanationRequestInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commissionDecision" type="{http://zakupki.gov.ru/223fz/purchase/1}explanationRequestCommissionDecisionType"/>
 *         &lt;element name="reason" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="explanationRequestGuidList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
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
@XmlType(name = "explanationRequestInfoType", propOrder = {
    "commissionDecision",
    "reason",
    "explanationRequestGuidList"
})
public class ExplanationRequestInfoType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ExplanationRequestCommissionDecisionType commissionDecision;
    protected String reason;
    protected ExplanationRequestGuidList explanationRequestGuidList;

    /**
     * Gets the value of the commissionDecision property.
     * 
     * @return
     *     possible object is
     *     {@link ExplanationRequestCommissionDecisionType }
     *     
     */
    public ExplanationRequestCommissionDecisionType getCommissionDecision() {
        return commissionDecision;
    }

    /**
     * Sets the value of the commissionDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExplanationRequestCommissionDecisionType }
     *     
     */
    public void setCommissionDecision(ExplanationRequestCommissionDecisionType value) {
        this.commissionDecision = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the explanationRequestGuidList property.
     * 
     * @return
     *     possible object is
     *     {@link ExplanationRequestGuidList }
     *     
     */
    public ExplanationRequestGuidList getExplanationRequestGuidList() {
        return explanationRequestGuidList;
    }

    /**
     * Sets the value of the explanationRequestGuidList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExplanationRequestGuidList }
     *     
     */
    public void setExplanationRequestGuidList(ExplanationRequestGuidList value) {
        this.explanationRequestGuidList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "guid"
    })
    public static class ExplanationRequestGuidList {

        @XmlElement(required = true)
        protected List<String> guid;

        /**
         * Gets the value of the guid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuid().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getGuid() {
            if (guid == null) {
                guid = new ArrayList<String>();
            }
            return this.guid;
        }

    }

}
