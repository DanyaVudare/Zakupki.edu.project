//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:07 PM MSK 
//


package zakupki.models._223fz.webrequest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import zakupki.models._223fz.types.PacketType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}packetType">
 *       &lt;sequence>
 *         &lt;element name="body">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="guidList">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" maxOccurs="1000"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="electronicPlaceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;/choice>
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
@XmlType(name = "", propOrder = {
    "body"
})
@XmlRootElement(name = "publishedDataRequest")
public class PublishedDataRequest
    extends PacketType
{

    @XmlElement(required = true)
    protected Body body;

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link Body }
     *     
     */
    public Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link Body }
     *     
     */
    public void setBody(Body value) {
        this.body = value;
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
     *         &lt;choice>
     *           &lt;element name="guidList">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" maxOccurs="1000"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="electronicPlaceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    @XmlType(name = "", propOrder = {
        "guidList",
        "electronicPlaceId"
    })
    public static class Body {

        protected GuidList guidList;
        protected Long electronicPlaceId;

        /**
         * Gets the value of the guidList property.
         * 
         * @return
         *     possible object is
         *     {@link GuidList }
         *     
         */
        public GuidList getGuidList() {
            return guidList;
        }

        /**
         * Sets the value of the guidList property.
         * 
         * @param value
         *     allowed object is
         *     {@link GuidList }
         *     
         */
        public void setGuidList(GuidList value) {
            this.guidList = value;
        }

        /**
         * Gets the value of the electronicPlaceId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getElectronicPlaceId() {
            return electronicPlaceId;
        }

        /**
         * Sets the value of the electronicPlaceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setElectronicPlaceId(Long value) {
            this.electronicPlaceId = value;
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
         *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" maxOccurs="1000"/>
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
            "guid"
        })
        public static class GuidList {

            @XmlElement(required = true)
            protected List<String> guid;

            /**
             * Gets the value of the guid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the guid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGuid().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getGuid() {
                if (guid == null) {
                    guid = new ArrayList<String>();
                }
                return this.guid;
            }

        }

    }

}
