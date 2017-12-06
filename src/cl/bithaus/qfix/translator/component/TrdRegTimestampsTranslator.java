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
public class TrdRegTimestampsTranslator  {

    public static cl.bithaus.qfix.msg.component.TrdRegTimestamps toFix(cl.bithaus.fix.components.TrdRegTimestamps src) {

        cl.bithaus.qfix.msg.component.TrdRegTimestamps dest = new cl.bithaus.qfix.msg.component.TrdRegTimestamps();


        if(src.getNoTrdRegTimestamps() != null && src.getNoTrdRegTimestamps().size() > 0) {

            for(cl.bithaus.fix.components.TrdRegTimestamps.NoTrdRegTimestamps.NoTrdRegTimestampsEntry entry : src.getNoTrdRegTimestamps().getGroups()) {

                cl.bithaus.qfix.msg.component.TrdRegTimestamps.NoTrdRegTimestamps aux = 
                    new cl.bithaus.qfix.msg.component.TrdRegTimestamps.NoTrdRegTimestamps();

                aux.set(new cl.bithaus.qfix.fields.TrdRegTimestamp(entry.getTrdRegTimestamp()));
                aux.set(new cl.bithaus.qfix.fields.TrdRegTimestampType(entry.getTrdRegTimestampType()));
                aux.set(new cl.bithaus.qfix.fields.TrdRegTimestampOrigin(entry.getTrdRegTimestampOrigin()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

