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
 * Fix - Bithaus format component translator for DerivativeSecurityList
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class DerivativeSecurityListTranslator  {

    public static cl.bithaus.qfix.msg.DerivativeSecurityList toFix(cl.bithaus.fix.DerivativeSecurityList src) {

        cl.bithaus.qfix.msg.DerivativeSecurityList dest = new cl.bithaus.qfix.msg.DerivativeSecurityList();

        if(src.getSecurityReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityReqID(src.getSecurityReqID()));
        
        if(src.getSecurityResponseID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityResponseID(src.getSecurityResponseID()));
        
        if(src.getSecurityRequestResult() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityRequestResult(src.getSecurityRequestResult()));
        
        if(src.getTotNoRelatedSym() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNoRelatedSym(src.getTotNoRelatedSym()));
        
        if(src.getLastFragment() != null)
            dest.set(new cl.bithaus.qfix.fields.LastFragment(src.getLastFragment()));
        

        if(src.getUnderlyingInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.UnderlyingInstrumentTranslator.toFix(src.getUnderlyingInstrument()));


        if(src.getNoRelatedSym() != null && src.getNoRelatedSym().size() > 0) {

            for(cl.bithaus.fix.DerivativeSecurityList.NoRelatedSym.NoRelatedSymEntry entry : src.getNoRelatedSym().getGroups()) {

                cl.bithaus.qfix.msg.DerivativeSecurityList.NoRelatedSym aux = 
                    new cl.bithaus.qfix.msg.DerivativeSecurityList.NoRelatedSym();

                aux.set(new cl.bithaus.qfix.fields.Currency(entry.getCurrency()));
                aux.set(new cl.bithaus.qfix.fields.ExpirationCycle(entry.getExpirationCycle()));
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

    public static cl.bithaus.fix.DerivativeSecurityList fromFix(cl.bithaus.qfix.msg.DerivativeSecurityList src) 
        throws FieldNotFound {

        cl.bithaus.fix.DerivativeSecurityList dest = new cl.bithaus.fix.DerivativeSecurityList();

        if(src.isSetSecurityReqID())
            dest.setSecurityReqID(src.getSecurityReqID().getValue());

        if(src.isSetSecurityResponseID())
            dest.setSecurityResponseID(src.getSecurityResponseID().getValue());

        if(src.isSetSecurityRequestResult())
            dest.setSecurityRequestResult(src.getSecurityRequestResult().getValue());

        if(src.isSetTotNoRelatedSym())
            dest.setTotNoRelatedSym(src.getTotNoRelatedSym().getValue());

        if(src.isSetLastFragment())
            dest.setLastFragment(src.getLastFragment().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"
        try {
            dest.setUnderlyingInstrument(cl.bithaus.qfix.translator.component.UnderlyingInstrumentTranslator.fromFix(src.getUnderlyingInstrument()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoRelatedSym()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoRelatedSym().getField());
            List<cl.bithaus.fix.DerivativeSecurityList.NoRelatedSym.NoRelatedSymEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.Currency currency = new cl.bithaus.qfix.fields.Currency();
            cl.bithaus.qfix.fields.ExpirationCycle expirationCycle = new cl.bithaus.qfix.fields.ExpirationCycle();
            cl.bithaus.qfix.fields.TradingSessionID tradingSessionID = new cl.bithaus.qfix.fields.TradingSessionID();
            cl.bithaus.qfix.fields.TradingSessionSubID tradingSessionSubID = new cl.bithaus.qfix.fields.TradingSessionSubID();
            cl.bithaus.qfix.fields.Text text = new cl.bithaus.qfix.fields.Text();
            cl.bithaus.qfix.fields.EncodedTextLen encodedTextLen = new cl.bithaus.qfix.fields.EncodedTextLen();
            cl.bithaus.qfix.fields.EncodedText encodedText = new cl.bithaus.qfix.fields.EncodedText();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.DerivativeSecurityList.NoRelatedSym.NoRelatedSymEntry entry = 
                    new cl.bithaus.fix.DerivativeSecurityList.NoRelatedSym.NoRelatedSymEntry();

                if(g.isSetField(currency)) {
                    currency = (cl.bithaus.qfix.fields.Currency) g.getField(currency);
                    entry.setCurrency(currency.getValue());

                }
                if(g.isSetField(expirationCycle)) {
                    expirationCycle = (cl.bithaus.qfix.fields.ExpirationCycle) g.getField(expirationCycle);
                    entry.setExpirationCycle(expirationCycle.getValue());

                }
                if(g.isSetField(tradingSessionID)) {
                    tradingSessionID = (cl.bithaus.qfix.fields.TradingSessionID) g.getField(tradingSessionID);
                    entry.setTradingSessionID(tradingSessionID.getValue());

                }
                if(g.isSetField(tradingSessionSubID)) {
                    tradingSessionSubID = (cl.bithaus.qfix.fields.TradingSessionSubID) g.getField(tradingSessionSubID);
                    entry.setTradingSessionSubID(tradingSessionSubID.getValue());

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

