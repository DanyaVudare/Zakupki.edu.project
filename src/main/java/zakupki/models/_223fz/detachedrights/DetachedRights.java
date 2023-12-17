//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:02 PM MSK 
//


package zakupki.models._223fz.detachedrights;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import zakupki.models._223fz.types.CustomerInfo2Type;
import zakupki.models._223fz.types.CustomerInfo4Type;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agency" type="{http://zakupki.gov.ru/223fz/types/1}customerInfo2Type"/>
 *         &lt;element name="purchasePlacing" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ALLOWED"/>
 *               &lt;enumeration value="PROHIBITED"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="orderClauseRights" type="{http://zakupki.gov.ru/223fz/detachedRights/1}orderClauseRightsType" minOccurs="0"/>
 *         &lt;element name="planRights" type="{http://zakupki.gov.ru/223fz/detachedRights/1}planRightsType" minOccurs="0"/>
 *         &lt;element name="purchaseRights" type="{http://zakupki.gov.ru/223fz/detachedRights/1}purchaseRightsType" minOccurs="0"/>
 *         &lt;element name="contractRights" type="{http://zakupki.gov.ru/223fz/detachedRights/1}contractRightsType" minOccurs="0"/>
 *         &lt;element name="volumePurchaseRights" type="{http://zakupki.gov.ru/223fz/detachedRights/1}volumePurchaseRightsType" minOccurs="0"/>
 *         &lt;element name="volumeInnovPurchaseRights" type="{http://zakupki.gov.ru/223fz/detachedRights/1}volumeInnovPurchaseRightsType" minOccurs="0"/>
 *         &lt;element name="purchaseContractAccountRights" type="{http://zakupki.gov.ru/223fz/detachedRights/1}purchaseContractAccountRightsType" minOccurs="0"/>
 *         &lt;element name="listGWSRights" type="{http://zakupki.gov.ru/223fz/detachedRights/1}listGWSRightsType" minOccurs="0"/>
 *         &lt;element name="listInnovRights" type="{http://zakupki.gov.ru/223fz/detachedRights/1}listInnovRightsType" minOccurs="0"/>
 *         &lt;element name="revenueRights" type="{http://zakupki.gov.ru/223fz/detachedRights/1}revenueRightsType" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfo4Type"/>
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
    "agency",
    "purchasePlacing",
    "orderClauseRights",
    "planRights",
    "purchaseRights",
    "contractRights",
    "volumePurchaseRights",
    "volumeInnovPurchaseRights",
    "purchaseContractAccountRights",
    "listGWSRights",
    "listInnovRights",
    "revenueRights",
    "customer"
})
@XmlRootElement(name = "detachedRights")
public class DetachedRights {

    @XmlElement(required = true)
    protected CustomerInfo2Type agency;
    protected String purchasePlacing;
    protected OrderClauseRightsType orderClauseRights;
    protected PlanRightsType planRights;
    protected PurchaseRightsType purchaseRights;
    protected ContractRightsType contractRights;
    protected VolumePurchaseRightsType volumePurchaseRights;
    protected VolumeInnovPurchaseRightsType volumeInnovPurchaseRights;
    protected PurchaseContractAccountRightsType purchaseContractAccountRights;
    protected ListGWSRightsType listGWSRights;
    protected ListInnovRightsType listInnovRights;
    protected RevenueRightsType revenueRights;
    @XmlElement(required = true)
    protected CustomerInfo4Type customer;

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo2Type }
     *     
     */
    public CustomerInfo2Type getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo2Type }
     *     
     */
    public void setAgency(CustomerInfo2Type value) {
        this.agency = value;
    }

    /**
     * Gets the value of the purchasePlacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasePlacing() {
        return purchasePlacing;
    }

    /**
     * Sets the value of the purchasePlacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasePlacing(String value) {
        this.purchasePlacing = value;
    }

    /**
     * Gets the value of the orderClauseRights property.
     * 
     * @return
     *     possible object is
     *     {@link OrderClauseRightsType }
     *     
     */
    public OrderClauseRightsType getOrderClauseRights() {
        return orderClauseRights;
    }

    /**
     * Sets the value of the orderClauseRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderClauseRightsType }
     *     
     */
    public void setOrderClauseRights(OrderClauseRightsType value) {
        this.orderClauseRights = value;
    }

    /**
     * Gets the value of the planRights property.
     * 
     * @return
     *     possible object is
     *     {@link PlanRightsType }
     *     
     */
    public PlanRightsType getPlanRights() {
        return planRights;
    }

    /**
     * Sets the value of the planRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanRightsType }
     *     
     */
    public void setPlanRights(PlanRightsType value) {
        this.planRights = value;
    }

    /**
     * Gets the value of the purchaseRights property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseRightsType }
     *     
     */
    public PurchaseRightsType getPurchaseRights() {
        return purchaseRights;
    }

    /**
     * Sets the value of the purchaseRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseRightsType }
     *     
     */
    public void setPurchaseRights(PurchaseRightsType value) {
        this.purchaseRights = value;
    }

    /**
     * Gets the value of the contractRights property.
     * 
     * @return
     *     possible object is
     *     {@link ContractRightsType }
     *     
     */
    public ContractRightsType getContractRights() {
        return contractRights;
    }

    /**
     * Sets the value of the contractRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRightsType }
     *     
     */
    public void setContractRights(ContractRightsType value) {
        this.contractRights = value;
    }

    /**
     * Gets the value of the volumePurchaseRights property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePurchaseRightsType }
     *     
     */
    public VolumePurchaseRightsType getVolumePurchaseRights() {
        return volumePurchaseRights;
    }

    /**
     * Sets the value of the volumePurchaseRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePurchaseRightsType }
     *     
     */
    public void setVolumePurchaseRights(VolumePurchaseRightsType value) {
        this.volumePurchaseRights = value;
    }

    /**
     * Gets the value of the volumeInnovPurchaseRights property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeInnovPurchaseRightsType }
     *     
     */
    public VolumeInnovPurchaseRightsType getVolumeInnovPurchaseRights() {
        return volumeInnovPurchaseRights;
    }

    /**
     * Sets the value of the volumeInnovPurchaseRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeInnovPurchaseRightsType }
     *     
     */
    public void setVolumeInnovPurchaseRights(VolumeInnovPurchaseRightsType value) {
        this.volumeInnovPurchaseRights = value;
    }

    /**
     * Gets the value of the purchaseContractAccountRights property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseContractAccountRightsType }
     *     
     */
    public PurchaseContractAccountRightsType getPurchaseContractAccountRights() {
        return purchaseContractAccountRights;
    }

    /**
     * Sets the value of the purchaseContractAccountRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseContractAccountRightsType }
     *     
     */
    public void setPurchaseContractAccountRights(PurchaseContractAccountRightsType value) {
        this.purchaseContractAccountRights = value;
    }

    /**
     * Gets the value of the listGWSRights property.
     * 
     * @return
     *     possible object is
     *     {@link ListGWSRightsType }
     *     
     */
    public ListGWSRightsType getListGWSRights() {
        return listGWSRights;
    }

    /**
     * Sets the value of the listGWSRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListGWSRightsType }
     *     
     */
    public void setListGWSRights(ListGWSRightsType value) {
        this.listGWSRights = value;
    }

    /**
     * Gets the value of the listInnovRights property.
     * 
     * @return
     *     possible object is
     *     {@link ListInnovRightsType }
     *     
     */
    public ListInnovRightsType getListInnovRights() {
        return listInnovRights;
    }

    /**
     * Sets the value of the listInnovRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListInnovRightsType }
     *     
     */
    public void setListInnovRights(ListInnovRightsType value) {
        this.listInnovRights = value;
    }

    /**
     * Gets the value of the revenueRights property.
     * 
     * @return
     *     possible object is
     *     {@link RevenueRightsType }
     *     
     */
    public RevenueRightsType getRevenueRights() {
        return revenueRights;
    }

    /**
     * Sets the value of the revenueRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueRightsType }
     *     
     */
    public void setRevenueRights(RevenueRightsType value) {
        this.revenueRights = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo4Type }
     *     
     */
    public CustomerInfo4Type getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo4Type }
     *     
     */
    public void setCustomer(CustomerInfo4Type value) {
        this.customer = value;
    }

}