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
 * Fix - Bithaus format component translator for FinancingDetails
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class FinancingDetailsTranslator  {

    public static cl.bithaus.qfix.msg.component.FinancingDetails toFix(cl.bithaus.fix.components.FinancingDetails src) {

        cl.bithaus.qfix.msg.component.FinancingDetails dest = new cl.bithaus.qfix.msg.component.FinancingDetails();

        if(src.getAgreementDesc() != null)
            dest.set(new cl.bithaus.qfix.fields.AgreementDesc(src.getAgreementDesc()));
            
        if(src.getAgreementID() != null)
            dest.set(new cl.bithaus.qfix.fields.AgreementID(src.getAgreementID()));
            
        if(src.getAgreementDate() != null)
            dest.set(new cl.bithaus.qfix.fields.AgreementDate(src.getAgreementDate()));
            
        if(src.getAgreementCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.AgreementCurrency(src.getAgreementCurrency()));
            
        if(src.getTerminationType() != null)
            dest.set(new cl.bithaus.qfix.fields.TerminationType(src.getTerminationType()));
            
        if(src.getStartDate() != null)
            dest.set(new cl.bithaus.qfix.fields.StartDate(src.getStartDate()));
            
        if(src.getEndDate() != null)
            dest.set(new cl.bithaus.qfix.fields.EndDate(src.getEndDate()));
            
        if(src.getDeliveryType() != null)
            dest.set(new cl.bithaus.qfix.fields.DeliveryType(src.getDeliveryType()));
            
        if(src.getMarginRatio() != null)
            dest.set(new cl.bithaus.qfix.fields.MarginRatio(src.getMarginRatio().doubleValue()));
            


        return dest;
    }

    public static cl.bithaus.fix.components.FinancingDetails fromFix(cl.bithaus.qfix.msg.component.FinancingDetails src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.FinancingDetails dest = new cl.bithaus.fix.components.FinancingDetails();

        if(src.isSetAgreementDesc())
            dest.setAgreementDesc(src.getAgreementDesc().getValue());
            
        if(src.isSetAgreementID())
            dest.setAgreementID(src.getAgreementID().getValue());
            
        if(src.isSetAgreementDate())
            dest.setAgreementDate(src.getAgreementDate().getValue());
            
        if(src.isSetAgreementCurrency())
            dest.setAgreementCurrency(src.getAgreementCurrency().getValue());
            
        if(src.isSetTerminationType())
            dest.setTerminationType(src.getTerminationType().getValue());
            
        if(src.isSetStartDate())
            dest.setStartDate(src.getStartDate().getValue());
            
        if(src.isSetEndDate())
            dest.setEndDate(src.getEndDate().getValue());
            
        if(src.isSetDeliveryType())
            dest.setDeliveryType(src.getDeliveryType().getValue());
            
        if(src.isSetMarginRatio())
            dest.setMarginRatio(new BigDecimal(src.getMarginRatio().getValue()));
            



        return dest;

    }
}

