
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirTripType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AirTripType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OneWay"/&gt;
 *     &lt;enumeration value="OneWayOnly"/&gt;
 *     &lt;enumeration value="Return"/&gt;
 *     &lt;enumeration value="Circle"/&gt;
 *     &lt;enumeration value="OpenJaw"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Outbound"/&gt;
 *     &lt;enumeration value="OutboundSeasonRoundtrip"/&gt;
 *     &lt;enumeration value="Non-directional"/&gt;
 *     &lt;enumeration value="Inbound"/&gt;
 *     &lt;enumeration value="Roundtrip"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AirTripType")
@XmlEnum
public enum AirTripType {

    @XmlEnumValue("OneWay")
    ONE_WAY("OneWay"),
    @XmlEnumValue("OneWayOnly")
    ONE_WAY_ONLY("OneWayOnly"),
    @XmlEnumValue("Return")
    RETURN("Return"),
    @XmlEnumValue("Circle")
    CIRCLE("Circle"),
    @XmlEnumValue("OpenJaw")
    OPEN_JAW("OpenJaw"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Outbound")
    OUTBOUND("Outbound"),
    @XmlEnumValue("OutboundSeasonRoundtrip")
    OUTBOUND_SEASON_ROUNDTRIP("OutboundSeasonRoundtrip"),
    @XmlEnumValue("Non-directional")
    NON_DIRECTIONAL("Non-directional"),
    @XmlEnumValue("Inbound")
    INBOUND("Inbound"),
    @XmlEnumValue("Roundtrip")
    ROUNDTRIP("Roundtrip");
    private final String value;

    AirTripType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AirTripType fromValue(String v) {
        for (AirTripType c: AirTripType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
