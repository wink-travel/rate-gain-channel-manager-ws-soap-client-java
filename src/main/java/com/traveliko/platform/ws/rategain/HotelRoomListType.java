
package com.traveliko.platform.ws.rategain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HotelRoomListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *         &lt;element name="Guests" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Guest" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *                             &lt;element name="Loyalty" maxOccurs="5" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedLoyaltyGroup"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GuaranteePayment" maxOccurs="2" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelPaymentFormType"&gt;
 *                                     &lt;attribute name="DetailType"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;enumeration value="Payment"/&gt;
 *                                           &lt;enumeration value="Guarantee"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="GuaranteeType"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to32"&gt;
 *                                           &lt;enumeration value="GuaranteeRequired"/&gt;
 *                                           &lt;enumeration value="None"/&gt;
 *                                           &lt;enumeration value="CC/DC/Voucher"/&gt;
 *                                           &lt;enumeration value="Profile"/&gt;
 *                                           &lt;enumeration value="Deposit"/&gt;
 *                                           &lt;enumeration value="PrePay"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AdditionalDetails" type="{http://www.opentravel.org/OTA/2003/05}AdditionalDetailsType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="GuestAction" type="{http://www.opentravel.org/OTA/2003/05}ActionType" /&gt;
 *                           &lt;attribute name="PrintConfoInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MasterContact" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UniqueIDs" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="9" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Loyalty" maxOccurs="5" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedLoyaltyGroup"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MasterAccount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DirectBillType"&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BillingType"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RoomStays" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RoomStay" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType"&gt;
 *                           &lt;sequence minOccurs="0"&gt;
 *                             &lt;element name="HotelReservationIDs" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationIDsType" minOccurs="0"/&gt;
 *                             &lt;element name="RoomShares" type="{http://www.opentravel.org/OTA/2003/05}RoomSharesType" minOccurs="0"/&gt;
 *                             &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *                             &lt;choice minOccurs="0"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType"/&gt;
 *                                 &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/&gt;
 *                               &lt;/sequence&gt;
 *                               &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType"/&gt;
 *                             &lt;/choice&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="RoomStay" type="{http://www.opentravel.org/OTA/2003/05}ActionType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Event" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EventContact" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/&gt;
 *                 &lt;attribute name="MeetingName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/&gt;
 *       &lt;attribute name="GroupBlockCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *       &lt;attribute name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomListType", propOrder = {
    "uniqueID",
    "guests",
    "masterContact",
    "masterAccount",
    "roomStays",
    "event"
})
public class HotelRoomListType {

    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "Guests")
    protected HotelRoomListType.Guests guests;
    @XmlElement(name = "MasterContact")
    protected HotelRoomListType.MasterContact masterContact;
    @XmlElement(name = "MasterAccount")
    protected HotelRoomListType.MasterAccount masterAccount;
    @XmlElement(name = "RoomStays")
    protected HotelRoomListType.RoomStays roomStays;
    @XmlElement(name = "Event")
    protected HotelRoomListType.Event event;
    @XmlAttribute(name = "GroupBlockCode")
    protected String groupBlockCode;
    @XmlAttribute(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlAttribute(name = "ChainCode")
    protected String chainCode;
    @XmlAttribute(name = "BrandCode")
    protected String brandCode;
    @XmlAttribute(name = "HotelCode")
    protected String hotelCode;
    @XmlAttribute(name = "HotelCityCode")
    protected String hotelCityCode;
    @XmlAttribute(name = "HotelName")
    protected String hotelName;
    @XmlAttribute(name = "HotelCodeContext")
    protected String hotelCodeContext;
    @XmlAttribute(name = "ChainName")
    protected String chainName;
    @XmlAttribute(name = "BrandName")
    protected String brandName;
    @XmlAttribute(name = "AreaID")
    protected String areaID;

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the guests property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomListType.Guests }
     *     
     */
    public HotelRoomListType.Guests getGuests() {
        return guests;
    }

    /**
     * Sets the value of the guests property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomListType.Guests }
     *     
     */
    public void setGuests(HotelRoomListType.Guests value) {
        this.guests = value;
    }

    /**
     * Gets the value of the masterContact property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomListType.MasterContact }
     *     
     */
    public HotelRoomListType.MasterContact getMasterContact() {
        return masterContact;
    }

    /**
     * Sets the value of the masterContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomListType.MasterContact }
     *     
     */
    public void setMasterContact(HotelRoomListType.MasterContact value) {
        this.masterContact = value;
    }

    /**
     * Gets the value of the masterAccount property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomListType.MasterAccount }
     *     
     */
    public HotelRoomListType.MasterAccount getMasterAccount() {
        return masterAccount;
    }

    /**
     * Sets the value of the masterAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomListType.MasterAccount }
     *     
     */
    public void setMasterAccount(HotelRoomListType.MasterAccount value) {
        this.masterAccount = value;
    }

    /**
     * Gets the value of the roomStays property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomListType.RoomStays }
     *     
     */
    public HotelRoomListType.RoomStays getRoomStays() {
        return roomStays;
    }

    /**
     * Sets the value of the roomStays property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomListType.RoomStays }
     *     
     */
    public void setRoomStays(HotelRoomListType.RoomStays value) {
        this.roomStays = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomListType.Event }
     *     
     */
    public HotelRoomListType.Event getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomListType.Event }
     *     
     */
    public void setEvent(HotelRoomListType.Event value) {
        this.event = value;
    }

    /**
     * Gets the value of the groupBlockCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupBlockCode() {
        return groupBlockCode;
    }

    /**
     * Sets the value of the groupBlockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupBlockCode(String value) {
        this.groupBlockCode = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the chainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainCode() {
        return chainCode;
    }

    /**
     * Sets the value of the chainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainCode(String value) {
        this.chainCode = value;
    }

    /**
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
    }

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the hotelCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCityCode() {
        return hotelCityCode;
    }

    /**
     * Sets the value of the hotelCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCityCode(String value) {
        this.hotelCityCode = value;
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the hotelCodeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCodeContext() {
        return hotelCodeContext;
    }

    /**
     * Sets the value of the hotelCodeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCodeContext(String value) {
        this.hotelCodeContext = value;
    }

    /**
     * Gets the value of the chainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainName() {
        return chainName;
    }

    /**
     * Sets the value of the chainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainName(String value) {
        this.chainName = value;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the areaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaID() {
        return areaID;
    }

    /**
     * Sets the value of the areaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaID(String value) {
        this.areaID = value;
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
     *         &lt;element name="EventContact" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/&gt;
     *       &lt;attribute name="MeetingName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eventContact"
    })
    public static class Event {

        @XmlElement(name = "EventContact", required = true)
        protected ContactPersonType eventContact;
        @XmlAttribute(name = "MeetingName")
        protected String meetingName;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;

        /**
         * Gets the value of the eventContact property.
         * 
         * @return
         *     possible object is
         *     {@link ContactPersonType }
         *     
         */
        public ContactPersonType getEventContact() {
            return eventContact;
        }

        /**
         * Sets the value of the eventContact property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContactPersonType }
         *     
         */
        public void setEventContact(ContactPersonType value) {
            this.eventContact = value;
        }

        /**
         * Gets the value of the meetingName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeetingName() {
            return meetingName;
        }

        /**
         * Sets the value of the meetingName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeetingName(String value) {
            this.meetingName = value;
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
     *         &lt;element name="Guest" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
     *                   &lt;element name="Loyalty" maxOccurs="5" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedLoyaltyGroup"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="GuaranteePayment" maxOccurs="2" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelPaymentFormType"&gt;
     *                           &lt;attribute name="DetailType"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;enumeration value="Payment"/&gt;
     *                                 &lt;enumeration value="Guarantee"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="GuaranteeType"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to32"&gt;
     *                                 &lt;enumeration value="GuaranteeRequired"/&gt;
     *                                 &lt;enumeration value="None"/&gt;
     *                                 &lt;enumeration value="CC/DC/Voucher"/&gt;
     *                                 &lt;enumeration value="Profile"/&gt;
     *                                 &lt;enumeration value="Deposit"/&gt;
     *                                 &lt;enumeration value="PrePay"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AdditionalDetails" type="{http://www.opentravel.org/OTA/2003/05}AdditionalDetailsType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="GuestAction" type="{http://www.opentravel.org/OTA/2003/05}ActionType" /&gt;
     *                 &lt;attribute name="PrintConfoInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/extension&gt;
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
    @XmlType(name = "", propOrder = {
        "guest"
    })
    public static class Guests {

        @XmlElement(name = "Guest", required = true)
        protected List<HotelRoomListType.Guests.Guest> guest;

        /**
         * Gets the value of the guest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelRoomListType.Guests.Guest }
         * 
         * 
         */
        public List<HotelRoomListType.Guests.Guest> getGuest() {
            if (guest == null) {
                guest = new ArrayList<HotelRoomListType.Guests.Guest>();
            }
            return this.guest;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
         *         &lt;element name="Loyalty" maxOccurs="5" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedLoyaltyGroup"/&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="GuaranteePayment" maxOccurs="2" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelPaymentFormType"&gt;
         *                 &lt;attribute name="DetailType"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;enumeration value="Payment"/&gt;
         *                       &lt;enumeration value="Guarantee"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="GuaranteeType"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to32"&gt;
         *                       &lt;enumeration value="GuaranteeRequired"/&gt;
         *                       &lt;enumeration value="None"/&gt;
         *                       &lt;enumeration value="CC/DC/Voucher"/&gt;
         *                       &lt;enumeration value="Profile"/&gt;
         *                       &lt;enumeration value="Deposit"/&gt;
         *                       &lt;enumeration value="PrePay"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AdditionalDetails" type="{http://www.opentravel.org/OTA/2003/05}AdditionalDetailsType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="GuestAction" type="{http://www.opentravel.org/OTA/2003/05}ActionType" /&gt;
         *       &lt;attribute name="PrintConfoInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "uniqueID",
            "loyalty",
            "guaranteePayment",
            "additionalDetails"
        })
        public static class Guest
            extends ContactPersonType
        {

            @XmlElement(name = "UniqueID")
            protected UniqueIDType uniqueID;
            @XmlElement(name = "Loyalty")
            protected List<HotelRoomListType.Guests.Guest.Loyalty> loyalty;
            @XmlElement(name = "GuaranteePayment")
            protected List<HotelRoomListType.Guests.Guest.GuaranteePayment> guaranteePayment;
            @XmlElement(name = "AdditionalDetails")
            protected AdditionalDetailsType additionalDetails;
            @XmlAttribute(name = "GuestAction")
            protected ActionType guestAction;
            @XmlAttribute(name = "PrintConfoInd")
            protected Boolean printConfoInd;

            /**
             * Gets the value of the uniqueID property.
             * 
             * @return
             *     possible object is
             *     {@link UniqueIDType }
             *     
             */
            public UniqueIDType getUniqueID() {
                return uniqueID;
            }

            /**
             * Sets the value of the uniqueID property.
             * 
             * @param value
             *     allowed object is
             *     {@link UniqueIDType }
             *     
             */
            public void setUniqueID(UniqueIDType value) {
                this.uniqueID = value;
            }

            /**
             * Gets the value of the loyalty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the loyalty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLoyalty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link HotelRoomListType.Guests.Guest.Loyalty }
             * 
             * 
             */
            public List<HotelRoomListType.Guests.Guest.Loyalty> getLoyalty() {
                if (loyalty == null) {
                    loyalty = new ArrayList<HotelRoomListType.Guests.Guest.Loyalty>();
                }
                return this.loyalty;
            }

            /**
             * Gets the value of the guaranteePayment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the guaranteePayment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGuaranteePayment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link HotelRoomListType.Guests.Guest.GuaranteePayment }
             * 
             * 
             */
            public List<HotelRoomListType.Guests.Guest.GuaranteePayment> getGuaranteePayment() {
                if (guaranteePayment == null) {
                    guaranteePayment = new ArrayList<HotelRoomListType.Guests.Guest.GuaranteePayment>();
                }
                return this.guaranteePayment;
            }

            /**
             * Gets the value of the additionalDetails property.
             * 
             * @return
             *     possible object is
             *     {@link AdditionalDetailsType }
             *     
             */
            public AdditionalDetailsType getAdditionalDetails() {
                return additionalDetails;
            }

            /**
             * Sets the value of the additionalDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link AdditionalDetailsType }
             *     
             */
            public void setAdditionalDetails(AdditionalDetailsType value) {
                this.additionalDetails = value;
            }

            /**
             * Gets the value of the guestAction property.
             * 
             * @return
             *     possible object is
             *     {@link ActionType }
             *     
             */
            public ActionType getGuestAction() {
                return guestAction;
            }

            /**
             * Sets the value of the guestAction property.
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType }
             *     
             */
            public void setGuestAction(ActionType value) {
                this.guestAction = value;
            }

            /**
             * Gets the value of the printConfoInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPrintConfoInd() {
                return printConfoInd;
            }

            /**
             * Sets the value of the printConfoInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPrintConfoInd(Boolean value) {
                this.printConfoInd = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelPaymentFormType"&gt;
             *       &lt;attribute name="DetailType"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;enumeration value="Payment"/&gt;
             *             &lt;enumeration value="Guarantee"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="GuaranteeType"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to32"&gt;
             *             &lt;enumeration value="GuaranteeRequired"/&gt;
             *             &lt;enumeration value="None"/&gt;
             *             &lt;enumeration value="CC/DC/Voucher"/&gt;
             *             &lt;enumeration value="Profile"/&gt;
             *             &lt;enumeration value="Deposit"/&gt;
             *             &lt;enumeration value="PrePay"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class GuaranteePayment
                extends HotelPaymentFormType
            {

                @XmlAttribute(name = "DetailType")
                protected String detailType;
                @XmlAttribute(name = "GuaranteeType")
                protected String guaranteeType;

                /**
                 * Gets the value of the detailType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDetailType() {
                    return detailType;
                }

                /**
                 * Sets the value of the detailType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDetailType(String value) {
                    this.detailType = value;
                }

                /**
                 * Gets the value of the guaranteeType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGuaranteeType() {
                    return guaranteeType;
                }

                /**
                 * Sets the value of the guaranteeType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGuaranteeType(String value) {
                    this.guaranteeType = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedLoyaltyGroup"/&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Loyalty {

                @XmlAttribute(name = "ReservationActionType")
                protected String reservationActionType;
                @XmlAttribute(name = "SelectedLoyaltyRPH")
                protected String selectedLoyaltyRPH;
                @XmlAttribute(name = "ProgramCode")
                protected String programCode;
                @XmlAttribute(name = "BonusCode")
                protected String bonusCode;
                @XmlAttribute(name = "AccountID")
                protected String accountID;
                @XmlAttribute(name = "PointsEarned")
                protected String pointsEarned;

                /**
                 * Gets the value of the reservationActionType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReservationActionType() {
                    return reservationActionType;
                }

                /**
                 * Sets the value of the reservationActionType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReservationActionType(String value) {
                    this.reservationActionType = value;
                }

                /**
                 * Gets the value of the selectedLoyaltyRPH property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSelectedLoyaltyRPH() {
                    return selectedLoyaltyRPH;
                }

                /**
                 * Sets the value of the selectedLoyaltyRPH property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSelectedLoyaltyRPH(String value) {
                    this.selectedLoyaltyRPH = value;
                }

                /**
                 * Gets the value of the programCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProgramCode() {
                    return programCode;
                }

                /**
                 * Sets the value of the programCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProgramCode(String value) {
                    this.programCode = value;
                }

                /**
                 * Gets the value of the bonusCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBonusCode() {
                    return bonusCode;
                }

                /**
                 * Sets the value of the bonusCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBonusCode(String value) {
                    this.bonusCode = value;
                }

                /**
                 * Gets the value of the accountID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccountID() {
                    return accountID;
                }

                /**
                 * Sets the value of the accountID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccountID(String value) {
                    this.accountID = value;
                }

                /**
                 * Gets the value of the pointsEarned property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPointsEarned() {
                    return pointsEarned;
                }

                /**
                 * Sets the value of the pointsEarned property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPointsEarned(String value) {
                    this.pointsEarned = value;
                }

            }

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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DirectBillType"&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BillingType"/&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MasterAccount
        extends DirectBillType
    {

        @XmlAttribute(name = "BillingType")
        protected String billingType;
        @XmlAttribute(name = "SignFoodAndBev")
        protected Boolean signFoodAndBev;

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
         * Gets the value of the signFoodAndBev property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSignFoodAndBev() {
            return signFoodAndBev;
        }

        /**
         * Sets the value of the signFoodAndBev property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSignFoodAndBev(Boolean value) {
            this.signFoodAndBev = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="UniqueIDs" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="9" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Loyalty" maxOccurs="5" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedLoyaltyGroup"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "uniqueIDs",
        "loyalty"
    })
    public static class MasterContact
        extends ContactPersonType
    {

        @XmlElement(name = "UniqueIDs")
        protected HotelRoomListType.MasterContact.UniqueIDs uniqueIDs;
        @XmlElement(name = "Loyalty")
        protected List<HotelRoomListType.MasterContact.Loyalty> loyalty;

        /**
         * Gets the value of the uniqueIDs property.
         * 
         * @return
         *     possible object is
         *     {@link HotelRoomListType.MasterContact.UniqueIDs }
         *     
         */
        public HotelRoomListType.MasterContact.UniqueIDs getUniqueIDs() {
            return uniqueIDs;
        }

        /**
         * Sets the value of the uniqueIDs property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelRoomListType.MasterContact.UniqueIDs }
         *     
         */
        public void setUniqueIDs(HotelRoomListType.MasterContact.UniqueIDs value) {
            this.uniqueIDs = value;
        }

        /**
         * Gets the value of the loyalty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the loyalty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLoyalty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelRoomListType.MasterContact.Loyalty }
         * 
         * 
         */
        public List<HotelRoomListType.MasterContact.Loyalty> getLoyalty() {
            if (loyalty == null) {
                loyalty = new ArrayList<HotelRoomListType.MasterContact.Loyalty>();
            }
            return this.loyalty;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedLoyaltyGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Loyalty {

            @XmlAttribute(name = "ReservationActionType")
            protected String reservationActionType;
            @XmlAttribute(name = "SelectedLoyaltyRPH")
            protected String selectedLoyaltyRPH;
            @XmlAttribute(name = "ProgramCode")
            protected String programCode;
            @XmlAttribute(name = "BonusCode")
            protected String bonusCode;
            @XmlAttribute(name = "AccountID")
            protected String accountID;
            @XmlAttribute(name = "PointsEarned")
            protected String pointsEarned;

            /**
             * Gets the value of the reservationActionType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReservationActionType() {
                return reservationActionType;
            }

            /**
             * Sets the value of the reservationActionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReservationActionType(String value) {
                this.reservationActionType = value;
            }

            /**
             * Gets the value of the selectedLoyaltyRPH property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelectedLoyaltyRPH() {
                return selectedLoyaltyRPH;
            }

            /**
             * Sets the value of the selectedLoyaltyRPH property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelectedLoyaltyRPH(String value) {
                this.selectedLoyaltyRPH = value;
            }

            /**
             * Gets the value of the programCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProgramCode() {
                return programCode;
            }

            /**
             * Sets the value of the programCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProgramCode(String value) {
                this.programCode = value;
            }

            /**
             * Gets the value of the bonusCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBonusCode() {
                return bonusCode;
            }

            /**
             * Sets the value of the bonusCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBonusCode(String value) {
                this.bonusCode = value;
            }

            /**
             * Gets the value of the accountID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountID() {
                return accountID;
            }

            /**
             * Sets the value of the accountID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountID(String value) {
                this.accountID = value;
            }

            /**
             * Gets the value of the pointsEarned property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPointsEarned() {
                return pointsEarned;
            }

            /**
             * Sets the value of the pointsEarned property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPointsEarned(String value) {
                this.pointsEarned = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="9" minOccurs="0"/&gt;
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
            "uniqueID"
        })
        public static class UniqueIDs {

            @XmlElement(name = "UniqueID")
            protected List<UniqueIDType> uniqueID;

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
     *       &lt;sequence&gt;
     *         &lt;element name="RoomStay" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType"&gt;
     *                 &lt;sequence minOccurs="0"&gt;
     *                   &lt;element name="HotelReservationIDs" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationIDsType" minOccurs="0"/&gt;
     *                   &lt;element name="RoomShares" type="{http://www.opentravel.org/OTA/2003/05}RoomSharesType" minOccurs="0"/&gt;
     *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
     *                   &lt;choice minOccurs="0"&gt;
     *                     &lt;sequence&gt;
     *                       &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType"/&gt;
     *                       &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/&gt;
     *                     &lt;/sequence&gt;
     *                     &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType"/&gt;
     *                   &lt;/choice&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="RoomStay" type="{http://www.opentravel.org/OTA/2003/05}ActionType" /&gt;
     *               &lt;/extension&gt;
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
    @XmlType(name = "", propOrder = {
        "roomStay"
    })
    public static class RoomStays {

        @XmlElement(name = "RoomStay", required = true)
        protected List<HotelRoomListType.RoomStays.RoomStay> roomStay;

        /**
         * Gets the value of the roomStay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomStay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomStay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelRoomListType.RoomStays.RoomStay }
         * 
         * 
         */
        public List<HotelRoomListType.RoomStays.RoomStay> getRoomStay() {
            if (roomStay == null) {
                roomStay = new ArrayList<HotelRoomListType.RoomStays.RoomStay>();
            }
            return this.roomStay;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType"&gt;
         *       &lt;sequence minOccurs="0"&gt;
         *         &lt;element name="HotelReservationIDs" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationIDsType" minOccurs="0"/&gt;
         *         &lt;element name="RoomShares" type="{http://www.opentravel.org/OTA/2003/05}RoomSharesType" minOccurs="0"/&gt;
         *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
         *         &lt;choice minOccurs="0"&gt;
         *           &lt;sequence&gt;
         *             &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType"/&gt;
         *             &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/&gt;
         *           &lt;/sequence&gt;
         *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType"/&gt;
         *         &lt;/choice&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="RoomStay" type="{http://www.opentravel.org/OTA/2003/05}ActionType" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "hotelReservationIDs",
            "roomShares",
            "uniqueID",
            "success",
            "warnings",
            "errors"
        })
        public static class RoomStay
            extends RoomStayType
        {

            @XmlElement(name = "HotelReservationIDs")
            protected HotelReservationIDsType hotelReservationIDs;
            @XmlElement(name = "RoomShares")
            protected RoomSharesType roomShares;
            @XmlElement(name = "UniqueID")
            protected UniqueIDType uniqueID;
            @XmlElement(name = "Success")
            protected SuccessType success;
            @XmlElement(name = "Warnings")
            protected WarningsType warnings;
            @XmlElement(name = "Errors")
            protected ErrorsType errors;
            @XmlAttribute(name = "RoomStay")
            protected ActionType roomStay;

            /**
             * Gets the value of the hotelReservationIDs property.
             * 
             * @return
             *     possible object is
             *     {@link HotelReservationIDsType }
             *     
             */
            public HotelReservationIDsType getHotelReservationIDs() {
                return hotelReservationIDs;
            }

            /**
             * Sets the value of the hotelReservationIDs property.
             * 
             * @param value
             *     allowed object is
             *     {@link HotelReservationIDsType }
             *     
             */
            public void setHotelReservationIDs(HotelReservationIDsType value) {
                this.hotelReservationIDs = value;
            }

            /**
             * Gets the value of the roomShares property.
             * 
             * @return
             *     possible object is
             *     {@link RoomSharesType }
             *     
             */
            public RoomSharesType getRoomShares() {
                return roomShares;
            }

            /**
             * Sets the value of the roomShares property.
             * 
             * @param value
             *     allowed object is
             *     {@link RoomSharesType }
             *     
             */
            public void setRoomShares(RoomSharesType value) {
                this.roomShares = value;
            }

            /**
             * Gets the value of the uniqueID property.
             * 
             * @return
             *     possible object is
             *     {@link UniqueIDType }
             *     
             */
            public UniqueIDType getUniqueID() {
                return uniqueID;
            }

            /**
             * Sets the value of the uniqueID property.
             * 
             * @param value
             *     allowed object is
             *     {@link UniqueIDType }
             *     
             */
            public void setUniqueID(UniqueIDType value) {
                this.uniqueID = value;
            }

            /**
             * Gets the value of the success property.
             * 
             * @return
             *     possible object is
             *     {@link SuccessType }
             *     
             */
            public SuccessType getSuccess() {
                return success;
            }

            /**
             * Sets the value of the success property.
             * 
             * @param value
             *     allowed object is
             *     {@link SuccessType }
             *     
             */
            public void setSuccess(SuccessType value) {
                this.success = value;
            }

            /**
             * Gets the value of the warnings property.
             * 
             * @return
             *     possible object is
             *     {@link WarningsType }
             *     
             */
            public WarningsType getWarnings() {
                return warnings;
            }

            /**
             * Sets the value of the warnings property.
             * 
             * @param value
             *     allowed object is
             *     {@link WarningsType }
             *     
             */
            public void setWarnings(WarningsType value) {
                this.warnings = value;
            }

            /**
             * Gets the value of the errors property.
             * 
             * @return
             *     possible object is
             *     {@link ErrorsType }
             *     
             */
            public ErrorsType getErrors() {
                return errors;
            }

            /**
             * Sets the value of the errors property.
             * 
             * @param value
             *     allowed object is
             *     {@link ErrorsType }
             *     
             */
            public void setErrors(ErrorsType value) {
                this.errors = value;
            }

            /**
             * Gets the value of the roomStay property.
             * 
             * @return
             *     possible object is
             *     {@link ActionType }
             *     
             */
            public ActionType getRoomStay() {
                return roomStay;
            }

            /**
             * Sets the value of the roomStay property.
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType }
             *     
             */
            public void setRoomStay(ActionType value) {
                this.roomStay = value;
            }

        }

    }

}
