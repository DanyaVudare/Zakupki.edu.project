//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:16 PM MSK 
//


package zakupki.models._223fz.conclusion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об уведомлении о несоответствии
 * 
 * <p>Java class for discrepancyNotificationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="discrepancyNotificationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issueDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="issueMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="issueYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="regNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;pattern value="\w(\d{10}|\d{16})"/>
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
@XmlType(name = "discrepancyNotificationInfoType", propOrder = {
    "issueDay",
    "issueMonth",
    "issueYear",
    "regNumber"
})
public class DiscrepancyNotificationInfoType {

    protected int issueDay;
    @XmlElement(required = true)
    protected String issueMonth;
    protected int issueYear;
    @XmlElement(required = true)
    protected String regNumber;

    /**
     * Gets the value of the issueDay property.
     * 
     */
    public int getIssueDay() {
        return issueDay;
    }

    /**
     * Sets the value of the issueDay property.
     * 
     */
    public void setIssueDay(int value) {
        this.issueDay = value;
    }

    /**
     * Gets the value of the issueMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueMonth() {
        return issueMonth;
    }

    /**
     * Sets the value of the issueMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueMonth(String value) {
        this.issueMonth = value;
    }

    /**
     * Gets the value of the issueYear property.
     * 
     */
    public int getIssueYear() {
        return issueYear;
    }

    /**
     * Sets the value of the issueYear property.
     * 
     */
    public void setIssueYear(int value) {
        this.issueYear = value;
    }

    /**
     * Gets the value of the regNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNumber(String value) {
        this.regNumber = value;
    }

}
