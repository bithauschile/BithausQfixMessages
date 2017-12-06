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
 * Fix - Bithaus format component translator for Stipulations
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class StipulationsTranslator  {

    public static cl.bithaus.qfix.msg.component.Stipulations toFix(cl.bithaus.fix.components.Stipulations src) {

        cl.bithaus.qfix.msg.component.Stipulations dest = new cl.bithaus.qfix.msg.component.Stipulations();


        if(src.getNoStipulations() != null && src.getNoStipulations().size() > 0) {

            for(cl.bithaus.fix.components.Stipulations.NoStipulations.NoStipulationsEntry entry : src.getNoStipulations().getGroups()) {

                cl.bithaus.qfix.msg.component.Stipulations.NoStipulations aux = 
                    new cl.bithaus.qfix.msg.component.Stipulations.NoStipulations();

                aux.set(new cl.bithaus.qfix.fields.StipulationType(entry.getStipulationType()));
                aux.set(new cl.bithaus.qfix.fields.StipulationValue(entry.getStipulationValue()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }

    public static cl.bithaus.fix.components.Stipulations fromFix(cl.bithaus.qfix.msg.component.Stipulations src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.Stipulations dest = new cl.bithaus.fix.components.Stipulations();



        if(src.isSetNoStipulations()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoStipulations().getField());
            List<cl.bithaus.fix.components.Stipulations.NoStipulations.NoStipulationsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.StipulationType stipulationType = new cl.bithaus.qfix.fields.StipulationType();
            cl.bithaus.qfix.fields.StipulationValue stipulationValue = new cl.bithaus.qfix.fields.StipulationValue();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.Stipulations.NoStipulations.NoStipulationsEntry entry = 
                    new cl.bithaus.fix.components.Stipulations.NoStipulations.NoStipulationsEntry();

                if(g.isSetField(stipulationType)) {
                    stipulationType = (cl.bithaus.qfix.fields.StipulationType) g.getField(stipulationType);
                    entry.setStipulationType(stipulationType.getValue());

                }
                if(g.isSetField(stipulationValue)) {
                    stipulationValue = (cl.bithaus.qfix.fields.StipulationValue) g.getField(stipulationValue);
                    entry.setStipulationValue(stipulationValue.getValue());

                }

                result.add(entry);                
            }

 
        }

        return dest;

    }
}

