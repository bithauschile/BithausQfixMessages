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
 * Fix - Bithaus format component translator for PositionReport
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class PositionReportTranslator  {

    public static cl.bithaus.qfix.msg.PositionReport toFix(cl.bithaus.fix.PositionReport src) {

        cl.bithaus.qfix.msg.PositionReport dest = new cl.bithaus.qfix.msg.PositionReport();

        if(src.getPosMaintRptID() != null)
            dest.set(new cl.bithaus.qfix.fields.PosMaintRptID(src.getPosMaintRptID()));
        
        if(src.getPosReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.PosReqID(src.getPosReqID()));
        
        if(src.getPosReqType() != null)
            dest.set(new cl.bithaus.qfix.fields.PosReqType(src.getPosReqType()));
        
        if(src.getSubscriptionRequestType() != null)
            if(src.getSubscriptionRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SubscriptionRequestType(src.getSubscriptionRequestType().charAt(0)));
        
        if(src.getTotalNumPosReports() != null)
            dest.set(new cl.bithaus.qfix.fields.TotalNumPosReports(src.getTotalNumPosReports()));
        
        if(src.getUnsolicitedIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.UnsolicitedIndicator(src.getUnsolicitedIndicator()));
        
        if(src.getPosReqResult() != null)
            dest.set(new cl.bithaus.qfix.fields.PosReqResult(src.getPosReqResult()));
        
        if(src.getClearingBusinessDate() != null)
            dest.set(new cl.bithaus.qfix.fields.ClearingBusinessDate(src.getClearingBusinessDate()));
        
        if(src.getSettlSessID() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlSessID(src.getSettlSessID()));
        
        if(src.getSettlSessSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlSessSubID(src.getSettlSessSubID()));
        
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
        
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
        
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
        
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
        
        if(src.getSettlPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlPrice(src.getSettlPrice()));
        
        if(src.getSettlPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlPriceType(src.getSettlPriceType()));
        
        if(src.getPriorSettlPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.PriorSettlPrice(src.getPriorSettlPrice()));
        
        if(src.getRegistStatus() != null)
            if(src.getRegistStatus().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.RegistStatus(src.getRegistStatus().charAt(0)));
        
        if(src.getDeliveryDate() != null)
            dest.set(new cl.bithaus.qfix.fields.DeliveryDate(src.getDeliveryDate()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getPositionQty() != null)
            dest.set(cl.bithaus.qfix.translator.component.PositionQtyTranslator.toFix(src.getPositionQty()));

        if(src.getPositionAmountData() != null)
            dest.set(cl.bithaus.qfix.translator.component.PositionAmountDataTranslator.toFix(src.getPositionAmountData()));


        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.PositionReport.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.PositionReport.NoLegs aux = 
                    new cl.bithaus.qfix.msg.PositionReport.NoLegs();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.PositionReport.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.PositionReport.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.PositionReport.NoUnderlyings();

                aux.set(new cl.bithaus.qfix.fields.UnderlyingSettlPrice(entry.getUnderlyingSettlPrice()));
                aux.set(new cl.bithaus.qfix.fields.UnderlyingSettlPriceType(entry.getUnderlyingSettlPriceType()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.PositionReport fromFix(cl.bithaus.qfix.msg.PositionReport src) 
        throws FieldNotFound {

        cl.bithaus.fix.PositionReport dest = new cl.bithaus.fix.PositionReport();

        if(src.isSetPosMaintRptID())
            dest.setPosMaintRptID(src.getPosMaintRptID().getValue());

        if(src.isSetPosReqID())
            dest.setPosReqID(src.getPosReqID().getValue());

        if(src.isSetPosReqType())
            dest.setPosReqType(src.getPosReqType().getValue());

        if(src.isSetSubscriptionRequestType())
            dest.setSubscriptionRequestType(src.getSubscriptionRequestType().getValue()+"");

        if(src.isSetTotalNumPosReports())
            dest.setTotalNumPosReports(src.getTotalNumPosReports().getValue());

        if(src.isSetUnsolicitedIndicator())
            dest.setUnsolicitedIndicator(src.getUnsolicitedIndicator().getValue());

        if(src.isSetPosReqResult())
            dest.setPosReqResult(src.getPosReqResult().getValue());

        if(src.isSetClearingBusinessDate())
            dest.setClearingBusinessDate(src.getClearingBusinessDate().getValue());

        if(src.isSetSettlSessID())
            dest.setSettlSessID(src.getSettlSessID().getValue());

        if(src.isSetSettlSessSubID())
            dest.setSettlSessSubID(src.getSettlSessSubID().getValue());

        if(src.isSetAccount())
            dest.setAccount(src.getAccount().getValue());

        if(src.isSetAcctIDSource())
            dest.setAcctIDSource(src.getAcctIDSource().getValue());

        if(src.isSetAccountType())
            dest.setAccountType(src.getAccountType().getValue());

        if(src.isSetCurrency())
            dest.setCurrency(src.getCurrency().getValue());

        if(src.isSetSettlPrice())
            dest.setSettlPrice(src.getSettlPrice().getValue());

        if(src.isSetSettlPriceType())
            dest.setSettlPriceType(src.getSettlPriceType().getValue());

        if(src.isSetPriorSettlPrice())
            dest.setPriorSettlPrice(src.getPriorSettlPrice().getValue());

        if(src.isSetRegistStatus())
            dest.setRegistStatus(src.getRegistStatus().getValue()+"");

        if(src.isSetDeliveryDate())
            dest.setDeliveryDate(src.getDeliveryDate().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"
        try {
            dest.setParties(cl.bithaus.qfix.translator.component.PartiesTranslator.fromFix(src.getParties()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setPositionQty(cl.bithaus.qfix.translator.component.PositionQtyTranslator.fromFix(src.getPositionQty()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setPositionAmountData(cl.bithaus.qfix.translator.component.PositionAmountDataTranslator.fromFix(src.getPositionAmountData()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.PositionReport.NoLegs.NoLegsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.PositionReport.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.PositionReport.NoLegs.NoLegsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.PositionReport.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.UnderlyingSettlPrice underlyingSettlPrice = new cl.bithaus.qfix.fields.UnderlyingSettlPrice();
            cl.bithaus.qfix.fields.UnderlyingSettlPriceType underlyingSettlPriceType = new cl.bithaus.qfix.fields.UnderlyingSettlPriceType();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.PositionReport.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.PositionReport.NoUnderlyings.NoUnderlyingsEntry();

                if(g.isSetField(underlyingSettlPrice)) {
                    underlyingSettlPrice = (cl.bithaus.qfix.fields.UnderlyingSettlPrice) g.getField(underlyingSettlPrice);
                    entry.setUnderlyingSettlPrice(underlyingSettlPrice.getValue());

                }
                if(g.isSetField(underlyingSettlPriceType)) {
                    underlyingSettlPriceType = (cl.bithaus.qfix.fields.UnderlyingSettlPriceType) g.getField(underlyingSettlPriceType);
                    entry.setUnderlyingSettlPriceType(underlyingSettlPriceType.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

