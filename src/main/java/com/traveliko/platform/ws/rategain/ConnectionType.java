
package com.traveliko.platform.ws.rategain;

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


/**
 * <p>Java class for ConnectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConnectionLocation" maxOccurs="9"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/&gt;
 *                 &lt;attribute name="Inclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="MinChangeTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="ConnectionInfo"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Via"/&gt;
 *                       &lt;enumeration value="Stop"/&gt;
 *                       &lt;enumeration value="Change"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="MultiAirportCityInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ConnectType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                       &lt;enumeration value="Online"/&gt;
 *                       &lt;enumeration value="Offline"/&gt;
 *                       &lt;enumeration value="Interline"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
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
@XmlType(name = "ConnectionType", propOrder = {
    "connectionLocation"
})
public class ConnectionType {

    @XmlElement(name = "ConnectionLocation", required = true)
    protected List<ConnectionType.ConnectionLocation> connectionLocation;

    /**
     * Gets the value of the connectionLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionType.ConnectionLocation }
     * 
     * 
     */
    public List<ConnectionType.ConnectionLocation> getConnectionLocation() {
        if (connectionLocation == null) {
            connectionLocation = new ArrayList<ConnectionType.ConnectionLocation>();
        }
        return this.connectionLocation;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/&gt;
     *       &lt;attribute name="Inclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="MinChangeTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="ConnectionInfo"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Via"/&gt;
     *             &lt;enumeration value="Stop"/&gt;
     *             &lt;enumeration value="Change"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="MultiAirportCityInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ConnectType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *             &lt;enumeration value="Online"/&gt;
     *             &lt;enumeration value="Offline"/&gt;
     *             &lt;enumeration value="Interline"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ConnectionLocation
        extends LocationType
    {

        @XmlAttribute(name = "Inclusive")
        protected Boolean inclusive;
        @XmlAttribute(name = "MinChangeTime")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger minChangeTime;
        @XmlAttribute(name = "ConnectionInfo")
        protected String connectionInfo;
        @XmlAttribute(name = "MultiAirportCityInd")
        protected Boolean multiAirportCityInd;
        @XmlAttribute(name = "ConnectType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String connectType;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;

        /**
         * Gets the value of the inclusive property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInclusive() {
            return inclusive;
        }

        /**
         * Sets the value of the inclusive property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInclusive(Boolean value) {
            this.inclusive = value;
        }

        /**
         * Gets the value of the minChangeTime property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinChangeTime() {
            return minChangeTime;
        }

        /**
         * Sets the value of the minChangeTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinChangeTime(BigInteger value) {
            this.minChangeTime = value;
        }

        /**
         * Gets the value of the connectionInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConnectionInfo() {
            return connectionInfo;
        }

        /**
         * Sets the value of the connectionInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConnectionInfo(String value) {
            this.connectionInfo = value;
        }

        /**
         * Gets the value of the multiAirportCityInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMultiAirportCityInd() {
            return multiAirportCityInd;
        }

        /**
         * Sets the value of the multiAirportCityInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMultiAirportCityInd(Boolean value) {
            this.multiAirportCityInd = value;
        }

        /**
         * Gets the value of the connectType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConnectType() {
            return connectType;
        }

        /**
         * Sets the value of the connectType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConnectType(String value) {
            this.connectType = value;
        }

        /**
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            return preferLevel;
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
        }

    }

}
