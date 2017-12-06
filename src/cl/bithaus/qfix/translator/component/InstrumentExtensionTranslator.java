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
public class InstrumentExtensionTranslator  {

    public static cl.bithaus.qfix.msg.component.InstrumentExtension toFix(cl.bithaus.fix.components.InstrumentExtension src) {

        cl.bithaus.qfix.msg.component.InstrumentExtension dest = new cl.bithaus.qfix.msg.component.InstrumentExtension();

        if(src.getDeliveryForm() != null)
            dest.set(new cl.bithaus.qfix.fields.DeliveryForm(src.getDeliveryForm()));
            
        if(src.getPctAtRisk() != null)
            dest.set(new cl.bithaus.qfix.fields.PctAtRisk(src.getPctAtRisk().doubleValue()));
            

        if(src.getNoInstrAttrib() != null && src.getNoInstrAttrib().size() > 0) {

            for(cl.bithaus.fix.components.InstrumentExtension.NoInstrAttrib.NoInstrAttribEntry entry : src.getNoInstrAttrib().getGroups()) {

                cl.bithaus.qfix.msg.component.InstrumentExtension.NoInstrAttrib aux = 
                    new cl.bithaus.qfix.msg.component.InstrumentExtension.NoInstrAttrib();

                aux.set(new cl.bithaus.qfix.fields.InstrAttribType(entry.getInstrAttribType()));
                aux.set(new cl.bithaus.qfix.fields.InstrAttribValue(entry.getInstrAttribValue()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

