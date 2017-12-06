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

package cl.bithaus.qfix.translator.component;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class TradePartiesTranslator  {

    public static cl.bithaus.qfix.msg.component.TradeParties toFix(cl.bithaus.fix.components.TradeParties src) {

        cl.bithaus.qfix.msg.component.TradeParties dest = new cl.bithaus.qfix.msg.component.TradeParties();


        if(src.getNoSides() != null && src.getNoSides().size() > 0) {

            for(cl.bithaus.fix.components.TradeParties.NoSides.NoSidesEntry entry : src.getNoSides().getGroups()) {

                cl.bithaus.qfix.msg.component.TradeParties.NoSides aux = 
                    new cl.bithaus.qfix.msg.component.TradeParties.NoSides();

                if(entry.getSide().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Side(entry.getSide().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.EnteringFirm(entry.getEnteringFirm()));
                aux.set(new cl.bithaus.qfix.fields.ExecutingFirm(entry.getExecutingFirm()));
                aux.set(new cl.bithaus.qfix.fields.EnteringTrader(entry.getEnteringTrader()));
                aux.set(new cl.bithaus.qfix.fields.FundManager(entry.getFundManager()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

