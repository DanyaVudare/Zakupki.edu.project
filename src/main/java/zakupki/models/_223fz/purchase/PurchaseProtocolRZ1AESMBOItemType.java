//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:08 PM MSK 
//


package zakupki.models._223fz.purchase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import zakupki.models._223fz.types.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for purchaseProtocolRZ1AESMBOItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolRZ1AESMBOItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolRZ1AESMBOData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRZ1AESMBODataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolRZ1AESMBOItemType", propOrder = {
    "purchaseProtocolRZ1AESMBOData"
})
public class PurchaseProtocolRZ1AESMBOItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolRZ1AESMBODataType purchaseProtocolRZ1AESMBOData;

    /**
     * Gets the value of the purchaseProtocolRZ1AESMBOData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolRZ1AESMBODataType }
     *     
     */
    public PurchaseProtocolRZ1AESMBODataType getPurchaseProtocolRZ1AESMBOData() {
        return purchaseProtocolRZ1AESMBOData;
    }

    /**
     * Sets the value of the purchaseProtocolRZ1AESMBOData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolRZ1AESMBODataType }
     *     
     */
    public void setPurchaseProtocolRZ1AESMBOData(PurchaseProtocolRZ1AESMBODataType value) {
        this.purchaseProtocolRZ1AESMBOData = value;
    }

}
