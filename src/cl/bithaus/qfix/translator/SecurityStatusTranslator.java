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
public class SecurityStatusTranslator  {

    public static cl.bithaus.qfix.msg.SecurityStatus toFix(cl.bithaus.fix.SecurityStatus src) {

        cl.bithaus.qfix.msg.SecurityStatus dest = new cl.bithaus.qfix.msg.SecurityStatus();

        if(src.getSecurityStatusReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityStatusReqID(src.getSecurityStatusReqID()));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
            
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
            
        if(src.getUnsolicitedIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.UnsolicitedIndicator(src.getUnsolicitedIndicator()));
            
        if(src.getSecurityTradingStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityTradingStatus(src.getSecurityTradingStatus()));
            
        if(src.getFinancialStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.FinancialStatus(src.getFinancialStatus()));
            
        if(src.getCorporateAction() != null)
            dest.set(new cl.bithaus.qfix.fields.CorporateAction(src.getCorporateAction()));
            
        if(src.getHaltReason() != null)
            if(src.getHaltReason().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.HaltReason(src.getHaltReason().charAt(0)));
            
        if(src.getInViewOfCommon() != null)
            dest.set(new cl.bithaus.qfix.fields.InViewOfCommon(src.getInViewOfCommon()));
            
        if(src.getDueToRelated() != null)
            dest.set(new cl.bithaus.qfix.fields.DueToRelated(src.getDueToRelated()));
            
        if(src.getBuyVolume() != null)
            dest.set(new cl.bithaus.qfix.fields.BuyVolume(src.getBuyVolume()));
            
        if(src.getSellVolume() != null)
            dest.set(new cl.bithaus.qfix.fields.SellVolume(src.getSellVolume()));
            
        if(src.getHighPx() != null)
            dest.set(new cl.bithaus.qfix.fields.HighPx(src.getHighPx()));
            
        if(src.getLowPx() != null)
            dest.set(new cl.bithaus.qfix.fields.LowPx(src.getLowPx()));
            
        if(src.getLastPx() != null)
            dest.set(new cl.bithaus.qfix.fields.LastPx(src.getLastPx()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
        if(src.getAdjustment() != null)
            dest.set(new cl.bithaus.qfix.fields.Adjustment(src.getAdjustment()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.SecurityStatus.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.SecurityStatus.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.SecurityStatus.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.SecurityStatus.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.SecurityStatus.NoLegs aux = 
                    new cl.bithaus.qfix.msg.SecurityStatus.NoLegs();


                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

