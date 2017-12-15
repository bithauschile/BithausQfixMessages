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
 * Fix - Bithaus format component translator for OrderMassCancelReport
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
        

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getUnderlyingInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.UnderlyingInstrumentTranslator.toFix(src.getUnderlyingInstrument()));


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

    public static cl.bithaus.fix.OrderMassCancelReport fromFix(cl.bithaus.qfix.msg.OrderMassCancelReport src) 
        throws FieldNotFound {

        cl.bithaus.fix.OrderMassCancelReport dest = new cl.bithaus.fix.OrderMassCancelReport();

        if(src.isSetClOrdID())
            dest.setClOrdID(src.getClOrdID().getValue());

        if(src.isSetSecondaryClOrdID())
            dest.setSecondaryClOrdID(src.getSecondaryClOrdID().getValue());

        if(src.isSetOrderID())
            dest.setOrderID(src.getOrderID().getValue());

        if(src.isSetSecondaryOrderID())
            dest.setSecondaryOrderID(src.getSecondaryOrderID().getValue());

        if(src.isSetMassCancelRequestType())
            dest.setMassCancelRequestType(src.getMassCancelRequestType().getValue()+"");

        if(src.isSetMassCancelResponse())
            dest.setMassCancelResponse(src.getMassCancelResponse().getValue()+"");

        if(src.isSetMassCancelRejectReason())
            dest.setMassCancelRejectReason(src.getMassCancelRejectReason().getValue()+"");

        if(src.isSetTotalAffectedOrders())
            dest.setTotalAffectedOrders(src.getTotalAffectedOrders().getValue());

        if(src.isSetTradingSessionID())
            dest.setTradingSessionID(src.getTradingSessionID().getValue());

        if(src.isSetTradingSessionSubID())
            dest.setTradingSessionSubID(src.getTradingSessionSubID().getValue());

        if(src.isSetSide())
            dest.setSide(src.getSide().getValue()+"");

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"
        try {
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setUnderlyingInstrument(cl.bithaus.qfix.translator.component.UnderlyingInstrumentTranslator.fromFix(src.getUnderlyingInstrument()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoAffectedOrders()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoAffectedOrders().getField());
            List<cl.bithaus.fix.OrderMassCancelReport.NoAffectedOrders.NoAffectedOrdersEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.OrigClOrdID origClOrdID = new cl.bithaus.qfix.fields.OrigClOrdID();
            cl.bithaus.qfix.fields.AffectedOrderID affectedOrderID = new cl.bithaus.qfix.fields.AffectedOrderID();
            cl.bithaus.qfix.fields.AffectedSecondaryOrderID affectedSecondaryOrderID = new cl.bithaus.qfix.fields.AffectedSecondaryOrderID();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.OrderMassCancelReport.NoAffectedOrders.NoAffectedOrdersEntry entry = 
                    new cl.bithaus.fix.OrderMassCancelReport.NoAffectedOrders.NoAffectedOrdersEntry();

                if(g.isSetField(origClOrdID)) {
                    origClOrdID = (cl.bithaus.qfix.fields.OrigClOrdID) g.getField(origClOrdID);
                    entry.setOrigClOrdID(origClOrdID.getValue());

                }
                if(g.isSetField(affectedOrderID)) {
                    affectedOrderID = (cl.bithaus.qfix.fields.AffectedOrderID) g.getField(affectedOrderID);
                    entry.setAffectedOrderID(affectedOrderID.getValue());

                }
                if(g.isSetField(affectedSecondaryOrderID)) {
                    affectedSecondaryOrderID = (cl.bithaus.qfix.fields.AffectedSecondaryOrderID) g.getField(affectedSecondaryOrderID);
                    entry.setAffectedSecondaryOrderID(affectedSecondaryOrderID.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

