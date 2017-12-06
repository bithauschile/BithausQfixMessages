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
public class PartiesTranslator  {

    public static cl.bithaus.qfix.msg.component.Parties toFix(cl.bithaus.fix.components.Parties src) {

        cl.bithaus.qfix.msg.component.Parties dest = new cl.bithaus.qfix.msg.component.Parties();


        if(src.getNoPartyIDs() != null && src.getNoPartyIDs().size() > 0) {

            for(cl.bithaus.fix.components.Parties.NoPartyIDs.NoPartyIDsEntry entry : src.getNoPartyIDs().getGroups()) {

                cl.bithaus.qfix.msg.component.Parties.NoPartyIDs aux = 
                    new cl.bithaus.qfix.msg.component.Parties.NoPartyIDs();

                aux.set(new cl.bithaus.qfix.fields.PartyID(entry.getPartyID()));
                if(entry.getPartyIDSource().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.PartyIDSource(entry.getPartyIDSource().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.PartyRole(entry.getPartyRole()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

