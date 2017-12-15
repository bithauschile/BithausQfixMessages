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
 * Fix - Bithaus format component translator for OrderMassStatusRequest
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
        

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getUnderlyingInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.UnderlyingInstrumentTranslator.toFix(src.getUnderlyingInstrument()));



        return dest;
    }

    public static cl.bithaus.fix.OrderMassStatusRequest fromFix(cl.bithaus.qfix.msg.OrderMassStatusRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.OrderMassStatusRequest dest = new cl.bithaus.fix.OrderMassStatusRequest();

        if(src.isSetMassStatusReqID())
            dest.setMassStatusReqID(src.getMassStatusReqID().getValue());

        if(src.isSetMassStatusReqType())
            dest.setMassStatusReqType(src.getMassStatusReqType().getValue());

        if(src.isSetAccount())
            dest.setAccount(src.getAccount().getValue());

        if(src.isSetAcctIDSource())
            dest.setAcctIDSource(src.getAcctIDSource().getValue());

        if(src.isSetTradingSessionID())
            dest.setTradingSessionID(src.getTradingSessionID().getValue());

        if(src.isSetTradingSessionSubID())
            dest.setTradingSessionSubID(src.getTradingSessionSubID().getValue());

        if(src.isSetSide())
            dest.setSide(src.getSide().getValue()+"");

        if(src.isSetExDestination())
            dest.setExDestination(src.getExDestination().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"
        try {
            dest.setParties(cl.bithaus.qfix.translator.component.PartiesTranslator.fromFix(src.getParties()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setUnderlyingInstrument(cl.bithaus.qfix.translator.component.UnderlyingInstrumentTranslator.fromFix(src.getUnderlyingInstrument()));
        }
        catch(FieldNotFound e) {}


        return dest;

    }
}

