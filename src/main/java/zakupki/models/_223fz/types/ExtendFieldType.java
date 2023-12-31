//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:17 PM MSK 
//


package zakupki.models._223fz.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extendFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="extendFieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="INTEGER"/>
 *     &lt;enumeration value="NUMBER"/>
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="TIME"/>
 *     &lt;enumeration value="DATETIME"/>
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="LINK"/>
 *     &lt;enumeration value="FILE"/>
 *     &lt;enumeration value="REGEXP"/>
 *     &lt;enumeration value="CURRENCY"/>
 *     &lt;enumeration value="UNITS"/>
 *     &lt;enumeration value="OKDP"/>
 *     &lt;enumeration value="OKPD2"/>
 *     &lt;enumeration value="OKVED"/>
 *     &lt;enumeration value="OKVED2"/>
 *     &lt;enumeration value="TABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "extendFieldType")
@XmlEnum
public enum ExtendFieldType {


    /**
     * Строка
     * 
     */
    STRING("STRING"),

    /**
     * Текст
     * 
     */
    TEXT("TEXT"),

    /**
     * Целое число
     * 
     */
    INTEGER("INTEGER"),

    /**
     * Число
     * 
     */
    NUMBER("NUMBER"),

    /**
     * Логический
     * 
     */
    BOOLEAN("BOOLEAN"),

    /**
     * Время
     * 
     */
    TIME("TIME"),

    /**
     * Дата / время
     * 
     */
    DATETIME("DATETIME"),

    /**
     * Дата
     * 
     */
    DATE("DATE"),

    /**
     * Гиперссылка
     * 
     */
    LINK("LINK"),

    /**
     * Файл
     * 
     */
    FILE("FILE"),

    /**
     * Значение по шаблону
     * 
     */
    REGEXP("REGEXP"),

    /**
     * Справочник «Валюта»
     * 
     */
    CURRENCY("CURRENCY"),

    /**
     * Справочник «Единицы измерения»
     * 
     */
    UNITS("UNITS"),

    /**
     * Справочник «ОКДП»
     * 
     */
    OKDP("OKDP"),

    /**
     * Справочник «ОКПД2»
     * 
     */
    @XmlEnumValue("OKPD2")
    OKPD_2("OKPD2"),

    /**
     * Справочник «ОКВЭД»
     * 
     */
    OKVED("OKVED"),

    /**
     * Справочник «ОКВЭД2»
     * 
     */
    @XmlEnumValue("OKVED2")
    OKVED_2("OKVED2"),

    /**
     * Табличное представление из справочника
     * 
     */
    TABLE("TABLE");
    private final String value;

    ExtendFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtendFieldType fromValue(String v) {
        for (ExtendFieldType c: ExtendFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
