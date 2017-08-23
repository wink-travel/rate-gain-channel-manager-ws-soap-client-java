
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurposeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PurposeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Sell"/>
 *     &lt;enumeration value="Net"/>
 *     &lt;enumeration value="Base"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="Additional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PurposeType")
@XmlEnum
public enum PurposeType {

    @XmlEnumValue("Sell")
    SELL("Sell"),
    @XmlEnumValue("Net")
    NET("Net"),
    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Additional")
    ADDITIONAL("Additional");
    private final String value;

    PurposeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurposeType fromValue(String v) {
        for (PurposeType c: PurposeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
