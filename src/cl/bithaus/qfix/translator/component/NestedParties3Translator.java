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
public class NestedParties3Translator  {

    public static cl.bithaus.qfix.msg.component.NestedParties3 toFix(cl.bithaus.fix.components.NestedParties3 src) {

        cl.bithaus.qfix.msg.component.NestedParties3 dest = new cl.bithaus.qfix.msg.component.NestedParties3();


        if(src.getNoNested3PartyIDs() != null && src.getNoNested3PartyIDs().size() > 0) {

            for(cl.bithaus.fix.components.NestedParties3.NoNested3PartyIDs.NoNested3PartyIDsEntry entry : src.getNoNested3PartyIDs().getGroups()) {

                cl.bithaus.qfix.msg.component.NestedParties3.NoNested3PartyIDs aux = 
                    new cl.bithaus.qfix.msg.component.NestedParties3.NoNested3PartyIDs();

                aux.set(new cl.bithaus.qfix.fields.Nested3PartyID(entry.getNested3PartyID()));
                if(entry.getNested3PartyIDSource().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Nested3PartyIDSource(entry.getNested3PartyIDSource().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.Nested3PartyRole(entry.getNested3PartyRole()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

