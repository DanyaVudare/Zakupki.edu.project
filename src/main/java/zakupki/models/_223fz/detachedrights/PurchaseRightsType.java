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
import zakupki.models._223fz.types.RegistrationNumber11ListType;


/**
 * Данные о правах для извещения о закупке
 * 
 * <p>Java class for purchaseRightsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseRightsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchaseCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="purchaseModification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="purchaseView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hideModificationPurchases" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11ListType" minOccurs="0"/>
 *         &lt;element name="hideViewPurchases" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11ListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseRightsType", propOrder = {
    "purchaseCreate",
    "purchaseModification",
    "purchaseView",
    "hideModificationPurchases",
    "hideViewPurchases"
})
public class PurchaseRightsType {

    protected Boolean purchaseCreate;
    protected Boolean purchaseModification;
    protected Boolean purchaseView;
    protected RegistrationNumber11ListType hideModificationPurchases;
    protected RegistrationNumber11ListType hideViewPurchases;

    /**
     * Gets the value of the purchaseCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchaseCreate() {
        return purchaseCreate;
    }

    /**
     * Sets the value of the purchaseCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchaseCreate(Boolean value) {
        this.purchaseCreate = value;
    }

    /**
     * Gets the value of the purchaseModification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchaseModification() {
        return purchaseModification;
    }

    /**
     * Sets the value of the purchaseModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchaseModification(Boolean value) {
        this.purchaseModification = value;
    }

    /**
     * Gets the value of the purchaseView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchaseView() {
        return purchaseView;
    }

    /**
     * Sets the value of the purchaseView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchaseView(Boolean value) {
        this.purchaseView = value;
    }

    /**
     * Gets the value of the hideModificationPurchases property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationNumber11ListType }
     *     
     */
    public RegistrationNumber11ListType getHideModificationPurchases() {
        return hideModificationPurchases;
    }

    /**
     * Sets the value of the hideModificationPurchases property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationNumber11ListType }
     *     
     */
    public void setHideModificationPurchases(RegistrationNumber11ListType value) {
        this.hideModificationPurchases = value;
    }

    /**
     * Gets the value of the hideViewPurchases property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationNumber11ListType }
     *     
     */
    public RegistrationNumber11ListType getHideViewPurchases() {
        return hideViewPurchases;
    }

    /**
     * Sets the value of the hideViewPurchases property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationNumber11ListType }
     *     
     */
    public void setHideViewPurchases(RegistrationNumber11ListType value) {
        this.hideViewPurchases = value;
    }

}
