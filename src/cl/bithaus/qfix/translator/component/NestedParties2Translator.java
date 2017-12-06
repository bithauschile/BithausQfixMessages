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
 * Fix - Bithaus format component translator for NestedParties2
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

    public static cl.bithaus.fix.components.NestedParties2 fromFix(cl.bithaus.qfix.msg.component.NestedParties2 src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.NestedParties2 dest = new cl.bithaus.fix.components.NestedParties2();


        if(src.isSetNoNested2PartyIDs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoNested2PartyIDs().getField());
            List<cl.bithaus.fix.components.NestedParties2.NoNested2PartyIDs.NoNested2PartyIDsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.Nested2PartyID nested2PartyID = new cl.bithaus.qfix.fields.Nested2PartyID();
            cl.bithaus.qfix.fields.Nested2PartyIDSource nested2PartyIDSource = new cl.bithaus.qfix.fields.Nested2PartyIDSource();
            cl.bithaus.qfix.fields.Nested2PartyRole nested2PartyRole = new cl.bithaus.qfix.fields.Nested2PartyRole();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.NestedParties2.NoNested2PartyIDs.NoNested2PartyIDsEntry entry = 
                    new cl.bithaus.fix.components.NestedParties2.NoNested2PartyIDs.NoNested2PartyIDsEntry();

                if(g.isSetField(nested2PartyID)) {
                    nested2PartyID = (cl.bithaus.qfix.fields.Nested2PartyID) g.getField(nested2PartyID);
                    entry.setNested2PartyID(nested2PartyID.getValue());

                }
                if(g.isSetField(nested2PartyIDSource)) {
                    nested2PartyIDSource = (cl.bithaus.qfix.fields.Nested2PartyIDSource) g.getField(nested2PartyIDSource);
                    entry.setNested2PartyIDSource(nested2PartyIDSource.getValue()+"");
                }
                if(g.isSetField(nested2PartyRole)) {
                    nested2PartyRole = (cl.bithaus.qfix.fields.Nested2PartyRole) g.getField(nested2PartyRole);
                    entry.setNested2PartyRole(nested2PartyRole.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

