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


}

