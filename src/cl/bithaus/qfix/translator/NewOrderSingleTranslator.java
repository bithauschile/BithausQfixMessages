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
public class NewOrderSingleTranslator  {

    public static cl.bithaus.qfix.msg.NewOrderSingle toFix(cl.bithaus.fix.NewOrderSingle src) {

        cl.bithaus.qfix.msg.NewOrderSingle dest = new cl.bithaus.qfix.msg.NewOrderSingle();

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
            
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
            
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
            
        if(src.getTimeInForce() != null)
            if(src.getTimeInForce().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.TimeInForce(src.getTimeInForce().charAt(0)));
            
        if(src.getEffectiveTime() != null)
            dest.set(new cl.bithaus.qfix.fields.EffectiveTime(src.getEffectiveTime()));
            
        if(src.getExpireDate() != null)
            dest.set(new cl.bithaus.qfix.fields.ExpireDate(src.getExpireDate()));
            
        if(src.getExpireTime() != null)
            dest.set(new cl.bithaus.qfix.fields.ExpireTime(src.getExpireTime()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getOrderQty2() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderQty2(src.getOrderQty2()));
            
        if(src.getPrice2() != null)
            dest.set(new cl.bithaus.qfix.fields.Price2(src.getPrice2()));
            
        if(src.getRegistID() != null)
            dest.set(new cl.bithaus.qfix.fields.RegistID(src.getRegistID()));
            
        if(src.getStopPxCondition() != null)
            if(src.getStopPxCondition().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.StopPxCondition(src.getStopPxCondition().charAt(0)));
            
        if(src.getPrePayment() != null)
            if(src.getPrePayment().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.PrePayment(src.getPrePayment().charAt(0)));
            
        if(src.getMaxRate() != null)
            dest.set(new cl.bithaus.qfix.fields.MaxRate(src.getMaxRate()));
            
        if(src.getOwnRate() != null)
            dest.set(new cl.bithaus.qfix.fields.OwnRate(src.getOwnRate()));
            
        if(src.getRefOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.RefOrderID(src.getRefOrderID()));
            
        if(src.getRefOrderIDSource() != null)
            if(src.getRefOrderIDSource().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.RefOrderIDSource(src.getRefOrderIDSource().charAt(0)));
            
        if(src.getAuctionId() != null)
            dest.set(new cl.bithaus.qfix.fields.AuctionId(src.getAuctionId()));
            
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
            

        if(src.getNoTradingSessions() != null && src.getNoTradingSessions().size() > 0) {

            for(cl.bithaus.fix.NewOrderSingle.NoTradingSessions.NoTradingSessionsEntry entry : src.getNoTradingSessions().getGroups()) {

                cl.bithaus.qfix.msg.NewOrderSingle.NoTradingSessions aux = 
                    new cl.bithaus.qfix.msg.NewOrderSingle.NoTradingSessions();

                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

