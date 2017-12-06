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
public class IndicationOfInterestTranslator  {

    public static cl.bithaus.qfix.msg.IndicationOfInterest toFix(cl.bithaus.fix.IndicationOfInterest src) {

        cl.bithaus.qfix.msg.IndicationOfInterest dest = new cl.bithaus.qfix.msg.IndicationOfInterest();

        if(src.getIOIid() != null)
            dest.set(new cl.bithaus.qfix.fields.IOIid(src.getIOIid()));
            
        if(src.getIOITransType() != null)
            if(src.getIOITransType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.IOITransType(src.getIOITransType().charAt(0)));
            
        if(src.getIOIRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.IOIRefID(src.getIOIRefID()));
            
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
            
        if(src.getQtyType() != null)
            dest.set(new cl.bithaus.qfix.fields.QtyType(src.getQtyType()));
            
        if(src.getIOIQty() != null)
            dest.set(new cl.bithaus.qfix.fields.IOIQty(src.getIOIQty()));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.PriceType(src.getPriceType()));
            
        if(src.getPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.Price(src.getPrice()));
            
        if(src.getValidUntilTime() != null)
            dest.set(new cl.bithaus.qfix.fields.ValidUntilTime(src.getValidUntilTime()));
            
        if(src.getIOIQltyInd() != null)
            if(src.getIOIQltyInd().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.IOIQltyInd(src.getIOIQltyInd().charAt(0)));
            
        if(src.getIOINaturalFlag() != null)
            dest.set(new cl.bithaus.qfix.fields.IOINaturalFlag(src.getIOINaturalFlag()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
        if(src.getURLLink() != null)
            dest.set(new cl.bithaus.qfix.fields.URLLink(src.getURLLink()));
            

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.IndicationOfInterest.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.IndicationOfInterest.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.IndicationOfInterest.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.IndicationOfInterest.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.IndicationOfInterest.NoLegs aux = 
                    new cl.bithaus.qfix.msg.IndicationOfInterest.NoLegs();

                aux.set(new cl.bithaus.qfix.fields.LegIOIQty(entry.getLegIOIQty()));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoIOIQualifiers() != null && src.getNoIOIQualifiers().size() > 0) {

            for(cl.bithaus.fix.IndicationOfInterest.NoIOIQualifiers.NoIOIQualifiersEntry entry : src.getNoIOIQualifiers().getGroups()) {

                cl.bithaus.qfix.msg.IndicationOfInterest.NoIOIQualifiers aux = 
                    new cl.bithaus.qfix.msg.IndicationOfInterest.NoIOIQualifiers();

                if(entry.getIOIQualifier().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.IOIQualifier(entry.getIOIQualifier().charAt(0)));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoRoutingIDs() != null && src.getNoRoutingIDs().size() > 0) {

            for(cl.bithaus.fix.IndicationOfInterest.NoRoutingIDs.NoRoutingIDsEntry entry : src.getNoRoutingIDs().getGroups()) {

                cl.bithaus.qfix.msg.IndicationOfInterest.NoRoutingIDs aux = 
                    new cl.bithaus.qfix.msg.IndicationOfInterest.NoRoutingIDs();

                aux.set(new cl.bithaus.qfix.fields.RoutingType(entry.getRoutingType()));
                aux.set(new cl.bithaus.qfix.fields.RoutingID(entry.getRoutingID()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

