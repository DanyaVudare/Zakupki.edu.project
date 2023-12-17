//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:08 PM MSK 
//


package zakupki.models._223fz.purchase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import zakupki.models._223fz.types.CurrencyType;
import zakupki.models._223fz.types.CustomerInfoType;
import zakupki.models._223fz.types.DocumentListType;
import zakupki.models._223fz.types.PurchaseContractAccountStatusType;


/**
 * Отчетность о договорах
 * 
 * <p>Java class for purchaseContractAccountDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseContractAccountDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="parentId" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
 *         &lt;element name="creationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
 *         &lt;element name="placer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="docType" type="{http://zakupki.gov.ru/223fz/purchase/1}docTypeType" minOccurs="0"/>
 *         &lt;element name="docTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractsNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="contractsOverallCost" type="{http://zakupki.gov.ru/223fz/types/1}unsignedMoney2" minOccurs="0"/>
 *         &lt;element name="contractsNumberInnovation" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="contractsOverallCostInnovation" type="{http://zakupki.gov.ru/223fz/types/1}unsignedMoney2" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType" minOccurs="0"/>
 *         &lt;element name="publicationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="typeCode" type="{http://zakupki.gov.ru/223fz/types/1}purchaseContractTypeCodeType"/>
 *         &lt;element name="typeDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/223fz/types/1}purchaseContractAccountStatusType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://zakupki.gov.ru/223fz/types/1}versionType" minOccurs="0"/>
 *         &lt;element name="modificationDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="phone" type="{http://zakupki.gov.ru/223fz/purchase/1}phoneType" minOccurs="0"/>
 *         &lt;element name="email" type="{http://zakupki.gov.ru/223fz/types/1}emailType" minOccurs="0"/>
 *         &lt;element name="contractAccountCaseInfo" type="{http://zakupki.gov.ru/223fz/purchase/1}contractAccountCaseInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contractAccountTotal" type="{http://zakupki.gov.ru/223fz/purchase/1}contractAccountTotalType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="russianGoodsPurchasesInfo" type="{http://zakupki.gov.ru/223fz/purchase/1}russianGoodsPurchasesInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contractAccountInfoRel" type="{http://zakupki.gov.ru/223fz/purchase/1}contractAccountInfoRelType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="updateInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="updateInfoRel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/223fz/types/1}documentListType" minOccurs="0"/>
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
@XmlType(name = "purchaseContractAccountDataType", propOrder = {
    "guid",
    "parentId",
    "creationDateTime",
    "urlEIS",
    "urlVSRZ",
    "urlKisRmis",
    "placer",
    "customer",
    "period",
    "docType",
    "docTypeDescription",
    "contractsNumber",
    "contractsOverallCost",
    "contractsNumberInnovation",
    "contractsOverallCostInnovation",
    "currency",
    "publicationDateTime",
    "typeCode",
    "typeDescription",
    "status",
    "version",
    "modificationDescription",
    "phone",
    "email",
    "contractAccountCaseInfo",
    "contractAccountTotal",
    "russianGoodsPurchasesInfo",
    "contractAccountInfoRel",
    "updateInfo",
    "updateInfoRel",
    "attachments",
    "signatureAuthorizedBody"
})
public class PurchaseContractAccountDataType {

    @XmlElement(required = true)
    protected String guid;
    protected String parentId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    protected String urlEIS;
    protected String urlVSRZ;
    protected String urlKisRmis;
    @XmlElement(required = true)
    protected CustomerInfoType placer;
    @XmlElement(required = true)
    protected CustomerInfoType customer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar period;
    @XmlSchemaType(name = "string")
    protected DocTypeType docType;
    protected String docTypeDescription;
    @XmlSchemaType(name = "unsignedInt")
    protected Long contractsNumber;
    protected BigDecimal contractsOverallCost;
    @XmlSchemaType(name = "unsignedInt")
    protected Long contractsNumberInnovation;
    protected BigDecimal contractsOverallCostInnovation;
    protected CurrencyType currency;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationDateTime;
    protected int typeCode;
    protected String typeDescription;
    @XmlSchemaType(name = "string")
    protected PurchaseContractAccountStatusType status;
    protected Long version;
    protected String modificationDescription;
    protected PhoneType phone;
    protected String email;
    protected List<ContractAccountCaseInfoType> contractAccountCaseInfo;
    protected List<ContractAccountTotalType> contractAccountTotal;
    protected List<RussianGoodsPurchasesInfoType> russianGoodsPurchasesInfo;
    protected List<ContractAccountInfoRelType> contractAccountInfoRel;
    protected Boolean updateInfo;
    protected Boolean updateInfoRel;
    protected DocumentListType attachments;
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
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
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
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriod(XMLGregorianCalendar value) {
        this.period = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link DocTypeType }
     *     
     */
    public DocTypeType getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocTypeType }
     *     
     */
    public void setDocType(DocTypeType value) {
        this.docType = value;
    }

    /**
     * Gets the value of the docTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTypeDescription() {
        return docTypeDescription;
    }

    /**
     * Sets the value of the docTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTypeDescription(String value) {
        this.docTypeDescription = value;
    }

    /**
     * Gets the value of the contractsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractsNumber() {
        return contractsNumber;
    }

    /**
     * Sets the value of the contractsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractsNumber(Long value) {
        this.contractsNumber = value;
    }

    /**
     * Gets the value of the contractsOverallCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContractsOverallCost() {
        return contractsOverallCost;
    }

    /**
     * Sets the value of the contractsOverallCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContractsOverallCost(BigDecimal value) {
        this.contractsOverallCost = value;
    }

    /**
     * Gets the value of the contractsNumberInnovation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractsNumberInnovation() {
        return contractsNumberInnovation;
    }

    /**
     * Sets the value of the contractsNumberInnovation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractsNumberInnovation(Long value) {
        this.contractsNumberInnovation = value;
    }

    /**
     * Gets the value of the contractsOverallCostInnovation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContractsOverallCostInnovation() {
        return contractsOverallCostInnovation;
    }

    /**
     * Sets the value of the contractsOverallCostInnovation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContractsOverallCostInnovation(BigDecimal value) {
        this.contractsOverallCostInnovation = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCurrency(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the publicationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationDateTime() {
        return publicationDateTime;
    }

    /**
     * Sets the value of the publicationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationDateTime(XMLGregorianCalendar value) {
        this.publicationDateTime = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     */
    public int getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     */
    public void setTypeCode(int value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the typeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDescription() {
        return typeDescription;
    }

    /**
     * Sets the value of the typeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDescription(String value) {
        this.typeDescription = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseContractAccountStatusType }
     *     
     */
    public PurchaseContractAccountStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseContractAccountStatusType }
     *     
     */
    public void setStatus(PurchaseContractAccountStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
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
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    public void setPhone(PhoneType value) {
        this.phone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the contractAccountCaseInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractAccountCaseInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractAccountCaseInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractAccountCaseInfoType }
     * 
     * 
     */
    public List<ContractAccountCaseInfoType> getContractAccountCaseInfo() {
        if (contractAccountCaseInfo == null) {
            contractAccountCaseInfo = new ArrayList<ContractAccountCaseInfoType>();
        }
        return this.contractAccountCaseInfo;
    }

    /**
     * Gets the value of the contractAccountTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractAccountTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractAccountTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractAccountTotalType }
     * 
     * 
     */
    public List<ContractAccountTotalType> getContractAccountTotal() {
        if (contractAccountTotal == null) {
            contractAccountTotal = new ArrayList<ContractAccountTotalType>();
        }
        return this.contractAccountTotal;
    }

    /**
     * Gets the value of the russianGoodsPurchasesInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the russianGoodsPurchasesInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRussianGoodsPurchasesInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RussianGoodsPurchasesInfoType }
     * 
     * 
     */
    public List<RussianGoodsPurchasesInfoType> getRussianGoodsPurchasesInfo() {
        if (russianGoodsPurchasesInfo == null) {
            russianGoodsPurchasesInfo = new ArrayList<RussianGoodsPurchasesInfoType>();
        }
        return this.russianGoodsPurchasesInfo;
    }

    /**
     * Gets the value of the contractAccountInfoRel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractAccountInfoRel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractAccountInfoRel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractAccountInfoRelType }
     * 
     * 
     */
    public List<ContractAccountInfoRelType> getContractAccountInfoRel() {
        if (contractAccountInfoRel == null) {
            contractAccountInfoRel = new ArrayList<ContractAccountInfoRelType>();
        }
        return this.contractAccountInfoRel;
    }

    /**
     * Gets the value of the updateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateInfo() {
        return updateInfo;
    }

    /**
     * Sets the value of the updateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateInfo(Boolean value) {
        this.updateInfo = value;
    }

    /**
     * Gets the value of the updateInfoRel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateInfoRel() {
        return updateInfoRel;
    }

    /**
     * Sets the value of the updateInfoRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateInfoRel(Boolean value) {
        this.updateInfoRel = value;
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