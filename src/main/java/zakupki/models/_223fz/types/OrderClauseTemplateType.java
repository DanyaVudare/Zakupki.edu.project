//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:17 PM MSK 
//


package zakupki.models._223fz.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Шаблон положения о закупках
 * 
 * <p>Java class for orderClauseTemplateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderClauseTemplateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}baseTemplateType">
 *       &lt;sequence>
 *         &lt;element name="fields" type="{http://zakupki.gov.ru/223fz/types/1}orderClauseTemplateFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderClauseTemplateType", propOrder = {
    "fields"
})
public class OrderClauseTemplateType
    extends BaseTemplateType
{

    protected OrderClauseTemplateFieldList fields;

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link OrderClauseTemplateFieldList }
     *     
     */
    public OrderClauseTemplateFieldList getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderClauseTemplateFieldList }
     *     
     */
    public void setFields(OrderClauseTemplateFieldList value) {
        this.fields = value;
    }

}
