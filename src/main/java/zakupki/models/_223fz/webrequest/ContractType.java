//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:07 PM MSK 
//


package zakupki.models._223fz.webrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Договор
 * 
 * <p>Java class for contractType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/webRequest/1}commonInfoVersionByRegNum">
 *       &lt;sequence>
 *         &lt;element name="stage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contractRegNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="10"/>
 *               &lt;maxLength value="23"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractType", propOrder = {
    "stage",
    "contractRegNumber"
})
public class ContractType
    extends CommonInfoVersionByRegNum
{

    @XmlElement(required = true)
    protected String stage;
    protected String contractRegNumber;

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStage(String value) {
        this.stage = value;
    }

    /**
     * Gets the value of the contractRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractRegNumber() {
        return contractRegNumber;
    }

    /**
     * Sets the value of the contractRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractRegNumber(String value) {
        this.contractRegNumber = value;
    }

}