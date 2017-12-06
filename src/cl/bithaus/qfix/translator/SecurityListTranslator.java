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
 * Fix - Bithaus format component translator for SecurityList
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class SecurityListTranslator  {

    public static cl.bithaus.qfix.msg.SecurityList toFix(cl.bithaus.fix.SecurityList src) {

        cl.bithaus.qfix.msg.SecurityList dest = new cl.bithaus.qfix.msg.SecurityList();

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
        


        if(src.getNoRelatedSym() != null && src.getNoRelatedSym().size() > 0) {

            for(cl.bithaus.fix.SecurityList.NoRelatedSym.NoRelatedSymEntry entry : src.getNoRelatedSym().getGroups()) {

                cl.bithaus.qfix.msg.SecurityList.NoRelatedSym aux = 
                    new cl.bithaus.qfix.msg.SecurityList.NoRelatedSym();

                aux.set(new cl.bithaus.qfix.fields.Currency(entry.getCurrency()));
                aux.set(new cl.bithaus.qfix.fields.RoundLot(entry.getRoundLot()));
                aux.set(new cl.bithaus.qfix.fields.MinTradeVol(entry.getMinTradeVol()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));
                aux.set(new cl.bithaus.qfix.fields.ExpirationCycle(entry.getExpirationCycle()));
                aux.set(new cl.bithaus.qfix.fields.Text(entry.getText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedTextLen(entry.getEncodedTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedText(entry.getEncodedText()));
                if(entry.getPresenceCategory().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.PresenceCategory(entry.getPresenceCategory().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.AutomaticCrossAuthorization(entry.getAutomaticCrossAuthorization()));
                aux.set(new cl.bithaus.qfix.fields.NumericPresence(entry.getNumericPresence().doubleValue()));
                aux.set(new cl.bithaus.qfix.fields.SerializedAuthorization(entry.getSerializedAuthorization()));
                aux.set(new cl.bithaus.qfix.fields.PriceType(entry.getPriceType()));
                aux.set(new cl.bithaus.qfix.fields.MDAdjustmentCurrency(entry.getMDAdjustmentCurrency()));
                aux.set(new cl.bithaus.qfix.fields.MDMaturity(entry.getMDMaturity()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.SecurityList fromFix(cl.bithaus.qfix.msg.SecurityList src) 
        throws FieldNotFound {

        cl.bithaus.fix.SecurityList dest = new cl.bithaus.fix.SecurityList();

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




        if(src.isSetNoRelatedSym()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoRelatedSym().getField());
            List<cl.bithaus.fix.SecurityList.NoRelatedSym.NoRelatedSymEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.Currency currency = new cl.bithaus.qfix.fields.Currency();
            cl.bithaus.qfix.fields.RoundLot roundLot = new cl.bithaus.qfix.fields.RoundLot();
            cl.bithaus.qfix.fields.MinTradeVol minTradeVol = new cl.bithaus.qfix.fields.MinTradeVol();
            cl.bithaus.qfix.fields.TradingSessionID tradingSessionID = new cl.bithaus.qfix.fields.TradingSessionID();
            cl.bithaus.qfix.fields.TradingSessionSubID tradingSessionSubID = new cl.bithaus.qfix.fields.TradingSessionSubID();
            cl.bithaus.qfix.fields.ExpirationCycle expirationCycle = new cl.bithaus.qfix.fields.ExpirationCycle();
            cl.bithaus.qfix.fields.Text text = new cl.bithaus.qfix.fields.Text();
            cl.bithaus.qfix.fields.EncodedTextLen encodedTextLen = new cl.bithaus.qfix.fields.EncodedTextLen();
            cl.bithaus.qfix.fields.EncodedText encodedText = new cl.bithaus.qfix.fields.EncodedText();
            cl.bithaus.qfix.fields.PresenceCategory presenceCategory = new cl.bithaus.qfix.fields.PresenceCategory();
            cl.bithaus.qfix.fields.AutomaticCrossAuthorization automaticCrossAuthorization = new cl.bithaus.qfix.fields.AutomaticCrossAuthorization();
            cl.bithaus.qfix.fields.NumericPresence numericPresence = new cl.bithaus.qfix.fields.NumericPresence();
            cl.bithaus.qfix.fields.SerializedAuthorization serializedAuthorization = new cl.bithaus.qfix.fields.SerializedAuthorization();
            cl.bithaus.qfix.fields.PriceType priceType = new cl.bithaus.qfix.fields.PriceType();
            cl.bithaus.qfix.fields.MDAdjustmentCurrency mDAdjustmentCurrency = new cl.bithaus.qfix.fields.MDAdjustmentCurrency();
            cl.bithaus.qfix.fields.MDMaturity mDMaturity = new cl.bithaus.qfix.fields.MDMaturity();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.SecurityList.NoRelatedSym.NoRelatedSymEntry entry = 
                    new cl.bithaus.fix.SecurityList.NoRelatedSym.NoRelatedSymEntry();

                if(g.isSetField(currency)) {
                    currency = (cl.bithaus.qfix.fields.Currency) g.getField(currency);
                    entry.setCurrency(currency.getValue());

                }
                if(g.isSetField(roundLot)) {
                    roundLot = (cl.bithaus.qfix.fields.RoundLot) g.getField(roundLot);
                    entry.setRoundLot(roundLot.getValue());

                }
                if(g.isSetField(minTradeVol)) {
                    minTradeVol = (cl.bithaus.qfix.fields.MinTradeVol) g.getField(minTradeVol);
                    entry.setMinTradeVol(minTradeVol.getValue());

                }
                if(g.isSetField(tradingSessionID)) {
                    tradingSessionID = (cl.bithaus.qfix.fields.TradingSessionID) g.getField(tradingSessionID);
                    entry.setTradingSessionID(tradingSessionID.getValue());

                }
                if(g.isSetField(tradingSessionSubID)) {
                    tradingSessionSubID = (cl.bithaus.qfix.fields.TradingSessionSubID) g.getField(tradingSessionSubID);
                    entry.setTradingSessionSubID(tradingSessionSubID.getValue());

                }
                if(g.isSetField(expirationCycle)) {
                    expirationCycle = (cl.bithaus.qfix.fields.ExpirationCycle) g.getField(expirationCycle);
                    entry.setExpirationCycle(expirationCycle.getValue());

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
                if(g.isSetField(presenceCategory)) {
                    presenceCategory = (cl.bithaus.qfix.fields.PresenceCategory) g.getField(presenceCategory);
                    entry.setPresenceCategory(presenceCategory.getValue()+"");
                }
                if(g.isSetField(automaticCrossAuthorization)) {
                    automaticCrossAuthorization = (cl.bithaus.qfix.fields.AutomaticCrossAuthorization) g.getField(automaticCrossAuthorization);
                    entry.setAutomaticCrossAuthorization(automaticCrossAuthorization.getValue());

                }
                if(g.isSetField(numericPresence)) {
                    numericPresence = (cl.bithaus.qfix.fields.NumericPresence) g.getField(numericPresence);
                    entry.setNumericPresence(new BigDecimal(numericPresence.getValue()));
                }
                if(g.isSetField(serializedAuthorization)) {
                    serializedAuthorization = (cl.bithaus.qfix.fields.SerializedAuthorization) g.getField(serializedAuthorization);
                    entry.setSerializedAuthorization(serializedAuthorization.getValue());

                }
                if(g.isSetField(priceType)) {
                    priceType = (cl.bithaus.qfix.fields.PriceType) g.getField(priceType);
                    entry.setPriceType(priceType.getValue());

                }
                if(g.isSetField(mDAdjustmentCurrency)) {
                    mDAdjustmentCurrency = (cl.bithaus.qfix.fields.MDAdjustmentCurrency) g.getField(mDAdjustmentCurrency);
                    entry.setMDAdjustmentCurrency(mDAdjustmentCurrency.getValue());

                }
                if(g.isSetField(mDMaturity)) {
                    mDMaturity = (cl.bithaus.qfix.fields.MDMaturity) g.getField(mDMaturity);
                    entry.setMDMaturity(mDMaturity.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

