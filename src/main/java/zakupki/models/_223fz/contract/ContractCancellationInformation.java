//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:03 PM MSK 
//


package zakupki.models._223fz.contract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/contract/1}сontractCompletingInfoXml">
 *       &lt;sequence>
 *         &lt;element name="contractCancellation" type="{http://zakupki.gov.ru/223fz/contract/1}contractCompletingInfoExportType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contractCancellation"
})
@XmlRootElement(name = "contractCancellationInformation")
public class ContractCancellationInformation
    extends СontractCompletingInfoXml
{

    @XmlElement(required = true)
    protected List<ContractCompletingInfoExportType> contractCancellation;

    /**
     * Gets the value of the contractCancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractCancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractCompletingInfoExportType }
     * 
     * 
     */
    public List<ContractCompletingInfoExportType> getContractCancellation() {
        if (contractCancellation == null) {
            contractCancellation = new ArrayList<ContractCompletingInfoExportType>();
        }
        return this.contractCancellation;
    }

}
