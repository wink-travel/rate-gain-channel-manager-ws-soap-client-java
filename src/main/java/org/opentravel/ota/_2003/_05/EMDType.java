
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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EMD_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMD_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelerRefNumber" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerRefNumberGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AgentID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="PaymentDetail" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="OriginDestination" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustLoyalty" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CustomerLoyaltyGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Endorsement" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Info" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to255" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AddReferenceID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="BaseFare" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
 *                 &lt;attribute name="FareAmountType" type="{http://www.opentravel.org/OTA/2003/05}FareAmountType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EquivFare" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
 *                 &lt;attribute name="FareAmountType" type="{http://www.opentravel.org/OTA/2003/05}FareAmountType" />
 *                 &lt;attribute name="BankExchangeRate" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalFare" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
 *                 &lt;attribute name="FareAmountType" type="{http://www.opentravel.org/OTA/2003/05}FareAmountType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Taxes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Tax" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>AirTaxType">
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UnstructuredFareCalc" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="FareCalcMode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
 *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                 &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
 *                 &lt;attribute name="ReportingCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
 *                 &lt;attribute name="Info" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ET_FareInfo">
 *                 &lt;sequence>
 *                   &lt;element name="PenaltyAmount" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *                 &lt;attribute name="NonEndorsableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NonRefundableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PenaltyRestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PresentCreditCardInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AroundTheWorldFareInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NonInterlineableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NonCommissionableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NonReissuableNonExchgInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TicketDocument" maxOccurs="99">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CouponInfo" maxOccurs="4">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SoldFlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
 *                             &lt;choice>
 *                               &lt;element name="CheckedInAirlineRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
 *                               &lt;element name="FlownAirlineSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
 *                             &lt;/choice>
 *                             &lt;element name="ExcessBaggage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PresentInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="To" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                                     &lt;attribute name="At" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ReasonForIssuance" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReasonForIssuanceGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ValidatingAirline" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FiledFeeInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                     &lt;attribute name="BSR_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *                           &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
 *                           &lt;attribute name="InConnectionNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
 *                           &lt;attribute name="CouponReference" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                           &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}DateOrTimeOrDateTimeType" />
 *                           &lt;attribute name="Duration" type="{http://www.opentravel.org/OTA/2003/05}DurationType" />
 *                           &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}DateOrTimeOrDateTimeType" />
 *                           &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
 *                           &lt;attribute name="InvoluntaryIndCode">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="I"/>
 *                                 &lt;enumeration value="L"/>
 *                                 &lt;enumeration value="S"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="SettlementAuthCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *                           &lt;attribute name="Value" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                           &lt;attribute name="AssociateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="PromotionalCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *                           &lt;attribute name="Remark" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                           &lt;attribute name="TaxOnEMD_Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="AssocFareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="ConsumedAtIssuanceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="DateOfService" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *                 &lt;attribute name="TicketDocumentNbr" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="Type">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="Ticket"/>
 *                       &lt;enumeration value="EMD"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="PrimaryDocInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="InConnectionDocNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExchangeTktNbrInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Commission" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareComponent" type="{http://www.opentravel.org/OTA/2003/05}FareComponentType" minOccurs="0"/>
 *         &lt;element name="CarrierFeeInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentDetail" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType" minOccurs="0"/>
 *                   &lt;element name="CarrierFee" maxOccurs="9" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FeeAmount" maxOccurs="9">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
 *                                     &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
 *                                     &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                     &lt;attribute name="ApplicationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to4" />
 *                           &lt;attribute name="TariffNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
 *                           &lt;attribute name="RuleNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *                           &lt;attribute name="RuleCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
 *                           &lt;attribute name="FareClassCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                           &lt;attribute name="ReportingCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Taxes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExchResidualFareComponent" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareComponentType">
 *                 &lt;sequence>
 *                   &lt;element name="Taxes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TotalAmount" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                           &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OriginalIssueInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Information">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="0"/>
 *                       &lt;maxLength value="34"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="TicketDocumentNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="IssuingAgentID" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to8" />
 *                 &lt;attribute name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="LocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReissuedFlown" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
 *                 &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
 *                 &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="TicketDocumentNbr" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="WaiverCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to19" />
 *                 &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResponseComment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" minOccurs="0"/>
 *         &lt;element name="PresentInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="To" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                 &lt;attribute name="At" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReasonForIssuance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReasonForIssuanceGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ValidatingAirline" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TaxCouponInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TicketDocument" maxOccurs="4">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CouponNumber" maxOccurs="4">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TaxCouponInfo" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Cabin" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
 *                                               &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99" minOccurs="0"/>
 *                                       &lt;element name="UnticketedPointInfo" maxOccurs="5" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="CityAirportCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                                               &lt;attribute name="ArrivalDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                                               &lt;attribute name="DepartureDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                                               &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="TicketDocumentNbr" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="JourneyTurnaroundCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
 *       &lt;attribute name="TotalFltSegQty" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
 *       &lt;attribute name="SpecificData" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="TaxOnCommissionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TicketingModeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
 *       &lt;attribute name="EMD_Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="EMD-S"/>
 *             &lt;enumeration value="EMD-A"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="QuoteInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMD_Type", propOrder = {
    "travelerRefNumber",
    "agentID",
    "paymentDetail",
    "originDestination",
    "custLoyalty",
    "endorsement",
    "addReferenceID",
    "baseFare",
    "equivFare",
    "totalFare",
    "taxes",
    "unstructuredFareCalc",
    "fareInfo",
    "ticketDocument",
    "commission",
    "fareComponent",
    "carrierFeeInfo",
    "exchResidualFareComponent",
    "originalIssueInfo",
    "reissuedFlown",
    "responseComment",
    "presentInfo",
    "reasonForIssuance",
    "validatingAirline",
    "taxCouponInformation"
})
public class EMDType {

    @XmlElement(name = "TravelerRefNumber")
    protected EMDType.TravelerRefNumber travelerRefNumber;
    @XmlElement(name = "AgentID")
    protected List<UniqueIDType> agentID;
    @XmlElement(name = "PaymentDetail")
    protected List<PaymentDetailType> paymentDetail;
    @XmlElement(name = "OriginDestination")
    protected EMDType.OriginDestination originDestination;
    @XmlElement(name = "CustLoyalty")
    protected List<EMDType.CustLoyalty> custLoyalty;
    @XmlElement(name = "Endorsement")
    protected EMDType.Endorsement endorsement;
    @XmlElement(name = "AddReferenceID")
    protected List<UniqueIDType> addReferenceID;
    @XmlElement(name = "BaseFare")
    protected List<EMDType.BaseFare> baseFare;
    @XmlElement(name = "EquivFare")
    protected List<EMDType.EquivFare> equivFare;
    @XmlElement(name = "TotalFare")
    protected List<EMDType.TotalFare> totalFare;
    @XmlElement(name = "Taxes")
    protected EMDType.Taxes taxes;
    @XmlElement(name = "UnstructuredFareCalc")
    protected List<EMDType.UnstructuredFareCalc> unstructuredFareCalc;
    @XmlElement(name = "FareInfo")
    protected EMDType.FareInfo fareInfo;
    @XmlElement(name = "TicketDocument", required = true)
    protected List<EMDType.TicketDocument> ticketDocument;
    @XmlElement(name = "Commission")
    protected EMDType.Commission commission;
    @XmlElement(name = "FareComponent")
    protected FareComponentType fareComponent;
    @XmlElement(name = "CarrierFeeInfo")
    protected EMDType.CarrierFeeInfo carrierFeeInfo;
    @XmlElement(name = "ExchResidualFareComponent")
    protected List<EMDType.ExchResidualFareComponent> exchResidualFareComponent;
    @XmlElement(name = "OriginalIssueInfo")
    protected EMDType.OriginalIssueInfo originalIssueInfo;
    @XmlElement(name = "ReissuedFlown")
    protected List<EMDType.ReissuedFlown> reissuedFlown;
    @XmlElement(name = "ResponseComment")
    protected FreeTextType responseComment;
    @XmlElement(name = "PresentInfo")
    protected EMDType.PresentInfo presentInfo;
    @XmlElement(name = "ReasonForIssuance")
    protected EMDType.ReasonForIssuance reasonForIssuance;
    @XmlElement(name = "ValidatingAirline")
    protected EMDType.ValidatingAirline validatingAirline;
    @XmlElement(name = "TaxCouponInformation")
    protected EMDType.TaxCouponInformation taxCouponInformation;
    @XmlAttribute(name = "TotalFltSegQty", required = true)
    protected int totalFltSegQty;
    @XmlAttribute(name = "SpecificData")
    protected String specificData;
    @XmlAttribute(name = "TaxOnCommissionInd")
    protected Boolean taxOnCommissionInd;
    @XmlAttribute(name = "TicketingModeCode")
    protected String ticketingModeCode;
    @XmlAttribute(name = "EMD_Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String emdType;
    @XmlAttribute(name = "QuoteInd")
    protected Boolean quoteInd;
    @XmlAttribute(name = "Operation")
    protected ActionType operation;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;

    /**
     * Gets the value of the travelerRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EMDType.TravelerRefNumber }
     *     
     */
    public EMDType.TravelerRefNumber getTravelerRefNumber() {
        return travelerRefNumber;
    }

    /**
     * Sets the value of the travelerRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.TravelerRefNumber }
     *     
     */
    public void setTravelerRefNumber(EMDType.TravelerRefNumber value) {
        this.travelerRefNumber = value;
    }

    /**
     * Gets the value of the agentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIDType }
     * 
     * 
     */
    public List<UniqueIDType> getAgentID() {
        if (agentID == null) {
            agentID = new ArrayList<UniqueIDType>();
        }
        return this.agentID;
    }

    /**
     * Gets the value of the paymentDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetailType }
     * 
     * 
     */
    public List<PaymentDetailType> getPaymentDetail() {
        if (paymentDetail == null) {
            paymentDetail = new ArrayList<PaymentDetailType>();
        }
        return this.paymentDetail;
    }

    /**
     * Gets the value of the originDestination property.
     * 
     * @return
     *     possible object is
     *     {@link EMDType.OriginDestination }
     *     
     */
    public EMDType.OriginDestination getOriginDestination() {
        return originDestination;
    }

    /**
     * Sets the value of the originDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.OriginDestination }
     *     
     */
    public void setOriginDestination(EMDType.OriginDestination value) {
        this.originDestination = value;
    }

    /**
     * Gets the value of the custLoyalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custLoyalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustLoyalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType.CustLoyalty }
     * 
     * 
     */
    public List<EMDType.CustLoyalty> getCustLoyalty() {
        if (custLoyalty == null) {
            custLoyalty = new ArrayList<EMDType.CustLoyalty>();
        }
        return this.custLoyalty;
    }

    /**
     * Gets the value of the endorsement property.
     * 
     * @return
     *     possible object is
     *     {@link EMDType.Endorsement }
     *     
     */
    public EMDType.Endorsement getEndorsement() {
        return endorsement;
    }

    /**
     * Sets the value of the endorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.Endorsement }
     *     
     */
    public void setEndorsement(EMDType.Endorsement value) {
        this.endorsement = value;
    }

    /**
     * Gets the value of the addReferenceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addReferenceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddReferenceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIDType }
     * 
     * 
     */
    public List<UniqueIDType> getAddReferenceID() {
        if (addReferenceID == null) {
            addReferenceID = new ArrayList<UniqueIDType>();
        }
        return this.addReferenceID;
    }

    /**
     * Gets the value of the baseFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType.BaseFare }
     * 
     * 
     */
    public List<EMDType.BaseFare> getBaseFare() {
        if (baseFare == null) {
            baseFare = new ArrayList<EMDType.BaseFare>();
        }
        return this.baseFare;
    }

    /**
     * Gets the value of the equivFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equivFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquivFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType.EquivFare }
     * 
     * 
     */
    public List<EMDType.EquivFare> getEquivFare() {
        if (equivFare == null) {
            equivFare = new ArrayList<EMDType.EquivFare>();
        }
        return this.equivFare;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType.TotalFare }
     * 
     * 
     */
    public List<EMDType.TotalFare> getTotalFare() {
        if (totalFare == null) {
            totalFare = new ArrayList<EMDType.TotalFare>();
        }
        return this.totalFare;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link EMDType.Taxes }
     *     
     */
    public EMDType.Taxes getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.Taxes }
     *     
     */
    public void setTaxes(EMDType.Taxes value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the unstructuredFareCalc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unstructuredFareCalc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnstructuredFareCalc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType.UnstructuredFareCalc }
     * 
     * 
     */
    public List<EMDType.UnstructuredFareCalc> getUnstructuredFareCalc() {
        if (unstructuredFareCalc == null) {
            unstructuredFareCalc = new ArrayList<EMDType.UnstructuredFareCalc>();
        }
        return this.unstructuredFareCalc;
    }

    /**
     * Gets the value of the fareInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EMDType.FareInfo }
     *     
     */
    public EMDType.FareInfo getFareInfo() {
        return fareInfo;
    }

    /**
     * Sets the value of the fareInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.FareInfo }
     *     
     */
    public void setFareInfo(EMDType.FareInfo value) {
        this.fareInfo = value;
    }

    /**
     * Gets the value of the ticketDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType.TicketDocument }
     * 
     * 
     */
    public List<EMDType.TicketDocument> getTicketDocument() {
        if (ticketDocument == null) {
            ticketDocument = new ArrayList<EMDType.TicketDocument>();
        }
        return this.ticketDocument;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link EMDType.Commission }
     *     
     */
    public EMDType.Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.Commission }
     *     
     */
    public void setCommission(EMDType.Commission value) {
        this.commission = value;
    }

    /**
     * Gets the value of the fareComponent property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentType }
     *     
     */
    public FareComponentType getFareComponent() {
        return fareComponent;
    }

    /**
     * Sets the value of the fareComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentType }
     *     
     */
    public void setFareComponent(FareComponentType value) {
        this.fareComponent = value;
    }

    /**
     * Gets the value of the carrierFeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EMDType.CarrierFeeInfo }
     *     
     */
    public EMDType.CarrierFeeInfo getCarrierFeeInfo() {
        return carrierFeeInfo;
    }

    /**
     * Sets the value of the carrierFeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.CarrierFeeInfo }
     *     
     */
    public void setCarrierFeeInfo(EMDType.CarrierFeeInfo value) {
        this.carrierFeeInfo = value;
    }

    /**
     * Gets the value of the exchResidualFareComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchResidualFareComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchResidualFareComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType.ExchResidualFareComponent }
     * 
     * 
     */
    public List<EMDType.ExchResidualFareComponent> getExchResidualFareComponent() {
        if (exchResidualFareComponent == null) {
            exchResidualFareComponent = new ArrayList<EMDType.ExchResidualFareComponent>();
        }
        return this.exchResidualFareComponent;
    }

    /**
     * Gets the value of the originalIssueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EMDType.OriginalIssueInfo }
     *     
     */
    public EMDType.OriginalIssueInfo getOriginalIssueInfo() {
        return originalIssueInfo;
    }

    /**
     * Sets the value of the originalIssueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.OriginalIssueInfo }
     *     
     */
    public void setOriginalIssueInfo(EMDType.OriginalIssueInfo value) {
        this.originalIssueInfo = value;
    }

    /**
     * Gets the value of the reissuedFlown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reissuedFlown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReissuedFlown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType.ReissuedFlown }
     * 
     * 
     */
    public List<EMDType.ReissuedFlown> getReissuedFlown() {
        if (reissuedFlown == null) {
            reissuedFlown = new ArrayList<EMDType.ReissuedFlown>();
        }
        return this.reissuedFlown;
    }

    /**
     * Gets the value of the responseComment property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextType }
     *     
     */
    public FreeTextType getResponseComment() {
        return responseComment;
    }

    /**
     * Sets the value of the responseComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextType }
     *     
     */
    public void setResponseComment(FreeTextType value) {
        this.responseComment = value;
    }

    /**
     * Gets the value of the presentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EMDType.PresentInfo }
     *     
     */
    public EMDType.PresentInfo getPresentInfo() {
        return presentInfo;
    }

    /**
     * Sets the value of the presentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.PresentInfo }
     *     
     */
    public void setPresentInfo(EMDType.PresentInfo value) {
        this.presentInfo = value;
    }

    /**
     * Gets the value of the reasonForIssuance property.
     * 
     * @return
     *     possible object is
     *     {@link EMDType.ReasonForIssuance }
     *     
     */
    public EMDType.ReasonForIssuance getReasonForIssuance() {
        return reasonForIssuance;
    }

    /**
     * Sets the value of the reasonForIssuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.ReasonForIssuance }
     *     
     */
    public void setReasonForIssuance(EMDType.ReasonForIssuance value) {
        this.reasonForIssuance = value;
    }

    /**
     * Gets the value of the validatingAirline property.
     * 
     * @return
     *     possible object is
     *     {@link EMDType.ValidatingAirline }
     *     
     */
    public EMDType.ValidatingAirline getValidatingAirline() {
        return validatingAirline;
    }

    /**
     * Sets the value of the validatingAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.ValidatingAirline }
     *     
     */
    public void setValidatingAirline(EMDType.ValidatingAirline value) {
        this.validatingAirline = value;
    }

    /**
     * Gets the value of the taxCouponInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EMDType.TaxCouponInformation }
     *     
     */
    public EMDType.TaxCouponInformation getTaxCouponInformation() {
        return taxCouponInformation;
    }

    /**
     * Sets the value of the taxCouponInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDType.TaxCouponInformation }
     *     
     */
    public void setTaxCouponInformation(EMDType.TaxCouponInformation value) {
        this.taxCouponInformation = value;
    }

    /**
     * Gets the value of the totalFltSegQty property.
     * 
     */
    public int getTotalFltSegQty() {
        return totalFltSegQty;
    }

    /**
     * Sets the value of the totalFltSegQty property.
     * 
     */
    public void setTotalFltSegQty(int value) {
        this.totalFltSegQty = value;
    }

    /**
     * Gets the value of the specificData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificData() {
        return specificData;
    }

    /**
     * Sets the value of the specificData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificData(String value) {
        this.specificData = value;
    }

    /**
     * Gets the value of the taxOnCommissionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxOnCommissionInd() {
        return taxOnCommissionInd;
    }

    /**
     * Sets the value of the taxOnCommissionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxOnCommissionInd(Boolean value) {
        this.taxOnCommissionInd = value;
    }

    /**
     * Gets the value of the ticketingModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingModeCode() {
        return ticketingModeCode;
    }

    /**
     * Sets the value of the ticketingModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingModeCode(String value) {
        this.ticketingModeCode = value;
    }

    /**
     * Gets the value of the emdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMDType() {
        return emdType;
    }

    /**
     * Sets the value of the emdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMDType(String value) {
        this.emdType = value;
    }

    /**
     * Gets the value of the quoteInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuoteInd() {
        return quoteInd;
    }

    /**
     * Sets the value of the quoteInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuoteInd(Boolean value) {
        this.quoteInd = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setOperation(ActionType value) {
        this.operation = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *       &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
     *       &lt;attribute name="FareAmountType" type="{http://www.opentravel.org/OTA/2003/05}FareAmountType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BaseFare {

        @XmlAttribute(name = "Purpose")
        protected PurposeType purpose;
        @XmlAttribute(name = "FareAmountType")
        protected FareAmountType fareAmountType;
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
         * Gets the value of the fareAmountType property.
         * 
         * @return
         *     possible object is
         *     {@link FareAmountType }
         *     
         */
        public FareAmountType getFareAmountType() {
            return fareAmountType;
        }

        /**
         * Sets the value of the fareAmountType property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareAmountType }
         *     
         */
        public void setFareAmountType(FareAmountType value) {
            this.fareAmountType = value;
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
     *       &lt;sequence>
     *         &lt;element name="PaymentDetail" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType" minOccurs="0"/>
     *         &lt;element name="CarrierFee" maxOccurs="9" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FeeAmount" maxOccurs="9">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
     *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
     *                           &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                           &lt;attribute name="ApplicationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
     *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to4" />
     *                 &lt;attribute name="TariffNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
     *                 &lt;attribute name="RuleNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *                 &lt;attribute name="RuleCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
     *                 &lt;attribute name="FareClassCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                 &lt;attribute name="ReportingCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Taxes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99" minOccurs="0"/>
     *                 &lt;/sequence>
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
        "paymentDetail",
        "carrierFee",
        "taxes"
    })
    public static class CarrierFeeInfo {

        @XmlElement(name = "PaymentDetail")
        protected PaymentDetailType paymentDetail;
        @XmlElement(name = "CarrierFee")
        protected List<EMDType.CarrierFeeInfo.CarrierFee> carrierFee;
        @XmlElement(name = "Taxes")
        protected EMDType.CarrierFeeInfo.Taxes taxes;

        /**
         * Gets the value of the paymentDetail property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentDetailType }
         *     
         */
        public PaymentDetailType getPaymentDetail() {
            return paymentDetail;
        }

        /**
         * Sets the value of the paymentDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentDetailType }
         *     
         */
        public void setPaymentDetail(PaymentDetailType value) {
            this.paymentDetail = value;
        }

        /**
         * Gets the value of the carrierFee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carrierFee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarrierFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EMDType.CarrierFeeInfo.CarrierFee }
         * 
         * 
         */
        public List<EMDType.CarrierFeeInfo.CarrierFee> getCarrierFee() {
            if (carrierFee == null) {
                carrierFee = new ArrayList<EMDType.CarrierFeeInfo.CarrierFee>();
            }
            return this.carrierFee;
        }

        /**
         * Gets the value of the taxes property.
         * 
         * @return
         *     possible object is
         *     {@link EMDType.CarrierFeeInfo.Taxes }
         *     
         */
        public EMDType.CarrierFeeInfo.Taxes getTaxes() {
            return taxes;
        }

        /**
         * Sets the value of the taxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link EMDType.CarrierFeeInfo.Taxes }
         *     
         */
        public void setTaxes(EMDType.CarrierFeeInfo.Taxes value) {
            this.taxes = value;
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
         *         &lt;element name="FeeAmount" maxOccurs="9">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
         *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
         *                 &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                 &lt;attribute name="ApplicationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
         *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to4" />
         *       &lt;attribute name="TariffNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
         *       &lt;attribute name="RuleNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
         *       &lt;attribute name="RuleCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
         *       &lt;attribute name="FareClassCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *       &lt;attribute name="ReportingCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "feeAmount"
        })
        public static class CarrierFee {

            @XmlElement(name = "FeeAmount", required = true)
            protected List<EMDType.CarrierFeeInfo.CarrierFee.FeeAmount> feeAmount;
            @XmlAttribute(name = "Type", required = true)
            protected String type;
            @XmlAttribute(name = "Number")
            protected Integer number;
            @XmlAttribute(name = "TariffNumber")
            protected String tariffNumber;
            @XmlAttribute(name = "RuleNumber")
            protected String ruleNumber;
            @XmlAttribute(name = "RuleCode")
            protected String ruleCode;
            @XmlAttribute(name = "FareClassCode")
            protected String fareClassCode;
            @XmlAttribute(name = "ReportingCode")
            protected String reportingCode;
            @XmlAttribute(name = "CompanyShortName")
            protected String companyShortName;
            @XmlAttribute(name = "TravelSector")
            protected String travelSector;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;

            /**
             * Gets the value of the feeAmount property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the feeAmount property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFeeAmount().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EMDType.CarrierFeeInfo.CarrierFee.FeeAmount }
             * 
             * 
             */
            public List<EMDType.CarrierFeeInfo.CarrierFee.FeeAmount> getFeeAmount() {
                if (feeAmount == null) {
                    feeAmount = new ArrayList<EMDType.CarrierFeeInfo.CarrierFee.FeeAmount>();
                }
                return this.feeAmount;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumber(Integer value) {
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
             * Gets the value of the fareClassCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareClassCode() {
                return fareClassCode;
            }

            /**
             * Sets the value of the fareClassCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareClassCode(String value) {
                this.fareClassCode = value;
            }

            /**
             * Gets the value of the reportingCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReportingCode() {
                return reportingCode;
            }

            /**
             * Sets the value of the reportingCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReportingCode(String value) {
                this.reportingCode = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationGroup"/>
             *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
             *       &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *       &lt;attribute name="ApplicationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FeeAmount {

                @XmlAttribute(name = "Type", required = true)
                protected String type;
                @XmlAttribute(name = "Amount", required = true)
                protected BigDecimal amount;
                @XmlAttribute(name = "ApplicationCode", required = true)
                protected List<String> applicationCode;
                @XmlAttribute(name = "OriginCityCode")
                protected String originCityCode;
                @XmlAttribute(name = "OriginCodeContext")
                protected String originCodeContext;
                @XmlAttribute(name = "DestinationCityCode")
                protected String destinationCityCode;
                @XmlAttribute(name = "DestinationCodeContext")
                protected String destinationCodeContext;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
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
                 * Gets the value of the applicationCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the applicationCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getApplicationCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getApplicationCode() {
                    if (applicationCode == null) {
                        applicationCode = new ArrayList<String>();
                    }
                    return this.applicationCode;
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
         *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99" minOccurs="0"/>
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
            "tax"
        })
        public static class Taxes {

            @XmlElement(name = "Tax")
            protected List<AirTaxType> tax;

            /**
             * Gets the value of the tax property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tax property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTax().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirTaxType }
             * 
             * 
             */
            public List<AirTaxType> getTax() {
                if (tax == null) {
                    tax = new ArrayList<AirTaxType>();
                }
                return this.tax;
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
     *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
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
    public static class Commission {

        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "Percent")
        protected BigDecimal percent;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CustomerLoyaltyGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CustLoyalty {

        @XmlAttribute(name = "ShareSynchInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareMarketInd;
        @XmlAttribute(name = "ProgramID")
        protected String programID;
        @XmlAttribute(name = "MembershipID")
        protected String membershipID;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "LoyalLevel")
        protected String loyalLevel;
        @XmlAttribute(name = "LoyalLevelCode")
        protected Integer loyalLevelCode;
        @XmlAttribute(name = "SingleVendorInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String singleVendorInd;
        @XmlAttribute(name = "SignupDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signupDate;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "ExpireDateExclusiveIndicator")
        protected Boolean expireDateExclusiveIndicator;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "VendorCode")
        protected List<String> vendorCode;
        @XmlAttribute(name = "PrimaryLoyaltyIndicator")
        protected Boolean primaryLoyaltyIndicator;
        @XmlAttribute(name = "AllianceLoyaltyLevelName")
        protected String allianceLoyaltyLevelName;
        @XmlAttribute(name = "CustomerType")
        protected String customerType;
        @XmlAttribute(name = "CustomerValue")
        protected String customerValue;
        @XmlAttribute(name = "Password")
        protected String password;

        /**
         * Gets the value of the shareSynchInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareSynchInd() {
            return shareSynchInd;
        }

        /**
         * Sets the value of the shareSynchInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareSynchInd(String value) {
            this.shareSynchInd = value;
        }

        /**
         * Gets the value of the shareMarketInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareMarketInd() {
            return shareMarketInd;
        }

        /**
         * Sets the value of the shareMarketInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareMarketInd(String value) {
            this.shareMarketInd = value;
        }

        /**
         * Gets the value of the programID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramID() {
            return programID;
        }

        /**
         * Sets the value of the programID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramID(String value) {
            this.programID = value;
        }

        /**
         * Gets the value of the membershipID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMembershipID() {
            return membershipID;
        }

        /**
         * Sets the value of the membershipID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMembershipID(String value) {
            this.membershipID = value;
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
         * Gets the value of the loyalLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoyalLevel() {
            return loyalLevel;
        }

        /**
         * Sets the value of the loyalLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoyalLevel(String value) {
            this.loyalLevel = value;
        }

        /**
         * Gets the value of the loyalLevelCode property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLoyalLevelCode() {
            return loyalLevelCode;
        }

        /**
         * Sets the value of the loyalLevelCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLoyalLevelCode(Integer value) {
            this.loyalLevelCode = value;
        }

        /**
         * Gets the value of the singleVendorInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSingleVendorInd() {
            return singleVendorInd;
        }

        /**
         * Sets the value of the singleVendorInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSingleVendorInd(String value) {
            this.singleVendorInd = value;
        }

        /**
         * Gets the value of the signupDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSignupDate() {
            return signupDate;
        }

        /**
         * Sets the value of the signupDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSignupDate(XMLGregorianCalendar value) {
            this.signupDate = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
        }

        /**
         * Gets the value of the expireDateExclusiveIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExpireDateExclusiveIndicator() {
            return expireDateExclusiveIndicator;
        }

        /**
         * Sets the value of the expireDateExclusiveIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExpireDateExclusiveIndicator(Boolean value) {
            this.expireDateExclusiveIndicator = value;
        }

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the vendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVendorCode() {
            if (vendorCode == null) {
                vendorCode = new ArrayList<String>();
            }
            return this.vendorCode;
        }

        /**
         * Gets the value of the primaryLoyaltyIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrimaryLoyaltyIndicator() {
            return primaryLoyaltyIndicator;
        }

        /**
         * Sets the value of the primaryLoyaltyIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrimaryLoyaltyIndicator(Boolean value) {
            this.primaryLoyaltyIndicator = value;
        }

        /**
         * Gets the value of the allianceLoyaltyLevelName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllianceLoyaltyLevelName() {
            return allianceLoyaltyLevelName;
        }

        /**
         * Sets the value of the allianceLoyaltyLevelName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllianceLoyaltyLevelName(String value) {
            this.allianceLoyaltyLevelName = value;
        }

        /**
         * Gets the value of the customerType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerType() {
            return customerType;
        }

        /**
         * Sets the value of the customerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerType(String value) {
            this.customerType = value;
        }

        /**
         * Gets the value of the customerValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerValue() {
            return customerValue;
        }

        /**
         * Sets the value of the customerValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerValue(String value) {
            this.customerValue = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
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
     *       &lt;attribute name="Info" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to255" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Endorsement {

        @XmlAttribute(name = "Info")
        protected String info;

        /**
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
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
     *       &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
     *       &lt;attribute name="FareAmountType" type="{http://www.opentravel.org/OTA/2003/05}FareAmountType" />
     *       &lt;attribute name="BankExchangeRate" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EquivFare {

        @XmlAttribute(name = "Purpose")
        protected PurposeType purpose;
        @XmlAttribute(name = "FareAmountType")
        protected FareAmountType fareAmountType;
        @XmlAttribute(name = "BankExchangeRate")
        protected BigDecimal bankExchangeRate;
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
         * Gets the value of the fareAmountType property.
         * 
         * @return
         *     possible object is
         *     {@link FareAmountType }
         *     
         */
        public FareAmountType getFareAmountType() {
            return fareAmountType;
        }

        /**
         * Sets the value of the fareAmountType property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareAmountType }
         *     
         */
        public void setFareAmountType(FareAmountType value) {
            this.fareAmountType = value;
        }

        /**
         * Gets the value of the bankExchangeRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBankExchangeRate() {
            return bankExchangeRate;
        }

        /**
         * Sets the value of the bankExchangeRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBankExchangeRate(BigDecimal value) {
            this.bankExchangeRate = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareComponentType">
     *       &lt;sequence>
     *         &lt;element name="Taxes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TotalAmount" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                 &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxes",
        "totalAmount"
    })
    public static class ExchResidualFareComponent
        extends FareComponentType
    {

        @XmlElement(name = "Taxes")
        protected EMDType.ExchResidualFareComponent.Taxes taxes;
        @XmlElement(name = "TotalAmount")
        protected EMDType.ExchResidualFareComponent.TotalAmount totalAmount;

        /**
         * Gets the value of the taxes property.
         * 
         * @return
         *     possible object is
         *     {@link EMDType.ExchResidualFareComponent.Taxes }
         *     
         */
        public EMDType.ExchResidualFareComponent.Taxes getTaxes() {
            return taxes;
        }

        /**
         * Sets the value of the taxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link EMDType.ExchResidualFareComponent.Taxes }
         *     
         */
        public void setTaxes(EMDType.ExchResidualFareComponent.Taxes value) {
            this.taxes = value;
        }

        /**
         * Gets the value of the totalAmount property.
         * 
         * @return
         *     possible object is
         *     {@link EMDType.ExchResidualFareComponent.TotalAmount }
         *     
         */
        public EMDType.ExchResidualFareComponent.TotalAmount getTotalAmount() {
            return totalAmount;
        }

        /**
         * Sets the value of the totalAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link EMDType.ExchResidualFareComponent.TotalAmount }
         *     
         */
        public void setTotalAmount(EMDType.ExchResidualFareComponent.TotalAmount value) {
            this.totalAmount = value;
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
         *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
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
            "tax"
        })
        public static class Taxes {

            @XmlElement(name = "Tax", required = true)
            protected List<AirTaxType> tax;

            /**
             * Gets the value of the tax property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tax property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTax().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirTaxType }
             * 
             * 
             */
            public List<AirTaxType> getTax() {
                if (tax == null) {
                    tax = new ArrayList<AirTaxType>();
                }
                return this.tax;
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
        public static class TotalAmount {

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ET_FareInfo">
     *       &lt;sequence>
     *         &lt;element name="PenaltyAmount" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" maxOccurs="3" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
     *       &lt;attribute name="NonEndorsableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NonRefundableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PenaltyRestrictionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PresentCreditCardInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AroundTheWorldFareInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NonInterlineableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NonCommissionableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NonReissuableNonExchgInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "penaltyAmount"
    })
    public static class FareInfo
        extends ETFareInfo
    {

        @XmlElement(name = "PenaltyAmount")
        protected List<VoluntaryChangesType> penaltyAmount;
        @XmlAttribute(name = "NonEndorsableInd")
        protected Boolean nonEndorsableInd;
        @XmlAttribute(name = "NonRefundableInd")
        protected Boolean nonRefundableInd;
        @XmlAttribute(name = "PenaltyRestrictionInd")
        protected Boolean penaltyRestrictionInd;
        @XmlAttribute(name = "PresentCreditCardInd")
        protected Boolean presentCreditCardInd;
        @XmlAttribute(name = "AroundTheWorldFareInd")
        protected Boolean aroundTheWorldFareInd;
        @XmlAttribute(name = "NonInterlineableInd")
        protected Boolean nonInterlineableInd;
        @XmlAttribute(name = "NonCommissionableInd")
        protected Boolean nonCommissionableInd;
        @XmlAttribute(name = "NonReissuableNonExchgInd")
        protected Boolean nonReissuableNonExchgInd;
        @XmlAttribute(name = "CompanyShortName")
        protected String companyShortName;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

        /**
         * Gets the value of the penaltyAmount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the penaltyAmount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPenaltyAmount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VoluntaryChangesType }
         * 
         * 
         */
        public List<VoluntaryChangesType> getPenaltyAmount() {
            if (penaltyAmount == null) {
                penaltyAmount = new ArrayList<VoluntaryChangesType>();
            }
            return this.penaltyAmount;
        }

        /**
         * Gets the value of the nonEndorsableInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonEndorsableInd() {
            return nonEndorsableInd;
        }

        /**
         * Sets the value of the nonEndorsableInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonEndorsableInd(Boolean value) {
            this.nonEndorsableInd = value;
        }

        /**
         * Gets the value of the nonRefundableInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonRefundableInd() {
            return nonRefundableInd;
        }

        /**
         * Sets the value of the nonRefundableInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonRefundableInd(Boolean value) {
            this.nonRefundableInd = value;
        }

        /**
         * Gets the value of the penaltyRestrictionInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPenaltyRestrictionInd() {
            return penaltyRestrictionInd;
        }

        /**
         * Sets the value of the penaltyRestrictionInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPenaltyRestrictionInd(Boolean value) {
            this.penaltyRestrictionInd = value;
        }

        /**
         * Gets the value of the presentCreditCardInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPresentCreditCardInd() {
            return presentCreditCardInd;
        }

        /**
         * Sets the value of the presentCreditCardInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPresentCreditCardInd(Boolean value) {
            this.presentCreditCardInd = value;
        }

        /**
         * Gets the value of the aroundTheWorldFareInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAroundTheWorldFareInd() {
            return aroundTheWorldFareInd;
        }

        /**
         * Sets the value of the aroundTheWorldFareInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAroundTheWorldFareInd(Boolean value) {
            this.aroundTheWorldFareInd = value;
        }

        /**
         * Gets the value of the nonInterlineableInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonInterlineableInd() {
            return nonInterlineableInd;
        }

        /**
         * Sets the value of the nonInterlineableInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonInterlineableInd(Boolean value) {
            this.nonInterlineableInd = value;
        }

        /**
         * Gets the value of the nonCommissionableInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonCommissionableInd() {
            return nonCommissionableInd;
        }

        /**
         * Sets the value of the nonCommissionableInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonCommissionableInd(Boolean value) {
            this.nonCommissionableInd = value;
        }

        /**
         * Gets the value of the nonReissuableNonExchgInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonReissuableNonExchgInd() {
            return nonReissuableNonExchgInd;
        }

        /**
         * Sets the value of the nonReissuableNonExchgInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonReissuableNonExchgInd(Boolean value) {
            this.nonReissuableNonExchgInd = value;
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
     *       &lt;attribute name="Information">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="0"/>
     *             &lt;maxLength value="34"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="TicketDocumentNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="IssuingAgentID" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to8" />
     *       &lt;attribute name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="LocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OriginalIssueInfo {

        @XmlAttribute(name = "Information")
        protected String information;
        @XmlAttribute(name = "TicketDocumentNbr")
        protected String ticketDocumentNbr;
        @XmlAttribute(name = "IssuingAgentID")
        protected String issuingAgentID;
        @XmlAttribute(name = "DateOfIssue")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateOfIssue;
        @XmlAttribute(name = "LocationCode")
        protected String locationCode;

        /**
         * Gets the value of the information property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInformation() {
            return information;
        }

        /**
         * Sets the value of the information property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInformation(String value) {
            this.information = value;
        }

        /**
         * Gets the value of the ticketDocumentNbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketDocumentNbr() {
            return ticketDocumentNbr;
        }

        /**
         * Sets the value of the ticketDocumentNbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketDocumentNbr(String value) {
            this.ticketDocumentNbr = value;
        }

        /**
         * Gets the value of the issuingAgentID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssuingAgentID() {
            return issuingAgentID;
        }

        /**
         * Sets the value of the issuingAgentID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssuingAgentID(String value) {
            this.issuingAgentID = value;
        }

        /**
         * Gets the value of the dateOfIssue property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateOfIssue() {
            return dateOfIssue;
        }

        /**
         * Sets the value of the dateOfIssue property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateOfIssue(XMLGregorianCalendar value) {
            this.dateOfIssue = value;
        }

        /**
         * Gets the value of the locationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationCode() {
            return locationCode;
        }

        /**
         * Sets the value of the locationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationCode(String value) {
            this.locationCode = value;
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OriginDestination {

        @XmlAttribute(name = "OriginCityCode")
        protected String originCityCode;
        @XmlAttribute(name = "OriginCodeContext")
        protected String originCodeContext;
        @XmlAttribute(name = "DestinationCityCode")
        protected String destinationCityCode;
        @XmlAttribute(name = "DestinationCodeContext")
        protected String destinationCodeContext;

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
     *       &lt;attribute name="To" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *       &lt;attribute name="At" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PresentInfo {

        @XmlAttribute(name = "To")
        protected String to;
        @XmlAttribute(name = "At")
        protected String at;

        /**
         * Gets the value of the to property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTo() {
            return to;
        }

        /**
         * Sets the value of the to property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTo(String value) {
            this.to = value;
        }

        /**
         * Gets the value of the at property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAt() {
            return at;
        }

        /**
         * Sets the value of the at property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAt(String value) {
            this.at = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReasonForIssuanceGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReasonForIssuance {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "SubCode")
        protected String subCode;
        @XmlAttribute(name = "Description")
        protected String description;

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
         * Gets the value of the subCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubCode() {
            return subCode;
        }

        /**
         * Sets the value of the subCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubCode(String value) {
            this.subCode = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
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
     *         &lt;element name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
     *       &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
     *       &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="TicketDocumentNbr" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="WaiverCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to19" />
     *       &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flightSegmentRPH"
    })
    public static class ReissuedFlown {

        @XmlElement(name = "FlightSegmentRPH")
        protected String flightSegmentRPH;
        @XmlAttribute(name = "Number", required = true)
        protected int number;
        @XmlAttribute(name = "CouponItinerarySeqNbr")
        protected Integer couponItinerarySeqNbr;
        @XmlAttribute(name = "FareBasisCode")
        protected String fareBasisCode;
        @XmlAttribute(name = "TicketDocumentNbr", required = true)
        protected String ticketDocumentNbr;
        @XmlAttribute(name = "DateOfIssue")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateOfIssue;
        @XmlAttribute(name = "WaiverCode")
        protected String waiverCode;
        @XmlAttribute(name = "TicketDesignatorCode")
        protected String ticketDesignatorCode;

        /**
         * Gets the value of the flightSegmentRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightSegmentRPH() {
            return flightSegmentRPH;
        }

        /**
         * Sets the value of the flightSegmentRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightSegmentRPH(String value) {
            this.flightSegmentRPH = value;
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
         * Gets the value of the ticketDocumentNbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketDocumentNbr() {
            return ticketDocumentNbr;
        }

        /**
         * Sets the value of the ticketDocumentNbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketDocumentNbr(String value) {
            this.ticketDocumentNbr = value;
        }

        /**
         * Gets the value of the dateOfIssue property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateOfIssue() {
            return dateOfIssue;
        }

        /**
         * Sets the value of the dateOfIssue property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateOfIssue(XMLGregorianCalendar value) {
            this.dateOfIssue = value;
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
     *         &lt;element name="TicketDocument" maxOccurs="4">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CouponNumber" maxOccurs="4">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TaxCouponInfo" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Cabin" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
     *                                     &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99" minOccurs="0"/>
     *                             &lt;element name="UnticketedPointInfo" maxOccurs="5" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="CityAirportCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                                     &lt;attribute name="ArrivalDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                                     &lt;attribute name="DepartureDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                                     &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="TicketDocumentNbr" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="JourneyTurnaroundCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ticketDocument"
    })
    public static class TaxCouponInformation {

        @XmlElement(name = "TicketDocument", required = true)
        protected List<EMDType.TaxCouponInformation.TicketDocument> ticketDocument;
        @XmlAttribute(name = "BirthDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birthDate;
        @XmlAttribute(name = "JourneyTurnaroundCityCode")
        protected String journeyTurnaroundCityCode;

        /**
         * Gets the value of the ticketDocument property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketDocument property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicketDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EMDType.TaxCouponInformation.TicketDocument }
         * 
         * 
         */
        public List<EMDType.TaxCouponInformation.TicketDocument> getTicketDocument() {
            if (ticketDocument == null) {
                ticketDocument = new ArrayList<EMDType.TaxCouponInformation.TicketDocument>();
            }
            return this.ticketDocument;
        }

        /**
         * Gets the value of the birthDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBirthDate() {
            return birthDate;
        }

        /**
         * Sets the value of the birthDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBirthDate(XMLGregorianCalendar value) {
            this.birthDate = value;
        }

        /**
         * Gets the value of the journeyTurnaroundCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJourneyTurnaroundCityCode() {
            return journeyTurnaroundCityCode;
        }

        /**
         * Sets the value of the journeyTurnaroundCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJourneyTurnaroundCityCode(String value) {
            this.journeyTurnaroundCityCode = value;
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
         *         &lt;element name="CouponNumber" maxOccurs="4">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TaxCouponInfo" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Cabin" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
         *                           &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99" minOccurs="0"/>
         *                   &lt;element name="UnticketedPointInfo" maxOccurs="5" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="CityAirportCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *                           &lt;attribute name="ArrivalDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *                           &lt;attribute name="DepartureDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *                           &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="TicketDocumentNbr" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "couponNumber"
        })
        public static class TicketDocument {

            @XmlElement(name = "CouponNumber", required = true)
            protected List<EMDType.TaxCouponInformation.TicketDocument.CouponNumber> couponNumber;
            @XmlAttribute(name = "TicketDocumentNbr", required = true)
            protected String ticketDocumentNbr;

            /**
             * Gets the value of the couponNumber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the couponNumber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCouponNumber().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EMDType.TaxCouponInformation.TicketDocument.CouponNumber }
             * 
             * 
             */
            public List<EMDType.TaxCouponInformation.TicketDocument.CouponNumber> getCouponNumber() {
                if (couponNumber == null) {
                    couponNumber = new ArrayList<EMDType.TaxCouponInformation.TicketDocument.CouponNumber>();
                }
                return this.couponNumber;
            }

            /**
             * Gets the value of the ticketDocumentNbr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTicketDocumentNbr() {
                return ticketDocumentNbr;
            }

            /**
             * Sets the value of the ticketDocumentNbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTicketDocumentNbr(String value) {
                this.ticketDocumentNbr = value;
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
             *         &lt;element name="TaxCouponInfo" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Cabin" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
             *                 &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99" minOccurs="0"/>
             *         &lt;element name="UnticketedPointInfo" maxOccurs="5" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="CityAirportCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
             *                 &lt;attribute name="ArrivalDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
             *                 &lt;attribute name="DepartureDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
             *                 &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "taxCouponInfo",
                "tax",
                "unticketedPointInfo"
            })
            public static class CouponNumber {

                @XmlElement(name = "TaxCouponInfo")
                protected EMDType.TaxCouponInformation.TicketDocument.CouponNumber.TaxCouponInfo taxCouponInfo;
                @XmlElement(name = "Tax")
                protected List<AirTaxType> tax;
                @XmlElement(name = "UnticketedPointInfo")
                protected List<EMDType.TaxCouponInformation.TicketDocument.CouponNumber.UnticketedPointInfo> unticketedPointInfo;
                @XmlAttribute(name = "Number", required = true)
                protected int number;

                /**
                 * Gets the value of the taxCouponInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EMDType.TaxCouponInformation.TicketDocument.CouponNumber.TaxCouponInfo }
                 *     
                 */
                public EMDType.TaxCouponInformation.TicketDocument.CouponNumber.TaxCouponInfo getTaxCouponInfo() {
                    return taxCouponInfo;
                }

                /**
                 * Sets the value of the taxCouponInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EMDType.TaxCouponInformation.TicketDocument.CouponNumber.TaxCouponInfo }
                 *     
                 */
                public void setTaxCouponInfo(EMDType.TaxCouponInformation.TicketDocument.CouponNumber.TaxCouponInfo value) {
                    this.taxCouponInfo = value;
                }

                /**
                 * Gets the value of the tax property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tax property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTax().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AirTaxType }
                 * 
                 * 
                 */
                public List<AirTaxType> getTax() {
                    if (tax == null) {
                        tax = new ArrayList<AirTaxType>();
                    }
                    return this.tax;
                }

                /**
                 * Gets the value of the unticketedPointInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the unticketedPointInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getUnticketedPointInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EMDType.TaxCouponInformation.TicketDocument.CouponNumber.UnticketedPointInfo }
                 * 
                 * 
                 */
                public List<EMDType.TaxCouponInformation.TicketDocument.CouponNumber.UnticketedPointInfo> getUnticketedPointInfo() {
                    if (unticketedPointInfo == null) {
                        unticketedPointInfo = new ArrayList<EMDType.TaxCouponInformation.TicketDocument.CouponNumber.UnticketedPointInfo>();
                    }
                    return this.unticketedPointInfo;
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
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Cabin" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
                 *       &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class TaxCouponInfo {

                    @XmlAttribute(name = "Cabin")
                    protected CabinType cabin;
                    @XmlAttribute(name = "AirEquipType")
                    protected String airEquipType;

                    /**
                     * Gets the value of the cabin property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CabinType }
                     *     
                     */
                    public CabinType getCabin() {
                        return cabin;
                    }

                    /**
                     * Sets the value of the cabin property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CabinType }
                     *     
                     */
                    public void setCabin(CabinType value) {
                        this.cabin = value;
                    }

                    /**
                     * Gets the value of the airEquipType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAirEquipType() {
                        return airEquipType;
                    }

                    /**
                     * Sets the value of the airEquipType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAirEquipType(String value) {
                        this.airEquipType = value;
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
                 *       &lt;attribute name="CityAirportCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
                 *       &lt;attribute name="ArrivalDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
                 *       &lt;attribute name="DepartureDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
                 *       &lt;attribute name="AirEquipType" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class UnticketedPointInfo {

                    @XmlAttribute(name = "CityAirportCode")
                    protected String cityAirportCode;
                    @XmlAttribute(name = "ArrivalDate")
                    protected String arrivalDate;
                    @XmlAttribute(name = "DepartureDate")
                    protected String departureDate;
                    @XmlAttribute(name = "AirEquipType")
                    protected String airEquipType;

                    /**
                     * Gets the value of the cityAirportCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCityAirportCode() {
                        return cityAirportCode;
                    }

                    /**
                     * Sets the value of the cityAirportCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCityAirportCode(String value) {
                        this.cityAirportCode = value;
                    }

                    /**
                     * Gets the value of the arrivalDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getArrivalDate() {
                        return arrivalDate;
                    }

                    /**
                     * Sets the value of the arrivalDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setArrivalDate(String value) {
                        this.arrivalDate = value;
                    }

                    /**
                     * Gets the value of the departureDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDepartureDate() {
                        return departureDate;
                    }

                    /**
                     * Sets the value of the departureDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDepartureDate(String value) {
                        this.departureDate = value;
                    }

                    /**
                     * Gets the value of the airEquipType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAirEquipType() {
                        return airEquipType;
                    }

                    /**
                     * Sets the value of the airEquipType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAirEquipType(String value) {
                        this.airEquipType = value;
                    }

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
     *       &lt;sequence>
     *         &lt;element name="Tax" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>AirTaxType">
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "tax"
    })
    public static class Taxes {

        @XmlElement(name = "Tax", required = true)
        protected List<EMDType.Taxes.Tax> tax;

        /**
         * Gets the value of the tax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EMDType.Taxes.Tax }
         * 
         * 
         */
        public List<EMDType.Taxes.Tax> getTax() {
            if (tax == null) {
                tax = new ArrayList<EMDType.Taxes.Tax>();
            }
            return this.tax;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>AirTaxType">
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Tax
            extends AirTaxType
        {


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
     *         &lt;element name="CouponInfo" maxOccurs="4">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SoldFlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
     *                   &lt;choice>
     *                     &lt;element name="CheckedInAirlineRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
     *                     &lt;element name="FlownAirlineSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
     *                   &lt;/choice>
     *                   &lt;element name="ExcessBaggage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PresentInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="To" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *                           &lt;attribute name="At" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ReasonForIssuance" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReasonForIssuanceGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ValidatingAirline" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FiledFeeInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                           &lt;attribute name="BSR_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
     *                 &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
     *                 &lt;attribute name="InConnectionNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
     *                 &lt;attribute name="CouponReference" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                 &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}DateOrTimeOrDateTimeType" />
     *                 &lt;attribute name="Duration" type="{http://www.opentravel.org/OTA/2003/05}DurationType" />
     *                 &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}DateOrTimeOrDateTimeType" />
     *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
     *                 &lt;attribute name="InvoluntaryIndCode">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="I"/>
     *                       &lt;enumeration value="L"/>
     *                       &lt;enumeration value="S"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="SettlementAuthCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
     *                 &lt;attribute name="Value" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                 &lt;attribute name="AssociateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="PromotionalCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
     *                 &lt;attribute name="Remark" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *                 &lt;attribute name="TaxOnEMD_Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="AssocFareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="ConsumedAtIssuanceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="DateOfService" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
     *       &lt;attribute name="TicketDocumentNbr" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="Type">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="Ticket"/>
     *             &lt;enumeration value="EMD"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="PrimaryDocInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="InConnectionDocNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExchangeTktNbrInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "couponInfo"
    })
    public static class TicketDocument {

        @XmlElement(name = "CouponInfo", required = true)
        protected List<EMDType.TicketDocument.CouponInfo> couponInfo;
        @XmlAttribute(name = "TicketDocumentNbr", required = true)
        protected String ticketDocumentNbr;
        @XmlAttribute(name = "Type")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String type;
        @XmlAttribute(name = "PrimaryDocInd")
        protected Boolean primaryDocInd;
        @XmlAttribute(name = "InConnectionDocNbr")
        protected String inConnectionDocNbr;
        @XmlAttribute(name = "DateOfIssue")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateOfIssue;
        @XmlAttribute(name = "ExchangeTktNbrInd")
        protected Boolean exchangeTktNbrInd;
        @XmlAttribute(name = "CompanyShortName")
        protected String companyShortName;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

        /**
         * Gets the value of the couponInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couponInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCouponInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EMDType.TicketDocument.CouponInfo }
         * 
         * 
         */
        public List<EMDType.TicketDocument.CouponInfo> getCouponInfo() {
            if (couponInfo == null) {
                couponInfo = new ArrayList<EMDType.TicketDocument.CouponInfo>();
            }
            return this.couponInfo;
        }

        /**
         * Gets the value of the ticketDocumentNbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketDocumentNbr() {
            return ticketDocumentNbr;
        }

        /**
         * Sets the value of the ticketDocumentNbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketDocumentNbr(String value) {
            this.ticketDocumentNbr = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the primaryDocInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrimaryDocInd() {
            return primaryDocInd;
        }

        /**
         * Sets the value of the primaryDocInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrimaryDocInd(Boolean value) {
            this.primaryDocInd = value;
        }

        /**
         * Gets the value of the inConnectionDocNbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInConnectionDocNbr() {
            return inConnectionDocNbr;
        }

        /**
         * Sets the value of the inConnectionDocNbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInConnectionDocNbr(String value) {
            this.inConnectionDocNbr = value;
        }

        /**
         * Gets the value of the dateOfIssue property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateOfIssue() {
            return dateOfIssue;
        }

        /**
         * Sets the value of the dateOfIssue property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateOfIssue(XMLGregorianCalendar value) {
            this.dateOfIssue = value;
        }

        /**
         * Gets the value of the exchangeTktNbrInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExchangeTktNbrInd() {
            return exchangeTktNbrInd;
        }

        /**
         * Sets the value of the exchangeTktNbrInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExchangeTktNbrInd(Boolean value) {
            this.exchangeTktNbrInd = value;
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
         *       &lt;sequence>
         *         &lt;element name="SoldFlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
         *         &lt;choice>
         *           &lt;element name="CheckedInAirlineRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
         *           &lt;element name="FlownAirlineSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" minOccurs="0"/>
         *         &lt;/choice>
         *         &lt;element name="ExcessBaggage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PresentInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="To" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
         *                 &lt;attribute name="At" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ReasonForIssuance" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReasonForIssuanceGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ValidatingAirline" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="FiledFeeInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                 &lt;attribute name="BSR_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
         *       &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
         *       &lt;attribute name="InConnectionNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
         *       &lt;attribute name="CouponReference" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *       &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}DateOrTimeOrDateTimeType" />
         *       &lt;attribute name="Duration" type="{http://www.opentravel.org/OTA/2003/05}DurationType" />
         *       &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}DateOrTimeOrDateTimeType" />
         *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="CouponItinerarySeqNbr" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
         *       &lt;attribute name="InvoluntaryIndCode">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="I"/>
         *             &lt;enumeration value="L"/>
         *             &lt;enumeration value="S"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="SettlementAuthCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
         *       &lt;attribute name="Value" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *       &lt;attribute name="AssociateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="PromotionalCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
         *       &lt;attribute name="Remark" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
         *       &lt;attribute name="TaxOnEMD_Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="AssocFareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="ConsumedAtIssuanceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="DateOfService" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "soldFlightSegmentRPH",
            "checkedInAirlineRPH",
            "flownAirlineSegmentRPH",
            "excessBaggage",
            "presentInfo",
            "reasonForIssuance",
            "validatingAirline",
            "filedFeeInfo"
        })
        public static class CouponInfo {

            @XmlElement(name = "SoldFlightSegmentRPH")
            protected String soldFlightSegmentRPH;
            @XmlElement(name = "CheckedInAirlineRPH")
            protected String checkedInAirlineRPH;
            @XmlElement(name = "FlownAirlineSegmentRPH")
            protected String flownAirlineSegmentRPH;
            @XmlElement(name = "ExcessBaggage")
            protected EMDType.TicketDocument.CouponInfo.ExcessBaggage excessBaggage;
            @XmlElement(name = "PresentInfo")
            protected EMDType.TicketDocument.CouponInfo.PresentInfo presentInfo;
            @XmlElement(name = "ReasonForIssuance")
            protected EMDType.TicketDocument.CouponInfo.ReasonForIssuance reasonForIssuance;
            @XmlElement(name = "ValidatingAirline")
            protected EMDType.TicketDocument.CouponInfo.ValidatingAirline validatingAirline;
            @XmlElement(name = "FiledFeeInfo")
            protected EMDType.TicketDocument.CouponInfo.FiledFeeInfo filedFeeInfo;
            @XmlAttribute(name = "Number")
            protected Integer number;
            @XmlAttribute(name = "InConnectionNbr")
            protected Integer inConnectionNbr;
            @XmlAttribute(name = "CouponReference")
            protected String couponReference;
            @XmlAttribute(name = "FareBasisCode")
            protected String fareBasisCode;
            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "Status")
            protected String status;
            @XmlAttribute(name = "CouponItinerarySeqNbr")
            protected Integer couponItinerarySeqNbr;
            @XmlAttribute(name = "InvoluntaryIndCode")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String involuntaryIndCode;
            @XmlAttribute(name = "SettlementAuthCode")
            protected String settlementAuthCode;
            @XmlAttribute(name = "Value")
            protected BigDecimal value;
            @XmlAttribute(name = "AssociateInd")
            protected Boolean associateInd;
            @XmlAttribute(name = "PromotionalCode")
            protected String promotionalCode;
            @XmlAttribute(name = "Remark")
            protected String remark;
            @XmlAttribute(name = "TaxOnEMD_Ind")
            protected Boolean taxOnEMDInd;
            @XmlAttribute(name = "AssocFareBasisCode")
            protected String assocFareBasisCode;
            @XmlAttribute(name = "ConsumedAtIssuanceInd")
            protected Boolean consumedAtIssuanceInd;
            @XmlAttribute(name = "DateOfService")
            protected String dateOfService;
            @XmlAttribute(name = "UnitOfMeasureQuantity")
            protected BigDecimal unitOfMeasureQuantity;
            @XmlAttribute(name = "UnitOfMeasure")
            protected String unitOfMeasure;
            @XmlAttribute(name = "UnitOfMeasureCode")
            protected String unitOfMeasureCode;

            /**
             * Gets the value of the soldFlightSegmentRPH property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSoldFlightSegmentRPH() {
                return soldFlightSegmentRPH;
            }

            /**
             * Sets the value of the soldFlightSegmentRPH property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSoldFlightSegmentRPH(String value) {
                this.soldFlightSegmentRPH = value;
            }

            /**
             * Gets the value of the checkedInAirlineRPH property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckedInAirlineRPH() {
                return checkedInAirlineRPH;
            }

            /**
             * Sets the value of the checkedInAirlineRPH property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckedInAirlineRPH(String value) {
                this.checkedInAirlineRPH = value;
            }

            /**
             * Gets the value of the flownAirlineSegmentRPH property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlownAirlineSegmentRPH() {
                return flownAirlineSegmentRPH;
            }

            /**
             * Sets the value of the flownAirlineSegmentRPH property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlownAirlineSegmentRPH(String value) {
                this.flownAirlineSegmentRPH = value;
            }

            /**
             * Gets the value of the excessBaggage property.
             * 
             * @return
             *     possible object is
             *     {@link EMDType.TicketDocument.CouponInfo.ExcessBaggage }
             *     
             */
            public EMDType.TicketDocument.CouponInfo.ExcessBaggage getExcessBaggage() {
                return excessBaggage;
            }

            /**
             * Sets the value of the excessBaggage property.
             * 
             * @param value
             *     allowed object is
             *     {@link EMDType.TicketDocument.CouponInfo.ExcessBaggage }
             *     
             */
            public void setExcessBaggage(EMDType.TicketDocument.CouponInfo.ExcessBaggage value) {
                this.excessBaggage = value;
            }

            /**
             * Gets the value of the presentInfo property.
             * 
             * @return
             *     possible object is
             *     {@link EMDType.TicketDocument.CouponInfo.PresentInfo }
             *     
             */
            public EMDType.TicketDocument.CouponInfo.PresentInfo getPresentInfo() {
                return presentInfo;
            }

            /**
             * Sets the value of the presentInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link EMDType.TicketDocument.CouponInfo.PresentInfo }
             *     
             */
            public void setPresentInfo(EMDType.TicketDocument.CouponInfo.PresentInfo value) {
                this.presentInfo = value;
            }

            /**
             * Gets the value of the reasonForIssuance property.
             * 
             * @return
             *     possible object is
             *     {@link EMDType.TicketDocument.CouponInfo.ReasonForIssuance }
             *     
             */
            public EMDType.TicketDocument.CouponInfo.ReasonForIssuance getReasonForIssuance() {
                return reasonForIssuance;
            }

            /**
             * Sets the value of the reasonForIssuance property.
             * 
             * @param value
             *     allowed object is
             *     {@link EMDType.TicketDocument.CouponInfo.ReasonForIssuance }
             *     
             */
            public void setReasonForIssuance(EMDType.TicketDocument.CouponInfo.ReasonForIssuance value) {
                this.reasonForIssuance = value;
            }

            /**
             * Gets the value of the validatingAirline property.
             * 
             * @return
             *     possible object is
             *     {@link EMDType.TicketDocument.CouponInfo.ValidatingAirline }
             *     
             */
            public EMDType.TicketDocument.CouponInfo.ValidatingAirline getValidatingAirline() {
                return validatingAirline;
            }

            /**
             * Sets the value of the validatingAirline property.
             * 
             * @param value
             *     allowed object is
             *     {@link EMDType.TicketDocument.CouponInfo.ValidatingAirline }
             *     
             */
            public void setValidatingAirline(EMDType.TicketDocument.CouponInfo.ValidatingAirline value) {
                this.validatingAirline = value;
            }

            /**
             * Gets the value of the filedFeeInfo property.
             * 
             * @return
             *     possible object is
             *     {@link EMDType.TicketDocument.CouponInfo.FiledFeeInfo }
             *     
             */
            public EMDType.TicketDocument.CouponInfo.FiledFeeInfo getFiledFeeInfo() {
                return filedFeeInfo;
            }

            /**
             * Sets the value of the filedFeeInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link EMDType.TicketDocument.CouponInfo.FiledFeeInfo }
             *     
             */
            public void setFiledFeeInfo(EMDType.TicketDocument.CouponInfo.FiledFeeInfo value) {
                this.filedFeeInfo = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNumber(Integer value) {
                this.number = value;
            }

            /**
             * Gets the value of the inConnectionNbr property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getInConnectionNbr() {
                return inConnectionNbr;
            }

            /**
             * Sets the value of the inConnectionNbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setInConnectionNbr(Integer value) {
                this.inConnectionNbr = value;
            }

            /**
             * Gets the value of the couponReference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCouponReference() {
                return couponReference;
            }

            /**
             * Sets the value of the couponReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCouponReference(String value) {
                this.couponReference = value;
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
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
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
             * Gets the value of the involuntaryIndCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvoluntaryIndCode() {
                return involuntaryIndCode;
            }

            /**
             * Sets the value of the involuntaryIndCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvoluntaryIndCode(String value) {
                this.involuntaryIndCode = value;
            }

            /**
             * Gets the value of the settlementAuthCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSettlementAuthCode() {
                return settlementAuthCode;
            }

            /**
             * Sets the value of the settlementAuthCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSettlementAuthCode(String value) {
                this.settlementAuthCode = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Gets the value of the associateInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAssociateInd() {
                return associateInd;
            }

            /**
             * Sets the value of the associateInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAssociateInd(Boolean value) {
                this.associateInd = value;
            }

            /**
             * Gets the value of the promotionalCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPromotionalCode() {
                return promotionalCode;
            }

            /**
             * Sets the value of the promotionalCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPromotionalCode(String value) {
                this.promotionalCode = value;
            }

            /**
             * Gets the value of the remark property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemark() {
                return remark;
            }

            /**
             * Sets the value of the remark property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemark(String value) {
                this.remark = value;
            }

            /**
             * Gets the value of the taxOnEMDInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isTaxOnEMDInd() {
                return taxOnEMDInd;
            }

            /**
             * Sets the value of the taxOnEMDInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setTaxOnEMDInd(Boolean value) {
                this.taxOnEMDInd = value;
            }

            /**
             * Gets the value of the assocFareBasisCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssocFareBasisCode() {
                return assocFareBasisCode;
            }

            /**
             * Sets the value of the assocFareBasisCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssocFareBasisCode(String value) {
                this.assocFareBasisCode = value;
            }

            /**
             * Gets the value of the consumedAtIssuanceInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isConsumedAtIssuanceInd() {
                return consumedAtIssuanceInd;
            }

            /**
             * Sets the value of the consumedAtIssuanceInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setConsumedAtIssuanceInd(Boolean value) {
                this.consumedAtIssuanceInd = value;
            }

            /**
             * Gets the value of the dateOfService property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateOfService() {
                return dateOfService;
            }

            /**
             * Sets the value of the dateOfService property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateOfService(String value) {
                this.dateOfService = value;
            }

            /**
             * Gets the value of the unitOfMeasureQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnitOfMeasureQuantity() {
                return unitOfMeasureQuantity;
            }

            /**
             * Sets the value of the unitOfMeasureQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnitOfMeasureQuantity(BigDecimal value) {
                this.unitOfMeasureQuantity = value;
            }

            /**
             * Gets the value of the unitOfMeasure property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitOfMeasure() {
                return unitOfMeasure;
            }

            /**
             * Sets the value of the unitOfMeasure property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitOfMeasure(String value) {
                this.unitOfMeasure = value;
            }

            /**
             * Gets the value of the unitOfMeasureCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitOfMeasureCode() {
                return unitOfMeasureCode;
            }

            /**
             * Sets the value of the unitOfMeasureCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitOfMeasureCode(String value) {
                this.unitOfMeasureCode = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ExcessBaggage {

                @XmlAttribute(name = "Amount")
                protected BigDecimal amount;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "DecimalPlaces")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger decimalPlaces;
                @XmlAttribute(name = "UnitOfMeasureQuantity")
                protected BigDecimal unitOfMeasureQuantity;
                @XmlAttribute(name = "UnitOfMeasure")
                protected String unitOfMeasure;
                @XmlAttribute(name = "UnitOfMeasureCode")
                protected String unitOfMeasureCode;

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

                /**
                 * Gets the value of the unitOfMeasureQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getUnitOfMeasureQuantity() {
                    return unitOfMeasureQuantity;
                }

                /**
                 * Sets the value of the unitOfMeasureQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setUnitOfMeasureQuantity(BigDecimal value) {
                    this.unitOfMeasureQuantity = value;
                }

                /**
                 * Gets the value of the unitOfMeasure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitOfMeasure() {
                    return unitOfMeasure;
                }

                /**
                 * Sets the value of the unitOfMeasure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitOfMeasure(String value) {
                    this.unitOfMeasure = value;
                }

                /**
                 * Gets the value of the unitOfMeasureCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitOfMeasureCode() {
                    return unitOfMeasureCode;
                }

                /**
                 * Sets the value of the unitOfMeasureCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitOfMeasureCode(String value) {
                    this.unitOfMeasureCode = value;
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
             *       &lt;attribute name="BSR_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FiledFeeInfo {

                @XmlAttribute(name = "BSR_Rate")
                protected BigDecimal bsrRate;
                @XmlAttribute(name = "Amount")
                protected BigDecimal amount;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "DecimalPlaces")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger decimalPlaces;

                /**
                 * Gets the value of the bsrRate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getBSRRate() {
                    return bsrRate;
                }

                /**
                 * Sets the value of the bsrRate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setBSRRate(BigDecimal value) {
                    this.bsrRate = value;
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
             *       &lt;attribute name="To" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
             *       &lt;attribute name="At" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PresentInfo {

                @XmlAttribute(name = "To")
                protected String to;
                @XmlAttribute(name = "At")
                protected String at;

                /**
                 * Gets the value of the to property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTo() {
                    return to;
                }

                /**
                 * Sets the value of the to property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTo(String value) {
                    this.to = value;
                }

                /**
                 * Gets the value of the at property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAt() {
                    return at;
                }

                /**
                 * Sets the value of the at property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAt(String value) {
                    this.at = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReasonForIssuanceGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ReasonForIssuance {

                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "SubCode")
                protected String subCode;
                @XmlAttribute(name = "Description")
                protected String description;

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
                 * Gets the value of the subCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubCode() {
                    return subCode;
                }

                /**
                 * Sets the value of the subCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubCode(String value) {
                    this.subCode = value;
                }

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ValidatingAirline {

                @XmlAttribute(name = "CompanyShortName")
                protected String companyShortName;
                @XmlAttribute(name = "TravelSector")
                protected String travelSector;
                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;

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
     *       &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
     *       &lt;attribute name="FareAmountType" type="{http://www.opentravel.org/OTA/2003/05}FareAmountType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TotalFare {

        @XmlAttribute(name = "Purpose")
        protected PurposeType purpose;
        @XmlAttribute(name = "FareAmountType")
        protected FareAmountType fareAmountType;
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
         * Gets the value of the fareAmountType property.
         * 
         * @return
         *     possible object is
         *     {@link FareAmountType }
         *     
         */
        public FareAmountType getFareAmountType() {
            return fareAmountType;
        }

        /**
         * Sets the value of the fareAmountType property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareAmountType }
         *     
         */
        public void setFareAmountType(FareAmountType value) {
            this.fareAmountType = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerRefNumberGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TravelerRefNumber {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "SurnameRefNumber")
        protected String surnameRefNumber;

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the surnameRefNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSurnameRefNumber() {
            return surnameRefNumber;
        }

        /**
         * Sets the value of the surnameRefNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSurnameRefNumber(String value) {
            this.surnameRefNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="FareCalcMode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
     *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}PurposeType" />
     *       &lt;attribute name="ReportingCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
     *       &lt;attribute name="Info" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class UnstructuredFareCalc {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "FareCalcMode")
        protected String fareCalcMode;
        @XmlAttribute(name = "Operation")
        protected ActionType operation;
        @XmlAttribute(name = "Type")
        protected PurposeType type;
        @XmlAttribute(name = "ReportingCode")
        protected String reportingCode;
        @XmlAttribute(name = "Info", required = true)
        protected String info;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the fareCalcMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareCalcMode() {
            return fareCalcMode;
        }

        /**
         * Sets the value of the fareCalcMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareCalcMode(String value) {
            this.fareCalcMode = value;
        }

        /**
         * Gets the value of the operation property.
         * 
         * @return
         *     possible object is
         *     {@link ActionType }
         *     
         */
        public ActionType getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *     
         */
        public void setOperation(ActionType value) {
            this.operation = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link PurposeType }
         *     
         */
        public PurposeType getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurposeType }
         *     
         */
        public void setType(PurposeType value) {
            this.type = value;
        }

        /**
         * Gets the value of the reportingCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReportingCode() {
            return reportingCode;
        }

        /**
         * Sets the value of the reportingCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReportingCode(String value) {
            this.reportingCode = value;
        }

        /**
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ValidatingAirline {

        @XmlAttribute(name = "CompanyShortName")
        protected String companyShortName;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

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

}
