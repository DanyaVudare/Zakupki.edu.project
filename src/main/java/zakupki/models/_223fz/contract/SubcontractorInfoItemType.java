//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:03 PM MSK 
//


package zakupki.models._223fz.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import zakupki.models._223fz.types.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for subcontractorInfoItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subcontractorInfoItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="subcontractorInfoData" type="{http://zakupki.gov.ru/223fz/contract/1}subcontractorInfoDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subcontractorInfoItemType", propOrder = {
    "subcontractorInfoData"
})
public class SubcontractorInfoItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected SubcontractorInfoDataType subcontractorInfoData;

    /**
     * Gets the value of the subcontractorInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link SubcontractorInfoDataType }
     *     
     */
    public SubcontractorInfoDataType getSubcontractorInfoData() {
        return subcontractorInfoData;
    }

    /**
     * Sets the value of the subcontractorInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubcontractorInfoDataType }
     *     
     */
    public void setSubcontractorInfoData(SubcontractorInfoDataType value) {
        this.subcontractorInfoData = value;
    }

}
