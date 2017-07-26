
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
 * <p>Java class for RecipientInfosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipientInfosType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecipientInfo" maxOccurs="99"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ReservationID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ShippingInfo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/&gt;
 *                           &lt;attribute name="ShippingType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *                           &lt;attribute name="ShippingCarrier" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Comments" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="99"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "RecipientInfosType", propOrder = {
    "recipientInfo"
})
public class RecipientInfosType {

    @XmlElement(name = "RecipientInfo", required = true)
    protected List<RecipientInfosType.RecipientInfo> recipientInfo;

    /**
     * Gets the value of the recipientInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipientInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipientInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecipientInfosType.RecipientInfo }
     * 
     * 
     */
    public List<RecipientInfosType.RecipientInfo> getRecipientInfo() {
        if (recipientInfo == null) {
            recipientInfo = new ArrayList<RecipientInfosType.RecipientInfo>();
        }
        return this.recipientInfo;
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
     *         &lt;element name="ReservationID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ShippingInfo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/&gt;
     *                 &lt;attribute name="ShippingType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
     *                 &lt;attribute name="ShippingCarrier" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Comments" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="99"/&gt;
     *                 &lt;/sequence&gt;
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
        "reservationID",
        "shippingInfo",
        "comments"
    })
    public static class RecipientInfo
        extends ContactPersonType
    {

        @XmlElement(name = "ReservationID")
        protected List<UniqueIDType> reservationID;
        @XmlElement(name = "ShippingInfo")
        protected RecipientInfosType.RecipientInfo.ShippingInfo shippingInfo;
        @XmlElement(name = "Comments")
        protected RecipientInfosType.RecipientInfo.Comments comments;

        /**
         * Gets the value of the reservationID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reservationID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReservationID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UniqueIDType }
         * 
         * 
         */
        public List<UniqueIDType> getReservationID() {
            if (reservationID == null) {
                reservationID = new ArrayList<UniqueIDType>();
            }
            return this.reservationID;
        }

        /**
         * Gets the value of the shippingInfo property.
         * 
         * @return
         *     possible object is
         *     {@link RecipientInfosType.RecipientInfo.ShippingInfo }
         *     
         */
        public RecipientInfosType.RecipientInfo.ShippingInfo getShippingInfo() {
            return shippingInfo;
        }

        /**
         * Sets the value of the shippingInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link RecipientInfosType.RecipientInfo.ShippingInfo }
         *     
         */
        public void setShippingInfo(RecipientInfosType.RecipientInfo.ShippingInfo value) {
            this.shippingInfo = value;
        }

        /**
         * Gets the value of the comments property.
         * 
         * @return
         *     possible object is
         *     {@link RecipientInfosType.RecipientInfo.Comments }
         *     
         */
        public RecipientInfosType.RecipientInfo.Comments getComments() {
            return comments;
        }

        /**
         * Sets the value of the comments property.
         * 
         * @param value
         *     allowed object is
         *     {@link RecipientInfosType.RecipientInfo.Comments }
         *     
         */
        public void setComments(RecipientInfosType.RecipientInfo.Comments value) {
            this.comments = value;
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
         *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="99"/&gt;
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
            "comment"
        })
        public static class Comments {

            @XmlElement(name = "Comment", required = true)
            protected List<ParagraphType> comment;

            /**
             * Gets the value of the comment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the comment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getComment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ParagraphType }
             * 
             * 
             */
            public List<ParagraphType> getComment() {
                if (comment == null) {
                    comment = new ArrayList<ParagraphType>();
                }
                return this.comment;
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
         *       &lt;attribute name="ShippingType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
         *       &lt;attribute name="ShippingCarrier" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ShippingInfo {

            @XmlAttribute(name = "ShippingType")
            protected String shippingType;
            @XmlAttribute(name = "ShippingCarrier")
            protected String shippingCarrier;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the shippingType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShippingType() {
                return shippingType;
            }

            /**
             * Sets the value of the shippingType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShippingType(String value) {
                this.shippingType = value;
            }

            /**
             * Gets the value of the shippingCarrier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShippingCarrier() {
                return shippingCarrier;
            }

            /**
             * Sets the value of the shippingCarrier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShippingCarrier(String value) {
                this.shippingCarrier = value;
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

}
