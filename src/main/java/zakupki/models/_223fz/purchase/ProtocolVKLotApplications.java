//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:08 PM MSK 
//


package zakupki.models._223fz.purchase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Заявки и требования к составу документов по лоту в протоколе вскрытия конвертов
 * 
 * <p>Java class for protocolVKLotApplications complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolVKLotApplications">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lot" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolLotType"/>
 *         &lt;element name="application" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolVKApplicationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="documentsRequirement" type="{http://zakupki.gov.ru/223fz/purchase/1}documentRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolVKLotApplications", propOrder = {
    "lot",
    "application",
    "documentsRequirement"
})
public class ProtocolVKLotApplications {

    @XmlElement(required = true)
    protected ProtocolLotType lot;
    protected List<ProtocolVKApplicationType> application;
    protected List<DocumentRequirementType> documentsRequirement;

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolLotType }
     *     
     */
    public ProtocolLotType getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolLotType }
     *     
     */
    public void setLot(ProtocolLotType value) {
        this.lot = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the application property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtocolVKApplicationType }
     * 
     * 
     */
    public List<ProtocolVKApplicationType> getApplication() {
        if (application == null) {
            application = new ArrayList<ProtocolVKApplicationType>();
        }
        return this.application;
    }

    /**
     * Gets the value of the documentsRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentsRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentsRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentRequirementType }
     * 
     * 
     */
    public List<DocumentRequirementType> getDocumentsRequirement() {
        if (documentsRequirement == null) {
            documentsRequirement = new ArrayList<DocumentRequirementType>();
        }
        return this.documentsRequirement;
    }

}
