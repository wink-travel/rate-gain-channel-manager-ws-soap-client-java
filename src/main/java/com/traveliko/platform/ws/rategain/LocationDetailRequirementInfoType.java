
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationDetailRequirementInfoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationDetailRequirementInfoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="OneWayRental"/&gt;
 *     &lt;enumeration value="Geographic"/&gt;
 *     &lt;enumeration value="DropOff"/&gt;
 *     &lt;enumeration value="License"/&gt;
 *     &lt;enumeration value="Insurance"/&gt;
 *     &lt;enumeration value="Eligibility"/&gt;
 *     &lt;enumeration value="Miscellaneous"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationDetailRequirementInfoType")
@XmlEnum
public enum LocationDetailRequirementInfoType {

    @XmlEnumValue("OneWayRental")
    ONE_WAY_RENTAL("OneWayRental"),
    @XmlEnumValue("Geographic")
    GEOGRAPHIC("Geographic"),
    @XmlEnumValue("DropOff")
    DROP_OFF("DropOff"),
    @XmlEnumValue("License")
    LICENSE("License"),
    @XmlEnumValue("Insurance")
    INSURANCE("Insurance"),
    @XmlEnumValue("Eligibility")
    ELIGIBILITY("Eligibility"),
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous");
    private final String value;

    LocationDetailRequirementInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDetailRequirementInfoType fromValue(String v) {
        for (LocationDetailRequirementInfoType c: LocationDetailRequirementInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
