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
 * Fix - Bithaus format component translator for PositionQty
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

    public static cl.bithaus.fix.components.PositionQty fromFix(cl.bithaus.qfix.msg.component.PositionQty src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.PositionQty dest = new cl.bithaus.fix.components.PositionQty();


        if(src.isSetNoPositions()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoPositions().getField());
            List<cl.bithaus.fix.components.PositionQty.NoPositions.NoPositionsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.PosType posType = new cl.bithaus.qfix.fields.PosType();
            cl.bithaus.qfix.fields.LongQty longQty = new cl.bithaus.qfix.fields.LongQty();
            cl.bithaus.qfix.fields.ShortQty shortQty = new cl.bithaus.qfix.fields.ShortQty();
            cl.bithaus.qfix.fields.PosQtyStatus posQtyStatus = new cl.bithaus.qfix.fields.PosQtyStatus();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.PositionQty.NoPositions.NoPositionsEntry entry = 
                    new cl.bithaus.fix.components.PositionQty.NoPositions.NoPositionsEntry();

                if(g.isSetField(posType)) {
                    posType = (cl.bithaus.qfix.fields.PosType) g.getField(posType);
                    entry.setPosType(posType.getValue());

                }
                if(g.isSetField(longQty)) {
                    longQty = (cl.bithaus.qfix.fields.LongQty) g.getField(longQty);
                    entry.setLongQty(longQty.getValue());

                }
                if(g.isSetField(shortQty)) {
                    shortQty = (cl.bithaus.qfix.fields.ShortQty) g.getField(shortQty);
                    entry.setShortQty(shortQty.getValue());

                }
                if(g.isSetField(posQtyStatus)) {
                    posQtyStatus = (cl.bithaus.qfix.fields.PosQtyStatus) g.getField(posQtyStatus);
                    entry.setPosQtyStatus(posQtyStatus.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

