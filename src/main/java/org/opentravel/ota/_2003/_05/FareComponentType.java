
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
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


/**
 * <p>Java class for FareComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceableUnit" maxOccurs="99">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FareComponentDetail" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CouponSequence" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *                                     &lt;attribute name="SequenceNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                                     &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
 *                                     &lt;attribute name="StopoverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ConstructionPrinciple" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
 *                                     &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
 *                                     &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                     &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BaseAmount" maxOccurs="3">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                     &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TicketDesignator" maxOccurs="9" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="TicketDesignatorCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                                     &lt;attribute name="TicketDesignatorQualifier" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *                           &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to4" />
 *                           &lt;attribute name="TariffNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
 *                           &lt;attribute name="RuleNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *                           &lt;attribute name="WaiverCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to19" />
 *                           &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                           &lt;attribute name="RuleCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
 *                           &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="AgreementCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalConstructionAmount" maxOccurs="3">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attribute name="Purpose" use="required" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
 *       &lt;attribute name="PriceQuoteDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *       &lt;attribute name="AccountCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="PricingDesignator" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentType", propOrder = {
    "priceableUnit",
    "totalConstructionAmount"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.EMDType.ExchResidualFareComponent.class
})
public class FareComponentType {

    @XmlElement(name = "PriceableUnit", required = true)
    protected List<FareComponentType.PriceableUnit> priceableUnit;
    @XmlElement(name = "TotalConstructionAmount", required = true)
    protected List<FareComponentType.TotalConstructionAmount> totalConstructionAmount;
    @XmlAttribute(name = "PriceQuoteDate")
    protected String priceQuoteDate;
    @XmlAttribute(name = "AccountCode")
    protected String accountCode;
    @XmlAttribute(name = "PricingDesignator")
    protected String pricingDesignator;
    @XmlAttribute(name = "ExchangeRate")
    protected BigDecimal exchangeRate;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;

    /**
     * Gets the value of the priceableUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceableUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceableUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentType.PriceableUnit }
     * 
     * 
     */
    public List<FareComponentType.PriceableUnit> getPriceableUnit() {
        if (priceableUnit == null) {
            priceableUnit = new ArrayList<FareComponentType.PriceableUnit>();
        }
        return this.priceableUnit;
    }

    /**
     * Gets the value of the totalConstructionAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalConstructionAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalConstructionAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentType.TotalConstructionAmount }
     * 
     * 
     */
    public List<FareComponentType.TotalConstructionAmount> getTotalConstructionAmount() {
        if (totalConstructionAmount == null) {
            totalConstructionAmount = new ArrayList<FareComponentType.TotalConstructionAmount>();
        }
        return this.totalConstructionAmount;
    }

    /**
     * Gets the value of the priceQuoteDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceQuoteDate() {
        return priceQuoteDate;
    }

    /**
     * Sets the value of the priceQuoteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceQuoteDate(String value) {
        this.priceQuoteDate = value;
    }

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the pricingDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingDesignator() {
        return pricingDesignator;
    }

    /**
     * Sets the value of the pricingDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingDesignator(String value) {
        this.pricingDesignator = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FareComponentDetail" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CouponSequence" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
     *                           &lt;attribute name="SequenceNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                           &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
     *                           &lt;attribute name="StopoverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ConstructionPrinciple" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
     *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
     *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                           &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BaseAmount" maxOccurs="3">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                           &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TicketDesignator" maxOccurs="9" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="TicketDesignatorCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                           &lt;attribute name="TicketDesignatorQualifier" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
     *                 &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to4" />
     *                 &lt;attribute name="TariffNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
     *                 &lt;attribute name="RuleNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *                 &lt;attribute name="WaiverCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to19" />
     *                 &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *                 &lt;attribute name="RuleCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
     *                 &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="AgreementCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fareComponentDetail"
    })
    public static class PriceableUnit {

        @XmlElement(name = "FareComponentDetail", required = true)
        protected List<FareComponentType.PriceableUnit.FareComponentDetail> fareComponentDetail;
        @XmlAttribute(name = "Number", required = true)
        protected String number;

        /**
         * Gets the value of the fareComponentDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareComponentDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareComponentDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareComponentType.PriceableUnit.FareComponentDetail }
         * 
         * 
         */
        public List<FareComponentType.PriceableUnit.FareComponentDetail> getFareComponentDetail() {
            if (fareComponentDetail == null) {
                fareComponentDetail = new ArrayList<FareComponentType.PriceableUnit.FareComponentDetail>();
            }
            return this.fareComponentDetail;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
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
         *         &lt;element name="CouponSequence" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
         *                 &lt;attribute name="SequenceNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *                 &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
         *                 &lt;attribute name="StopoverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ConstructionPrinciple" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
         *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
         *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                 &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BaseAmount" maxOccurs="3">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                 &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TicketDesignator" maxOccurs="9" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="TicketDesignatorCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *                 &lt;attribute name="TicketDesignatorQualifier" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
         *       &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to4" />
         *       &lt;attribute name="TariffNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
         *       &lt;attribute name="RuleNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
         *       &lt;attribute name="WaiverCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to19" />
         *       &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
         *       &lt;attribute name="RuleCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
         *       &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="AgreementCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "couponSequence",
            "constructionPrinciple",
            "baseAmount",
            "ticketDesignator"
        })
        public static class FareComponentDetail {

            @XmlElement(name = "CouponSequence", required = true)
            protected List<FareComponentType.PriceableUnit.FareComponentDetail.CouponSequence> couponSequence;
            @XmlElement(name = "ConstructionPrinciple")
            protected List<FareComponentType.PriceableUnit.FareComponentDetail.ConstructionPrinciple> constructionPrinciple;
            @XmlElement(name = "BaseAmount", required = true)
            protected List<FareComponentType.PriceableUnit.FareComponentDetail.BaseAmount> baseAmount;
            @XmlElement(name = "TicketDesignator")
            protected List<FareComponentType.PriceableUnit.FareComponentDetail.TicketDesignator> ticketDesignator;
            @XmlAttribute(name = "Number", required = true)
            protected int number;
            @XmlAttribute(name = "TariffNumber")
            protected String tariffNumber;
            @XmlAttribute(name = "RuleNumber")
            protected String ruleNumber;
            @XmlAttribute(name = "WaiverCode")
            protected String waiverCode;
            @XmlAttribute(name = "PassengerTypeCode")
            protected String passengerTypeCode;
            @XmlAttribute(name = "RuleCode")
            protected String ruleCode;
            @XmlAttribute(name = "FareBasisCode")
            protected String fareBasisCode;
            @XmlAttribute(name = "AgreementCode")
            protected String agreementCode;
            @XmlAttribute(name = "CompanyShortName")
            protected String companyShortName;
            @XmlAttribute(name = "TravelSector")
            protected String travelSector;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;

            /**
             * Gets the value of the couponSequence property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the couponSequence property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCouponSequence().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareComponentType.PriceableUnit.FareComponentDetail.CouponSequence }
             * 
             * 
             */
            public List<FareComponentType.PriceableUnit.FareComponentDetail.CouponSequence> getCouponSequence() {
                if (couponSequence == null) {
                    couponSequence = new ArrayList<FareComponentType.PriceableUnit.FareComponentDetail.CouponSequence>();
                }
                return this.couponSequence;
            }

            /**
             * Gets the value of the constructionPrinciple property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the constructionPrinciple property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getConstructionPrinciple().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareComponentType.PriceableUnit.FareComponentDetail.ConstructionPrinciple }
             * 
             * 
             */
            public List<FareComponentType.PriceableUnit.FareComponentDetail.ConstructionPrinciple> getConstructionPrinciple() {
                if (constructionPrinciple == null) {
                    constructionPrinciple = new ArrayList<FareComponentType.PriceableUnit.FareComponentDetail.ConstructionPrinciple>();
                }
                return this.constructionPrinciple;
            }

            /**
             * Gets the value of the baseAmount property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the baseAmount property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBaseAmount().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareComponentType.PriceableUnit.FareComponentDetail.BaseAmount }
             * 
             * 
             */
            public List<FareComponentType.PriceableUnit.FareComponentDetail.BaseAmount> getBaseAmount() {
                if (baseAmount == null) {
                    baseAmount = new ArrayList<FareComponentType.PriceableUnit.FareComponentDetail.BaseAmount>();
                }
                return this.baseAmount;
            }

            /**
             * Gets the value of the ticketDesignator property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ticketDesignator property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTicketDesignator().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareComponentType.PriceableUnit.FareComponentDetail.TicketDesignator }
             * 
             * 
             */
            public List<FareComponentType.PriceableUnit.FareComponentDetail.TicketDesignator> getTicketDesignator() {
                if (ticketDesignator == null) {
                    ticketDesignator = new ArrayList<FareComponentType.PriceableUnit.FareComponentDetail.TicketDesignator>();
                }
                return this.ticketDesignator;
            }

            /**
             * Gets the value of the number property.
             * 
             */
            public int getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             */
            public void setNumber(int value) {
                this.number = value;
            }

            /**
             * Gets the value of the tariffNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTariffNumber() {
                return tariffNumber;
            }

            /**
             * Sets the value of the tariffNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTariffNumber(String value) {
                this.tariffNumber = value;
            }

            /**
             * Gets the value of the ruleNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRuleNumber() {
                return ruleNumber;
            }

            /**
             * Sets the value of the ruleNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRuleNumber(String value) {
                this.ruleNumber = value;
            }

            /**
             * Gets the value of the waiverCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWaiverCode() {
                return waiverCode;
            }

            /**
             * Sets the value of the waiverCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWaiverCode(String value) {
                this.waiverCode = value;
            }

            /**
             * Gets the value of the passengerTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPassengerTypeCode() {
                return passengerTypeCode;
            }

            /**
             * Sets the value of the passengerTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPassengerTypeCode(String value) {
                this.passengerTypeCode = value;
            }

            /**
             * Gets the value of the ruleCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRuleCode() {
                return ruleCode;
            }

            /**
             * Sets the value of the ruleCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRuleCode(String value) {
                this.ruleCode = value;
            }

            /**
             * Gets the value of the fareBasisCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareBasisCode() {
                return fareBasisCode;
            }

            /**
             * Sets the value of the fareBasisCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareBasisCode(String value) {
                this.fareBasisCode = value;
            }

            /**
             * Gets the value of the agreementCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgreementCode() {
                return agreementCode;
            }

            /**
             * Sets the value of the agreementCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgreementCode(String value) {
                this.agreementCode = value;
            }

            /**
             * Gets the value of the companyShortName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompanyShortName() {
                return companyShortName;
            }

            /**
             * Sets the value of the companyShortName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompanyShortName(String value) {
                this.companyShortName = value;
            }

            /**
             * Gets the value of the travelSector property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTravelSector() {
                return travelSector;
            }

            /**
             * Sets the value of the travelSector property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTravelSector(String value) {
                this.travelSector = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
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
             *       &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class BaseAmount {

                @XmlAttribute(name = "Purpose")
                protected PurposeType purpose;
                @XmlAttribute(name = "Amount")
                protected BigDecimal amount;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "DecimalPlaces")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger decimalPlaces;

                /**
                 * Gets the value of the purpose property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PurposeType }
                 *     
                 */
                public PurposeType getPurpose() {
                    return purpose;
                }

                /**
                 * Sets the value of the purpose property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PurposeType }
                 *     
                 */
                public void setPurpose(PurposeType value) {
                    this.purpose = value;
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
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
             *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
             *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *       &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ConstructionPrinciple {

                @XmlAttribute(name = "Code", required = true)
                protected String code;
                @XmlAttribute(name = "Amount")
                protected BigDecimal amount;
                @XmlAttribute(name = "Percent")
                protected BigDecimal percent;
                @XmlAttribute(name = "OriginCityCode")
                protected String originCityCode;
                @XmlAttribute(name = "OriginCodeContext")
                protected String originCodeContext;
                @XmlAttribute(name = "DestinationCityCode")
                protected String destinationCityCode;
                @XmlAttribute(name = "DestinationCodeContext")
                protected String destinationCodeContext;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
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
                 * Gets the value of the percent property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPercent() {
                    return percent;
                }

                /**
                 * Sets the value of the percent property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPercent(BigDecimal value) {
                    this.percent = value;
                }

                /**
                 * Gets the value of the originCityCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOriginCityCode() {
                    return originCityCode;
                }

                /**
                 * Sets the value of the originCityCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOriginCityCode(String value) {
                    this.originCityCode = value;
                }

                /**
                 * Gets the value of the originCodeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOriginCodeContext() {
                    return originCodeContext;
                }

                /**
                 * Sets the value of the originCodeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOriginCodeContext(String value) {
                    this.originCodeContext = value;
                }

                /**
                 * Gets the value of the destinationCityCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDestinationCityCode() {
                    return destinationCityCode;
                }

                /**
                 * Sets the value of the destinationCityCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDestinationCityCode(String value) {
                    this.destinationCityCode = value;
                }

                /**
                 * Gets the value of the destinationCodeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDestinationCodeContext() {
                    return destinationCodeContext;
                }

                /**
                 * Sets the value of the destinationCodeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDestinationCodeContext(String value) {
                    this.destinationCodeContext = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
             *       &lt;attribute name="SequenceNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
             *       &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
             *       &lt;attribute name="StopoverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CouponSequence {

                @XmlAttribute(name = "SequenceNbr")
                protected String sequenceNbr;
                @XmlAttribute(name = "CouponItinerarySeqNbr")
                protected Integer couponItinerarySeqNbr;
                @XmlAttribute(name = "StopoverInd")
                protected Boolean stopoverInd;
                @XmlAttribute(name = "ResBookDesigCode")
                protected String resBookDesigCode;
                @XmlAttribute(name = "OriginCityCode")
                protected String originCityCode;
                @XmlAttribute(name = "OriginCodeContext")
                protected String originCodeContext;
                @XmlAttribute(name = "DestinationCityCode")
                protected String destinationCityCode;
                @XmlAttribute(name = "DestinationCodeContext")
                protected String destinationCodeContext;
                @XmlAttribute(name = "CompanyShortName")
                protected String companyShortName;
                @XmlAttribute(name = "TravelSector")
                protected String travelSector;
                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;

                /**
                 * Gets the value of the sequenceNbr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSequenceNbr() {
                    return sequenceNbr;
                }

                /**
                 * Sets the value of the sequenceNbr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSequenceNbr(String value) {
                    this.sequenceNbr = value;
                }

                /**
                 * Gets the value of the couponItinerarySeqNbr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getCouponItinerarySeqNbr() {
                    return couponItinerarySeqNbr;
                }

                /**
                 * Sets the value of the couponItinerarySeqNbr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setCouponItinerarySeqNbr(Integer value) {
                    this.couponItinerarySeqNbr = value;
                }

                /**
                 * Gets the value of the stopoverInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isStopoverInd() {
                    return stopoverInd;
                }

                /**
                 * Sets the value of the stopoverInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setStopoverInd(Boolean value) {
                    this.stopoverInd = value;
                }

                /**
                 * Gets the value of the resBookDesigCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getResBookDesigCode() {
                    return resBookDesigCode;
                }

                /**
                 * Sets the value of the resBookDesigCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setResBookDesigCode(String value) {
                    this.resBookDesigCode = value;
                }

                /**
                 * Gets the value of the originCityCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOriginCityCode() {
                    return originCityCode;
                }

                /**
                 * Sets the value of the originCityCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOriginCityCode(String value) {
                    this.originCityCode = value;
                }

                /**
                 * Gets the value of the originCodeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOriginCodeContext() {
                    return originCodeContext;
                }

                /**
                 * Sets the value of the originCodeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOriginCodeContext(String value) {
                    this.originCodeContext = value;
                }

                /**
                 * Gets the value of the destinationCityCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDestinationCityCode() {
                    return destinationCityCode;
                }

                /**
                 * Sets the value of the destinationCityCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDestinationCityCode(String value) {
                    this.destinationCityCode = value;
                }

                /**
                 * Gets the value of the destinationCodeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDestinationCodeContext() {
                    return destinationCodeContext;
                }

                /**
                 * Sets the value of the destinationCodeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDestinationCodeContext(String value) {
                    this.destinationCodeContext = value;
                }

                /**
                 * Gets the value of the companyShortName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCompanyShortName() {
                    return companyShortName;
                }

                /**
                 * Sets the value of the companyShortName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCompanyShortName(String value) {
                    this.companyShortName = value;
                }

                /**
                 * Gets the value of the travelSector property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTravelSector() {
                    return travelSector;
                }

                /**
                 * Sets the value of the travelSector property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTravelSector(String value) {
                    this.travelSector = value;
                }

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
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


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="TicketDesignatorCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
             *       &lt;attribute name="TicketDesignatorQualifier" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TicketDesignator {

                @XmlAttribute(name = "TicketDesignatorCode", required = true)
                protected String ticketDesignatorCode;
                @XmlAttribute(name = "TicketDesignatorQualifier")
                protected String ticketDesignatorQualifier;

                /**
                 * Gets the value of the ticketDesignatorCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTicketDesignatorCode() {
                    return ticketDesignatorCode;
                }

                /**
                 * Sets the value of the ticketDesignatorCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTicketDesignatorCode(String value) {
                    this.ticketDesignatorCode = value;
                }

                /**
                 * Gets the value of the ticketDesignatorQualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTicketDesignatorQualifier() {
                    return ticketDesignatorQualifier;
                }

                /**
                 * Sets the value of the ticketDesignatorQualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTicketDesignatorQualifier(String value) {
                    this.ticketDesignatorQualifier = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *       &lt;attribute name="Purpose" use="required" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TotalConstructionAmount {

        @XmlAttribute(name = "Purpose", required = true)
        protected PurposeType purpose;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the purpose property.
         * 
         * @return
         *     possible object is
         *     {@link PurposeType }
         *     
         */
        public PurposeType getPurpose() {
            return purpose;
        }

        /**
         * Sets the value of the purpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurposeType }
         *     
         */
        public void setPurpose(PurposeType value) {
            this.purpose = value;
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

}
