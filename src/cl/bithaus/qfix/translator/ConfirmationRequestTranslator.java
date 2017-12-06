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


}

