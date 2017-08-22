
package com.traveliko.platform.ws.rategain;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VehicleRentalCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleRentalCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PickUpLocation" maxOccurs="2" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *                 &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" /&gt;
 *                 &lt;attribute name="CounterLocation" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReturnLocation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *                 &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" /&gt;
 *                 &lt;attribute name="CounterLocation" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PickUpDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ReturnDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="StartChargesDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="StopChargesDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="OneWayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MultiIslandRentalDays" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" /&gt;
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="DistUnitName" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalCoreType", propOrder = {
    "pickUpLocation",
    "returnLocation"
})
@XmlSeeAlso({
    com.traveliko.platform.ws.rategain.VehicleRentalTransactionType.PickUpReturnDetails.class
})
public class VehicleRentalCoreType {

    @XmlElement(name = "PickUpLocation")
    protected List<VehicleRentalCoreType.PickUpLocation> pickUpLocation;
    @XmlElement(name = "ReturnLocation")
    protected VehicleRentalCoreType.ReturnLocation returnLocation;
    @XmlAttribute(name = "PickUpDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickUpDateTime;
    @XmlAttribute(name = "ReturnDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDateTime;
    @XmlAttribute(name = "StartChargesDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startChargesDateTime;
    @XmlAttribute(name = "StopChargesDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stopChargesDateTime;
    @XmlAttribute(name = "OneWayIndicator")
    protected Boolean oneWayIndicator;
    @XmlAttribute(name = "MultiIslandRentalDays")
    protected Integer multiIslandRentalDays;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;
    @XmlAttribute(name = "DistUnitName")
    protected DistanceUnitNameType distUnitName;

    /**
     * Gets the value of the pickUpLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickUpLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickUpLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalCoreType.PickUpLocation }
     * 
     * 
     */
    public List<VehicleRentalCoreType.PickUpLocation> getPickUpLocation() {
        if (pickUpLocation == null) {
            pickUpLocation = new ArrayList<VehicleRentalCoreType.PickUpLocation>();
        }
        return this.pickUpLocation;
    }

    /**
     * Gets the value of the returnLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCoreType.ReturnLocation }
     *     
     */
    public VehicleRentalCoreType.ReturnLocation getReturnLocation() {
        return returnLocation;
    }

    /**
     * Sets the value of the returnLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCoreType.ReturnLocation }
     *     
     */
    public void setReturnLocation(VehicleRentalCoreType.ReturnLocation value) {
        this.returnLocation = value;
    }

    /**
     * Gets the value of the pickUpDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickUpDateTime() {
        return pickUpDateTime;
    }

    /**
     * Sets the value of the pickUpDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickUpDateTime(XMLGregorianCalendar value) {
        this.pickUpDateTime = value;
    }

    /**
     * Gets the value of the returnDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDateTime() {
        return returnDateTime;
    }

    /**
     * Sets the value of the returnDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDateTime(XMLGregorianCalendar value) {
        this.returnDateTime = value;
    }

    /**
     * Gets the value of the startChargesDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartChargesDateTime() {
        return startChargesDateTime;
    }

    /**
     * Sets the value of the startChargesDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartChargesDateTime(XMLGregorianCalendar value) {
        this.startChargesDateTime = value;
    }

    /**
     * Gets the value of the stopChargesDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStopChargesDateTime() {
        return stopChargesDateTime;
    }

    /**
     * Sets the value of the stopChargesDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStopChargesDateTime(XMLGregorianCalendar value) {
        this.stopChargesDateTime = value;
    }

    /**
     * Gets the value of the oneWayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneWayIndicator() {
        return oneWayIndicator;
    }

    /**
     * Sets the value of the oneWayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneWayIndicator(Boolean value) {
        this.oneWayIndicator = value;
    }

    /**
     * Gets the value of the multiIslandRentalDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultiIslandRentalDays() {
        return multiIslandRentalDays;
    }

    /**
     * Sets the value of the multiIslandRentalDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultiIslandRentalDays(Integer value) {
        this.multiIslandRentalDays = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the distUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceUnitNameType }
     *     
     */
    public DistanceUnitNameType getDistUnitName() {
        return distUnitName;
    }

    /**
     * Sets the value of the distUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceUnitNameType }
     *     
     */
    public void setDistUnitName(DistanceUnitNameType value) {
        this.distUnitName = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
     *       &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" /&gt;
     *       &lt;attribute name="CounterLocation" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PickUpLocation
        extends LocationType
    {

        @XmlAttribute(name = "ExtendedLocationCode")
        protected String extendedLocationCode;
        @XmlAttribute(name = "CounterLocation")
        protected String counterLocation;

        /**
         * Gets the value of the extendedLocationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedLocationCode() {
            return extendedLocationCode;
        }

        /**
         * Sets the value of the extendedLocationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedLocationCode(String value) {
            this.extendedLocationCode = value;
        }

        /**
         * Gets the value of the counterLocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCounterLocation() {
            return counterLocation;
        }

        /**
         * Sets the value of the counterLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCounterLocation(String value) {
            this.counterLocation = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
     *       &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" /&gt;
     *       &lt;attribute name="CounterLocation" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReturnLocation
        extends LocationType
    {

        @XmlAttribute(name = "ExtendedLocationCode")
        protected String extendedLocationCode;
        @XmlAttribute(name = "CounterLocation")
        protected String counterLocation;

        /**
         * Gets the value of the extendedLocationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedLocationCode() {
            return extendedLocationCode;
        }

        /**
         * Sets the value of the extendedLocationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedLocationCode(String value) {
            this.extendedLocationCode = value;
        }

        /**
         * Gets the value of the counterLocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCounterLocation() {
            return counterLocation;
        }

        /**
         * Sets the value of the counterLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCounterLocation(String value) {
            this.counterLocation = value;
        }

    }

}
