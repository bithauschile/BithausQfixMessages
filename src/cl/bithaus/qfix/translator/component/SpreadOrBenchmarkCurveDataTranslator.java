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
 * Fix - Bithaus format component translator for SpreadOrBenchmarkCurveData
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class SpreadOrBenchmarkCurveDataTranslator  {

    public static cl.bithaus.qfix.msg.component.SpreadOrBenchmarkCurveData toFix(cl.bithaus.fix.components.SpreadOrBenchmarkCurveData src) {

        cl.bithaus.qfix.msg.component.SpreadOrBenchmarkCurveData dest = new cl.bithaus.qfix.msg.component.SpreadOrBenchmarkCurveData();

        if(src.getSpread() != null)
            dest.set(new cl.bithaus.qfix.fields.Spread(src.getSpread()));
            
        if(src.getBenchmarkCurveCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.BenchmarkCurveCurrency(src.getBenchmarkCurveCurrency()));
            
        if(src.getBenchmarkCurveName() != null)
            dest.set(new cl.bithaus.qfix.fields.BenchmarkCurveName(src.getBenchmarkCurveName()));
            
        if(src.getBenchmarkCurvePoint() != null)
            dest.set(new cl.bithaus.qfix.fields.BenchmarkCurvePoint(src.getBenchmarkCurvePoint()));
            
        if(src.getBenchmarkPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.BenchmarkPrice(src.getBenchmarkPrice()));
            
        if(src.getBenchmarkPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.BenchmarkPriceType(src.getBenchmarkPriceType()));
            
        if(src.getBenchmarkSecurityID() != null)
            dest.set(new cl.bithaus.qfix.fields.BenchmarkSecurityID(src.getBenchmarkSecurityID()));
            
        if(src.getBenchmarkSecurityIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.BenchmarkSecurityIDSource(src.getBenchmarkSecurityIDSource()));
            


        return dest;
    }

    public static cl.bithaus.fix.components.SpreadOrBenchmarkCurveData fromFix(cl.bithaus.qfix.msg.component.SpreadOrBenchmarkCurveData src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.SpreadOrBenchmarkCurveData dest = new cl.bithaus.fix.components.SpreadOrBenchmarkCurveData();

        if(src.isSetSpread())
            dest.setSpread(src.getSpread().getValue());
        if(src.isSetBenchmarkCurveCurrency())
            dest.setBenchmarkCurveCurrency(src.getBenchmarkCurveCurrency().getValue());
        if(src.isSetBenchmarkCurveName())
            dest.setBenchmarkCurveName(src.getBenchmarkCurveName().getValue());
        if(src.isSetBenchmarkCurvePoint())
            dest.setBenchmarkCurvePoint(src.getBenchmarkCurvePoint().getValue());
        if(src.isSetBenchmarkPrice())
            dest.setBenchmarkPrice(src.getBenchmarkPrice().getValue());
        if(src.isSetBenchmarkPriceType())
            dest.setBenchmarkPriceType(src.getBenchmarkPriceType().getValue());
        if(src.isSetBenchmarkSecurityID())
            dest.setBenchmarkSecurityID(src.getBenchmarkSecurityID().getValue());
        if(src.isSetBenchmarkSecurityIDSource())
            dest.setBenchmarkSecurityIDSource(src.getBenchmarkSecurityIDSource().getValue());

        return dest;

    }
}

