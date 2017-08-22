
package com.traveliko.platform.ws.rategain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RebateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RebateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentInformation" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TripInformationGroup"/>
 *       &lt;attribute name="ParticipationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RebateType", propOrder = {
    "paymentInformation"
})
public class RebateType {

    @XmlElement(name = "PaymentInformation")
    protected List<PaymentCardType> paymentInformation;
    @XmlAttribute(name = "ParticipationInd")
    protected Boolean participationInd;
    @XmlAttribute(name = "ProgramName")
    protected String programName;
    @XmlAttribute(name = "TripPurpose")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tripPurpose;
    @XmlAttribute(name = "TripPurposeRequiredInd")
    protected Boolean tripPurposeRequiredInd;

    /**
     * Gets the value of the paymentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCardType }
     * 
     * 
     */
    public List<PaymentCardType> getPaymentInformation() {
        if (paymentInformation == null) {
            paymentInformation = new ArrayList<PaymentCardType>();
        }
        return this.paymentInformation;
    }

    /**
     * Gets the value of the participationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParticipationInd() {
        return participationInd;
    }

    /**
     * Sets the value of the participationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParticipationInd(Boolean value) {
        this.participationInd = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the value of the tripPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripPurpose() {
        return tripPurpose;
    }

    /**
     * Sets the value of the tripPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripPurpose(String value) {
        this.tripPurpose = value;
    }

    /**
     * Gets the value of the tripPurposeRequiredInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTripPurposeRequiredInd() {
        return tripPurposeRequiredInd;
    }

    /**
     * Sets the value of the tripPurposeRequiredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTripPurposeRequiredInd(Boolean value) {
        this.tripPurposeRequiredInd = value;
    }

}
