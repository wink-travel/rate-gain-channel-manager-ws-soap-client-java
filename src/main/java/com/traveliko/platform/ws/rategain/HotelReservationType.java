
package com.traveliko.platform.ws.rategain;

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
 * <p>Java class for HotelReservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}POS_Type" minOccurs="0"/>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="RoomStays" type="{http://www.opentravel.org/OTA/2003/05}RoomStaysType" minOccurs="0"/>
 *         &lt;element name="Services" type="{http://www.opentravel.org/OTA/2003/05}ServicesType" minOccurs="0"/>
 *         &lt;element name="BillingInstructionCode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ResGuestRPH" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                 &lt;attribute name="BillingCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BillingType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AccountNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResGuests" type="{http://www.opentravel.org/OTA/2003/05}ResGuestsType" minOccurs="0"/>
 *         &lt;element name="ResGlobalInfo" type="{http://www.opentravel.org/OTA/2003/05}ResGlobalInfoType" minOccurs="0"/>
 *         &lt;element name="WrittenConfInst" type="{http://www.opentravel.org/OTA/2003/05}WrittenConfInstType" minOccurs="0"/>
 *         &lt;element name="Queue" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QueueGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeStampGroup"/>
 *       &lt;attribute name="RoomStayReservation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ResStatus" type="{http://www.opentravel.org/OTA/2003/05}HotelResStatusType" />
 *       &lt;attribute name="ForcedSellIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ServiceOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RateOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="WalkInIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RoomNumberLockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OriginalDeliveryMethodCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="PassiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelReservationType", propOrder = {
    "pos",
    "uniqueID",
    "roomStays",
    "services",
    "billingInstructionCode",
    "resGuests",
    "resGlobalInfo",
    "writtenConfInst",
    "queue",
    "tpaExtensions"
})
@XmlSeeAlso({
    com.traveliko.platform.ws.rategain.HotelReservationsType.HotelReservation.class,
    com.traveliko.platform.ws.rategain.HotelResModifyType.HotelResModify.class
})
public class HotelReservationType {

    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "UniqueID")
    protected List<UniqueIDType> uniqueID;
    @XmlElement(name = "RoomStays")
    protected RoomStaysType roomStays;
    @XmlElement(name = "Services")
    protected ServicesType services;
    @XmlElement(name = "BillingInstructionCode")
    protected List<HotelReservationType.BillingInstructionCode> billingInstructionCode;
    @XmlElement(name = "ResGuests")
    protected ResGuestsType resGuests;
    @XmlElement(name = "ResGlobalInfo")
    protected ResGlobalInfoType resGlobalInfo;
    @XmlElement(name = "WrittenConfInst")
    protected WrittenConfInstType writtenConfInst;
    @XmlElement(name = "Queue")
    protected HotelReservationType.Queue queue;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "RoomStayReservation")
    protected Boolean roomStayReservation;
    @XmlAttribute(name = "ResStatus")
    protected String resStatus;
    @XmlAttribute(name = "ForcedSellIndicator")
    protected Boolean forcedSellIndicator;
    @XmlAttribute(name = "ServiceOverrideIndicator")
    protected Boolean serviceOverrideIndicator;
    @XmlAttribute(name = "RateOverrideIndicator")
    protected Boolean rateOverrideIndicator;
    @XmlAttribute(name = "WalkInIndicator")
    protected Boolean walkInIndicator;
    @XmlAttribute(name = "RoomNumberLockedIndicator")
    protected Boolean roomNumberLockedIndicator;
    @XmlAttribute(name = "OriginalDeliveryMethodCode")
    protected String originalDeliveryMethodCode;
    @XmlAttribute(name = "PassiveIndicator")
    protected Boolean passiveIndicator;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;
    @XmlAttribute(name = "LastModifyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDateTime;
    @XmlAttribute(name = "LastModifierID")
    protected String lastModifierID;
    @XmlAttribute(name = "PurgeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purgeDate;

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link POSType }
     *     
     */
    public POSType getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSType }
     *     
     */
    public void setPOS(POSType value) {
        this.pos = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniqueID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIDType }
     * 
     * 
     */
    public List<UniqueIDType> getUniqueID() {
        if (uniqueID == null) {
            uniqueID = new ArrayList<UniqueIDType>();
        }
        return this.uniqueID;
    }

    /**
     * Gets the value of the roomStays property.
     * 
     * @return
     *     possible object is
     *     {@link RoomStaysType }
     *     
     */
    public RoomStaysType getRoomStays() {
        return roomStays;
    }

    /**
     * Sets the value of the roomStays property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStaysType }
     *     
     */
    public void setRoomStays(RoomStaysType value) {
        this.roomStays = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link ServicesType }
     *     
     */
    public ServicesType getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicesType }
     *     
     */
    public void setServices(ServicesType value) {
        this.services = value;
    }

    /**
     * Gets the value of the billingInstructionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingInstructionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingInstructionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelReservationType.BillingInstructionCode }
     * 
     * 
     */
    public List<HotelReservationType.BillingInstructionCode> getBillingInstructionCode() {
        if (billingInstructionCode == null) {
            billingInstructionCode = new ArrayList<HotelReservationType.BillingInstructionCode>();
        }
        return this.billingInstructionCode;
    }

    /**
     * Gets the value of the resGuests property.
     * 
     * @return
     *     possible object is
     *     {@link ResGuestsType }
     *     
     */
    public ResGuestsType getResGuests() {
        return resGuests;
    }

    /**
     * Sets the value of the resGuests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResGuestsType }
     *     
     */
    public void setResGuests(ResGuestsType value) {
        this.resGuests = value;
    }

    /**
     * Gets the value of the resGlobalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResGlobalInfoType }
     *     
     */
    public ResGlobalInfoType getResGlobalInfo() {
        return resGlobalInfo;
    }

    /**
     * Sets the value of the resGlobalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResGlobalInfoType }
     *     
     */
    public void setResGlobalInfo(ResGlobalInfoType value) {
        this.resGlobalInfo = value;
    }

    /**
     * Gets the value of the writtenConfInst property.
     * 
     * @return
     *     possible object is
     *     {@link WrittenConfInstType }
     *     
     */
    public WrittenConfInstType getWrittenConfInst() {
        return writtenConfInst;
    }

    /**
     * Sets the value of the writtenConfInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link WrittenConfInstType }
     *     
     */
    public void setWrittenConfInst(WrittenConfInstType value) {
        this.writtenConfInst = value;
    }

    /**
     * Gets the value of the queue property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationType.Queue }
     *     
     */
    public HotelReservationType.Queue getQueue() {
        return queue;
    }

    /**
     * Sets the value of the queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationType.Queue }
     *     
     */
    public void setQueue(HotelReservationType.Queue value) {
        this.queue = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the roomStayReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoomStayReservation() {
        return roomStayReservation;
    }

    /**
     * Sets the value of the roomStayReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoomStayReservation(Boolean value) {
        this.roomStayReservation = value;
    }

    /**
     * Gets the value of the resStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResStatus() {
        return resStatus;
    }

    /**
     * Sets the value of the resStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResStatus(String value) {
        this.resStatus = value;
    }

    /**
     * Gets the value of the forcedSellIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForcedSellIndicator() {
        return forcedSellIndicator;
    }

    /**
     * Sets the value of the forcedSellIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcedSellIndicator(Boolean value) {
        this.forcedSellIndicator = value;
    }

    /**
     * Gets the value of the serviceOverrideIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceOverrideIndicator() {
        return serviceOverrideIndicator;
    }

    /**
     * Sets the value of the serviceOverrideIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceOverrideIndicator(Boolean value) {
        this.serviceOverrideIndicator = value;
    }

    /**
     * Gets the value of the rateOverrideIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateOverrideIndicator() {
        return rateOverrideIndicator;
    }

    /**
     * Sets the value of the rateOverrideIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateOverrideIndicator(Boolean value) {
        this.rateOverrideIndicator = value;
    }

    /**
     * Gets the value of the walkInIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWalkInIndicator() {
        return walkInIndicator;
    }

    /**
     * Sets the value of the walkInIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWalkInIndicator(Boolean value) {
        this.walkInIndicator = value;
    }

    /**
     * Gets the value of the roomNumberLockedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoomNumberLockedIndicator() {
        return roomNumberLockedIndicator;
    }

    /**
     * Sets the value of the roomNumberLockedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoomNumberLockedIndicator(Boolean value) {
        this.roomNumberLockedIndicator = value;
    }

    /**
     * Gets the value of the originalDeliveryMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDeliveryMethodCode() {
        return originalDeliveryMethodCode;
    }

    /**
     * Sets the value of the originalDeliveryMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDeliveryMethodCode(String value) {
        this.originalDeliveryMethodCode = value;
    }

    /**
     * Gets the value of the passiveIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassiveIndicator() {
        return passiveIndicator;
    }

    /**
     * Sets the value of the passiveIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassiveIndicator(Boolean value) {
        this.passiveIndicator = value;
    }

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the creatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * Sets the value of the creatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

    /**
     * Gets the value of the lastModifyDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**
     * Sets the value of the lastModifyDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifyDateTime(XMLGregorianCalendar value) {
        this.lastModifyDateTime = value;
    }

    /**
     * Gets the value of the lastModifierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifierID() {
        return lastModifierID;
    }

    /**
     * Sets the value of the lastModifierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifierID(String value) {
        this.lastModifierID = value;
    }

    /**
     * Gets the value of the purgeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurgeDate() {
        return purgeDate;
    }

    /**
     * Sets the value of the purgeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurgeDate(XMLGregorianCalendar value) {
        this.purgeDate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ResGuestRPH" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *       &lt;attribute name="BillingCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BillingType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AccountNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resGuestRPH"
    })
    public static class BillingInstructionCode {

        @XmlElement(name = "ResGuestRPH")
        protected List<HotelReservationType.BillingInstructionCode.ResGuestRPH> resGuestRPH;
        @XmlAttribute(name = "BillingCode", required = true)
        protected String billingCode;
        @XmlAttribute(name = "BillingType")
        protected String billingType;
        @XmlAttribute(name = "AuthorizationCode")
        protected String authorizationCode;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "AccountNumber")
        protected String accountNumber;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;

        /**
         * Gets the value of the resGuestRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resGuestRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResGuestRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelReservationType.BillingInstructionCode.ResGuestRPH }
         * 
         * 
         */
        public List<HotelReservationType.BillingInstructionCode.ResGuestRPH> getResGuestRPH() {
            if (resGuestRPH == null) {
                resGuestRPH = new ArrayList<HotelReservationType.BillingInstructionCode.ResGuestRPH>();
            }
            return this.resGuestRPH;
        }

        /**
         * Gets the value of the billingCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingCode() {
            return billingCode;
        }

        /**
         * Sets the value of the billingCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingCode(String value) {
            this.billingCode = value;
        }

        /**
         * Gets the value of the billingType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingType() {
            return billingType;
        }

        /**
         * Sets the value of the billingType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingType(String value) {
            this.billingType = value;
        }

        /**
         * Gets the value of the authorizationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthorizationCode() {
            return authorizationCode;
        }

        /**
         * Sets the value of the authorizationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthorizationCode(String value) {
            this.authorizationCode = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the accountNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountNumber() {
            return accountNumber;
        }

        /**
         * Sets the value of the accountNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountNumber(String value) {
            this.accountNumber = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ResGuestRPH {

            @XmlAttribute(name = "RPH", required = true)
            protected String rph;

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QueueGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Queue {

        @XmlAttribute(name = "PseudoCityCode")
        protected String pseudoCityCode;
        @XmlAttribute(name = "QueueNumber")
        protected String queueNumber;
        @XmlAttribute(name = "QueueCategory")
        protected String queueCategory;
        @XmlAttribute(name = "SystemCode")
        protected String systemCode;
        @XmlAttribute(name = "QueueID")
        protected String queueID;

        /**
         * Gets the value of the pseudoCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPseudoCityCode() {
            return pseudoCityCode;
        }

        /**
         * Sets the value of the pseudoCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPseudoCityCode(String value) {
            this.pseudoCityCode = value;
        }

        /**
         * Gets the value of the queueNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueNumber() {
            return queueNumber;
        }

        /**
         * Sets the value of the queueNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueNumber(String value) {
            this.queueNumber = value;
        }

        /**
         * Gets the value of the queueCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueCategory() {
            return queueCategory;
        }

        /**
         * Sets the value of the queueCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueCategory(String value) {
            this.queueCategory = value;
        }

        /**
         * Gets the value of the systemCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSystemCode() {
            return systemCode;
        }

        /**
         * Sets the value of the systemCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSystemCode(String value) {
            this.systemCode = value;
        }

        /**
         * Gets the value of the queueID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueID() {
            return queueID;
        }

        /**
         * Sets the value of the queueID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueID(String value) {
            this.queueID = value;
        }

    }

}
