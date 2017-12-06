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
 * Fix - Bithaus format component translator for IIFValorization
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class IIFValorizationTranslator  {

    public static cl.bithaus.qfix.msg.component.IIFValorization toFix(cl.bithaus.fix.components.IIFValorization src) {

        cl.bithaus.qfix.msg.component.IIFValorization dest = new cl.bithaus.qfix.msg.component.IIFValorization();

        if(src.getIifValAdjustmentCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.IifValAdjustmentCurrency(src.getIifValAdjustmentCurrency()));
            
        if(src.getIifValDate() != null)
            dest.set(new cl.bithaus.qfix.fields.IifValDate(src.getIifValDate()));
            
        if(src.getIifValSettlType() != null)
            if(src.getIifValSettlType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.IifValSettlType(src.getIifValSettlType().charAt(0)));
            
        if(src.getIifValDueDate() != null)
            dest.set(new cl.bithaus.qfix.fields.IifValDueDate(src.getIifValDueDate()));
            
        if(src.getIifValDueDays() != null)
            dest.set(new cl.bithaus.qfix.fields.IifValDueDays(src.getIifValDueDays()));
            
        if(src.getIifValInterestRate() != null)
            dest.set(new cl.bithaus.qfix.fields.IifValInterestRate(src.getIifValInterestRate()));
            
        if(src.getIifValRescueAmount() != null)
            dest.set(new cl.bithaus.qfix.fields.IifValRescueAmount(src.getIifValRescueAmount()));
            
        if(src.getIifValInvestmentAmount() != null)
            dest.set(new cl.bithaus.qfix.fields.IifValInvestmentAmount(src.getIifValInvestmentAmount()));
            
        if(src.getIifValInvestmentAmountAdjustedCurrence() != null)
            dest.set(new cl.bithaus.qfix.fields.IifValInvestmentAmountAdjustedCurrence(src.getIifValInvestmentAmountAdjustedCurrence()));
            
        if(src.getIifValFloatSymbol() != null)
            dest.set(new cl.bithaus.qfix.fields.IifValFloatSymbol(src.getIifValFloatSymbol()));
            
        if(src.getIifValFloatIssueDate() != null)
            dest.set(new cl.bithaus.qfix.fields.IifValFloatIssueDate(src.getIifValFloatIssueDate()));
            
        if(src.getIifValFloatNominalQty() != null)
            dest.set(new cl.bithaus.qfix.fields.IifValFloatNominalQty(src.getIifValFloatNominalQty()));
            
        if(src.getIifValFloatEstimatedInterestRate() != null)
            dest.set(new cl.bithaus.qfix.fields.IifValFloatEstimatedInterestRate(src.getIifValFloatEstimatedInterestRate()));
            
        if(src.getIifValReferentialValue() != null)
            dest.set(new cl.bithaus.qfix.fields.IifValReferentialValue(src.getIifValReferentialValue()));
            


        return dest;
    }

    public static cl.bithaus.fix.components.IIFValorization fromFix(cl.bithaus.qfix.msg.component.IIFValorization src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.IIFValorization dest = new cl.bithaus.fix.components.IIFValorization();

        if(src.isSetIifValAdjustmentCurrency())
            dest.setIifValAdjustmentCurrency(src.getIifValAdjustmentCurrency().getValue());
            
        if(src.isSetIifValDate())
            dest.setIifValDate(src.getIifValDate().getValue());
            
        if(src.isSetIifValSettlType())
            dest.setIifValSettlType(src.getIifValSettlType().getValue()+"");
            
        if(src.isSetIifValDueDate())
            dest.setIifValDueDate(src.getIifValDueDate().getValue());
            
        if(src.isSetIifValDueDays())
            dest.setIifValDueDays(src.getIifValDueDays().getValue());
            
        if(src.isSetIifValInterestRate())
            dest.setIifValInterestRate(src.getIifValInterestRate().getValue());
            
        if(src.isSetIifValRescueAmount())
            dest.setIifValRescueAmount(src.getIifValRescueAmount().getValue());
            
        if(src.isSetIifValInvestmentAmount())
            dest.setIifValInvestmentAmount(src.getIifValInvestmentAmount().getValue());
            
        if(src.isSetIifValInvestmentAmountAdjustedCurrence())
            dest.setIifValInvestmentAmountAdjustedCurrence(src.getIifValInvestmentAmountAdjustedCurrence().getValue());
            
        if(src.isSetIifValFloatSymbol())
            dest.setIifValFloatSymbol(src.getIifValFloatSymbol().getValue());
            
        if(src.isSetIifValFloatIssueDate())
            dest.setIifValFloatIssueDate(src.getIifValFloatIssueDate().getValue());
            
        if(src.isSetIifValFloatNominalQty())
            dest.setIifValFloatNominalQty(src.getIifValFloatNominalQty().getValue());
            
        if(src.isSetIifValFloatEstimatedInterestRate())
            dest.setIifValFloatEstimatedInterestRate(src.getIifValFloatEstimatedInterestRate().getValue());
            
        if(src.isSetIifValReferentialValue())
            dest.setIifValReferentialValue(src.getIifValReferentialValue().getValue());
            



        return dest;

    }
}

