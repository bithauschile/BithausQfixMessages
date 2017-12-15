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
 * Fix - Bithaus format component translator for CrossOrderCancelReplaceRequest
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class CrossOrderCancelReplaceRequestTranslator  {

    public static cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest toFix(cl.bithaus.fix.CrossOrderCancelReplaceRequest src) {

        cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest dest = new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest();

        if(src.getOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderID(src.getOrderID()));
        
        if(src.getCrossID() != null)
            dest.set(new cl.bithaus.qfix.fields.CrossID(src.getCrossID()));
        
        if(src.getOrigCrossID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigCrossID(src.getOrigCrossID()));
        
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
        

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getStipulations() != null)
            dest.set(cl.bithaus.qfix.translator.component.StipulationsTranslator.toFix(src.getStipulations()));

        if(src.getSpreadOrBenchmarkCurveData() != null)
            dest.set(cl.bithaus.qfix.translator.component.SpreadOrBenchmarkCurveDataTranslator.toFix(src.getSpreadOrBenchmarkCurveData()));

        if(src.getYieldData() != null)
            dest.set(cl.bithaus.qfix.translator.component.YieldDataTranslator.toFix(src.getYieldData()));

        if(src.getPegInstructions() != null)
            dest.set(cl.bithaus.qfix.translator.component.PegInstructionsTranslator.toFix(src.getPegInstructions()));

        if(src.getDiscretionInstructions() != null)
            dest.set(cl.bithaus.qfix.translator.component.DiscretionInstructionsTranslator.toFix(src.getDiscretionInstructions()));

        if(src.getIIFValorization() != null)
            dest.set(cl.bithaus.qfix.translator.component.IIFValorizationTranslator.toFix(src.getIIFValorization()));

        if(src.getIRFValorization() != null)
            dest.set(cl.bithaus.qfix.translator.component.IRFValorizationTranslator.toFix(src.getIRFValorization()));


        if(src.getNoSides() != null && src.getNoSides().size() > 0) {

            for(cl.bithaus.fix.CrossOrderCancelReplaceRequest.NoSides.NoSidesEntry entry : src.getNoSides().getGroups()) {

                cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoSides aux = 
                    new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoSides();

                if(entry.getSide().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Side(entry.getSide().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.OrigClOrdID(entry.getOrigClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.ClOrdID(entry.getClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(entry.getSecondaryClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.ClOrdLinkID(entry.getClOrdLinkID()));
                aux.set(new cl.bithaus.qfix.fields.OrigOrdModTime(entry.getOrigOrdModTime()));
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

            for(cl.bithaus.fix.CrossOrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.CrossOrderCancelReplaceRequest.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoLegs aux = 
                    new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoLegs();


                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.CrossOrderCancelReplaceRequest fromFix(cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.CrossOrderCancelReplaceRequest dest = new cl.bithaus.fix.CrossOrderCancelReplaceRequest();

        if(src.isSetOrderID())
            dest.setOrderID(src.getOrderID().getValue());

        if(src.isSetCrossID())
            dest.setCrossID(src.getCrossID().getValue());

        if(src.isSetOrigCrossID())
            dest.setOrigCrossID(src.getOrigCrossID().getValue());

        if(src.isSetCrossType())
            dest.setCrossType(src.getCrossType().getValue());

        if(src.isSetCrossPrioritization())
            dest.setCrossPrioritization(src.getCrossPrioritization().getValue());

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

        if(src.isSetLocateReqd())
            dest.setLocateReqd(src.getLocateReqd().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

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


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"
        try {
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setStipulations(cl.bithaus.qfix.translator.component.StipulationsTranslator.fromFix(src.getStipulations()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setSpreadOrBenchmarkCurveData(cl.bithaus.qfix.translator.component.SpreadOrBenchmarkCurveDataTranslator.fromFix(src.getSpreadOrBenchmarkCurveData()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setYieldData(cl.bithaus.qfix.translator.component.YieldDataTranslator.fromFix(src.getYieldData()));
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


        if(src.isSetNoSides()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoSides().getField());
            List<cl.bithaus.fix.CrossOrderCancelReplaceRequest.NoSides.NoSidesEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.Side side = new cl.bithaus.qfix.fields.Side();
            cl.bithaus.qfix.fields.OrigClOrdID origClOrdID = new cl.bithaus.qfix.fields.OrigClOrdID();
            cl.bithaus.qfix.fields.ClOrdID clOrdID = new cl.bithaus.qfix.fields.ClOrdID();
            cl.bithaus.qfix.fields.SecondaryClOrdID secondaryClOrdID = new cl.bithaus.qfix.fields.SecondaryClOrdID();
            cl.bithaus.qfix.fields.ClOrdLinkID clOrdLinkID = new cl.bithaus.qfix.fields.ClOrdLinkID();
            cl.bithaus.qfix.fields.OrigOrdModTime origOrdModTime = new cl.bithaus.qfix.fields.OrigOrdModTime();
            cl.bithaus.qfix.fields.TradeOriginationDate tradeOriginationDate = new cl.bithaus.qfix.fields.TradeOriginationDate();
            cl.bithaus.qfix.fields.TradeDate tradeDate = new cl.bithaus.qfix.fields.TradeDate();
            cl.bithaus.qfix.fields.Account account = new cl.bithaus.qfix.fields.Account();
            cl.bithaus.qfix.fields.AcctIDSource acctIDSource = new cl.bithaus.qfix.fields.AcctIDSource();
            cl.bithaus.qfix.fields.AccountType accountType = new cl.bithaus.qfix.fields.AccountType();
            cl.bithaus.qfix.fields.DayBookingInst dayBookingInst = new cl.bithaus.qfix.fields.DayBookingInst();
            cl.bithaus.qfix.fields.BookingUnit bookingUnit = new cl.bithaus.qfix.fields.BookingUnit();
            cl.bithaus.qfix.fields.PreallocMethod preallocMethod = new cl.bithaus.qfix.fields.PreallocMethod();
            cl.bithaus.qfix.fields.AllocID allocID = new cl.bithaus.qfix.fields.AllocID();
            cl.bithaus.qfix.fields.QtyType qtyType = new cl.bithaus.qfix.fields.QtyType();
            cl.bithaus.qfix.fields.OrderCapacity orderCapacity = new cl.bithaus.qfix.fields.OrderCapacity();
            cl.bithaus.qfix.fields.OrderRestrictions orderRestrictions = new cl.bithaus.qfix.fields.OrderRestrictions();
            cl.bithaus.qfix.fields.CustOrderCapacity custOrderCapacity = new cl.bithaus.qfix.fields.CustOrderCapacity();
            cl.bithaus.qfix.fields.ForexReq forexReq = new cl.bithaus.qfix.fields.ForexReq();
            cl.bithaus.qfix.fields.SettlCurrency settlCurrency = new cl.bithaus.qfix.fields.SettlCurrency();
            cl.bithaus.qfix.fields.BookingType bookingType = new cl.bithaus.qfix.fields.BookingType();
            cl.bithaus.qfix.fields.Text text = new cl.bithaus.qfix.fields.Text();
            cl.bithaus.qfix.fields.EncodedTextLen encodedTextLen = new cl.bithaus.qfix.fields.EncodedTextLen();
            cl.bithaus.qfix.fields.EncodedText encodedText = new cl.bithaus.qfix.fields.EncodedText();
            cl.bithaus.qfix.fields.PositionEffect positionEffect = new cl.bithaus.qfix.fields.PositionEffect();
            cl.bithaus.qfix.fields.CoveredOrUncovered coveredOrUncovered = new cl.bithaus.qfix.fields.CoveredOrUncovered();
            cl.bithaus.qfix.fields.CashMargin cashMargin = new cl.bithaus.qfix.fields.CashMargin();
            cl.bithaus.qfix.fields.ClearingFeeIndicator clearingFeeIndicator = new cl.bithaus.qfix.fields.ClearingFeeIndicator();
            cl.bithaus.qfix.fields.SolicitedFlag solicitedFlag = new cl.bithaus.qfix.fields.SolicitedFlag();
            cl.bithaus.qfix.fields.SideComplianceID sideComplianceID = new cl.bithaus.qfix.fields.SideComplianceID();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.CrossOrderCancelReplaceRequest.NoSides.NoSidesEntry entry = 
                    new cl.bithaus.fix.CrossOrderCancelReplaceRequest.NoSides.NoSidesEntry();

                if(g.isSetField(side)) {
                    side = (cl.bithaus.qfix.fields.Side) g.getField(side);
                    entry.setSide(side.getValue()+"");
                }
                if(g.isSetField(origClOrdID)) {
                    origClOrdID = (cl.bithaus.qfix.fields.OrigClOrdID) g.getField(origClOrdID);
                    entry.setOrigClOrdID(origClOrdID.getValue());

                }
                if(g.isSetField(clOrdID)) {
                    clOrdID = (cl.bithaus.qfix.fields.ClOrdID) g.getField(clOrdID);
                    entry.setClOrdID(clOrdID.getValue());

                }
                if(g.isSetField(secondaryClOrdID)) {
                    secondaryClOrdID = (cl.bithaus.qfix.fields.SecondaryClOrdID) g.getField(secondaryClOrdID);
                    entry.setSecondaryClOrdID(secondaryClOrdID.getValue());

                }
                if(g.isSetField(clOrdLinkID)) {
                    clOrdLinkID = (cl.bithaus.qfix.fields.ClOrdLinkID) g.getField(clOrdLinkID);
                    entry.setClOrdLinkID(clOrdLinkID.getValue());

                }
                if(g.isSetField(origOrdModTime)) {
                    origOrdModTime = (cl.bithaus.qfix.fields.OrigOrdModTime) g.getField(origOrdModTime);
                    entry.setOrigOrdModTime(origOrdModTime.getValue());

                }
                if(g.isSetField(tradeOriginationDate)) {
                    tradeOriginationDate = (cl.bithaus.qfix.fields.TradeOriginationDate) g.getField(tradeOriginationDate);
                    entry.setTradeOriginationDate(tradeOriginationDate.getValue());

                }
                if(g.isSetField(tradeDate)) {
                    tradeDate = (cl.bithaus.qfix.fields.TradeDate) g.getField(tradeDate);
                    entry.setTradeDate(tradeDate.getValue());

                }
                if(g.isSetField(account)) {
                    account = (cl.bithaus.qfix.fields.Account) g.getField(account);
                    entry.setAccount(account.getValue());

                }
                if(g.isSetField(acctIDSource)) {
                    acctIDSource = (cl.bithaus.qfix.fields.AcctIDSource) g.getField(acctIDSource);
                    entry.setAcctIDSource(acctIDSource.getValue());

                }
                if(g.isSetField(accountType)) {
                    accountType = (cl.bithaus.qfix.fields.AccountType) g.getField(accountType);
                    entry.setAccountType(accountType.getValue());

                }
                if(g.isSetField(dayBookingInst)) {
                    dayBookingInst = (cl.bithaus.qfix.fields.DayBookingInst) g.getField(dayBookingInst);
                    entry.setDayBookingInst(dayBookingInst.getValue()+"");
                }
                if(g.isSetField(bookingUnit)) {
                    bookingUnit = (cl.bithaus.qfix.fields.BookingUnit) g.getField(bookingUnit);
                    entry.setBookingUnit(bookingUnit.getValue()+"");
                }
                if(g.isSetField(preallocMethod)) {
                    preallocMethod = (cl.bithaus.qfix.fields.PreallocMethod) g.getField(preallocMethod);
                    entry.setPreallocMethod(preallocMethod.getValue()+"");
                }
                if(g.isSetField(allocID)) {
                    allocID = (cl.bithaus.qfix.fields.AllocID) g.getField(allocID);
                    entry.setAllocID(allocID.getValue());

                }
                if(g.isSetField(qtyType)) {
                    qtyType = (cl.bithaus.qfix.fields.QtyType) g.getField(qtyType);
                    entry.setQtyType(qtyType.getValue());

                }
                if(g.isSetField(orderCapacity)) {
                    orderCapacity = (cl.bithaus.qfix.fields.OrderCapacity) g.getField(orderCapacity);
                    entry.setOrderCapacity(orderCapacity.getValue()+"");
                }
                if(g.isSetField(orderRestrictions)) {
                    orderRestrictions = (cl.bithaus.qfix.fields.OrderRestrictions) g.getField(orderRestrictions);
                    entry.setOrderRestrictions(orderRestrictions.getValue());

                }
                if(g.isSetField(custOrderCapacity)) {
                    custOrderCapacity = (cl.bithaus.qfix.fields.CustOrderCapacity) g.getField(custOrderCapacity);
                    entry.setCustOrderCapacity(custOrderCapacity.getValue());

                }
                if(g.isSetField(forexReq)) {
                    forexReq = (cl.bithaus.qfix.fields.ForexReq) g.getField(forexReq);
                    entry.setForexReq(forexReq.getValue());

                }
                if(g.isSetField(settlCurrency)) {
                    settlCurrency = (cl.bithaus.qfix.fields.SettlCurrency) g.getField(settlCurrency);
                    entry.setSettlCurrency(settlCurrency.getValue());

                }
                if(g.isSetField(bookingType)) {
                    bookingType = (cl.bithaus.qfix.fields.BookingType) g.getField(bookingType);
                    entry.setBookingType(bookingType.getValue());

                }
                if(g.isSetField(text)) {
                    text = (cl.bithaus.qfix.fields.Text) g.getField(text);
                    entry.setText(text.getValue());

                }
                if(g.isSetField(encodedTextLen)) {
                    encodedTextLen = (cl.bithaus.qfix.fields.EncodedTextLen) g.getField(encodedTextLen);
                    entry.setEncodedTextLen(encodedTextLen.getValue());

                }
                if(g.isSetField(encodedText)) {
                    encodedText = (cl.bithaus.qfix.fields.EncodedText) g.getField(encodedText);
                    entry.setEncodedText(encodedText.getValue());

                }
                if(g.isSetField(positionEffect)) {
                    positionEffect = (cl.bithaus.qfix.fields.PositionEffect) g.getField(positionEffect);
                    entry.setPositionEffect(positionEffect.getValue()+"");
                }
                if(g.isSetField(coveredOrUncovered)) {
                    coveredOrUncovered = (cl.bithaus.qfix.fields.CoveredOrUncovered) g.getField(coveredOrUncovered);
                    entry.setCoveredOrUncovered(coveredOrUncovered.getValue());

                }
                if(g.isSetField(cashMargin)) {
                    cashMargin = (cl.bithaus.qfix.fields.CashMargin) g.getField(cashMargin);
                    entry.setCashMargin(cashMargin.getValue()+"");
                }
                if(g.isSetField(clearingFeeIndicator)) {
                    clearingFeeIndicator = (cl.bithaus.qfix.fields.ClearingFeeIndicator) g.getField(clearingFeeIndicator);
                    entry.setClearingFeeIndicator(clearingFeeIndicator.getValue());

                }
                if(g.isSetField(solicitedFlag)) {
                    solicitedFlag = (cl.bithaus.qfix.fields.SolicitedFlag) g.getField(solicitedFlag);
                    entry.setSolicitedFlag(solicitedFlag.getValue());

                }
                if(g.isSetField(sideComplianceID)) {
                    sideComplianceID = (cl.bithaus.qfix.fields.SideComplianceID) g.getField(sideComplianceID);
                    entry.setSideComplianceID(sideComplianceID.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.CrossOrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.CrossOrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.CrossOrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.CrossOrderCancelReplaceRequest.NoLegs.NoLegsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.CrossOrderCancelReplaceRequest.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.CrossOrderCancelReplaceRequest.NoLegs.NoLegsEntry();


                result.add(entry);                
            }

        }
        return dest;

    }
}

