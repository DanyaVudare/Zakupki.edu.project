//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:02 PM MSK 
//


package zakupki.models._223fz.detachedrights;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Данные о правах для годового отчета МСП
 * 
 * <p>Java class for volumePurchaseRightsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="volumePurchaseRightsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="volumePurchaseCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="volumePurchaseModification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="volumePurchaseView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "volumePurchaseRightsType", propOrder = {
    "volumePurchaseCreate",
    "volumePurchaseModification",
    "volumePurchaseView"
})
public class VolumePurchaseRightsType {

    protected Boolean volumePurchaseCreate;
    protected Boolean volumePurchaseModification;
    protected Boolean volumePurchaseView;

    /**
     * Gets the value of the volumePurchaseCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVolumePurchaseCreate() {
        return volumePurchaseCreate;
    }

    /**
     * Sets the value of the volumePurchaseCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVolumePurchaseCreate(Boolean value) {
        this.volumePurchaseCreate = value;
    }

    /**
     * Gets the value of the volumePurchaseModification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVolumePurchaseModification() {
        return volumePurchaseModification;
    }

    /**
     * Sets the value of the volumePurchaseModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVolumePurchaseModification(Boolean value) {
        this.volumePurchaseModification = value;
    }

    /**
     * Gets the value of the volumePurchaseView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVolumePurchaseView() {
        return volumePurchaseView;
    }

    /**
     * Sets the value of the volumePurchaseView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVolumePurchaseView(Boolean value) {
        this.volumePurchaseView = value;
    }

}