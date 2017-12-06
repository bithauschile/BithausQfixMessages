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
public class OrderMassCancelReportTranslator  {

    public static cl.bithaus.qfix.msg.OrderMassCancelReport toFix(cl.bithaus.fix.OrderMassCancelReport src) {

        cl.bithaus.qfix.msg.OrderMassCancelReport dest = new cl.bithaus.qfix.msg.OrderMassCancelReport();

        if(src.getClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdID(src.getClOrdID()));
            
        if(src.getSecondaryClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(src.getSecondaryClOrdID()));
            
        if(src.getOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderID(src.getOrderID()));
            
        if(src.getSecondaryOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryOrderID(src.getSecondaryOrderID()));
            
        if(src.getMassCancelRequestType() != null)
            if(src.getMassCancelRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.MassCancelRequestType(src.getMassCancelRequestType().charAt(0)));
            
        if(src.getMassCancelResponse() != null)
            if(src.getMassCancelResponse().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.MassCancelResponse(src.getMassCancelResponse().charAt(0)));
            
        if(src.getMassCancelRejectReason() != null)
            if(src.getMassCancelRejectReason().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.MassCancelRejectReason(src.getMassCancelRejectReason().charAt(0)));
            
        if(src.getTotalAffectedOrders() != null)
            dest.set(new cl.bithaus.qfix.fields.TotalAffectedOrders(src.getTotalAffectedOrders()));
            
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
            
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
            
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            

        if(src.getNoAffectedOrders() != null && src.getNoAffectedOrders().size() > 0) {

            for(cl.bithaus.fix.OrderMassCancelReport.NoAffectedOrders.NoAffectedOrdersEntry entry : src.getNoAffectedOrders().getGroups()) {

                cl.bithaus.qfix.msg.OrderMassCancelReport.NoAffectedOrders aux = 
                    new cl.bithaus.qfix.msg.OrderMassCancelReport.NoAffectedOrders();

                aux.set(new cl.bithaus.qfix.fields.OrigClOrdID(entry.getOrigClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.AffectedOrderID(entry.getAffectedOrderID()));
                aux.set(new cl.bithaus.qfix.fields.AffectedSecondaryOrderID(entry.getAffectedSecondaryOrderID()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

