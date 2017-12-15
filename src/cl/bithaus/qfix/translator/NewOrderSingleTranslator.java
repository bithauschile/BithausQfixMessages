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
 * Fix - Bithaus format component translator for NewOrderSingle
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

    public static cl.bithaus.fix.NewOrderSingle fromFix(cl.bithaus.qfix.msg.NewOrderSingle src) 
        throws FieldNotFound {

        cl.bithaus.fix.NewOrderSingle dest = new cl.bithaus.fix.NewOrderSingle();

        if(src.isSetClOrdID())
            dest.setClOrdID(src.getClOrdID().getValue());

        if(src.isSetSecondaryClOrdID())
            dest.setSecondaryClOrdID(src.getSecondaryClOrdID().getValue());

        if(src.isSetClOrdLinkID())
            dest.setClOrdLinkID(src.getClOrdLinkID().getValue());

        if(src.isSetTradeOriginationDate())
            dest.setTradeOriginationDate(src.getTradeOriginationDate().getValue());

        if(src.isSetTradeDate())
            dest.setTradeDate(src.getTradeDate().getValue());

        if(src.isSetSettlType())
            dest.setSettlType(src.getSettlType().getValue()+"");

        if(src.isSetSettlDate())
            dest.setSettlDate(src.getSettlDate().getValue());

        if(src.isSetHandlInst())
            dest.setHandlInst(src.getHandlInst().getValue()+"");

        if(src.isSetExecInst())
            dest.setExecInst(src.getExecInst().getValue());

        if(src.isSetMinQty())
            dest.setMinQty(src.getMinQty().getValue());

        if(src.isSetMaxFloor())
            dest.setMaxFloor(src.getMaxFloor().getValue());

        if(src.isSetExDestination())
            dest.setExDestination(src.getExDestination().getValue());

        if(src.isSetProcessCode())
            dest.setProcessCode(src.getProcessCode().getValue()+"");

        if(src.isSetPrevClosePx())
            dest.setPrevClosePx(src.getPrevClosePx().getValue());

        if(src.isSetSide())
            dest.setSide(src.getSide().getValue()+"");

        if(src.isSetLocateReqd())
            dest.setLocateReqd(src.getLocateReqd().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

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

        if(src.isSetTimeInForce())
            dest.setTimeInForce(src.getTimeInForce().getValue()+"");

        if(src.isSetEffectiveTime())
            dest.setEffectiveTime(src.getEffectiveTime().getValue());

        if(src.isSetExpireDate())
            dest.setExpireDate(src.getExpireDate().getValue());

        if(src.isSetExpireTime())
            dest.setExpireTime(src.getExpireTime().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetOrderQty2())
            dest.setOrderQty2(src.getOrderQty2().getValue());

        if(src.isSetPrice2())
            dest.setPrice2(src.getPrice2().getValue());

        if(src.isSetRegistID())
            dest.setRegistID(src.getRegistID().getValue());

        if(src.isSetStopPxCondition())
            dest.setStopPxCondition(src.getStopPxCondition().getValue()+"");

        if(src.isSetPrePayment())
            dest.setPrePayment(src.getPrePayment().getValue()+"");

        if(src.isSetMaxRate())
            dest.setMaxRate(src.getMaxRate().getValue());

        if(src.isSetOwnRate())
            dest.setOwnRate(src.getOwnRate().getValue());

        if(src.isSetRefOrderID())
            dest.setRefOrderID(src.getRefOrderID().getValue());

        if(src.isSetRefOrderIDSource())
            dest.setRefOrderIDSource(src.getRefOrderIDSource().getValue()+"");

        if(src.isSetAuctionId())
            dest.setAuctionId(src.getAuctionId().getValue());

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


        if(src.isSetNoTradingSessions()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoTradingSessions().getField());
            List<cl.bithaus.fix.NewOrderSingle.NoTradingSessions.NoTradingSessionsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.TradingSessionID tradingSessionID = new cl.bithaus.qfix.fields.TradingSessionID();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.NewOrderSingle.NoTradingSessions.NoTradingSessionsEntry entry = 
                    new cl.bithaus.fix.NewOrderSingle.NoTradingSessions.NoTradingSessionsEntry();

                if(g.isSetField(tradingSessionID)) {
                    tradingSessionID = (cl.bithaus.qfix.fields.TradingSessionID) g.getField(tradingSessionID);
                    entry.setTradingSessionID(tradingSessionID.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

