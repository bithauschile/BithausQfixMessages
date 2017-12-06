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
public class DerivativeSecurityListTranslator  {

    public static cl.bithaus.qfix.msg.DerivativeSecurityList toFix(cl.bithaus.fix.DerivativeSecurityList src) {

        cl.bithaus.qfix.msg.DerivativeSecurityList dest = new cl.bithaus.qfix.msg.DerivativeSecurityList();

        if(src.getSecurityReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityReqID(src.getSecurityReqID()));
            
        if(src.getSecurityResponseID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityResponseID(src.getSecurityResponseID()));
            
        if(src.getSecurityRequestResult() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityRequestResult(src.getSecurityRequestResult()));
            
        if(src.getTotNoRelatedSym() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNoRelatedSym(src.getTotNoRelatedSym()));
            
        if(src.getLastFragment() != null)
            dest.set(new cl.bithaus.qfix.fields.LastFragment(src.getLastFragment()));
            

        if(src.getNoRelatedSym() != null && src.getNoRelatedSym().size() > 0) {

            for(cl.bithaus.fix.DerivativeSecurityList.NoRelatedSym.NoRelatedSymEntry entry : src.getNoRelatedSym().getGroups()) {

                cl.bithaus.qfix.msg.DerivativeSecurityList.NoRelatedSym aux = 
                    new cl.bithaus.qfix.msg.DerivativeSecurityList.NoRelatedSym();

                aux.set(new cl.bithaus.qfix.fields.Currency(entry.getCurrency()));
                aux.set(new cl.bithaus.qfix.fields.ExpirationCycle(entry.getExpirationCycle()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));
                aux.set(new cl.bithaus.qfix.fields.Text(entry.getText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedTextLen(entry.getEncodedTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedText(entry.getEncodedText()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

