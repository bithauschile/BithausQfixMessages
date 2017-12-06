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
public class NestedPartiesTranslator  {

    public static cl.bithaus.qfix.msg.component.NestedParties toFix(cl.bithaus.fix.components.NestedParties src) {

        cl.bithaus.qfix.msg.component.NestedParties dest = new cl.bithaus.qfix.msg.component.NestedParties();


        if(src.getNoNestedPartyIDs() != null && src.getNoNestedPartyIDs().size() > 0) {

            for(cl.bithaus.fix.components.NestedParties.NoNestedPartyIDs.NoNestedPartyIDsEntry entry : src.getNoNestedPartyIDs().getGroups()) {

                cl.bithaus.qfix.msg.component.NestedParties.NoNestedPartyIDs aux = 
                    new cl.bithaus.qfix.msg.component.NestedParties.NoNestedPartyIDs();

                aux.set(new cl.bithaus.qfix.fields.NestedPartyID(entry.getNestedPartyID()));
                if(entry.getNestedPartyIDSource().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.NestedPartyIDSource(entry.getNestedPartyIDSource().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.NestedPartyRole(entry.getNestedPartyRole()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

