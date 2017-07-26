
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "value"
})
@XmlSeeAlso({
    AirportPrefType.class,
    com.traveliko.platform.ws.rategain.VehicleAvailCoreType.VendorLocation.class,
    com.traveliko.platform.ws.rategain.VehicleAvailCoreType.DropOffLocation.class,
    com.traveliko.platform.ws.rategain.VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation.class,
    com.traveliko.platform.ws.rategain.VehicleRentalCoreType.PickUpLocation.class,
    com.traveliko.platform.ws.rategain.VehicleRentalCoreType.ReturnLocation.class,
    com.traveliko.platform.ws.rategain.ConnectionType.ConnectionLocation.class,
    com.traveliko.platform.ws.rategain.ItemSearchCriterionType.CodeRef.class,
    com.traveliko.platform.ws.rategain.OriginDestinationInformationType.OriginLocation.class,
    com.traveliko.platform.ws.rategain.OriginDestinationInformationType.DestinationLocation.class,
    com.traveliko.platform.ws.rategain.VerificationType.StartLocation.class,
    com.traveliko.platform.ws.rategain.VerificationType.EndLocation.class
})
public class LocationType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "LocationCode")
    protected String locationCode;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the codeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContext() {
        return codeContext;
    }

    /**
     * Sets the value of the codeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

}
