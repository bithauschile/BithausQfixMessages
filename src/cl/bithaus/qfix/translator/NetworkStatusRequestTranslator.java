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

/**
 * Fix Components Class
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


}

