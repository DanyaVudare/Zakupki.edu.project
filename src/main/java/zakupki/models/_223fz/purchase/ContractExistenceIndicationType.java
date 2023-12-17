//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:08 PM MSK 
//


package zakupki.models._223fz.purchase;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractExistenceIndicationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contractExistenceIndicationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_SUBJECT"/>
 *     &lt;enumeration value="CUSTOMER_SOLUTION"/>
 *     &lt;enumeration value="SINGLE_SUPPLIER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contractExistenceIndicationType")
@XmlEnum
public enum ContractExistenceIndicationType {


    /**
     * Договор заключен по результатам закупки, сведения о которой не подлежат размещению в ЕИС в соответствии с частью 15 статьи 4 223-ФЗ
     * 
     */
    NOT_SUBJECT,

    /**
     * Договор заключен по результатам закупки, указанной в пунктах 1 - 3 части 15 статьи 4 223-ФЗ в случае принятия заказчиком решения о неразмещении сведений о таких закупках в ЕИС
     * 
     */
    CUSTOMER_SOLUTION,

    /**
     * Договор заключен по результатам закупки, у единственного поставщика (подрядчика, исполнителя), если в соответствии с положением о закупке сведения о таких закупках не размещаются заказчиком в ЕИС
     * 
     */
    SINGLE_SUPPLIER;

    public String value() {
        return name();
    }

    public static ContractExistenceIndicationType fromValue(String v) {
        return valueOf(v);
    }

}
