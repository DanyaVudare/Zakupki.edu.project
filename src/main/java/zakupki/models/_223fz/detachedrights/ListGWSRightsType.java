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
 * Данные о правах для перечня ТРУ
 * 
 * <p>Java class for listGWSRightsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listGWSRightsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listGWSCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="listGWSModification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="listGWSView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listGWSRightsType", propOrder = {
    "listGWSCreate",
    "listGWSModification",
    "listGWSView"
})
public class ListGWSRightsType {

    protected Boolean listGWSCreate;
    protected Boolean listGWSModification;
    protected Boolean listGWSView;

    /**
     * Gets the value of the listGWSCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListGWSCreate() {
        return listGWSCreate;
    }

    /**
     * Sets the value of the listGWSCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListGWSCreate(Boolean value) {
        this.listGWSCreate = value;
    }

    /**
     * Gets the value of the listGWSModification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListGWSModification() {
        return listGWSModification;
    }

    /**
     * Sets the value of the listGWSModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListGWSModification(Boolean value) {
        this.listGWSModification = value;
    }

    /**
     * Gets the value of the listGWSView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListGWSView() {
        return listGWSView;
    }

    /**
     * Sets the value of the listGWSView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListGWSView(Boolean value) {
        this.listGWSView = value;
    }

}
