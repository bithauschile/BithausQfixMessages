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
public class TradingSessionStatusTranslator  {

    public static cl.bithaus.qfix.msg.TradingSessionStatus toFix(cl.bithaus.fix.TradingSessionStatus src) {

        cl.bithaus.qfix.msg.TradingSessionStatus dest = new cl.bithaus.qfix.msg.TradingSessionStatus();

        if(src.getTradSesReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradSesReqID(src.getTradSesReqID()));
            
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
            
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
            
        if(src.getTradSesMethod() != null)
            dest.set(new cl.bithaus.qfix.fields.TradSesMethod(src.getTradSesMethod()));
            
        if(src.getTradSesMode() != null)
            dest.set(new cl.bithaus.qfix.fields.TradSesMode(src.getTradSesMode()));
            
        if(src.getUnsolicitedIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.UnsolicitedIndicator(src.getUnsolicitedIndicator()));
            
        if(src.getTradSesStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.TradSesStatus(src.getTradSesStatus()));
            
        if(src.getTradSesStatusRejReason() != null)
            dest.set(new cl.bithaus.qfix.fields.TradSesStatusRejReason(src.getTradSesStatusRejReason()));
            
        if(src.getTradSesStartTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TradSesStartTime(src.getTradSesStartTime()));
            
        if(src.getTradSesOpenTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TradSesOpenTime(src.getTradSesOpenTime()));
            
        if(src.getTradSesPreCloseTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TradSesPreCloseTime(src.getTradSesPreCloseTime()));
            
        if(src.getTradSesCloseTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TradSesCloseTime(src.getTradSesCloseTime()));
            
        if(src.getTradSesEndTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TradSesEndTime(src.getTradSesEndTime()));
            
        if(src.getTotalVolumeTraded() != null)
            dest.set(new cl.bithaus.qfix.fields.TotalVolumeTraded(src.getTotalVolumeTraded()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            
        if(src.getExDestination() != null)
            dest.set(new cl.bithaus.qfix.fields.ExDestination(src.getExDestination()));
            
        if(src.getAuctionId() != null)
            dest.set(new cl.bithaus.qfix.fields.AuctionId(src.getAuctionId()));
            
        if(src.getMarketSegmentID() != null)
            dest.set(new cl.bithaus.qfix.fields.MarketSegmentID(src.getMarketSegmentID()));
            
        if(src.getOffersNumber() != null)
            dest.set(new cl.bithaus.qfix.fields.OffersNumber(src.getOffersNumber()));
            
        if(src.getOffersAmount() != null)
            dest.set(new cl.bithaus.qfix.fields.OffersAmount(src.getOffersAmount()));
            


        return dest;
    }


}

