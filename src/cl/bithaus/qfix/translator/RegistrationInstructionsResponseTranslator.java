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

package cl.bithaus.qfix.translator;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import quickfix.FieldNotFound;


/**
 * Fix - Bithaus format component translator for RegistrationInstructionsResponse
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class RegistrationInstructionsResponseTranslator  {

    public static cl.bithaus.qfix.msg.RegistrationInstructionsResponse toFix(cl.bithaus.fix.RegistrationInstructionsResponse src) {

        cl.bithaus.qfix.msg.RegistrationInstructionsResponse dest = new cl.bithaus.qfix.msg.RegistrationInstructionsResponse();

        if(src.getRegistID() != null)
            dest.set(new cl.bithaus.qfix.fields.RegistID(src.getRegistID()));
        
        if(src.getRegistTransType() != null)
            if(src.getRegistTransType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.RegistTransType(src.getRegistTransType().charAt(0)));
        
        if(src.getRegistRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.RegistRefID(src.getRegistRefID()));
        
        if(src.getClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdID(src.getClOrdID()));
        
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
        
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
        
        if(src.getRegistStatus() != null)
            if(src.getRegistStatus().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.RegistStatus(src.getRegistStatus().charAt(0)));
        
        if(src.getRegistRejReasonCode() != null)
            dest.set(new cl.bithaus.qfix.fields.RegistRejReasonCode(src.getRegistRejReasonCode()));
        
        if(src.getRegistRejReasonText() != null)
            dest.set(new cl.bithaus.qfix.fields.RegistRejReasonText(src.getRegistRejReasonText()));
        

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));



        return dest;
    }

    public static cl.bithaus.fix.RegistrationInstructionsResponse fromFix(cl.bithaus.qfix.msg.RegistrationInstructionsResponse src) 
        throws FieldNotFound {

        cl.bithaus.fix.RegistrationInstructionsResponse dest = new cl.bithaus.fix.RegistrationInstructionsResponse();

        if(src.isSetRegistID())
            dest.setRegistID(src.getRegistID().getValue());

        if(src.isSetRegistTransType())
            dest.setRegistTransType(src.getRegistTransType().getValue()+"");

        if(src.isSetRegistRefID())
            dest.setRegistRefID(src.getRegistRefID().getValue());

        if(src.isSetClOrdID())
            dest.setClOrdID(src.getClOrdID().getValue());

        if(src.isSetAccount())
            dest.setAccount(src.getAccount().getValue());

        if(src.isSetAcctIDSource())
            dest.setAcctIDSource(src.getAcctIDSource().getValue());

        if(src.isSetRegistStatus())
            dest.setRegistStatus(src.getRegistStatus().getValue()+"");

        if(src.isSetRegistRejReasonCode())
            dest.setRegistRejReasonCode(src.getRegistRejReasonCode().getValue());

        if(src.isSetRegistRejReasonText())
            dest.setRegistRejReasonText(src.getRegistRejReasonText().getValue());


        if(src.getParties() != null)
            dest.setParties(cl.bithaus.qfix.translator.component.PartiesTranslator.fromFix(src.getParties()));



        return dest;

    }
}

