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
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import quickfix.FieldNotFound;


/**
 * Fix - Bithaus format component translator for TradingSessionStatusRequest
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

    public static cl.bithaus.fix.TradingSessionStatusRequest fromFix(cl.bithaus.qfix.msg.TradingSessionStatusRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.TradingSessionStatusRequest dest = new cl.bithaus.fix.TradingSessionStatusRequest();

        if(src.isSetTradSesReqID())
            dest.setTradSesReqID(src.getTradSesReqID().getValue());

        if(src.isSetTradingSessionID())
            dest.setTradingSessionID(src.getTradingSessionID().getValue());

        if(src.isSetTradingSessionSubID())
            dest.setTradingSessionSubID(src.getTradingSessionSubID().getValue());

        if(src.isSetTradSesMethod())
            dest.setTradSesMethod(src.getTradSesMethod().getValue());

        if(src.isSetTradSesMode())
            dest.setTradSesMode(src.getTradSesMode().getValue());

        if(src.isSetSubscriptionRequestType())
            dest.setSubscriptionRequestType(src.getSubscriptionRequestType().getValue()+"");

        if(src.isSetExDestination())
            dest.setExDestination(src.getExDestination().getValue());

        if(src.isSetMarketSegmentID())
            dest.setMarketSegmentID(src.getMarketSegmentID().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"


        return dest;

    }
}

