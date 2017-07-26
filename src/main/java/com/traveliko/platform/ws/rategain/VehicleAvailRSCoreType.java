
package com.traveliko.platform.ws.rategain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleAvailRSCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailRSCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType"/&gt;
 *         &lt;element name="VehVendorAvails"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VehVendorAvail" type="{http://www.opentravel.org/OTA/2003/05}VehicleVendorAvailabilityType" maxOccurs="20"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAvailRSCoreType", propOrder = {
    "vehRentalCore",
    "vehVendorAvails"
})
public class VehicleAvailRSCoreType {

    @XmlElement(name = "VehRentalCore", required = true)
    protected VehicleRentalCoreType vehRentalCore;
    @XmlElement(name = "VehVendorAvails", required = true)
    protected VehicleAvailRSCoreType.VehVendorAvails vehVendorAvails;

    /**
     * Gets the value of the vehRentalCore property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCoreType }
     *     
     */
    public VehicleRentalCoreType getVehRentalCore() {
        return vehRentalCore;
    }

    /**
     * Sets the value of the vehRentalCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCoreType }
     *     
     */
    public void setVehRentalCore(VehicleRentalCoreType value) {
        this.vehRentalCore = value;
    }

    /**
     * Gets the value of the vehVendorAvails property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailRSCoreType.VehVendorAvails }
     *     
     */
    public VehicleAvailRSCoreType.VehVendorAvails getVehVendorAvails() {
        return vehVendorAvails;
    }

    /**
     * Sets the value of the vehVendorAvails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailRSCoreType.VehVendorAvails }
     *     
     */
    public void setVehVendorAvails(VehicleAvailRSCoreType.VehVendorAvails value) {
        this.vehVendorAvails = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="VehVendorAvail" type="{http://www.opentravel.org/OTA/2003/05}VehicleVendorAvailabilityType" maxOccurs="20"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vehVendorAvail"
    })
    public static class VehVendorAvails {

        @XmlElement(name = "VehVendorAvail", required = true)
        protected List<VehicleVendorAvailabilityType> vehVendorAvail;

        /**
         * Gets the value of the vehVendorAvail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehVendorAvail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehVendorAvail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleVendorAvailabilityType }
         * 
         * 
         */
        public List<VehicleVendorAvailabilityType> getVehVendorAvail() {
            if (vehVendorAvail == null) {
                vehVendorAvail = new ArrayList<VehicleVendorAvailabilityType>();
            }
            return this.vehVendorAvail;
        }

    }

}
