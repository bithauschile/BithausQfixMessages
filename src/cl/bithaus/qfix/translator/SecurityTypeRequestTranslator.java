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
 * Fix - Bithaus format component translator for SecurityTypeRequest
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class SecurityTypeRequestTranslator  {

    public static cl.bithaus.qfix.msg.SecurityTypeRequest toFix(cl.bithaus.fix.SecurityTypeRequest src) {

        cl.bithaus.qfix.msg.SecurityTypeRequest dest = new cl.bithaus.qfix.msg.SecurityTypeRequest();

        if(src.getSecurityReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityReqID(src.getSecurityReqID()));
        
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
        
        if(src.getProduct() != null)
            dest.set(new cl.bithaus.qfix.fields.Product(src.getProduct()));
        
        if(src.getSecurityType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityType(src.getSecurityType()));
        
        if(src.getSecuritySubType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecuritySubType(src.getSecuritySubType()));
        



        return dest;
    }

    public static cl.bithaus.fix.SecurityTypeRequest fromFix(cl.bithaus.qfix.msg.SecurityTypeRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.SecurityTypeRequest dest = new cl.bithaus.fix.SecurityTypeRequest();

        if(src.isSetSecurityReqID())
            dest.setSecurityReqID(src.getSecurityReqID().getValue());

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

        if(src.isSetProduct())
            dest.setProduct(src.getProduct().getValue());

        if(src.isSetSecurityType())
            dest.setSecurityType(src.getSecurityType().getValue());

        if(src.isSetSecuritySubType())
            dest.setSecuritySubType(src.getSecuritySubType().getValue());




        return dest;

    }
}

