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
 * Fix - Bithaus format component translator for NestedParties3
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

    public static cl.bithaus.fix.components.NestedParties3 fromFix(cl.bithaus.qfix.msg.component.NestedParties3 src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.NestedParties3 dest = new cl.bithaus.fix.components.NestedParties3();



        if(src.isSetNoNested3PartyIDs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoNested3PartyIDs().getField());
            List<cl.bithaus.fix.components.NestedParties3.NoNested3PartyIDs.NoNested3PartyIDsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.Nested3PartyID nested3PartyID = new cl.bithaus.qfix.fields.Nested3PartyID();
            cl.bithaus.qfix.fields.Nested3PartyIDSource nested3PartyIDSource = new cl.bithaus.qfix.fields.Nested3PartyIDSource();
            cl.bithaus.qfix.fields.Nested3PartyRole nested3PartyRole = new cl.bithaus.qfix.fields.Nested3PartyRole();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.NestedParties3.NoNested3PartyIDs.NoNested3PartyIDsEntry entry = 
                    new cl.bithaus.fix.components.NestedParties3.NoNested3PartyIDs.NoNested3PartyIDsEntry();

                if(g.isSetField(nested3PartyID)) {
                    nested3PartyID = (cl.bithaus.qfix.fields.Nested3PartyID) g.getField(nested3PartyID);
                    entry.setNested3PartyID(nested3PartyID.getValue());

                }
                if(g.isSetField(nested3PartyIDSource)) {
                    nested3PartyIDSource = (cl.bithaus.qfix.fields.Nested3PartyIDSource) g.getField(nested3PartyIDSource);
                    entry.setNested3PartyIDSource(nested3PartyIDSource.getValue()+"");
                }
                if(g.isSetField(nested3PartyRole)) {
                    nested3PartyRole = (cl.bithaus.qfix.fields.Nested3PartyRole) g.getField(nested3PartyRole);
                    entry.setNested3PartyRole(nested3PartyRole.getValue());

                }

                result.add(entry);                
            }

 
        }

        return dest;

    }
}

