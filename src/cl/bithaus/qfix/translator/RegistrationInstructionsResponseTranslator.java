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

/**
 * Fix Components Class
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
            


        return dest;
    }


}

