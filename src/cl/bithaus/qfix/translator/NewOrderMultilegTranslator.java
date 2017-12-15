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
 * Fix - Bithaus format component translator for NewOrderMultileg
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
        

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getOrderQtyData() != null)
            dest.set(cl.bithaus.qfix.translator.component.OrderQtyDataTranslator.toFix(src.getOrderQtyData()));

        if(src.getCommissionData() != null)
            dest.set(cl.bithaus.qfix.translator.component.CommissionDataTranslator.toFix(src.getCommissionData()));

        if(src.getPegInstructions() != null)
            dest.set(cl.bithaus.qfix.translator.component.PegInstructionsTranslator.toFix(src.getPegInstructions()));

        if(src.getDiscretionInstructions() != null)
            dest.set(cl.bithaus.qfix.translator.component.DiscretionInstructionsTranslator.toFix(src.getDiscretionInstructions()));

        if(src.getIIFValorization() != null)
            dest.set(cl.bithaus.qfix.translator.component.IIFValorizationTranslator.toFix(src.getIIFValorization()));

        if(src.getIRFValorization() != null)
            dest.set(cl.bithaus.qfix.translator.component.IRFValorizationTranslator.toFix(src.getIRFValorization()));


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

    public static cl.bithaus.fix.NewOrderMultileg fromFix(cl.bithaus.qfix.msg.NewOrderMultileg src) 
        throws FieldNotFound {

        cl.bithaus.fix.NewOrderMultileg dest = new cl.bithaus.fix.NewOrderMultileg();

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

        if(src.isSetAccount())
            dest.setAccount(src.getAccount().getValue());

        if(src.isSetAcctIDSource())
            dest.setAcctIDSource(src.getAcctIDSource().getValue());

        if(src.isSetAccountType())
            dest.setAccountType(src.getAccountType().getValue());

        if(src.isSetDayBookingInst())
            dest.setDayBookingInst(src.getDayBookingInst().getValue()+"");

        if(src.isSetBookingUnit())
            dest.setBookingUnit(src.getBookingUnit().getValue()+"");

        if(src.isSetPreallocMethod())
            dest.setPreallocMethod(src.getPreallocMethod().getValue()+"");

        if(src.isSetAllocID())
            dest.setAllocID(src.getAllocID().getValue());

        if(src.isSetSettlType())
            dest.setSettlType(src.getSettlType().getValue()+"");

        if(src.isSetSettlDate())
            dest.setSettlDate(src.getSettlDate().getValue());

        if(src.isSetCashMargin())
            dest.setCashMargin(src.getCashMargin().getValue()+"");

        if(src.isSetClearingFeeIndicator())
            dest.setClearingFeeIndicator(src.getClearingFeeIndicator().getValue());

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

        if(src.isSetSide())
            dest.setSide(src.getSide().getValue()+"");

        if(src.isSetPrevClosePx())
            dest.setPrevClosePx(src.getPrevClosePx().getValue());

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

        if(src.isSetComplianceID())
            dest.setComplianceID(src.getComplianceID().getValue());

        if(src.isSetSolicitedFlag())
            dest.setSolicitedFlag(src.getSolicitedFlag().getValue());

        if(src.isSetIOIid())
            dest.setIOIid(src.getIOIid().getValue());

        if(src.isSetQuoteID())
            dest.setQuoteID(src.getQuoteID().getValue());

        if(src.isSetTimeInForce())
            dest.setTimeInForce(src.getTimeInForce().getValue()+"");

        if(src.isSetEffectiveTime())
            dest.setEffectiveTime(src.getEffectiveTime().getValue());

        if(src.isSetExpireDate())
            dest.setExpireDate(src.getExpireDate().getValue());

        if(src.isSetExpireTime())
            dest.setExpireTime(src.getExpireTime().getValue());

        if(src.isSetGTBookingInst())
            dest.setGTBookingInst(src.getGTBookingInst().getValue());

        if(src.isSetOrderCapacity())
            dest.setOrderCapacity(src.getOrderCapacity().getValue()+"");

        if(src.isSetOrderRestrictions())
            dest.setOrderRestrictions(src.getOrderRestrictions().getValue());

        if(src.isSetCustOrderCapacity())
            dest.setCustOrderCapacity(src.getCustOrderCapacity().getValue());

        if(src.isSetForexReq())
            dest.setForexReq(src.getForexReq().getValue());

        if(src.isSetSettlCurrency())
            dest.setSettlCurrency(src.getSettlCurrency().getValue());

        if(src.isSetBookingType())
            dest.setBookingType(src.getBookingType().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());

        if(src.isSetPositionEffect())
            dest.setPositionEffect(src.getPositionEffect().getValue()+"");

        if(src.isSetCoveredOrUncovered())
            dest.setCoveredOrUncovered(src.getCoveredOrUncovered().getValue());

        if(src.isSetMaxShow())
            dest.setMaxShow(src.getMaxShow().getValue());

        if(src.isSetTargetStrategy())
            dest.setTargetStrategy(src.getTargetStrategy().getValue());

        if(src.isSetTargetStrategyParameters())
            dest.setTargetStrategyParameters(src.getTargetStrategyParameters().getValue());

        if(src.isSetParticipationRate())
            dest.setParticipationRate(new BigDecimal(src.getParticipationRate().getValue()));

        if(src.isSetCancellationRights())
            dest.setCancellationRights(src.getCancellationRights().getValue()+"");

        if(src.isSetMoneyLaunderingStatus())
            dest.setMoneyLaunderingStatus(src.getMoneyLaunderingStatus().getValue()+"");

        if(src.isSetRegistID())
            dest.setRegistID(src.getRegistID().getValue());

        if(src.isSetDesignation())
            dest.setDesignation(src.getDesignation().getValue());

        if(src.isSetMultiLegRptTypeReq())
            dest.setMultiLegRptTypeReq(src.getMultiLegRptTypeReq().getValue());


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
            dest.setOrderQtyData(cl.bithaus.qfix.translator.component.OrderQtyDataTranslator.fromFix(src.getOrderQtyData()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setCommissionData(cl.bithaus.qfix.translator.component.CommissionDataTranslator.fromFix(src.getCommissionData()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setPegInstructions(cl.bithaus.qfix.translator.component.PegInstructionsTranslator.fromFix(src.getPegInstructions()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setDiscretionInstructions(cl.bithaus.qfix.translator.component.DiscretionInstructionsTranslator.fromFix(src.getDiscretionInstructions()));
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


        if(src.isSetNoAllocs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoAllocs().getField());
            List<cl.bithaus.fix.NewOrderMultileg.NoAllocs.NoAllocsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.AllocAccount allocAccount = new cl.bithaus.qfix.fields.AllocAccount();
            cl.bithaus.qfix.fields.AllocAcctIDSource allocAcctIDSource = new cl.bithaus.qfix.fields.AllocAcctIDSource();
            cl.bithaus.qfix.fields.AllocSettlCurrency allocSettlCurrency = new cl.bithaus.qfix.fields.AllocSettlCurrency();
            cl.bithaus.qfix.fields.IndividualAllocID individualAllocID = new cl.bithaus.qfix.fields.IndividualAllocID();
            cl.bithaus.qfix.fields.AllocQty allocQty = new cl.bithaus.qfix.fields.AllocQty();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.NewOrderMultileg.NoAllocs.NoAllocsEntry entry = 
                    new cl.bithaus.fix.NewOrderMultileg.NoAllocs.NoAllocsEntry();

                if(g.isSetField(allocAccount)) {
                    allocAccount = (cl.bithaus.qfix.fields.AllocAccount) g.getField(allocAccount);
                    entry.setAllocAccount(allocAccount.getValue());

                }
                if(g.isSetField(allocAcctIDSource)) {
                    allocAcctIDSource = (cl.bithaus.qfix.fields.AllocAcctIDSource) g.getField(allocAcctIDSource);
                    entry.setAllocAcctIDSource(allocAcctIDSource.getValue());

                }
                if(g.isSetField(allocSettlCurrency)) {
                    allocSettlCurrency = (cl.bithaus.qfix.fields.AllocSettlCurrency) g.getField(allocSettlCurrency);
                    entry.setAllocSettlCurrency(allocSettlCurrency.getValue());

                }
                if(g.isSetField(individualAllocID)) {
                    individualAllocID = (cl.bithaus.qfix.fields.IndividualAllocID) g.getField(individualAllocID);
                    entry.setIndividualAllocID(individualAllocID.getValue());

                }
                if(g.isSetField(allocQty)) {
                    allocQty = (cl.bithaus.qfix.fields.AllocQty) g.getField(allocQty);
                    entry.setAllocQty(allocQty.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoTradingSessions()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoTradingSessions().getField());
            List<cl.bithaus.fix.NewOrderMultileg.NoTradingSessions.NoTradingSessionsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.TradingSessionID tradingSessionID = new cl.bithaus.qfix.fields.TradingSessionID();
            cl.bithaus.qfix.fields.TradingSessionSubID tradingSessionSubID = new cl.bithaus.qfix.fields.TradingSessionSubID();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.NewOrderMultileg.NoTradingSessions.NoTradingSessionsEntry entry = 
                    new cl.bithaus.fix.NewOrderMultileg.NoTradingSessions.NoTradingSessionsEntry();

                if(g.isSetField(tradingSessionID)) {
                    tradingSessionID = (cl.bithaus.qfix.fields.TradingSessionID) g.getField(tradingSessionID);
                    entry.setTradingSessionID(tradingSessionID.getValue());

                }
                if(g.isSetField(tradingSessionSubID)) {
                    tradingSessionSubID = (cl.bithaus.qfix.fields.TradingSessionSubID) g.getField(tradingSessionSubID);
                    entry.setTradingSessionSubID(tradingSessionSubID.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.NewOrderMultileg.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.NewOrderMultileg.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.NewOrderMultileg.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.NewOrderMultileg.NoLegs.NoLegsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.LegQty legQty = new cl.bithaus.qfix.fields.LegQty();
            cl.bithaus.qfix.fields.LegSwapType legSwapType = new cl.bithaus.qfix.fields.LegSwapType();
            cl.bithaus.qfix.fields.LegPositionEffect legPositionEffect = new cl.bithaus.qfix.fields.LegPositionEffect();
            cl.bithaus.qfix.fields.LegCoveredOrUncovered legCoveredOrUncovered = new cl.bithaus.qfix.fields.LegCoveredOrUncovered();
            cl.bithaus.qfix.fields.LegRefID legRefID = new cl.bithaus.qfix.fields.LegRefID();
            cl.bithaus.qfix.fields.LegPrice legPrice = new cl.bithaus.qfix.fields.LegPrice();
            cl.bithaus.qfix.fields.LegSettlType legSettlType = new cl.bithaus.qfix.fields.LegSettlType();
            cl.bithaus.qfix.fields.LegSettlDate legSettlDate = new cl.bithaus.qfix.fields.LegSettlDate();
            cl.bithaus.qfix.fields.TargetLegRefId targetLegRefId = new cl.bithaus.qfix.fields.TargetLegRefId();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.NewOrderMultileg.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.NewOrderMultileg.NoLegs.NoLegsEntry();

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

