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
 * Fix - Bithaus format component translator for Confirmation
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class ConfirmationTranslator  {

    public static cl.bithaus.qfix.msg.Confirmation toFix(cl.bithaus.fix.Confirmation src) {

        cl.bithaus.qfix.msg.Confirmation dest = new cl.bithaus.qfix.msg.Confirmation();

        if(src.getConfirmID() != null)
            dest.set(new cl.bithaus.qfix.fields.ConfirmID(src.getConfirmID()));
        
        if(src.getConfirmRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.ConfirmRefID(src.getConfirmRefID()));
        
        if(src.getConfirmReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.ConfirmReqID(src.getConfirmReqID()));
        
        if(src.getConfirmTransType() != null)
            dest.set(new cl.bithaus.qfix.fields.ConfirmTransType(src.getConfirmTransType()));
        
        if(src.getConfirmType() != null)
            dest.set(new cl.bithaus.qfix.fields.ConfirmType(src.getConfirmType()));
        
        if(src.getCopyMsgIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.CopyMsgIndicator(src.getCopyMsgIndicator()));
        
        if(src.getLegalConfirm() != null)
            dest.set(new cl.bithaus.qfix.fields.LegalConfirm(src.getLegalConfirm()));
        
        if(src.getConfirmStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.ConfirmStatus(src.getConfirmStatus()));
        
        if(src.getAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocID(src.getAllocID()));
        
        if(src.getSecondaryAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryAllocID(src.getSecondaryAllocID()));
        
        if(src.getIndividualAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.IndividualAllocID(src.getIndividualAllocID()));
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getTradeDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeDate(src.getTradeDate()));
        
        if(src.getAllocQty() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocQty(src.getAllocQty()));
        
        if(src.getQtyType() != null)
            dest.set(new cl.bithaus.qfix.fields.QtyType(src.getQtyType()));
        
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
        
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
        
        if(src.getLastMkt() != null)
            dest.set(new cl.bithaus.qfix.fields.LastMkt(src.getLastMkt()));
        
        if(src.getAllocAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocAccount(src.getAllocAccount()));
        
        if(src.getAllocAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocAcctIDSource(src.getAllocAcctIDSource()));
        
        if(src.getAllocAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocAccountType(src.getAllocAccountType()));
        
        if(src.getAvgPx() != null)
            dest.set(new cl.bithaus.qfix.fields.AvgPx(src.getAvgPx()));
        
        if(src.getAvgPxPrecision() != null)
            dest.set(new cl.bithaus.qfix.fields.AvgPxPrecision(src.getAvgPxPrecision()));
        
        if(src.getPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.PriceType(src.getPriceType()));
        
        if(src.getAvgParPx() != null)
            dest.set(new cl.bithaus.qfix.fields.AvgParPx(src.getAvgParPx()));
        
        if(src.getReportedPx() != null)
            dest.set(new cl.bithaus.qfix.fields.ReportedPx(src.getReportedPx()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        
        if(src.getProcessCode() != null)
            if(src.getProcessCode().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.ProcessCode(src.getProcessCode().charAt(0)));
        
        if(src.getGrossTradeAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.GrossTradeAmt(src.getGrossTradeAmt()));
        
        if(src.getNumDaysInterest() != null)
            dest.set(new cl.bithaus.qfix.fields.NumDaysInterest(src.getNumDaysInterest()));
        
        if(src.getExDate() != null)
            dest.set(new cl.bithaus.qfix.fields.ExDate(src.getExDate()));
        
        if(src.getAccruedInterestRate() != null)
            dest.set(new cl.bithaus.qfix.fields.AccruedInterestRate(src.getAccruedInterestRate().doubleValue()));
        
        if(src.getAccruedInterestAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.AccruedInterestAmt(src.getAccruedInterestAmt()));
        
        if(src.getInterestAtMaturity() != null)
            dest.set(new cl.bithaus.qfix.fields.InterestAtMaturity(src.getInterestAtMaturity()));
        
        if(src.getEndAccruedInterestAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.EndAccruedInterestAmt(src.getEndAccruedInterestAmt()));
        
        if(src.getStartCash() != null)
            dest.set(new cl.bithaus.qfix.fields.StartCash(src.getStartCash()));
        
        if(src.getEndCash() != null)
            dest.set(new cl.bithaus.qfix.fields.EndCash(src.getEndCash()));
        
        if(src.getConcession() != null)
            dest.set(new cl.bithaus.qfix.fields.Concession(src.getConcession()));
        
        if(src.getTotalTakedown() != null)
            dest.set(new cl.bithaus.qfix.fields.TotalTakedown(src.getTotalTakedown()));
        
        if(src.getNetMoney() != null)
            dest.set(new cl.bithaus.qfix.fields.NetMoney(src.getNetMoney()));
        
        if(src.getMaturityNetMoney() != null)
            dest.set(new cl.bithaus.qfix.fields.MaturityNetMoney(src.getMaturityNetMoney()));
        
        if(src.getSettlCurrAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlCurrAmt(src.getSettlCurrAmt()));
        
        if(src.getSettlCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlCurrency(src.getSettlCurrency()));
        
        if(src.getSettlCurrFxRate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlCurrFxRate(src.getSettlCurrFxRate().floatValue()));
        
        if(src.getSettlCurrFxRateCalc() != null)
            if(src.getSettlCurrFxRateCalc().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SettlCurrFxRateCalc(src.getSettlCurrFxRateCalc().charAt(0)));
        
        if(src.getSettlType() != null)
            if(src.getSettlType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SettlType(src.getSettlType().charAt(0)));
        
        if(src.getSettlDate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlDate(src.getSettlDate()));
        
        if(src.getSharedCommission() != null)
            dest.set(new cl.bithaus.qfix.fields.SharedCommission(src.getSharedCommission()));
        

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));

        if(src.getTrdRegTimestamps() != null)
            dest.set(cl.bithaus.qfix.translator.component.TrdRegTimestampsTranslator.toFix(src.getTrdRegTimestamps()));

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getInstrumentExtension() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentExtensionTranslator.toFix(src.getInstrumentExtension()));

        if(src.getFinancingDetails() != null)
            dest.set(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.toFix(src.getFinancingDetails()));

        if(src.getYieldData() != null)
            dest.set(cl.bithaus.qfix.translator.component.YieldDataTranslator.toFix(src.getYieldData()));

        if(src.getSpreadOrBenchmarkCurveData() != null)
            dest.set(cl.bithaus.qfix.translator.component.SpreadOrBenchmarkCurveDataTranslator.toFix(src.getSpreadOrBenchmarkCurveData()));

        if(src.getSettlInstructionsData() != null)
            dest.set(cl.bithaus.qfix.translator.component.SettlInstructionsDataTranslator.toFix(src.getSettlInstructionsData()));

        if(src.getCommissionData() != null)
            dest.set(cl.bithaus.qfix.translator.component.CommissionDataTranslator.toFix(src.getCommissionData()));

        if(src.getStipulations() != null)
            dest.set(cl.bithaus.qfix.translator.component.StipulationsTranslator.toFix(src.getStipulations()));


        if(src.getNoOrders() != null && src.getNoOrders().size() > 0) {

            for(cl.bithaus.fix.Confirmation.NoOrders.NoOrdersEntry entry : src.getNoOrders().getGroups()) {

                cl.bithaus.qfix.msg.Confirmation.NoOrders aux = 
                    new cl.bithaus.qfix.msg.Confirmation.NoOrders();

                aux.set(new cl.bithaus.qfix.fields.ClOrdID(entry.getClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.OrderID(entry.getOrderID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryOrderID(entry.getSecondaryOrderID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(entry.getSecondaryClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.ListID(entry.getListID()));
                aux.set(new cl.bithaus.qfix.fields.OrderQty(entry.getOrderQty()));
                aux.set(new cl.bithaus.qfix.fields.OrderAvgPx(entry.getOrderAvgPx()));
                aux.set(new cl.bithaus.qfix.fields.OrderBookingQty(entry.getOrderBookingQty()));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.Confirmation.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.Confirmation.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.Confirmation.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.Confirmation.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.Confirmation.NoLegs aux = 
                    new cl.bithaus.qfix.msg.Confirmation.NoLegs();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoCapacities() != null && src.getNoCapacities().size() > 0) {

            for(cl.bithaus.fix.Confirmation.NoCapacities.NoCapacitiesEntry entry : src.getNoCapacities().getGroups()) {

                cl.bithaus.qfix.msg.Confirmation.NoCapacities aux = 
                    new cl.bithaus.qfix.msg.Confirmation.NoCapacities();

                if(entry.getOrderCapacity().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.OrderCapacity(entry.getOrderCapacity().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.OrderRestrictions(entry.getOrderRestrictions()));
                aux.set(new cl.bithaus.qfix.fields.OrderCapacityQty(entry.getOrderCapacityQty()));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoMiscFees() != null && src.getNoMiscFees().size() > 0) {

            for(cl.bithaus.fix.Confirmation.NoMiscFees.NoMiscFeesEntry entry : src.getNoMiscFees().getGroups()) {

                cl.bithaus.qfix.msg.Confirmation.NoMiscFees aux = 
                    new cl.bithaus.qfix.msg.Confirmation.NoMiscFees();

                aux.set(new cl.bithaus.qfix.fields.MiscFeeAmt(entry.getMiscFeeAmt()));
                aux.set(new cl.bithaus.qfix.fields.MiscFeeCurr(entry.getMiscFeeCurr()));
                if(entry.getMiscFeeType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.MiscFeeType(entry.getMiscFeeType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.MiscFeeBasis(entry.getMiscFeeBasis()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.Confirmation fromFix(cl.bithaus.qfix.msg.Confirmation src) 
        throws FieldNotFound {

        cl.bithaus.fix.Confirmation dest = new cl.bithaus.fix.Confirmation();

        if(src.isSetConfirmID())
            dest.setConfirmID(src.getConfirmID().getValue());

        if(src.isSetConfirmRefID())
            dest.setConfirmRefID(src.getConfirmRefID().getValue());

        if(src.isSetConfirmReqID())
            dest.setConfirmReqID(src.getConfirmReqID().getValue());

        if(src.isSetConfirmTransType())
            dest.setConfirmTransType(src.getConfirmTransType().getValue());

        if(src.isSetConfirmType())
            dest.setConfirmType(src.getConfirmType().getValue());

        if(src.isSetCopyMsgIndicator())
            dest.setCopyMsgIndicator(src.getCopyMsgIndicator().getValue());

        if(src.isSetLegalConfirm())
            dest.setLegalConfirm(src.getLegalConfirm().getValue());

        if(src.isSetConfirmStatus())
            dest.setConfirmStatus(src.getConfirmStatus().getValue());

        if(src.isSetAllocID())
            dest.setAllocID(src.getAllocID().getValue());

        if(src.isSetSecondaryAllocID())
            dest.setSecondaryAllocID(src.getSecondaryAllocID().getValue());

        if(src.isSetIndividualAllocID())
            dest.setIndividualAllocID(src.getIndividualAllocID().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetTradeDate())
            dest.setTradeDate(src.getTradeDate().getValue());

        if(src.isSetAllocQty())
            dest.setAllocQty(src.getAllocQty().getValue());

        if(src.isSetQtyType())
            dest.setQtyType(src.getQtyType().getValue());

        if(src.isSetSide())
            dest.setSide(src.getSide().getValue()+"");

        if(src.isSetCurrency())
            dest.setCurrency(src.getCurrency().getValue());

        if(src.isSetLastMkt())
            dest.setLastMkt(src.getLastMkt().getValue());

        if(src.isSetAllocAccount())
            dest.setAllocAccount(src.getAllocAccount().getValue());

        if(src.isSetAllocAcctIDSource())
            dest.setAllocAcctIDSource(src.getAllocAcctIDSource().getValue());

        if(src.isSetAllocAccountType())
            dest.setAllocAccountType(src.getAllocAccountType().getValue());

        if(src.isSetAvgPx())
            dest.setAvgPx(src.getAvgPx().getValue());

        if(src.isSetAvgPxPrecision())
            dest.setAvgPxPrecision(src.getAvgPxPrecision().getValue());

        if(src.isSetPriceType())
            dest.setPriceType(src.getPriceType().getValue());

        if(src.isSetAvgParPx())
            dest.setAvgParPx(src.getAvgParPx().getValue());

        if(src.isSetReportedPx())
            dest.setReportedPx(src.getReportedPx().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());

        if(src.isSetProcessCode())
            dest.setProcessCode(src.getProcessCode().getValue()+"");

        if(src.isSetGrossTradeAmt())
            dest.setGrossTradeAmt(src.getGrossTradeAmt().getValue());

        if(src.isSetNumDaysInterest())
            dest.setNumDaysInterest(src.getNumDaysInterest().getValue());

        if(src.isSetExDate())
            dest.setExDate(src.getExDate().getValue());

        if(src.isSetAccruedInterestRate())
            dest.setAccruedInterestRate(new BigDecimal(src.getAccruedInterestRate().getValue()));

        if(src.isSetAccruedInterestAmt())
            dest.setAccruedInterestAmt(src.getAccruedInterestAmt().getValue());

        if(src.isSetInterestAtMaturity())
            dest.setInterestAtMaturity(src.getInterestAtMaturity().getValue());

        if(src.isSetEndAccruedInterestAmt())
            dest.setEndAccruedInterestAmt(src.getEndAccruedInterestAmt().getValue());

        if(src.isSetStartCash())
            dest.setStartCash(src.getStartCash().getValue());

        if(src.isSetEndCash())
            dest.setEndCash(src.getEndCash().getValue());

        if(src.isSetConcession())
            dest.setConcession(src.getConcession().getValue());

        if(src.isSetTotalTakedown())
            dest.setTotalTakedown(src.getTotalTakedown().getValue());

        if(src.isSetNetMoney())
            dest.setNetMoney(src.getNetMoney().getValue());

        if(src.isSetMaturityNetMoney())
            dest.setMaturityNetMoney(src.getMaturityNetMoney().getValue());

        if(src.isSetSettlCurrAmt())
            dest.setSettlCurrAmt(src.getSettlCurrAmt().getValue());

        if(src.isSetSettlCurrency())
            dest.setSettlCurrency(src.getSettlCurrency().getValue());

        if(src.isSetSettlCurrFxRate())
            dest.setSettlCurrFxRate(new BigDecimal(src.getSettlCurrFxRate().getValue()));

        if(src.isSetSettlCurrFxRateCalc())
            dest.setSettlCurrFxRateCalc(src.getSettlCurrFxRateCalc().getValue()+"");

        if(src.isSetSettlType())
            dest.setSettlType(src.getSettlType().getValue()+"");

        if(src.isSetSettlDate())
            dest.setSettlDate(src.getSettlDate().getValue());

        if(src.isSetSharedCommission())
            dest.setSharedCommission(src.getSharedCommission().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"
        try {
            dest.setParties(cl.bithaus.qfix.translator.component.PartiesTranslator.fromFix(src.getParties()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setTrdRegTimestamps(cl.bithaus.qfix.translator.component.TrdRegTimestampsTranslator.fromFix(src.getTrdRegTimestamps()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setInstrumentExtension(cl.bithaus.qfix.translator.component.InstrumentExtensionTranslator.fromFix(src.getInstrumentExtension()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setFinancingDetails(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.fromFix(src.getFinancingDetails()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setYieldData(cl.bithaus.qfix.translator.component.YieldDataTranslator.fromFix(src.getYieldData()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setSpreadOrBenchmarkCurveData(cl.bithaus.qfix.translator.component.SpreadOrBenchmarkCurveDataTranslator.fromFix(src.getSpreadOrBenchmarkCurveData()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setSettlInstructionsData(cl.bithaus.qfix.translator.component.SettlInstructionsDataTranslator.fromFix(src.getSettlInstructionsData()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setCommissionData(cl.bithaus.qfix.translator.component.CommissionDataTranslator.fromFix(src.getCommissionData()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setStipulations(cl.bithaus.qfix.translator.component.StipulationsTranslator.fromFix(src.getStipulations()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoOrders()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoOrders().getField());
            List<cl.bithaus.fix.Confirmation.NoOrders.NoOrdersEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.ClOrdID clOrdID = new cl.bithaus.qfix.fields.ClOrdID();
            cl.bithaus.qfix.fields.OrderID orderID = new cl.bithaus.qfix.fields.OrderID();
            cl.bithaus.qfix.fields.SecondaryOrderID secondaryOrderID = new cl.bithaus.qfix.fields.SecondaryOrderID();
            cl.bithaus.qfix.fields.SecondaryClOrdID secondaryClOrdID = new cl.bithaus.qfix.fields.SecondaryClOrdID();
            cl.bithaus.qfix.fields.ListID listID = new cl.bithaus.qfix.fields.ListID();
            cl.bithaus.qfix.fields.OrderQty orderQty = new cl.bithaus.qfix.fields.OrderQty();
            cl.bithaus.qfix.fields.OrderAvgPx orderAvgPx = new cl.bithaus.qfix.fields.OrderAvgPx();
            cl.bithaus.qfix.fields.OrderBookingQty orderBookingQty = new cl.bithaus.qfix.fields.OrderBookingQty();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.Confirmation.NoOrders.NoOrdersEntry entry = 
                    new cl.bithaus.fix.Confirmation.NoOrders.NoOrdersEntry();

                if(g.isSetField(clOrdID)) {
                    clOrdID = (cl.bithaus.qfix.fields.ClOrdID) g.getField(clOrdID);
                    entry.setClOrdID(clOrdID.getValue());

                }
                if(g.isSetField(orderID)) {
                    orderID = (cl.bithaus.qfix.fields.OrderID) g.getField(orderID);
                    entry.setOrderID(orderID.getValue());

                }
                if(g.isSetField(secondaryOrderID)) {
                    secondaryOrderID = (cl.bithaus.qfix.fields.SecondaryOrderID) g.getField(secondaryOrderID);
                    entry.setSecondaryOrderID(secondaryOrderID.getValue());

                }
                if(g.isSetField(secondaryClOrdID)) {
                    secondaryClOrdID = (cl.bithaus.qfix.fields.SecondaryClOrdID) g.getField(secondaryClOrdID);
                    entry.setSecondaryClOrdID(secondaryClOrdID.getValue());

                }
                if(g.isSetField(listID)) {
                    listID = (cl.bithaus.qfix.fields.ListID) g.getField(listID);
                    entry.setListID(listID.getValue());

                }
                if(g.isSetField(orderQty)) {
                    orderQty = (cl.bithaus.qfix.fields.OrderQty) g.getField(orderQty);
                    entry.setOrderQty(orderQty.getValue());

                }
                if(g.isSetField(orderAvgPx)) {
                    orderAvgPx = (cl.bithaus.qfix.fields.OrderAvgPx) g.getField(orderAvgPx);
                    entry.setOrderAvgPx(orderAvgPx.getValue());

                }
                if(g.isSetField(orderBookingQty)) {
                    orderBookingQty = (cl.bithaus.qfix.fields.OrderBookingQty) g.getField(orderBookingQty);
                    entry.setOrderBookingQty(orderBookingQty.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.Confirmation.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.Confirmation.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.Confirmation.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.Confirmation.NoLegs.NoLegsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.Confirmation.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.Confirmation.NoLegs.NoLegsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoCapacities()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoCapacities().getField());
            List<cl.bithaus.fix.Confirmation.NoCapacities.NoCapacitiesEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.OrderCapacity orderCapacity = new cl.bithaus.qfix.fields.OrderCapacity();
            cl.bithaus.qfix.fields.OrderRestrictions orderRestrictions = new cl.bithaus.qfix.fields.OrderRestrictions();
            cl.bithaus.qfix.fields.OrderCapacityQty orderCapacityQty = new cl.bithaus.qfix.fields.OrderCapacityQty();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.Confirmation.NoCapacities.NoCapacitiesEntry entry = 
                    new cl.bithaus.fix.Confirmation.NoCapacities.NoCapacitiesEntry();

                if(g.isSetField(orderCapacity)) {
                    orderCapacity = (cl.bithaus.qfix.fields.OrderCapacity) g.getField(orderCapacity);
                    entry.setOrderCapacity(orderCapacity.getValue()+"");
                }
                if(g.isSetField(orderRestrictions)) {
                    orderRestrictions = (cl.bithaus.qfix.fields.OrderRestrictions) g.getField(orderRestrictions);
                    entry.setOrderRestrictions(orderRestrictions.getValue());

                }
                if(g.isSetField(orderCapacityQty)) {
                    orderCapacityQty = (cl.bithaus.qfix.fields.OrderCapacityQty) g.getField(orderCapacityQty);
                    entry.setOrderCapacityQty(orderCapacityQty.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoMiscFees()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoMiscFees().getField());
            List<cl.bithaus.fix.Confirmation.NoMiscFees.NoMiscFeesEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.MiscFeeAmt miscFeeAmt = new cl.bithaus.qfix.fields.MiscFeeAmt();
            cl.bithaus.qfix.fields.MiscFeeCurr miscFeeCurr = new cl.bithaus.qfix.fields.MiscFeeCurr();
            cl.bithaus.qfix.fields.MiscFeeType miscFeeType = new cl.bithaus.qfix.fields.MiscFeeType();
            cl.bithaus.qfix.fields.MiscFeeBasis miscFeeBasis = new cl.bithaus.qfix.fields.MiscFeeBasis();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.Confirmation.NoMiscFees.NoMiscFeesEntry entry = 
                    new cl.bithaus.fix.Confirmation.NoMiscFees.NoMiscFeesEntry();

                if(g.isSetField(miscFeeAmt)) {
                    miscFeeAmt = (cl.bithaus.qfix.fields.MiscFeeAmt) g.getField(miscFeeAmt);
                    entry.setMiscFeeAmt(miscFeeAmt.getValue());

                }
                if(g.isSetField(miscFeeCurr)) {
                    miscFeeCurr = (cl.bithaus.qfix.fields.MiscFeeCurr) g.getField(miscFeeCurr);
                    entry.setMiscFeeCurr(miscFeeCurr.getValue());

                }
                if(g.isSetField(miscFeeType)) {
                    miscFeeType = (cl.bithaus.qfix.fields.MiscFeeType) g.getField(miscFeeType);
                    entry.setMiscFeeType(miscFeeType.getValue()+"");
                }
                if(g.isSetField(miscFeeBasis)) {
                    miscFeeBasis = (cl.bithaus.qfix.fields.MiscFeeBasis) g.getField(miscFeeBasis);
                    entry.setMiscFeeBasis(miscFeeBasis.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

