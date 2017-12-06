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
 * Fix - Bithaus format component translator for UnderlyingStipulations
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class UnderlyingStipulationsTranslator  {

    public static cl.bithaus.qfix.msg.component.UnderlyingStipulations toFix(cl.bithaus.fix.components.UnderlyingStipulations src) {

        cl.bithaus.qfix.msg.component.UnderlyingStipulations dest = new cl.bithaus.qfix.msg.component.UnderlyingStipulations();


        if(src.getNoUnderlyingStips() != null && src.getNoUnderlyingStips().size() > 0) {

            for(cl.bithaus.fix.components.UnderlyingStipulations.NoUnderlyingStips.NoUnderlyingStipsEntry entry : src.getNoUnderlyingStips().getGroups()) {

                cl.bithaus.qfix.msg.component.UnderlyingStipulations.NoUnderlyingStips aux = 
                    new cl.bithaus.qfix.msg.component.UnderlyingStipulations.NoUnderlyingStips();

                aux.set(new cl.bithaus.qfix.fields.UnderlyingStipType(entry.getUnderlyingStipType()));
                aux.set(new cl.bithaus.qfix.fields.UnderlyingStipValue(entry.getUnderlyingStipValue()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }

    public static cl.bithaus.fix.components.UnderlyingStipulations fromFix(cl.bithaus.qfix.msg.component.UnderlyingStipulations src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.UnderlyingStipulations dest = new cl.bithaus.fix.components.UnderlyingStipulations();


        if(src.isSetNoUnderlyingStips()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyingStips().getField());
            List<cl.bithaus.fix.components.UnderlyingStipulations.NoUnderlyingStips.NoUnderlyingStipsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.UnderlyingStipType underlyingStipType = new cl.bithaus.qfix.fields.UnderlyingStipType();
            cl.bithaus.qfix.fields.UnderlyingStipValue underlyingStipValue = new cl.bithaus.qfix.fields.UnderlyingStipValue();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.UnderlyingStipulations.NoUnderlyingStips.NoUnderlyingStipsEntry entry = 
                    new cl.bithaus.fix.components.UnderlyingStipulations.NoUnderlyingStips.NoUnderlyingStipsEntry();

                if(g.isSetField(underlyingStipType)) {
                    underlyingStipType = (cl.bithaus.qfix.fields.UnderlyingStipType) g.getField(underlyingStipType);
                    entry.setUnderlyingStipType(underlyingStipType.getValue());

                }
                if(g.isSetField(underlyingStipValue)) {
                    underlyingStipValue = (cl.bithaus.qfix.fields.UnderlyingStipValue) g.getField(underlyingStipValue);
                    entry.setUnderlyingStipValue(underlyingStipValue.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

