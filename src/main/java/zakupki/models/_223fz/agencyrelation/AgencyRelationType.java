//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:13 PM MSK 
//


package zakupki.models._223fz.agencyrelation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agencyRelationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="agencyRelationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "agencyRelationType")
@XmlEnum
public enum AgencyRelationType {


    /**
     * Организация, являющаяся представителем заказчика
     * 
     */
    R,

    /**
     * Обособленное подразделение заказчика
     * 
     */
    B,

    /**
     * Организация-правопреемник
     * 
     */
    S,

    /**
     * Организация, согласующая закупки с уполномоченным органом
     * 
     */
    C;

    public String value() {
        return name();
    }

    public static AgencyRelationType fromValue(String v) {
        return valueOf(v);
    }

}
