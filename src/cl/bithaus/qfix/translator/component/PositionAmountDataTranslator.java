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
public class PositionAmountDataTranslator  {

    public static cl.bithaus.qfix.msg.component.PositionAmountData toFix(cl.bithaus.fix.components.PositionAmountData src) {

        cl.bithaus.qfix.msg.component.PositionAmountData dest = new cl.bithaus.qfix.msg.component.PositionAmountData();


        if(src.getNoPosAmt() != null && src.getNoPosAmt().size() > 0) {

            for(cl.bithaus.fix.components.PositionAmountData.NoPosAmt.NoPosAmtEntry entry : src.getNoPosAmt().getGroups()) {

                cl.bithaus.qfix.msg.component.PositionAmountData.NoPosAmt aux = 
                    new cl.bithaus.qfix.msg.component.PositionAmountData.NoPosAmt();

                aux.set(new cl.bithaus.qfix.fields.PosAmtType(entry.getPosAmtType()));
                aux.set(new cl.bithaus.qfix.fields.PosAmt(entry.getPosAmt()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

