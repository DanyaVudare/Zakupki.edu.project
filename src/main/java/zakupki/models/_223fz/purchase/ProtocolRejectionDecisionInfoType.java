//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:08 PM MSK 
//


package zakupki.models._223fz.purchase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for protocolRejectionDecisionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolRejectionDecisionInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commissionDecisionReason" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="confirmingDocsRequisites" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "protocolRejectionDecisionInfoType", propOrder = {
    "commissionDecisionReason",
    "confirmingDocsRequisites"
})
public class ProtocolRejectionDecisionInfoType {

    protected String commissionDecisionReason;
    protected String confirmingDocsRequisites;

    /**
     * Gets the value of the commissionDecisionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionDecisionReason() {
        return commissionDecisionReason;
    }

    /**
     * Sets the value of the commissionDecisionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionDecisionReason(String value) {
        this.commissionDecisionReason = value;
    }

    /**
     * Gets the value of the confirmingDocsRequisites property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmingDocsRequisites() {
        return confirmingDocsRequisites;
    }

    /**
     * Sets the value of the confirmingDocsRequisites property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmingDocsRequisites(String value) {
        this.confirmingDocsRequisites = value;
    }

}
