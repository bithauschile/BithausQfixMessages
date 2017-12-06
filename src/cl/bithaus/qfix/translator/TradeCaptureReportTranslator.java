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


}

