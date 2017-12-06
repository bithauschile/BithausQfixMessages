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
 * Fix - Bithaus format component translator for NetworkStatusResponse
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class NetworkStatusResponseTranslator  {

    public static cl.bithaus.qfix.msg.NetworkStatusResponse toFix(cl.bithaus.fix.NetworkStatusResponse src) {

        cl.bithaus.qfix.msg.NetworkStatusResponse dest = new cl.bithaus.qfix.msg.NetworkStatusResponse();

        if(src.getNetworkStatusResponseType() != null)
            dest.set(new cl.bithaus.qfix.fields.NetworkStatusResponseType(src.getNetworkStatusResponseType()));
        
        if(src.getNetworkRequestID() != null)
            dest.set(new cl.bithaus.qfix.fields.NetworkRequestID(src.getNetworkRequestID()));
        
        if(src.getNetworkResponseID() != null)
            dest.set(new cl.bithaus.qfix.fields.NetworkResponseID(src.getNetworkResponseID()));
        
        if(src.getLastNetworkResponseID() != null)
            dest.set(new cl.bithaus.qfix.fields.LastNetworkResponseID(src.getLastNetworkResponseID()));
        


        if(src.getNoCompIDs() != null && src.getNoCompIDs().size() > 0) {

            for(cl.bithaus.fix.NetworkStatusResponse.NoCompIDs.NoCompIDsEntry entry : src.getNoCompIDs().getGroups()) {

                cl.bithaus.qfix.msg.NetworkStatusResponse.NoCompIDs aux = 
                    new cl.bithaus.qfix.msg.NetworkStatusResponse.NoCompIDs();

                aux.set(new cl.bithaus.qfix.fields.RefCompID(entry.getRefCompID()));
                aux.set(new cl.bithaus.qfix.fields.RefSubID(entry.getRefSubID()));
                aux.set(new cl.bithaus.qfix.fields.LocationID(entry.getLocationID()));
                aux.set(new cl.bithaus.qfix.fields.DeskID(entry.getDeskID()));
                aux.set(new cl.bithaus.qfix.fields.StatusValue(entry.getStatusValue()));
                aux.set(new cl.bithaus.qfix.fields.StatusText(entry.getStatusText()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.NetworkStatusResponse fromFix(cl.bithaus.qfix.msg.NetworkStatusResponse src) 
        throws FieldNotFound {

        cl.bithaus.fix.NetworkStatusResponse dest = new cl.bithaus.fix.NetworkStatusResponse();

        if(src.isSetNetworkStatusResponseType())
            dest.setNetworkStatusResponseType(src.getNetworkStatusResponseType().getValue());

        if(src.isSetNetworkRequestID())
            dest.setNetworkRequestID(src.getNetworkRequestID().getValue());

        if(src.isSetNetworkResponseID())
            dest.setNetworkResponseID(src.getNetworkResponseID().getValue());

        if(src.isSetLastNetworkResponseID())
            dest.setLastNetworkResponseID(src.getLastNetworkResponseID().getValue());




        if(src.isSetNoCompIDs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoCompIDs().getField());
            List<cl.bithaus.fix.NetworkStatusResponse.NoCompIDs.NoCompIDsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.RefCompID refCompID = new cl.bithaus.qfix.fields.RefCompID();
            cl.bithaus.qfix.fields.RefSubID refSubID = new cl.bithaus.qfix.fields.RefSubID();
            cl.bithaus.qfix.fields.LocationID locationID = new cl.bithaus.qfix.fields.LocationID();
            cl.bithaus.qfix.fields.DeskID deskID = new cl.bithaus.qfix.fields.DeskID();
            cl.bithaus.qfix.fields.StatusValue statusValue = new cl.bithaus.qfix.fields.StatusValue();
            cl.bithaus.qfix.fields.StatusText statusText = new cl.bithaus.qfix.fields.StatusText();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.NetworkStatusResponse.NoCompIDs.NoCompIDsEntry entry = 
                    new cl.bithaus.fix.NetworkStatusResponse.NoCompIDs.NoCompIDsEntry();

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
                if(g.isSetField(statusValue)) {
                    statusValue = (cl.bithaus.qfix.fields.StatusValue) g.getField(statusValue);
                    entry.setStatusValue(statusValue.getValue());

                }
                if(g.isSetField(statusText)) {
                    statusText = (cl.bithaus.qfix.fields.StatusText) g.getField(statusText);
                    entry.setStatusText(statusText.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

