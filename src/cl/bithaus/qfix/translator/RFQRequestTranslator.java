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
public class RFQRequestTranslator  {

    public static cl.bithaus.qfix.msg.RFQRequest toFix(cl.bithaus.fix.RFQRequest src) {

        cl.bithaus.qfix.msg.RFQRequest dest = new cl.bithaus.qfix.msg.RFQRequest();

        if(src.getRFQReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.RFQReqID(src.getRFQReqID()));
            
        if(src.getSubscriptionRequestType() != null)
            if(src.getSubscriptionRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SubscriptionRequestType(src.getSubscriptionRequestType().charAt(0)));
            

        if(src.getNoRelatedSym() != null && src.getNoRelatedSym().size() > 0) {

            for(cl.bithaus.fix.RFQRequest.NoRelatedSym.NoRelatedSymEntry entry : src.getNoRelatedSym().getGroups()) {

                cl.bithaus.qfix.msg.RFQRequest.NoRelatedSym aux = 
                    new cl.bithaus.qfix.msg.RFQRequest.NoRelatedSym();

                aux.set(new cl.bithaus.qfix.fields.PrevClosePx(entry.getPrevClosePx()));
                aux.set(new cl.bithaus.qfix.fields.QuoteRequestType(entry.getQuoteRequestType()));
                aux.set(new cl.bithaus.qfix.fields.QuoteType(entry.getQuoteType()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

