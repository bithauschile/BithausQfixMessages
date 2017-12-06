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
public class MarketDataRequestRejectTranslator  {

    public static cl.bithaus.qfix.msg.MarketDataRequestReject toFix(cl.bithaus.fix.MarketDataRequestReject src) {

        cl.bithaus.qfix.msg.MarketDataRequestReject dest = new cl.bithaus.qfix.msg.MarketDataRequestReject();

        if(src.getMDReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.MDReqID(src.getMDReqID()));
            
        if(src.getMDReqRejReason() != null)
            if(src.getMDReqRejReason().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.MDReqRejReason(src.getMDReqRejReason().charAt(0)));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            

        if(src.getNoAltMDSource() != null && src.getNoAltMDSource().size() > 0) {

            for(cl.bithaus.fix.MarketDataRequestReject.NoAltMDSource.NoAltMDSourceEntry entry : src.getNoAltMDSource().getGroups()) {

                cl.bithaus.qfix.msg.MarketDataRequestReject.NoAltMDSource aux = 
                    new cl.bithaus.qfix.msg.MarketDataRequestReject.NoAltMDSource();

                aux.set(new cl.bithaus.qfix.fields.AltMDSourceID(entry.getAltMDSourceID()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

