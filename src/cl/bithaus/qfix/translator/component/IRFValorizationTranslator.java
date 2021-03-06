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
 * Fix - Bithaus format component translator for IRFValorization
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class IRFValorizationTranslator  {

    public static cl.bithaus.qfix.msg.component.IRFValorization toFix(cl.bithaus.fix.components.IRFValorization src) {

        cl.bithaus.qfix.msg.component.IRFValorization dest = new cl.bithaus.qfix.msg.component.IRFValorization();

        if(src.getIrfValSymbol() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValSymbol(src.getIrfValSymbol()));
            
        if(src.getIrfValAdjustmentCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValAdjustmentCurrency(src.getIrfValAdjustmentCurrency()));
            
        if(src.getIrfValDate() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValDate(src.getIrfValDate()));
            
        if(src.getIrfValSettlType() != null)
            if(src.getIrfValSettlType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.IrfValSettlType(src.getIrfValSettlType().charAt(0)));
            
        if(src.getIrfValQty() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValQty(src.getIrfValQty()));
            
        if(src.getIrfValTir() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValTir(src.getIrfValTir()));
            
        if(src.getIrfValPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValPrice(src.getIrfValPrice()));
            
        if(src.getIrfValAmount() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValAmount(src.getIrfValAmount()));
            
        if(src.getIrfValAmountAdjustedCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValAmountAdjustedCurrency(src.getIrfValAmountAdjustedCurrency()));
            
        if(src.getIrfValSettlAmount() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValSettlAmount(src.getIrfValSettlAmount()));
            
        if(src.getIrfValPar() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValPar(src.getIrfValPar()));
            
        if(src.getIrfValPeriod() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValPeriod(src.getIrfValPeriod()));
            
        if(src.getIrfValDuration() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValDuration(src.getIrfValDuration()));
            
        if(src.getIrfValConvex() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValConvex(src.getIrfValConvex()));
            
        if(src.getIrfValFloatingRateParValue() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValFloatingRateParValue(src.getIrfValFloatingRateParValue()));
            
        if(src.getIrfValFloatingRateEstRate() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValFloatingRateEstRate(src.getIrfValFloatingRateEstRate()));
            
        if(src.getIrfValOtherPeriodYears() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValOtherPeriodYears(src.getIrfValOtherPeriodYears()));
            
        if(src.getIrfValOtherEstYearInflationRate() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValOtherEstYearInflationRate(src.getIrfValOtherEstYearInflationRate()));
            
        if(src.getIrfValReferentialValue() != null)
            dest.set(new cl.bithaus.qfix.fields.IrfValReferentialValue(src.getIrfValReferentialValue()));
            


        return dest;
    }

    public static cl.bithaus.fix.components.IRFValorization fromFix(cl.bithaus.qfix.msg.component.IRFValorization src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.IRFValorization dest = new cl.bithaus.fix.components.IRFValorization();

        if(src.isSetIrfValSymbol())
            dest.setIrfValSymbol(src.getIrfValSymbol().getValue());
        if(src.isSetIrfValAdjustmentCurrency())
            dest.setIrfValAdjustmentCurrency(src.getIrfValAdjustmentCurrency().getValue());
        if(src.isSetIrfValDate())
            dest.setIrfValDate(src.getIrfValDate().getValue());
        if(src.isSetIrfValSettlType())
            dest.setIrfValSettlType(src.getIrfValSettlType().getValue()+"");
        if(src.isSetIrfValQty())
            dest.setIrfValQty(src.getIrfValQty().getValue());
        if(src.isSetIrfValTir())
            dest.setIrfValTir(src.getIrfValTir().getValue());
        if(src.isSetIrfValPrice())
            dest.setIrfValPrice(src.getIrfValPrice().getValue());
        if(src.isSetIrfValAmount())
            dest.setIrfValAmount(src.getIrfValAmount().getValue());
        if(src.isSetIrfValAmountAdjustedCurrency())
            dest.setIrfValAmountAdjustedCurrency(src.getIrfValAmountAdjustedCurrency().getValue());
        if(src.isSetIrfValSettlAmount())
            dest.setIrfValSettlAmount(src.getIrfValSettlAmount().getValue());
        if(src.isSetIrfValPar())
            dest.setIrfValPar(src.getIrfValPar().getValue());
        if(src.isSetIrfValPeriod())
            dest.setIrfValPeriod(src.getIrfValPeriod().getValue());
        if(src.isSetIrfValDuration())
            dest.setIrfValDuration(src.getIrfValDuration().getValue());
        if(src.isSetIrfValConvex())
            dest.setIrfValConvex(src.getIrfValConvex().getValue());
        if(src.isSetIrfValFloatingRateParValue())
            dest.setIrfValFloatingRateParValue(src.getIrfValFloatingRateParValue().getValue());
        if(src.isSetIrfValFloatingRateEstRate())
            dest.setIrfValFloatingRateEstRate(src.getIrfValFloatingRateEstRate().getValue());
        if(src.isSetIrfValOtherPeriodYears())
            dest.setIrfValOtherPeriodYears(src.getIrfValOtherPeriodYears().getValue());
        if(src.isSetIrfValOtherEstYearInflationRate())
            dest.setIrfValOtherEstYearInflationRate(src.getIrfValOtherEstYearInflationRate().getValue());
        if(src.isSetIrfValReferentialValue())
            dest.setIrfValReferentialValue(src.getIrfValReferentialValue().getValue());

        return dest;

    }
}

