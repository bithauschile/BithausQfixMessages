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
public class OrderCancelRequestTranslator  {

    public static cl.bithaus.qfix.msg.OrderCancelRequest toFix(cl.bithaus.fix.OrderCancelRequest src) {

        cl.bithaus.qfix.msg.OrderCancelRequest dest = new cl.bithaus.qfix.msg.OrderCancelRequest();

        if(src.getOrigClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigClOrdID(src.getOrigClOrdID()));
            
        if(src.getOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderID(src.getOrderID()));
            
        if(src.getClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdID(src.getClOrdID()));
            
        if(src.getSecondaryClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(src.getSecondaryClOrdID()));
            
        if(src.getClOrdLinkID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdLinkID(src.getClOrdLinkID()));
            
        if(src.getListID() != null)
            dest.set(new cl.bithaus.qfix.fields.ListID(src.getListID()));
            
        if(src.getOrigOrdModTime() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigOrdModTime(src.getOrigOrdModTime()));
            
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
            
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
            
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
            
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
        if(src.getComplianceID() != null)
            dest.set(new cl.bithaus.qfix.fields.ComplianceID(src.getComplianceID()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            
        if(src.getMoveToOIB() != null)
            dest.set(new cl.bithaus.qfix.fields.MoveToOIB(src.getMoveToOIB()));
            
        if(src.getExDestination() != null)
            dest.set(new cl.bithaus.qfix.fields.ExDestination(src.getExDestination()));
            

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.OrderCancelRequest.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.OrderCancelRequest.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.OrderCancelRequest.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

