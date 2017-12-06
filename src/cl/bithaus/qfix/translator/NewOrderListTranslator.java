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
public class NewOrderListTranslator  {

    public static cl.bithaus.qfix.msg.NewOrderList toFix(cl.bithaus.fix.NewOrderList src) {

        cl.bithaus.qfix.msg.NewOrderList dest = new cl.bithaus.qfix.msg.NewOrderList();

        if(src.getListID() != null)
            dest.set(new cl.bithaus.qfix.fields.ListID(src.getListID()));
            
        if(src.getBidID() != null)
            dest.set(new cl.bithaus.qfix.fields.BidID(src.getBidID()));
            
        if(src.getClientBidID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClientBidID(src.getClientBidID()));
            
        if(src.getProgRptReqs() != null)
            dest.set(new cl.bithaus.qfix.fields.ProgRptReqs(src.getProgRptReqs()));
            
        if(src.getBidType() != null)
            dest.set(new cl.bithaus.qfix.fields.BidType(src.getBidType()));
            
        if(src.getProgPeriodInterval() != null)
            dest.set(new cl.bithaus.qfix.fields.ProgPeriodInterval(src.getProgPeriodInterval()));
            
        if(src.getCancellationRights() != null)
            if(src.getCancellationRights().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.CancellationRights(src.getCancellationRights().charAt(0)));
            
        if(src.getMoneyLaunderingStatus() != null)
            if(src.getMoneyLaunderingStatus().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.MoneyLaunderingStatus(src.getMoneyLaunderingStatus().charAt(0)));
            
        if(src.getRegistID() != null)
            dest.set(new cl.bithaus.qfix.fields.RegistID(src.getRegistID()));
            
        if(src.getListExecInstType() != null)
            if(src.getListExecInstType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.ListExecInstType(src.getListExecInstType().charAt(0)));
            
        if(src.getListExecInst() != null)
            dest.set(new cl.bithaus.qfix.fields.ListExecInst(src.getListExecInst()));
            
        if(src.getEncodedListExecInstLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedListExecInstLen(src.getEncodedListExecInstLen()));
            
        if(src.getEncodedListExecInst() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedListExecInst(src.getEncodedListExecInst()));
            
        if(src.getAllowableOneSidednessPct() != null)
            dest.set(new cl.bithaus.qfix.fields.AllowableOneSidednessPct(src.getAllowableOneSidednessPct().doubleValue()));
            
        if(src.getAllowableOneSidednessValue() != null)
            dest.set(new cl.bithaus.qfix.fields.AllowableOneSidednessValue(src.getAllowableOneSidednessValue()));
            
        if(src.getAllowableOneSidednessCurr() != null)
            dest.set(new cl.bithaus.qfix.fields.AllowableOneSidednessCurr(src.getAllowableOneSidednessCurr()));
            
        if(src.getTotNoOrders() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNoOrders(src.getTotNoOrders()));
            
        if(src.getLastFragment() != null)
            dest.set(new cl.bithaus.qfix.fields.LastFragment(src.getLastFragment()));
            
        if(src.getExDestination() != null)
            dest.set(new cl.bithaus.qfix.fields.ExDestination(src.getExDestination()));
            

        if(src.getNoOrders() != null && src.getNoOrders().size() > 0) {

            for(cl.bithaus.fix.NewOrderList.NoOrders.NoOrdersEntry entry : src.getNoOrders().getGroups()) {

                cl.bithaus.qfix.msg.NewOrderList.NoOrders aux = 
                    new cl.bithaus.qfix.msg.NewOrderList.NoOrders();

                aux.set(new cl.bithaus.qfix.fields.ClOrdID(entry.getClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(entry.getSecondaryClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.ListSeqNo(entry.getListSeqNo()));
                aux.set(new cl.bithaus.qfix.fields.ClOrdLinkID(entry.getClOrdLinkID()));
                if(entry.getSettlInstMode().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.SettlInstMode(entry.getSettlInstMode().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.TradeOriginationDate(entry.getTradeOriginationDate()));
                aux.set(new cl.bithaus.qfix.fields.TradeDate(entry.getTradeDate()));
                aux.set(new cl.bithaus.qfix.fields.Account(entry.getAccount()));
                aux.set(new cl.bithaus.qfix.fields.AcctIDSource(entry.getAcctIDSource()));
                aux.set(new cl.bithaus.qfix.fields.AccountType(entry.getAccountType()));
                if(entry.getDayBookingInst().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.DayBookingInst(entry.getDayBookingInst().charAt(0)));
                if(entry.getBookingUnit().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.BookingUnit(entry.getBookingUnit().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.AllocID(entry.getAllocID()));
                if(entry.getPreallocMethod().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.PreallocMethod(entry.getPreallocMethod().charAt(0)));
                if(entry.getSettlType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.SettlType(entry.getSettlType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.SettlDate(entry.getSettlDate()));
                if(entry.getCashMargin().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.CashMargin(entry.getCashMargin().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.ClearingFeeIndicator(entry.getClearingFeeIndicator()));
                if(entry.getHandlInst().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.HandlInst(entry.getHandlInst().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.ExecInst(entry.getExecInst()));
                aux.set(new cl.bithaus.qfix.fields.MinQty(entry.getMinQty()));
                aux.set(new cl.bithaus.qfix.fields.MaxFloor(entry.getMaxFloor()));
                aux.set(new cl.bithaus.qfix.fields.ExDestination(entry.getExDestination()));
                if(entry.getProcessCode().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.ProcessCode(entry.getProcessCode().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.PrevClosePx(entry.getPrevClosePx()));
                if(entry.getSide().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Side(entry.getSide().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.SideValueInd(entry.getSideValueInd()));
                aux.set(new cl.bithaus.qfix.fields.LocateReqd(entry.getLocateReqd()));
                aux.set(new cl.bithaus.qfix.fields.TransactTime(entry.getTransactTime()));
                aux.set(new cl.bithaus.qfix.fields.QtyType(entry.getQtyType()));
                if(entry.getOrdType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.OrdType(entry.getOrdType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.PriceType(entry.getPriceType()));
                aux.set(new cl.bithaus.qfix.fields.Price(entry.getPrice()));
                aux.set(new cl.bithaus.qfix.fields.StopPx(entry.getStopPx()));
                aux.set(new cl.bithaus.qfix.fields.Currency(entry.getCurrency()));
                aux.set(new cl.bithaus.qfix.fields.ComplianceID(entry.getComplianceID()));
                aux.set(new cl.bithaus.qfix.fields.SolicitedFlag(entry.getSolicitedFlag()));
                aux.set(new cl.bithaus.qfix.fields.IOIid(entry.getIOIid()));
                aux.set(new cl.bithaus.qfix.fields.QuoteID(entry.getQuoteID()));
                if(entry.getTimeInForce().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.TimeInForce(entry.getTimeInForce().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.EffectiveTime(entry.getEffectiveTime()));
                aux.set(new cl.bithaus.qfix.fields.ExpireDate(entry.getExpireDate()));
                aux.set(new cl.bithaus.qfix.fields.ExpireTime(entry.getExpireTime()));
                aux.set(new cl.bithaus.qfix.fields.GTBookingInst(entry.getGTBookingInst()));
                if(entry.getOrderCapacity().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.OrderCapacity(entry.getOrderCapacity().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.OrderRestrictions(entry.getOrderRestrictions()));
                aux.set(new cl.bithaus.qfix.fields.CustOrderCapacity(entry.getCustOrderCapacity()));
                aux.set(new cl.bithaus.qfix.fields.ForexReq(entry.getForexReq()));
                aux.set(new cl.bithaus.qfix.fields.SettlCurrency(entry.getSettlCurrency()));
                aux.set(new cl.bithaus.qfix.fields.BookingType(entry.getBookingType()));
                aux.set(new cl.bithaus.qfix.fields.Text(entry.getText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedTextLen(entry.getEncodedTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedText(entry.getEncodedText()));
                aux.set(new cl.bithaus.qfix.fields.SettlDate2(entry.getSettlDate2()));
                aux.set(new cl.bithaus.qfix.fields.OrderQty2(entry.getOrderQty2()));
                aux.set(new cl.bithaus.qfix.fields.Price2(entry.getPrice2()));
                if(entry.getPositionEffect().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.PositionEffect(entry.getPositionEffect().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.CoveredOrUncovered(entry.getCoveredOrUncovered()));
                aux.set(new cl.bithaus.qfix.fields.MaxShow(entry.getMaxShow()));
                aux.set(new cl.bithaus.qfix.fields.TargetStrategy(entry.getTargetStrategy()));
                aux.set(new cl.bithaus.qfix.fields.TargetStrategyParameters(entry.getTargetStrategyParameters()));
                aux.set(new cl.bithaus.qfix.fields.ParticipationRate(entry.getParticipationRate().doubleValue()));
                aux.set(new cl.bithaus.qfix.fields.Designation(entry.getDesignation()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

