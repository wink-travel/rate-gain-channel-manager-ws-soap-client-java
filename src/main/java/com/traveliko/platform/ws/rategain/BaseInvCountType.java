
package com.traveliko.platform.ws.rategain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for BaseInvCountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseInvCountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusApplicationControl" type="{http://www.opentravel.org/OTA/2003/05}StatusApplicationControlType" minOccurs="0"/&gt;
 *         &lt;element name="InvCounts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InvCount" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="InvBlockCutoff" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InvBlockCutoffGroup"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="CountType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *                           &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                           &lt;attribute name="AdjustReason" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
 *                           &lt;attribute name="ActionType"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="Adjustment"/&gt;
 *                                 &lt;enumeration value="Used"/&gt;
 *                                 &lt;enumeration value="Remaining"/&gt;
 *                                 &lt;enumeration value="Allocation"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OffSell" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="OffSellValueType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Total"/&gt;
 *                       &lt;enumeration value="Adjustment"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="OffSellValue" type="{http://www.opentravel.org/OTA/2003/05}Money" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseInvCountType", propOrder = {
    "statusApplicationControl",
    "invCounts",
    "offSell",
    "uniqueID"
})
public class BaseInvCountType {

    @XmlElement(name = "StatusApplicationControl")
    protected StatusApplicationControlType statusApplicationControl;
    @XmlElement(name = "InvCounts")
    protected BaseInvCountType.InvCounts invCounts;
    @XmlElement(name = "OffSell")
    protected BaseInvCountType.OffSell offSell;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;

    /**
     * Gets the value of the statusApplicationControl property.
     * 
     * @return
     *     possible object is
     *     {@link StatusApplicationControlType }
     *     
     */
    public StatusApplicationControlType getStatusApplicationControl() {
        return statusApplicationControl;
    }

    /**
     * Sets the value of the statusApplicationControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusApplicationControlType }
     *     
     */
    public void setStatusApplicationControl(StatusApplicationControlType value) {
        this.statusApplicationControl = value;
    }

    /**
     * Gets the value of the invCounts property.
     * 
     * @return
     *     possible object is
     *     {@link BaseInvCountType.InvCounts }
     *     
     */
    public BaseInvCountType.InvCounts getInvCounts() {
        return invCounts;
    }

    /**
     * Sets the value of the invCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseInvCountType.InvCounts }
     *     
     */
    public void setInvCounts(BaseInvCountType.InvCounts value) {
        this.invCounts = value;
    }

    /**
     * Gets the value of the offSell property.
     * 
     * @return
     *     possible object is
     *     {@link BaseInvCountType.OffSell }
     *     
     */
    public BaseInvCountType.OffSell getOffSell() {
        return offSell;
    }

    /**
     * Sets the value of the offSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseInvCountType.OffSell }
     *     
     */
    public void setOffSell(BaseInvCountType.OffSell value) {
        this.offSell = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="InvCount" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="InvBlockCutoff" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InvBlockCutoffGroup"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="CountType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
     *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                 &lt;attribute name="AdjustReason" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
     *                 &lt;attribute name="ActionType"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="Adjustment"/&gt;
     *                       &lt;enumeration value="Used"/&gt;
     *                       &lt;enumeration value="Remaining"/&gt;
     *                       &lt;enumeration value="Allocation"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
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
    @XmlType(name = "", propOrder = {
        "invCount"
    })
    public static class InvCounts {

        @XmlElement(name = "InvCount", required = true)
        protected List<BaseInvCountType.InvCounts.InvCount> invCount;

        /**
         * Gets the value of the invCount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the invCount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInvCount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaseInvCountType.InvCounts.InvCount }
         * 
         * 
         */
        public List<BaseInvCountType.InvCounts.InvCount> getInvCount() {
            if (invCount == null) {
                invCount = new ArrayList<BaseInvCountType.InvCounts.InvCount>();
            }
            return this.invCount;
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
         *         &lt;element name="InvBlockCutoff" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InvBlockCutoffGroup"/&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="CountType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
         *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *       &lt;attribute name="AdjustReason" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
         *       &lt;attribute name="ActionType"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="Adjustment"/&gt;
         *             &lt;enumeration value="Used"/&gt;
         *             &lt;enumeration value="Remaining"/&gt;
         *             &lt;enumeration value="Allocation"/&gt;
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
        @XmlType(name = "", propOrder = {
            "invBlockCutoff"
        })
        public static class InvCount {

            @XmlElement(name = "InvBlockCutoff")
            protected BaseInvCountType.InvCounts.InvCount.InvBlockCutoff invBlockCutoff;
            @XmlAttribute(name = "CountType")
            protected String countType;
            @XmlAttribute(name = "Count")
            protected BigInteger count;
            @XmlAttribute(name = "AdjustReason")
            protected String adjustReason;
            @XmlAttribute(name = "ActionType")
            protected String actionType;

            /**
             * Gets the value of the invBlockCutoff property.
             * 
             * @return
             *     possible object is
             *     {@link BaseInvCountType.InvCounts.InvCount.InvBlockCutoff }
             *     
             */
            public BaseInvCountType.InvCounts.InvCount.InvBlockCutoff getInvBlockCutoff() {
                return invBlockCutoff;
            }

            /**
             * Sets the value of the invBlockCutoff property.
             * 
             * @param value
             *     allowed object is
             *     {@link BaseInvCountType.InvCounts.InvCount.InvBlockCutoff }
             *     
             */
            public void setInvBlockCutoff(BaseInvCountType.InvCounts.InvCount.InvBlockCutoff value) {
                this.invBlockCutoff = value;
            }

            /**
             * Gets the value of the countType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountType() {
                return countType;
            }

            /**
             * Sets the value of the countType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountType(String value) {
                this.countType = value;
            }

            /**
             * Gets the value of the count property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCount() {
                return count;
            }

            /**
             * Sets the value of the count property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCount(BigInteger value) {
                this.count = value;
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
             * Gets the value of the actionType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActionType() {
                return actionType;
            }

            /**
             * Sets the value of the actionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActionType(String value) {
                this.actionType = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InvBlockCutoffGroup"/&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class InvBlockCutoff {

                @XmlAttribute(name = "AbsoluteCutoff")
                protected String absoluteCutoff;
                @XmlAttribute(name = "OffsetDuration")
                protected Duration offsetDuration;
                @XmlAttribute(name = "OffsetCalculationMode")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String offsetCalculationMode;

                /**
                 * Gets the value of the absoluteCutoff property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAbsoluteCutoff() {
                    return absoluteCutoff;
                }

                /**
                 * Sets the value of the absoluteCutoff property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAbsoluteCutoff(String value) {
                    this.absoluteCutoff = value;
                }

                /**
                 * Gets the value of the offsetDuration property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Duration }
                 *     
                 */
                public Duration getOffsetDuration() {
                    return offsetDuration;
                }

                /**
                 * Sets the value of the offsetDuration property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Duration }
                 *     
                 */
                public void setOffsetDuration(Duration value) {
                    this.offsetDuration = value;
                }

                /**
                 * Gets the value of the offsetCalculationMode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOffsetCalculationMode() {
                    return offsetCalculationMode;
                }

                /**
                 * Sets the value of the offsetCalculationMode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOffsetCalculationMode(String value) {
                    this.offsetCalculationMode = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="OffSellValueType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Total"/&gt;
     *             &lt;enumeration value="Adjustment"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="OffSellValue" type="{http://www.opentravel.org/OTA/2003/05}Money" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OffSell {

        @XmlAttribute(name = "OffSellValueType")
        protected String offSellValueType;
        @XmlAttribute(name = "OffSellValue")
        protected BigDecimal offSellValue;

        /**
         * Gets the value of the offSellValueType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffSellValueType() {
            return offSellValueType;
        }

        /**
         * Sets the value of the offSellValueType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffSellValueType(String value) {
            this.offSellValueType = value;
        }

        /**
         * Gets the value of the offSellValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOffSellValue() {
            return offSellValue;
        }

        /**
         * Sets the value of the offSellValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOffSellValue(BigDecimal value) {
            this.offSellValue = value;
        }

    }

}
