
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncludeExcludeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IncludeExcludeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Include"/&gt;
 *     &lt;enumeration value="Exclude"/&gt;
 *     &lt;enumeration value="Required"/&gt;
 *     &lt;enumeration value="Allowed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IncludeExcludeType")
@XmlEnum
public enum IncludeExcludeType {

    @XmlEnumValue("Include")
    INCLUDE("Include"),
    @XmlEnumValue("Exclude")
    EXCLUDE("Exclude"),
    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("Allowed")
    ALLOWED("Allowed");
    private final String value;

    IncludeExcludeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncludeExcludeType fromValue(String v) {
        for (IncludeExcludeType c: IncludeExcludeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
