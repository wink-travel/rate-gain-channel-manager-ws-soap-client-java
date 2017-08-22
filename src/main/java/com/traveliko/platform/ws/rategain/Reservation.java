package com.traveliko.platform.ws.rategain;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.13
 * 2017-07-26T12:04:46.931+05:00
 * Generated source version: 3.0.13
 * 
 */
@WebService(targetNamespace = "http://cgbridge.rategain.com/2011A", name = "Reservation")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Reservation {

    @WebMethod(operationName = "OTA_HotelResNotifRQ", action = "http://cgbridge.rategain.com/2011A/ReservationService/HotelResNotif")
    @WebResult(name = "OTA_HotelResNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelResNotifRS")
    public OTAHotelResNotifRS otaHotelResNotifRQ(
        @WebParam(partName = "OTA_HotelResNotifRQ", name = "OTA_HotelResNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
        OTAHotelResNotifRQ otaHotelResNotifRQ
    );
}
