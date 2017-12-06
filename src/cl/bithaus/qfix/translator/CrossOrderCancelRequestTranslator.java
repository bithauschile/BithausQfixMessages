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
public class CrossOrderCancelRequestTranslator  {

    public static cl.bithaus.qfix.msg.CrossOrderCancelRequest toFix(cl.bithaus.fix.CrossOrderCancelRequest src) {

        cl.bithaus.qfix.msg.CrossOrderCancelRequest dest = new cl.bithaus.qfix.msg.CrossOrderCancelRequest();

        if(src.getOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderID(src.getOrderID()));
            
        if(src.getCrossID() != null)
            dest.set(new cl.bithaus.qfix.fields.CrossID(src.getCrossID()));
            
        if(src.getOrigCrossID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigCrossID(src.getOrigCrossID()));
            
        if(src.getCrossType() != null)
            dest.set(new cl.bithaus.qfix.fields.CrossType(src.getCrossType()));
            
        if(src.getCrossPrioritization() != null)
            dest.set(new cl.bithaus.qfix.fields.CrossPrioritization(src.getCrossPrioritization()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
        if(src.getExDestination() != null)
            dest.set(new cl.bithaus.qfix.fields.ExDestination(src.getExDestination()));
            

        if(src.getNoSides() != null && src.getNoSides().size() > 0) {

            for(cl.bithaus.fix.CrossOrderCancelRequest.NoSides.NoSidesEntry entry : src.getNoSides().getGroups()) {

                cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoSides aux = 
                    new cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoSides();

                if(entry.getSide().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Side(entry.getSide().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.OrigClOrdID(entry.getOrigClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.ClOrdID(entry.getClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(entry.getSecondaryClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.ClOrdLinkID(entry.getClOrdLinkID()));
                aux.set(new cl.bithaus.qfix.fields.OrigOrdModTime(entry.getOrigOrdModTime()));
                aux.set(new cl.bithaus.qfix.fields.TradeOriginationDate(entry.getTradeOriginationDate()));
                aux.set(new cl.bithaus.qfix.fields.TradeDate(entry.getTradeDate()));
                aux.set(new cl.bithaus.qfix.fields.ComplianceID(entry.getComplianceID()));
                aux.set(new cl.bithaus.qfix.fields.Text(entry.getText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedTextLen(entry.getEncodedTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedText(entry.getEncodedText()));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.CrossOrderCancelRequest.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.CrossOrderCancelRequest.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoLegs aux = 
                    new cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoLegs();


                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

