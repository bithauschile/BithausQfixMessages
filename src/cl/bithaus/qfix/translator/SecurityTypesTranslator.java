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
public class SecurityTypesTranslator  {

    public static cl.bithaus.qfix.msg.SecurityTypes toFix(cl.bithaus.fix.SecurityTypes src) {

        cl.bithaus.qfix.msg.SecurityTypes dest = new cl.bithaus.qfix.msg.SecurityTypes();

        if(src.getSecurityReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityReqID(src.getSecurityReqID()));
            
        if(src.getSecurityResponseID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityResponseID(src.getSecurityResponseID()));
            
        if(src.getSecurityResponseType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityResponseType(src.getSecurityResponseType()));
            
        if(src.getTotNoSecurityTypes() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNoSecurityTypes(src.getTotNoSecurityTypes()));
            
        if(src.getLastFragment() != null)
            dest.set(new cl.bithaus.qfix.fields.LastFragment(src.getLastFragment()));
            
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
            

        if(src.getNoSecurityTypes() != null && src.getNoSecurityTypes().size() > 0) {

            for(cl.bithaus.fix.SecurityTypes.NoSecurityTypes.NoSecurityTypesEntry entry : src.getNoSecurityTypes().getGroups()) {

                cl.bithaus.qfix.msg.SecurityTypes.NoSecurityTypes aux = 
                    new cl.bithaus.qfix.msg.SecurityTypes.NoSecurityTypes();

                aux.set(new cl.bithaus.qfix.fields.SecurityType(entry.getSecurityType()));
                aux.set(new cl.bithaus.qfix.fields.SecuritySubType(entry.getSecuritySubType()));
                aux.set(new cl.bithaus.qfix.fields.Product(entry.getProduct()));
                aux.set(new cl.bithaus.qfix.fields.CFICode(entry.getCFICode()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

