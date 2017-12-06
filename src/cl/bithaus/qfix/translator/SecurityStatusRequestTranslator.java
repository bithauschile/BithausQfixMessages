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
public class SecurityStatusRequestTranslator  {

    public static cl.bithaus.qfix.msg.SecurityStatusRequest toFix(cl.bithaus.fix.SecurityStatusRequest src) {

        cl.bithaus.qfix.msg.SecurityStatusRequest dest = new cl.bithaus.qfix.msg.SecurityStatusRequest();

        if(src.getSecurityStatusReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityStatusReqID(src.getSecurityStatusReqID()));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getSubscriptionRequestType() != null)
            if(src.getSubscriptionRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SubscriptionRequestType(src.getSubscriptionRequestType().charAt(0)));
            
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
            
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
            

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.SecurityStatusRequest.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.SecurityStatusRequest.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.SecurityStatusRequest.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.SecurityStatusRequest.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.SecurityStatusRequest.NoLegs aux = 
                    new cl.bithaus.qfix.msg.SecurityStatusRequest.NoLegs();


                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

