
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareApplicationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FareApplicationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OneWay"/&gt;
 *     &lt;enumeration value="Return"/&gt;
 *     &lt;enumeration value="HalfReturn"/&gt;
 *     &lt;enumeration value="Roundtrip"/&gt;
 *     &lt;enumeration value="OneWayOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FareApplicationType")
@XmlEnum
public enum FareApplicationType {

    @XmlEnumValue("OneWay")
    ONE_WAY("OneWay"),
    @XmlEnumValue("Return")
    RETURN("Return"),
    @XmlEnumValue("HalfReturn")
    HALF_RETURN("HalfReturn"),
    @XmlEnumValue("Roundtrip")
    ROUNDTRIP("Roundtrip"),
    @XmlEnumValue("OneWayOnly")
    ONE_WAY_ONLY("OneWayOnly");
    private final String value;

    FareApplicationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareApplicationType fromValue(String v) {
        for (FareApplicationType c: FareApplicationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
