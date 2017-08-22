
package com.traveliko.platform.ws.rategain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginDestinationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestinationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TravelDateTimeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginLocation"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *                 &lt;attribute name="MultiAirportCityInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DestinationLocation"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *                 &lt;attribute name="MultiAirportCityInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ConnectionLocations" type="{http://www.opentravel.org/OTA/2003/05}ConnectionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestinationInformationType", propOrder = {
    "originLocation",
    "destinationLocation",
    "connectionLocations"
})
public class OriginDestinationInformationType
    extends TravelDateTimeType
{

    @XmlElement(name = "OriginLocation", required = true)
    protected OriginDestinationInformationType.OriginLocation originLocation;
    @XmlElement(name = "DestinationLocation", required = true)
    protected OriginDestinationInformationType.DestinationLocation destinationLocation;
    @XmlElement(name = "ConnectionLocations")
    protected ConnectionType connectionLocations;

    /**
     * Gets the value of the originLocation property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestinationInformationType.OriginLocation }
     *     
     */
    public OriginDestinationInformationType.OriginLocation getOriginLocation() {
        return originLocation;
    }

    /**
     * Sets the value of the originLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestinationInformationType.OriginLocation }
     *     
     */
    public void setOriginLocation(OriginDestinationInformationType.OriginLocation value) {
        this.originLocation = value;
    }

    /**
     * Gets the value of the destinationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestinationInformationType.DestinationLocation }
     *     
     */
    public OriginDestinationInformationType.DestinationLocation getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * Sets the value of the destinationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestinationInformationType.DestinationLocation }
     *     
     */
    public void setDestinationLocation(OriginDestinationInformationType.DestinationLocation value) {
        this.destinationLocation = value;
    }

    /**
     * Gets the value of the connectionLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionType }
     *     
     */
    public ConnectionType getConnectionLocations() {
        return connectionLocations;
    }

    /**
     * Sets the value of the connectionLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionType }
     *     
     */
    public void setConnectionLocations(ConnectionType value) {
        this.connectionLocations = value;
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
     *       &lt;attribute name="MultiAirportCityInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DestinationLocation
        extends LocationType
    {

        @XmlAttribute(name = "MultiAirportCityInd")
        protected Boolean multiAirportCityInd;
        @XmlAttribute(name = "AlternateLocationInd")
        protected Boolean alternateLocationInd;

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
         * Gets the value of the alternateLocationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAlternateLocationInd() {
            return alternateLocationInd;
        }

        /**
         * Sets the value of the alternateLocationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAlternateLocationInd(Boolean value) {
            this.alternateLocationInd = value;
        }

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
     *       &lt;attribute name="MultiAirportCityInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OriginLocation
        extends LocationType
    {

        @XmlAttribute(name = "MultiAirportCityInd")
        protected Boolean multiAirportCityInd;
        @XmlAttribute(name = "AlternateLocationInd")
        protected Boolean alternateLocationInd;

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
         * Gets the value of the alternateLocationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAlternateLocationInd() {
            return alternateLocationInd;
        }

        /**
         * Sets the value of the alternateLocationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAlternateLocationInd(Boolean value) {
            this.alternateLocationInd = value;
        }

    }

}
