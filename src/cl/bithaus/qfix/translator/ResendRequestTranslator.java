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
 * Fix - Bithaus format component translator for ResendRequest
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class ResendRequestTranslator  {

    public static cl.bithaus.qfix.msg.ResendRequest toFix(cl.bithaus.fix.ResendRequest src) {

        cl.bithaus.qfix.msg.ResendRequest dest = new cl.bithaus.qfix.msg.ResendRequest();

        if(src.getBeginSeqNo() != null)
            dest.set(new cl.bithaus.qfix.fields.BeginSeqNo(src.getBeginSeqNo()));
        
        if(src.getEndSeqNo() != null)
            dest.set(new cl.bithaus.qfix.fields.EndSeqNo(src.getEndSeqNo()));
        



        return dest;
    }

    public static cl.bithaus.fix.ResendRequest fromFix(cl.bithaus.qfix.msg.ResendRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.ResendRequest dest = new cl.bithaus.fix.ResendRequest();

        if(src.isSetBeginSeqNo())
            dest.setBeginSeqNo(src.getBeginSeqNo().getValue());

        if(src.isSetEndSeqNo())
            dest.setEndSeqNo(src.getEndSeqNo().getValue());




        return dest;

    }
}

