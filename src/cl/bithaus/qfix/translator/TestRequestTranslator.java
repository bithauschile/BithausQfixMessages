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
public class TestRequestTranslator  {

    public static cl.bithaus.qfix.msg.TestRequest toFix(cl.bithaus.fix.TestRequest src) {

        cl.bithaus.qfix.msg.TestRequest dest = new cl.bithaus.qfix.msg.TestRequest();

        if(src.getTestReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.TestReqID(src.getTestReqID()));
            


        return dest;
    }


}

