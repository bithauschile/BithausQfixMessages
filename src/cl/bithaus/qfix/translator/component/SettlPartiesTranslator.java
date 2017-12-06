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
 * Fix - Bithaus format component translator for SettlParties
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

    public static cl.bithaus.fix.components.SettlParties fromFix(cl.bithaus.qfix.msg.component.SettlParties src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.SettlParties dest = new cl.bithaus.fix.components.SettlParties();



        if(src.isSetNoSettlPartyIDs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoSettlPartyIDs().getField());
            List<cl.bithaus.fix.components.SettlParties.NoSettlPartyIDs.NoSettlPartyIDsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.SettlPartyID settlPartyID = new cl.bithaus.qfix.fields.SettlPartyID();
            cl.bithaus.qfix.fields.SettlPartyIDSource settlPartyIDSource = new cl.bithaus.qfix.fields.SettlPartyIDSource();
            cl.bithaus.qfix.fields.SettlPartyRole settlPartyRole = new cl.bithaus.qfix.fields.SettlPartyRole();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.SettlParties.NoSettlPartyIDs.NoSettlPartyIDsEntry entry = 
                    new cl.bithaus.fix.components.SettlParties.NoSettlPartyIDs.NoSettlPartyIDsEntry();

                if(g.isSetField(settlPartyID)) {
                    settlPartyID = (cl.bithaus.qfix.fields.SettlPartyID) g.getField(settlPartyID);
                    entry.setSettlPartyID(settlPartyID.getValue());

                }
                if(g.isSetField(settlPartyIDSource)) {
                    settlPartyIDSource = (cl.bithaus.qfix.fields.SettlPartyIDSource) g.getField(settlPartyIDSource);
                    entry.setSettlPartyIDSource(settlPartyIDSource.getValue()+"");
                }
                if(g.isSetField(settlPartyRole)) {
                    settlPartyRole = (cl.bithaus.qfix.fields.SettlPartyRole) g.getField(settlPartyRole);
                    entry.setSettlPartyRole(settlPartyRole.getValue());

                }

                result.add(entry);                
            }

 
        }

        return dest;

    }
}

