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

package cl.bithaus.qfix.translator;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import quickfix.FieldNotFound;


/**
 * Fix - Bithaus format component translator for NetworkStatusRequest
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class NetworkStatusRequestTranslator  {

    public static cl.bithaus.qfix.msg.NetworkStatusRequest toFix(cl.bithaus.fix.NetworkStatusRequest src) {

        cl.bithaus.qfix.msg.NetworkStatusRequest dest = new cl.bithaus.qfix.msg.NetworkStatusRequest();

        if(src.getNetworkRequestType() != null)
            dest.set(new cl.bithaus.qfix.fields.NetworkRequestType(src.getNetworkRequestType()));
        
        if(src.getNetworkRequestID() != null)
            dest.set(new cl.bithaus.qfix.fields.NetworkRequestID(src.getNetworkRequestID()));
        


        if(src.getNoCompIDs() != null && src.getNoCompIDs().size() > 0) {

            for(cl.bithaus.fix.NetworkStatusRequest.NoCompIDs.NoCompIDsEntry entry : src.getNoCompIDs().getGroups()) {

                cl.bithaus.qfix.msg.NetworkStatusRequest.NoCompIDs aux = 
                    new cl.bithaus.qfix.msg.NetworkStatusRequest.NoCompIDs();

                aux.set(new cl.bithaus.qfix.fields.RefCompID(entry.getRefCompID()));
                aux.set(new cl.bithaus.qfix.fields.RefSubID(entry.getRefSubID()));
                aux.set(new cl.bithaus.qfix.fields.LocationID(entry.getLocationID()));
                aux.set(new cl.bithaus.qfix.fields.DeskID(entry.getDeskID()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.NetworkStatusRequest fromFix(cl.bithaus.qfix.msg.NetworkStatusRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.NetworkStatusRequest dest = new cl.bithaus.fix.NetworkStatusRequest();

        if(src.isSetNetworkRequestType())
            dest.setNetworkRequestType(src.getNetworkRequestType().getValue());

        if(src.isSetNetworkRequestID())
            dest.setNetworkRequestID(src.getNetworkRequestID().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"


        if(src.isSetNoCompIDs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoCompIDs().getField());
            List<cl.bithaus.fix.NetworkStatusRequest.NoCompIDs.NoCompIDsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.RefCompID refCompID = new cl.bithaus.qfix.fields.RefCompID();
            cl.bithaus.qfix.fields.RefSubID refSubID = new cl.bithaus.qfix.fields.RefSubID();
            cl.bithaus.qfix.fields.LocationID locationID = new cl.bithaus.qfix.fields.LocationID();
            cl.bithaus.qfix.fields.DeskID deskID = new cl.bithaus.qfix.fields.DeskID();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.NetworkStatusRequest.NoCompIDs.NoCompIDsEntry entry = 
                    new cl.bithaus.fix.NetworkStatusRequest.NoCompIDs.NoCompIDsEntry();

                if(g.isSetField(refCompID)) {
                    refCompID = (cl.bithaus.qfix.fields.RefCompID) g.getField(refCompID);
                    entry.setRefCompID(refCompID.getValue());

                }
                if(g.isSetField(refSubID)) {
                    refSubID = (cl.bithaus.qfix.fields.RefSubID) g.getField(refSubID);
                    entry.setRefSubID(refSubID.getValue());

                }
                if(g.isSetField(locationID)) {
                    locationID = (cl.bithaus.qfix.fields.LocationID) g.getField(locationID);
                    entry.setLocationID(locationID.getValue());

                }
                if(g.isSetField(deskID)) {
                    deskID = (cl.bithaus.qfix.fields.DeskID) g.getField(deskID);
                    entry.setDeskID(deskID.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

