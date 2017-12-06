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

package cl.bithaus.qfix.translator;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class QuoteTranslator  {

    public static cl.bithaus.qfix.msg.Quote toFix(cl.bithaus.fix.Quote src) {

        cl.bithaus.qfix.msg.Quote dest = new cl.bithaus.qfix.msg.Quote();

        if(src.getQuoteReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteReqID(src.getQuoteReqID()));
            
        if(src.getQuoteID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteID(src.getQuoteID()));
            
        if(src.getQuoteRespID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteRespID(src.getQuoteRespID()));
            
        if(src.getQuoteType() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteType(src.getQuoteType()));
            
        if(src.getQuoteResponseLevel() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteResponseLevel(src.getQuoteResponseLevel()));
            
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
            
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
            
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
            
        if(src.getSettlType() != null)
            if(src.getSettlType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SettlType(src.getSettlType().charAt(0)));
            
        if(src.getSettlDate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlDate(src.getSettlDate()));
            
        if(src.getSettlDate2() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlDate2(src.getSettlDate2()));
            
        if(src.getOrderQty2() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderQty2(src.getOrderQty2()));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
            
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
            
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
            
        if(src.getBidPx() != null)
            dest.set(new cl.bithaus.qfix.fields.BidPx(src.getBidPx()));
            
        if(src.getOfferPx() != null)
            dest.set(new cl.bithaus.qfix.fields.OfferPx(src.getOfferPx()));
            
        if(src.getMktBidPx() != null)
            dest.set(new cl.bithaus.qfix.fields.MktBidPx(src.getMktBidPx()));
            
        if(src.getMktOfferPx() != null)
            dest.set(new cl.bithaus.qfix.fields.MktOfferPx(src.getMktOfferPx()));
            
        if(src.getMinBidSize() != null)
            dest.set(new cl.bithaus.qfix.fields.MinBidSize(src.getMinBidSize()));
            
        if(src.getBidSize() != null)
            dest.set(new cl.bithaus.qfix.fields.BidSize(src.getBidSize()));
            
        if(src.getMinOfferSize() != null)
            dest.set(new cl.bithaus.qfix.fields.MinOfferSize(src.getMinOfferSize()));
            
        if(src.getOfferSize() != null)
            dest.set(new cl.bithaus.qfix.fields.OfferSize(src.getOfferSize()));
            
        if(src.getValidUntilTime() != null)
            dest.set(new cl.bithaus.qfix.fields.ValidUntilTime(src.getValidUntilTime()));
            
        if(src.getBidSpotRate() != null)
            dest.set(new cl.bithaus.qfix.fields.BidSpotRate(src.getBidSpotRate()));
            
        if(src.getOfferSpotRate() != null)
            dest.set(new cl.bithaus.qfix.fields.OfferSpotRate(src.getOfferSpotRate()));
            
        if(src.getBidForwardPoints() != null)
            dest.set(new cl.bithaus.qfix.fields.BidForwardPoints(src.getBidForwardPoints()));
            
        if(src.getOfferForwardPoints() != null)
            dest.set(new cl.bithaus.qfix.fields.OfferForwardPoints(src.getOfferForwardPoints()));
            
        if(src.getMidPx() != null)
            dest.set(new cl.bithaus.qfix.fields.MidPx(src.getMidPx()));
            
        if(src.getBidYield() != null)
            dest.set(new cl.bithaus.qfix.fields.BidYield(src.getBidYield().doubleValue()));
            
        if(src.getMidYield() != null)
            dest.set(new cl.bithaus.qfix.fields.MidYield(src.getMidYield().doubleValue()));
            
        if(src.getOfferYield() != null)
            dest.set(new cl.bithaus.qfix.fields.OfferYield(src.getOfferYield().doubleValue()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
        if(src.getOrdType() != null)
            if(src.getOrdType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.OrdType(src.getOrdType().charAt(0)));
            
        if(src.getBidForwardPoints2() != null)
            dest.set(new cl.bithaus.qfix.fields.BidForwardPoints2(src.getBidForwardPoints2()));
            
        if(src.getOfferForwardPoints2() != null)
            dest.set(new cl.bithaus.qfix.fields.OfferForwardPoints2(src.getOfferForwardPoints2()));
            
        if(src.getSettlCurrBidFxRate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlCurrBidFxRate(src.getSettlCurrBidFxRate().floatValue()));
            
        if(src.getSettlCurrOfferFxRate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlCurrOfferFxRate(src.getSettlCurrOfferFxRate().floatValue()));
            
        if(src.getSettlCurrFxRateCalc() != null)
            if(src.getSettlCurrFxRateCalc().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SettlCurrFxRateCalc(src.getSettlCurrFxRateCalc().charAt(0)));
            
        if(src.getCommType() != null)
            if(src.getCommType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.CommType(src.getCommType().charAt(0)));
            
        if(src.getCommission() != null)
            dest.set(new cl.bithaus.qfix.fields.Commission(src.getCommission()));
            
        if(src.getCustOrderCapacity() != null)
            dest.set(new cl.bithaus.qfix.fields.CustOrderCapacity(src.getCustOrderCapacity()));
            
        if(src.getExDestination() != null)
            dest.set(new cl.bithaus.qfix.fields.ExDestination(src.getExDestination()));
            
        if(src.getOrderCapacity() != null)
            if(src.getOrderCapacity().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.OrderCapacity(src.getOrderCapacity().charAt(0)));
            
        if(src.getPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.PriceType(src.getPriceType()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            

        if(src.getNoQuoteQualifiers() != null && src.getNoQuoteQualifiers().size() > 0) {

            for(cl.bithaus.fix.Quote.NoQuoteQualifiers.NoQuoteQualifiersEntry entry : src.getNoQuoteQualifiers().getGroups()) {

                cl.bithaus.qfix.msg.Quote.NoQuoteQualifiers aux = 
                    new cl.bithaus.qfix.msg.Quote.NoQuoteQualifiers();

                if(entry.getQuoteQualifier().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.QuoteQualifier(entry.getQuoteQualifier().charAt(0)));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.Quote.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.Quote.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.Quote.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.Quote.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.Quote.NoLegs aux = 
                    new cl.bithaus.qfix.msg.Quote.NoLegs();

                aux.set(new cl.bithaus.qfix.fields.LegQty(entry.getLegQty()));
                aux.set(new cl.bithaus.qfix.fields.LegSwapType(entry.getLegSwapType()));
                if(entry.getLegSettlType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.LegSettlType(entry.getLegSettlType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.LegSettlDate(entry.getLegSettlDate()));
                aux.set(new cl.bithaus.qfix.fields.LegPriceType(entry.getLegPriceType()));
                aux.set(new cl.bithaus.qfix.fields.LegBidPx(entry.getLegBidPx()));
                aux.set(new cl.bithaus.qfix.fields.LegOfferPx(entry.getLegOfferPx()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

