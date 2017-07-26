
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


/**
 * <p>Java class for VehicleAgeRequirementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleAgeRequirementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Age" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AgeSurcharge" maxOccurs="5" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/&gt;
 *                           &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *                           &lt;attribute name="ChargeType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AgeInfos" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AgeInfo" maxOccurs="99"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType"&gt;
 *                                     &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailRequirementAgeInfoType" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Vehicles"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Vehicle" maxOccurs="99"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleCoreType"&gt;
 *                                     &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                 &lt;attribute name="MaximumAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
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
@XmlType(name = "VehicleAgeRequirementsType", propOrder = {
    "age"
})
public class VehicleAgeRequirementsType {

    @XmlElement(name = "Age")
    protected VehicleAgeRequirementsType.Age age;

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAgeRequirementsType.Age }
     *     
     */
    public VehicleAgeRequirementsType.Age getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAgeRequirementsType.Age }
     *     
     */
    public void setAge(VehicleAgeRequirementsType.Age value) {
        this.age = value;
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
     *         &lt;element name="AgeSurcharge" maxOccurs="5" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/&gt;
     *                 &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
     *                 &lt;attribute name="ChargeType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AgeInfos" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AgeInfo" maxOccurs="99"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType"&gt;
     *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailRequirementAgeInfoType" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Vehicles"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Vehicle" maxOccurs="99"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleCoreType"&gt;
     *                           &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *       &lt;attribute name="MaximumAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ageSurcharge",
        "ageInfos",
        "vehicles"
    })
    public static class Age {

        @XmlElement(name = "AgeSurcharge")
        protected List<VehicleAgeRequirementsType.Age.AgeSurcharge> ageSurcharge;
        @XmlElement(name = "AgeInfos")
        protected VehicleAgeRequirementsType.Age.AgeInfos ageInfos;
        @XmlElement(name = "Vehicles", required = true)
        protected VehicleAgeRequirementsType.Age.Vehicles vehicles;
        @XmlAttribute(name = "MinimumAge")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger minimumAge;
        @XmlAttribute(name = "MaximumAge")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maximumAge;

        /**
         * Gets the value of the ageSurcharge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ageSurcharge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAgeSurcharge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleAgeRequirementsType.Age.AgeSurcharge }
         * 
         * 
         */
        public List<VehicleAgeRequirementsType.Age.AgeSurcharge> getAgeSurcharge() {
            if (ageSurcharge == null) {
                ageSurcharge = new ArrayList<VehicleAgeRequirementsType.Age.AgeSurcharge>();
            }
            return this.ageSurcharge;
        }

        /**
         * Gets the value of the ageInfos property.
         * 
         * @return
         *     possible object is
         *     {@link VehicleAgeRequirementsType.Age.AgeInfos }
         *     
         */
        public VehicleAgeRequirementsType.Age.AgeInfos getAgeInfos() {
            return ageInfos;
        }

        /**
         * Sets the value of the ageInfos property.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleAgeRequirementsType.Age.AgeInfos }
         *     
         */
        public void setAgeInfos(VehicleAgeRequirementsType.Age.AgeInfos value) {
            this.ageInfos = value;
        }

        /**
         * Gets the value of the vehicles property.
         * 
         * @return
         *     possible object is
         *     {@link VehicleAgeRequirementsType.Age.Vehicles }
         *     
         */
        public VehicleAgeRequirementsType.Age.Vehicles getVehicles() {
            return vehicles;
        }

        /**
         * Sets the value of the vehicles property.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleAgeRequirementsType.Age.Vehicles }
         *     
         */
        public void setVehicles(VehicleAgeRequirementsType.Age.Vehicles value) {
            this.vehicles = value;
        }

        /**
         * Gets the value of the minimumAge property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinimumAge() {
            return minimumAge;
        }

        /**
         * Sets the value of the minimumAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinimumAge(BigInteger value) {
            this.minimumAge = value;
        }

        /**
         * Gets the value of the maximumAge property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximumAge() {
            return maximumAge;
        }

        /**
         * Sets the value of the maximumAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximumAge(BigInteger value) {
            this.maximumAge = value;
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
         *         &lt;element name="AgeInfo" maxOccurs="99"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType"&gt;
         *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailRequirementAgeInfoType" /&gt;
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
            "ageInfo"
        })
        public static class AgeInfos {

            @XmlElement(name = "AgeInfo", required = true)
            protected List<VehicleAgeRequirementsType.Age.AgeInfos.AgeInfo> ageInfo;

            /**
             * Gets the value of the ageInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ageInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAgeInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link VehicleAgeRequirementsType.Age.AgeInfos.AgeInfo }
             * 
             * 
             */
            public List<VehicleAgeRequirementsType.Age.AgeInfos.AgeInfo> getAgeInfo() {
                if (ageInfo == null) {
                    ageInfo = new ArrayList<VehicleAgeRequirementsType.Age.AgeInfos.AgeInfo>();
                }
                return this.ageInfo;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType"&gt;
             *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailRequirementAgeInfoType" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AgeInfo
                extends FormattedTextType
            {

                @XmlAttribute(name = "Type", required = true)
                protected LocationDetailRequirementAgeInfoType type;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LocationDetailRequirementAgeInfoType }
                 *     
                 */
                public LocationDetailRequirementAgeInfoType getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LocationDetailRequirementAgeInfoType }
                 *     
                 */
                public void setType(LocationDetailRequirementAgeInfoType value) {
                    this.type = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/&gt;
         *       &lt;attribute name="Age" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
         *       &lt;attribute name="ChargeType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AgeSurcharge {

            @XmlAttribute(name = "Age")
            protected String age;
            @XmlAttribute(name = "ChargeType")
            protected String chargeType;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the age property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAge() {
                return age;
            }

            /**
             * Sets the value of the age property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAge(String value) {
                this.age = value;
            }

            /**
             * Gets the value of the chargeType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChargeType() {
                return chargeType;
            }

            /**
             * Sets the value of the chargeType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChargeType(String value) {
                this.chargeType = value;
            }

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
         *         &lt;element name="Vehicle" maxOccurs="99"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleCoreType"&gt;
         *                 &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" /&gt;
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
            "vehicle"
        })
        public static class Vehicles {

            @XmlElement(name = "Vehicle", required = true)
            protected List<VehicleAgeRequirementsType.Age.Vehicles.Vehicle> vehicle;

            /**
             * Gets the value of the vehicle property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the vehicle property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVehicle().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link VehicleAgeRequirementsType.Age.Vehicles.Vehicle }
             * 
             * 
             */
            public List<VehicleAgeRequirementsType.Age.Vehicles.Vehicle> getVehicle() {
                if (vehicle == null) {
                    vehicle = new ArrayList<VehicleAgeRequirementsType.Age.Vehicles.Vehicle>();
                }
                return this.vehicle;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleCoreType"&gt;
             *       &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Vehicle
                extends VehicleCoreType
            {

                @XmlAttribute(name = "IncludeExclude")
                protected IncludeExcludeType includeExclude;

                /**
                 * Gets the value of the includeExclude property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link IncludeExcludeType }
                 *     
                 */
                public IncludeExcludeType getIncludeExclude() {
                    return includeExclude;
                }

                /**
                 * Sets the value of the includeExclude property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link IncludeExcludeType }
                 *     
                 */
                public void setIncludeExclude(IncludeExcludeType value) {
                    this.includeExclude = value;
                }

            }

        }

    }

}
