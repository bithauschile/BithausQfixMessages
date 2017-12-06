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
 * Fix - Bithaus format component translator for InstrumentExtension
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

    public static cl.bithaus.fix.components.InstrumentExtension fromFix(cl.bithaus.qfix.msg.component.InstrumentExtension src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.InstrumentExtension dest = new cl.bithaus.fix.components.InstrumentExtension();

        if(src.isSetDeliveryForm())
            dest.setDeliveryForm(src.getDeliveryForm().getValue());
        if(src.isSetPctAtRisk())
            dest.setPctAtRisk(new BigDecimal(src.getPctAtRisk().getValue()));

        if(src.isSetNoInstrAttrib()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoInstrAttrib().getField());
            List<cl.bithaus.fix.components.InstrumentExtension.NoInstrAttrib.NoInstrAttribEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.InstrAttribType instrAttribType = new cl.bithaus.qfix.fields.InstrAttribType();
            cl.bithaus.qfix.fields.InstrAttribValue instrAttribValue = new cl.bithaus.qfix.fields.InstrAttribValue();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.InstrumentExtension.NoInstrAttrib.NoInstrAttribEntry entry = 
                    new cl.bithaus.fix.components.InstrumentExtension.NoInstrAttrib.NoInstrAttribEntry();

                if(g.isSetField(instrAttribType)) {
                    instrAttribType = (cl.bithaus.qfix.fields.InstrAttribType) g.getField(instrAttribType);
                    entry.setInstrAttribType(instrAttribType.getValue());

                }
                if(g.isSetField(instrAttribValue)) {
                    instrAttribValue = (cl.bithaus.qfix.fields.InstrAttribValue) g.getField(instrAttribValue);
                    entry.setInstrAttribValue(instrAttribValue.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

