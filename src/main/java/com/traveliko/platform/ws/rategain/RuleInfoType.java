
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuleInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResTicketingRules" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AdvResTicketing" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType"&gt;
 *                           &lt;attribute name="FirstTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
 *                           &lt;attribute name="LastTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LengthOfStayRules" type="{http://www.opentravel.org/OTA/2003/05}StayRestrictionsType" minOccurs="0"/&gt;
 *         &lt;element name="ChargesRules" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VoluntaryChanges" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" minOccurs="0"/&gt;
 *                   &lt;element name="VoluntaryRefunds" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" minOccurs="0"/&gt;
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
@XmlType(name = "RuleInfoType", propOrder = {
    "resTicketingRules",
    "lengthOfStayRules",
    "chargesRules"
})
@XmlSeeAlso({
    com.traveliko.platform.ws.rategain.FareInfoType.RuleInfo.class
})
public class RuleInfoType {

    @XmlElement(name = "ResTicketingRules")
    protected RuleInfoType.ResTicketingRules resTicketingRules;
    @XmlElement(name = "LengthOfStayRules")
    protected StayRestrictionsType lengthOfStayRules;
    @XmlElement(name = "ChargesRules")
    protected RuleInfoType.ChargesRules chargesRules;

    /**
     * Gets the value of the resTicketingRules property.
     * 
     * @return
     *     possible object is
     *     {@link RuleInfoType.ResTicketingRules }
     *     
     */
    public RuleInfoType.ResTicketingRules getResTicketingRules() {
        return resTicketingRules;
    }

    /**
     * Sets the value of the resTicketingRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleInfoType.ResTicketingRules }
     *     
     */
    public void setResTicketingRules(RuleInfoType.ResTicketingRules value) {
        this.resTicketingRules = value;
    }

    /**
     * Gets the value of the lengthOfStayRules property.
     * 
     * @return
     *     possible object is
     *     {@link StayRestrictionsType }
     *     
     */
    public StayRestrictionsType getLengthOfStayRules() {
        return lengthOfStayRules;
    }

    /**
     * Sets the value of the lengthOfStayRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link StayRestrictionsType }
     *     
     */
    public void setLengthOfStayRules(StayRestrictionsType value) {
        this.lengthOfStayRules = value;
    }

    /**
     * Gets the value of the chargesRules property.
     * 
     * @return
     *     possible object is
     *     {@link RuleInfoType.ChargesRules }
     *     
     */
    public RuleInfoType.ChargesRules getChargesRules() {
        return chargesRules;
    }

    /**
     * Sets the value of the chargesRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleInfoType.ChargesRules }
     *     
     */
    public void setChargesRules(RuleInfoType.ChargesRules value) {
        this.chargesRules = value;
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
     *         &lt;element name="VoluntaryChanges" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" minOccurs="0"/&gt;
     *         &lt;element name="VoluntaryRefunds" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" minOccurs="0"/&gt;
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
        "voluntaryChanges",
        "voluntaryRefunds"
    })
    public static class ChargesRules {

        @XmlElement(name = "VoluntaryChanges")
        protected VoluntaryChangesType voluntaryChanges;
        @XmlElement(name = "VoluntaryRefunds")
        protected VoluntaryChangesType voluntaryRefunds;

        /**
         * Gets the value of the voluntaryChanges property.
         * 
         * @return
         *     possible object is
         *     {@link VoluntaryChangesType }
         *     
         */
        public VoluntaryChangesType getVoluntaryChanges() {
            return voluntaryChanges;
        }

        /**
         * Sets the value of the voluntaryChanges property.
         * 
         * @param value
         *     allowed object is
         *     {@link VoluntaryChangesType }
         *     
         */
        public void setVoluntaryChanges(VoluntaryChangesType value) {
            this.voluntaryChanges = value;
        }

        /**
         * Gets the value of the voluntaryRefunds property.
         * 
         * @return
         *     possible object is
         *     {@link VoluntaryChangesType }
         *     
         */
        public VoluntaryChangesType getVoluntaryRefunds() {
            return voluntaryRefunds;
        }

        /**
         * Sets the value of the voluntaryRefunds property.
         * 
         * @param value
         *     allowed object is
         *     {@link VoluntaryChangesType }
         *     
         */
        public void setVoluntaryRefunds(VoluntaryChangesType value) {
            this.voluntaryRefunds = value;
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
     *         &lt;element name="AdvResTicketing" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType"&gt;
     *                 &lt;attribute name="FirstTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
     *                 &lt;attribute name="LastTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
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
        "advResTicketing"
    })
    public static class ResTicketingRules {

        @XmlElement(name = "AdvResTicketing")
        protected RuleInfoType.ResTicketingRules.AdvResTicketing advResTicketing;

        /**
         * Gets the value of the advResTicketing property.
         * 
         * @return
         *     possible object is
         *     {@link RuleInfoType.ResTicketingRules.AdvResTicketing }
         *     
         */
        public RuleInfoType.ResTicketingRules.AdvResTicketing getAdvResTicketing() {
            return advResTicketing;
        }

        /**
         * Sets the value of the advResTicketing property.
         * 
         * @param value
         *     allowed object is
         *     {@link RuleInfoType.ResTicketingRules.AdvResTicketing }
         *     
         */
        public void setAdvResTicketing(RuleInfoType.ResTicketingRules.AdvResTicketing value) {
            this.advResTicketing = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType"&gt;
         *       &lt;attribute name="FirstTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
         *       &lt;attribute name="LastTicketDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AdvResTicketing
            extends AdvResTicketingType
        {

            @XmlAttribute(name = "FirstTicketDate")
            protected String firstTicketDate;
            @XmlAttribute(name = "LastTicketDate")
            protected String lastTicketDate;

            /**
             * Gets the value of the firstTicketDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstTicketDate() {
                return firstTicketDate;
            }

            /**
             * Sets the value of the firstTicketDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstTicketDate(String value) {
                this.firstTicketDate = value;
            }

            /**
             * Gets the value of the lastTicketDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastTicketDate() {
                return lastTicketDate;
            }

            /**
             * Sets the value of the lastTicketDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastTicketDate(String value) {
                this.lastTicketDate = value;
            }

        }

    }

}
