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
public class QuoteStatusRequestTranslator  {

    public static cl.bithaus.qfix.msg.QuoteStatusRequest toFix(cl.bithaus.fix.QuoteStatusRequest src) {

        cl.bithaus.qfix.msg.QuoteStatusRequest dest = new cl.bithaus.qfix.msg.QuoteStatusRequest();

        if(src.getQuoteStatusReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteStatusReqID(src.getQuoteStatusReqID()));
            
        if(src.getQuoteID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteID(src.getQuoteID()));
            
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
            
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
            
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
            
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
            
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
            
        if(src.getSubscriptionRequestType() != null)
            if(src.getSubscriptionRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SubscriptionRequestType(src.getSubscriptionRequestType().charAt(0)));
            

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.QuoteStatusRequest.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.QuoteStatusRequest.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.QuoteStatusRequest.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.QuoteStatusRequest.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.QuoteStatusRequest.NoLegs aux = 
                    new cl.bithaus.qfix.msg.QuoteStatusRequest.NoLegs();


                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

