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

/**
 * Fix Components Class
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


}

