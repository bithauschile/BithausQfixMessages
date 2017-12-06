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
public class BusinessMessageRejectTranslator  {

    public static cl.bithaus.qfix.msg.BusinessMessageReject toFix(cl.bithaus.fix.BusinessMessageReject src) {

        cl.bithaus.qfix.msg.BusinessMessageReject dest = new cl.bithaus.qfix.msg.BusinessMessageReject();

        if(src.getRefSeqNum() != null)
            dest.set(new cl.bithaus.qfix.fields.RefSeqNum(src.getRefSeqNum()));
            
        if(src.getRefMsgType() != null)
            dest.set(new cl.bithaus.qfix.fields.RefMsgType(src.getRefMsgType()));
            
        if(src.getBusinessRejectRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.BusinessRejectRefID(src.getBusinessRejectRefID()));
            
        if(src.getBusinessRejectReason() != null)
            dest.set(new cl.bithaus.qfix.fields.BusinessRejectReason(src.getBusinessRejectReason()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            


        return dest;
    }


}

