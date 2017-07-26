
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PMS_ResStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PMS_ResStatusType"&gt;
 *   &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to16"&gt;
 *     &lt;enumeration value="Reserved"/&gt;
 *     &lt;enumeration value="Requested"/&gt;
 *     &lt;enumeration value="Request denied"/&gt;
 *     &lt;enumeration value="No-show"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="In-house"/&gt;
 *     &lt;enumeration value="Checked out"/&gt;
 *     &lt;enumeration value="Waitlisted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PMS_ResStatusType")
@XmlEnum
public enum PMSResStatusType {

    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Request denied")
    REQUEST_DENIED("Request denied"),
    @XmlEnumValue("No-show")
    NO_SHOW("No-show"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("In-house")
    IN_HOUSE("In-house"),
    @XmlEnumValue("Checked out")
    CHECKED_OUT("Checked out"),
    @XmlEnumValue("Waitlisted")
    WAITLISTED("Waitlisted");
    private final String value;

    PMSResStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PMSResStatusType fromValue(String v) {
        for (PMSResStatusType c: PMSResStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
