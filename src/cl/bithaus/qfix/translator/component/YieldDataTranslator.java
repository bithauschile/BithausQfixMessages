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
public class YieldDataTranslator  {

    public static cl.bithaus.qfix.msg.component.YieldData toFix(cl.bithaus.fix.components.YieldData src) {

        cl.bithaus.qfix.msg.component.YieldData dest = new cl.bithaus.qfix.msg.component.YieldData();

        if(src.getYieldType() != null)
            dest.set(new cl.bithaus.qfix.fields.YieldType(src.getYieldType()));
            
        if(src.getYield() != null)
            dest.set(new cl.bithaus.qfix.fields.Yield(src.getYield().doubleValue()));
            
        if(src.getYieldCalcDate() != null)
            dest.set(new cl.bithaus.qfix.fields.YieldCalcDate(src.getYieldCalcDate()));
            
        if(src.getYieldRedemptionDate() != null)
            dest.set(new cl.bithaus.qfix.fields.YieldRedemptionDate(src.getYieldRedemptionDate()));
            
        if(src.getYieldRedemptionPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.YieldRedemptionPrice(src.getYieldRedemptionPrice()));
            
        if(src.getYieldRedemptionPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.YieldRedemptionPriceType(src.getYieldRedemptionPriceType()));
            


        return dest;
    }


}

