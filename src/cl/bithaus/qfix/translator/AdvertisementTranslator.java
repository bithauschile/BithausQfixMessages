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
public class AdvertisementTranslator  {

    public static cl.bithaus.qfix.msg.Advertisement toFix(cl.bithaus.fix.Advertisement src) {

        cl.bithaus.qfix.msg.Advertisement dest = new cl.bithaus.qfix.msg.Advertisement();

        if(src.getAdvId() != null)
            dest.set(new cl.bithaus.qfix.fields.AdvId(src.getAdvId()));
            
        if(src.getAdvTransType() != null)
            dest.set(new cl.bithaus.qfix.fields.AdvTransType(src.getAdvTransType()));
            
        if(src.getAdvRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.AdvRefID(src.getAdvRefID()));
            
        if(src.getAdvSide() != null)
            if(src.getAdvSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.AdvSide(src.getAdvSide().charAt(0)));
            
        if(src.getQuantity() != null)
            dest.set(new cl.bithaus.qfix.fields.Quantity(src.getQuantity()));
            
        if(src.getQtyType() != null)
            dest.set(new cl.bithaus.qfix.fields.QtyType(src.getQtyType()));
            
        if(src.getPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.Price(src.getPrice()));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getTradeDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeDate(src.getTradeDate()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            
        if(src.getURLLink() != null)
            dest.set(new cl.bithaus.qfix.fields.URLLink(src.getURLLink()));
            
        if(src.getLastMkt() != null)
            dest.set(new cl.bithaus.qfix.fields.LastMkt(src.getLastMkt()));
            
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
            
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
            

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.Advertisement.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.Advertisement.NoLegs aux = 
                    new cl.bithaus.qfix.msg.Advertisement.NoLegs();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.Advertisement.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.Advertisement.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.Advertisement.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

