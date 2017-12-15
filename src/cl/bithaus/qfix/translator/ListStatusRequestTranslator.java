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
 * Fix - Bithaus format component translator for ListStatusRequest
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class ListStatusRequestTranslator  {

    public static cl.bithaus.qfix.msg.ListStatusRequest toFix(cl.bithaus.fix.ListStatusRequest src) {

        cl.bithaus.qfix.msg.ListStatusRequest dest = new cl.bithaus.qfix.msg.ListStatusRequest();

        if(src.getListID() != null)
            dest.set(new cl.bithaus.qfix.fields.ListID(src.getListID()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        



        return dest;
    }

    public static cl.bithaus.fix.ListStatusRequest fromFix(cl.bithaus.qfix.msg.ListStatusRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.ListStatusRequest dest = new cl.bithaus.fix.ListStatusRequest();

        if(src.isSetListID())
            dest.setListID(src.getListID().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"


        return dest;

    }
}

