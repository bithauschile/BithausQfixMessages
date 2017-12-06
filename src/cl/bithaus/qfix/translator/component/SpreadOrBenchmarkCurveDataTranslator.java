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


}

