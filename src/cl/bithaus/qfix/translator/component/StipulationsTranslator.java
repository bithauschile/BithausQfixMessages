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


}

