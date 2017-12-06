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
public class SecurityListRequestTranslator  {

    public static cl.bithaus.qfix.msg.SecurityListRequest toFix(cl.bithaus.fix.SecurityListRequest src) {

        cl.bithaus.qfix.msg.SecurityListRequest dest = new cl.bithaus.qfix.msg.SecurityListRequest();

        if(src.getSecurityReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityReqID(src.getSecurityReqID()));
            
        if(src.getSecurityListRequestType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityListRequestType(src.getSecurityListRequestType()));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
            
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
            
        if(src.getSubscriptionRequestType() != null)
            if(src.getSubscriptionRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SubscriptionRequestType(src.getSubscriptionRequestType().charAt(0)));
            

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.SecurityListRequest.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.SecurityListRequest.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.SecurityListRequest.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.SecurityListRequest.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.SecurityListRequest.NoLegs aux = 
                    new cl.bithaus.qfix.msg.SecurityListRequest.NoLegs();


                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}
