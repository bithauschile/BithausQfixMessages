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


}

