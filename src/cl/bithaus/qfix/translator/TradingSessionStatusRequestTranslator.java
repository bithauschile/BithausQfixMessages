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
public class TradingSessionStatusRequestTranslator  {

    public static cl.bithaus.qfix.msg.TradingSessionStatusRequest toFix(cl.bithaus.fix.TradingSessionStatusRequest src) {

        cl.bithaus.qfix.msg.TradingSessionStatusRequest dest = new cl.bithaus.qfix.msg.TradingSessionStatusRequest();

        if(src.getTradSesReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradSesReqID(src.getTradSesReqID()));
            
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
            
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
            
        if(src.getTradSesMethod() != null)
            dest.set(new cl.bithaus.qfix.fields.TradSesMethod(src.getTradSesMethod()));
            
        if(src.getTradSesMode() != null)
            dest.set(new cl.bithaus.qfix.fields.TradSesMode(src.getTradSesMode()));
            
        if(src.getSubscriptionRequestType() != null)
            if(src.getSubscriptionRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SubscriptionRequestType(src.getSubscriptionRequestType().charAt(0)));
            
        if(src.getExDestination() != null)
            dest.set(new cl.bithaus.qfix.fields.ExDestination(src.getExDestination()));
            
        if(src.getMarketSegmentID() != null)
            dest.set(new cl.bithaus.qfix.fields.MarketSegmentID(src.getMarketSegmentID()));
            


        return dest;
    }


}

