//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:09 PM MSK 
//


package zakupki.models._223fz.notificationissue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import zakupki.models._223fz.types.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for notificationIssueItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationIssueItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="notificationIssueData" type="{http://zakupki.gov.ru/223fz/notificationIssue/1}notificationIssueData"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationIssueItemType", propOrder = {
    "notificationIssueData"
})
public class NotificationIssueItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected NotificationIssueData notificationIssueData;

    /**
     * Gets the value of the notificationIssueData property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationIssueData }
     *     
     */
    public NotificationIssueData getNotificationIssueData() {
        return notificationIssueData;
    }

    /**
     * Sets the value of the notificationIssueData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationIssueData }
     *     
     */
    public void setNotificationIssueData(NotificationIssueData value) {
        this.notificationIssueData = value;
    }

}