//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:17 PM MSK 
//


package zakupki.models._223fz.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Значения дополнительных полей положения о закупках
 * 
 * <p>Java class for orderClauseExtendFieldValueListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderClauseExtendFieldValueListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderClauseExtendField" type="{http://zakupki.gov.ru/223fz/types/1}orderClauseExtendBlockFieldType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderClauseExtendFieldValueListType", propOrder = {
    "orderClauseExtendField"
})
public class OrderClauseExtendFieldValueListType {

    protected List<OrderClauseExtendBlockFieldType> orderClauseExtendField;

    /**
     * Gets the value of the orderClauseExtendField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderClauseExtendField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderClauseExtendField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderClauseExtendBlockFieldType }
     * 
     * 
     */
    public List<OrderClauseExtendBlockFieldType> getOrderClauseExtendField() {
        if (orderClauseExtendField == null) {
            orderClauseExtendField = new ArrayList<OrderClauseExtendBlockFieldType>();
        }
        return this.orderClauseExtendField;
    }

}