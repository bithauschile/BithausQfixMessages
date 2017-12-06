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
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import quickfix.FieldNotFound;


/**
 * Fix - Bithaus format component translator for TradeParties
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

    public static cl.bithaus.fix.components.TradeParties fromFix(cl.bithaus.qfix.msg.component.TradeParties src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.TradeParties dest = new cl.bithaus.fix.components.TradeParties();


        if(src.isSetNoSides()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoSides().getField());
            List<cl.bithaus.fix.components.TradeParties.NoSides.NoSidesEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.Side side = new cl.bithaus.qfix.fields.Side();
            cl.bithaus.qfix.fields.EnteringFirm enteringFirm = new cl.bithaus.qfix.fields.EnteringFirm();
            cl.bithaus.qfix.fields.ExecutingFirm executingFirm = new cl.bithaus.qfix.fields.ExecutingFirm();
            cl.bithaus.qfix.fields.EnteringTrader enteringTrader = new cl.bithaus.qfix.fields.EnteringTrader();
            cl.bithaus.qfix.fields.FundManager fundManager = new cl.bithaus.qfix.fields.FundManager();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.TradeParties.NoSides.NoSidesEntry entry = 
                    new cl.bithaus.fix.components.TradeParties.NoSides.NoSidesEntry();

                if(g.isSetField(side)) {
                    side = (cl.bithaus.qfix.fields.Side) g.getField(side);
                    entry.setSide(side.getValue()+"");
                }
                if(g.isSetField(enteringFirm)) {
                    enteringFirm = (cl.bithaus.qfix.fields.EnteringFirm) g.getField(enteringFirm);
                    entry.setEnteringFirm(enteringFirm.getValue());

                }
                if(g.isSetField(executingFirm)) {
                    executingFirm = (cl.bithaus.qfix.fields.ExecutingFirm) g.getField(executingFirm);
                    entry.setExecutingFirm(executingFirm.getValue());

                }
                if(g.isSetField(enteringTrader)) {
                    enteringTrader = (cl.bithaus.qfix.fields.EnteringTrader) g.getField(enteringTrader);
                    entry.setEnteringTrader(enteringTrader.getValue());

                }
                if(g.isSetField(fundManager)) {
                    fundManager = (cl.bithaus.qfix.fields.FundManager) g.getField(fundManager);
                    entry.setFundManager(fundManager.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

