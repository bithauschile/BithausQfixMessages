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
public class OrderCancelRejectTranslator  {

    public static cl.bithaus.qfix.msg.OrderCancelReject toFix(cl.bithaus.fix.OrderCancelReject src) {

        cl.bithaus.qfix.msg.OrderCancelReject dest = new cl.bithaus.qfix.msg.OrderCancelReject();

        if(src.getOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderID(src.getOrderID()));
            
        if(src.getSecondaryOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryOrderID(src.getSecondaryOrderID()));
            
        if(src.getSecondaryClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(src.getSecondaryClOrdID()));
            
        if(src.getClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdID(src.getClOrdID()));
            
        if(src.getClOrdLinkID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdLinkID(src.getClOrdLinkID()));
            
        if(src.getOrigClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigClOrdID(src.getOrigClOrdID()));
            
        if(src.getOrdStatus() != null)
            if(src.getOrdStatus().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.OrdStatus(src.getOrdStatus().charAt(0)));
            
        if(src.getWorkingIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.WorkingIndicator(src.getWorkingIndicator()));
            
        if(src.getOrigOrdModTime() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigOrdModTime(src.getOrigOrdModTime()));
            
        if(src.getListID() != null)
            dest.set(new cl.bithaus.qfix.fields.ListID(src.getListID()));
            
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
            
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
            
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
            
        if(src.getTradeOriginationDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeOriginationDate(src.getTradeOriginationDate()));
            
        if(src.getTradeDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeDate(src.getTradeDate()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
        if(src.getCxlRejResponseTo() != null)
            if(src.getCxlRejResponseTo().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.CxlRejResponseTo(src.getCxlRejResponseTo().charAt(0)));
            
        if(src.getCxlRejReason() != null)
            dest.set(new cl.bithaus.qfix.fields.CxlRejReason(src.getCxlRejReason()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            


        return dest;
    }


}

