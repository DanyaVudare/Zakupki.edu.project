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
 * Протокол запроса разъяснений положений заявки для конкурса в электронной форме, участниками которого могут быть только субъекты малого и среднего предпринимательства
 * 
 * <p>Java class for purchaseProtocolZRPZKESMBODataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolZRPZKESMBODataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolDataType">
 *       &lt;sequence>
 *         &lt;element name="protocolFCDRegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type" minOccurs="0"/>
 *         &lt;element name="protocolFCODRegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type" minOccurs="0"/>
 *         &lt;element name="protocolRZ1" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="protocolRZ1RegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="protocolFKVO" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="protocolFKVORegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="protocolRZ2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="protocolRZ2RegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="protocolAdditionalCollationKESMBO" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="protocolAdditionalCollationRegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "purchaseProtocolZRPZKESMBODataType", propOrder = {
    "protocolFCDRegistrationNumber",
    "protocolFCODRegistrationNumber",
    "protocolRZ1",
    "protocolFKVO",
    "protocolRZ2",
    "protocolAdditionalCollationKESMBO"
})
public class PurchaseProtocolZRPZKESMBODataType
    extends PurchaseProtocolDataType
{

    protected String protocolFCDRegistrationNumber;
    protected String protocolFCODRegistrationNumber;
    protected ProtocolRZ1 protocolRZ1;
    protected ProtocolFKVO protocolFKVO;
    protected ProtocolRZ2 protocolRZ2;
    protected ProtocolAdditionalCollationKESMBO protocolAdditionalCollationKESMBO;

    /**
     * Gets the value of the protocolFCDRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolFCDRegistrationNumber() {
        return protocolFCDRegistrationNumber;
    }

    /**
     * Sets the value of the protocolFCDRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolFCDRegistrationNumber(String value) {
        this.protocolFCDRegistrationNumber = value;
    }

    /**
     * Gets the value of the protocolFCODRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolFCODRegistrationNumber() {
        return protocolFCODRegistrationNumber;
    }

    /**
     * Sets the value of the protocolFCODRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolFCODRegistrationNumber(String value) {
        this.protocolFCODRegistrationNumber = value;
    }

    /**
     * Gets the value of the protocolRZ1 property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolRZ1 }
     *     
     */
    public ProtocolRZ1 getProtocolRZ1() {
        return protocolRZ1;
    }

    /**
     * Sets the value of the protocolRZ1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolRZ1 }
     *     
     */
    public void setProtocolRZ1(ProtocolRZ1 value) {
        this.protocolRZ1 = value;
    }

    /**
     * Gets the value of the protocolFKVO property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolFKVO }
     *     
     */
    public ProtocolFKVO getProtocolFKVO() {
        return protocolFKVO;
    }

    /**
     * Sets the value of the protocolFKVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolFKVO }
     *     
     */
    public void setProtocolFKVO(ProtocolFKVO value) {
        this.protocolFKVO = value;
    }

    /**
     * Gets the value of the protocolRZ2 property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolRZ2 }
     *     
     */
    public ProtocolRZ2 getProtocolRZ2() {
        return protocolRZ2;
    }

    /**
     * Sets the value of the protocolRZ2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolRZ2 }
     *     
     */
    public void setProtocolRZ2(ProtocolRZ2 value) {
        this.protocolRZ2 = value;
    }

    /**
     * Gets the value of the protocolAdditionalCollationKESMBO property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolAdditionalCollationKESMBO }
     *     
     */
    public ProtocolAdditionalCollationKESMBO getProtocolAdditionalCollationKESMBO() {
        return protocolAdditionalCollationKESMBO;
    }

    /**
     * Sets the value of the protocolAdditionalCollationKESMBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolAdditionalCollationKESMBO }
     *     
     */
    public void setProtocolAdditionalCollationKESMBO(ProtocolAdditionalCollationKESMBO value) {
        this.protocolAdditionalCollationKESMBO = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="protocolAdditionalCollationRegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "protocolAdditionalCollationRegistrationNumber"
    })
    public static class ProtocolAdditionalCollationKESMBO {

        @XmlElement(required = true)
        protected String protocolAdditionalCollationRegistrationNumber;

        /**
         * Gets the value of the protocolAdditionalCollationRegistrationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolAdditionalCollationRegistrationNumber() {
            return protocolAdditionalCollationRegistrationNumber;
        }

        /**
         * Sets the value of the protocolAdditionalCollationRegistrationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocolAdditionalCollationRegistrationNumber(String value) {
            this.protocolAdditionalCollationRegistrationNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="protocolFKVORegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "protocolFKVORegistrationNumber"
    })
    public static class ProtocolFKVO {

        @XmlElement(required = true)
        protected String protocolFKVORegistrationNumber;

        /**
         * Gets the value of the protocolFKVORegistrationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolFKVORegistrationNumber() {
            return protocolFKVORegistrationNumber;
        }

        /**
         * Sets the value of the protocolFKVORegistrationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocolFKVORegistrationNumber(String value) {
            this.protocolFKVORegistrationNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="protocolRZ1RegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "protocolRZ1RegistrationNumber"
    })
    public static class ProtocolRZ1 {

        protected String protocolRZ1RegistrationNumber;

        /**
         * Gets the value of the protocolRZ1RegistrationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolRZ1RegistrationNumber() {
            return protocolRZ1RegistrationNumber;
        }

        /**
         * Sets the value of the protocolRZ1RegistrationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocolRZ1RegistrationNumber(String value) {
            this.protocolRZ1RegistrationNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="protocolRZ2RegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "protocolRZ2RegistrationNumber"
    })
    public static class ProtocolRZ2 {

        @XmlElement(required = true)
        protected String protocolRZ2RegistrationNumber;

        /**
         * Gets the value of the protocolRZ2RegistrationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolRZ2RegistrationNumber() {
            return protocolRZ2RegistrationNumber;
        }

        /**
         * Sets the value of the protocolRZ2RegistrationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocolRZ2RegistrationNumber(String value) {
            this.protocolRZ2RegistrationNumber = value;
        }

    }

}
