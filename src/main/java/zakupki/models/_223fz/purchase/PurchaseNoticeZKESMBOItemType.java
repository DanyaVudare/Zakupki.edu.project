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
 * <p>Java class for purchaseNoticeZKESMBOItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseNoticeZKESMBOItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseNoticeZKESMBOData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseNoticeZKESMBODataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseNoticeZKESMBOItemType", propOrder = {
    "purchaseNoticeZKESMBOData"
})
public class PurchaseNoticeZKESMBOItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseNoticeZKESMBODataType purchaseNoticeZKESMBOData;

    /**
     * Gets the value of the purchaseNoticeZKESMBOData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseNoticeZKESMBODataType }
     *     
     */
    public PurchaseNoticeZKESMBODataType getPurchaseNoticeZKESMBOData() {
        return purchaseNoticeZKESMBOData;
    }

    /**
     * Sets the value of the purchaseNoticeZKESMBOData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseNoticeZKESMBODataType }
     *     
     */
    public void setPurchaseNoticeZKESMBOData(PurchaseNoticeZKESMBODataType value) {
        this.purchaseNoticeZKESMBOData = value;
    }

}
