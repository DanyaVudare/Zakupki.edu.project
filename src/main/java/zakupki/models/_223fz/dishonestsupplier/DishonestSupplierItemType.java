//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:00 PM MSK 
//


package zakupki.models._223fz.dishonestsupplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import zakupki.models._223fz.types.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for dishonestSupplierItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dishonestSupplierItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="dishonestSupplierData" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}dishonestSupplierDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dishonestSupplierItemType", propOrder = {
    "dishonestSupplierData"
})
public class DishonestSupplierItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected DishonestSupplierDataType dishonestSupplierData;

    /**
     * Gets the value of the dishonestSupplierData property.
     * 
     * @return
     *     possible object is
     *     {@link DishonestSupplierDataType }
     *     
     */
    public DishonestSupplierDataType getDishonestSupplierData() {
        return dishonestSupplierData;
    }

    /**
     * Sets the value of the dishonestSupplierData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DishonestSupplierDataType }
     *     
     */
    public void setDishonestSupplierData(DishonestSupplierDataType value) {
        this.dishonestSupplierData = value;
    }

}
