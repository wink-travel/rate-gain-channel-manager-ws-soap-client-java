
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficeLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfficeLocationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Main"/&gt;
 *     &lt;enumeration value="Field"/&gt;
 *     &lt;enumeration value="Division"/&gt;
 *     &lt;enumeration value="Regional"/&gt;
 *     &lt;enumeration value="Remote"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OfficeLocationType")
@XmlEnum
public enum OfficeLocationType {

    @XmlEnumValue("Main")
    MAIN("Main"),
    @XmlEnumValue("Field")
    FIELD("Field"),
    @XmlEnumValue("Division")
    DIVISION("Division"),
    @XmlEnumValue("Regional")
    REGIONAL("Regional"),
    @XmlEnumValue("Remote")
    REMOTE("Remote");
    private final String value;

    OfficeLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OfficeLocationType fromValue(String v) {
        for (OfficeLocationType c: OfficeLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
