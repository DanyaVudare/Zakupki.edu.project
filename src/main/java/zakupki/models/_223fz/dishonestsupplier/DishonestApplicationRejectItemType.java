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
 * <p>Java class for dishonestApplicationRejectItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dishonestApplicationRejectItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="dishonestApplicationRejectData" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}dishonestApplicationRejectDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dishonestApplicationRejectItemType", propOrder = {
    "dishonestApplicationRejectData"
})
public class DishonestApplicationRejectItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected DishonestApplicationRejectDataType dishonestApplicationRejectData;

    /**
     * Gets the value of the dishonestApplicationRejectData property.
     * 
     * @return
     *     possible object is
     *     {@link DishonestApplicationRejectDataType }
     *     
     */
    public DishonestApplicationRejectDataType getDishonestApplicationRejectData() {
        return dishonestApplicationRejectData;
    }

    /**
     * Sets the value of the dishonestApplicationRejectData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DishonestApplicationRejectDataType }
     *     
     */
    public void setDishonestApplicationRejectData(DishonestApplicationRejectDataType value) {
        this.dishonestApplicationRejectData = value;
    }

}
