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
public class SecurityDefinitionTranslator  {

    public static cl.bithaus.qfix.msg.SecurityDefinition toFix(cl.bithaus.fix.SecurityDefinition src) {

        cl.bithaus.qfix.msg.SecurityDefinition dest = new cl.bithaus.qfix.msg.SecurityDefinition();

        if(src.getSecurityReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityReqID(src.getSecurityReqID()));
            
        if(src.getSecurityResponseID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityResponseID(src.getSecurityResponseID()));
            
        if(src.getSecurityResponseType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityResponseType(src.getSecurityResponseType()));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
            
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            
        if(src.getExpirationCycle() != null)
            dest.set(new cl.bithaus.qfix.fields.ExpirationCycle(src.getExpirationCycle()));
            
        if(src.getRoundLot() != null)
            dest.set(new cl.bithaus.qfix.fields.RoundLot(src.getRoundLot()));
            
        if(src.getMinTradeVol() != null)
            dest.set(new cl.bithaus.qfix.fields.MinTradeVol(src.getMinTradeVol()));
            

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.SecurityDefinition.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.SecurityDefinition.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.SecurityDefinition.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.SecurityDefinition.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.SecurityDefinition.NoLegs aux = 
                    new cl.bithaus.qfix.msg.SecurityDefinition.NoLegs();


                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

