
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GlobalIndicatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="AP"/&gt;
 *     &lt;enumeration value="AT"/&gt;
 *     &lt;enumeration value="CT"/&gt;
 *     &lt;enumeration value="DO"/&gt;
 *     &lt;enumeration value="EH"/&gt;
 *     &lt;enumeration value="FE"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="PN"/&gt;
 *     &lt;enumeration value="PO"/&gt;
 *     &lt;enumeration value="RU"/&gt;
 *     &lt;enumeration value="RW"/&gt;
 *     &lt;enumeration value="SA"/&gt;
 *     &lt;enumeration value="TS"/&gt;
 *     &lt;enumeration value="WH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalIndicatorType")
@XmlEnum
public enum GlobalIndicatorType {

    AP,
    AT,
    CT,
    DO,
    EH,
    FE,
    PA,
    PN,
    PO,
    RU,
    RW,
    SA,
    TS,
    WH;

    public String value() {
        return name();
    }

    public static GlobalIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
