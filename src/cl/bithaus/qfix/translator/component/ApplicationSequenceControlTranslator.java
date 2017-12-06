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
public class ApplicationSequenceControlTranslator  {

    public static cl.bithaus.qfix.msg.component.ApplicationSequenceControl toFix(cl.bithaus.fix.components.ApplicationSequenceControl src) {

        cl.bithaus.qfix.msg.component.ApplicationSequenceControl dest = new cl.bithaus.qfix.msg.component.ApplicationSequenceControl();

        if(src.getApplID() != null)
            dest.set(new cl.bithaus.qfix.fields.ApplID(src.getApplID()));
            
        if(src.getApplSeqNum() != null)
            dest.set(new cl.bithaus.qfix.fields.ApplSeqNum(src.getApplSeqNum()));
            
        if(src.getApplLastSeqNum() != null)
            dest.set(new cl.bithaus.qfix.fields.ApplLastSeqNum(src.getApplLastSeqNum()));
            
        if(src.getApplResendFlag() != null)
            dest.set(new cl.bithaus.qfix.fields.ApplResendFlag(src.getApplResendFlag()));
            


        return dest;
    }


}

