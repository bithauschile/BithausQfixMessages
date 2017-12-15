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
 * Fix - Bithaus format component translator for SecurityStatus
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class SecurityStatusTranslator  {

    public static cl.bithaus.qfix.msg.SecurityStatus toFix(cl.bithaus.fix.SecurityStatus src) {

        cl.bithaus.qfix.msg.SecurityStatus dest = new cl.bithaus.qfix.msg.SecurityStatus();

        if(src.getSecurityStatusReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityStatusReqID(src.getSecurityStatusReqID()));
        
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
        
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
        
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
        
        if(src.getUnsolicitedIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.UnsolicitedIndicator(src.getUnsolicitedIndicator()));
        
        if(src.getSecurityTradingStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityTradingStatus(src.getSecurityTradingStatus()));
        
        if(src.getFinancialStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.FinancialStatus(src.getFinancialStatus()));
        
        if(src.getCorporateAction() != null)
            dest.set(new cl.bithaus.qfix.fields.CorporateAction(src.getCorporateAction()));
        
        if(src.getHaltReason() != null)
            if(src.getHaltReason().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.HaltReason(src.getHaltReason().charAt(0)));
        
        if(src.getInViewOfCommon() != null)
            dest.set(new cl.bithaus.qfix.fields.InViewOfCommon(src.getInViewOfCommon()));
        
        if(src.getDueToRelated() != null)
            dest.set(new cl.bithaus.qfix.fields.DueToRelated(src.getDueToRelated()));
        
        if(src.getBuyVolume() != null)
            dest.set(new cl.bithaus.qfix.fields.BuyVolume(src.getBuyVolume()));
        
        if(src.getSellVolume() != null)
            dest.set(new cl.bithaus.qfix.fields.SellVolume(src.getSellVolume()));
        
        if(src.getHighPx() != null)
            dest.set(new cl.bithaus.qfix.fields.HighPx(src.getHighPx()));
        
        if(src.getLowPx() != null)
            dest.set(new cl.bithaus.qfix.fields.LowPx(src.getLowPx()));
        
        if(src.getLastPx() != null)
            dest.set(new cl.bithaus.qfix.fields.LastPx(src.getLastPx()));
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getAdjustment() != null)
            dest.set(new cl.bithaus.qfix.fields.Adjustment(src.getAdjustment()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getInstrumentExtension() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentExtensionTranslator.toFix(src.getInstrumentExtension()));


        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.SecurityStatus.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.SecurityStatus.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.SecurityStatus.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.SecurityStatus.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.SecurityStatus.NoLegs aux = 
                    new cl.bithaus.qfix.msg.SecurityStatus.NoLegs();


                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.SecurityStatus fromFix(cl.bithaus.qfix.msg.SecurityStatus src) 
        throws FieldNotFound {

        cl.bithaus.fix.SecurityStatus dest = new cl.bithaus.fix.SecurityStatus();

        if(src.isSetSecurityStatusReqID())
            dest.setSecurityStatusReqID(src.getSecurityStatusReqID().getValue());

        if(src.isSetCurrency())
            dest.setCurrency(src.getCurrency().getValue());

        if(src.isSetTradingSessionID())
            dest.setTradingSessionID(src.getTradingSessionID().getValue());

        if(src.isSetTradingSessionSubID())
            dest.setTradingSessionSubID(src.getTradingSessionSubID().getValue());

        if(src.isSetUnsolicitedIndicator())
            dest.setUnsolicitedIndicator(src.getUnsolicitedIndicator().getValue());

        if(src.isSetSecurityTradingStatus())
            dest.setSecurityTradingStatus(src.getSecurityTradingStatus().getValue());

        if(src.isSetFinancialStatus())
            dest.setFinancialStatus(src.getFinancialStatus().getValue());

        if(src.isSetCorporateAction())
            dest.setCorporateAction(src.getCorporateAction().getValue());

        if(src.isSetHaltReason())
            dest.setHaltReason(src.getHaltReason().getValue()+"");

        if(src.isSetInViewOfCommon())
            dest.setInViewOfCommon(src.getInViewOfCommon().getValue());

        if(src.isSetDueToRelated())
            dest.setDueToRelated(src.getDueToRelated().getValue());

        if(src.isSetBuyVolume())
            dest.setBuyVolume(src.getBuyVolume().getValue());

        if(src.isSetSellVolume())
            dest.setSellVolume(src.getSellVolume().getValue());

        if(src.isSetHighPx())
            dest.setHighPx(src.getHighPx().getValue());

        if(src.isSetLowPx())
            dest.setLowPx(src.getLowPx().getValue());

        if(src.isSetLastPx())
            dest.setLastPx(src.getLastPx().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetAdjustment())
            dest.setAdjustment(src.getAdjustment().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"
        try {
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setInstrumentExtension(cl.bithaus.qfix.translator.component.InstrumentExtensionTranslator.fromFix(src.getInstrumentExtension()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.SecurityStatus.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.SecurityStatus.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.SecurityStatus.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.SecurityStatus.NoLegs.NoLegsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.SecurityStatus.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.SecurityStatus.NoLegs.NoLegsEntry();


                result.add(entry);                
            }

        }
        return dest;

    }
}

