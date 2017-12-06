/*
 * Copyright (c) BitHaus Software Factory & Boutique (Chile)
 * All rights reserved. www.bithaus.cl.
 * 
 * All rights to this product are owned by BitHaus Chile and may only by used 
 * under the terms of its associated license document. 
 * You may NOT copy, modify, sublicense or distribute this source file or 
 * portions of it unless previously authorized by writing by BitHaus Chile.
 * In any event, this notice must always be included verbatim with this file.
 * 
 */

package cl.bithaus.qfix.translator.component;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import quickfix.FieldNotFound;


/**
 * Fix - Bithaus format component translator for Instrument
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class InstrumentTranslator  {

    public static cl.bithaus.qfix.msg.component.Instrument toFix(cl.bithaus.fix.components.Instrument src) {

        cl.bithaus.qfix.msg.component.Instrument dest = new cl.bithaus.qfix.msg.component.Instrument();

        if(src.getSymbol() != null)
            dest.set(new cl.bithaus.qfix.fields.Symbol(src.getSymbol()));
            
        if(src.getSymbolSfx() != null)
            dest.set(new cl.bithaus.qfix.fields.SymbolSfx(src.getSymbolSfx()));
            
        if(src.getSecurityID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityID(src.getSecurityID()));
            
        if(src.getSecurityIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityIDSource(src.getSecurityIDSource()));
            
        if(src.getProduct() != null)
            dest.set(new cl.bithaus.qfix.fields.Product(src.getProduct()));
            
        if(src.getCFICode() != null)
            dest.set(new cl.bithaus.qfix.fields.CFICode(src.getCFICode()));
            
        if(src.getSecurityType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityType(src.getSecurityType()));
            
        if(src.getSecuritySubType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecuritySubType(src.getSecuritySubType()));
            
        if(src.getMaturityMonthYear() != null)
            dest.set(new cl.bithaus.qfix.fields.MaturityMonthYear(src.getMaturityMonthYear()));
            
        if(src.getMaturityDate() != null)
            dest.set(new cl.bithaus.qfix.fields.MaturityDate(src.getMaturityDate()));
            
        if(src.getCouponPaymentDate() != null)
            dest.set(new cl.bithaus.qfix.fields.CouponPaymentDate(src.getCouponPaymentDate()));
            
        if(src.getIssueDate() != null)
            dest.set(new cl.bithaus.qfix.fields.IssueDate(src.getIssueDate()));
            
        if(src.getRepoCollateralSecurityType() != null)
            dest.set(new cl.bithaus.qfix.fields.RepoCollateralSecurityType(src.getRepoCollateralSecurityType()));
            
        if(src.getRepurchaseTerm() != null)
            dest.set(new cl.bithaus.qfix.fields.RepurchaseTerm(src.getRepurchaseTerm()));
            
        if(src.getRepurchaseRate() != null)
            dest.set(new cl.bithaus.qfix.fields.RepurchaseRate(src.getRepurchaseRate().doubleValue()));
            
        if(src.getFactor() != null)
            dest.set(new cl.bithaus.qfix.fields.Factor(src.getFactor().floatValue()));
            
        if(src.getCreditRating() != null)
            dest.set(new cl.bithaus.qfix.fields.CreditRating(src.getCreditRating()));
            
        if(src.getInstrRegistry() != null)
            dest.set(new cl.bithaus.qfix.fields.InstrRegistry(src.getInstrRegistry()));
            
        if(src.getCountryOfIssue() != null)
            dest.set(new cl.bithaus.qfix.fields.CountryOfIssue(src.getCountryOfIssue()));
            
        if(src.getStateOrProvinceOfIssue() != null)
            dest.set(new cl.bithaus.qfix.fields.StateOrProvinceOfIssue(src.getStateOrProvinceOfIssue()));
            
        if(src.getLocaleOfIssue() != null)
            dest.set(new cl.bithaus.qfix.fields.LocaleOfIssue(src.getLocaleOfIssue()));
            
        if(src.getRedemptionDate() != null)
            dest.set(new cl.bithaus.qfix.fields.RedemptionDate(src.getRedemptionDate()));
            
        if(src.getStrikePrice() != null)
            dest.set(new cl.bithaus.qfix.fields.StrikePrice(src.getStrikePrice()));
            
        if(src.getStrikeCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.StrikeCurrency(src.getStrikeCurrency()));
            
        if(src.getOptAttribute() != null)
            if(src.getOptAttribute().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.OptAttribute(src.getOptAttribute().charAt(0)));
            
        if(src.getContractMultiplier() != null)
            dest.set(new cl.bithaus.qfix.fields.ContractMultiplier(src.getContractMultiplier().floatValue()));
            
        if(src.getCouponRate() != null)
            dest.set(new cl.bithaus.qfix.fields.CouponRate(src.getCouponRate().doubleValue()));
            
        if(src.getSecurityExchange() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityExchange(src.getSecurityExchange()));
            
        if(src.getIssuer() != null)
            dest.set(new cl.bithaus.qfix.fields.Issuer(src.getIssuer()));
            
        if(src.getEncodedIssuerLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedIssuerLen(src.getEncodedIssuerLen()));
            
        if(src.getEncodedIssuer() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedIssuer(src.getEncodedIssuer()));
            
        if(src.getSecurityDesc() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityDesc(src.getSecurityDesc()));
            
        if(src.getEncodedSecurityDescLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedSecurityDescLen(src.getEncodedSecurityDescLen()));
            
        if(src.getEncodedSecurityDesc() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedSecurityDesc(src.getEncodedSecurityDesc()));
            
        if(src.getPool() != null)
            dest.set(new cl.bithaus.qfix.fields.Pool(src.getPool()));
            
        if(src.getContractSettlMonth() != null)
            dest.set(new cl.bithaus.qfix.fields.ContractSettlMonth(src.getContractSettlMonth()));
            
        if(src.getCPProgram() != null)
            dest.set(new cl.bithaus.qfix.fields.CPProgram(src.getCPProgram()));
            
        if(src.getCPRegType() != null)
            dest.set(new cl.bithaus.qfix.fields.CPRegType(src.getCPRegType()));
            
        if(src.getDatedDate() != null)
            dest.set(new cl.bithaus.qfix.fields.DatedDate(src.getDatedDate()));
            
        if(src.getInterestAccrualDate() != null)
            dest.set(new cl.bithaus.qfix.fields.InterestAccrualDate(src.getInterestAccrualDate()));
            
        if(src.getFamily() != null)
            dest.set(new cl.bithaus.qfix.fields.Family(src.getFamily()));
            
        if(src.getSplitFactor() != null)
            dest.set(new cl.bithaus.qfix.fields.SplitFactor(src.getSplitFactor()));
            
        if(src.getBolson() != null)
            dest.set(new cl.bithaus.qfix.fields.Bolson(src.getBolson()));
            
        if(src.getPaymentCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.PaymentCurrency(src.getPaymentCurrency()));
            
        if(src.getAdjustmentCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.AdjustmentCurrency(src.getAdjustmentCurrency()));
            
        if(src.getMinCut() != null)
            dest.set(new cl.bithaus.qfix.fields.MinCut(src.getMinCut()));
            
        if(src.getIssueAmount() != null)
            dest.set(new cl.bithaus.qfix.fields.IssueAmount(src.getIssueAmount()));
            
        if(src.getRiskIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.RiskIndicator(src.getRiskIndicator()));
            
        if(src.getFixedIncomePriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.FixedIncomePriceType(src.getFixedIncomePriceType()));
            
        if(src.getInstrumentRisk() != null)
            dest.set(new cl.bithaus.qfix.fields.InstrumentRisk(src.getInstrumentRisk()));
            
        if(src.getInstrumentType() != null)
            dest.set(new cl.bithaus.qfix.fields.InstrumentType(src.getInstrumentType()));
            

        if(src.getNoSecurityAltID() != null && src.getNoSecurityAltID().size() > 0) {

            for(cl.bithaus.fix.components.Instrument.NoSecurityAltID.NoSecurityAltIDEntry entry : src.getNoSecurityAltID().getGroups()) {

                cl.bithaus.qfix.msg.component.Instrument.NoSecurityAltID aux = 
                    new cl.bithaus.qfix.msg.component.Instrument.NoSecurityAltID();

                aux.set(new cl.bithaus.qfix.fields.SecurityAltID(entry.getSecurityAltID()));
                aux.set(new cl.bithaus.qfix.fields.SecurityAltIDSource(entry.getSecurityAltIDSource()));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoEvents() != null && src.getNoEvents().size() > 0) {

            for(cl.bithaus.fix.components.Instrument.NoEvents.NoEventsEntry entry : src.getNoEvents().getGroups()) {

                cl.bithaus.qfix.msg.component.Instrument.NoEvents aux = 
                    new cl.bithaus.qfix.msg.component.Instrument.NoEvents();

                aux.set(new cl.bithaus.qfix.fields.EventType(entry.getEventType()));
                aux.set(new cl.bithaus.qfix.fields.EventDate(entry.getEventDate()));
                aux.set(new cl.bithaus.qfix.fields.EventPx(entry.getEventPx()));
                aux.set(new cl.bithaus.qfix.fields.EventText(entry.getEventText()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }

    public static cl.bithaus.fix.components.Instrument fromFix(cl.bithaus.qfix.msg.component.Instrument src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.Instrument dest = new cl.bithaus.fix.components.Instrument();

        if(src.isSetSymbol())
            dest.setSymbol(src.getSymbol().getValue());
            
        if(src.isSetSymbolSfx())
            dest.setSymbolSfx(src.getSymbolSfx().getValue());
            
        if(src.isSetSecurityID())
            dest.setSecurityID(src.getSecurityID().getValue());
            
        if(src.isSetSecurityIDSource())
            dest.setSecurityIDSource(src.getSecurityIDSource().getValue());
            
        if(src.isSetProduct())
            dest.setProduct(src.getProduct().getValue());
            
        if(src.isSetCFICode())
            dest.setCFICode(src.getCFICode().getValue());
            
        if(src.isSetSecurityType())
            dest.setSecurityType(src.getSecurityType().getValue());
            
        if(src.isSetSecuritySubType())
            dest.setSecuritySubType(src.getSecuritySubType().getValue());
            
        if(src.isSetMaturityMonthYear())
            dest.setMaturityMonthYear(src.getMaturityMonthYear().getValue());
            
        if(src.isSetMaturityDate())
            dest.setMaturityDate(src.getMaturityDate().getValue());
            
        if(src.isSetCouponPaymentDate())
            dest.setCouponPaymentDate(src.getCouponPaymentDate().getValue());
            
        if(src.isSetIssueDate())
            dest.setIssueDate(src.getIssueDate().getValue());
            
        if(src.isSetRepoCollateralSecurityType())
            dest.setRepoCollateralSecurityType(src.getRepoCollateralSecurityType().getValue());
            
        if(src.isSetRepurchaseTerm())
            dest.setRepurchaseTerm(src.getRepurchaseTerm().getValue());
            
        if(src.isSetRepurchaseRate())
            dest.setRepurchaseRate(new BigDecimal(src.getRepurchaseRate().getValue()));
            
        if(src.isSetFactor())
            dest.setFactor(new BigDecimal(src.getFactor().getValue()));
            
        if(src.isSetCreditRating())
            dest.setCreditRating(src.getCreditRating().getValue());
            
        if(src.isSetInstrRegistry())
            dest.setInstrRegistry(src.getInstrRegistry().getValue());
            
        if(src.isSetCountryOfIssue())
            dest.setCountryOfIssue(src.getCountryOfIssue().getValue());
            
        if(src.isSetStateOrProvinceOfIssue())
            dest.setStateOrProvinceOfIssue(src.getStateOrProvinceOfIssue().getValue());
            
        if(src.isSetLocaleOfIssue())
            dest.setLocaleOfIssue(src.getLocaleOfIssue().getValue());
            
        if(src.isSetRedemptionDate())
            dest.setRedemptionDate(src.getRedemptionDate().getValue());
            
        if(src.isSetStrikePrice())
            dest.setStrikePrice(src.getStrikePrice().getValue());
            
        if(src.isSetStrikeCurrency())
            dest.setStrikeCurrency(src.getStrikeCurrency().getValue());
            
        if(src.isSetOptAttribute())
            dest.setOptAttribute(src.getOptAttribute().getValue()+"");
            
        if(src.isSetContractMultiplier())
            dest.setContractMultiplier(new BigDecimal(src.getContractMultiplier().getValue()));
            
        if(src.isSetCouponRate())
            dest.setCouponRate(new BigDecimal(src.getCouponRate().getValue()));
            
        if(src.isSetSecurityExchange())
            dest.setSecurityExchange(src.getSecurityExchange().getValue());
            
        if(src.isSetIssuer())
            dest.setIssuer(src.getIssuer().getValue());
            
        if(src.isSetEncodedIssuerLen())
            dest.setEncodedIssuerLen(src.getEncodedIssuerLen().getValue());
            
        if(src.isSetEncodedIssuer())
            dest.setEncodedIssuer(src.getEncodedIssuer().getValue());
            
        if(src.isSetSecurityDesc())
            dest.setSecurityDesc(src.getSecurityDesc().getValue());
            
        if(src.isSetEncodedSecurityDescLen())
            dest.setEncodedSecurityDescLen(src.getEncodedSecurityDescLen().getValue());
            
        if(src.isSetEncodedSecurityDesc())
            dest.setEncodedSecurityDesc(src.getEncodedSecurityDesc().getValue());
            
        if(src.isSetPool())
            dest.setPool(src.getPool().getValue());
            
        if(src.isSetContractSettlMonth())
            dest.setContractSettlMonth(src.getContractSettlMonth().getValue());
            
        if(src.isSetCPProgram())
            dest.setCPProgram(src.getCPProgram().getValue());
            
        if(src.isSetCPRegType())
            dest.setCPRegType(src.getCPRegType().getValue());
            
        if(src.isSetDatedDate())
            dest.setDatedDate(src.getDatedDate().getValue());
            
        if(src.isSetInterestAccrualDate())
            dest.setInterestAccrualDate(src.getInterestAccrualDate().getValue());
            
        if(src.isSetFamily())
            dest.setFamily(src.getFamily().getValue());
            
        if(src.isSetSplitFactor())
            dest.setSplitFactor(src.getSplitFactor().getValue());
            
        if(src.isSetBolson())
            dest.setBolson(src.getBolson().getValue());
            
        if(src.isSetPaymentCurrency())
            dest.setPaymentCurrency(src.getPaymentCurrency().getValue());
            
        if(src.isSetAdjustmentCurrency())
            dest.setAdjustmentCurrency(src.getAdjustmentCurrency().getValue());
            
        if(src.isSetMinCut())
            dest.setMinCut(src.getMinCut().getValue());
            
        if(src.isSetIssueAmount())
            dest.setIssueAmount(src.getIssueAmount().getValue());
            
        if(src.isSetRiskIndicator())
            dest.setRiskIndicator(src.getRiskIndicator().getValue());
            
        if(src.isSetFixedIncomePriceType())
            dest.setFixedIncomePriceType(src.getFixedIncomePriceType().getValue());
            
        if(src.isSetInstrumentRisk())
            dest.setInstrumentRisk(src.getInstrumentRisk().getValue());
            
        if(src.isSetInstrumentType())
            dest.setInstrumentType(src.getInstrumentType().getValue());
            


        if(src.isSetNoSecurityAltID()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoSecurityAltID().getField());
            List<cl.bithaus.fix.components.Instrument.NoSecurityAltID.NoSecurityAltIDEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.SecurityAltID securityAltID = new cl.bithaus.qfix.fields.SecurityAltID();
            cl.bithaus.qfix.fields.SecurityAltIDSource securityAltIDSource = new cl.bithaus.qfix.fields.SecurityAltIDSource();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.Instrument.NoSecurityAltID.NoSecurityAltIDEntry entry = 
                    new cl.bithaus.fix.components.Instrument.NoSecurityAltID.NoSecurityAltIDEntry();

                if(g.isSetField(securityAltID)) {
                    securityAltID = (cl.bithaus.qfix.fields.SecurityAltID) g.getField(securityAltID);
                    entry.setSecurityAltID(securityAltID.getValue());

                }
                if(g.isSetField(securityAltIDSource)) {
                    securityAltIDSource = (cl.bithaus.qfix.fields.SecurityAltIDSource) g.getField(securityAltIDSource);
                    entry.setSecurityAltIDSource(securityAltIDSource.getValue());

                }

                result.add(entry);                
            }

 
        }
        if(src.isSetNoEvents()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoEvents().getField());
            List<cl.bithaus.fix.components.Instrument.NoEvents.NoEventsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.EventType eventType = new cl.bithaus.qfix.fields.EventType();
            cl.bithaus.qfix.fields.EventDate eventDate = new cl.bithaus.qfix.fields.EventDate();
            cl.bithaus.qfix.fields.EventPx eventPx = new cl.bithaus.qfix.fields.EventPx();
            cl.bithaus.qfix.fields.EventText eventText = new cl.bithaus.qfix.fields.EventText();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.Instrument.NoEvents.NoEventsEntry entry = 
                    new cl.bithaus.fix.components.Instrument.NoEvents.NoEventsEntry();

                if(g.isSetField(eventType)) {
                    eventType = (cl.bithaus.qfix.fields.EventType) g.getField(eventType);
                    entry.setEventType(eventType.getValue());

                }
                if(g.isSetField(eventDate)) {
                    eventDate = (cl.bithaus.qfix.fields.EventDate) g.getField(eventDate);
                    entry.setEventDate(eventDate.getValue());

                }
                if(g.isSetField(eventPx)) {
                    eventPx = (cl.bithaus.qfix.fields.EventPx) g.getField(eventPx);
                    entry.setEventPx(eventPx.getValue());

                }
                if(g.isSetField(eventText)) {
                    eventText = (cl.bithaus.qfix.fields.EventText) g.getField(eventText);
                    entry.setEventText(eventText.getValue());

                }

                result.add(entry);                
            }

 
        }

        return dest;

    }
}

