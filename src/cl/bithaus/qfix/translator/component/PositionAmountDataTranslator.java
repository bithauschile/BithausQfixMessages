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
 * Fix - Bithaus format component translator for PositionAmountData
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

    public static cl.bithaus.fix.components.PositionAmountData fromFix(cl.bithaus.qfix.msg.component.PositionAmountData src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.PositionAmountData dest = new cl.bithaus.fix.components.PositionAmountData();



        if(src.isSetNoPosAmt()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoPosAmt().getField());
            List<cl.bithaus.fix.components.PositionAmountData.NoPosAmt.NoPosAmtEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.PosAmtType posAmtType = new cl.bithaus.qfix.fields.PosAmtType();
            cl.bithaus.qfix.fields.PosAmt posAmt = new cl.bithaus.qfix.fields.PosAmt();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.PositionAmountData.NoPosAmt.NoPosAmtEntry entry = 
                    new cl.bithaus.fix.components.PositionAmountData.NoPosAmt.NoPosAmtEntry();

                if(g.isSetField(posAmtType)) {
                    posAmtType = (cl.bithaus.qfix.fields.PosAmtType) g.getField(posAmtType);
                    entry.setPosAmtType(posAmtType.getValue());

                }
                if(g.isSetField(posAmt)) {
                    posAmt = (cl.bithaus.qfix.fields.PosAmt) g.getField(posAmt);
                    entry.setPosAmt(posAmt.getValue());

                }

                result.add(entry);                
            }

 
        }

        return dest;

    }
}

