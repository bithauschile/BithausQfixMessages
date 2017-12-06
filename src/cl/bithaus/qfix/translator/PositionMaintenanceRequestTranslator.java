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
 * Fix - Bithaus format component translator for PositionMaintenanceRequest
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class PositionMaintenanceRequestTranslator  {

    public static cl.bithaus.qfix.msg.PositionMaintenanceRequest toFix(cl.bithaus.fix.PositionMaintenanceRequest src) {

        cl.bithaus.qfix.msg.PositionMaintenanceRequest dest = new cl.bithaus.qfix.msg.PositionMaintenanceRequest();

        if(src.getPosReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.PosReqID(src.getPosReqID()));
        
        if(src.getPosTransType() != null)
            dest.set(new cl.bithaus.qfix.fields.PosTransType(src.getPosTransType()));
        
        if(src.getPosMaintAction() != null)
            dest.set(new cl.bithaus.qfix.fields.PosMaintAction(src.getPosMaintAction()));
        
        if(src.getOrigPosReqRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigPosReqRefID(src.getOrigPosReqRefID()));
        
        if(src.getPosMaintRptRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.PosMaintRptRefID(src.getPosMaintRptRefID()));
        
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
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getAdjustmentType() != null)
            dest.set(new cl.bithaus.qfix.fields.AdjustmentType(src.getAdjustmentType()));
        
        if(src.getContraryInstructionIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.ContraryInstructionIndicator(src.getContraryInstructionIndicator()));
        
        if(src.getPriorSpreadIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.PriorSpreadIndicator(src.getPriorSpreadIndicator()));
        
        if(src.getThresholdAmount() != null)
            dest.set(new cl.bithaus.qfix.fields.ThresholdAmount(src.getThresholdAmount()));
        
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


        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.PositionMaintenanceRequest.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoLegs aux = 
                    new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoLegs();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.PositionMaintenanceRequest.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoTradingSessions() != null && src.getNoTradingSessions().size() > 0) {

            for(cl.bithaus.fix.PositionMaintenanceRequest.NoTradingSessions.NoTradingSessionsEntry entry : src.getNoTradingSessions().getGroups()) {

                cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoTradingSessions aux = 
                    new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoTradingSessions();

                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.PositionMaintenanceRequest fromFix(cl.bithaus.qfix.msg.PositionMaintenanceRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.PositionMaintenanceRequest dest = new cl.bithaus.fix.PositionMaintenanceRequest();

        if(src.isSetPosReqID())
            dest.setPosReqID(src.getPosReqID().getValue());

        if(src.isSetPosTransType())
            dest.setPosTransType(src.getPosTransType().getValue());

        if(src.isSetPosMaintAction())
            dest.setPosMaintAction(src.getPosMaintAction().getValue());

        if(src.isSetOrigPosReqRefID())
            dest.setOrigPosReqRefID(src.getOrigPosReqRefID().getValue());

        if(src.isSetPosMaintRptRefID())
            dest.setPosMaintRptRefID(src.getPosMaintRptRefID().getValue());

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

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetAdjustmentType())
            dest.setAdjustmentType(src.getAdjustmentType().getValue());

        if(src.isSetContraryInstructionIndicator())
            dest.setContraryInstructionIndicator(src.getContraryInstructionIndicator().getValue());

        if(src.isSetPriorSpreadIndicator())
            dest.setPriorSpreadIndicator(src.getPriorSpreadIndicator().getValue());

        if(src.isSetThresholdAmount())
            dest.setThresholdAmount(src.getThresholdAmount().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());


        if(src.getParties() != null)
            dest.setParties(cl.bithaus.qfix.translator.component.PartiesTranslator.fromFix(src.getParties()));

        if(src.getInstrument() != null)
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));

        if(src.getPositionQty() != null)
            dest.setPositionQty(cl.bithaus.qfix.translator.component.PositionQtyTranslator.fromFix(src.getPositionQty()));



        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.PositionMaintenanceRequest.NoLegs.NoLegsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.PositionMaintenanceRequest.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.PositionMaintenanceRequest.NoLegs.NoLegsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.PositionMaintenanceRequest.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.PositionMaintenanceRequest.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.PositionMaintenanceRequest.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoTradingSessions()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoTradingSessions().getField());
            List<cl.bithaus.fix.PositionMaintenanceRequest.NoTradingSessions.NoTradingSessionsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.TradingSessionID tradingSessionID = new cl.bithaus.qfix.fields.TradingSessionID();
            cl.bithaus.qfix.fields.TradingSessionSubID tradingSessionSubID = new cl.bithaus.qfix.fields.TradingSessionSubID();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.PositionMaintenanceRequest.NoTradingSessions.NoTradingSessionsEntry entry = 
                    new cl.bithaus.fix.PositionMaintenanceRequest.NoTradingSessions.NoTradingSessionsEntry();

                if(g.isSetField(tradingSessionID)) {
                    tradingSessionID = (cl.bithaus.qfix.fields.TradingSessionID) g.getField(tradingSessionID);
                    entry.setTradingSessionID(tradingSessionID.getValue());

                }
                if(g.isSetField(tradingSessionSubID)) {
                    tradingSessionSubID = (cl.bithaus.qfix.fields.TradingSessionSubID) g.getField(tradingSessionSubID);
                    entry.setTradingSessionSubID(tradingSessionSubID.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

