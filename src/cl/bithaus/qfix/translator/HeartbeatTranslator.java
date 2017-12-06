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
 * Fix - Bithaus format component translator for Heartbeat
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class HeartbeatTranslator  {

    public static cl.bithaus.qfix.msg.Heartbeat toFix(cl.bithaus.fix.Heartbeat src) {

        cl.bithaus.qfix.msg.Heartbeat dest = new cl.bithaus.qfix.msg.Heartbeat();

        if(src.getTestReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.TestReqID(src.getTestReqID()));
        



        return dest;
    }

    public static cl.bithaus.fix.Heartbeat fromFix(cl.bithaus.qfix.msg.Heartbeat src) 
        throws FieldNotFound {

        cl.bithaus.fix.Heartbeat dest = new cl.bithaus.fix.Heartbeat();

        if(src.isSetTestReqID())
            dest.setTestReqID(src.getTestReqID().getValue());




        return dest;

    }
}

