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
 * Fix - Bithaus format component translator for SequenceReset
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class SequenceResetTranslator  {

    public static cl.bithaus.qfix.msg.SequenceReset toFix(cl.bithaus.fix.SequenceReset src) {

        cl.bithaus.qfix.msg.SequenceReset dest = new cl.bithaus.qfix.msg.SequenceReset();

        if(src.getGapFillFlag() != null)
            dest.set(new cl.bithaus.qfix.fields.GapFillFlag(src.getGapFillFlag()));
        
        if(src.getNewSeqNo() != null)
            dest.set(new cl.bithaus.qfix.fields.NewSeqNo(src.getNewSeqNo()));
        



        return dest;
    }

    public static cl.bithaus.fix.SequenceReset fromFix(cl.bithaus.qfix.msg.SequenceReset src) 
        throws FieldNotFound {

        cl.bithaus.fix.SequenceReset dest = new cl.bithaus.fix.SequenceReset();

        if(src.isSetGapFillFlag())
            dest.setGapFillFlag(src.getGapFillFlag().getValue());

        if(src.isSetNewSeqNo())
            dest.setNewSeqNo(src.getNewSeqNo().getValue());




        return dest;

    }
}

