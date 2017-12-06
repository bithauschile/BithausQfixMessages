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
public class NewOrderCrossTranslator  {

    public static cl.bithaus.qfix.msg.NewOrderCross toFix(cl.bithaus.fix.NewOrderCross src) {

        cl.bithaus.qfix.msg.NewOrderCross dest = new cl.bithaus.qfix.msg.NewOrderCross();

        if(src.getCrossID() != null)
            dest.set(new cl.bithaus.qfix.fields.CrossID(src.getCrossID()));
            
        if(src.getCrossType() != null)
            dest.set(new cl.bithaus.qfix.fields.CrossType(src.getCrossType()));
            
        if(src.getCrossPrioritization() != null)
            dest.set(new cl.bithaus.qfix.fields.CrossPrioritization(src.getCrossPrioritization()));
            
        if(src.getSettlType() != null)
            if(src.getSettlType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SettlType(src.getSettlType().charAt(0)));
            
        if(src.getSettlDate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlDate(src.getSettlDate()));
            
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
            
        if(src.getPrevClosePx() != null)
            dest.set(new cl.bithaus.qfix.fields.PrevClosePx(src.getPrevClosePx()));
            
        if(src.getLocateReqd() != null)
            dest.set(new cl.bithaus.qfix.fields.LocateReqd(src.getLocateReqd()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
        if(src.getOrdType() != null)
            if(src.getOrdType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.OrdType(src.getOrdType().charAt(0)));
            
        if(src.getPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.PriceType(src.getPriceType()));
            
        if(src.getPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.Price(src.getPrice()));
            
        if(src.getPrice2() != null)
            dest.set(new cl.bithaus.qfix.fields.Price2(src.getPrice2()));
            
        if(src.getStopPx() != null)
            dest.set(new cl.bithaus.qfix.fields.StopPx(src.getStopPx()));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getComplianceID() != null)
            dest.set(new cl.bithaus.qfix.fields.ComplianceID(src.getComplianceID()));
            
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
            
        if(src.getPrePayment() != null)
            if(src.getPrePayment().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.PrePayment(src.getPrePayment().charAt(0)));
            
        if(src.getMaxRate() != null)
            dest.set(new cl.bithaus.qfix.fields.MaxRate(src.getMaxRate()));
            
        if(src.getOwnRate() != null)
            dest.set(new cl.bithaus.qfix.fields.OwnRate(src.getOwnRate()));
            

        if(src.getNoSides() != null && src.getNoSides().size() > 0) {

            for(cl.bithaus.fix.NewOrderCross.NoSides.NoSidesEntry entry : src.getNoSides().getGroups()) {

                cl.bithaus.qfix.msg.NewOrderCross.NoSides aux = 
                    new cl.bithaus.qfix.msg.NewOrderCross.NoSides();

                if(entry.getSide().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Side(entry.getSide().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.ClOrdID(entry.getClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(entry.getSecondaryClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.ClOrdLinkID(entry.getClOrdLinkID()));
                aux.set(new cl.bithaus.qfix.fields.TradeOriginationDate(entry.getTradeOriginationDate()));
                aux.set(new cl.bithaus.qfix.fields.TradeDate(entry.getTradeDate()));
                aux.set(new cl.bithaus.qfix.fields.Account(entry.getAccount()));
                aux.set(new cl.bithaus.qfix.fields.AcctIDSource(entry.getAcctIDSource()));
                aux.set(new cl.bithaus.qfix.fields.AccountType(entry.getAccountType()));
                if(entry.getDayBookingInst().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.DayBookingInst(entry.getDayBookingInst().charAt(0)));
                if(entry.getBookingUnit().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.BookingUnit(entry.getBookingUnit().charAt(0)));
                if(entry.getPreallocMethod().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.PreallocMethod(entry.getPreallocMethod().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.AllocID(entry.getAllocID()));
                aux.set(new cl.bithaus.qfix.fields.QtyType(entry.getQtyType()));
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
                if(entry.getPositionEffect().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.PositionEffect(entry.getPositionEffect().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.CoveredOrUncovered(entry.getCoveredOrUncovered()));
                if(entry.getCashMargin().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.CashMargin(entry.getCashMargin().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.ClearingFeeIndicator(entry.getClearingFeeIndicator()));
                aux.set(new cl.bithaus.qfix.fields.SolicitedFlag(entry.getSolicitedFlag()));
                aux.set(new cl.bithaus.qfix.fields.SideComplianceID(entry.getSideComplianceID()));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.NewOrderCross.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.NewOrderCross.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.NewOrderCross.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.NewOrderCross.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.NewOrderCross.NoLegs aux = 
                    new cl.bithaus.qfix.msg.NewOrderCross.NoLegs();


                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

