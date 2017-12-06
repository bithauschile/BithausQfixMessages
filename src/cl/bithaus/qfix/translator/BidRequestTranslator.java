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
public class BidRequestTranslator  {

    public static cl.bithaus.qfix.msg.BidRequest toFix(cl.bithaus.fix.BidRequest src) {

        cl.bithaus.qfix.msg.BidRequest dest = new cl.bithaus.qfix.msg.BidRequest();

        if(src.getBidID() != null)
            dest.set(new cl.bithaus.qfix.fields.BidID(src.getBidID()));
            
        if(src.getClientBidID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClientBidID(src.getClientBidID()));
            
        if(src.getBidRequestTransType() != null)
            if(src.getBidRequestTransType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.BidRequestTransType(src.getBidRequestTransType().charAt(0)));
            
        if(src.getListName() != null)
            dest.set(new cl.bithaus.qfix.fields.ListName(src.getListName()));
            
        if(src.getTotNoRelatedSym() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNoRelatedSym(src.getTotNoRelatedSym()));
            
        if(src.getBidType() != null)
            dest.set(new cl.bithaus.qfix.fields.BidType(src.getBidType()));
            
        if(src.getNumTickets() != null)
            dest.set(new cl.bithaus.qfix.fields.NumTickets(src.getNumTickets()));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getSideValue1() != null)
            dest.set(new cl.bithaus.qfix.fields.SideValue1(src.getSideValue1()));
            
        if(src.getSideValue2() != null)
            dest.set(new cl.bithaus.qfix.fields.SideValue2(src.getSideValue2()));
            
        if(src.getLiquidityIndType() != null)
            dest.set(new cl.bithaus.qfix.fields.LiquidityIndType(src.getLiquidityIndType()));
            
        if(src.getWtAverageLiquidity() != null)
            dest.set(new cl.bithaus.qfix.fields.WtAverageLiquidity(src.getWtAverageLiquidity().doubleValue()));
            
        if(src.getExchangeForPhysical() != null)
            dest.set(new cl.bithaus.qfix.fields.ExchangeForPhysical(src.getExchangeForPhysical()));
            
        if(src.getOutMainCntryUIndex() != null)
            dest.set(new cl.bithaus.qfix.fields.OutMainCntryUIndex(src.getOutMainCntryUIndex()));
            
        if(src.getCrossPercent() != null)
            dest.set(new cl.bithaus.qfix.fields.CrossPercent(src.getCrossPercent().doubleValue()));
            
        if(src.getProgRptReqs() != null)
            dest.set(new cl.bithaus.qfix.fields.ProgRptReqs(src.getProgRptReqs()));
            
        if(src.getProgPeriodInterval() != null)
            dest.set(new cl.bithaus.qfix.fields.ProgPeriodInterval(src.getProgPeriodInterval()));
            
        if(src.getIncTaxInd() != null)
            dest.set(new cl.bithaus.qfix.fields.IncTaxInd(src.getIncTaxInd()));
            
        if(src.getForexReq() != null)
            dest.set(new cl.bithaus.qfix.fields.ForexReq(src.getForexReq()));
            
        if(src.getNumBidders() != null)
            dest.set(new cl.bithaus.qfix.fields.NumBidders(src.getNumBidders()));
            
        if(src.getTradeDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeDate(src.getTradeDate()));
            
        if(src.getBidTradeType() != null)
            if(src.getBidTradeType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.BidTradeType(src.getBidTradeType().charAt(0)));
            
        if(src.getBasisPxType() != null)
            if(src.getBasisPxType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.BasisPxType(src.getBasisPxType().charAt(0)));
            
        if(src.getStrikeTime() != null)
            dest.set(new cl.bithaus.qfix.fields.StrikeTime(src.getStrikeTime()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            

        if(src.getNoBidDescriptors() != null && src.getNoBidDescriptors().size() > 0) {

            for(cl.bithaus.fix.BidRequest.NoBidDescriptors.NoBidDescriptorsEntry entry : src.getNoBidDescriptors().getGroups()) {

                cl.bithaus.qfix.msg.BidRequest.NoBidDescriptors aux = 
                    new cl.bithaus.qfix.msg.BidRequest.NoBidDescriptors();

                aux.set(new cl.bithaus.qfix.fields.BidDescriptorType(entry.getBidDescriptorType()));
                aux.set(new cl.bithaus.qfix.fields.BidDescriptor(entry.getBidDescriptor()));
                aux.set(new cl.bithaus.qfix.fields.SideValueInd(entry.getSideValueInd()));
                aux.set(new cl.bithaus.qfix.fields.LiquidityValue(entry.getLiquidityValue()));
                aux.set(new cl.bithaus.qfix.fields.LiquidityNumSecurities(entry.getLiquidityNumSecurities()));
                aux.set(new cl.bithaus.qfix.fields.LiquidityPctLow(entry.getLiquidityPctLow().doubleValue()));
                aux.set(new cl.bithaus.qfix.fields.LiquidityPctHigh(entry.getLiquidityPctHigh().doubleValue()));
                aux.set(new cl.bithaus.qfix.fields.EFPTrackingError(entry.getEFPTrackingError().doubleValue()));
                aux.set(new cl.bithaus.qfix.fields.FairValue(entry.getFairValue()));
                aux.set(new cl.bithaus.qfix.fields.OutsideIndexPct(entry.getOutsideIndexPct().doubleValue()));
                aux.set(new cl.bithaus.qfix.fields.ValueOfFutures(entry.getValueOfFutures()));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoBidComponents() != null && src.getNoBidComponents().size() > 0) {

            for(cl.bithaus.fix.BidRequest.NoBidComponents.NoBidComponentsEntry entry : src.getNoBidComponents().getGroups()) {

                cl.bithaus.qfix.msg.BidRequest.NoBidComponents aux = 
                    new cl.bithaus.qfix.msg.BidRequest.NoBidComponents();

                aux.set(new cl.bithaus.qfix.fields.ListID(entry.getListID()));
                if(entry.getSide().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Side(entry.getSide().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));
                aux.set(new cl.bithaus.qfix.fields.NetGrossInd(entry.getNetGrossInd()));
                if(entry.getSettlType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.SettlType(entry.getSettlType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.SettlDate(entry.getSettlDate()));
                aux.set(new cl.bithaus.qfix.fields.Account(entry.getAccount()));
                aux.set(new cl.bithaus.qfix.fields.AcctIDSource(entry.getAcctIDSource()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

