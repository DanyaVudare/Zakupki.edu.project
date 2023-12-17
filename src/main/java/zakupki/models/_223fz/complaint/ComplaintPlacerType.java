//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:15 PM MSK 
//


package zakupki.models._223fz.complaint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о лице, подавшем жалобу
 * 
 * <p>Java class for complaintPlacerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complaintPlacerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="legalPerson">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://zakupki.gov.ru/223fz/complaint/1}personType">
 *                   &lt;sequence>
 *                     &lt;element name="organizationName">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                           &lt;maxLength value="1000"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="individualPerson">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://zakupki.gov.ru/223fz/complaint/1}personType">
 *                   &lt;choice>
 *                     &lt;sequence>
 *                       &lt;element name="firstName">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                             &lt;maxLength value="300"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                       &lt;element name="middleName">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                             &lt;maxLength value="300"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                       &lt;element name="lastName">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                             &lt;maxLength value="300"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                     &lt;element name="name">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                           &lt;maxLength value="1000"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complaintPlacerType", propOrder = {
    "legalPerson",
    "individualPerson"
})
public class ComplaintPlacerType {

    protected LegalPerson legalPerson;
    protected IndividualPerson individualPerson;

    /**
     * Gets the value of the legalPerson property.
     * 
     * @return
     *     possible object is
     *     {@link LegalPerson }
     *     
     */
    public LegalPerson getLegalPerson() {
        return legalPerson;
    }

    /**
     * Sets the value of the legalPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalPerson }
     *     
     */
    public void setLegalPerson(LegalPerson value) {
        this.legalPerson = value;
    }

    /**
     * Gets the value of the individualPerson property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson }
     *     
     */
    public IndividualPerson getIndividualPerson() {
        return individualPerson;
    }

    /**
     * Sets the value of the individualPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson }
     *     
     */
    public void setIndividualPerson(IndividualPerson value) {
        this.individualPerson = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/223fz/complaint/1}personType">
     *       &lt;choice>
     *         &lt;sequence>
     *           &lt;element name="firstName">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *                 &lt;maxLength value="300"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;element name="middleName">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *                 &lt;maxLength value="300"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;element name="lastName">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *                 &lt;maxLength value="300"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *         &lt;/sequence>
     *         &lt;element name="name">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *               &lt;maxLength value="1000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "firstName",
        "middleName",
        "lastName",
        "name"
    })
    public static class IndividualPerson
        extends PersonType
    {

        protected String firstName;
        protected String middleName;
        protected String lastName;
        protected String name;

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the middleName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMiddleName() {
            return middleName;
        }

        /**
         * Sets the value of the middleName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMiddleName(String value) {
            this.middleName = value;
        }

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
     *     &lt;extension base="{http://zakupki.gov.ru/223fz/complaint/1}personType">
     *       &lt;sequence>
     *         &lt;element name="organizationName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *               &lt;maxLength value="1000"/>
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
    @XmlType(name = "", propOrder = {
        "organizationName"
    })
    public static class LegalPerson
        extends PersonType
    {

        @XmlElement(required = true)
        protected String organizationName;

        /**
         * Gets the value of the organizationName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganizationName() {
            return organizationName;
        }

        /**
         * Sets the value of the organizationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganizationName(String value) {
            this.organizationName = value;
        }

    }

}