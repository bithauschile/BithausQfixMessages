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

package cl.bithaus.qfix.translator.component;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import quickfix.FieldNotFound;


/**
 * Fix - Bithaus format component translator for BookAttributes
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class BookAttributesTranslator  {

    public static cl.bithaus.qfix.msg.component.BookAttributes toFix(cl.bithaus.fix.components.BookAttributes src) {

        cl.bithaus.qfix.msg.component.BookAttributes dest = new cl.bithaus.qfix.msg.component.BookAttributes();

        if(src.getSettlType() != null)
            if(src.getSettlType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SettlType(src.getSettlType().charAt(0)));
            
        if(src.getCross() != null)
            dest.set(new cl.bithaus.qfix.fields.Cross(src.getCross()));
            
        if(src.getCrossType() != null)
            dest.set(new cl.bithaus.qfix.fields.CrossType(src.getCrossType()));
            
        if(src.getRoundLotBook() != null)
            if(src.getRoundLotBook().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.RoundLotBook(src.getRoundLotBook().charAt(0)));
            
        if(src.getOrderQty() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderQty(src.getOrderQty()));
            


        return dest;
    }

    public static cl.bithaus.fix.components.BookAttributes fromFix(cl.bithaus.qfix.msg.component.BookAttributes src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.BookAttributes dest = new cl.bithaus.fix.components.BookAttributes();

        if(src.isSetSettlType())
            dest.setSettlType(src.getSettlType().getValue()+"");
        if(src.isSetCross())
            dest.setCross(src.getCross().getValue());
        if(src.isSetCrossType())
            dest.setCrossType(src.getCrossType().getValue());
        if(src.isSetRoundLotBook())
            dest.setRoundLotBook(src.getRoundLotBook().getValue()+"");
        if(src.isSetOrderQty())
            dest.setOrderQty(src.getOrderQty().getValue());

        return dest;

    }
}

