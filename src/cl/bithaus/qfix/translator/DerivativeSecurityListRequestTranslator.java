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
 * Fix - Bithaus format component translator for DerivativeSecurityListRequest
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class DerivativeSecurityListRequestTranslator  {

    public static cl.bithaus.qfix.msg.DerivativeSecurityListRequest toFix(cl.bithaus.fix.DerivativeSecurityListRequest src) {

        cl.bithaus.qfix.msg.DerivativeSecurityListRequest dest = new cl.bithaus.qfix.msg.DerivativeSecurityListRequest();

        if(src.getSecurityReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityReqID(src.getSecurityReqID()));
        
        if(src.getSecurityListRequestType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityListRequestType(src.getSecurityListRequestType()));
        
        if(src.getSecuritySubType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecuritySubType(src.getSecuritySubType()));
        
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
        
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
        
        if(src.getSubscriptionRequestType() != null)
            if(src.getSubscriptionRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SubscriptionRequestType(src.getSubscriptionRequestType().charAt(0)));
        

        if(src.getUnderlyingInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.UnderlyingInstrumentTranslator.toFix(src.getUnderlyingInstrument()));



        return dest;
    }

    public static cl.bithaus.fix.DerivativeSecurityListRequest fromFix(cl.bithaus.qfix.msg.DerivativeSecurityListRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.DerivativeSecurityListRequest dest = new cl.bithaus.fix.DerivativeSecurityListRequest();

        if(src.isSetSecurityReqID())
            dest.setSecurityReqID(src.getSecurityReqID().getValue());

        if(src.isSetSecurityListRequestType())
            dest.setSecurityListRequestType(src.getSecurityListRequestType().getValue());

        if(src.isSetSecuritySubType())
            dest.setSecuritySubType(src.getSecuritySubType().getValue());

        if(src.isSetCurrency())
            dest.setCurrency(src.getCurrency().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());

        if(src.isSetTradingSessionID())
            dest.setTradingSessionID(src.getTradingSessionID().getValue());

        if(src.isSetTradingSessionSubID())
            dest.setTradingSessionSubID(src.getTradingSessionSubID().getValue());

        if(src.isSetSubscriptionRequestType())
            dest.setSubscriptionRequestType(src.getSubscriptionRequestType().getValue()+"");


        if(src.getUnderlyingInstrument() != null)
            dest.setUnderlyingInstrument(cl.bithaus.qfix.translator.component.UnderlyingInstrumentTranslator.fromFix(src.getUnderlyingInstrument()));



        return dest;

    }
}

