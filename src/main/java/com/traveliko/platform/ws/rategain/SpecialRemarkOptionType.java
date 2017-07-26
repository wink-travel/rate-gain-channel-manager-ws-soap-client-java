
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialRemarkOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialRemarkOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Itinerary"/&gt;
 *     &lt;enumeration value="Invoice"/&gt;
 *     &lt;enumeration value="Endorsement"/&gt;
 *     &lt;enumeration value="Save"/&gt;
 *     &lt;enumeration value="Confidential"/&gt;
 *     &lt;enumeration value="Free"/&gt;
 *     &lt;enumeration value="GRMS"/&gt;
 *     &lt;enumeration value="Split"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpecialRemarkOptionType")
@XmlEnum
public enum SpecialRemarkOptionType {

    @XmlEnumValue("Itinerary")
    ITINERARY("Itinerary"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("Endorsement")
    ENDORSEMENT("Endorsement"),
    @XmlEnumValue("Save")
    SAVE("Save"),
    @XmlEnumValue("Confidential")
    CONFIDENTIAL("Confidential"),
    @XmlEnumValue("Free")
    FREE("Free"),
    GRMS("GRMS"),
    @XmlEnumValue("Split")
    SPLIT("Split");
    private final String value;

    SpecialRemarkOptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialRemarkOptionType fromValue(String v) {
        for (SpecialRemarkOptionType c: SpecialRemarkOptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
