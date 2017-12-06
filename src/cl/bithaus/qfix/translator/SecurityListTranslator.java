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
public class SecurityListTranslator  {

    public static cl.bithaus.qfix.msg.SecurityList toFix(cl.bithaus.fix.SecurityList src) {

        cl.bithaus.qfix.msg.SecurityList dest = new cl.bithaus.qfix.msg.SecurityList();

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

            for(cl.bithaus.fix.SecurityList.NoRelatedSym.NoRelatedSymEntry entry : src.getNoRelatedSym().getGroups()) {

                cl.bithaus.qfix.msg.SecurityList.NoRelatedSym aux = 
                    new cl.bithaus.qfix.msg.SecurityList.NoRelatedSym();

                aux.set(new cl.bithaus.qfix.fields.Currency(entry.getCurrency()));
                aux.set(new cl.bithaus.qfix.fields.RoundLot(entry.getRoundLot()));
                aux.set(new cl.bithaus.qfix.fields.MinTradeVol(entry.getMinTradeVol()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));
                aux.set(new cl.bithaus.qfix.fields.ExpirationCycle(entry.getExpirationCycle()));
                aux.set(new cl.bithaus.qfix.fields.Text(entry.getText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedTextLen(entry.getEncodedTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedText(entry.getEncodedText()));
                if(entry.getPresenceCategory().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.PresenceCategory(entry.getPresenceCategory().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.AutomaticCrossAuthorization(entry.getAutomaticCrossAuthorization()));
                aux.set(new cl.bithaus.qfix.fields.NumericPresence(entry.getNumericPresence().doubleValue()));
                aux.set(new cl.bithaus.qfix.fields.SerializedAuthorization(entry.getSerializedAuthorization()));
                aux.set(new cl.bithaus.qfix.fields.PriceType(entry.getPriceType()));
                aux.set(new cl.bithaus.qfix.fields.MDAdjustmentCurrency(entry.getMDAdjustmentCurrency()));
                aux.set(new cl.bithaus.qfix.fields.MDMaturity(entry.getMDMaturity()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

