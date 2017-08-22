
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="Waitlist"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *     &lt;enumeration value="Need"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionCodeType")
@XmlEnum
public enum ActionCodeType {

    OK("OK"),
    @XmlEnumValue("Waitlist")
    WAITLIST("Waitlist"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Need")
    NEED("Need");
    private final String value;

    ActionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionCodeType fromValue(String v) {
        for (ActionCodeType c: ActionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
