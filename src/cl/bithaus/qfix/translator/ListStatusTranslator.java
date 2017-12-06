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
 * Fix - Bithaus format component translator for ListStatus
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class ListStatusTranslator  {

    public static cl.bithaus.qfix.msg.ListStatus toFix(cl.bithaus.fix.ListStatus src) {

        cl.bithaus.qfix.msg.ListStatus dest = new cl.bithaus.qfix.msg.ListStatus();

        if(src.getListID() != null)
            dest.set(new cl.bithaus.qfix.fields.ListID(src.getListID()));
        
        if(src.getListStatusType() != null)
            dest.set(new cl.bithaus.qfix.fields.ListStatusType(src.getListStatusType()));
        
        if(src.getNoRpts() != null)
            dest.set(new cl.bithaus.qfix.fields.NoRpts(src.getNoRpts()));
        
        if(src.getListOrderStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.ListOrderStatus(src.getListOrderStatus()));
        
        if(src.getRptSeq() != null)
            dest.set(new cl.bithaus.qfix.fields.RptSeq(src.getRptSeq()));
        
        if(src.getListStatusText() != null)
            dest.set(new cl.bithaus.qfix.fields.ListStatusText(src.getListStatusText()));
        
        if(src.getEncodedListStatusTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedListStatusTextLen(src.getEncodedListStatusTextLen()));
        
        if(src.getEncodedListStatusText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedListStatusText(src.getEncodedListStatusText()));
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getTotNoOrders() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNoOrders(src.getTotNoOrders()));
        
        if(src.getLastFragment() != null)
            dest.set(new cl.bithaus.qfix.fields.LastFragment(src.getLastFragment()));
        


        if(src.getNoOrders() != null && src.getNoOrders().size() > 0) {

            for(cl.bithaus.fix.ListStatus.NoOrders.NoOrdersEntry entry : src.getNoOrders().getGroups()) {

                cl.bithaus.qfix.msg.ListStatus.NoOrders aux = 
                    new cl.bithaus.qfix.msg.ListStatus.NoOrders();

                aux.set(new cl.bithaus.qfix.fields.ClOrdID(entry.getClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(entry.getSecondaryClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.CumQty(entry.getCumQty()));
                if(entry.getOrdStatus().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.OrdStatus(entry.getOrdStatus().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.WorkingIndicator(entry.getWorkingIndicator()));
                aux.set(new cl.bithaus.qfix.fields.LeavesQty(entry.getLeavesQty()));
                aux.set(new cl.bithaus.qfix.fields.CxlQty(entry.getCxlQty()));
                aux.set(new cl.bithaus.qfix.fields.AvgPx(entry.getAvgPx()));
                aux.set(new cl.bithaus.qfix.fields.OrdRejReason(entry.getOrdRejReason()));
                aux.set(new cl.bithaus.qfix.fields.Text(entry.getText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedTextLen(entry.getEncodedTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedText(entry.getEncodedText()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.ListStatus fromFix(cl.bithaus.qfix.msg.ListStatus src) 
        throws FieldNotFound {

        cl.bithaus.fix.ListStatus dest = new cl.bithaus.fix.ListStatus();

        if(src.isSetListID())
            dest.setListID(src.getListID().getValue());

        if(src.isSetListStatusType())
            dest.setListStatusType(src.getListStatusType().getValue());

        if(src.isSetNoRpts())
            dest.setNoRpts(src.getNoRpts().getValue());

        if(src.isSetListOrderStatus())
            dest.setListOrderStatus(src.getListOrderStatus().getValue());

        if(src.isSetRptSeq())
            dest.setRptSeq(src.getRptSeq().getValue());

        if(src.isSetListStatusText())
            dest.setListStatusText(src.getListStatusText().getValue());

        if(src.isSetEncodedListStatusTextLen())
            dest.setEncodedListStatusTextLen(src.getEncodedListStatusTextLen().getValue());

        if(src.isSetEncodedListStatusText())
            dest.setEncodedListStatusText(src.getEncodedListStatusText().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetTotNoOrders())
            dest.setTotNoOrders(src.getTotNoOrders().getValue());

        if(src.isSetLastFragment())
            dest.setLastFragment(src.getLastFragment().getValue());




        if(src.isSetNoOrders()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoOrders().getField());
            List<cl.bithaus.fix.ListStatus.NoOrders.NoOrdersEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.ClOrdID clOrdID = new cl.bithaus.qfix.fields.ClOrdID();
            cl.bithaus.qfix.fields.SecondaryClOrdID secondaryClOrdID = new cl.bithaus.qfix.fields.SecondaryClOrdID();
            cl.bithaus.qfix.fields.CumQty cumQty = new cl.bithaus.qfix.fields.CumQty();
            cl.bithaus.qfix.fields.OrdStatus ordStatus = new cl.bithaus.qfix.fields.OrdStatus();
            cl.bithaus.qfix.fields.WorkingIndicator workingIndicator = new cl.bithaus.qfix.fields.WorkingIndicator();
            cl.bithaus.qfix.fields.LeavesQty leavesQty = new cl.bithaus.qfix.fields.LeavesQty();
            cl.bithaus.qfix.fields.CxlQty cxlQty = new cl.bithaus.qfix.fields.CxlQty();
            cl.bithaus.qfix.fields.AvgPx avgPx = new cl.bithaus.qfix.fields.AvgPx();
            cl.bithaus.qfix.fields.OrdRejReason ordRejReason = new cl.bithaus.qfix.fields.OrdRejReason();
            cl.bithaus.qfix.fields.Text text = new cl.bithaus.qfix.fields.Text();
            cl.bithaus.qfix.fields.EncodedTextLen encodedTextLen = new cl.bithaus.qfix.fields.EncodedTextLen();
            cl.bithaus.qfix.fields.EncodedText encodedText = new cl.bithaus.qfix.fields.EncodedText();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.ListStatus.NoOrders.NoOrdersEntry entry = 
                    new cl.bithaus.fix.ListStatus.NoOrders.NoOrdersEntry();

                if(g.isSetField(clOrdID)) {
                    clOrdID = (cl.bithaus.qfix.fields.ClOrdID) g.getField(clOrdID);
                    entry.setClOrdID(clOrdID.getValue());

                }
                if(g.isSetField(secondaryClOrdID)) {
                    secondaryClOrdID = (cl.bithaus.qfix.fields.SecondaryClOrdID) g.getField(secondaryClOrdID);
                    entry.setSecondaryClOrdID(secondaryClOrdID.getValue());

                }
                if(g.isSetField(cumQty)) {
                    cumQty = (cl.bithaus.qfix.fields.CumQty) g.getField(cumQty);
                    entry.setCumQty(cumQty.getValue());

                }
                if(g.isSetField(ordStatus)) {
                    ordStatus = (cl.bithaus.qfix.fields.OrdStatus) g.getField(ordStatus);
                    entry.setOrdStatus(ordStatus.getValue()+"");
                }
                if(g.isSetField(workingIndicator)) {
                    workingIndicator = (cl.bithaus.qfix.fields.WorkingIndicator) g.getField(workingIndicator);
                    entry.setWorkingIndicator(workingIndicator.getValue());

                }
                if(g.isSetField(leavesQty)) {
                    leavesQty = (cl.bithaus.qfix.fields.LeavesQty) g.getField(leavesQty);
                    entry.setLeavesQty(leavesQty.getValue());

                }
                if(g.isSetField(cxlQty)) {
                    cxlQty = (cl.bithaus.qfix.fields.CxlQty) g.getField(cxlQty);
                    entry.setCxlQty(cxlQty.getValue());

                }
                if(g.isSetField(avgPx)) {
                    avgPx = (cl.bithaus.qfix.fields.AvgPx) g.getField(avgPx);
                    entry.setAvgPx(avgPx.getValue());

                }
                if(g.isSetField(ordRejReason)) {
                    ordRejReason = (cl.bithaus.qfix.fields.OrdRejReason) g.getField(ordRejReason);
                    entry.setOrdRejReason(ordRejReason.getValue());

                }
                if(g.isSetField(text)) {
                    text = (cl.bithaus.qfix.fields.Text) g.getField(text);
                    entry.setText(text.getValue());

                }
                if(g.isSetField(encodedTextLen)) {
                    encodedTextLen = (cl.bithaus.qfix.fields.EncodedTextLen) g.getField(encodedTextLen);
                    entry.setEncodedTextLen(encodedTextLen.getValue());

                }
                if(g.isSetField(encodedText)) {
                    encodedText = (cl.bithaus.qfix.fields.EncodedText) g.getField(encodedText);
                    entry.setEncodedText(encodedText.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

