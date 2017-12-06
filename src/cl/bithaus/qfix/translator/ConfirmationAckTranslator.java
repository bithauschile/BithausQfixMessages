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
 * Fix - Bithaus format component translator for ConfirmationAck
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class ConfirmationAckTranslator  {

    public static cl.bithaus.qfix.msg.ConfirmationAck toFix(cl.bithaus.fix.ConfirmationAck src) {

        cl.bithaus.qfix.msg.ConfirmationAck dest = new cl.bithaus.qfix.msg.ConfirmationAck();

        if(src.getConfirmID() != null)
            dest.set(new cl.bithaus.qfix.fields.ConfirmID(src.getConfirmID()));
        
        if(src.getTradeDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeDate(src.getTradeDate()));
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getAffirmStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.AffirmStatus(src.getAffirmStatus()));
        
        if(src.getConfirmRejReason() != null)
            dest.set(new cl.bithaus.qfix.fields.ConfirmRejReason(src.getConfirmRejReason()));
        
        if(src.getMatchStatus() != null)
            if(src.getMatchStatus().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.MatchStatus(src.getMatchStatus().charAt(0)));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        



        return dest;
    }

    public static cl.bithaus.fix.ConfirmationAck fromFix(cl.bithaus.qfix.msg.ConfirmationAck src) 
        throws FieldNotFound {

        cl.bithaus.fix.ConfirmationAck dest = new cl.bithaus.fix.ConfirmationAck();

        if(src.isSetConfirmID())
            dest.setConfirmID(src.getConfirmID().getValue());

        if(src.isSetTradeDate())
            dest.setTradeDate(src.getTradeDate().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetAffirmStatus())
            dest.setAffirmStatus(src.getAffirmStatus().getValue());

        if(src.isSetConfirmRejReason())
            dest.setConfirmRejReason(src.getConfirmRejReason().getValue());

        if(src.isSetMatchStatus())
            dest.setMatchStatus(src.getMatchStatus().getValue()+"");

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());




        return dest;

    }
}

