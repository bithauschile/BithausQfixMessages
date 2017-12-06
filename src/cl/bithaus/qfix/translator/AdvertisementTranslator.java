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
 * Fix - Bithaus format component translator for Advertisement
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
        

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));


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

    public static cl.bithaus.fix.Advertisement fromFix(cl.bithaus.qfix.msg.Advertisement src) 
        throws FieldNotFound {

        cl.bithaus.fix.Advertisement dest = new cl.bithaus.fix.Advertisement();

        if(src.isSetAdvId())
            dest.setAdvId(src.getAdvId().getValue());

        if(src.isSetAdvTransType())
            dest.setAdvTransType(src.getAdvTransType().getValue());

        if(src.isSetAdvRefID())
            dest.setAdvRefID(src.getAdvRefID().getValue());

        if(src.isSetAdvSide())
            dest.setAdvSide(src.getAdvSide().getValue()+"");

        if(src.isSetQuantity())
            dest.setQuantity(src.getQuantity().getValue());

        if(src.isSetQtyType())
            dest.setQtyType(src.getQtyType().getValue());

        if(src.isSetPrice())
            dest.setPrice(src.getPrice().getValue());

        if(src.isSetCurrency())
            dest.setCurrency(src.getCurrency().getValue());

        if(src.isSetTradeDate())
            dest.setTradeDate(src.getTradeDate().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());

        if(src.isSetURLLink())
            dest.setURLLink(src.getURLLink().getValue());

        if(src.isSetLastMkt())
            dest.setLastMkt(src.getLastMkt().getValue());

        if(src.isSetTradingSessionID())
            dest.setTradingSessionID(src.getTradingSessionID().getValue());

        if(src.isSetTradingSessionSubID())
            dest.setTradingSessionSubID(src.getTradingSessionSubID().getValue());


        if(src.getInstrument() != null)
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));



        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.Advertisement.NoLegs.NoLegsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.Advertisement.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.Advertisement.NoLegs.NoLegsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.Advertisement.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.Advertisement.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.Advertisement.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        return dest;

    }
}

