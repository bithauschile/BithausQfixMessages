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
public class OrderCancelReplaceRequestTranslator  {

    public static cl.bithaus.qfix.msg.OrderCancelReplaceRequest toFix(cl.bithaus.fix.OrderCancelReplaceRequest src) {

        cl.bithaus.qfix.msg.OrderCancelReplaceRequest dest = new cl.bithaus.qfix.msg.OrderCancelReplaceRequest();

        if(src.getOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderID(src.getOrderID()));
            
        if(src.getTradeOriginationDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeOriginationDate(src.getTradeOriginationDate()));
            
        if(src.getTradeDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeDate(src.getTradeDate()));
            
        if(src.getOrigClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigClOrdID(src.getOrigClOrdID()));
            
        if(src.getClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdID(src.getClOrdID()));
            
        if(src.getSecondaryClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(src.getSecondaryClOrdID()));
            
        if(src.getClOrdLinkID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdLinkID(src.getClOrdLinkID()));
            
        if(src.getListID() != null)
            dest.set(new cl.bithaus.qfix.fields.ListID(src.getListID()));
            
        if(src.getOrigOrdModTime() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigOrdModTime(src.getOrigOrdModTime()));
            
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
            
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
            
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
            
        if(src.getTargetStrategy() != null)
            dest.set(new cl.bithaus.qfix.fields.TargetStrategy(src.getTargetStrategy()));
            
        if(src.getTargetStrategyParameters() != null)
            dest.set(new cl.bithaus.qfix.fields.TargetStrategyParameters(src.getTargetStrategyParameters()));
            
        if(src.getParticipationRate() != null)
            dest.set(new cl.bithaus.qfix.fields.ParticipationRate(src.getParticipationRate().doubleValue()));
            
        if(src.getSolicitedFlag() != null)
            dest.set(new cl.bithaus.qfix.fields.SolicitedFlag(src.getSolicitedFlag()));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getTimeInForce() != null)
            if(src.getTimeInForce().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.TimeInForce(src.getTimeInForce().charAt(0)));
            
        if(src.getEffectiveTime() != null)
            dest.set(new cl.bithaus.qfix.fields.EffectiveTime(src.getEffectiveTime()));
            
        if(src.getExpireTime() != null)
            dest.set(new cl.bithaus.qfix.fields.ExpireTime(src.getExpireTime()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getOrderQty2() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderQty2(src.getOrderQty2()));
            
        if(src.getPrice2() != null)
            dest.set(new cl.bithaus.qfix.fields.Price2(src.getPrice2()));
            
        if(src.getLocateReqd() != null)
            dest.set(new cl.bithaus.qfix.fields.LocateReqd(src.getLocateReqd()));
            
        if(src.getRegistID() != null)
            dest.set(new cl.bithaus.qfix.fields.RegistID(src.getRegistID()));
            
        if(src.getStopPxCondition() != null)
            if(src.getStopPxCondition().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.StopPxCondition(src.getStopPxCondition().charAt(0)));
            
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
            
        if(src.getNoOffers() != null)
            dest.set(new cl.bithaus.qfix.fields.NoOffers(src.getNoOffers()));
            


        return dest;
    }


}

