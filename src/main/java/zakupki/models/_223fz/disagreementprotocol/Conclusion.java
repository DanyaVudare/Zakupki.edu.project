//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:06 PM MSK 
//


package zakupki.models._223fz.disagreementprotocol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Уведомление о несоответствии
 * 
 * <p>Java class for conclusion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conclusion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conclusionRegNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;pattern value="\w(\d{10}|\d{16})"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="planRegNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumberType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/223fz/disagreementProtocol/1}purchasePlanStatusType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://zakupki.gov.ru/223fz/disagreementProtocol/1}placementType"/>
 *         &lt;element name="authorityAgencyFullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="evaluationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="msbCustomerAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msbPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="innovMsbCustomerAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="innovMsbPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conclusion", propOrder = {
    "conclusionRegNumber",
    "planRegNumber",
    "status",
    "type",
    "authorityAgencyFullName",
    "evaluationDate",
    "msbCustomerAgencyName",
    "msbPeriod",
    "innovMsbCustomerAgencyName",
    "innovMsbPeriod"
})
public class Conclusion {

    @XmlElement(required = true)
    protected String conclusionRegNumber;
    protected String planRegNumber;
    @XmlSchemaType(name = "string")
    protected PurchasePlanStatusType status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PlacementType type;
    @XmlElement(required = true)
    protected String authorityAgencyFullName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evaluationDate;
    protected String msbCustomerAgencyName;
    protected Integer msbPeriod;
    protected String innovMsbCustomerAgencyName;
    protected Integer innovMsbPeriod;

    /**
     * Gets the value of the conclusionRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConclusionRegNumber() {
        return conclusionRegNumber;
    }

    /**
     * Sets the value of the conclusionRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConclusionRegNumber(String value) {
        this.conclusionRegNumber = value;
    }

    /**
     * Gets the value of the planRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanRegNumber() {
        return planRegNumber;
    }

    /**
     * Sets the value of the planRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanRegNumber(String value) {
        this.planRegNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanStatusType }
     *     
     */
    public PurchasePlanStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanStatusType }
     *     
     */
    public void setStatus(PurchasePlanStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementType }
     *     
     */
    public PlacementType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementType }
     *     
     */
    public void setType(PlacementType value) {
        this.type = value;
    }

    /**
     * Gets the value of the authorityAgencyFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityAgencyFullName() {
        return authorityAgencyFullName;
    }

    /**
     * Sets the value of the authorityAgencyFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityAgencyFullName(String value) {
        this.authorityAgencyFullName = value;
    }

    /**
     * Gets the value of the evaluationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvaluationDate() {
        return evaluationDate;
    }

    /**
     * Sets the value of the evaluationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvaluationDate(XMLGregorianCalendar value) {
        this.evaluationDate = value;
    }

    /**
     * Gets the value of the msbCustomerAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsbCustomerAgencyName() {
        return msbCustomerAgencyName;
    }

    /**
     * Sets the value of the msbCustomerAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsbCustomerAgencyName(String value) {
        this.msbCustomerAgencyName = value;
    }

    /**
     * Gets the value of the msbPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMsbPeriod() {
        return msbPeriod;
    }

    /**
     * Sets the value of the msbPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMsbPeriod(Integer value) {
        this.msbPeriod = value;
    }

    /**
     * Gets the value of the innovMsbCustomerAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInnovMsbCustomerAgencyName() {
        return innovMsbCustomerAgencyName;
    }

    /**
     * Sets the value of the innovMsbCustomerAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInnovMsbCustomerAgencyName(String value) {
        this.innovMsbCustomerAgencyName = value;
    }

    /**
     * Gets the value of the innovMsbPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInnovMsbPeriod() {
        return innovMsbPeriod;
    }

    /**
     * Sets the value of the innovMsbPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInnovMsbPeriod(Integer value) {
        this.innovMsbPeriod = value;
    }

}
