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
public class SettlInstructionsDataTranslator  {

    public static cl.bithaus.qfix.msg.component.SettlInstructionsData toFix(cl.bithaus.fix.components.SettlInstructionsData src) {

        cl.bithaus.qfix.msg.component.SettlInstructionsData dest = new cl.bithaus.qfix.msg.component.SettlInstructionsData();

        if(src.getSettlDeliveryType() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlDeliveryType(src.getSettlDeliveryType()));
            
        if(src.getStandInstDbType() != null)
            dest.set(new cl.bithaus.qfix.fields.StandInstDbType(src.getStandInstDbType()));
            
        if(src.getStandInstDbName() != null)
            dest.set(new cl.bithaus.qfix.fields.StandInstDbName(src.getStandInstDbName()));
            
        if(src.getStandInstDbID() != null)
            dest.set(new cl.bithaus.qfix.fields.StandInstDbID(src.getStandInstDbID()));
            

        if(src.getNoDlvyInst() != null && src.getNoDlvyInst().size() > 0) {

            for(cl.bithaus.fix.components.SettlInstructionsData.NoDlvyInst.NoDlvyInstEntry entry : src.getNoDlvyInst().getGroups()) {

                cl.bithaus.qfix.msg.component.SettlInstructionsData.NoDlvyInst aux = 
                    new cl.bithaus.qfix.msg.component.SettlInstructionsData.NoDlvyInst();

                if(entry.getSettlInstSource().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.SettlInstSource(entry.getSettlInstSource().charAt(0)));
                if(entry.getDlvyInstType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.DlvyInstType(entry.getDlvyInstType().charAt(0)));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

