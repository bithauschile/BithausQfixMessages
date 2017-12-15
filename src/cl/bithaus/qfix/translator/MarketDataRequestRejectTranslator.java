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
 * Fix - Bithaus format component translator for MarketDataRequestReject
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

    public static cl.bithaus.fix.MarketDataRequestReject fromFix(cl.bithaus.qfix.msg.MarketDataRequestReject src) 
        throws FieldNotFound {

        cl.bithaus.fix.MarketDataRequestReject dest = new cl.bithaus.fix.MarketDataRequestReject();

        if(src.isSetMDReqID())
            dest.setMDReqID(src.getMDReqID().getValue());

        if(src.isSetMDReqRejReason())
            dest.setMDReqRejReason(src.getMDReqRejReason().getValue()+"");

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"


        if(src.isSetNoAltMDSource()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoAltMDSource().getField());
            List<cl.bithaus.fix.MarketDataRequestReject.NoAltMDSource.NoAltMDSourceEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.AltMDSourceID altMDSourceID = new cl.bithaus.qfix.fields.AltMDSourceID();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.MarketDataRequestReject.NoAltMDSource.NoAltMDSourceEntry entry = 
                    new cl.bithaus.fix.MarketDataRequestReject.NoAltMDSource.NoAltMDSourceEntry();

                if(g.isSetField(altMDSourceID)) {
                    altMDSourceID = (cl.bithaus.qfix.fields.AltMDSourceID) g.getField(altMDSourceID);
                    entry.setAltMDSourceID(altMDSourceID.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

