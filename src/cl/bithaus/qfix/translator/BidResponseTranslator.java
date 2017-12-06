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
public class BidResponseTranslator  {

    public static cl.bithaus.qfix.msg.BidResponse toFix(cl.bithaus.fix.BidResponse src) {

        cl.bithaus.qfix.msg.BidResponse dest = new cl.bithaus.qfix.msg.BidResponse();

        if(src.getBidID() != null)
            dest.set(new cl.bithaus.qfix.fields.BidID(src.getBidID()));
            
        if(src.getClientBidID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClientBidID(src.getClientBidID()));
            

        if(src.getNoBidComponents() != null && src.getNoBidComponents().size() > 0) {

            for(cl.bithaus.fix.BidResponse.NoBidComponents.NoBidComponentsEntry entry : src.getNoBidComponents().getGroups()) {

                cl.bithaus.qfix.msg.BidResponse.NoBidComponents aux = 
                    new cl.bithaus.qfix.msg.BidResponse.NoBidComponents();

                aux.set(new cl.bithaus.qfix.fields.ListID(entry.getListID()));
                aux.set(new cl.bithaus.qfix.fields.Country(entry.getCountry()));
                if(entry.getSide().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Side(entry.getSide().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.Price(entry.getPrice()));
                aux.set(new cl.bithaus.qfix.fields.PriceType(entry.getPriceType()));
                aux.set(new cl.bithaus.qfix.fields.FairValue(entry.getFairValue()));
                aux.set(new cl.bithaus.qfix.fields.NetGrossInd(entry.getNetGrossInd()));
                if(entry.getSettlType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.SettlType(entry.getSettlType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.SettlDate(entry.getSettlDate()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));
                aux.set(new cl.bithaus.qfix.fields.Text(entry.getText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedTextLen(entry.getEncodedTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedText(entry.getEncodedText()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

