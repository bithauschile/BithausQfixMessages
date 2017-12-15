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
 * Fix - Bithaus format component translator for TradeCaptureReport
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class TradeCaptureReportTranslator  {

    public static cl.bithaus.qfix.msg.TradeCaptureReport toFix(cl.bithaus.fix.TradeCaptureReport src) {

        cl.bithaus.qfix.msg.TradeCaptureReport dest = new cl.bithaus.qfix.msg.TradeCaptureReport();

        if(src.getTradeReportID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeReportID(src.getTradeReportID()));
        
        if(src.getTradeReportTransType() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeReportTransType(src.getTradeReportTransType()));
        
        if(src.getTradeReportType() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeReportType(src.getTradeReportType()));
        
        if(src.getTradeRequestID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeRequestID(src.getTradeRequestID()));
        
        if(src.getTrdType() != null)
            dest.set(new cl.bithaus.qfix.fields.TrdType(src.getTrdType()));
        
        if(src.getTrdSubType() != null)
            dest.set(new cl.bithaus.qfix.fields.TrdSubType(src.getTrdSubType()));
        
        if(src.getSecondaryTrdType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryTrdType(src.getSecondaryTrdType()));
        
        if(src.getTransferReason() != null)
            dest.set(new cl.bithaus.qfix.fields.TransferReason(src.getTransferReason()));
        
        if(src.getExecType() != null)
            if(src.getExecType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.ExecType(src.getExecType().charAt(0)));
        
        if(src.getTotNumTradeReports() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNumTradeReports(src.getTotNumTradeReports()));
        
        if(src.getLastRptRequested() != null)
            dest.set(new cl.bithaus.qfix.fields.LastRptRequested(src.getLastRptRequested()));
        
        if(src.getUnsolicitedIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.UnsolicitedIndicator(src.getUnsolicitedIndicator()));
        
        if(src.getSubscriptionRequestType() != null)
            if(src.getSubscriptionRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SubscriptionRequestType(src.getSubscriptionRequestType().charAt(0)));
        
        if(src.getTradeReportRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeReportRefID(src.getTradeReportRefID()));
        
        if(src.getSecondaryTradeReportRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryTradeReportRefID(src.getSecondaryTradeReportRefID()));
        
        if(src.getSecondaryTradeReportID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryTradeReportID(src.getSecondaryTradeReportID()));
        
        if(src.getTradeLinkID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeLinkID(src.getTradeLinkID()));
        
        if(src.getTrdMatchID() != null)
            dest.set(new cl.bithaus.qfix.fields.TrdMatchID(src.getTrdMatchID()));
        
        if(src.getExecID() != null)
            dest.set(new cl.bithaus.qfix.fields.ExecID(src.getExecID()));
        
        if(src.getOrdStatus() != null)
            if(src.getOrdStatus().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.OrdStatus(src.getOrdStatus().charAt(0)));
        
        if(src.getSecondaryExecID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryExecID(src.getSecondaryExecID()));
        
        if(src.getExecRestatementReason() != null)
            dest.set(new cl.bithaus.qfix.fields.ExecRestatementReason(src.getExecRestatementReason()));
        
        if(src.getPreviouslyReported() != null)
            dest.set(new cl.bithaus.qfix.fields.PreviouslyReported(src.getPreviouslyReported()));
        
        if(src.getPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.PriceType(src.getPriceType()));
        
        if(src.getQtyType() != null)
            dest.set(new cl.bithaus.qfix.fields.QtyType(src.getQtyType()));
        
        if(src.getUnderlyingTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingTradingSessionID(src.getUnderlyingTradingSessionID()));
        
        if(src.getUnderlyingTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingTradingSessionSubID(src.getUnderlyingTradingSessionSubID()));
        
        if(src.getLastQty() != null)
            dest.set(new cl.bithaus.qfix.fields.LastQty(src.getLastQty()));
        
        if(src.getLastPx() != null)
            dest.set(new cl.bithaus.qfix.fields.LastPx(src.getLastPx()));
        
        if(src.getLastParPx() != null)
            dest.set(new cl.bithaus.qfix.fields.LastParPx(src.getLastParPx()));
        
        if(src.getLastSpotRate() != null)
            dest.set(new cl.bithaus.qfix.fields.LastSpotRate(src.getLastSpotRate()));
        
        if(src.getLastForwardPoints() != null)
            dest.set(new cl.bithaus.qfix.fields.LastForwardPoints(src.getLastForwardPoints()));
        
        if(src.getLastMkt() != null)
            dest.set(new cl.bithaus.qfix.fields.LastMkt(src.getLastMkt()));
        
        if(src.getTradeDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeDate(src.getTradeDate()));
        
        if(src.getClearingBusinessDate() != null)
            dest.set(new cl.bithaus.qfix.fields.ClearingBusinessDate(src.getClearingBusinessDate()));
        
        if(src.getAvgPx() != null)
            dest.set(new cl.bithaus.qfix.fields.AvgPx(src.getAvgPx()));
        
        if(src.getAvgPxIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.AvgPxIndicator(src.getAvgPxIndicator()));
        
        if(src.getMultiLegReportingType() != null)
            if(src.getMultiLegReportingType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.MultiLegReportingType(src.getMultiLegReportingType().charAt(0)));
        
        if(src.getTradeLegRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeLegRefID(src.getTradeLegRefID()));
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getSettlType() != null)
            if(src.getSettlType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SettlType(src.getSettlType().charAt(0)));
        
        if(src.getSettlDate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlDate(src.getSettlDate()));
        
        if(src.getMatchStatus() != null)
            if(src.getMatchStatus().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.MatchStatus(src.getMatchStatus().charAt(0)));
        
        if(src.getMatchType() != null)
            dest.set(new cl.bithaus.qfix.fields.MatchType(src.getMatchType()));
        
        if(src.getCopyMsgIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.CopyMsgIndicator(src.getCopyMsgIndicator()));
        
        if(src.getPublishTrdIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.PublishTrdIndicator(src.getPublishTrdIndicator()));
        
        if(src.getShortSaleReason() != null)
            dest.set(new cl.bithaus.qfix.fields.ShortSaleReason(src.getShortSaleReason()));
        

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getFinancingDetails() != null)
            dest.set(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.toFix(src.getFinancingDetails()));

        if(src.getOrderQtyData() != null)
            dest.set(cl.bithaus.qfix.translator.component.OrderQtyDataTranslator.toFix(src.getOrderQtyData()));

        if(src.getYieldData() != null)
            dest.set(cl.bithaus.qfix.translator.component.YieldDataTranslator.toFix(src.getYieldData()));

        if(src.getSpreadOrBenchmarkCurveData() != null)
            dest.set(cl.bithaus.qfix.translator.component.SpreadOrBenchmarkCurveDataTranslator.toFix(src.getSpreadOrBenchmarkCurveData()));

        if(src.getPositionAmountData() != null)
            dest.set(cl.bithaus.qfix.translator.component.PositionAmountDataTranslator.toFix(src.getPositionAmountData()));

        if(src.getTrdRegTimestamps() != null)
            dest.set(cl.bithaus.qfix.translator.component.TrdRegTimestampsTranslator.toFix(src.getTrdRegTimestamps()));


        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.TradeCaptureReport.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.TradeCaptureReport.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.TradeCaptureReport.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.TradeCaptureReport.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.TradeCaptureReport.NoLegs aux = 
                    new cl.bithaus.qfix.msg.TradeCaptureReport.NoLegs();

                aux.set(new cl.bithaus.qfix.fields.LegQty(entry.getLegQty()));
                aux.set(new cl.bithaus.qfix.fields.LegSwapType(entry.getLegSwapType()));
                if(entry.getLegPositionEffect().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.LegPositionEffect(entry.getLegPositionEffect().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.LegCoveredOrUncovered(entry.getLegCoveredOrUncovered()));
                aux.set(new cl.bithaus.qfix.fields.LegRefID(entry.getLegRefID()));
                aux.set(new cl.bithaus.qfix.fields.LegPrice(entry.getLegPrice()));
                if(entry.getLegSettlType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.LegSettlType(entry.getLegSettlType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.LegSettlDate(entry.getLegSettlDate()));
                aux.set(new cl.bithaus.qfix.fields.LegLastPx(entry.getLegLastPx()));
                aux.set(new cl.bithaus.qfix.fields.TargetLegRefId(entry.getTargetLegRefId()));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoSides() != null && src.getNoSides().size() > 0) {

            for(cl.bithaus.fix.TradeCaptureReport.NoSides.NoSidesEntry entry : src.getNoSides().getGroups()) {

                cl.bithaus.qfix.msg.TradeCaptureReport.NoSides aux = 
                    new cl.bithaus.qfix.msg.TradeCaptureReport.NoSides();

                if(entry.getSide().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Side(entry.getSide().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.OrderID(entry.getOrderID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryOrderID(entry.getSecondaryOrderID()));
                aux.set(new cl.bithaus.qfix.fields.ClOrdID(entry.getClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(entry.getSecondaryClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.ListID(entry.getListID()));
                aux.set(new cl.bithaus.qfix.fields.Account(entry.getAccount()));
                aux.set(new cl.bithaus.qfix.fields.AcctIDSource(entry.getAcctIDSource()));
                aux.set(new cl.bithaus.qfix.fields.AccountType(entry.getAccountType()));
                if(entry.getProcessCode().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.ProcessCode(entry.getProcessCode().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.OddLot(entry.getOddLot()));
                aux.set(new cl.bithaus.qfix.fields.ClearingFeeIndicator(entry.getClearingFeeIndicator()));
                aux.set(new cl.bithaus.qfix.fields.TradeInputSource(entry.getTradeInputSource()));
                aux.set(new cl.bithaus.qfix.fields.TradeInputDevice(entry.getTradeInputDevice()));
                aux.set(new cl.bithaus.qfix.fields.OrderInputDevice(entry.getOrderInputDevice()));
                aux.set(new cl.bithaus.qfix.fields.Currency(entry.getCurrency()));
                aux.set(new cl.bithaus.qfix.fields.ComplianceID(entry.getComplianceID()));
                aux.set(new cl.bithaus.qfix.fields.SolicitedFlag(entry.getSolicitedFlag()));
                if(entry.getOrderCapacity().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.OrderCapacity(entry.getOrderCapacity().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.OrderRestrictions(entry.getOrderRestrictions()));
                aux.set(new cl.bithaus.qfix.fields.CustOrderCapacity(entry.getCustOrderCapacity()));
                if(entry.getOrdType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.OrdType(entry.getOrdType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.ExecInst(entry.getExecInst()));
                aux.set(new cl.bithaus.qfix.fields.TransBkdTime(entry.getTransBkdTime()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));
                aux.set(new cl.bithaus.qfix.fields.TimeBracket(entry.getTimeBracket()));
                aux.set(new cl.bithaus.qfix.fields.GrossTradeAmt(entry.getGrossTradeAmt()));
                aux.set(new cl.bithaus.qfix.fields.NumDaysInterest(entry.getNumDaysInterest()));
                aux.set(new cl.bithaus.qfix.fields.ExDate(entry.getExDate()));
                aux.set(new cl.bithaus.qfix.fields.AccruedInterestRate(entry.getAccruedInterestRate().doubleValue()));
                aux.set(new cl.bithaus.qfix.fields.AccruedInterestAmt(entry.getAccruedInterestAmt()));
                aux.set(new cl.bithaus.qfix.fields.InterestAtMaturity(entry.getInterestAtMaturity()));
                aux.set(new cl.bithaus.qfix.fields.EndAccruedInterestAmt(entry.getEndAccruedInterestAmt()));
                aux.set(new cl.bithaus.qfix.fields.StartCash(entry.getStartCash()));
                aux.set(new cl.bithaus.qfix.fields.EndCash(entry.getEndCash()));
                aux.set(new cl.bithaus.qfix.fields.Concession(entry.getConcession()));
                aux.set(new cl.bithaus.qfix.fields.TotalTakedown(entry.getTotalTakedown()));
                aux.set(new cl.bithaus.qfix.fields.NetMoney(entry.getNetMoney()));
                aux.set(new cl.bithaus.qfix.fields.SettlCurrAmt(entry.getSettlCurrAmt()));
                aux.set(new cl.bithaus.qfix.fields.SettlCurrency(entry.getSettlCurrency()));
                aux.set(new cl.bithaus.qfix.fields.SettlCurrFxRate(entry.getSettlCurrFxRate().floatValue()));
                if(entry.getSettlCurrFxRateCalc().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.SettlCurrFxRateCalc(entry.getSettlCurrFxRateCalc().charAt(0)));
                if(entry.getPositionEffect().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.PositionEffect(entry.getPositionEffect().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.Text(entry.getText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedTextLen(entry.getEncodedTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedText(entry.getEncodedText()));
                aux.set(new cl.bithaus.qfix.fields.SideMultiLegReportingType(entry.getSideMultiLegReportingType()));
                aux.set(new cl.bithaus.qfix.fields.ExchangeRule(entry.getExchangeRule()));
                aux.set(new cl.bithaus.qfix.fields.TradeAllocIndicator(entry.getTradeAllocIndicator()));
                if(entry.getPreallocMethod().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.PreallocMethod(entry.getPreallocMethod().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.AllocID(entry.getAllocID()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.TradeCaptureReport fromFix(cl.bithaus.qfix.msg.TradeCaptureReport src) 
        throws FieldNotFound {

        cl.bithaus.fix.TradeCaptureReport dest = new cl.bithaus.fix.TradeCaptureReport();

        if(src.isSetTradeReportID())
            dest.setTradeReportID(src.getTradeReportID().getValue());

        if(src.isSetTradeReportTransType())
            dest.setTradeReportTransType(src.getTradeReportTransType().getValue());

        if(src.isSetTradeReportType())
            dest.setTradeReportType(src.getTradeReportType().getValue());

        if(src.isSetTradeRequestID())
            dest.setTradeRequestID(src.getTradeRequestID().getValue());

        if(src.isSetTrdType())
            dest.setTrdType(src.getTrdType().getValue());

        if(src.isSetTrdSubType())
            dest.setTrdSubType(src.getTrdSubType().getValue());

        if(src.isSetSecondaryTrdType())
            dest.setSecondaryTrdType(src.getSecondaryTrdType().getValue());

        if(src.isSetTransferReason())
            dest.setTransferReason(src.getTransferReason().getValue());

        if(src.isSetExecType())
            dest.setExecType(src.getExecType().getValue()+"");

        if(src.isSetTotNumTradeReports())
            dest.setTotNumTradeReports(src.getTotNumTradeReports().getValue());

        if(src.isSetLastRptRequested())
            dest.setLastRptRequested(src.getLastRptRequested().getValue());

        if(src.isSetUnsolicitedIndicator())
            dest.setUnsolicitedIndicator(src.getUnsolicitedIndicator().getValue());

        if(src.isSetSubscriptionRequestType())
            dest.setSubscriptionRequestType(src.getSubscriptionRequestType().getValue()+"");

        if(src.isSetTradeReportRefID())
            dest.setTradeReportRefID(src.getTradeReportRefID().getValue());

        if(src.isSetSecondaryTradeReportRefID())
            dest.setSecondaryTradeReportRefID(src.getSecondaryTradeReportRefID().getValue());

        if(src.isSetSecondaryTradeReportID())
            dest.setSecondaryTradeReportID(src.getSecondaryTradeReportID().getValue());

        if(src.isSetTradeLinkID())
            dest.setTradeLinkID(src.getTradeLinkID().getValue());

        if(src.isSetTrdMatchID())
            dest.setTrdMatchID(src.getTrdMatchID().getValue());

        if(src.isSetExecID())
            dest.setExecID(src.getExecID().getValue());

        if(src.isSetOrdStatus())
            dest.setOrdStatus(src.getOrdStatus().getValue()+"");

        if(src.isSetSecondaryExecID())
            dest.setSecondaryExecID(src.getSecondaryExecID().getValue());

        if(src.isSetExecRestatementReason())
            dest.setExecRestatementReason(src.getExecRestatementReason().getValue());

        if(src.isSetPreviouslyReported())
            dest.setPreviouslyReported(src.getPreviouslyReported().getValue());

        if(src.isSetPriceType())
            dest.setPriceType(src.getPriceType().getValue());

        if(src.isSetQtyType())
            dest.setQtyType(src.getQtyType().getValue());

        if(src.isSetUnderlyingTradingSessionID())
            dest.setUnderlyingTradingSessionID(src.getUnderlyingTradingSessionID().getValue());

        if(src.isSetUnderlyingTradingSessionSubID())
            dest.setUnderlyingTradingSessionSubID(src.getUnderlyingTradingSessionSubID().getValue());

        if(src.isSetLastQty())
            dest.setLastQty(src.getLastQty().getValue());

        if(src.isSetLastPx())
            dest.setLastPx(src.getLastPx().getValue());

        if(src.isSetLastParPx())
            dest.setLastParPx(src.getLastParPx().getValue());

        if(src.isSetLastSpotRate())
            dest.setLastSpotRate(src.getLastSpotRate().getValue());

        if(src.isSetLastForwardPoints())
            dest.setLastForwardPoints(src.getLastForwardPoints().getValue());

        if(src.isSetLastMkt())
            dest.setLastMkt(src.getLastMkt().getValue());

        if(src.isSetTradeDate())
            dest.setTradeDate(src.getTradeDate().getValue());

        if(src.isSetClearingBusinessDate())
            dest.setClearingBusinessDate(src.getClearingBusinessDate().getValue());

        if(src.isSetAvgPx())
            dest.setAvgPx(src.getAvgPx().getValue());

        if(src.isSetAvgPxIndicator())
            dest.setAvgPxIndicator(src.getAvgPxIndicator().getValue());

        if(src.isSetMultiLegReportingType())
            dest.setMultiLegReportingType(src.getMultiLegReportingType().getValue()+"");

        if(src.isSetTradeLegRefID())
            dest.setTradeLegRefID(src.getTradeLegRefID().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetSettlType())
            dest.setSettlType(src.getSettlType().getValue()+"");

        if(src.isSetSettlDate())
            dest.setSettlDate(src.getSettlDate().getValue());

        if(src.isSetMatchStatus())
            dest.setMatchStatus(src.getMatchStatus().getValue()+"");

        if(src.isSetMatchType())
            dest.setMatchType(src.getMatchType().getValue());

        if(src.isSetCopyMsgIndicator())
            dest.setCopyMsgIndicator(src.getCopyMsgIndicator().getValue());

        if(src.isSetPublishTrdIndicator())
            dest.setPublishTrdIndicator(src.getPublishTrdIndicator().getValue());

        if(src.isSetShortSaleReason())
            dest.setShortSaleReason(src.getShortSaleReason().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"
        try {
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setFinancingDetails(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.fromFix(src.getFinancingDetails()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setOrderQtyData(cl.bithaus.qfix.translator.component.OrderQtyDataTranslator.fromFix(src.getOrderQtyData()));
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
            dest.setPositionAmountData(cl.bithaus.qfix.translator.component.PositionAmountDataTranslator.fromFix(src.getPositionAmountData()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setTrdRegTimestamps(cl.bithaus.qfix.translator.component.TrdRegTimestampsTranslator.fromFix(src.getTrdRegTimestamps()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.TradeCaptureReport.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.TradeCaptureReport.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.TradeCaptureReport.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.TradeCaptureReport.NoLegs.NoLegsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.LegQty legQty = new cl.bithaus.qfix.fields.LegQty();
            cl.bithaus.qfix.fields.LegSwapType legSwapType = new cl.bithaus.qfix.fields.LegSwapType();
            cl.bithaus.qfix.fields.LegPositionEffect legPositionEffect = new cl.bithaus.qfix.fields.LegPositionEffect();
            cl.bithaus.qfix.fields.LegCoveredOrUncovered legCoveredOrUncovered = new cl.bithaus.qfix.fields.LegCoveredOrUncovered();
            cl.bithaus.qfix.fields.LegRefID legRefID = new cl.bithaus.qfix.fields.LegRefID();
            cl.bithaus.qfix.fields.LegPrice legPrice = new cl.bithaus.qfix.fields.LegPrice();
            cl.bithaus.qfix.fields.LegSettlType legSettlType = new cl.bithaus.qfix.fields.LegSettlType();
            cl.bithaus.qfix.fields.LegSettlDate legSettlDate = new cl.bithaus.qfix.fields.LegSettlDate();
            cl.bithaus.qfix.fields.LegLastPx legLastPx = new cl.bithaus.qfix.fields.LegLastPx();
            cl.bithaus.qfix.fields.TargetLegRefId targetLegRefId = new cl.bithaus.qfix.fields.TargetLegRefId();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.TradeCaptureReport.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.TradeCaptureReport.NoLegs.NoLegsEntry();

                if(g.isSetField(legQty)) {
                    legQty = (cl.bithaus.qfix.fields.LegQty) g.getField(legQty);
                    entry.setLegQty(legQty.getValue());

                }
                if(g.isSetField(legSwapType)) {
                    legSwapType = (cl.bithaus.qfix.fields.LegSwapType) g.getField(legSwapType);
                    entry.setLegSwapType(legSwapType.getValue());

                }
                if(g.isSetField(legPositionEffect)) {
                    legPositionEffect = (cl.bithaus.qfix.fields.LegPositionEffect) g.getField(legPositionEffect);
                    entry.setLegPositionEffect(legPositionEffect.getValue()+"");
                }
                if(g.isSetField(legCoveredOrUncovered)) {
                    legCoveredOrUncovered = (cl.bithaus.qfix.fields.LegCoveredOrUncovered) g.getField(legCoveredOrUncovered);
                    entry.setLegCoveredOrUncovered(legCoveredOrUncovered.getValue());

                }
                if(g.isSetField(legRefID)) {
                    legRefID = (cl.bithaus.qfix.fields.LegRefID) g.getField(legRefID);
                    entry.setLegRefID(legRefID.getValue());

                }
                if(g.isSetField(legPrice)) {
                    legPrice = (cl.bithaus.qfix.fields.LegPrice) g.getField(legPrice);
                    entry.setLegPrice(legPrice.getValue());

                }
                if(g.isSetField(legSettlType)) {
                    legSettlType = (cl.bithaus.qfix.fields.LegSettlType) g.getField(legSettlType);
                    entry.setLegSettlType(legSettlType.getValue()+"");
                }
                if(g.isSetField(legSettlDate)) {
                    legSettlDate = (cl.bithaus.qfix.fields.LegSettlDate) g.getField(legSettlDate);
                    entry.setLegSettlDate(legSettlDate.getValue());

                }
                if(g.isSetField(legLastPx)) {
                    legLastPx = (cl.bithaus.qfix.fields.LegLastPx) g.getField(legLastPx);
                    entry.setLegLastPx(legLastPx.getValue());

                }
                if(g.isSetField(targetLegRefId)) {
                    targetLegRefId = (cl.bithaus.qfix.fields.TargetLegRefId) g.getField(targetLegRefId);
                    entry.setTargetLegRefId(targetLegRefId.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoSides()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoSides().getField());
            List<cl.bithaus.fix.TradeCaptureReport.NoSides.NoSidesEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.Side side = new cl.bithaus.qfix.fields.Side();
            cl.bithaus.qfix.fields.OrderID orderID = new cl.bithaus.qfix.fields.OrderID();
            cl.bithaus.qfix.fields.SecondaryOrderID secondaryOrderID = new cl.bithaus.qfix.fields.SecondaryOrderID();
            cl.bithaus.qfix.fields.ClOrdID clOrdID = new cl.bithaus.qfix.fields.ClOrdID();
            cl.bithaus.qfix.fields.SecondaryClOrdID secondaryClOrdID = new cl.bithaus.qfix.fields.SecondaryClOrdID();
            cl.bithaus.qfix.fields.ListID listID = new cl.bithaus.qfix.fields.ListID();
            cl.bithaus.qfix.fields.Account account = new cl.bithaus.qfix.fields.Account();
            cl.bithaus.qfix.fields.AcctIDSource acctIDSource = new cl.bithaus.qfix.fields.AcctIDSource();
            cl.bithaus.qfix.fields.AccountType accountType = new cl.bithaus.qfix.fields.AccountType();
            cl.bithaus.qfix.fields.ProcessCode processCode = new cl.bithaus.qfix.fields.ProcessCode();
            cl.bithaus.qfix.fields.OddLot oddLot = new cl.bithaus.qfix.fields.OddLot();
            cl.bithaus.qfix.fields.ClearingFeeIndicator clearingFeeIndicator = new cl.bithaus.qfix.fields.ClearingFeeIndicator();
            cl.bithaus.qfix.fields.TradeInputSource tradeInputSource = new cl.bithaus.qfix.fields.TradeInputSource();
            cl.bithaus.qfix.fields.TradeInputDevice tradeInputDevice = new cl.bithaus.qfix.fields.TradeInputDevice();
            cl.bithaus.qfix.fields.OrderInputDevice orderInputDevice = new cl.bithaus.qfix.fields.OrderInputDevice();
            cl.bithaus.qfix.fields.Currency currency = new cl.bithaus.qfix.fields.Currency();
            cl.bithaus.qfix.fields.ComplianceID complianceID = new cl.bithaus.qfix.fields.ComplianceID();
            cl.bithaus.qfix.fields.SolicitedFlag solicitedFlag = new cl.bithaus.qfix.fields.SolicitedFlag();
            cl.bithaus.qfix.fields.OrderCapacity orderCapacity = new cl.bithaus.qfix.fields.OrderCapacity();
            cl.bithaus.qfix.fields.OrderRestrictions orderRestrictions = new cl.bithaus.qfix.fields.OrderRestrictions();
            cl.bithaus.qfix.fields.CustOrderCapacity custOrderCapacity = new cl.bithaus.qfix.fields.CustOrderCapacity();
            cl.bithaus.qfix.fields.OrdType ordType = new cl.bithaus.qfix.fields.OrdType();
            cl.bithaus.qfix.fields.ExecInst execInst = new cl.bithaus.qfix.fields.ExecInst();
            cl.bithaus.qfix.fields.TransBkdTime transBkdTime = new cl.bithaus.qfix.fields.TransBkdTime();
            cl.bithaus.qfix.fields.TradingSessionID tradingSessionID = new cl.bithaus.qfix.fields.TradingSessionID();
            cl.bithaus.qfix.fields.TradingSessionSubID tradingSessionSubID = new cl.bithaus.qfix.fields.TradingSessionSubID();
            cl.bithaus.qfix.fields.TimeBracket timeBracket = new cl.bithaus.qfix.fields.TimeBracket();
            cl.bithaus.qfix.fields.GrossTradeAmt grossTradeAmt = new cl.bithaus.qfix.fields.GrossTradeAmt();
            cl.bithaus.qfix.fields.NumDaysInterest numDaysInterest = new cl.bithaus.qfix.fields.NumDaysInterest();
            cl.bithaus.qfix.fields.ExDate exDate = new cl.bithaus.qfix.fields.ExDate();
            cl.bithaus.qfix.fields.AccruedInterestRate accruedInterestRate = new cl.bithaus.qfix.fields.AccruedInterestRate();
            cl.bithaus.qfix.fields.AccruedInterestAmt accruedInterestAmt = new cl.bithaus.qfix.fields.AccruedInterestAmt();
            cl.bithaus.qfix.fields.InterestAtMaturity interestAtMaturity = new cl.bithaus.qfix.fields.InterestAtMaturity();
            cl.bithaus.qfix.fields.EndAccruedInterestAmt endAccruedInterestAmt = new cl.bithaus.qfix.fields.EndAccruedInterestAmt();
            cl.bithaus.qfix.fields.StartCash startCash = new cl.bithaus.qfix.fields.StartCash();
            cl.bithaus.qfix.fields.EndCash endCash = new cl.bithaus.qfix.fields.EndCash();
            cl.bithaus.qfix.fields.Concession concession = new cl.bithaus.qfix.fields.Concession();
            cl.bithaus.qfix.fields.TotalTakedown totalTakedown = new cl.bithaus.qfix.fields.TotalTakedown();
            cl.bithaus.qfix.fields.NetMoney netMoney = new cl.bithaus.qfix.fields.NetMoney();
            cl.bithaus.qfix.fields.SettlCurrAmt settlCurrAmt = new cl.bithaus.qfix.fields.SettlCurrAmt();
            cl.bithaus.qfix.fields.SettlCurrency settlCurrency = new cl.bithaus.qfix.fields.SettlCurrency();
            cl.bithaus.qfix.fields.SettlCurrFxRate settlCurrFxRate = new cl.bithaus.qfix.fields.SettlCurrFxRate();
            cl.bithaus.qfix.fields.SettlCurrFxRateCalc settlCurrFxRateCalc = new cl.bithaus.qfix.fields.SettlCurrFxRateCalc();
            cl.bithaus.qfix.fields.PositionEffect positionEffect = new cl.bithaus.qfix.fields.PositionEffect();
            cl.bithaus.qfix.fields.Text text = new cl.bithaus.qfix.fields.Text();
            cl.bithaus.qfix.fields.EncodedTextLen encodedTextLen = new cl.bithaus.qfix.fields.EncodedTextLen();
            cl.bithaus.qfix.fields.EncodedText encodedText = new cl.bithaus.qfix.fields.EncodedText();
            cl.bithaus.qfix.fields.SideMultiLegReportingType sideMultiLegReportingType = new cl.bithaus.qfix.fields.SideMultiLegReportingType();
            cl.bithaus.qfix.fields.ExchangeRule exchangeRule = new cl.bithaus.qfix.fields.ExchangeRule();
            cl.bithaus.qfix.fields.TradeAllocIndicator tradeAllocIndicator = new cl.bithaus.qfix.fields.TradeAllocIndicator();
            cl.bithaus.qfix.fields.PreallocMethod preallocMethod = new cl.bithaus.qfix.fields.PreallocMethod();
            cl.bithaus.qfix.fields.AllocID allocID = new cl.bithaus.qfix.fields.AllocID();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.TradeCaptureReport.NoSides.NoSidesEntry entry = 
                    new cl.bithaus.fix.TradeCaptureReport.NoSides.NoSidesEntry();

                if(g.isSetField(side)) {
                    side = (cl.bithaus.qfix.fields.Side) g.getField(side);
                    entry.setSide(side.getValue()+"");
                }
                if(g.isSetField(orderID)) {
                    orderID = (cl.bithaus.qfix.fields.OrderID) g.getField(orderID);
                    entry.setOrderID(orderID.getValue());

                }
                if(g.isSetField(secondaryOrderID)) {
                    secondaryOrderID = (cl.bithaus.qfix.fields.SecondaryOrderID) g.getField(secondaryOrderID);
                    entry.setSecondaryOrderID(secondaryOrderID.getValue());

                }
                if(g.isSetField(clOrdID)) {
                    clOrdID = (cl.bithaus.qfix.fields.ClOrdID) g.getField(clOrdID);
                    entry.setClOrdID(clOrdID.getValue());

                }
                if(g.isSetField(secondaryClOrdID)) {
                    secondaryClOrdID = (cl.bithaus.qfix.fields.SecondaryClOrdID) g.getField(secondaryClOrdID);
                    entry.setSecondaryClOrdID(secondaryClOrdID.getValue());

                }
                if(g.isSetField(listID)) {
                    listID = (cl.bithaus.qfix.fields.ListID) g.getField(listID);
                    entry.setListID(listID.getValue());

                }
                if(g.isSetField(account)) {
                    account = (cl.bithaus.qfix.fields.Account) g.getField(account);
                    entry.setAccount(account.getValue());

                }
                if(g.isSetField(acctIDSource)) {
                    acctIDSource = (cl.bithaus.qfix.fields.AcctIDSource) g.getField(acctIDSource);
                    entry.setAcctIDSource(acctIDSource.getValue());

                }
                if(g.isSetField(accountType)) {
                    accountType = (cl.bithaus.qfix.fields.AccountType) g.getField(accountType);
                    entry.setAccountType(accountType.getValue());

                }
                if(g.isSetField(processCode)) {
                    processCode = (cl.bithaus.qfix.fields.ProcessCode) g.getField(processCode);
                    entry.setProcessCode(processCode.getValue()+"");
                }
                if(g.isSetField(oddLot)) {
                    oddLot = (cl.bithaus.qfix.fields.OddLot) g.getField(oddLot);
                    entry.setOddLot(oddLot.getValue());

                }
                if(g.isSetField(clearingFeeIndicator)) {
                    clearingFeeIndicator = (cl.bithaus.qfix.fields.ClearingFeeIndicator) g.getField(clearingFeeIndicator);
                    entry.setClearingFeeIndicator(clearingFeeIndicator.getValue());

                }
                if(g.isSetField(tradeInputSource)) {
                    tradeInputSource = (cl.bithaus.qfix.fields.TradeInputSource) g.getField(tradeInputSource);
                    entry.setTradeInputSource(tradeInputSource.getValue());

                }
                if(g.isSetField(tradeInputDevice)) {
                    tradeInputDevice = (cl.bithaus.qfix.fields.TradeInputDevice) g.getField(tradeInputDevice);
                    entry.setTradeInputDevice(tradeInputDevice.getValue());

                }
                if(g.isSetField(orderInputDevice)) {
                    orderInputDevice = (cl.bithaus.qfix.fields.OrderInputDevice) g.getField(orderInputDevice);
                    entry.setOrderInputDevice(orderInputDevice.getValue());

                }
                if(g.isSetField(currency)) {
                    currency = (cl.bithaus.qfix.fields.Currency) g.getField(currency);
                    entry.setCurrency(currency.getValue());

                }
                if(g.isSetField(complianceID)) {
                    complianceID = (cl.bithaus.qfix.fields.ComplianceID) g.getField(complianceID);
                    entry.setComplianceID(complianceID.getValue());

                }
                if(g.isSetField(solicitedFlag)) {
                    solicitedFlag = (cl.bithaus.qfix.fields.SolicitedFlag) g.getField(solicitedFlag);
                    entry.setSolicitedFlag(solicitedFlag.getValue());

                }
                if(g.isSetField(orderCapacity)) {
                    orderCapacity = (cl.bithaus.qfix.fields.OrderCapacity) g.getField(orderCapacity);
                    entry.setOrderCapacity(orderCapacity.getValue()+"");
                }
                if(g.isSetField(orderRestrictions)) {
                    orderRestrictions = (cl.bithaus.qfix.fields.OrderRestrictions) g.getField(orderRestrictions);
                    entry.setOrderRestrictions(orderRestrictions.getValue());

                }
                if(g.isSetField(custOrderCapacity)) {
                    custOrderCapacity = (cl.bithaus.qfix.fields.CustOrderCapacity) g.getField(custOrderCapacity);
                    entry.setCustOrderCapacity(custOrderCapacity.getValue());

                }
                if(g.isSetField(ordType)) {
                    ordType = (cl.bithaus.qfix.fields.OrdType) g.getField(ordType);
                    entry.setOrdType(ordType.getValue()+"");
                }
                if(g.isSetField(execInst)) {
                    execInst = (cl.bithaus.qfix.fields.ExecInst) g.getField(execInst);
                    entry.setExecInst(execInst.getValue());

                }
                if(g.isSetField(transBkdTime)) {
                    transBkdTime = (cl.bithaus.qfix.fields.TransBkdTime) g.getField(transBkdTime);
                    entry.setTransBkdTime(transBkdTime.getValue());

                }
                if(g.isSetField(tradingSessionID)) {
                    tradingSessionID = (cl.bithaus.qfix.fields.TradingSessionID) g.getField(tradingSessionID);
                    entry.setTradingSessionID(tradingSessionID.getValue());

                }
                if(g.isSetField(tradingSessionSubID)) {
                    tradingSessionSubID = (cl.bithaus.qfix.fields.TradingSessionSubID) g.getField(tradingSessionSubID);
                    entry.setTradingSessionSubID(tradingSessionSubID.getValue());

                }
                if(g.isSetField(timeBracket)) {
                    timeBracket = (cl.bithaus.qfix.fields.TimeBracket) g.getField(timeBracket);
                    entry.setTimeBracket(timeBracket.getValue());

                }
                if(g.isSetField(grossTradeAmt)) {
                    grossTradeAmt = (cl.bithaus.qfix.fields.GrossTradeAmt) g.getField(grossTradeAmt);
                    entry.setGrossTradeAmt(grossTradeAmt.getValue());

                }
                if(g.isSetField(numDaysInterest)) {
                    numDaysInterest = (cl.bithaus.qfix.fields.NumDaysInterest) g.getField(numDaysInterest);
                    entry.setNumDaysInterest(numDaysInterest.getValue());

                }
                if(g.isSetField(exDate)) {
                    exDate = (cl.bithaus.qfix.fields.ExDate) g.getField(exDate);
                    entry.setExDate(exDate.getValue());

                }
                if(g.isSetField(accruedInterestRate)) {
                    accruedInterestRate = (cl.bithaus.qfix.fields.AccruedInterestRate) g.getField(accruedInterestRate);
                    entry.setAccruedInterestRate(new BigDecimal(accruedInterestRate.getValue()));
                }
                if(g.isSetField(accruedInterestAmt)) {
                    accruedInterestAmt = (cl.bithaus.qfix.fields.AccruedInterestAmt) g.getField(accruedInterestAmt);
                    entry.setAccruedInterestAmt(accruedInterestAmt.getValue());

                }
                if(g.isSetField(interestAtMaturity)) {
                    interestAtMaturity = (cl.bithaus.qfix.fields.InterestAtMaturity) g.getField(interestAtMaturity);
                    entry.setInterestAtMaturity(interestAtMaturity.getValue());

                }
                if(g.isSetField(endAccruedInterestAmt)) {
                    endAccruedInterestAmt = (cl.bithaus.qfix.fields.EndAccruedInterestAmt) g.getField(endAccruedInterestAmt);
                    entry.setEndAccruedInterestAmt(endAccruedInterestAmt.getValue());

                }
                if(g.isSetField(startCash)) {
                    startCash = (cl.bithaus.qfix.fields.StartCash) g.getField(startCash);
                    entry.setStartCash(startCash.getValue());

                }
                if(g.isSetField(endCash)) {
                    endCash = (cl.bithaus.qfix.fields.EndCash) g.getField(endCash);
                    entry.setEndCash(endCash.getValue());

                }
                if(g.isSetField(concession)) {
                    concession = (cl.bithaus.qfix.fields.Concession) g.getField(concession);
                    entry.setConcession(concession.getValue());

                }
                if(g.isSetField(totalTakedown)) {
                    totalTakedown = (cl.bithaus.qfix.fields.TotalTakedown) g.getField(totalTakedown);
                    entry.setTotalTakedown(totalTakedown.getValue());

                }
                if(g.isSetField(netMoney)) {
                    netMoney = (cl.bithaus.qfix.fields.NetMoney) g.getField(netMoney);
                    entry.setNetMoney(netMoney.getValue());

                }
                if(g.isSetField(settlCurrAmt)) {
                    settlCurrAmt = (cl.bithaus.qfix.fields.SettlCurrAmt) g.getField(settlCurrAmt);
                    entry.setSettlCurrAmt(settlCurrAmt.getValue());

                }
                if(g.isSetField(settlCurrency)) {
                    settlCurrency = (cl.bithaus.qfix.fields.SettlCurrency) g.getField(settlCurrency);
                    entry.setSettlCurrency(settlCurrency.getValue());

                }
                if(g.isSetField(settlCurrFxRate)) {
                    settlCurrFxRate = (cl.bithaus.qfix.fields.SettlCurrFxRate) g.getField(settlCurrFxRate);
                    entry.setSettlCurrFxRate(new BigDecimal(settlCurrFxRate.getValue()));
                }
                if(g.isSetField(settlCurrFxRateCalc)) {
                    settlCurrFxRateCalc = (cl.bithaus.qfix.fields.SettlCurrFxRateCalc) g.getField(settlCurrFxRateCalc);
                    entry.setSettlCurrFxRateCalc(settlCurrFxRateCalc.getValue()+"");
                }
                if(g.isSetField(positionEffect)) {
                    positionEffect = (cl.bithaus.qfix.fields.PositionEffect) g.getField(positionEffect);
                    entry.setPositionEffect(positionEffect.getValue()+"");
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
                if(g.isSetField(sideMultiLegReportingType)) {
                    sideMultiLegReportingType = (cl.bithaus.qfix.fields.SideMultiLegReportingType) g.getField(sideMultiLegReportingType);
                    entry.setSideMultiLegReportingType(sideMultiLegReportingType.getValue());

                }
                if(g.isSetField(exchangeRule)) {
                    exchangeRule = (cl.bithaus.qfix.fields.ExchangeRule) g.getField(exchangeRule);
                    entry.setExchangeRule(exchangeRule.getValue());

                }
                if(g.isSetField(tradeAllocIndicator)) {
                    tradeAllocIndicator = (cl.bithaus.qfix.fields.TradeAllocIndicator) g.getField(tradeAllocIndicator);
                    entry.setTradeAllocIndicator(tradeAllocIndicator.getValue());

                }
                if(g.isSetField(preallocMethod)) {
                    preallocMethod = (cl.bithaus.qfix.fields.PreallocMethod) g.getField(preallocMethod);
                    entry.setPreallocMethod(preallocMethod.getValue()+"");
                }
                if(g.isSetField(allocID)) {
                    allocID = (cl.bithaus.qfix.fields.AllocID) g.getField(allocID);
                    entry.setAllocID(allocID.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

