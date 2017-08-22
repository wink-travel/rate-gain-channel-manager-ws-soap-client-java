
package com.traveliko.platform.ws.rategain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for RateRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdvanceBooking" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
 *                 &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PickupReturnRules" maxOccurs="7" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EarliestPickup" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *                           &lt;attribute name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LatestPickup" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *                           &lt;attribute name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LatestReturn" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *                           &lt;attribute name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="EarliestReturn" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *                           &lt;attribute name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *                 &lt;attribute name="MinimumKeep" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="MaximumKeep" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="MaximumRental" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="OvernightInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ReturnAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RateGuarantee" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentRulesType">
 *                 &lt;sequence>
 *                   &lt;element name="AcceptablePayments" maxOccurs="2" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AcceptablePayment" maxOccurs="20">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="CreditCardCode" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardCodeType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="PaymentTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CancelPenaltyInfo" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Deadline" maxOccurs="2" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PenaltyFee" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="GuaranteeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ModifyPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RateDeposit" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
 *                 &lt;attribute name="DepositRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MinimumKeep" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="MaximumKeep" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="MaximumRental" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateRulesType", propOrder = {
    "advanceBooking",
    "pickupReturnRules",
    "rateGuarantee",
    "paymentRules",
    "cancelPenaltyInfo",
    "rateDeposit"
})
public class RateRulesType {

    @XmlElement(name = "AdvanceBooking")
    protected RateRulesType.AdvanceBooking advanceBooking;
    @XmlElement(name = "PickupReturnRules")
    protected List<RateRulesType.PickupReturnRules> pickupReturnRules;
    @XmlElement(name = "RateGuarantee")
    protected RateRulesType.RateGuarantee rateGuarantee;
    @XmlElement(name = "PaymentRules")
    protected RateRulesType.PaymentRules paymentRules;
    @XmlElement(name = "CancelPenaltyInfo")
    protected List<RateRulesType.CancelPenaltyInfo> cancelPenaltyInfo;
    @XmlElement(name = "RateDeposit")
    protected RateRulesType.RateDeposit rateDeposit;
    @XmlAttribute(name = "MinimumKeep")
    protected Duration minimumKeep;
    @XmlAttribute(name = "MaximumKeep")
    protected Duration maximumKeep;
    @XmlAttribute(name = "MaximumRental")
    protected Duration maximumRental;

    /**
     * Gets the value of the advanceBooking property.
     * 
     * @return
     *     possible object is
     *     {@link RateRulesType.AdvanceBooking }
     *     
     */
    public RateRulesType.AdvanceBooking getAdvanceBooking() {
        return advanceBooking;
    }

    /**
     * Sets the value of the advanceBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRulesType.AdvanceBooking }
     *     
     */
    public void setAdvanceBooking(RateRulesType.AdvanceBooking value) {
        this.advanceBooking = value;
    }

    /**
     * Gets the value of the pickupReturnRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickupReturnRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickupReturnRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateRulesType.PickupReturnRules }
     * 
     * 
     */
    public List<RateRulesType.PickupReturnRules> getPickupReturnRules() {
        if (pickupReturnRules == null) {
            pickupReturnRules = new ArrayList<RateRulesType.PickupReturnRules>();
        }
        return this.pickupReturnRules;
    }

    /**
     * Gets the value of the rateGuarantee property.
     * 
     * @return
     *     possible object is
     *     {@link RateRulesType.RateGuarantee }
     *     
     */
    public RateRulesType.RateGuarantee getRateGuarantee() {
        return rateGuarantee;
    }

    /**
     * Sets the value of the rateGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRulesType.RateGuarantee }
     *     
     */
    public void setRateGuarantee(RateRulesType.RateGuarantee value) {
        this.rateGuarantee = value;
    }

    /**
     * Gets the value of the paymentRules property.
     * 
     * @return
     *     possible object is
     *     {@link RateRulesType.PaymentRules }
     *     
     */
    public RateRulesType.PaymentRules getPaymentRules() {
        return paymentRules;
    }

    /**
     * Sets the value of the paymentRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRulesType.PaymentRules }
     *     
     */
    public void setPaymentRules(RateRulesType.PaymentRules value) {
        this.paymentRules = value;
    }

    /**
     * Gets the value of the cancelPenaltyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelPenaltyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelPenaltyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateRulesType.CancelPenaltyInfo }
     * 
     * 
     */
    public List<RateRulesType.CancelPenaltyInfo> getCancelPenaltyInfo() {
        if (cancelPenaltyInfo == null) {
            cancelPenaltyInfo = new ArrayList<RateRulesType.CancelPenaltyInfo>();
        }
        return this.cancelPenaltyInfo;
    }

    /**
     * Gets the value of the rateDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link RateRulesType.RateDeposit }
     *     
     */
    public RateRulesType.RateDeposit getRateDeposit() {
        return rateDeposit;
    }

    /**
     * Sets the value of the rateDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRulesType.RateDeposit }
     *     
     */
    public void setRateDeposit(RateRulesType.RateDeposit value) {
        this.rateDeposit = value;
    }

    /**
     * Gets the value of the minimumKeep property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumKeep() {
        return minimumKeep;
    }

    /**
     * Sets the value of the minimumKeep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumKeep(Duration value) {
        this.minimumKeep = value;
    }

    /**
     * Gets the value of the maximumKeep property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumKeep() {
        return maximumKeep;
    }

    /**
     * Sets the value of the maximumKeep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumKeep(Duration value) {
        this.maximumKeep = value;
    }

    /**
     * Gets the value of the maximumRental property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumRental() {
        return maximumRental;
    }

    /**
     * Sets the value of the maximumRental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumRental(Duration value) {
        this.maximumRental = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
     *       &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdvanceBooking {

        @XmlAttribute(name = "RequiredInd")
        protected Boolean requiredInd;
        @XmlAttribute(name = "AbsoluteDeadline")
        protected String absoluteDeadline;
        @XmlAttribute(name = "OffsetTimeUnit")
        protected TimeUnitType offsetTimeUnit;
        @XmlAttribute(name = "OffsetUnitMultiplier")
        protected Integer offsetUnitMultiplier;
        @XmlAttribute(name = "OffsetDropTime")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String offsetDropTime;

        /**
         * Gets the value of the requiredInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRequiredInd() {
            return requiredInd;
        }

        /**
         * Sets the value of the requiredInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRequiredInd(Boolean value) {
            this.requiredInd = value;
        }

        /**
         * Gets the value of the absoluteDeadline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbsoluteDeadline() {
            return absoluteDeadline;
        }

        /**
         * Sets the value of the absoluteDeadline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbsoluteDeadline(String value) {
            this.absoluteDeadline = value;
        }

        /**
         * Gets the value of the offsetTimeUnit property.
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getOffsetTimeUnit() {
            return offsetTimeUnit;
        }

        /**
         * Sets the value of the offsetTimeUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setOffsetTimeUnit(TimeUnitType value) {
            this.offsetTimeUnit = value;
        }

        /**
         * Gets the value of the offsetUnitMultiplier property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOffsetUnitMultiplier() {
            return offsetUnitMultiplier;
        }

        /**
         * Sets the value of the offsetUnitMultiplier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOffsetUnitMultiplier(Integer value) {
            this.offsetUnitMultiplier = value;
        }

        /**
         * Gets the value of the offsetDropTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetDropTime() {
            return offsetDropTime;
        }

        /**
         * Sets the value of the offsetDropTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetDropTime(String value) {
            this.offsetDropTime = value;
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
     *       &lt;sequence>
     *         &lt;element name="Deadline" maxOccurs="2" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PenaltyFee" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="GuaranteeRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ModifyPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "deadline",
        "penaltyFee",
        "description"
    })
    public static class CancelPenaltyInfo {

        @XmlElement(name = "Deadline")
        protected List<RateRulesType.CancelPenaltyInfo.Deadline> deadline;
        @XmlElement(name = "PenaltyFee")
        protected RateRulesType.CancelPenaltyInfo.PenaltyFee penaltyFee;
        @XmlElement(name = "Description")
        protected FormattedTextTextType description;
        @XmlAttribute(name = "GuaranteeRequiredInd")
        protected Boolean guaranteeRequiredInd;
        @XmlAttribute(name = "ModifyPenaltyInd")
        protected Boolean modifyPenaltyInd;

        /**
         * Gets the value of the deadline property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deadline property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeadline().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RateRulesType.CancelPenaltyInfo.Deadline }
         * 
         * 
         */
        public List<RateRulesType.CancelPenaltyInfo.Deadline> getDeadline() {
            if (deadline == null) {
                deadline = new ArrayList<RateRulesType.CancelPenaltyInfo.Deadline>();
            }
            return this.deadline;
        }

        /**
         * Gets the value of the penaltyFee property.
         * 
         * @return
         *     possible object is
         *     {@link RateRulesType.CancelPenaltyInfo.PenaltyFee }
         *     
         */
        public RateRulesType.CancelPenaltyInfo.PenaltyFee getPenaltyFee() {
            return penaltyFee;
        }

        /**
         * Sets the value of the penaltyFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link RateRulesType.CancelPenaltyInfo.PenaltyFee }
         *     
         */
        public void setPenaltyFee(RateRulesType.CancelPenaltyInfo.PenaltyFee value) {
            this.penaltyFee = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link FormattedTextTextType }
         *     
         */
        public FormattedTextTextType getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormattedTextTextType }
         *     
         */
        public void setDescription(FormattedTextTextType value) {
            this.description = value;
        }

        /**
         * Gets the value of the guaranteeRequiredInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuaranteeRequiredInd() {
            return guaranteeRequiredInd;
        }

        /**
         * Sets the value of the guaranteeRequiredInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuaranteeRequiredInd(Boolean value) {
            this.guaranteeRequiredInd = value;
        }

        /**
         * Gets the value of the modifyPenaltyInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isModifyPenaltyInd() {
            return modifyPenaltyInd;
        }

        /**
         * Sets the value of the modifyPenaltyInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setModifyPenaltyInd(Boolean value) {
            this.modifyPenaltyInd = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Deadline {

            @XmlAttribute(name = "AbsoluteDeadline")
            protected String absoluteDeadline;
            @XmlAttribute(name = "OffsetTimeUnit")
            protected TimeUnitType offsetTimeUnit;
            @XmlAttribute(name = "OffsetUnitMultiplier")
            protected Integer offsetUnitMultiplier;
            @XmlAttribute(name = "OffsetDropTime")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String offsetDropTime;

            /**
             * Gets the value of the absoluteDeadline property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAbsoluteDeadline() {
                return absoluteDeadline;
            }

            /**
             * Sets the value of the absoluteDeadline property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAbsoluteDeadline(String value) {
                this.absoluteDeadline = value;
            }

            /**
             * Gets the value of the offsetTimeUnit property.
             * 
             * @return
             *     possible object is
             *     {@link TimeUnitType }
             *     
             */
            public TimeUnitType getOffsetTimeUnit() {
                return offsetTimeUnit;
            }

            /**
             * Sets the value of the offsetTimeUnit property.
             * 
             * @param value
             *     allowed object is
             *     {@link TimeUnitType }
             *     
             */
            public void setOffsetTimeUnit(TimeUnitType value) {
                this.offsetTimeUnit = value;
            }

            /**
             * Gets the value of the offsetUnitMultiplier property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getOffsetUnitMultiplier() {
                return offsetUnitMultiplier;
            }

            /**
             * Sets the value of the offsetUnitMultiplier property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setOffsetUnitMultiplier(Integer value) {
                this.offsetUnitMultiplier = value;
            }

            /**
             * Gets the value of the offsetDropTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOffsetDropTime() {
                return offsetDropTime;
            }

            /**
             * Sets the value of the offsetDropTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOffsetDropTime(String value) {
                this.offsetDropTime = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PenaltyFee {

            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Gets the value of the decimalPlaces property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * Sets the value of the decimalPlaces property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentRulesType">
     *       &lt;sequence>
     *         &lt;element name="AcceptablePayments" maxOccurs="2" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AcceptablePayment" maxOccurs="20">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="CreditCardCode" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardCodeType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="PaymentTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acceptablePayments"
    })
    public static class PaymentRules
        extends PaymentRulesType
    {

        @XmlElement(name = "AcceptablePayments")
        protected List<RateRulesType.PaymentRules.AcceptablePayments> acceptablePayments;

        /**
         * Gets the value of the acceptablePayments property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acceptablePayments property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAcceptablePayments().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RateRulesType.PaymentRules.AcceptablePayments }
         * 
         * 
         */
        public List<RateRulesType.PaymentRules.AcceptablePayments> getAcceptablePayments() {
            if (acceptablePayments == null) {
                acceptablePayments = new ArrayList<RateRulesType.PaymentRules.AcceptablePayments>();
            }
            return this.acceptablePayments;
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
         *         &lt;element name="AcceptablePayment" maxOccurs="20">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="CreditCardCode" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardCodeType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="PaymentTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "acceptablePayment"
        })
        public static class AcceptablePayments {

            @XmlElement(name = "AcceptablePayment", required = true)
            protected List<RateRulesType.PaymentRules.AcceptablePayments.AcceptablePayment> acceptablePayment;
            @XmlAttribute(name = "PaymentTypeCode")
            protected String paymentTypeCode;

            /**
             * Gets the value of the acceptablePayment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the acceptablePayment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAcceptablePayment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RateRulesType.PaymentRules.AcceptablePayments.AcceptablePayment }
             * 
             * 
             */
            public List<RateRulesType.PaymentRules.AcceptablePayments.AcceptablePayment> getAcceptablePayment() {
                if (acceptablePayment == null) {
                    acceptablePayment = new ArrayList<RateRulesType.PaymentRules.AcceptablePayments.AcceptablePayment>();
                }
                return this.acceptablePayment;
            }

            /**
             * Gets the value of the paymentTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentTypeCode() {
                return paymentTypeCode;
            }

            /**
             * Sets the value of the paymentTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentTypeCode(String value) {
                this.paymentTypeCode = value;
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
             *       &lt;attribute name="CreditCardCode" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardCodeType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AcceptablePayment {

                @XmlAttribute(name = "CreditCardCode")
                protected String creditCardCode;

                /**
                 * Gets the value of the creditCardCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCreditCardCode() {
                    return creditCardCode;
                }

                /**
                 * Sets the value of the creditCardCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCreditCardCode(String value) {
                    this.creditCardCode = value;
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EarliestPickup" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
     *                 &lt;attribute name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LatestPickup" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
     *                 &lt;attribute name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LatestReturn" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
     *                 &lt;attribute name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="EarliestReturn" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
     *                 &lt;attribute name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
     *       &lt;attribute name="MinimumKeep" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="MaximumKeep" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="MaximumRental" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="OvernightInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ReturnAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "earliestPickup",
        "latestPickup",
        "latestReturn",
        "earliestReturn"
    })
    public static class PickupReturnRules {

        @XmlElement(name = "EarliestPickup")
        protected RateRulesType.PickupReturnRules.EarliestPickup earliestPickup;
        @XmlElement(name = "LatestPickup")
        protected RateRulesType.PickupReturnRules.LatestPickup latestPickup;
        @XmlElement(name = "LatestReturn")
        protected RateRulesType.PickupReturnRules.LatestReturn latestReturn;
        @XmlElement(name = "EarliestReturn")
        protected RateRulesType.PickupReturnRules.EarliestReturn earliestReturn;
        @XmlAttribute(name = "DayOfWeek")
        protected DayOfWeekType dayOfWeek;
        @XmlAttribute(name = "MinimumKeep")
        protected Duration minimumKeep;
        @XmlAttribute(name = "MaximumKeep")
        protected Duration maximumKeep;
        @XmlAttribute(name = "MaximumRental")
        protected Duration maximumRental;
        @XmlAttribute(name = "OvernightInd")
        protected Boolean overnightInd;
        @XmlAttribute(name = "ReturnAllowedInd")
        protected Boolean returnAllowedInd;

        /**
         * Gets the value of the earliestPickup property.
         * 
         * @return
         *     possible object is
         *     {@link RateRulesType.PickupReturnRules.EarliestPickup }
         *     
         */
        public RateRulesType.PickupReturnRules.EarliestPickup getEarliestPickup() {
            return earliestPickup;
        }

        /**
         * Sets the value of the earliestPickup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RateRulesType.PickupReturnRules.EarliestPickup }
         *     
         */
        public void setEarliestPickup(RateRulesType.PickupReturnRules.EarliestPickup value) {
            this.earliestPickup = value;
        }

        /**
         * Gets the value of the latestPickup property.
         * 
         * @return
         *     possible object is
         *     {@link RateRulesType.PickupReturnRules.LatestPickup }
         *     
         */
        public RateRulesType.PickupReturnRules.LatestPickup getLatestPickup() {
            return latestPickup;
        }

        /**
         * Sets the value of the latestPickup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RateRulesType.PickupReturnRules.LatestPickup }
         *     
         */
        public void setLatestPickup(RateRulesType.PickupReturnRules.LatestPickup value) {
            this.latestPickup = value;
        }

        /**
         * Gets the value of the latestReturn property.
         * 
         * @return
         *     possible object is
         *     {@link RateRulesType.PickupReturnRules.LatestReturn }
         *     
         */
        public RateRulesType.PickupReturnRules.LatestReturn getLatestReturn() {
            return latestReturn;
        }

        /**
         * Sets the value of the latestReturn property.
         * 
         * @param value
         *     allowed object is
         *     {@link RateRulesType.PickupReturnRules.LatestReturn }
         *     
         */
        public void setLatestReturn(RateRulesType.PickupReturnRules.LatestReturn value) {
            this.latestReturn = value;
        }

        /**
         * Gets the value of the earliestReturn property.
         * 
         * @return
         *     possible object is
         *     {@link RateRulesType.PickupReturnRules.EarliestReturn }
         *     
         */
        public RateRulesType.PickupReturnRules.EarliestReturn getEarliestReturn() {
            return earliestReturn;
        }

        /**
         * Sets the value of the earliestReturn property.
         * 
         * @param value
         *     allowed object is
         *     {@link RateRulesType.PickupReturnRules.EarliestReturn }
         *     
         */
        public void setEarliestReturn(RateRulesType.PickupReturnRules.EarliestReturn value) {
            this.earliestReturn = value;
        }

        /**
         * Gets the value of the dayOfWeek property.
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeekType }
         *     
         */
        public DayOfWeekType getDayOfWeek() {
            return dayOfWeek;
        }

        /**
         * Sets the value of the dayOfWeek property.
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeekType }
         *     
         */
        public void setDayOfWeek(DayOfWeekType value) {
            this.dayOfWeek = value;
        }

        /**
         * Gets the value of the minimumKeep property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMinimumKeep() {
            return minimumKeep;
        }

        /**
         * Sets the value of the minimumKeep property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMinimumKeep(Duration value) {
            this.minimumKeep = value;
        }

        /**
         * Gets the value of the maximumKeep property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMaximumKeep() {
            return maximumKeep;
        }

        /**
         * Sets the value of the maximumKeep property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMaximumKeep(Duration value) {
            this.maximumKeep = value;
        }

        /**
         * Gets the value of the maximumRental property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMaximumRental() {
            return maximumRental;
        }

        /**
         * Sets the value of the maximumRental property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMaximumRental(Duration value) {
            this.maximumRental = value;
        }

        /**
         * Gets the value of the overnightInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOvernightInd() {
            return overnightInd;
        }

        /**
         * Sets the value of the overnightInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOvernightInd(Boolean value) {
            this.overnightInd = value;
        }

        /**
         * Gets the value of the returnAllowedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReturnAllowedInd() {
            return returnAllowedInd;
        }

        /**
         * Sets the value of the returnAllowedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReturnAllowedInd(Boolean value) {
            this.returnAllowedInd = value;
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
         *       &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
         *       &lt;attribute name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EarliestPickup {

            @XmlAttribute(name = "DayOfWeek")
            protected DayOfWeekType dayOfWeek;
            @XmlAttribute(name = "Time")
            protected String time;

            /**
             * Gets the value of the dayOfWeek property.
             * 
             * @return
             *     possible object is
             *     {@link DayOfWeekType }
             *     
             */
            public DayOfWeekType getDayOfWeek() {
                return dayOfWeek;
            }

            /**
             * Sets the value of the dayOfWeek property.
             * 
             * @param value
             *     allowed object is
             *     {@link DayOfWeekType }
             *     
             */
            public void setDayOfWeek(DayOfWeekType value) {
                this.dayOfWeek = value;
            }

            /**
             * Gets the value of the time property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTime() {
                return time;
            }

            /**
             * Sets the value of the time property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTime(String value) {
                this.time = value;
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
         *       &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
         *       &lt;attribute name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EarliestReturn {

            @XmlAttribute(name = "DayOfWeek")
            protected DayOfWeekType dayOfWeek;
            @XmlAttribute(name = "Time")
            protected String time;

            /**
             * Gets the value of the dayOfWeek property.
             * 
             * @return
             *     possible object is
             *     {@link DayOfWeekType }
             *     
             */
            public DayOfWeekType getDayOfWeek() {
                return dayOfWeek;
            }

            /**
             * Sets the value of the dayOfWeek property.
             * 
             * @param value
             *     allowed object is
             *     {@link DayOfWeekType }
             *     
             */
            public void setDayOfWeek(DayOfWeekType value) {
                this.dayOfWeek = value;
            }

            /**
             * Gets the value of the time property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTime() {
                return time;
            }

            /**
             * Sets the value of the time property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTime(String value) {
                this.time = value;
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
         *       &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
         *       &lt;attribute name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LatestPickup {

            @XmlAttribute(name = "DayOfWeek")
            protected DayOfWeekType dayOfWeek;
            @XmlAttribute(name = "Time")
            protected String time;

            /**
             * Gets the value of the dayOfWeek property.
             * 
             * @return
             *     possible object is
             *     {@link DayOfWeekType }
             *     
             */
            public DayOfWeekType getDayOfWeek() {
                return dayOfWeek;
            }

            /**
             * Sets the value of the dayOfWeek property.
             * 
             * @param value
             *     allowed object is
             *     {@link DayOfWeekType }
             *     
             */
            public void setDayOfWeek(DayOfWeekType value) {
                this.dayOfWeek = value;
            }

            /**
             * Gets the value of the time property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTime() {
                return time;
            }

            /**
             * Sets the value of the time property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTime(String value) {
                this.time = value;
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
         *       &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
         *       &lt;attribute name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LatestReturn {

            @XmlAttribute(name = "DayOfWeek")
            protected DayOfWeekType dayOfWeek;
            @XmlAttribute(name = "Time")
            protected String time;

            /**
             * Gets the value of the dayOfWeek property.
             * 
             * @return
             *     possible object is
             *     {@link DayOfWeekType }
             *     
             */
            public DayOfWeekType getDayOfWeek() {
                return dayOfWeek;
            }

            /**
             * Sets the value of the dayOfWeek property.
             * 
             * @param value
             *     allowed object is
             *     {@link DayOfWeekType }
             *     
             */
            public void setDayOfWeek(DayOfWeekType value) {
                this.dayOfWeek = value;
            }

            /**
             * Gets the value of the time property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTime() {
                return time;
            }

            /**
             * Sets the value of the time property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTime(String value) {
                this.time = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
     *       &lt;attribute name="DepositRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RateDeposit {

        @XmlAttribute(name = "DepositRequiredInd")
        protected Boolean depositRequiredInd;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "AbsoluteDeadline")
        protected String absoluteDeadline;
        @XmlAttribute(name = "OffsetTimeUnit")
        protected TimeUnitType offsetTimeUnit;
        @XmlAttribute(name = "OffsetUnitMultiplier")
        protected Integer offsetUnitMultiplier;
        @XmlAttribute(name = "OffsetDropTime")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String offsetDropTime;

        /**
         * Gets the value of the depositRequiredInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDepositRequiredInd() {
            return depositRequiredInd;
        }

        /**
         * Sets the value of the depositRequiredInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDepositRequiredInd(Boolean value) {
            this.depositRequiredInd = value;
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
         * Gets the value of the absoluteDeadline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbsoluteDeadline() {
            return absoluteDeadline;
        }

        /**
         * Sets the value of the absoluteDeadline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbsoluteDeadline(String value) {
            this.absoluteDeadline = value;
        }

        /**
         * Gets the value of the offsetTimeUnit property.
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getOffsetTimeUnit() {
            return offsetTimeUnit;
        }

        /**
         * Sets the value of the offsetTimeUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setOffsetTimeUnit(TimeUnitType value) {
            this.offsetTimeUnit = value;
        }

        /**
         * Gets the value of the offsetUnitMultiplier property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOffsetUnitMultiplier() {
            return offsetUnitMultiplier;
        }

        /**
         * Sets the value of the offsetUnitMultiplier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOffsetUnitMultiplier(Integer value) {
            this.offsetUnitMultiplier = value;
        }

        /**
         * Gets the value of the offsetDropTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetDropTime() {
            return offsetDropTime;
        }

        /**
         * Sets the value of the offsetDropTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetDropTime(String value) {
            this.offsetDropTime = value;
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
     *       &lt;sequence>
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class RateGuarantee {

        @XmlElement(name = "Description")
        protected FormattedTextTextType description;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "AbsoluteDeadline")
        protected String absoluteDeadline;
        @XmlAttribute(name = "OffsetTimeUnit")
        protected TimeUnitType offsetTimeUnit;
        @XmlAttribute(name = "OffsetUnitMultiplier")
        protected Integer offsetUnitMultiplier;
        @XmlAttribute(name = "OffsetDropTime")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String offsetDropTime;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link FormattedTextTextType }
         *     
         */
        public FormattedTextTextType getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormattedTextTextType }
         *     
         */
        public void setDescription(FormattedTextTextType value) {
            this.description = value;
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
         * Gets the value of the absoluteDeadline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbsoluteDeadline() {
            return absoluteDeadline;
        }

        /**
         * Sets the value of the absoluteDeadline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbsoluteDeadline(String value) {
            this.absoluteDeadline = value;
        }

        /**
         * Gets the value of the offsetTimeUnit property.
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getOffsetTimeUnit() {
            return offsetTimeUnit;
        }

        /**
         * Sets the value of the offsetTimeUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setOffsetTimeUnit(TimeUnitType value) {
            this.offsetTimeUnit = value;
        }

        /**
         * Gets the value of the offsetUnitMultiplier property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOffsetUnitMultiplier() {
            return offsetUnitMultiplier;
        }

        /**
         * Sets the value of the offsetUnitMultiplier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOffsetUnitMultiplier(Integer value) {
            this.offsetUnitMultiplier = value;
        }

        /**
         * Gets the value of the offsetDropTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetDropTime() {
            return offsetDropTime;
        }

        /**
         * Sets the value of the offsetDropTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetDropTime(String value) {
            this.offsetDropTime = value;
        }

    }

}
