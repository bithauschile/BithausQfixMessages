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


}

