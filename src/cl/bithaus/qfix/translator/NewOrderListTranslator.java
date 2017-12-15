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
 * Fix - Bithaus format component translator for NewOrderList
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

    public static cl.bithaus.fix.NewOrderList fromFix(cl.bithaus.qfix.msg.NewOrderList src) 
        throws FieldNotFound {

        cl.bithaus.fix.NewOrderList dest = new cl.bithaus.fix.NewOrderList();

        if(src.isSetListID())
            dest.setListID(src.getListID().getValue());

        if(src.isSetBidID())
            dest.setBidID(src.getBidID().getValue());

        if(src.isSetClientBidID())
            dest.setClientBidID(src.getClientBidID().getValue());

        if(src.isSetProgRptReqs())
            dest.setProgRptReqs(src.getProgRptReqs().getValue());

        if(src.isSetBidType())
            dest.setBidType(src.getBidType().getValue());

        if(src.isSetProgPeriodInterval())
            dest.setProgPeriodInterval(src.getProgPeriodInterval().getValue());

        if(src.isSetCancellationRights())
            dest.setCancellationRights(src.getCancellationRights().getValue()+"");

        if(src.isSetMoneyLaunderingStatus())
            dest.setMoneyLaunderingStatus(src.getMoneyLaunderingStatus().getValue()+"");

        if(src.isSetRegistID())
            dest.setRegistID(src.getRegistID().getValue());

        if(src.isSetListExecInstType())
            dest.setListExecInstType(src.getListExecInstType().getValue()+"");

        if(src.isSetListExecInst())
            dest.setListExecInst(src.getListExecInst().getValue());

        if(src.isSetEncodedListExecInstLen())
            dest.setEncodedListExecInstLen(src.getEncodedListExecInstLen().getValue());

        if(src.isSetEncodedListExecInst())
            dest.setEncodedListExecInst(src.getEncodedListExecInst().getValue());

        if(src.isSetAllowableOneSidednessPct())
            dest.setAllowableOneSidednessPct(new BigDecimal(src.getAllowableOneSidednessPct().getValue()));

        if(src.isSetAllowableOneSidednessValue())
            dest.setAllowableOneSidednessValue(src.getAllowableOneSidednessValue().getValue());

        if(src.isSetAllowableOneSidednessCurr())
            dest.setAllowableOneSidednessCurr(src.getAllowableOneSidednessCurr().getValue());

        if(src.isSetTotNoOrders())
            dest.setTotNoOrders(src.getTotNoOrders().getValue());

        if(src.isSetLastFragment())
            dest.setLastFragment(src.getLastFragment().getValue());

        if(src.isSetExDestination())
            dest.setExDestination(src.getExDestination().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"


        if(src.isSetNoOrders()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoOrders().getField());
            List<cl.bithaus.fix.NewOrderList.NoOrders.NoOrdersEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.ClOrdID clOrdID = new cl.bithaus.qfix.fields.ClOrdID();
            cl.bithaus.qfix.fields.SecondaryClOrdID secondaryClOrdID = new cl.bithaus.qfix.fields.SecondaryClOrdID();
            cl.bithaus.qfix.fields.ListSeqNo listSeqNo = new cl.bithaus.qfix.fields.ListSeqNo();
            cl.bithaus.qfix.fields.ClOrdLinkID clOrdLinkID = new cl.bithaus.qfix.fields.ClOrdLinkID();
            cl.bithaus.qfix.fields.SettlInstMode settlInstMode = new cl.bithaus.qfix.fields.SettlInstMode();
            cl.bithaus.qfix.fields.TradeOriginationDate tradeOriginationDate = new cl.bithaus.qfix.fields.TradeOriginationDate();
            cl.bithaus.qfix.fields.TradeDate tradeDate = new cl.bithaus.qfix.fields.TradeDate();
            cl.bithaus.qfix.fields.Account account = new cl.bithaus.qfix.fields.Account();
            cl.bithaus.qfix.fields.AcctIDSource acctIDSource = new cl.bithaus.qfix.fields.AcctIDSource();
            cl.bithaus.qfix.fields.AccountType accountType = new cl.bithaus.qfix.fields.AccountType();
            cl.bithaus.qfix.fields.DayBookingInst dayBookingInst = new cl.bithaus.qfix.fields.DayBookingInst();
            cl.bithaus.qfix.fields.BookingUnit bookingUnit = new cl.bithaus.qfix.fields.BookingUnit();
            cl.bithaus.qfix.fields.AllocID allocID = new cl.bithaus.qfix.fields.AllocID();
            cl.bithaus.qfix.fields.PreallocMethod preallocMethod = new cl.bithaus.qfix.fields.PreallocMethod();
            cl.bithaus.qfix.fields.SettlType settlType = new cl.bithaus.qfix.fields.SettlType();
            cl.bithaus.qfix.fields.SettlDate settlDate = new cl.bithaus.qfix.fields.SettlDate();
            cl.bithaus.qfix.fields.CashMargin cashMargin = new cl.bithaus.qfix.fields.CashMargin();
            cl.bithaus.qfix.fields.ClearingFeeIndicator clearingFeeIndicator = new cl.bithaus.qfix.fields.ClearingFeeIndicator();
            cl.bithaus.qfix.fields.HandlInst handlInst = new cl.bithaus.qfix.fields.HandlInst();
            cl.bithaus.qfix.fields.ExecInst execInst = new cl.bithaus.qfix.fields.ExecInst();
            cl.bithaus.qfix.fields.MinQty minQty = new cl.bithaus.qfix.fields.MinQty();
            cl.bithaus.qfix.fields.MaxFloor maxFloor = new cl.bithaus.qfix.fields.MaxFloor();
            cl.bithaus.qfix.fields.ExDestination exDestination = new cl.bithaus.qfix.fields.ExDestination();
            cl.bithaus.qfix.fields.ProcessCode processCode = new cl.bithaus.qfix.fields.ProcessCode();
            cl.bithaus.qfix.fields.PrevClosePx prevClosePx = new cl.bithaus.qfix.fields.PrevClosePx();
            cl.bithaus.qfix.fields.Side side = new cl.bithaus.qfix.fields.Side();
            cl.bithaus.qfix.fields.SideValueInd sideValueInd = new cl.bithaus.qfix.fields.SideValueInd();
            cl.bithaus.qfix.fields.LocateReqd locateReqd = new cl.bithaus.qfix.fields.LocateReqd();
            cl.bithaus.qfix.fields.TransactTime transactTime = new cl.bithaus.qfix.fields.TransactTime();
            cl.bithaus.qfix.fields.QtyType qtyType = new cl.bithaus.qfix.fields.QtyType();
            cl.bithaus.qfix.fields.OrdType ordType = new cl.bithaus.qfix.fields.OrdType();
            cl.bithaus.qfix.fields.PriceType priceType = new cl.bithaus.qfix.fields.PriceType();
            cl.bithaus.qfix.fields.Price price = new cl.bithaus.qfix.fields.Price();
            cl.bithaus.qfix.fields.StopPx stopPx = new cl.bithaus.qfix.fields.StopPx();
            cl.bithaus.qfix.fields.Currency currency = new cl.bithaus.qfix.fields.Currency();
            cl.bithaus.qfix.fields.ComplianceID complianceID = new cl.bithaus.qfix.fields.ComplianceID();
            cl.bithaus.qfix.fields.SolicitedFlag solicitedFlag = new cl.bithaus.qfix.fields.SolicitedFlag();
            cl.bithaus.qfix.fields.IOIid iOIid = new cl.bithaus.qfix.fields.IOIid();
            cl.bithaus.qfix.fields.QuoteID quoteID = new cl.bithaus.qfix.fields.QuoteID();
            cl.bithaus.qfix.fields.TimeInForce timeInForce = new cl.bithaus.qfix.fields.TimeInForce();
            cl.bithaus.qfix.fields.EffectiveTime effectiveTime = new cl.bithaus.qfix.fields.EffectiveTime();
            cl.bithaus.qfix.fields.ExpireDate expireDate = new cl.bithaus.qfix.fields.ExpireDate();
            cl.bithaus.qfix.fields.ExpireTime expireTime = new cl.bithaus.qfix.fields.ExpireTime();
            cl.bithaus.qfix.fields.GTBookingInst gTBookingInst = new cl.bithaus.qfix.fields.GTBookingInst();
            cl.bithaus.qfix.fields.OrderCapacity orderCapacity = new cl.bithaus.qfix.fields.OrderCapacity();
            cl.bithaus.qfix.fields.OrderRestrictions orderRestrictions = new cl.bithaus.qfix.fields.OrderRestrictions();
            cl.bithaus.qfix.fields.CustOrderCapacity custOrderCapacity = new cl.bithaus.qfix.fields.CustOrderCapacity();
            cl.bithaus.qfix.fields.ForexReq forexReq = new cl.bithaus.qfix.fields.ForexReq();
            cl.bithaus.qfix.fields.SettlCurrency settlCurrency = new cl.bithaus.qfix.fields.SettlCurrency();
            cl.bithaus.qfix.fields.BookingType bookingType = new cl.bithaus.qfix.fields.BookingType();
            cl.bithaus.qfix.fields.Text text = new cl.bithaus.qfix.fields.Text();
            cl.bithaus.qfix.fields.EncodedTextLen encodedTextLen = new cl.bithaus.qfix.fields.EncodedTextLen();
            cl.bithaus.qfix.fields.EncodedText encodedText = new cl.bithaus.qfix.fields.EncodedText();
            cl.bithaus.qfix.fields.SettlDate2 settlDate2 = new cl.bithaus.qfix.fields.SettlDate2();
            cl.bithaus.qfix.fields.OrderQty2 orderQty2 = new cl.bithaus.qfix.fields.OrderQty2();
            cl.bithaus.qfix.fields.Price2 price2 = new cl.bithaus.qfix.fields.Price2();
            cl.bithaus.qfix.fields.PositionEffect positionEffect = new cl.bithaus.qfix.fields.PositionEffect();
            cl.bithaus.qfix.fields.CoveredOrUncovered coveredOrUncovered = new cl.bithaus.qfix.fields.CoveredOrUncovered();
            cl.bithaus.qfix.fields.MaxShow maxShow = new cl.bithaus.qfix.fields.MaxShow();
            cl.bithaus.qfix.fields.TargetStrategy targetStrategy = new cl.bithaus.qfix.fields.TargetStrategy();
            cl.bithaus.qfix.fields.TargetStrategyParameters targetStrategyParameters = new cl.bithaus.qfix.fields.TargetStrategyParameters();
            cl.bithaus.qfix.fields.ParticipationRate participationRate = new cl.bithaus.qfix.fields.ParticipationRate();
            cl.bithaus.qfix.fields.Designation designation = new cl.bithaus.qfix.fields.Designation();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.NewOrderList.NoOrders.NoOrdersEntry entry = 
                    new cl.bithaus.fix.NewOrderList.NoOrders.NoOrdersEntry();

                if(g.isSetField(clOrdID)) {
                    clOrdID = (cl.bithaus.qfix.fields.ClOrdID) g.getField(clOrdID);
                    entry.setClOrdID(clOrdID.getValue());

                }
                if(g.isSetField(secondaryClOrdID)) {
                    secondaryClOrdID = (cl.bithaus.qfix.fields.SecondaryClOrdID) g.getField(secondaryClOrdID);
                    entry.setSecondaryClOrdID(secondaryClOrdID.getValue());

                }
                if(g.isSetField(listSeqNo)) {
                    listSeqNo = (cl.bithaus.qfix.fields.ListSeqNo) g.getField(listSeqNo);
                    entry.setListSeqNo(listSeqNo.getValue());

                }
                if(g.isSetField(clOrdLinkID)) {
                    clOrdLinkID = (cl.bithaus.qfix.fields.ClOrdLinkID) g.getField(clOrdLinkID);
                    entry.setClOrdLinkID(clOrdLinkID.getValue());

                }
                if(g.isSetField(settlInstMode)) {
                    settlInstMode = (cl.bithaus.qfix.fields.SettlInstMode) g.getField(settlInstMode);
                    entry.setSettlInstMode(settlInstMode.getValue()+"");
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
                if(g.isSetField(allocID)) {
                    allocID = (cl.bithaus.qfix.fields.AllocID) g.getField(allocID);
                    entry.setAllocID(allocID.getValue());

                }
                if(g.isSetField(preallocMethod)) {
                    preallocMethod = (cl.bithaus.qfix.fields.PreallocMethod) g.getField(preallocMethod);
                    entry.setPreallocMethod(preallocMethod.getValue()+"");
                }
                if(g.isSetField(settlType)) {
                    settlType = (cl.bithaus.qfix.fields.SettlType) g.getField(settlType);
                    entry.setSettlType(settlType.getValue()+"");
                }
                if(g.isSetField(settlDate)) {
                    settlDate = (cl.bithaus.qfix.fields.SettlDate) g.getField(settlDate);
                    entry.setSettlDate(settlDate.getValue());

                }
                if(g.isSetField(cashMargin)) {
                    cashMargin = (cl.bithaus.qfix.fields.CashMargin) g.getField(cashMargin);
                    entry.setCashMargin(cashMargin.getValue()+"");
                }
                if(g.isSetField(clearingFeeIndicator)) {
                    clearingFeeIndicator = (cl.bithaus.qfix.fields.ClearingFeeIndicator) g.getField(clearingFeeIndicator);
                    entry.setClearingFeeIndicator(clearingFeeIndicator.getValue());

                }
                if(g.isSetField(handlInst)) {
                    handlInst = (cl.bithaus.qfix.fields.HandlInst) g.getField(handlInst);
                    entry.setHandlInst(handlInst.getValue()+"");
                }
                if(g.isSetField(execInst)) {
                    execInst = (cl.bithaus.qfix.fields.ExecInst) g.getField(execInst);
                    entry.setExecInst(execInst.getValue());

                }
                if(g.isSetField(minQty)) {
                    minQty = (cl.bithaus.qfix.fields.MinQty) g.getField(minQty);
                    entry.setMinQty(minQty.getValue());

                }
                if(g.isSetField(maxFloor)) {
                    maxFloor = (cl.bithaus.qfix.fields.MaxFloor) g.getField(maxFloor);
                    entry.setMaxFloor(maxFloor.getValue());

                }
                if(g.isSetField(exDestination)) {
                    exDestination = (cl.bithaus.qfix.fields.ExDestination) g.getField(exDestination);
                    entry.setExDestination(exDestination.getValue());

                }
                if(g.isSetField(processCode)) {
                    processCode = (cl.bithaus.qfix.fields.ProcessCode) g.getField(processCode);
                    entry.setProcessCode(processCode.getValue()+"");
                }
                if(g.isSetField(prevClosePx)) {
                    prevClosePx = (cl.bithaus.qfix.fields.PrevClosePx) g.getField(prevClosePx);
                    entry.setPrevClosePx(prevClosePx.getValue());

                }
                if(g.isSetField(side)) {
                    side = (cl.bithaus.qfix.fields.Side) g.getField(side);
                    entry.setSide(side.getValue()+"");
                }
                if(g.isSetField(sideValueInd)) {
                    sideValueInd = (cl.bithaus.qfix.fields.SideValueInd) g.getField(sideValueInd);
                    entry.setSideValueInd(sideValueInd.getValue());

                }
                if(g.isSetField(locateReqd)) {
                    locateReqd = (cl.bithaus.qfix.fields.LocateReqd) g.getField(locateReqd);
                    entry.setLocateReqd(locateReqd.getValue());

                }
                if(g.isSetField(transactTime)) {
                    transactTime = (cl.bithaus.qfix.fields.TransactTime) g.getField(transactTime);
                    entry.setTransactTime(transactTime.getValue());

                }
                if(g.isSetField(qtyType)) {
                    qtyType = (cl.bithaus.qfix.fields.QtyType) g.getField(qtyType);
                    entry.setQtyType(qtyType.getValue());

                }
                if(g.isSetField(ordType)) {
                    ordType = (cl.bithaus.qfix.fields.OrdType) g.getField(ordType);
                    entry.setOrdType(ordType.getValue()+"");
                }
                if(g.isSetField(priceType)) {
                    priceType = (cl.bithaus.qfix.fields.PriceType) g.getField(priceType);
                    entry.setPriceType(priceType.getValue());

                }
                if(g.isSetField(price)) {
                    price = (cl.bithaus.qfix.fields.Price) g.getField(price);
                    entry.setPrice(price.getValue());

                }
                if(g.isSetField(stopPx)) {
                    stopPx = (cl.bithaus.qfix.fields.StopPx) g.getField(stopPx);
                    entry.setStopPx(stopPx.getValue());

                }
                if(g.isSetField(currency)) {
                    currency = (cl.bithaus.qfix.fields.Currency) g.getField(currency);
                    entry.setCurrency(currency.getValue());

                }
                if(g.isSetField(complianceID)) {
                    complianceID = (cl.bithaus.qfix.fields.ComplianceID) g.getField(complianceID);
                    entry.setComplianceID(complianceID.getValue());

                }
                if(g.isSetField(solicitedFlag)) {
                    solicitedFlag = (cl.bithaus.qfix.fields.SolicitedFlag) g.getField(solicitedFlag);
                    entry.setSolicitedFlag(solicitedFlag.getValue());

                }
                if(g.isSetField(iOIid)) {
                    iOIid = (cl.bithaus.qfix.fields.IOIid) g.getField(iOIid);
                    entry.setIOIid(iOIid.getValue());

                }
                if(g.isSetField(quoteID)) {
                    quoteID = (cl.bithaus.qfix.fields.QuoteID) g.getField(quoteID);
                    entry.setQuoteID(quoteID.getValue());

                }
                if(g.isSetField(timeInForce)) {
                    timeInForce = (cl.bithaus.qfix.fields.TimeInForce) g.getField(timeInForce);
                    entry.setTimeInForce(timeInForce.getValue()+"");
                }
                if(g.isSetField(effectiveTime)) {
                    effectiveTime = (cl.bithaus.qfix.fields.EffectiveTime) g.getField(effectiveTime);
                    entry.setEffectiveTime(effectiveTime.getValue());

                }
                if(g.isSetField(expireDate)) {
                    expireDate = (cl.bithaus.qfix.fields.ExpireDate) g.getField(expireDate);
                    entry.setExpireDate(expireDate.getValue());

                }
                if(g.isSetField(expireTime)) {
                    expireTime = (cl.bithaus.qfix.fields.ExpireTime) g.getField(expireTime);
                    entry.setExpireTime(expireTime.getValue());

                }
                if(g.isSetField(gTBookingInst)) {
                    gTBookingInst = (cl.bithaus.qfix.fields.GTBookingInst) g.getField(gTBookingInst);
                    entry.setGTBookingInst(gTBookingInst.getValue());

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
                if(g.isSetField(settlDate2)) {
                    settlDate2 = (cl.bithaus.qfix.fields.SettlDate2) g.getField(settlDate2);
                    entry.setSettlDate2(settlDate2.getValue());

                }
                if(g.isSetField(orderQty2)) {
                    orderQty2 = (cl.bithaus.qfix.fields.OrderQty2) g.getField(orderQty2);
                    entry.setOrderQty2(orderQty2.getValue());

                }
                if(g.isSetField(price2)) {
                    price2 = (cl.bithaus.qfix.fields.Price2) g.getField(price2);
                    entry.setPrice2(price2.getValue());

                }
                if(g.isSetField(positionEffect)) {
                    positionEffect = (cl.bithaus.qfix.fields.PositionEffect) g.getField(positionEffect);
                    entry.setPositionEffect(positionEffect.getValue()+"");
                }
                if(g.isSetField(coveredOrUncovered)) {
                    coveredOrUncovered = (cl.bithaus.qfix.fields.CoveredOrUncovered) g.getField(coveredOrUncovered);
                    entry.setCoveredOrUncovered(coveredOrUncovered.getValue());

                }
                if(g.isSetField(maxShow)) {
                    maxShow = (cl.bithaus.qfix.fields.MaxShow) g.getField(maxShow);
                    entry.setMaxShow(maxShow.getValue());

                }
                if(g.isSetField(targetStrategy)) {
                    targetStrategy = (cl.bithaus.qfix.fields.TargetStrategy) g.getField(targetStrategy);
                    entry.setTargetStrategy(targetStrategy.getValue());

                }
                if(g.isSetField(targetStrategyParameters)) {
                    targetStrategyParameters = (cl.bithaus.qfix.fields.TargetStrategyParameters) g.getField(targetStrategyParameters);
                    entry.setTargetStrategyParameters(targetStrategyParameters.getValue());

                }
                if(g.isSetField(participationRate)) {
                    participationRate = (cl.bithaus.qfix.fields.ParticipationRate) g.getField(participationRate);
                    entry.setParticipationRate(new BigDecimal(participationRate.getValue()));
                }
                if(g.isSetField(designation)) {
                    designation = (cl.bithaus.qfix.fields.Designation) g.getField(designation);
                    entry.setDesignation(designation.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

