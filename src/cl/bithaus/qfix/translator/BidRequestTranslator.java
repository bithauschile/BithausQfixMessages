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
 * Fix - Bithaus format component translator for BidRequest
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class BidRequestTranslator  {

    public static cl.bithaus.qfix.msg.BidRequest toFix(cl.bithaus.fix.BidRequest src) {

        cl.bithaus.qfix.msg.BidRequest dest = new cl.bithaus.qfix.msg.BidRequest();

        if(src.getBidID() != null)
            dest.set(new cl.bithaus.qfix.fields.BidID(src.getBidID()));
        
        if(src.getClientBidID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClientBidID(src.getClientBidID()));
        
        if(src.getBidRequestTransType() != null)
            if(src.getBidRequestTransType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.BidRequestTransType(src.getBidRequestTransType().charAt(0)));
        
        if(src.getListName() != null)
            dest.set(new cl.bithaus.qfix.fields.ListName(src.getListName()));
        
        if(src.getTotNoRelatedSym() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNoRelatedSym(src.getTotNoRelatedSym()));
        
        if(src.getBidType() != null)
            dest.set(new cl.bithaus.qfix.fields.BidType(src.getBidType()));
        
        if(src.getNumTickets() != null)
            dest.set(new cl.bithaus.qfix.fields.NumTickets(src.getNumTickets()));
        
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
        
        if(src.getSideValue1() != null)
            dest.set(new cl.bithaus.qfix.fields.SideValue1(src.getSideValue1()));
        
        if(src.getSideValue2() != null)
            dest.set(new cl.bithaus.qfix.fields.SideValue2(src.getSideValue2()));
        
        if(src.getLiquidityIndType() != null)
            dest.set(new cl.bithaus.qfix.fields.LiquidityIndType(src.getLiquidityIndType()));
        
        if(src.getWtAverageLiquidity() != null)
            dest.set(new cl.bithaus.qfix.fields.WtAverageLiquidity(src.getWtAverageLiquidity().doubleValue()));
        
        if(src.getExchangeForPhysical() != null)
            dest.set(new cl.bithaus.qfix.fields.ExchangeForPhysical(src.getExchangeForPhysical()));
        
        if(src.getOutMainCntryUIndex() != null)
            dest.set(new cl.bithaus.qfix.fields.OutMainCntryUIndex(src.getOutMainCntryUIndex()));
        
        if(src.getCrossPercent() != null)
            dest.set(new cl.bithaus.qfix.fields.CrossPercent(src.getCrossPercent().doubleValue()));
        
        if(src.getProgRptReqs() != null)
            dest.set(new cl.bithaus.qfix.fields.ProgRptReqs(src.getProgRptReqs()));
        
        if(src.getProgPeriodInterval() != null)
            dest.set(new cl.bithaus.qfix.fields.ProgPeriodInterval(src.getProgPeriodInterval()));
        
        if(src.getIncTaxInd() != null)
            dest.set(new cl.bithaus.qfix.fields.IncTaxInd(src.getIncTaxInd()));
        
        if(src.getForexReq() != null)
            dest.set(new cl.bithaus.qfix.fields.ForexReq(src.getForexReq()));
        
        if(src.getNumBidders() != null)
            dest.set(new cl.bithaus.qfix.fields.NumBidders(src.getNumBidders()));
        
        if(src.getTradeDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeDate(src.getTradeDate()));
        
        if(src.getBidTradeType() != null)
            if(src.getBidTradeType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.BidTradeType(src.getBidTradeType().charAt(0)));
        
        if(src.getBasisPxType() != null)
            if(src.getBasisPxType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.BasisPxType(src.getBasisPxType().charAt(0)));
        
        if(src.getStrikeTime() != null)
            dest.set(new cl.bithaus.qfix.fields.StrikeTime(src.getStrikeTime()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        


        if(src.getNoBidDescriptors() != null && src.getNoBidDescriptors().size() > 0) {

            for(cl.bithaus.fix.BidRequest.NoBidDescriptors.NoBidDescriptorsEntry entry : src.getNoBidDescriptors().getGroups()) {

                cl.bithaus.qfix.msg.BidRequest.NoBidDescriptors aux = 
                    new cl.bithaus.qfix.msg.BidRequest.NoBidDescriptors();

                aux.set(new cl.bithaus.qfix.fields.BidDescriptorType(entry.getBidDescriptorType()));
                aux.set(new cl.bithaus.qfix.fields.BidDescriptor(entry.getBidDescriptor()));
                aux.set(new cl.bithaus.qfix.fields.SideValueInd(entry.getSideValueInd()));
                aux.set(new cl.bithaus.qfix.fields.LiquidityValue(entry.getLiquidityValue()));
                aux.set(new cl.bithaus.qfix.fields.LiquidityNumSecurities(entry.getLiquidityNumSecurities()));
                aux.set(new cl.bithaus.qfix.fields.LiquidityPctLow(entry.getLiquidityPctLow().doubleValue()));
                aux.set(new cl.bithaus.qfix.fields.LiquidityPctHigh(entry.getLiquidityPctHigh().doubleValue()));
                aux.set(new cl.bithaus.qfix.fields.EFPTrackingError(entry.getEFPTrackingError().doubleValue()));
                aux.set(new cl.bithaus.qfix.fields.FairValue(entry.getFairValue()));
                aux.set(new cl.bithaus.qfix.fields.OutsideIndexPct(entry.getOutsideIndexPct().doubleValue()));
                aux.set(new cl.bithaus.qfix.fields.ValueOfFutures(entry.getValueOfFutures()));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoBidComponents() != null && src.getNoBidComponents().size() > 0) {

            for(cl.bithaus.fix.BidRequest.NoBidComponents.NoBidComponentsEntry entry : src.getNoBidComponents().getGroups()) {

                cl.bithaus.qfix.msg.BidRequest.NoBidComponents aux = 
                    new cl.bithaus.qfix.msg.BidRequest.NoBidComponents();

                aux.set(new cl.bithaus.qfix.fields.ListID(entry.getListID()));
                if(entry.getSide().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Side(entry.getSide().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));
                aux.set(new cl.bithaus.qfix.fields.NetGrossInd(entry.getNetGrossInd()));
                if(entry.getSettlType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.SettlType(entry.getSettlType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.SettlDate(entry.getSettlDate()));
                aux.set(new cl.bithaus.qfix.fields.Account(entry.getAccount()));
                aux.set(new cl.bithaus.qfix.fields.AcctIDSource(entry.getAcctIDSource()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.BidRequest fromFix(cl.bithaus.qfix.msg.BidRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.BidRequest dest = new cl.bithaus.fix.BidRequest();

        if(src.isSetBidID())
            dest.setBidID(src.getBidID().getValue());

        if(src.isSetClientBidID())
            dest.setClientBidID(src.getClientBidID().getValue());

        if(src.isSetBidRequestTransType())
            dest.setBidRequestTransType(src.getBidRequestTransType().getValue()+"");

        if(src.isSetListName())
            dest.setListName(src.getListName().getValue());

        if(src.isSetTotNoRelatedSym())
            dest.setTotNoRelatedSym(src.getTotNoRelatedSym().getValue());

        if(src.isSetBidType())
            dest.setBidType(src.getBidType().getValue());

        if(src.isSetNumTickets())
            dest.setNumTickets(src.getNumTickets().getValue());

        if(src.isSetCurrency())
            dest.setCurrency(src.getCurrency().getValue());

        if(src.isSetSideValue1())
            dest.setSideValue1(src.getSideValue1().getValue());

        if(src.isSetSideValue2())
            dest.setSideValue2(src.getSideValue2().getValue());

        if(src.isSetLiquidityIndType())
            dest.setLiquidityIndType(src.getLiquidityIndType().getValue());

        if(src.isSetWtAverageLiquidity())
            dest.setWtAverageLiquidity(new BigDecimal(src.getWtAverageLiquidity().getValue()));

        if(src.isSetExchangeForPhysical())
            dest.setExchangeForPhysical(src.getExchangeForPhysical().getValue());

        if(src.isSetOutMainCntryUIndex())
            dest.setOutMainCntryUIndex(src.getOutMainCntryUIndex().getValue());

        if(src.isSetCrossPercent())
            dest.setCrossPercent(new BigDecimal(src.getCrossPercent().getValue()));

        if(src.isSetProgRptReqs())
            dest.setProgRptReqs(src.getProgRptReqs().getValue());

        if(src.isSetProgPeriodInterval())
            dest.setProgPeriodInterval(src.getProgPeriodInterval().getValue());

        if(src.isSetIncTaxInd())
            dest.setIncTaxInd(src.getIncTaxInd().getValue());

        if(src.isSetForexReq())
            dest.setForexReq(src.getForexReq().getValue());

        if(src.isSetNumBidders())
            dest.setNumBidders(src.getNumBidders().getValue());

        if(src.isSetTradeDate())
            dest.setTradeDate(src.getTradeDate().getValue());

        if(src.isSetBidTradeType())
            dest.setBidTradeType(src.getBidTradeType().getValue()+"");

        if(src.isSetBasisPxType())
            dest.setBasisPxType(src.getBasisPxType().getValue()+"");

        if(src.isSetStrikeTime())
            dest.setStrikeTime(src.getStrikeTime().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"


        if(src.isSetNoBidDescriptors()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoBidDescriptors().getField());
            List<cl.bithaus.fix.BidRequest.NoBidDescriptors.NoBidDescriptorsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.BidDescriptorType bidDescriptorType = new cl.bithaus.qfix.fields.BidDescriptorType();
            cl.bithaus.qfix.fields.BidDescriptor bidDescriptor = new cl.bithaus.qfix.fields.BidDescriptor();
            cl.bithaus.qfix.fields.SideValueInd sideValueInd = new cl.bithaus.qfix.fields.SideValueInd();
            cl.bithaus.qfix.fields.LiquidityValue liquidityValue = new cl.bithaus.qfix.fields.LiquidityValue();
            cl.bithaus.qfix.fields.LiquidityNumSecurities liquidityNumSecurities = new cl.bithaus.qfix.fields.LiquidityNumSecurities();
            cl.bithaus.qfix.fields.LiquidityPctLow liquidityPctLow = new cl.bithaus.qfix.fields.LiquidityPctLow();
            cl.bithaus.qfix.fields.LiquidityPctHigh liquidityPctHigh = new cl.bithaus.qfix.fields.LiquidityPctHigh();
            cl.bithaus.qfix.fields.EFPTrackingError eFPTrackingError = new cl.bithaus.qfix.fields.EFPTrackingError();
            cl.bithaus.qfix.fields.FairValue fairValue = new cl.bithaus.qfix.fields.FairValue();
            cl.bithaus.qfix.fields.OutsideIndexPct outsideIndexPct = new cl.bithaus.qfix.fields.OutsideIndexPct();
            cl.bithaus.qfix.fields.ValueOfFutures valueOfFutures = new cl.bithaus.qfix.fields.ValueOfFutures();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.BidRequest.NoBidDescriptors.NoBidDescriptorsEntry entry = 
                    new cl.bithaus.fix.BidRequest.NoBidDescriptors.NoBidDescriptorsEntry();

                if(g.isSetField(bidDescriptorType)) {
                    bidDescriptorType = (cl.bithaus.qfix.fields.BidDescriptorType) g.getField(bidDescriptorType);
                    entry.setBidDescriptorType(bidDescriptorType.getValue());

                }
                if(g.isSetField(bidDescriptor)) {
                    bidDescriptor = (cl.bithaus.qfix.fields.BidDescriptor) g.getField(bidDescriptor);
                    entry.setBidDescriptor(bidDescriptor.getValue());

                }
                if(g.isSetField(sideValueInd)) {
                    sideValueInd = (cl.bithaus.qfix.fields.SideValueInd) g.getField(sideValueInd);
                    entry.setSideValueInd(sideValueInd.getValue());

                }
                if(g.isSetField(liquidityValue)) {
                    liquidityValue = (cl.bithaus.qfix.fields.LiquidityValue) g.getField(liquidityValue);
                    entry.setLiquidityValue(liquidityValue.getValue());

                }
                if(g.isSetField(liquidityNumSecurities)) {
                    liquidityNumSecurities = (cl.bithaus.qfix.fields.LiquidityNumSecurities) g.getField(liquidityNumSecurities);
                    entry.setLiquidityNumSecurities(liquidityNumSecurities.getValue());

                }
                if(g.isSetField(liquidityPctLow)) {
                    liquidityPctLow = (cl.bithaus.qfix.fields.LiquidityPctLow) g.getField(liquidityPctLow);
                    entry.setLiquidityPctLow(new BigDecimal(liquidityPctLow.getValue()));
                }
                if(g.isSetField(liquidityPctHigh)) {
                    liquidityPctHigh = (cl.bithaus.qfix.fields.LiquidityPctHigh) g.getField(liquidityPctHigh);
                    entry.setLiquidityPctHigh(new BigDecimal(liquidityPctHigh.getValue()));
                }
                if(g.isSetField(eFPTrackingError)) {
                    eFPTrackingError = (cl.bithaus.qfix.fields.EFPTrackingError) g.getField(eFPTrackingError);
                    entry.setEFPTrackingError(new BigDecimal(eFPTrackingError.getValue()));
                }
                if(g.isSetField(fairValue)) {
                    fairValue = (cl.bithaus.qfix.fields.FairValue) g.getField(fairValue);
                    entry.setFairValue(fairValue.getValue());

                }
                if(g.isSetField(outsideIndexPct)) {
                    outsideIndexPct = (cl.bithaus.qfix.fields.OutsideIndexPct) g.getField(outsideIndexPct);
                    entry.setOutsideIndexPct(new BigDecimal(outsideIndexPct.getValue()));
                }
                if(g.isSetField(valueOfFutures)) {
                    valueOfFutures = (cl.bithaus.qfix.fields.ValueOfFutures) g.getField(valueOfFutures);
                    entry.setValueOfFutures(valueOfFutures.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoBidComponents()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoBidComponents().getField());
            List<cl.bithaus.fix.BidRequest.NoBidComponents.NoBidComponentsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.ListID listID = new cl.bithaus.qfix.fields.ListID();
            cl.bithaus.qfix.fields.Side side = new cl.bithaus.qfix.fields.Side();
            cl.bithaus.qfix.fields.TradingSessionID tradingSessionID = new cl.bithaus.qfix.fields.TradingSessionID();
            cl.bithaus.qfix.fields.TradingSessionSubID tradingSessionSubID = new cl.bithaus.qfix.fields.TradingSessionSubID();
            cl.bithaus.qfix.fields.NetGrossInd netGrossInd = new cl.bithaus.qfix.fields.NetGrossInd();
            cl.bithaus.qfix.fields.SettlType settlType = new cl.bithaus.qfix.fields.SettlType();
            cl.bithaus.qfix.fields.SettlDate settlDate = new cl.bithaus.qfix.fields.SettlDate();
            cl.bithaus.qfix.fields.Account account = new cl.bithaus.qfix.fields.Account();
            cl.bithaus.qfix.fields.AcctIDSource acctIDSource = new cl.bithaus.qfix.fields.AcctIDSource();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.BidRequest.NoBidComponents.NoBidComponentsEntry entry = 
                    new cl.bithaus.fix.BidRequest.NoBidComponents.NoBidComponentsEntry();

                if(g.isSetField(listID)) {
                    listID = (cl.bithaus.qfix.fields.ListID) g.getField(listID);
                    entry.setListID(listID.getValue());

                }
                if(g.isSetField(side)) {
                    side = (cl.bithaus.qfix.fields.Side) g.getField(side);
                    entry.setSide(side.getValue()+"");
                }
                if(g.isSetField(tradingSessionID)) {
                    tradingSessionID = (cl.bithaus.qfix.fields.TradingSessionID) g.getField(tradingSessionID);
                    entry.setTradingSessionID(tradingSessionID.getValue());

                }
                if(g.isSetField(tradingSessionSubID)) {
                    tradingSessionSubID = (cl.bithaus.qfix.fields.TradingSessionSubID) g.getField(tradingSessionSubID);
                    entry.setTradingSessionSubID(tradingSessionSubID.getValue());

                }
                if(g.isSetField(netGrossInd)) {
                    netGrossInd = (cl.bithaus.qfix.fields.NetGrossInd) g.getField(netGrossInd);
                    entry.setNetGrossInd(netGrossInd.getValue());

                }
                if(g.isSetField(settlType)) {
                    settlType = (cl.bithaus.qfix.fields.SettlType) g.getField(settlType);
                    entry.setSettlType(settlType.getValue()+"");
                }
                if(g.isSetField(settlDate)) {
                    settlDate = (cl.bithaus.qfix.fields.SettlDate) g.getField(settlDate);
                    entry.setSettlDate(settlDate.getValue());

                }
                if(g.isSetField(account)) {
                    account = (cl.bithaus.qfix.fields.Account) g.getField(account);
                    entry.setAccount(account.getValue());

                }
                if(g.isSetField(acctIDSource)) {
                    acctIDSource = (cl.bithaus.qfix.fields.AcctIDSource) g.getField(acctIDSource);
                    entry.setAcctIDSource(acctIDSource.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

