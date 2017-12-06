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
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import quickfix.FieldNotFound;


/**
 * Fix - Bithaus format component translator for PegInstructions
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class PegInstructionsTranslator  {

    public static cl.bithaus.qfix.msg.component.PegInstructions toFix(cl.bithaus.fix.components.PegInstructions src) {

        cl.bithaus.qfix.msg.component.PegInstructions dest = new cl.bithaus.qfix.msg.component.PegInstructions();

        if(src.getPegOffsetValue() != null)
            dest.set(new cl.bithaus.qfix.fields.PegOffsetValue(src.getPegOffsetValue().floatValue()));
            


        return dest;
    }

    public static cl.bithaus.fix.components.PegInstructions fromFix(cl.bithaus.qfix.msg.component.PegInstructions src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.PegInstructions dest = new cl.bithaus.fix.components.PegInstructions();

        if(src.isSetPegOffsetValue())
            dest.setPegOffsetValue(new BigDecimal(src.getPegOffsetValue().getValue()));
            



        return dest;

    }
}

