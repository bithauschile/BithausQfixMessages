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
 * Fix - Bithaus format component translator for Parties
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

    public static cl.bithaus.fix.components.Parties fromFix(cl.bithaus.qfix.msg.component.Parties src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.Parties dest = new cl.bithaus.fix.components.Parties();


        if(src.isSetNoPartyIDs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoPartyIDs().getField());
            List<cl.bithaus.fix.components.Parties.NoPartyIDs.NoPartyIDsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.PartyID partyID = new cl.bithaus.qfix.fields.PartyID();
            cl.bithaus.qfix.fields.PartyIDSource partyIDSource = new cl.bithaus.qfix.fields.PartyIDSource();
            cl.bithaus.qfix.fields.PartyRole partyRole = new cl.bithaus.qfix.fields.PartyRole();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.Parties.NoPartyIDs.NoPartyIDsEntry entry = 
                    new cl.bithaus.fix.components.Parties.NoPartyIDs.NoPartyIDsEntry();

                if(g.isSetField(partyID)) {
                    partyID = (cl.bithaus.qfix.fields.PartyID) g.getField(partyID);
                    entry.setPartyID(partyID.getValue());

                }
                if(g.isSetField(partyIDSource)) {
                    partyIDSource = (cl.bithaus.qfix.fields.PartyIDSource) g.getField(partyIDSource);
                    entry.setPartyIDSource(partyIDSource.getValue()+"");
                }
                if(g.isSetField(partyRole)) {
                    partyRole = (cl.bithaus.qfix.fields.PartyRole) g.getField(partyRole);
                    entry.setPartyRole(partyRole.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

