//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:12 PM MSK 
//


package zakupki.models._223fz.purchaseplan;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for purchasePlanItemCheckResultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="purchasePlanItemCheckResultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="PASSED"/>
 *     &lt;enumeration value="CANCELED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "purchasePlanItemCheckResultType")
@XmlEnum
public enum PurchasePlanItemCheckResultType {


    /**
     * Ошибка
     * 
     */
    ERROR,

    /**
     * Пройдена
     * 
     */
    PASSED,

    /**
     * Отменена
     * 
     */
    CANCELED;

    public String value() {
        return name();
    }

    public static PurchasePlanItemCheckResultType fromValue(String v) {
        return valueOf(v);
    }

}
