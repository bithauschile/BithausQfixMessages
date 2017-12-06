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
public class SettlPartiesTranslator  {

    public static cl.bithaus.qfix.msg.component.SettlParties toFix(cl.bithaus.fix.components.SettlParties src) {

        cl.bithaus.qfix.msg.component.SettlParties dest = new cl.bithaus.qfix.msg.component.SettlParties();


        if(src.getNoSettlPartyIDs() != null && src.getNoSettlPartyIDs().size() > 0) {

            for(cl.bithaus.fix.components.SettlParties.NoSettlPartyIDs.NoSettlPartyIDsEntry entry : src.getNoSettlPartyIDs().getGroups()) {

                cl.bithaus.qfix.msg.component.SettlParties.NoSettlPartyIDs aux = 
                    new cl.bithaus.qfix.msg.component.SettlParties.NoSettlPartyIDs();

                aux.set(new cl.bithaus.qfix.fields.SettlPartyID(entry.getSettlPartyID()));
                if(entry.getSettlPartyIDSource().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.SettlPartyIDSource(entry.getSettlPartyIDSource().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.SettlPartyRole(entry.getSettlPartyRole()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

