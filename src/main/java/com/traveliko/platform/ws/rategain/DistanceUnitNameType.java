
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistanceUnitNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DistanceUnitNameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Mile"/&gt;
 *     &lt;enumeration value="Km"/&gt;
 *     &lt;enumeration value="Block"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DistanceUnitNameType")
@XmlEnum
public enum DistanceUnitNameType {

    @XmlEnumValue("Mile")
    MILE("Mile"),
    @XmlEnumValue("Km")
    KM("Km"),
    @XmlEnumValue("Block")
    BLOCK("Block");
    private final String value;

    DistanceUnitNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistanceUnitNameType fromValue(String v) {
        for (DistanceUnitNameType c: DistanceUnitNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
