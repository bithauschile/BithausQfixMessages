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
public class RequestForPositionsTranslator  {

    public static cl.bithaus.qfix.msg.RequestForPositions toFix(cl.bithaus.fix.RequestForPositions src) {

        cl.bithaus.qfix.msg.RequestForPositions dest = new cl.bithaus.qfix.msg.RequestForPositions();

        if(src.getPosReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.PosReqID(src.getPosReqID()));
            
        if(src.getPosReqType() != null)
            dest.set(new cl.bithaus.qfix.fields.PosReqType(src.getPosReqType()));
            
        if(src.getMatchStatus() != null)
            if(src.getMatchStatus().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.MatchStatus(src.getMatchStatus().charAt(0)));
            
        if(src.getSubscriptionRequestType() != null)
            if(src.getSubscriptionRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SubscriptionRequestType(src.getSubscriptionRequestType().charAt(0)));
            
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
            
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
            
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getClearingBusinessDate() != null)
            dest.set(new cl.bithaus.qfix.fields.ClearingBusinessDate(src.getClearingBusinessDate()));
            
        if(src.getSettlSessID() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlSessID(src.getSettlSessID()));
            
        if(src.getSettlSessSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlSessSubID(src.getSettlSessSubID()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
        if(src.getResponseTransportType() != null)
            dest.set(new cl.bithaus.qfix.fields.ResponseTransportType(src.getResponseTransportType()));
            
        if(src.getResponseDestination() != null)
            dest.set(new cl.bithaus.qfix.fields.ResponseDestination(src.getResponseDestination()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.RequestForPositions.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.RequestForPositions.NoLegs aux = 
                    new cl.bithaus.qfix.msg.RequestForPositions.NoLegs();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.RequestForPositions.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.RequestForPositions.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.RequestForPositions.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoTradingSessions() != null && src.getNoTradingSessions().size() > 0) {

            for(cl.bithaus.fix.RequestForPositions.NoTradingSessions.NoTradingSessionsEntry entry : src.getNoTradingSessions().getGroups()) {

                cl.bithaus.qfix.msg.RequestForPositions.NoTradingSessions aux = 
                    new cl.bithaus.qfix.msg.RequestForPositions.NoTradingSessions();

                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

