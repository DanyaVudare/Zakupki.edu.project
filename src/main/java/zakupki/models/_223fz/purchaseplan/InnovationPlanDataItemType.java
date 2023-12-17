//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:12 PM MSK 
//


package zakupki.models._223fz.purchaseplan;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import zakupki.models._223fz.types.CurrencyType;


/**
 * Позиция плана инновационной закупки
 * 
 * <p>Java class for innovationPlanDataItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="innovationPlanDataItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchasePlan/1}basePlanDataItemType">
 *       &lt;sequence>
 *         &lt;element name="ignoredPurchase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="purchaseCategory" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}purchaseCategoryType" minOccurs="0"/>
 *         &lt;element name="maximumContractPrice" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{http://zakupki.gov.ru/223fz/types/1}money6" minOccurs="0"/>
 *         &lt;element name="exchangeRateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="maximumContractPriceRub" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="orderPricing" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="purchasePeriodYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="innovationPlanDataItemRows" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}innovationPlanDataItemsRowListType" minOccurs="0"/>
 *         &lt;element name="innovationEquivalent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "innovationPlanDataItemType", propOrder = {
    "ignoredPurchase",
    "purchaseCategory",
    "maximumContractPrice",
    "currency",
    "exchangeRate",
    "exchangeRateDate",
    "maximumContractPriceRub",
    "orderPricing",
    "purchasePeriodYear",
    "innovationPlanDataItemRows",
    "innovationEquivalent"
})
public class InnovationPlanDataItemType
    extends BasePlanDataItemType
{

    protected Boolean ignoredPurchase;
    protected Long purchaseCategory;
    protected BigDecimal maximumContractPrice;
    protected CurrencyType currency;
    protected BigDecimal exchangeRate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exchangeRateDate;
    protected BigDecimal maximumContractPriceRub;
    protected String orderPricing;
    protected int purchasePeriodYear;
    protected InnovationPlanDataItemsRowListType innovationPlanDataItemRows;
    protected Boolean innovationEquivalent;

    /**
     * Gets the value of the ignoredPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoredPurchase() {
        return ignoredPurchase;
    }

    /**
     * Sets the value of the ignoredPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoredPurchase(Boolean value) {
        this.ignoredPurchase = value;
    }

    /**
     * Gets the value of the purchaseCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseCategory() {
        return purchaseCategory;
    }

    /**
     * Sets the value of the purchaseCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseCategory(Long value) {
        this.purchaseCategory = value;
    }

    /**
     * Gets the value of the maximumContractPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumContractPrice() {
        return maximumContractPrice;
    }

    /**
     * Sets the value of the maximumContractPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumContractPrice(BigDecimal value) {
        this.maximumContractPrice = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCurrency(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the exchangeRateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeRateDate() {
        return exchangeRateDate;
    }

    /**
     * Sets the value of the exchangeRateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeRateDate(XMLGregorianCalendar value) {
        this.exchangeRateDate = value;
    }

    /**
     * Gets the value of the maximumContractPriceRub property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumContractPriceRub() {
        return maximumContractPriceRub;
    }

    /**
     * Sets the value of the maximumContractPriceRub property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumContractPriceRub(BigDecimal value) {
        this.maximumContractPriceRub = value;
    }

    /**
     * Gets the value of the orderPricing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderPricing() {
        return orderPricing;
    }

    /**
     * Sets the value of the orderPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderPricing(String value) {
        this.orderPricing = value;
    }

    /**
     * Gets the value of the purchasePeriodYear property.
     * 
     */
    public int getPurchasePeriodYear() {
        return purchasePeriodYear;
    }

    /**
     * Sets the value of the purchasePeriodYear property.
     * 
     */
    public void setPurchasePeriodYear(int value) {
        this.purchasePeriodYear = value;
    }

    /**
     * Gets the value of the innovationPlanDataItemRows property.
     * 
     * @return
     *     possible object is
     *     {@link InnovationPlanDataItemsRowListType }
     *     
     */
    public InnovationPlanDataItemsRowListType getInnovationPlanDataItemRows() {
        return innovationPlanDataItemRows;
    }

    /**
     * Sets the value of the innovationPlanDataItemRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link InnovationPlanDataItemsRowListType }
     *     
     */
    public void setInnovationPlanDataItemRows(InnovationPlanDataItemsRowListType value) {
        this.innovationPlanDataItemRows = value;
    }

    /**
     * Gets the value of the innovationEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInnovationEquivalent() {
        return innovationEquivalent;
    }

    /**
     * Sets the value of the innovationEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInnovationEquivalent(Boolean value) {
        this.innovationEquivalent = value;
    }

}
