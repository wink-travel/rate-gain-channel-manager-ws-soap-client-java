
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayOrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisplayOrderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="ByDepartureTime"/&gt;
 *     &lt;enumeration value="ByArrivalTime"/&gt;
 *     &lt;enumeration value="ByJourneyTime"/&gt;
 *     &lt;enumeration value="ByPriceHighToLow"/&gt;
 *     &lt;enumeration value="ByPriceLowToHigh"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DisplayOrderType")
@XmlEnum
public enum DisplayOrderType {

    @XmlEnumValue("ByDepartureTime")
    BY_DEPARTURE_TIME("ByDepartureTime"),
    @XmlEnumValue("ByArrivalTime")
    BY_ARRIVAL_TIME("ByArrivalTime"),
    @XmlEnumValue("ByJourneyTime")
    BY_JOURNEY_TIME("ByJourneyTime"),
    @XmlEnumValue("ByPriceHighToLow")
    BY_PRICE_HIGH_TO_LOW("ByPriceHighToLow"),
    @XmlEnumValue("ByPriceLowToHigh")
    BY_PRICE_LOW_TO_HIGH("ByPriceLowToHigh");
    private final String value;

    DisplayOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisplayOrderType fromValue(String v) {
        for (DisplayOrderType c: DisplayOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
