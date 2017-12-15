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
 * Fix - Bithaus format component translator for ListStrikePrice
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class ListStrikePriceTranslator  {

    public static cl.bithaus.qfix.msg.ListStrikePrice toFix(cl.bithaus.fix.ListStrikePrice src) {

        cl.bithaus.qfix.msg.ListStrikePrice dest = new cl.bithaus.qfix.msg.ListStrikePrice();

        if(src.getListID() != null)
            dest.set(new cl.bithaus.qfix.fields.ListID(src.getListID()));
        
        if(src.getTotNoStrikes() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNoStrikes(src.getTotNoStrikes()));
        
        if(src.getLastFragment() != null)
            dest.set(new cl.bithaus.qfix.fields.LastFragment(src.getLastFragment()));
        


        if(src.getNoStrikes() != null && src.getNoStrikes().size() > 0) {

            for(cl.bithaus.fix.ListStrikePrice.NoStrikes.NoStrikesEntry entry : src.getNoStrikes().getGroups()) {

                cl.bithaus.qfix.msg.ListStrikePrice.NoStrikes aux = 
                    new cl.bithaus.qfix.msg.ListStrikePrice.NoStrikes();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.ListStrikePrice.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.ListStrikePrice.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.ListStrikePrice.NoUnderlyings();

                aux.set(new cl.bithaus.qfix.fields.PrevClosePx(entry.getPrevClosePx()));
                aux.set(new cl.bithaus.qfix.fields.ClOrdID(entry.getClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(entry.getSecondaryClOrdID()));
                if(entry.getSide().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Side(entry.getSide().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.Price(entry.getPrice()));
                aux.set(new cl.bithaus.qfix.fields.Currency(entry.getCurrency()));
                aux.set(new cl.bithaus.qfix.fields.Text(entry.getText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedTextLen(entry.getEncodedTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedText(entry.getEncodedText()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.ListStrikePrice fromFix(cl.bithaus.qfix.msg.ListStrikePrice src) 
        throws FieldNotFound {

        cl.bithaus.fix.ListStrikePrice dest = new cl.bithaus.fix.ListStrikePrice();

        if(src.isSetListID())
            dest.setListID(src.getListID().getValue());

        if(src.isSetTotNoStrikes())
            dest.setTotNoStrikes(src.getTotNoStrikes().getValue());

        if(src.isSetLastFragment())
            dest.setLastFragment(src.getLastFragment().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"


        if(src.isSetNoStrikes()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoStrikes().getField());
            List<cl.bithaus.fix.ListStrikePrice.NoStrikes.NoStrikesEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.ListStrikePrice.NoStrikes.NoStrikesEntry entry = 
                    new cl.bithaus.fix.ListStrikePrice.NoStrikes.NoStrikesEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.ListStrikePrice.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.PrevClosePx prevClosePx = new cl.bithaus.qfix.fields.PrevClosePx();
            cl.bithaus.qfix.fields.ClOrdID clOrdID = new cl.bithaus.qfix.fields.ClOrdID();
            cl.bithaus.qfix.fields.SecondaryClOrdID secondaryClOrdID = new cl.bithaus.qfix.fields.SecondaryClOrdID();
            cl.bithaus.qfix.fields.Side side = new cl.bithaus.qfix.fields.Side();
            cl.bithaus.qfix.fields.Price price = new cl.bithaus.qfix.fields.Price();
            cl.bithaus.qfix.fields.Currency currency = new cl.bithaus.qfix.fields.Currency();
            cl.bithaus.qfix.fields.Text text = new cl.bithaus.qfix.fields.Text();
            cl.bithaus.qfix.fields.EncodedTextLen encodedTextLen = new cl.bithaus.qfix.fields.EncodedTextLen();
            cl.bithaus.qfix.fields.EncodedText encodedText = new cl.bithaus.qfix.fields.EncodedText();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.ListStrikePrice.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.ListStrikePrice.NoUnderlyings.NoUnderlyingsEntry();

                if(g.isSetField(prevClosePx)) {
                    prevClosePx = (cl.bithaus.qfix.fields.PrevClosePx) g.getField(prevClosePx);
                    entry.setPrevClosePx(prevClosePx.getValue());

                }
                if(g.isSetField(clOrdID)) {
                    clOrdID = (cl.bithaus.qfix.fields.ClOrdID) g.getField(clOrdID);
                    entry.setClOrdID(clOrdID.getValue());

                }
                if(g.isSetField(secondaryClOrdID)) {
                    secondaryClOrdID = (cl.bithaus.qfix.fields.SecondaryClOrdID) g.getField(secondaryClOrdID);
                    entry.setSecondaryClOrdID(secondaryClOrdID.getValue());

                }
                if(g.isSetField(side)) {
                    side = (cl.bithaus.qfix.fields.Side) g.getField(side);
                    entry.setSide(side.getValue()+"");
                }
                if(g.isSetField(price)) {
                    price = (cl.bithaus.qfix.fields.Price) g.getField(price);
                    entry.setPrice(price.getValue());

                }
                if(g.isSetField(currency)) {
                    currency = (cl.bithaus.qfix.fields.Currency) g.getField(currency);
                    entry.setCurrency(currency.getValue());

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

