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
public class LegBenchmarkCurveDataTranslator  {

    public static cl.bithaus.qfix.msg.component.LegBenchmarkCurveData toFix(cl.bithaus.fix.components.LegBenchmarkCurveData src) {

        cl.bithaus.qfix.msg.component.LegBenchmarkCurveData dest = new cl.bithaus.qfix.msg.component.LegBenchmarkCurveData();

        if(src.getLegBenchmarkCurveCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.LegBenchmarkCurveCurrency(src.getLegBenchmarkCurveCurrency()));
            
        if(src.getLegBenchmarkCurveName() != null)
            dest.set(new cl.bithaus.qfix.fields.LegBenchmarkCurveName(src.getLegBenchmarkCurveName()));
            
        if(src.getLegBenchmarkCurvePoint() != null)
            dest.set(new cl.bithaus.qfix.fields.LegBenchmarkCurvePoint(src.getLegBenchmarkCurvePoint()));
            
        if(src.getLegBenchmarkPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.LegBenchmarkPrice(src.getLegBenchmarkPrice()));
            
        if(src.getLegBenchmarkPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.LegBenchmarkPriceType(src.getLegBenchmarkPriceType()));
            


        return dest;
    }


}

