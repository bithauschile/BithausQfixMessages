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
public class NewOrderMultilegTranslator  {

    public static cl.bithaus.qfix.msg.NewOrderMultileg toFix(cl.bithaus.fix.NewOrderMultileg src) {

        cl.bithaus.qfix.msg.NewOrderMultileg dest = new cl.bithaus.qfix.msg.NewOrderMultileg();

        if(src.getClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdID(src.getClOrdID()));
            
        if(src.getSecondaryClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(src.getSecondaryClOrdID()));
            
        if(src.getClOrdLinkID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdLinkID(src.getClOrdLinkID()));
            
        if(src.getTradeOriginationDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeOriginationDate(src.getTradeOriginationDate()));
            
        if(src.getTradeDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeDate(src.getTradeDate()));
            
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
            
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
            
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
            
        if(src.getDayBookingInst() != null)
            if(src.getDayBookingInst().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.DayBookingInst(src.getDayBookingInst().charAt(0)));
            
        if(src.getBookingUnit() != null)
            if(src.getBookingUnit().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.BookingUnit(src.getBookingUnit().charAt(0)));
            
        if(src.getPreallocMethod() != null)
            if(src.getPreallocMethod().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.PreallocMethod(src.getPreallocMethod().charAt(0)));
            
        if(src.getAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocID(src.getAllocID()));
            
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
            
        if(src.getHandlInst() != null)
            if(src.getHandlInst().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.HandlInst(src.getHandlInst().charAt(0)));
            
        if(src.getExecInst() != null)
            dest.set(new cl.bithaus.qfix.fields.ExecInst(src.getExecInst()));
            
        if(src.getMinQty() != null)
            dest.set(new cl.bithaus.qfix.fields.MinQty(src.getMinQty()));
            
        if(src.getMaxFloor() != null)
            dest.set(new cl.bithaus.qfix.fields.MaxFloor(src.getMaxFloor()));
            
        if(src.getExDestination() != null)
            dest.set(new cl.bithaus.qfix.fields.ExDestination(src.getExDestination()));
            
        if(src.getProcessCode() != null)
            if(src.getProcessCode().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.ProcessCode(src.getProcessCode().charAt(0)));
            
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
            
        if(src.getPrevClosePx() != null)
            dest.set(new cl.bithaus.qfix.fields.PrevClosePx(src.getPrevClosePx()));
            
        if(src.getLocateReqd() != null)
            dest.set(new cl.bithaus.qfix.fields.LocateReqd(src.getLocateReqd()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
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
            
        if(src.getComplianceID() != null)
            dest.set(new cl.bithaus.qfix.fields.ComplianceID(src.getComplianceID()));
            
        if(src.getSolicitedFlag() != null)
            dest.set(new cl.bithaus.qfix.fields.SolicitedFlag(src.getSolicitedFlag()));
            
        if(src.getIOIid() != null)
            dest.set(new cl.bithaus.qfix.fields.IOIid(src.getIOIid()));
            
        if(src.getQuoteID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteID(src.getQuoteID()));
            
        if(src.getTimeInForce() != null)
            if(src.getTimeInForce().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.TimeInForce(src.getTimeInForce().charAt(0)));
            
        if(src.getEffectiveTime() != null)
            dest.set(new cl.bithaus.qfix.fields.EffectiveTime(src.getEffectiveTime()));
            
        if(src.getExpireDate() != null)
            dest.set(new cl.bithaus.qfix.fields.ExpireDate(src.getExpireDate()));
            
        if(src.getExpireTime() != null)
            dest.set(new cl.bithaus.qfix.fields.ExpireTime(src.getExpireTime()));
            
        if(src.getGTBookingInst() != null)
            dest.set(new cl.bithaus.qfix.fields.GTBookingInst(src.getGTBookingInst()));
            
        if(src.getOrderCapacity() != null)
            if(src.getOrderCapacity().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.OrderCapacity(src.getOrderCapacity().charAt(0)));
            
        if(src.getOrderRestrictions() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderRestrictions(src.getOrderRestrictions()));
            
        if(src.getCustOrderCapacity() != null)
            dest.set(new cl.bithaus.qfix.fields.CustOrderCapacity(src.getCustOrderCapacity()));
            
        if(src.getForexReq() != null)
            dest.set(new cl.bithaus.qfix.fields.ForexReq(src.getForexReq()));
            
        if(src.getSettlCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlCurrency(src.getSettlCurrency()));
            
        if(src.getBookingType() != null)
            dest.set(new cl.bithaus.qfix.fields.BookingType(src.getBookingType()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            
        if(src.getPositionEffect() != null)
            if(src.getPositionEffect().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.PositionEffect(src.getPositionEffect().charAt(0)));
            
        if(src.getCoveredOrUncovered() != null)
            dest.set(new cl.bithaus.qfix.fields.CoveredOrUncovered(src.getCoveredOrUncovered()));
            
        if(src.getMaxShow() != null)
            dest.set(new cl.bithaus.qfix.fields.MaxShow(src.getMaxShow()));
            
        if(src.getTargetStrategy() != null)
            dest.set(new cl.bithaus.qfix.fields.TargetStrategy(src.getTargetStrategy()));
            
        if(src.getTargetStrategyParameters() != null)
            dest.set(new cl.bithaus.qfix.fields.TargetStrategyParameters(src.getTargetStrategyParameters()));
            
        if(src.getParticipationRate() != null)
            dest.set(new cl.bithaus.qfix.fields.ParticipationRate(src.getParticipationRate().doubleValue()));
            
        if(src.getCancellationRights() != null)
            if(src.getCancellationRights().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.CancellationRights(src.getCancellationRights().charAt(0)));
            
        if(src.getMoneyLaunderingStatus() != null)
            if(src.getMoneyLaunderingStatus().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.MoneyLaunderingStatus(src.getMoneyLaunderingStatus().charAt(0)));
            
        if(src.getRegistID() != null)
            dest.set(new cl.bithaus.qfix.fields.RegistID(src.getRegistID()));
            
        if(src.getDesignation() != null)
            dest.set(new cl.bithaus.qfix.fields.Designation(src.getDesignation()));
            
        if(src.getMultiLegRptTypeReq() != null)
            dest.set(new cl.bithaus.qfix.fields.MultiLegRptTypeReq(src.getMultiLegRptTypeReq()));
            

        if(src.getNoAllocs() != null && src.getNoAllocs().size() > 0) {

            for(cl.bithaus.fix.NewOrderMultileg.NoAllocs.NoAllocsEntry entry : src.getNoAllocs().getGroups()) {

                cl.bithaus.qfix.msg.NewOrderMultileg.NoAllocs aux = 
                    new cl.bithaus.qfix.msg.NewOrderMultileg.NoAllocs();

                aux.set(new cl.bithaus.qfix.fields.AllocAccount(entry.getAllocAccount()));
                aux.set(new cl.bithaus.qfix.fields.AllocAcctIDSource(entry.getAllocAcctIDSource()));
                aux.set(new cl.bithaus.qfix.fields.AllocSettlCurrency(entry.getAllocSettlCurrency()));
                aux.set(new cl.bithaus.qfix.fields.IndividualAllocID(entry.getIndividualAllocID()));
                aux.set(new cl.bithaus.qfix.fields.AllocQty(entry.getAllocQty()));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoTradingSessions() != null && src.getNoTradingSessions().size() > 0) {

            for(cl.bithaus.fix.NewOrderMultileg.NoTradingSessions.NoTradingSessionsEntry entry : src.getNoTradingSessions().getGroups()) {

                cl.bithaus.qfix.msg.NewOrderMultileg.NoTradingSessions aux = 
                    new cl.bithaus.qfix.msg.NewOrderMultileg.NoTradingSessions();

                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.NewOrderMultileg.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.NewOrderMultileg.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.NewOrderMultileg.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.NewOrderMultileg.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.NewOrderMultileg.NoLegs aux = 
                    new cl.bithaus.qfix.msg.NewOrderMultileg.NoLegs();

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
                aux.set(new cl.bithaus.qfix.fields.TargetLegRefId(entry.getTargetLegRefId()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

