
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareAccessPrefType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FareAccessPrefType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="PointToPoint"/&gt;
 *     &lt;enumeration value="Through"/&gt;
 *     &lt;enumeration value="Joint"/&gt;
 *     &lt;enumeration value="Private"/&gt;
 *     &lt;enumeration value="Negotiated"/&gt;
 *     &lt;enumeration value="Net"/&gt;
 *     &lt;enumeration value="Historical"/&gt;
 *     &lt;enumeration value="SecurateAir"/&gt;
 *     &lt;enumeration value="Moneysaver"/&gt;
 *     &lt;enumeration value="MoneysaverRoundtrip"/&gt;
 *     &lt;enumeration value="MoneysaverNoOneWay"/&gt;
 *     &lt;enumeration value="MoneysaverOneWayOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FareAccessPrefType")
@XmlEnum
public enum FareAccessPrefType {

    @XmlEnumValue("PointToPoint")
    POINT_TO_POINT("PointToPoint"),
    @XmlEnumValue("Through")
    THROUGH("Through"),
    @XmlEnumValue("Joint")
    JOINT("Joint"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Negotiated")
    NEGOTIATED("Negotiated"),
    @XmlEnumValue("Net")
    NET("Net"),
    @XmlEnumValue("Historical")
    HISTORICAL("Historical"),
    @XmlEnumValue("SecurateAir")
    SECURATE_AIR("SecurateAir"),
    @XmlEnumValue("Moneysaver")
    MONEYSAVER("Moneysaver"),
    @XmlEnumValue("MoneysaverRoundtrip")
    MONEYSAVER_ROUNDTRIP("MoneysaverRoundtrip"),
    @XmlEnumValue("MoneysaverNoOneWay")
    MONEYSAVER_NO_ONE_WAY("MoneysaverNoOneWay"),
    @XmlEnumValue("MoneysaverOneWayOnly")
    MONEYSAVER_ONE_WAY_ONLY("MoneysaverOneWayOnly");
    private final String value;

    FareAccessPrefType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareAccessPrefType fromValue(String v) {
        for (FareAccessPrefType c: FareAccessPrefType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
