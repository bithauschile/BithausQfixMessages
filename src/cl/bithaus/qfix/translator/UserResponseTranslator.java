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
public class UserResponseTranslator  {

    public static cl.bithaus.qfix.msg.UserResponse toFix(cl.bithaus.fix.UserResponse src) {

        cl.bithaus.qfix.msg.UserResponse dest = new cl.bithaus.qfix.msg.UserResponse();

        if(src.getUserRequestID() != null)
            dest.set(new cl.bithaus.qfix.fields.UserRequestID(src.getUserRequestID()));
            
        if(src.getUsername() != null)
            dest.set(new cl.bithaus.qfix.fields.Username(src.getUsername()));
            
        if(src.getUserStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.UserStatus(src.getUserStatus()));
            
        if(src.getUserStatusText() != null)
            dest.set(new cl.bithaus.qfix.fields.UserStatusText(src.getUserStatusText()));
            


        return dest;
    }


}

