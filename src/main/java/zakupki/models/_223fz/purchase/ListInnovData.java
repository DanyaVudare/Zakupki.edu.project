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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import zakupki.models._223fz.types.CustomerInfoType;
import zakupki.models._223fz.types.DocumentListType;
import zakupki.models._223fz.types.ListInnovStatusType;


/**
 * Перечень товаров, работ, услуг, удовлетворяющих критериям отнесения к инновационной продукции, высокотехнологичной продукции
 * 
 * <p>Java class for listInnovData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listInnovData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="parentId" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
 *         &lt;element name="urlEIS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="urlVSRZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="urlKisRmis" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="blockedCustomer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType" minOccurs="0"/>
 *         &lt;element name="placer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="publicationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/223fz/types/1}listInnovStatusType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://zakupki.gov.ru/223fz/types/1}versionType"/>
 *         &lt;element name="modificationDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="innovPositions" type="{http://zakupki.gov.ru/223fz/purchase/1}innovPositionListType"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/223fz/types/1}documentListType" minOccurs="0"/>
 *         &lt;element name="hasOkdpRows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasOkpd2Rows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="signatureAuthorizedBody" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listInnovData", propOrder = {
    "guid",
    "parentId",
    "urlEIS",
    "urlVSRZ",
    "urlKisRmis",
    "createDateTime",
    "customer",
    "blockedCustomer",
    "placer",
    "publicationDate",
    "status",
    "version",
    "modificationDescription",
    "innovPositions",
    "attachments",
    "hasOkdpRows",
    "hasOkpd2Rows",
    "signatureAuthorizedBody"
})
public class ListInnovData {

    @XmlElement(required = true)
    protected String guid;
    protected String parentId;
    protected String urlEIS;
    protected String urlVSRZ;
    protected String urlKisRmis;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlElement(required = true)
    protected CustomerInfoType customer;
    protected CustomerInfoType blockedCustomer;
    @XmlElement(required = true)
    protected CustomerInfoType placer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationDate;
    @XmlSchemaType(name = "string")
    protected ListInnovStatusType status;
    protected long version;
    protected String modificationDescription;
    @XmlElement(required = true)
    protected InnovPositionListType innovPositions;
    protected DocumentListType attachments;
    protected Boolean hasOkdpRows;
    protected Boolean hasOkpd2Rows;
    protected byte[] signatureAuthorizedBody;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the urlEIS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlEIS() {
        return urlEIS;
    }

    /**
     * Sets the value of the urlEIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlEIS(String value) {
        this.urlEIS = value;
    }

    /**
     * Gets the value of the urlVSRZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlVSRZ() {
        return urlVSRZ;
    }

    /**
     * Sets the value of the urlVSRZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlVSRZ(String value) {
        this.urlVSRZ = value;
    }

    /**
     * Gets the value of the urlKisRmis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlKisRmis() {
        return urlKisRmis;
    }

    /**
     * Sets the value of the urlKisRmis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlKisRmis(String value) {
        this.urlKisRmis = value;
    }

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setCustomer(CustomerInfoType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the blockedCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getBlockedCustomer() {
        return blockedCustomer;
    }

    /**
     * Sets the value of the blockedCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setBlockedCustomer(CustomerInfoType value) {
        this.blockedCustomer = value;
    }

    /**
     * Gets the value of the placer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getPlacer() {
        return placer;
    }

    /**
     * Sets the value of the placer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setPlacer(CustomerInfoType value) {
        this.placer = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationDate(XMLGregorianCalendar value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ListInnovStatusType }
     *     
     */
    public ListInnovStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListInnovStatusType }
     *     
     */
    public void setStatus(ListInnovStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(long value) {
        this.version = value;
    }

    /**
     * Gets the value of the modificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationDescription() {
        return modificationDescription;
    }

    /**
     * Sets the value of the modificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationDescription(String value) {
        this.modificationDescription = value;
    }

    /**
     * Gets the value of the innovPositions property.
     * 
     * @return
     *     possible object is
     *     {@link InnovPositionListType }
     *     
     */
    public InnovPositionListType getInnovPositions() {
        return innovPositions;
    }

    /**
     * Sets the value of the innovPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link InnovPositionListType }
     *     
     */
    public void setInnovPositions(InnovPositionListType value) {
        this.innovPositions = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentListType }
     *     
     */
    public DocumentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentListType }
     *     
     */
    public void setAttachments(DocumentListType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the hasOkdpRows property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOkdpRows() {
        return hasOkdpRows;
    }

    /**
     * Sets the value of the hasOkdpRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOkdpRows(Boolean value) {
        this.hasOkdpRows = value;
    }

    /**
     * Gets the value of the hasOkpd2Rows property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOkpd2Rows() {
        return hasOkpd2Rows;
    }

    /**
     * Sets the value of the hasOkpd2Rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOkpd2Rows(Boolean value) {
        this.hasOkpd2Rows = value;
    }

    /**
     * Gets the value of the signatureAuthorizedBody property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignatureAuthorizedBody() {
        return signatureAuthorizedBody;
    }

    /**
     * Sets the value of the signatureAuthorizedBody property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignatureAuthorizedBody(byte[] value) {
        this.signatureAuthorizedBody = value;
    }

}
