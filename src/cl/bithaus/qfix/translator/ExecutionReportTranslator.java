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
public class ExecutionReportTranslator  {

    public static cl.bithaus.qfix.msg.ExecutionReport toFix(cl.bithaus.fix.ExecutionReport src) {

        cl.bithaus.qfix.msg.ExecutionReport dest = new cl.bithaus.qfix.msg.ExecutionReport();

        if(src.getOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderID(src.getOrderID()));
            
        if(src.getSecondaryOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryOrderID(src.getSecondaryOrderID()));
            
        if(src.getSecondaryClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(src.getSecondaryClOrdID()));
            
        if(src.getSecondaryExecID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryExecID(src.getSecondaryExecID()));
            
        if(src.getClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdID(src.getClOrdID()));
            
        if(src.getOrigClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigClOrdID(src.getOrigClOrdID()));
            
        if(src.getClOrdLinkID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdLinkID(src.getClOrdLinkID()));
            
        if(src.getQuoteRespID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteRespID(src.getQuoteRespID()));
            
        if(src.getOrdStatusReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrdStatusReqID(src.getOrdStatusReqID()));
            
        if(src.getMassStatusReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.MassStatusReqID(src.getMassStatusReqID()));
            
        if(src.getTotNumReports() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNumReports(src.getTotNumReports()));
            
        if(src.getLastRptRequested() != null)
            dest.set(new cl.bithaus.qfix.fields.LastRptRequested(src.getLastRptRequested()));
            
        if(src.getTradeOriginationDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeOriginationDate(src.getTradeOriginationDate()));
            
        if(src.getListID() != null)
            dest.set(new cl.bithaus.qfix.fields.ListID(src.getListID()));
            
        if(src.getCrossID() != null)
            dest.set(new cl.bithaus.qfix.fields.CrossID(src.getCrossID()));
            
        if(src.getOrigCrossID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigCrossID(src.getOrigCrossID()));
            
        if(src.getCrossType() != null)
            dest.set(new cl.bithaus.qfix.fields.CrossType(src.getCrossType()));
            
        if(src.getExecID() != null)
            dest.set(new cl.bithaus.qfix.fields.ExecID(src.getExecID()));
            
        if(src.getExecRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.ExecRefID(src.getExecRefID()));
            
        if(src.getExecType() != null)
            if(src.getExecType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.ExecType(src.getExecType().charAt(0)));
            
        if(src.getOrdStatus() != null)
            if(src.getOrdStatus().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.OrdStatus(src.getOrdStatus().charAt(0)));
            
        if(src.getOrdRejReason() != null)
            dest.set(new cl.bithaus.qfix.fields.OrdRejReason(src.getOrdRejReason()));
            
        if(src.getExecRestatementReason() != null)
            dest.set(new cl.bithaus.qfix.fields.ExecRestatementReason(src.getExecRestatementReason()));
            
        if(src.getSettlType() != null)
            if(src.getSettlType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SettlType(src.getSettlType().charAt(0)));
            
        if(src.getSettlDate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlDate(src.getSettlDate()));
            
        if(src.getCashMargin() != null)
            if(src.getCashMargin().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.CashMargin(src.getCashMargin().charAt(0)));
            
        if(src.getClearingFeeIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.ClearingFeeIndicator(src.getClearingFeeIndicator()));
            
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
            
        if(src.getQtyType() != null)
            dest.set(new cl.bithaus.qfix.fields.QtyType(src.getQtyType()));
            
        if(src.getOrdType() != null)
            if(src.getOrdType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.OrdType(src.getOrdType().charAt(0)));
            
        if(src.getPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.PriceType(src.getPriceType()));
            
        if(src.getPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.Price(src.getPrice()));
            
        if(src.getStopPx() != null)
            dest.set(new cl.bithaus.qfix.fields.StopPx(src.getStopPx()));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getSettlCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlCurrency(src.getSettlCurrency()));
            
        if(src.getTimeInForce() != null)
            if(src.getTimeInForce().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.TimeInForce(src.getTimeInForce().charAt(0)));
            
        if(src.getEffectiveTime() != null)
            dest.set(new cl.bithaus.qfix.fields.EffectiveTime(src.getEffectiveTime()));
            
        if(src.getExpireDate() != null)
            dest.set(new cl.bithaus.qfix.fields.ExpireDate(src.getExpireDate()));
            
        if(src.getExpireTime() != null)
            dest.set(new cl.bithaus.qfix.fields.ExpireTime(src.getExpireTime()));
            
        if(src.getExecInst() != null)
            dest.set(new cl.bithaus.qfix.fields.ExecInst(src.getExecInst()));
            
        if(src.getLastQty() != null)
            dest.set(new cl.bithaus.qfix.fields.LastQty(src.getLastQty()));
            
        if(src.getLastPx() != null)
            dest.set(new cl.bithaus.qfix.fields.LastPx(src.getLastPx()));
            
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
            
        if(src.getLeavesQty() != null)
            dest.set(new cl.bithaus.qfix.fields.LeavesQty(src.getLeavesQty()));
            
        if(src.getCumQty() != null)
            dest.set(new cl.bithaus.qfix.fields.CumQty(src.getCumQty()));
            
        if(src.getAvgPx() != null)
            dest.set(new cl.bithaus.qfix.fields.AvgPx(src.getAvgPx()));
            
        if(src.getDayOrderQty() != null)
            dest.set(new cl.bithaus.qfix.fields.DayOrderQty(src.getDayOrderQty()));
            
        if(src.getDayCumQty() != null)
            dest.set(new cl.bithaus.qfix.fields.DayCumQty(src.getDayCumQty()));
            
        if(src.getDayAvgPx() != null)
            dest.set(new cl.bithaus.qfix.fields.DayAvgPx(src.getDayAvgPx()));
            
        if(src.getTradeDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeDate(src.getTradeDate()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
        if(src.getReportToExch() != null)
            dest.set(new cl.bithaus.qfix.fields.ReportToExch(src.getReportToExch()));
            
        if(src.getGrossTradeAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.GrossTradeAmt(src.getGrossTradeAmt()));
            
        if(src.getOrigAmount() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigAmount(src.getOrigAmount()));
            
        if(src.getHandlInst() != null)
            if(src.getHandlInst().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.HandlInst(src.getHandlInst().charAt(0)));
            
        if(src.getMinQty() != null)
            dest.set(new cl.bithaus.qfix.fields.MinQty(src.getMinQty()));
            
        if(src.getMaxFloor() != null)
            dest.set(new cl.bithaus.qfix.fields.MaxFloor(src.getMaxFloor()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getOrderQty2() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderQty2(src.getOrderQty2()));
            
        if(src.getMultiLegReportingType() != null)
            if(src.getMultiLegReportingType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.MultiLegReportingType(src.getMultiLegReportingType().charAt(0)));
            
        if(src.getRegistID() != null)
            dest.set(new cl.bithaus.qfix.fields.RegistID(src.getRegistID()));
            
        if(src.getCopyMsgIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.CopyMsgIndicator(src.getCopyMsgIndicator()));
            
        if(src.getMoveToOIB() != null)
            dest.set(new cl.bithaus.qfix.fields.MoveToOIB(src.getMoveToOIB()));
            
        if(src.getTradeID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeID(src.getTradeID()));
            
        if(src.getOldQty() != null)
            dest.set(new cl.bithaus.qfix.fields.OldQty(src.getOldQty()));
            
        if(src.getOldPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.OldPrice(src.getOldPrice()));
            
        if(src.getStopPxCondition() != null)
            if(src.getStopPxCondition().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.StopPxCondition(src.getStopPxCondition().charAt(0)));
            
        if(src.getPrice2() != null)
            dest.set(new cl.bithaus.qfix.fields.Price2(src.getPrice2()));
            
        if(src.getRoundLotBook() != null)
            if(src.getRoundLotBook().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.RoundLotBook(src.getRoundLotBook().charAt(0)));
            
        if(src.getPrePayment() != null)
            if(src.getPrePayment().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.PrePayment(src.getPrePayment().charAt(0)));
            
        if(src.getMaxRate() != null)
            dest.set(new cl.bithaus.qfix.fields.MaxRate(src.getMaxRate()));
            
        if(src.getOwnRate() != null)
            dest.set(new cl.bithaus.qfix.fields.OwnRate(src.getOwnRate()));
            
        if(src.getPublicRate() != null)
            dest.set(new cl.bithaus.qfix.fields.PublicRate(src.getPublicRate()));
            
        if(src.getBestStance() != null)
            if(src.getBestStance().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.BestStance(src.getBestStance().charAt(0)));
            
        if(src.getRefOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.RefOrderID(src.getRefOrderID()));
            
        if(src.getRefOrderIDSource() != null)
            if(src.getRefOrderIDSource().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.RefOrderIDSource(src.getRefOrderIDSource().charAt(0)));
            
        if(src.getAuctionId() != null)
            dest.set(new cl.bithaus.qfix.fields.AuctionId(src.getAuctionId()));
            
        if(src.getLastMkt() != null)
            dest.set(new cl.bithaus.qfix.fields.LastMkt(src.getLastMkt()));
            
        if(src.getDcvTitle() != null)
            dest.set(new cl.bithaus.qfix.fields.DcvTitle(src.getDcvTitle()));
            
        if(src.getExpressed() != null)
            dest.set(new cl.bithaus.qfix.fields.Expressed(src.getExpressed()));
            
        if(src.getRefOrderSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.RefOrderSubID(src.getRefOrderSubID()));
            
        if(src.getRefFractionID() != null)
            dest.set(new cl.bithaus.qfix.fields.RefFractionID(src.getRefFractionID()));
            
        if(src.getNoOffers() != null)
            dest.set(new cl.bithaus.qfix.fields.NoOffers(src.getNoOffers()));
            

        if(src.getNoContraBrokers() != null && src.getNoContraBrokers().size() > 0) {

            for(cl.bithaus.fix.ExecutionReport.NoContraBrokers.NoContraBrokersEntry entry : src.getNoContraBrokers().getGroups()) {

                cl.bithaus.qfix.msg.ExecutionReport.NoContraBrokers aux = 
                    new cl.bithaus.qfix.msg.ExecutionReport.NoContraBrokers();

                aux.set(new cl.bithaus.qfix.fields.ContraBroker(entry.getContraBroker()));
                aux.set(new cl.bithaus.qfix.fields.ContraTrader(entry.getContraTrader()));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.ExecutionReport.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.ExecutionReport.NoLegs aux = 
                    new cl.bithaus.qfix.msg.ExecutionReport.NoLegs();

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

        return dest;
    }


}

