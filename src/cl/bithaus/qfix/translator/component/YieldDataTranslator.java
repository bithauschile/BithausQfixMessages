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
 * Fix - Bithaus format component translator for YieldData
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

    public static cl.bithaus.fix.components.YieldData fromFix(cl.bithaus.qfix.msg.component.YieldData src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.YieldData dest = new cl.bithaus.fix.components.YieldData();

        if(src.isSetYieldType())
            dest.setYieldType(src.getYieldType().getValue());
            
        if(src.isSetYield())
            dest.setYield(new BigDecimal(src.getYield().getValue()));
            
        if(src.isSetYieldCalcDate())
            dest.setYieldCalcDate(src.getYieldCalcDate().getValue());
            
        if(src.isSetYieldRedemptionDate())
            dest.setYieldRedemptionDate(src.getYieldRedemptionDate().getValue());
            
        if(src.isSetYieldRedemptionPrice())
            dest.setYieldRedemptionPrice(src.getYieldRedemptionPrice().getValue());
            
        if(src.isSetYieldRedemptionPriceType())
            dest.setYieldRedemptionPriceType(src.getYieldRedemptionPriceType().getValue());
            



        return dest;

    }
}

