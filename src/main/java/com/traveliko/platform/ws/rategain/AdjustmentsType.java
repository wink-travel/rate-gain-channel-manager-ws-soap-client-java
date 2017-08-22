
package com.traveliko.platform.ws.rategain;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustmentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Adjustment" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PromotionCodeGroup"/&gt;
 *                 &lt;attribute name="ReservationOriginatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *                 &lt;attribute name="ConfirmationID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *                 &lt;attribute name="ReservationID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *                 &lt;attribute name="RoomInventoryCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *                 &lt;attribute name="AdjustReason" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
 *                 &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                 &lt;attribute name="InvValue"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                       &lt;enumeration value="1"/&gt;
 *                       &lt;enumeration value="-1"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RequestID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentsType", propOrder = {
    "adjustment"
})
public class AdjustmentsType {

    @XmlElement(name = "Adjustment", required = true)
    protected List<AdjustmentsType.Adjustment> adjustment;
    @XmlAttribute(name = "RequestID")
    protected String requestID;

    /**
     * Gets the value of the adjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdjustmentsType.Adjustment }
     * 
     * 
     */
    public List<AdjustmentsType.Adjustment> getAdjustment() {
        if (adjustment == null) {
            adjustment = new ArrayList<AdjustmentsType.Adjustment>();
        }
        return this.adjustment;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PromotionCodeGroup"/&gt;
     *       &lt;attribute name="ReservationOriginatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
     *       &lt;attribute name="ConfirmationID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
     *       &lt;attribute name="ReservationID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
     *       &lt;attribute name="RoomInventoryCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
     *       &lt;attribute name="AdjustReason" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
     *       &lt;attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *       &lt;attribute name="InvValue"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *             &lt;enumeration value="1"/&gt;
     *             &lt;enumeration value="-1"/&gt;
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
    @XmlType(name = "")
    public static class Adjustment {

        @XmlAttribute(name = "ReservationOriginatorCode")
        protected String reservationOriginatorCode;
        @XmlAttribute(name = "ConfirmationID")
        protected String confirmationID;
        @XmlAttribute(name = "ReservationID")
        protected String reservationID;
        @XmlAttribute(name = "RoomInventoryCode")
        protected String roomInventoryCode;
        @XmlAttribute(name = "AdjustReason")
        protected String adjustReason;
        @XmlAttribute(name = "Sequence")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger sequence;
        @XmlAttribute(name = "InvValue")
        protected BigInteger invValue;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "PromotionCode")
        protected String promotionCode;
        @XmlAttribute(name = "PromotionVendorCode")
        protected List<String> promotionVendorCode;

        /**
         * Gets the value of the reservationOriginatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReservationOriginatorCode() {
            return reservationOriginatorCode;
        }

        /**
         * Sets the value of the reservationOriginatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReservationOriginatorCode(String value) {
            this.reservationOriginatorCode = value;
        }

        /**
         * Gets the value of the confirmationID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfirmationID() {
            return confirmationID;
        }

        /**
         * Sets the value of the confirmationID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfirmationID(String value) {
            this.confirmationID = value;
        }

        /**
         * Gets the value of the reservationID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReservationID() {
            return reservationID;
        }

        /**
         * Sets the value of the reservationID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReservationID(String value) {
            this.reservationID = value;
        }

        /**
         * Gets the value of the roomInventoryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomInventoryCode() {
            return roomInventoryCode;
        }

        /**
         * Sets the value of the roomInventoryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomInventoryCode(String value) {
            this.roomInventoryCode = value;
        }

        /**
         * Gets the value of the adjustReason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdjustReason() {
            return adjustReason;
        }

        /**
         * Sets the value of the adjustReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdjustReason(String value) {
            this.adjustReason = value;
        }

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequence(BigInteger value) {
            this.sequence = value;
        }

        /**
         * Gets the value of the invValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getInvValue() {
            return invValue;
        }

        /**
         * Sets the value of the invValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setInvValue(BigInteger value) {
            this.invValue = value;
        }

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * Gets the value of the promotionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromotionCode() {
            return promotionCode;
        }

        /**
         * Sets the value of the promotionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromotionCode(String value) {
            this.promotionCode = value;
        }

        /**
         * Gets the value of the promotionVendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotionVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPromotionVendorCode() {
            if (promotionVendorCode == null) {
                promotionVendorCode = new ArrayList<String>();
            }
            return this.promotionVendorCode;
        }

    }

}
