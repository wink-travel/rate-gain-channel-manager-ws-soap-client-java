
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayOfWeekType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayOfWeekType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Mon"/&gt;
 *     &lt;enumeration value="Tue"/&gt;
 *     &lt;enumeration value="Wed"/&gt;
 *     &lt;enumeration value="Thu"/&gt;
 *     &lt;enumeration value="Fri"/&gt;
 *     &lt;enumeration value="Sat"/&gt;
 *     &lt;enumeration value="Sun"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DayOfWeekType")
@XmlEnum
public enum DayOfWeekType {

    @XmlEnumValue("Mon")
    MON("Mon"),
    @XmlEnumValue("Tue")
    TUE("Tue"),
    @XmlEnumValue("Wed")
    WED("Wed"),
    @XmlEnumValue("Thu")
    THU("Thu"),
    @XmlEnumValue("Fri")
    FRI("Fri"),
    @XmlEnumValue("Sat")
    SAT("Sat"),
    @XmlEnumValue("Sun")
    SUN("Sun");
    private final String value;

    DayOfWeekType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayOfWeekType fromValue(String v) {
        for (DayOfWeekType c: DayOfWeekType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
