//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:03 PM MSK 
//


package zakupki.models._223fz.contract;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация об объемах оплаты долгосрочного договора
 * 
 * <p>Java class for longTermContractVolumesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="longTermContractVolumesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="details" type="{http://zakupki.gov.ru/223fz/contract/1}longTermContractVolumeDetailListType" minOccurs="0"/>
 *         &lt;element name="volume" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="volumeRub" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "longTermContractVolumesType", propOrder = {
    "details",
    "volume",
    "volumeRub"
})
public class LongTermContractVolumesType {

    protected LongTermContractVolumeDetailListType details;
    protected BigDecimal volume;
    protected BigDecimal volumeRub;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link LongTermContractVolumeDetailListType }
     *     
     */
    public LongTermContractVolumeDetailListType getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongTermContractVolumeDetailListType }
     *     
     */
    public void setDetails(LongTermContractVolumeDetailListType value) {
        this.details = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolume(BigDecimal value) {
        this.volume = value;
    }

    /**
     * Gets the value of the volumeRub property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumeRub() {
        return volumeRub;
    }

    /**
     * Sets the value of the volumeRub property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumeRub(BigDecimal value) {
        this.volumeRub = value;
    }

}
