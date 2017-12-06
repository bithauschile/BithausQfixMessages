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
public class SettlementInstructionsTranslator  {

    public static cl.bithaus.qfix.msg.SettlementInstructions toFix(cl.bithaus.fix.SettlementInstructions src) {

        cl.bithaus.qfix.msg.SettlementInstructions dest = new cl.bithaus.qfix.msg.SettlementInstructions();

        if(src.getSettlInstMsgID() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlInstMsgID(src.getSettlInstMsgID()));
            
        if(src.getSettlInstReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlInstReqID(src.getSettlInstReqID()));
            
        if(src.getSettlInstMode() != null)
            if(src.getSettlInstMode().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SettlInstMode(src.getSettlInstMode().charAt(0)));
            
        if(src.getSettlInstReqRejCode() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlInstReqRejCode(src.getSettlInstReqRejCode()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            
        if(src.getSettlInstSource() != null)
            if(src.getSettlInstSource().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SettlInstSource(src.getSettlInstSource().charAt(0)));
            
        if(src.getClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdID(src.getClOrdID()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            

        if(src.getNoSettlInst() != null && src.getNoSettlInst().size() > 0) {

            for(cl.bithaus.fix.SettlementInstructions.NoSettlInst.NoSettlInstEntry entry : src.getNoSettlInst().getGroups()) {

                cl.bithaus.qfix.msg.SettlementInstructions.NoSettlInst aux = 
                    new cl.bithaus.qfix.msg.SettlementInstructions.NoSettlInst();

                aux.set(new cl.bithaus.qfix.fields.SettlInstID(entry.getSettlInstID()));
                if(entry.getSettlInstTransType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.SettlInstTransType(entry.getSettlInstTransType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.SettlInstRefID(entry.getSettlInstRefID()));
                if(entry.getSide().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Side(entry.getSide().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.Product(entry.getProduct()));
                aux.set(new cl.bithaus.qfix.fields.SecurityType(entry.getSecurityType()));
                aux.set(new cl.bithaus.qfix.fields.CFICode(entry.getCFICode()));
                aux.set(new cl.bithaus.qfix.fields.EffectiveTime(entry.getEffectiveTime()));
                aux.set(new cl.bithaus.qfix.fields.ExpireTime(entry.getExpireTime()));
                aux.set(new cl.bithaus.qfix.fields.LastUpdateTime(entry.getLastUpdateTime()));
                aux.set(new cl.bithaus.qfix.fields.PaymentMethod(entry.getPaymentMethod()));
                aux.set(new cl.bithaus.qfix.fields.PaymentRef(entry.getPaymentRef()));
                aux.set(new cl.bithaus.qfix.fields.CardHolderName(entry.getCardHolderName()));
                aux.set(new cl.bithaus.qfix.fields.CardNumber(entry.getCardNumber()));
                aux.set(new cl.bithaus.qfix.fields.CardStartDate(entry.getCardStartDate()));
                aux.set(new cl.bithaus.qfix.fields.CardExpDate(entry.getCardExpDate()));
                aux.set(new cl.bithaus.qfix.fields.CardIssNum(entry.getCardIssNum()));
                aux.set(new cl.bithaus.qfix.fields.PaymentDate(entry.getPaymentDate()));
                aux.set(new cl.bithaus.qfix.fields.PaymentRemitterID(entry.getPaymentRemitterID()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

