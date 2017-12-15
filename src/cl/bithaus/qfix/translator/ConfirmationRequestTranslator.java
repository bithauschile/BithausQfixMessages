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
 * Fix - Bithaus format component translator for ConfirmationRequest
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class ConfirmationRequestTranslator  {

    public static cl.bithaus.qfix.msg.ConfirmationRequest toFix(cl.bithaus.fix.ConfirmationRequest src) {

        cl.bithaus.qfix.msg.ConfirmationRequest dest = new cl.bithaus.qfix.msg.ConfirmationRequest();

        if(src.getConfirmReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.ConfirmReqID(src.getConfirmReqID()));
        
        if(src.getConfirmType() != null)
            dest.set(new cl.bithaus.qfix.fields.ConfirmType(src.getConfirmType()));
        
        if(src.getAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocID(src.getAllocID()));
        
        if(src.getSecondaryAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryAllocID(src.getSecondaryAllocID()));
        
        if(src.getIndividualAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.IndividualAllocID(src.getIndividualAllocID()));
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getAllocAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocAccount(src.getAllocAccount()));
        
        if(src.getAllocAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocAcctIDSource(src.getAllocAcctIDSource()));
        
        if(src.getAllocAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocAccountType(src.getAllocAccountType()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        


        if(src.getNoOrders() != null && src.getNoOrders().size() > 0) {

            for(cl.bithaus.fix.ConfirmationRequest.NoOrders.NoOrdersEntry entry : src.getNoOrders().getGroups()) {

                cl.bithaus.qfix.msg.ConfirmationRequest.NoOrders aux = 
                    new cl.bithaus.qfix.msg.ConfirmationRequest.NoOrders();

                aux.set(new cl.bithaus.qfix.fields.ClOrdID(entry.getClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.OrderID(entry.getOrderID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryOrderID(entry.getSecondaryOrderID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(entry.getSecondaryClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.ListID(entry.getListID()));
                aux.set(new cl.bithaus.qfix.fields.OrderQty(entry.getOrderQty()));
                aux.set(new cl.bithaus.qfix.fields.OrderAvgPx(entry.getOrderAvgPx()));
                aux.set(new cl.bithaus.qfix.fields.OrderBookingQty(entry.getOrderBookingQty()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.ConfirmationRequest fromFix(cl.bithaus.qfix.msg.ConfirmationRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.ConfirmationRequest dest = new cl.bithaus.fix.ConfirmationRequest();

        if(src.isSetConfirmReqID())
            dest.setConfirmReqID(src.getConfirmReqID().getValue());

        if(src.isSetConfirmType())
            dest.setConfirmType(src.getConfirmType().getValue());

        if(src.isSetAllocID())
            dest.setAllocID(src.getAllocID().getValue());

        if(src.isSetSecondaryAllocID())
            dest.setSecondaryAllocID(src.getSecondaryAllocID().getValue());

        if(src.isSetIndividualAllocID())
            dest.setIndividualAllocID(src.getIndividualAllocID().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetAllocAccount())
            dest.setAllocAccount(src.getAllocAccount().getValue());

        if(src.isSetAllocAcctIDSource())
            dest.setAllocAcctIDSource(src.getAllocAcctIDSource().getValue());

        if(src.isSetAllocAccountType())
            dest.setAllocAccountType(src.getAllocAccountType().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"


        if(src.isSetNoOrders()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoOrders().getField());
            List<cl.bithaus.fix.ConfirmationRequest.NoOrders.NoOrdersEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.ClOrdID clOrdID = new cl.bithaus.qfix.fields.ClOrdID();
            cl.bithaus.qfix.fields.OrderID orderID = new cl.bithaus.qfix.fields.OrderID();
            cl.bithaus.qfix.fields.SecondaryOrderID secondaryOrderID = new cl.bithaus.qfix.fields.SecondaryOrderID();
            cl.bithaus.qfix.fields.SecondaryClOrdID secondaryClOrdID = new cl.bithaus.qfix.fields.SecondaryClOrdID();
            cl.bithaus.qfix.fields.ListID listID = new cl.bithaus.qfix.fields.ListID();
            cl.bithaus.qfix.fields.OrderQty orderQty = new cl.bithaus.qfix.fields.OrderQty();
            cl.bithaus.qfix.fields.OrderAvgPx orderAvgPx = new cl.bithaus.qfix.fields.OrderAvgPx();
            cl.bithaus.qfix.fields.OrderBookingQty orderBookingQty = new cl.bithaus.qfix.fields.OrderBookingQty();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.ConfirmationRequest.NoOrders.NoOrdersEntry entry = 
                    new cl.bithaus.fix.ConfirmationRequest.NoOrders.NoOrdersEntry();

                if(g.isSetField(clOrdID)) {
                    clOrdID = (cl.bithaus.qfix.fields.ClOrdID) g.getField(clOrdID);
                    entry.setClOrdID(clOrdID.getValue());

                }
                if(g.isSetField(orderID)) {
                    orderID = (cl.bithaus.qfix.fields.OrderID) g.getField(orderID);
                    entry.setOrderID(orderID.getValue());

                }
                if(g.isSetField(secondaryOrderID)) {
                    secondaryOrderID = (cl.bithaus.qfix.fields.SecondaryOrderID) g.getField(secondaryOrderID);
                    entry.setSecondaryOrderID(secondaryOrderID.getValue());

                }
                if(g.isSetField(secondaryClOrdID)) {
                    secondaryClOrdID = (cl.bithaus.qfix.fields.SecondaryClOrdID) g.getField(secondaryClOrdID);
                    entry.setSecondaryClOrdID(secondaryClOrdID.getValue());

                }
                if(g.isSetField(listID)) {
                    listID = (cl.bithaus.qfix.fields.ListID) g.getField(listID);
                    entry.setListID(listID.getValue());

                }
                if(g.isSetField(orderQty)) {
                    orderQty = (cl.bithaus.qfix.fields.OrderQty) g.getField(orderQty);
                    entry.setOrderQty(orderQty.getValue());

                }
                if(g.isSetField(orderAvgPx)) {
                    orderAvgPx = (cl.bithaus.qfix.fields.OrderAvgPx) g.getField(orderAvgPx);
                    entry.setOrderAvgPx(orderAvgPx.getValue());

                }
                if(g.isSetField(orderBookingQty)) {
                    orderBookingQty = (cl.bithaus.qfix.fields.OrderBookingQty) g.getField(orderBookingQty);
                    entry.setOrderBookingQty(orderBookingQty.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

