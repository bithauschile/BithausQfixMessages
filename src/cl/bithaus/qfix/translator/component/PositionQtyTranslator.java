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
public class PositionQtyTranslator  {

    public static cl.bithaus.qfix.msg.component.PositionQty toFix(cl.bithaus.fix.components.PositionQty src) {

        cl.bithaus.qfix.msg.component.PositionQty dest = new cl.bithaus.qfix.msg.component.PositionQty();


        if(src.getNoPositions() != null && src.getNoPositions().size() > 0) {

            for(cl.bithaus.fix.components.PositionQty.NoPositions.NoPositionsEntry entry : src.getNoPositions().getGroups()) {

                cl.bithaus.qfix.msg.component.PositionQty.NoPositions aux = 
                    new cl.bithaus.qfix.msg.component.PositionQty.NoPositions();

                aux.set(new cl.bithaus.qfix.fields.PosType(entry.getPosType()));
                aux.set(new cl.bithaus.qfix.fields.LongQty(entry.getLongQty()));
                aux.set(new cl.bithaus.qfix.fields.ShortQty(entry.getShortQty()));
                aux.set(new cl.bithaus.qfix.fields.PosQtyStatus(entry.getPosQtyStatus()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

