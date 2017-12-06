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
 * Fix - Bithaus format component translator for SettlementInstructions
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

    public static cl.bithaus.fix.SettlementInstructions fromFix(cl.bithaus.qfix.msg.SettlementInstructions src) 
        throws FieldNotFound {

        cl.bithaus.fix.SettlementInstructions dest = new cl.bithaus.fix.SettlementInstructions();

        if(src.isSetSettlInstMsgID())
            dest.setSettlInstMsgID(src.getSettlInstMsgID().getValue());

        if(src.isSetSettlInstReqID())
            dest.setSettlInstReqID(src.getSettlInstReqID().getValue());

        if(src.isSetSettlInstMode())
            dest.setSettlInstMode(src.getSettlInstMode().getValue()+"");

        if(src.isSetSettlInstReqRejCode())
            dest.setSettlInstReqRejCode(src.getSettlInstReqRejCode().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());

        if(src.isSetSettlInstSource())
            dest.setSettlInstSource(src.getSettlInstSource().getValue()+"");

        if(src.isSetClOrdID())
            dest.setClOrdID(src.getClOrdID().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());




        if(src.isSetNoSettlInst()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoSettlInst().getField());
            List<cl.bithaus.fix.SettlementInstructions.NoSettlInst.NoSettlInstEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.SettlInstID settlInstID = new cl.bithaus.qfix.fields.SettlInstID();
            cl.bithaus.qfix.fields.SettlInstTransType settlInstTransType = new cl.bithaus.qfix.fields.SettlInstTransType();
            cl.bithaus.qfix.fields.SettlInstRefID settlInstRefID = new cl.bithaus.qfix.fields.SettlInstRefID();
            cl.bithaus.qfix.fields.Side side = new cl.bithaus.qfix.fields.Side();
            cl.bithaus.qfix.fields.Product product = new cl.bithaus.qfix.fields.Product();
            cl.bithaus.qfix.fields.SecurityType securityType = new cl.bithaus.qfix.fields.SecurityType();
            cl.bithaus.qfix.fields.CFICode cFICode = new cl.bithaus.qfix.fields.CFICode();
            cl.bithaus.qfix.fields.EffectiveTime effectiveTime = new cl.bithaus.qfix.fields.EffectiveTime();
            cl.bithaus.qfix.fields.ExpireTime expireTime = new cl.bithaus.qfix.fields.ExpireTime();
            cl.bithaus.qfix.fields.LastUpdateTime lastUpdateTime = new cl.bithaus.qfix.fields.LastUpdateTime();
            cl.bithaus.qfix.fields.PaymentMethod paymentMethod = new cl.bithaus.qfix.fields.PaymentMethod();
            cl.bithaus.qfix.fields.PaymentRef paymentRef = new cl.bithaus.qfix.fields.PaymentRef();
            cl.bithaus.qfix.fields.CardHolderName cardHolderName = new cl.bithaus.qfix.fields.CardHolderName();
            cl.bithaus.qfix.fields.CardNumber cardNumber = new cl.bithaus.qfix.fields.CardNumber();
            cl.bithaus.qfix.fields.CardStartDate cardStartDate = new cl.bithaus.qfix.fields.CardStartDate();
            cl.bithaus.qfix.fields.CardExpDate cardExpDate = new cl.bithaus.qfix.fields.CardExpDate();
            cl.bithaus.qfix.fields.CardIssNum cardIssNum = new cl.bithaus.qfix.fields.CardIssNum();
            cl.bithaus.qfix.fields.PaymentDate paymentDate = new cl.bithaus.qfix.fields.PaymentDate();
            cl.bithaus.qfix.fields.PaymentRemitterID paymentRemitterID = new cl.bithaus.qfix.fields.PaymentRemitterID();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.SettlementInstructions.NoSettlInst.NoSettlInstEntry entry = 
                    new cl.bithaus.fix.SettlementInstructions.NoSettlInst.NoSettlInstEntry();

                if(g.isSetField(settlInstID)) {
                    settlInstID = (cl.bithaus.qfix.fields.SettlInstID) g.getField(settlInstID);
                    entry.setSettlInstID(settlInstID.getValue());

                }
                if(g.isSetField(settlInstTransType)) {
                    settlInstTransType = (cl.bithaus.qfix.fields.SettlInstTransType) g.getField(settlInstTransType);
                    entry.setSettlInstTransType(settlInstTransType.getValue()+"");
                }
                if(g.isSetField(settlInstRefID)) {
                    settlInstRefID = (cl.bithaus.qfix.fields.SettlInstRefID) g.getField(settlInstRefID);
                    entry.setSettlInstRefID(settlInstRefID.getValue());

                }
                if(g.isSetField(side)) {
                    side = (cl.bithaus.qfix.fields.Side) g.getField(side);
                    entry.setSide(side.getValue()+"");
                }
                if(g.isSetField(product)) {
                    product = (cl.bithaus.qfix.fields.Product) g.getField(product);
                    entry.setProduct(product.getValue());

                }
                if(g.isSetField(securityType)) {
                    securityType = (cl.bithaus.qfix.fields.SecurityType) g.getField(securityType);
                    entry.setSecurityType(securityType.getValue());

                }
                if(g.isSetField(cFICode)) {
                    cFICode = (cl.bithaus.qfix.fields.CFICode) g.getField(cFICode);
                    entry.setCFICode(cFICode.getValue());

                }
                if(g.isSetField(effectiveTime)) {
                    effectiveTime = (cl.bithaus.qfix.fields.EffectiveTime) g.getField(effectiveTime);
                    entry.setEffectiveTime(effectiveTime.getValue());

                }
                if(g.isSetField(expireTime)) {
                    expireTime = (cl.bithaus.qfix.fields.ExpireTime) g.getField(expireTime);
                    entry.setExpireTime(expireTime.getValue());

                }
                if(g.isSetField(lastUpdateTime)) {
                    lastUpdateTime = (cl.bithaus.qfix.fields.LastUpdateTime) g.getField(lastUpdateTime);
                    entry.setLastUpdateTime(lastUpdateTime.getValue());

                }
                if(g.isSetField(paymentMethod)) {
                    paymentMethod = (cl.bithaus.qfix.fields.PaymentMethod) g.getField(paymentMethod);
                    entry.setPaymentMethod(paymentMethod.getValue());

                }
                if(g.isSetField(paymentRef)) {
                    paymentRef = (cl.bithaus.qfix.fields.PaymentRef) g.getField(paymentRef);
                    entry.setPaymentRef(paymentRef.getValue());

                }
                if(g.isSetField(cardHolderName)) {
                    cardHolderName = (cl.bithaus.qfix.fields.CardHolderName) g.getField(cardHolderName);
                    entry.setCardHolderName(cardHolderName.getValue());

                }
                if(g.isSetField(cardNumber)) {
                    cardNumber = (cl.bithaus.qfix.fields.CardNumber) g.getField(cardNumber);
                    entry.setCardNumber(cardNumber.getValue());

                }
                if(g.isSetField(cardStartDate)) {
                    cardStartDate = (cl.bithaus.qfix.fields.CardStartDate) g.getField(cardStartDate);
                    entry.setCardStartDate(cardStartDate.getValue());

                }
                if(g.isSetField(cardExpDate)) {
                    cardExpDate = (cl.bithaus.qfix.fields.CardExpDate) g.getField(cardExpDate);
                    entry.setCardExpDate(cardExpDate.getValue());

                }
                if(g.isSetField(cardIssNum)) {
                    cardIssNum = (cl.bithaus.qfix.fields.CardIssNum) g.getField(cardIssNum);
                    entry.setCardIssNum(cardIssNum.getValue());

                }
                if(g.isSetField(paymentDate)) {
                    paymentDate = (cl.bithaus.qfix.fields.PaymentDate) g.getField(paymentDate);
                    entry.setPaymentDate(paymentDate.getValue());

                }
                if(g.isSetField(paymentRemitterID)) {
                    paymentRemitterID = (cl.bithaus.qfix.fields.PaymentRemitterID) g.getField(paymentRemitterID);
                    entry.setPaymentRemitterID(paymentRemitterID.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

