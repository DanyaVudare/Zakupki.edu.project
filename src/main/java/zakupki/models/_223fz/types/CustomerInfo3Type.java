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
import javax.xml.bind.annotation.XmlType;


/**
 * Данные заказчика
 * 
 * <p>Java class for customerInfo3Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerInfo3Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mainInfo" type="{http://zakupki.gov.ru/223fz/types/1}customerMainInfo3Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerInfo3Type", propOrder = {
    "mainInfo"
})
public class CustomerInfo3Type {

    @XmlElement(required = true)
    protected CustomerMainInfo3Type mainInfo;

    /**
     * Gets the value of the mainInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerMainInfo3Type }
     *     
     */
    public CustomerMainInfo3Type getMainInfo() {
        return mainInfo;
    }

    /**
     * Sets the value of the mainInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerMainInfo3Type }
     *     
     */
    public void setMainInfo(CustomerMainInfo3Type value) {
        this.mainInfo = value;
    }

}
