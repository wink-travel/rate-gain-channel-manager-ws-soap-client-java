
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for VehicleCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VehicleTypeGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VehClass" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VehicleClassGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AirConditionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TransmissionType" type="{http://www.opentravel.org/OTA/2003/05}VehicleTransmissionType" /&gt;
 *       &lt;attribute name="FuelType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="Unspecified"/&gt;
 *             &lt;enumeration value="Diesel"/&gt;
 *             &lt;enumeration value="Hybrid"/&gt;
 *             &lt;enumeration value="Electric"/&gt;
 *             &lt;enumeration value="LPG_CompressedGas"/&gt;
 *             &lt;enumeration value="Hydrogen"/&gt;
 *             &lt;enumeration value="MultiFuel"/&gt;
 *             &lt;enumeration value="Petrol"/&gt;
 *             &lt;enumeration value="Ethanol"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="DriveType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="AWD"/&gt;
 *             &lt;enumeration value="4WD"/&gt;
 *             &lt;enumeration value="Unspecified"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleCoreType", propOrder = {
    "vehType",
    "vehClass"
})
@XmlSeeAlso({
    com.traveliko.platform.ws.rategain.VehicleAdditionalDriverRequirementsType.AddlDriverInfos.Vehicles.Vehicle.class,
    com.traveliko.platform.ws.rategain.VehicleAgeRequirementsType.Age.Vehicles.Vehicle.class,
    VehiclePrefType.class,
    VehicleType.class
})
public class VehicleCoreType {

    @XmlElement(name = "VehType")
    protected VehicleCoreType.VehType vehType;
    @XmlElement(name = "VehClass")
    protected VehicleCoreType.VehClass vehClass;
    @XmlAttribute(name = "AirConditionInd")
    protected Boolean airConditionInd;
    @XmlAttribute(name = "TransmissionType")
    protected VehicleTransmissionType transmissionType;
    @XmlAttribute(name = "FuelType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fuelType;
    @XmlAttribute(name = "DriveType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String driveType;

    /**
     * Gets the value of the vehType property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCoreType.VehType }
     *     
     */
    public VehicleCoreType.VehType getVehType() {
        return vehType;
    }

    /**
     * Sets the value of the vehType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCoreType.VehType }
     *     
     */
    public void setVehType(VehicleCoreType.VehType value) {
        this.vehType = value;
    }

    /**
     * Gets the value of the vehClass property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCoreType.VehClass }
     *     
     */
    public VehicleCoreType.VehClass getVehClass() {
        return vehClass;
    }

    /**
     * Sets the value of the vehClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCoreType.VehClass }
     *     
     */
    public void setVehClass(VehicleCoreType.VehClass value) {
        this.vehClass = value;
    }

    /**
     * Gets the value of the airConditionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirConditionInd() {
        return airConditionInd;
    }

    /**
     * Sets the value of the airConditionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirConditionInd(Boolean value) {
        this.airConditionInd = value;
    }

    /**
     * Gets the value of the transmissionType property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTransmissionType }
     *     
     */
    public VehicleTransmissionType getTransmissionType() {
        return transmissionType;
    }

    /**
     * Sets the value of the transmissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTransmissionType }
     *     
     */
    public void setTransmissionType(VehicleTransmissionType value) {
        this.transmissionType = value;
    }

    /**
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelType(String value) {
        this.fuelType = value;
    }

    /**
     * Gets the value of the driveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriveType() {
        return driveType;
    }

    /**
     * Sets the value of the driveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriveType(String value) {
        this.driveType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VehicleClassGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehClass {

        @XmlAttribute(name = "Size", required = true)
        protected String size;

        /**
         * Gets the value of the size property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSize() {
            return size;
        }

        /**
         * Sets the value of the size property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSize(String value) {
            this.size = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VehicleTypeGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehType {

        @XmlAttribute(name = "VehicleCategory", required = true)
        protected String vehicleCategory;
        @XmlAttribute(name = "DoorCount")
        protected String doorCount;

        /**
         * Gets the value of the vehicleCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVehicleCategory() {
            return vehicleCategory;
        }

        /**
         * Sets the value of the vehicleCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVehicleCategory(String value) {
            this.vehicleCategory = value;
        }

        /**
         * Gets the value of the doorCount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDoorCount() {
            return doorCount;
        }

        /**
         * Sets the value of the doorCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDoorCount(String value) {
            this.doorCount = value;
        }

    }

}
