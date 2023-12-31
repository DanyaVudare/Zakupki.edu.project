//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:17 PM MSK 
//


package zakupki.models._223fz.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Данные о выделении лота в отдельный протокол
 * 
 * <p>Java class for lotAllocationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lotAllocationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allocationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="allocationInfo">
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
@XmlType(name = "lotAllocationInfoType", propOrder = {
    "allocationDate",
    "allocationInfo"
})
public class LotAllocationInfoType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar allocationDate;
    @XmlElement(required = true)
    protected String allocationInfo;

    /**
     * Gets the value of the allocationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAllocationDate() {
        return allocationDate;
    }

    /**
     * Sets the value of the allocationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAllocationDate(XMLGregorianCalendar value) {
        this.allocationDate = value;
    }

    /**
     * Gets the value of the allocationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocationInfo() {
        return allocationInfo;
    }

    /**
     * Sets the value of the allocationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocationInfo(String value) {
        this.allocationInfo = value;
    }

}
