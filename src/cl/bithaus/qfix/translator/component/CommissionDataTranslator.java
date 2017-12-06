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
 * Fix - Bithaus format component translator for CommissionData
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class CommissionDataTranslator  {

    public static cl.bithaus.qfix.msg.component.CommissionData toFix(cl.bithaus.fix.components.CommissionData src) {

        cl.bithaus.qfix.msg.component.CommissionData dest = new cl.bithaus.qfix.msg.component.CommissionData();

        if(src.getCommission() != null)
            dest.set(new cl.bithaus.qfix.fields.Commission(src.getCommission()));
            
        if(src.getCommType() != null)
            if(src.getCommType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.CommType(src.getCommType().charAt(0)));
            
        if(src.getCommCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.CommCurrency(src.getCommCurrency()));
            
        if(src.getFundRenewWaiv() != null)
            if(src.getFundRenewWaiv().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.FundRenewWaiv(src.getFundRenewWaiv().charAt(0)));
            


        return dest;
    }

    public static cl.bithaus.fix.components.CommissionData fromFix(cl.bithaus.qfix.msg.component.CommissionData src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.CommissionData dest = new cl.bithaus.fix.components.CommissionData();

        if(src.isSetCommission())
            dest.setCommission(src.getCommission().getValue());
        if(src.isSetCommType())
            dest.setCommType(src.getCommType().getValue()+"");
        if(src.isSetCommCurrency())
            dest.setCommCurrency(src.getCommCurrency().getValue());
        if(src.isSetFundRenewWaiv())
            dest.setFundRenewWaiv(src.getFundRenewWaiv().getValue()+"");

        return dest;

    }
}

