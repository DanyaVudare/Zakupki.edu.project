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


/**
 * <p>Java class for protocolRejectionFinalProtocolApplicationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolRejectionFinalProtocolApplicationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lot" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolRejectionLotType"/>
 *         &lt;element name="application" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolRejectionApplicationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolRejectionFinalProtocolApplicationInfoType", propOrder = {
    "lot",
    "application"
})
public class ProtocolRejectionFinalProtocolApplicationInfoType {

    @XmlElement(required = true)
    protected ProtocolRejectionLotType lot;
    @XmlElement(required = true)
    protected ProtocolRejectionApplicationType application;

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolRejectionLotType }
     *     
     */
    public ProtocolRejectionLotType getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolRejectionLotType }
     *     
     */
    public void setLot(ProtocolRejectionLotType value) {
        this.lot = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolRejectionApplicationType }
     *     
     */
    public ProtocolRejectionApplicationType getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolRejectionApplicationType }
     *     
     */
    public void setApplication(ProtocolRejectionApplicationType value) {
        this.application = value;
    }

}
