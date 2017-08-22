
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
 * <p>Java class for StatisticApplicationSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatisticApplicationSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatisticCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StatisticCode" maxOccurs="5">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}StatisticCodeGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RevenueCategorySummaries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RevenueCategorySummary" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RevenueCategorySummaryGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CountCategorySummaries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CountCategorySummary" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CountCategorySummaryGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReportSummaries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ReportSummary" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticApplicationSetType", propOrder = {
    "statisticCodes",
    "revenueCategorySummaries",
    "countCategorySummaries",
    "reportSummaries"
})
public class StatisticApplicationSetType {

    @XmlElement(name = "StatisticCodes")
    protected StatisticApplicationSetType.StatisticCodes statisticCodes;
    @XmlElement(name = "RevenueCategorySummaries")
    protected StatisticApplicationSetType.RevenueCategorySummaries revenueCategorySummaries;
    @XmlElement(name = "CountCategorySummaries")
    protected StatisticApplicationSetType.CountCategorySummaries countCategorySummaries;
    @XmlElement(name = "ReportSummaries")
    protected StatisticApplicationSetType.ReportSummaries reportSummaries;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;

    /**
     * Gets the value of the statisticCodes property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticApplicationSetType.StatisticCodes }
     *     
     */
    public StatisticApplicationSetType.StatisticCodes getStatisticCodes() {
        return statisticCodes;
    }

    /**
     * Sets the value of the statisticCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticApplicationSetType.StatisticCodes }
     *     
     */
    public void setStatisticCodes(StatisticApplicationSetType.StatisticCodes value) {
        this.statisticCodes = value;
    }

    /**
     * Gets the value of the revenueCategorySummaries property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticApplicationSetType.RevenueCategorySummaries }
     *     
     */
    public StatisticApplicationSetType.RevenueCategorySummaries getRevenueCategorySummaries() {
        return revenueCategorySummaries;
    }

    /**
     * Sets the value of the revenueCategorySummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticApplicationSetType.RevenueCategorySummaries }
     *     
     */
    public void setRevenueCategorySummaries(StatisticApplicationSetType.RevenueCategorySummaries value) {
        this.revenueCategorySummaries = value;
    }

    /**
     * Gets the value of the countCategorySummaries property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticApplicationSetType.CountCategorySummaries }
     *     
     */
    public StatisticApplicationSetType.CountCategorySummaries getCountCategorySummaries() {
        return countCategorySummaries;
    }

    /**
     * Sets the value of the countCategorySummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticApplicationSetType.CountCategorySummaries }
     *     
     */
    public void setCountCategorySummaries(StatisticApplicationSetType.CountCategorySummaries value) {
        this.countCategorySummaries = value;
    }

    /**
     * Gets the value of the reportSummaries property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticApplicationSetType.ReportSummaries }
     *     
     */
    public StatisticApplicationSetType.ReportSummaries getReportSummaries() {
        return reportSummaries;
    }

    /**
     * Sets the value of the reportSummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticApplicationSetType.ReportSummaries }
     *     
     */
    public void setReportSummaries(StatisticApplicationSetType.ReportSummaries value) {
        this.reportSummaries = value;
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
     *       &lt;sequence>
     *         &lt;element name="CountCategorySummary" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CountCategorySummaryGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "countCategorySummary"
    })
    public static class CountCategorySummaries {

        @XmlElement(name = "CountCategorySummary", required = true)
        protected List<StatisticApplicationSetType.CountCategorySummaries.CountCategorySummary> countCategorySummary;

        /**
         * Gets the value of the countCategorySummary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countCategorySummary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountCategorySummary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatisticApplicationSetType.CountCategorySummaries.CountCategorySummary }
         * 
         * 
         */
        public List<StatisticApplicationSetType.CountCategorySummaries.CountCategorySummary> getCountCategorySummary() {
            if (countCategorySummary == null) {
                countCategorySummary = new ArrayList<StatisticApplicationSetType.CountCategorySummaries.CountCategorySummary>();
            }
            return this.countCategorySummary;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CountCategorySummaryGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CountCategorySummary {

            @XmlAttribute(name = "SummaryCount")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger summaryCount;
            @XmlAttribute(name = "CountCategoryCode")
            protected String countCategoryCode;

            /**
             * Gets the value of the summaryCount property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSummaryCount() {
                return summaryCount;
            }

            /**
             * Sets the value of the summaryCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSummaryCount(BigInteger value) {
                this.summaryCount = value;
            }

            /**
             * Gets the value of the countCategoryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountCategoryCode() {
                return countCategoryCode;
            }

            /**
             * Sets the value of the countCategoryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountCategoryCode(String value) {
                this.countCategoryCode = value;
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
     *         &lt;element name="ReportSummary" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reportSummary"
    })
    public static class ReportSummaries {

        @XmlElement(name = "ReportSummary", required = true)
        protected List<ParagraphType> reportSummary;

        /**
         * Gets the value of the reportSummary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportSummary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReportSummary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParagraphType }
         * 
         * 
         */
        public List<ParagraphType> getReportSummary() {
            if (reportSummary == null) {
                reportSummary = new ArrayList<ParagraphType>();
            }
            return this.reportSummary;
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
     *         &lt;element name="RevenueCategorySummary" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RevenueCategorySummaryGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "revenueCategorySummary"
    })
    public static class RevenueCategorySummaries {

        @XmlElement(name = "RevenueCategorySummary", required = true)
        protected List<StatisticApplicationSetType.RevenueCategorySummaries.RevenueCategorySummary> revenueCategorySummary;

        /**
         * Gets the value of the revenueCategorySummary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the revenueCategorySummary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRevenueCategorySummary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatisticApplicationSetType.RevenueCategorySummaries.RevenueCategorySummary }
         * 
         * 
         */
        public List<StatisticApplicationSetType.RevenueCategorySummaries.RevenueCategorySummary> getRevenueCategorySummary() {
            if (revenueCategorySummary == null) {
                revenueCategorySummary = new ArrayList<StatisticApplicationSetType.RevenueCategorySummaries.RevenueCategorySummary>();
            }
            return this.revenueCategorySummary;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RevenueCategorySummaryGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RevenueCategorySummary {

            @XmlAttribute(name = "RevenueCategoryCode")
            protected String revenueCategoryCode;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the revenueCategoryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRevenueCategoryCode() {
                return revenueCategoryCode;
            }

            /**
             * Sets the value of the revenueCategoryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRevenueCategoryCode(String value) {
                this.revenueCategoryCode = value;
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
     *         &lt;element name="StatisticCode" maxOccurs="5">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}StatisticCodeGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "statisticCode"
    })
    public static class StatisticCodes {

        @XmlElement(name = "StatisticCode", required = true)
        protected List<StatisticApplicationSetType.StatisticCodes.StatisticCode> statisticCode;

        /**
         * Gets the value of the statisticCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statisticCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatisticCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatisticApplicationSetType.StatisticCodes.StatisticCode }
         * 
         * 
         */
        public List<StatisticApplicationSetType.StatisticCodes.StatisticCode> getStatisticCode() {
            if (statisticCode == null) {
                statisticCode = new ArrayList<StatisticApplicationSetType.StatisticCodes.StatisticCode>();
            }
            return this.statisticCode;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}StatisticCodeGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class StatisticCode {

            @XmlAttribute(name = "StatCode")
            protected String statCode;
            @XmlAttribute(name = "StatCategoryCode")
            protected String statCategoryCode;

            /**
             * Gets the value of the statCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatCode() {
                return statCode;
            }

            /**
             * Sets the value of the statCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatCode(String value) {
                this.statCode = value;
            }

            /**
             * Gets the value of the statCategoryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatCategoryCode() {
                return statCategoryCode;
            }

            /**
             * Sets the value of the statCategoryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatCategoryCode(String value) {
                this.statCategoryCode = value;
            }

        }

    }

}
