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
public class NestedParties2Translator  {

    public static cl.bithaus.qfix.msg.component.NestedParties2 toFix(cl.bithaus.fix.components.NestedParties2 src) {

        cl.bithaus.qfix.msg.component.NestedParties2 dest = new cl.bithaus.qfix.msg.component.NestedParties2();


        if(src.getNoNested2PartyIDs() != null && src.getNoNested2PartyIDs().size() > 0) {

            for(cl.bithaus.fix.components.NestedParties2.NoNested2PartyIDs.NoNested2PartyIDsEntry entry : src.getNoNested2PartyIDs().getGroups()) {

                cl.bithaus.qfix.msg.component.NestedParties2.NoNested2PartyIDs aux = 
                    new cl.bithaus.qfix.msg.component.NestedParties2.NoNested2PartyIDs();

                aux.set(new cl.bithaus.qfix.fields.Nested2PartyID(entry.getNested2PartyID()));
                if(entry.getNested2PartyIDSource().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Nested2PartyIDSource(entry.getNested2PartyIDSource().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.Nested2PartyRole(entry.getNested2PartyRole()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

