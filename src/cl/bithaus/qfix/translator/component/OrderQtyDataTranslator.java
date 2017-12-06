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

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class OrderQtyDataTranslator  {

    public static cl.bithaus.qfix.msg.component.OrderQtyData toFix(cl.bithaus.fix.components.OrderQtyData src) {

        cl.bithaus.qfix.msg.component.OrderQtyData dest = new cl.bithaus.qfix.msg.component.OrderQtyData();

        if(src.getOrderQty() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderQty(src.getOrderQty()));
            
        if(src.getCashOrderQty() != null)
            dest.set(new cl.bithaus.qfix.fields.CashOrderQty(src.getCashOrderQty()));
            
        if(src.getOrderPercent() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderPercent(src.getOrderPercent().doubleValue()));
            
        if(src.getRoundingDirection() != null)
            if(src.getRoundingDirection().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.RoundingDirection(src.getRoundingDirection().charAt(0)));
            
        if(src.getRoundingModulus() != null)
            dest.set(new cl.bithaus.qfix.fields.RoundingModulus(src.getRoundingModulus().floatValue()));
            


        return dest;
    }


}

