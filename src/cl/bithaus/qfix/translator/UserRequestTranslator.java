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
public class UserRequestTranslator  {

    public static cl.bithaus.qfix.msg.UserRequest toFix(cl.bithaus.fix.UserRequest src) {

        cl.bithaus.qfix.msg.UserRequest dest = new cl.bithaus.qfix.msg.UserRequest();

        if(src.getUserRequestID() != null)
            dest.set(new cl.bithaus.qfix.fields.UserRequestID(src.getUserRequestID()));
            
        if(src.getUserRequestType() != null)
            dest.set(new cl.bithaus.qfix.fields.UserRequestType(src.getUserRequestType()));
            
        if(src.getUsername() != null)
            dest.set(new cl.bithaus.qfix.fields.Username(src.getUsername()));
            
        if(src.getPassword() != null)
            dest.set(new cl.bithaus.qfix.fields.Password(src.getPassword()));
            
        if(src.getNewPassword() != null)
            dest.set(new cl.bithaus.qfix.fields.NewPassword(src.getNewPassword()));
            
        if(src.getRawDataLength() != null)
            dest.set(new cl.bithaus.qfix.fields.RawDataLength(src.getRawDataLength()));
            
        if(src.getRawData() != null)
            dest.set(new cl.bithaus.qfix.fields.RawData(src.getRawData()));
            


        return dest;
    }


}

