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
public class DiscretionInstructionsTranslator  {

    public static cl.bithaus.qfix.msg.component.DiscretionInstructions toFix(cl.bithaus.fix.components.DiscretionInstructions src) {

        cl.bithaus.qfix.msg.component.DiscretionInstructions dest = new cl.bithaus.qfix.msg.component.DiscretionInstructions();

        if(src.getDiscretionInst() != null)
            if(src.getDiscretionInst().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.DiscretionInst(src.getDiscretionInst().charAt(0)));
            
        if(src.getDiscretionOffsetValue() != null)
            dest.set(new cl.bithaus.qfix.fields.DiscretionOffsetValue(src.getDiscretionOffsetValue().floatValue()));
            
        if(src.getDiscretionMoveType() != null)
            dest.set(new cl.bithaus.qfix.fields.DiscretionMoveType(src.getDiscretionMoveType()));
            
        if(src.getDiscretionOffsetType() != null)
            dest.set(new cl.bithaus.qfix.fields.DiscretionOffsetType(src.getDiscretionOffsetType()));
            
        if(src.getDiscretionLimitType() != null)
            dest.set(new cl.bithaus.qfix.fields.DiscretionLimitType(src.getDiscretionLimitType()));
            
        if(src.getDiscretionRoundDirection() != null)
            dest.set(new cl.bithaus.qfix.fields.DiscretionRoundDirection(src.getDiscretionRoundDirection()));
            
        if(src.getDiscretionScope() != null)
            dest.set(new cl.bithaus.qfix.fields.DiscretionScope(src.getDiscretionScope()));
            


        return dest;
    }


}

