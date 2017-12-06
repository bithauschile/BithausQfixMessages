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
public class DontKnowTradeTranslator  {

    public static cl.bithaus.qfix.msg.DontKnowTrade toFix(cl.bithaus.fix.DontKnowTrade src) {

        cl.bithaus.qfix.msg.DontKnowTrade dest = new cl.bithaus.qfix.msg.DontKnowTrade();

        if(src.getOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderID(src.getOrderID()));
            
        if(src.getSecondaryOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryOrderID(src.getSecondaryOrderID()));
            
        if(src.getExecID() != null)
            dest.set(new cl.bithaus.qfix.fields.ExecID(src.getExecID()));
            
        if(src.getDKReason() != null)
            if(src.getDKReason().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.DKReason(src.getDKReason().charAt(0)));
            
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
            
        if(src.getLastQty() != null)
            dest.set(new cl.bithaus.qfix.fields.LastQty(src.getLastQty()));
            
        if(src.getLastPx() != null)
            dest.set(new cl.bithaus.qfix.fields.LastPx(src.getLastPx()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.DontKnowTrade.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.DontKnowTrade.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.DontKnowTrade.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.DontKnowTrade.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.DontKnowTrade.NoLegs aux = 
                    new cl.bithaus.qfix.msg.DontKnowTrade.NoLegs();


                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

