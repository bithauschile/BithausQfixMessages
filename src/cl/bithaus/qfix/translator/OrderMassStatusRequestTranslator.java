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
public class OrderMassStatusRequestTranslator  {

    public static cl.bithaus.qfix.msg.OrderMassStatusRequest toFix(cl.bithaus.fix.OrderMassStatusRequest src) {

        cl.bithaus.qfix.msg.OrderMassStatusRequest dest = new cl.bithaus.qfix.msg.OrderMassStatusRequest();

        if(src.getMassStatusReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.MassStatusReqID(src.getMassStatusReqID()));
            
        if(src.getMassStatusReqType() != null)
            dest.set(new cl.bithaus.qfix.fields.MassStatusReqType(src.getMassStatusReqType()));
            
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
            
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
            
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
            
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
            
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
            
        if(src.getExDestination() != null)
            dest.set(new cl.bithaus.qfix.fields.ExDestination(src.getExDestination()));
            


        return dest;
    }


}

