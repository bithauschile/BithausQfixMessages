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


}

