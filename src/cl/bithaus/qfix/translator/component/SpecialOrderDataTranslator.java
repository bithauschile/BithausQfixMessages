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
 * Fix - Bithaus format component translator for SpecialOrderData
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

    public static cl.bithaus.fix.components.SpecialOrderData fromFix(cl.bithaus.qfix.msg.component.SpecialOrderData src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.SpecialOrderData dest = new cl.bithaus.fix.components.SpecialOrderData();

        if(src.isSetSpecialOrderType())
            dest.setSpecialOrderType(src.getSpecialOrderType().getValue()+"");
            
        if(src.isSetNumberOfOrders())
            dest.setNumberOfOrders(src.getNumberOfOrders().getValue());
            
        if(src.isSetOrderNumber())
            dest.setOrderNumber(src.getOrderNumber().getValue());
            


        if(src.isSetNoSpecialOrderData()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoSpecialOrderData().getField());
            List<cl.bithaus.fix.components.SpecialOrderData.NoSpecialOrderData.NoSpecialOrderDataEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.SpecialOrderDataTypeID specialOrderDataTypeID = new cl.bithaus.qfix.fields.SpecialOrderDataTypeID();
            cl.bithaus.qfix.fields.SpecialOrderDataValue specialOrderDataValue = new cl.bithaus.qfix.fields.SpecialOrderDataValue();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.SpecialOrderData.NoSpecialOrderData.NoSpecialOrderDataEntry entry = 
                    new cl.bithaus.fix.components.SpecialOrderData.NoSpecialOrderData.NoSpecialOrderDataEntry();

                if(g.isSetField(specialOrderDataTypeID)) {
                    specialOrderDataTypeID = (cl.bithaus.qfix.fields.SpecialOrderDataTypeID) g.getField(specialOrderDataTypeID);
                    entry.setSpecialOrderDataTypeID(specialOrderDataTypeID.getValue()+"");
                }
                if(g.isSetField(specialOrderDataValue)) {
                    specialOrderDataValue = (cl.bithaus.qfix.fields.SpecialOrderDataValue) g.getField(specialOrderDataValue);
                    entry.setSpecialOrderDataValue(specialOrderDataValue.getValue());

                }

                result.add(entry);                
            }

 
        }

        return dest;

    }
}

