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
 * Fix - Bithaus format component translator for ListExecute
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class ListExecuteTranslator  {

    public static cl.bithaus.qfix.msg.ListExecute toFix(cl.bithaus.fix.ListExecute src) {

        cl.bithaus.qfix.msg.ListExecute dest = new cl.bithaus.qfix.msg.ListExecute();

        if(src.getListID() != null)
            dest.set(new cl.bithaus.qfix.fields.ListID(src.getListID()));
        
        if(src.getClientBidID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClientBidID(src.getClientBidID()));
        
        if(src.getBidID() != null)
            dest.set(new cl.bithaus.qfix.fields.BidID(src.getBidID()));
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        



        return dest;
    }

    public static cl.bithaus.fix.ListExecute fromFix(cl.bithaus.qfix.msg.ListExecute src) 
        throws FieldNotFound {

        cl.bithaus.fix.ListExecute dest = new cl.bithaus.fix.ListExecute();

        if(src.isSetListID())
            dest.setListID(src.getListID().getValue());

        if(src.isSetClientBidID())
            dest.setClientBidID(src.getClientBidID().getValue());

        if(src.isSetBidID())
            dest.setBidID(src.getBidID().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());




        return dest;

    }
}

