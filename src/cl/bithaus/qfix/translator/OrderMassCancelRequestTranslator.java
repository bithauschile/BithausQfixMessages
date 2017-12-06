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
 * Fix - Bithaus format component translator for OrderMassCancelRequest
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class OrderMassCancelRequestTranslator  {

    public static cl.bithaus.qfix.msg.OrderMassCancelRequest toFix(cl.bithaus.fix.OrderMassCancelRequest src) {

        cl.bithaus.qfix.msg.OrderMassCancelRequest dest = new cl.bithaus.qfix.msg.OrderMassCancelRequest();

        if(src.getClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdID(src.getClOrdID()));
        
        if(src.getSecondaryClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(src.getSecondaryClOrdID()));
        
        if(src.getMassCancelRequestType() != null)
            if(src.getMassCancelRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.MassCancelRequestType(src.getMassCancelRequestType().charAt(0)));
        
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
        
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
        
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getUnderlyingInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.UnderlyingInstrumentTranslator.toFix(src.getUnderlyingInstrument()));



        return dest;
    }

    public static cl.bithaus.fix.OrderMassCancelRequest fromFix(cl.bithaus.qfix.msg.OrderMassCancelRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.OrderMassCancelRequest dest = new cl.bithaus.fix.OrderMassCancelRequest();

        if(src.isSetClOrdID())
            dest.setClOrdID(src.getClOrdID().getValue());

        if(src.isSetSecondaryClOrdID())
            dest.setSecondaryClOrdID(src.getSecondaryClOrdID().getValue());

        if(src.isSetMassCancelRequestType())
            dest.setMassCancelRequestType(src.getMassCancelRequestType().getValue()+"");

        if(src.isSetTradingSessionID())
            dest.setTradingSessionID(src.getTradingSessionID().getValue());

        if(src.isSetTradingSessionSubID())
            dest.setTradingSessionSubID(src.getTradingSessionSubID().getValue());

        if(src.isSetSide())
            dest.setSide(src.getSide().getValue()+"");

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());


        if(src.getInstrument() != null)
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));

        if(src.getUnderlyingInstrument() != null)
            dest.setUnderlyingInstrument(cl.bithaus.qfix.translator.component.UnderlyingInstrumentTranslator.fromFix(src.getUnderlyingInstrument()));



        return dest;

    }
}

