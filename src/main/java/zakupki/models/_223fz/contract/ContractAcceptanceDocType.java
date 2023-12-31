//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:03 PM MSK 
//


package zakupki.models._223fz.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Документ приемки
 * 
 * <p>Java class for contractAcceptanceDocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractAcceptanceDocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guidCompletingInfo" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
 *         &lt;element name="positionOrdinal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="docOrdinal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractAcceptanceDocType", propOrder = {
    "guidCompletingInfo",
    "positionOrdinal",
    "docOrdinal",
    "name",
    "number",
    "date"
})
public class ContractAcceptanceDocType {

    protected String guidCompletingInfo;
    protected long positionOrdinal;
    protected long docOrdinal;
    protected String name;
    protected String number;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;

    /**
     * Gets the value of the guidCompletingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidCompletingInfo() {
        return guidCompletingInfo;
    }

    /**
     * Sets the value of the guidCompletingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidCompletingInfo(String value) {
        this.guidCompletingInfo = value;
    }

    /**
     * Gets the value of the positionOrdinal property.
     * 
     */
    public long getPositionOrdinal() {
        return positionOrdinal;
    }

    /**
     * Sets the value of the positionOrdinal property.
     * 
     */
    public void setPositionOrdinal(long value) {
        this.positionOrdinal = value;
    }

    /**
     * Gets the value of the docOrdinal property.
     * 
     */
    public long getDocOrdinal() {
        return docOrdinal;
    }

    /**
     * Sets the value of the docOrdinal property.
     * 
     */
    public void setDocOrdinal(long value) {
        this.docOrdinal = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
