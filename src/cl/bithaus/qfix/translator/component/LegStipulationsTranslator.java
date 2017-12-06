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
 * Fix - Bithaus format component translator for LegStipulations
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class LegStipulationsTranslator  {

    public static cl.bithaus.qfix.msg.component.LegStipulations toFix(cl.bithaus.fix.components.LegStipulations src) {

        cl.bithaus.qfix.msg.component.LegStipulations dest = new cl.bithaus.qfix.msg.component.LegStipulations();


        if(src.getNoLegStipulations() != null && src.getNoLegStipulations().size() > 0) {

            for(cl.bithaus.fix.components.LegStipulations.NoLegStipulations.NoLegStipulationsEntry entry : src.getNoLegStipulations().getGroups()) {

                cl.bithaus.qfix.msg.component.LegStipulations.NoLegStipulations aux = 
                    new cl.bithaus.qfix.msg.component.LegStipulations.NoLegStipulations();

                aux.set(new cl.bithaus.qfix.fields.LegStipulationType(entry.getLegStipulationType()));
                aux.set(new cl.bithaus.qfix.fields.LegStipulationValue(entry.getLegStipulationValue()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }

    public static cl.bithaus.fix.components.LegStipulations fromFix(cl.bithaus.qfix.msg.component.LegStipulations src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.LegStipulations dest = new cl.bithaus.fix.components.LegStipulations();



        if(src.isSetNoLegStipulations()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegStipulations().getField());
            List<cl.bithaus.fix.components.LegStipulations.NoLegStipulations.NoLegStipulationsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.LegStipulationType legStipulationType = new cl.bithaus.qfix.fields.LegStipulationType();
            cl.bithaus.qfix.fields.LegStipulationValue legStipulationValue = new cl.bithaus.qfix.fields.LegStipulationValue();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.LegStipulations.NoLegStipulations.NoLegStipulationsEntry entry = 
                    new cl.bithaus.fix.components.LegStipulations.NoLegStipulations.NoLegStipulationsEntry();

                if(g.isSetField(legStipulationType)) {
                    legStipulationType = (cl.bithaus.qfix.fields.LegStipulationType) g.getField(legStipulationType);
                    entry.setLegStipulationType(legStipulationType.getValue());

                }
                if(g.isSetField(legStipulationValue)) {
                    legStipulationValue = (cl.bithaus.qfix.fields.LegStipulationValue) g.getField(legStipulationValue);
                    entry.setLegStipulationValue(legStipulationValue.getValue());

                }

                result.add(entry);                
            }

 
        }

        return dest;

    }
}

