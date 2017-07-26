
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationDetailRequirementAddlDriverInfoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationDetailRequirementAddlDriverInfoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="IncludedAuthorized"/&gt;
 *     &lt;enumeration value="AdditionalAuthorized"/&gt;
 *     &lt;enumeration value="Fees"/&gt;
 *     &lt;enumeration value="Miscellaneous"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationDetailRequirementAddlDriverInfoType")
@XmlEnum
public enum LocationDetailRequirementAddlDriverInfoType {

    @XmlEnumValue("IncludedAuthorized")
    INCLUDED_AUTHORIZED("IncludedAuthorized"),
    @XmlEnumValue("AdditionalAuthorized")
    ADDITIONAL_AUTHORIZED("AdditionalAuthorized"),
    @XmlEnumValue("Fees")
    FEES("Fees"),
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous");
    private final String value;

    LocationDetailRequirementAddlDriverInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDetailRequirementAddlDriverInfoType fromValue(String v) {
        for (LocationDetailRequirementAddlDriverInfoType c: LocationDetailRequirementAddlDriverInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
