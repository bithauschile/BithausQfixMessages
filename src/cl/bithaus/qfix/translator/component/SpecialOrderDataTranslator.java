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
public class SpecialOrderDataTranslator  {

    public static cl.bithaus.qfix.msg.component.SpecialOrderData toFix(cl.bithaus.fix.components.SpecialOrderData src) {

        cl.bithaus.qfix.msg.component.SpecialOrderData dest = new cl.bithaus.qfix.msg.component.SpecialOrderData();

        if(src.getSpecialOrderType() != null)
            if(src.getSpecialOrderType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SpecialOrderType(src.getSpecialOrderType().charAt(0)));
            
        if(src.getNumberOfOrders() != null)
            dest.set(new cl.bithaus.qfix.fields.NumberOfOrders(src.getNumberOfOrders()));
            
        if(src.getOrderNumber() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderNumber(src.getOrderNumber()));
            

        if(src.getNoSpecialOrderData() != null && src.getNoSpecialOrderData().size() > 0) {

            for(cl.bithaus.fix.components.SpecialOrderData.NoSpecialOrderData.NoSpecialOrderDataEntry entry : src.getNoSpecialOrderData().getGroups()) {

                cl.bithaus.qfix.msg.component.SpecialOrderData.NoSpecialOrderData aux = 
                    new cl.bithaus.qfix.msg.component.SpecialOrderData.NoSpecialOrderData();

                if(entry.getSpecialOrderDataTypeID().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.SpecialOrderDataTypeID(entry.getSpecialOrderDataTypeID().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.SpecialOrderDataValue(entry.getSpecialOrderDataValue()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

