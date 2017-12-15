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
 * Fix - Bithaus format component translator for ExecutionReport
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
        

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getFinancingDetails() != null)
            dest.set(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.toFix(src.getFinancingDetails()));

        if(src.getOrderQtyData() != null)
            dest.set(cl.bithaus.qfix.translator.component.OrderQtyDataTranslator.toFix(src.getOrderQtyData()));

        if(src.getPegInstructions() != null)
            dest.set(cl.bithaus.qfix.translator.component.PegInstructionsTranslator.toFix(src.getPegInstructions()));

        if(src.getSpecialOrderData() != null)
            dest.set(cl.bithaus.qfix.translator.component.SpecialOrderDataTranslator.toFix(src.getSpecialOrderData()));

        if(src.getIIFValorization() != null)
            dest.set(cl.bithaus.qfix.translator.component.IIFValorizationTranslator.toFix(src.getIIFValorization()));

        if(src.getIRFValorization() != null)
            dest.set(cl.bithaus.qfix.translator.component.IRFValorizationTranslator.toFix(src.getIRFValorization()));

        if(src.getOIBBestPriceData() != null)
            dest.set(cl.bithaus.qfix.translator.component.OIBBestPriceDataTranslator.toFix(src.getOIBBestPriceData()));


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

    public static cl.bithaus.fix.ExecutionReport fromFix(cl.bithaus.qfix.msg.ExecutionReport src) 
        throws FieldNotFound {

        cl.bithaus.fix.ExecutionReport dest = new cl.bithaus.fix.ExecutionReport();

        if(src.isSetOrderID())
            dest.setOrderID(src.getOrderID().getValue());

        if(src.isSetSecondaryOrderID())
            dest.setSecondaryOrderID(src.getSecondaryOrderID().getValue());

        if(src.isSetSecondaryClOrdID())
            dest.setSecondaryClOrdID(src.getSecondaryClOrdID().getValue());

        if(src.isSetSecondaryExecID())
            dest.setSecondaryExecID(src.getSecondaryExecID().getValue());

        if(src.isSetClOrdID())
            dest.setClOrdID(src.getClOrdID().getValue());

        if(src.isSetOrigClOrdID())
            dest.setOrigClOrdID(src.getOrigClOrdID().getValue());

        if(src.isSetClOrdLinkID())
            dest.setClOrdLinkID(src.getClOrdLinkID().getValue());

        if(src.isSetQuoteRespID())
            dest.setQuoteRespID(src.getQuoteRespID().getValue());

        if(src.isSetOrdStatusReqID())
            dest.setOrdStatusReqID(src.getOrdStatusReqID().getValue());

        if(src.isSetMassStatusReqID())
            dest.setMassStatusReqID(src.getMassStatusReqID().getValue());

        if(src.isSetTotNumReports())
            dest.setTotNumReports(src.getTotNumReports().getValue());

        if(src.isSetLastRptRequested())
            dest.setLastRptRequested(src.getLastRptRequested().getValue());

        if(src.isSetTradeOriginationDate())
            dest.setTradeOriginationDate(src.getTradeOriginationDate().getValue());

        if(src.isSetListID())
            dest.setListID(src.getListID().getValue());

        if(src.isSetCrossID())
            dest.setCrossID(src.getCrossID().getValue());

        if(src.isSetOrigCrossID())
            dest.setOrigCrossID(src.getOrigCrossID().getValue());

        if(src.isSetCrossType())
            dest.setCrossType(src.getCrossType().getValue());

        if(src.isSetExecID())
            dest.setExecID(src.getExecID().getValue());

        if(src.isSetExecRefID())
            dest.setExecRefID(src.getExecRefID().getValue());

        if(src.isSetExecType())
            dest.setExecType(src.getExecType().getValue()+"");

        if(src.isSetOrdStatus())
            dest.setOrdStatus(src.getOrdStatus().getValue()+"");

        if(src.isSetOrdRejReason())
            dest.setOrdRejReason(src.getOrdRejReason().getValue());

        if(src.isSetExecRestatementReason())
            dest.setExecRestatementReason(src.getExecRestatementReason().getValue());

        if(src.isSetSettlType())
            dest.setSettlType(src.getSettlType().getValue()+"");

        if(src.isSetSettlDate())
            dest.setSettlDate(src.getSettlDate().getValue());

        if(src.isSetCashMargin())
            dest.setCashMargin(src.getCashMargin().getValue()+"");

        if(src.isSetClearingFeeIndicator())
            dest.setClearingFeeIndicator(src.getClearingFeeIndicator().getValue());

        if(src.isSetSide())
            dest.setSide(src.getSide().getValue()+"");

        if(src.isSetQtyType())
            dest.setQtyType(src.getQtyType().getValue());

        if(src.isSetOrdType())
            dest.setOrdType(src.getOrdType().getValue()+"");

        if(src.isSetPriceType())
            dest.setPriceType(src.getPriceType().getValue());

        if(src.isSetPrice())
            dest.setPrice(src.getPrice().getValue());

        if(src.isSetStopPx())
            dest.setStopPx(src.getStopPx().getValue());

        if(src.isSetCurrency())
            dest.setCurrency(src.getCurrency().getValue());

        if(src.isSetSettlCurrency())
            dest.setSettlCurrency(src.getSettlCurrency().getValue());

        if(src.isSetTimeInForce())
            dest.setTimeInForce(src.getTimeInForce().getValue()+"");

        if(src.isSetEffectiveTime())
            dest.setEffectiveTime(src.getEffectiveTime().getValue());

        if(src.isSetExpireDate())
            dest.setExpireDate(src.getExpireDate().getValue());

        if(src.isSetExpireTime())
            dest.setExpireTime(src.getExpireTime().getValue());

        if(src.isSetExecInst())
            dest.setExecInst(src.getExecInst().getValue());

        if(src.isSetLastQty())
            dest.setLastQty(src.getLastQty().getValue());

        if(src.isSetLastPx())
            dest.setLastPx(src.getLastPx().getValue());

        if(src.isSetTradingSessionID())
            dest.setTradingSessionID(src.getTradingSessionID().getValue());

        if(src.isSetLeavesQty())
            dest.setLeavesQty(src.getLeavesQty().getValue());

        if(src.isSetCumQty())
            dest.setCumQty(src.getCumQty().getValue());

        if(src.isSetAvgPx())
            dest.setAvgPx(src.getAvgPx().getValue());

        if(src.isSetDayOrderQty())
            dest.setDayOrderQty(src.getDayOrderQty().getValue());

        if(src.isSetDayCumQty())
            dest.setDayCumQty(src.getDayCumQty().getValue());

        if(src.isSetDayAvgPx())
            dest.setDayAvgPx(src.getDayAvgPx().getValue());

        if(src.isSetTradeDate())
            dest.setTradeDate(src.getTradeDate().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetReportToExch())
            dest.setReportToExch(src.getReportToExch().getValue());

        if(src.isSetGrossTradeAmt())
            dest.setGrossTradeAmt(src.getGrossTradeAmt().getValue());

        if(src.isSetOrigAmount())
            dest.setOrigAmount(src.getOrigAmount().getValue());

        if(src.isSetHandlInst())
            dest.setHandlInst(src.getHandlInst().getValue()+"");

        if(src.isSetMinQty())
            dest.setMinQty(src.getMinQty().getValue());

        if(src.isSetMaxFloor())
            dest.setMaxFloor(src.getMaxFloor().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetOrderQty2())
            dest.setOrderQty2(src.getOrderQty2().getValue());

        if(src.isSetMultiLegReportingType())
            dest.setMultiLegReportingType(src.getMultiLegReportingType().getValue()+"");

        if(src.isSetRegistID())
            dest.setRegistID(src.getRegistID().getValue());

        if(src.isSetCopyMsgIndicator())
            dest.setCopyMsgIndicator(src.getCopyMsgIndicator().getValue());

        if(src.isSetMoveToOIB())
            dest.setMoveToOIB(src.getMoveToOIB().getValue());

        if(src.isSetTradeID())
            dest.setTradeID(src.getTradeID().getValue());

        if(src.isSetOldQty())
            dest.setOldQty(src.getOldQty().getValue());

        if(src.isSetOldPrice())
            dest.setOldPrice(src.getOldPrice().getValue());

        if(src.isSetStopPxCondition())
            dest.setStopPxCondition(src.getStopPxCondition().getValue()+"");

        if(src.isSetPrice2())
            dest.setPrice2(src.getPrice2().getValue());

        if(src.isSetRoundLotBook())
            dest.setRoundLotBook(src.getRoundLotBook().getValue()+"");

        if(src.isSetPrePayment())
            dest.setPrePayment(src.getPrePayment().getValue()+"");

        if(src.isSetMaxRate())
            dest.setMaxRate(src.getMaxRate().getValue());

        if(src.isSetOwnRate())
            dest.setOwnRate(src.getOwnRate().getValue());

        if(src.isSetPublicRate())
            dest.setPublicRate(src.getPublicRate().getValue());

        if(src.isSetBestStance())
            dest.setBestStance(src.getBestStance().getValue()+"");

        if(src.isSetRefOrderID())
            dest.setRefOrderID(src.getRefOrderID().getValue());

        if(src.isSetRefOrderIDSource())
            dest.setRefOrderIDSource(src.getRefOrderIDSource().getValue()+"");

        if(src.isSetAuctionId())
            dest.setAuctionId(src.getAuctionId().getValue());

        if(src.isSetLastMkt())
            dest.setLastMkt(src.getLastMkt().getValue());

        if(src.isSetDcvTitle())
            dest.setDcvTitle(src.getDcvTitle().getValue());

        if(src.isSetExpressed())
            dest.setExpressed(src.getExpressed().getValue());

        if(src.isSetRefOrderSubID())
            dest.setRefOrderSubID(src.getRefOrderSubID().getValue());

        if(src.isSetRefFractionID())
            dest.setRefFractionID(src.getRefFractionID().getValue());

        if(src.isSetNoOffers())
            dest.setNoOffers(src.getNoOffers().getValue());


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
            dest.setFinancingDetails(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.fromFix(src.getFinancingDetails()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setOrderQtyData(cl.bithaus.qfix.translator.component.OrderQtyDataTranslator.fromFix(src.getOrderQtyData()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setPegInstructions(cl.bithaus.qfix.translator.component.PegInstructionsTranslator.fromFix(src.getPegInstructions()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setSpecialOrderData(cl.bithaus.qfix.translator.component.SpecialOrderDataTranslator.fromFix(src.getSpecialOrderData()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setIIFValorization(cl.bithaus.qfix.translator.component.IIFValorizationTranslator.fromFix(src.getIIFValorization()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setIRFValorization(cl.bithaus.qfix.translator.component.IRFValorizationTranslator.fromFix(src.getIRFValorization()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setOIBBestPriceData(cl.bithaus.qfix.translator.component.OIBBestPriceDataTranslator.fromFix(src.getOIBBestPriceData()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoContraBrokers()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoContraBrokers().getField());
            List<cl.bithaus.fix.ExecutionReport.NoContraBrokers.NoContraBrokersEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.ContraBroker contraBroker = new cl.bithaus.qfix.fields.ContraBroker();
            cl.bithaus.qfix.fields.ContraTrader contraTrader = new cl.bithaus.qfix.fields.ContraTrader();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.ExecutionReport.NoContraBrokers.NoContraBrokersEntry entry = 
                    new cl.bithaus.fix.ExecutionReport.NoContraBrokers.NoContraBrokersEntry();

                if(g.isSetField(contraBroker)) {
                    contraBroker = (cl.bithaus.qfix.fields.ContraBroker) g.getField(contraBroker);
                    entry.setContraBroker(contraBroker.getValue());

                }
                if(g.isSetField(contraTrader)) {
                    contraTrader = (cl.bithaus.qfix.fields.ContraTrader) g.getField(contraTrader);
                    entry.setContraTrader(contraTrader.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.ExecutionReport.NoLegs.NoLegsEntry> result = new LinkedList<>();

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

                cl.bithaus.fix.ExecutionReport.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.ExecutionReport.NoLegs.NoLegsEntry();

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
        return dest;

    }
}

