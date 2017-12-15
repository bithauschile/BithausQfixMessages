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
 * Fix - Bithaus format component translator for AllocationReport
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class AllocationReportTranslator  {

    public static cl.bithaus.qfix.msg.AllocationReport toFix(cl.bithaus.fix.AllocationReport src) {

        cl.bithaus.qfix.msg.AllocationReport dest = new cl.bithaus.qfix.msg.AllocationReport();

        if(src.getAllocReportID() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocReportID(src.getAllocReportID()));
        
        if(src.getAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocID(src.getAllocID()));
        
        if(src.getAllocTransType() != null)
            if(src.getAllocTransType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.AllocTransType(src.getAllocTransType().charAt(0)));
        
        if(src.getAllocReportRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocReportRefID(src.getAllocReportRefID()));
        
        if(src.getAllocCancReplaceReason() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocCancReplaceReason(src.getAllocCancReplaceReason()));
        
        if(src.getSecondaryAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryAllocID(src.getSecondaryAllocID()));
        
        if(src.getAllocReportType() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocReportType(src.getAllocReportType()));
        
        if(src.getAllocStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocStatus(src.getAllocStatus()));
        
        if(src.getAllocRejCode() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocRejCode(src.getAllocRejCode()));
        
        if(src.getRefAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.RefAllocID(src.getRefAllocID()));
        
        if(src.getAllocIntermedReqType() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocIntermedReqType(src.getAllocIntermedReqType()));
        
        if(src.getAllocLinkID() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocLinkID(src.getAllocLinkID()));
        
        if(src.getAllocLinkType() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocLinkType(src.getAllocLinkType()));
        
        if(src.getBookingRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.BookingRefID(src.getBookingRefID()));
        
        if(src.getAllocNoOrdersType() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocNoOrdersType(src.getAllocNoOrdersType()));
        
        if(src.getPreviouslyReported() != null)
            dest.set(new cl.bithaus.qfix.fields.PreviouslyReported(src.getPreviouslyReported()));
        
        if(src.getReversalIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.ReversalIndicator(src.getReversalIndicator()));
        
        if(src.getMatchType() != null)
            dest.set(new cl.bithaus.qfix.fields.MatchType(src.getMatchType()));
        
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
        
        if(src.getQuantity() != null)
            dest.set(new cl.bithaus.qfix.fields.Quantity(src.getQuantity()));
        
        if(src.getQtyType() != null)
            dest.set(new cl.bithaus.qfix.fields.QtyType(src.getQtyType()));
        
        if(src.getLastMkt() != null)
            dest.set(new cl.bithaus.qfix.fields.LastMkt(src.getLastMkt()));
        
        if(src.getTradeOriginationDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeOriginationDate(src.getTradeOriginationDate()));
        
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
        
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
        
        if(src.getPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.PriceType(src.getPriceType()));
        
        if(src.getAvgPx() != null)
            dest.set(new cl.bithaus.qfix.fields.AvgPx(src.getAvgPx()));
        
        if(src.getAvgParPx() != null)
            dest.set(new cl.bithaus.qfix.fields.AvgParPx(src.getAvgParPx()));
        
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
        
        if(src.getAvgPxPrecision() != null)
            dest.set(new cl.bithaus.qfix.fields.AvgPxPrecision(src.getAvgPxPrecision()));
        
        if(src.getTradeDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeDate(src.getTradeDate()));
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getSettlType() != null)
            if(src.getSettlType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SettlType(src.getSettlType().charAt(0)));
        
        if(src.getSettlDate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlDate(src.getSettlDate()));
        
        if(src.getBookingType() != null)
            dest.set(new cl.bithaus.qfix.fields.BookingType(src.getBookingType()));
        
        if(src.getGrossTradeAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.GrossTradeAmt(src.getGrossTradeAmt()));
        
        if(src.getConcession() != null)
            dest.set(new cl.bithaus.qfix.fields.Concession(src.getConcession()));
        
        if(src.getTotalTakedown() != null)
            dest.set(new cl.bithaus.qfix.fields.TotalTakedown(src.getTotalTakedown()));
        
        if(src.getNetMoney() != null)
            dest.set(new cl.bithaus.qfix.fields.NetMoney(src.getNetMoney()));
        
        if(src.getPositionEffect() != null)
            if(src.getPositionEffect().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.PositionEffect(src.getPositionEffect().charAt(0)));
        
        if(src.getAutoAcceptIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.AutoAcceptIndicator(src.getAutoAcceptIndicator()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        
        if(src.getNumDaysInterest() != null)
            dest.set(new cl.bithaus.qfix.fields.NumDaysInterest(src.getNumDaysInterest()));
        
        if(src.getAccruedInterestRate() != null)
            dest.set(new cl.bithaus.qfix.fields.AccruedInterestRate(src.getAccruedInterestRate().doubleValue()));
        
        if(src.getAccruedInterestAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.AccruedInterestAmt(src.getAccruedInterestAmt()));
        
        if(src.getTotalAccruedInterestAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.TotalAccruedInterestAmt(src.getTotalAccruedInterestAmt()));
        
        if(src.getInterestAtMaturity() != null)
            dest.set(new cl.bithaus.qfix.fields.InterestAtMaturity(src.getInterestAtMaturity()));
        
        if(src.getEndAccruedInterestAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.EndAccruedInterestAmt(src.getEndAccruedInterestAmt()));
        
        if(src.getStartCash() != null)
            dest.set(new cl.bithaus.qfix.fields.StartCash(src.getStartCash()));
        
        if(src.getEndCash() != null)
            dest.set(new cl.bithaus.qfix.fields.EndCash(src.getEndCash()));
        
        if(src.getLegalConfirm() != null)
            dest.set(new cl.bithaus.qfix.fields.LegalConfirm(src.getLegalConfirm()));
        
        if(src.getTotNoAllocs() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNoAllocs(src.getTotNoAllocs()));
        
        if(src.getLastFragment() != null)
            dest.set(new cl.bithaus.qfix.fields.LastFragment(src.getLastFragment()));
        

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getInstrumentExtension() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentExtensionTranslator.toFix(src.getInstrumentExtension()));

        if(src.getFinancingDetails() != null)
            dest.set(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.toFix(src.getFinancingDetails()));

        if(src.getSpreadOrBenchmarkCurveData() != null)
            dest.set(cl.bithaus.qfix.translator.component.SpreadOrBenchmarkCurveDataTranslator.toFix(src.getSpreadOrBenchmarkCurveData()));

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));

        if(src.getStipulations() != null)
            dest.set(cl.bithaus.qfix.translator.component.StipulationsTranslator.toFix(src.getStipulations()));

        if(src.getYieldData() != null)
            dest.set(cl.bithaus.qfix.translator.component.YieldDataTranslator.toFix(src.getYieldData()));


        if(src.getNoOrders() != null && src.getNoOrders().size() > 0) {

            for(cl.bithaus.fix.AllocationReport.NoOrders.NoOrdersEntry entry : src.getNoOrders().getGroups()) {

                cl.bithaus.qfix.msg.AllocationReport.NoOrders aux = 
                    new cl.bithaus.qfix.msg.AllocationReport.NoOrders();

                aux.set(new cl.bithaus.qfix.fields.ClOrdID(entry.getClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.OrderID(entry.getOrderID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryOrderID(entry.getSecondaryOrderID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(entry.getSecondaryClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.ListID(entry.getListID()));
                aux.set(new cl.bithaus.qfix.fields.OrderQty(entry.getOrderQty()));
                aux.set(new cl.bithaus.qfix.fields.OrderAvgPx(entry.getOrderAvgPx()));
                aux.set(new cl.bithaus.qfix.fields.OrderBookingQty(entry.getOrderBookingQty()));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoExecs() != null && src.getNoExecs().size() > 0) {

            for(cl.bithaus.fix.AllocationReport.NoExecs.NoExecsEntry entry : src.getNoExecs().getGroups()) {

                cl.bithaus.qfix.msg.AllocationReport.NoExecs aux = 
                    new cl.bithaus.qfix.msg.AllocationReport.NoExecs();

                aux.set(new cl.bithaus.qfix.fields.LastQty(entry.getLastQty()));
                aux.set(new cl.bithaus.qfix.fields.ExecID(entry.getExecID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryExecID(entry.getSecondaryExecID()));
                aux.set(new cl.bithaus.qfix.fields.LastPx(entry.getLastPx()));
                aux.set(new cl.bithaus.qfix.fields.LastParPx(entry.getLastParPx()));
                if(entry.getLastCapacity().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.LastCapacity(entry.getLastCapacity().charAt(0)));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.AllocationReport.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.AllocationReport.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.AllocationReport.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.AllocationReport.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.AllocationReport.NoLegs aux = 
                    new cl.bithaus.qfix.msg.AllocationReport.NoLegs();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoAllocs() != null && src.getNoAllocs().size() > 0) {

            for(cl.bithaus.fix.AllocationReport.NoAllocs.NoAllocsEntry entry : src.getNoAllocs().getGroups()) {

                cl.bithaus.qfix.msg.AllocationReport.NoAllocs aux = 
                    new cl.bithaus.qfix.msg.AllocationReport.NoAllocs();

                aux.set(new cl.bithaus.qfix.fields.AllocAccount(entry.getAllocAccount()));
                aux.set(new cl.bithaus.qfix.fields.AllocAcctIDSource(entry.getAllocAcctIDSource()));
                if(entry.getMatchStatus().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.MatchStatus(entry.getMatchStatus().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.AllocPrice(entry.getAllocPrice()));
                aux.set(new cl.bithaus.qfix.fields.AllocQty(entry.getAllocQty()));
                aux.set(new cl.bithaus.qfix.fields.IndividualAllocID(entry.getIndividualAllocID()));
                if(entry.getProcessCode().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.ProcessCode(entry.getProcessCode().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.NotifyBrokerOfCredit(entry.getNotifyBrokerOfCredit()));
                aux.set(new cl.bithaus.qfix.fields.AllocHandlInst(entry.getAllocHandlInst()));
                aux.set(new cl.bithaus.qfix.fields.AllocText(entry.getAllocText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedAllocTextLen(entry.getEncodedAllocTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedAllocText(entry.getEncodedAllocText()));
                aux.set(new cl.bithaus.qfix.fields.AllocAvgPx(entry.getAllocAvgPx()));
                aux.set(new cl.bithaus.qfix.fields.AllocNetMoney(entry.getAllocNetMoney()));
                aux.set(new cl.bithaus.qfix.fields.SettlCurrAmt(entry.getSettlCurrAmt()));
                aux.set(new cl.bithaus.qfix.fields.AllocSettlCurrAmt(entry.getAllocSettlCurrAmt()));
                aux.set(new cl.bithaus.qfix.fields.SettlCurrency(entry.getSettlCurrency()));
                aux.set(new cl.bithaus.qfix.fields.AllocSettlCurrency(entry.getAllocSettlCurrency()));
                aux.set(new cl.bithaus.qfix.fields.SettlCurrFxRate(entry.getSettlCurrFxRate().floatValue()));
                if(entry.getSettlCurrFxRateCalc().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.SettlCurrFxRateCalc(entry.getSettlCurrFxRateCalc().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.AllocAccruedInterestAmt(entry.getAllocAccruedInterestAmt()));
                aux.set(new cl.bithaus.qfix.fields.AllocInterestAtMaturity(entry.getAllocInterestAtMaturity()));
                aux.set(new cl.bithaus.qfix.fields.ClearingFeeIndicator(entry.getClearingFeeIndicator()));
                aux.set(new cl.bithaus.qfix.fields.AllocSettlInstType(entry.getAllocSettlInstType()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.AllocationReport fromFix(cl.bithaus.qfix.msg.AllocationReport src) 
        throws FieldNotFound {

        cl.bithaus.fix.AllocationReport dest = new cl.bithaus.fix.AllocationReport();

        if(src.isSetAllocReportID())
            dest.setAllocReportID(src.getAllocReportID().getValue());

        if(src.isSetAllocID())
            dest.setAllocID(src.getAllocID().getValue());

        if(src.isSetAllocTransType())
            dest.setAllocTransType(src.getAllocTransType().getValue()+"");

        if(src.isSetAllocReportRefID())
            dest.setAllocReportRefID(src.getAllocReportRefID().getValue());

        if(src.isSetAllocCancReplaceReason())
            dest.setAllocCancReplaceReason(src.getAllocCancReplaceReason().getValue());

        if(src.isSetSecondaryAllocID())
            dest.setSecondaryAllocID(src.getSecondaryAllocID().getValue());

        if(src.isSetAllocReportType())
            dest.setAllocReportType(src.getAllocReportType().getValue());

        if(src.isSetAllocStatus())
            dest.setAllocStatus(src.getAllocStatus().getValue());

        if(src.isSetAllocRejCode())
            dest.setAllocRejCode(src.getAllocRejCode().getValue());

        if(src.isSetRefAllocID())
            dest.setRefAllocID(src.getRefAllocID().getValue());

        if(src.isSetAllocIntermedReqType())
            dest.setAllocIntermedReqType(src.getAllocIntermedReqType().getValue());

        if(src.isSetAllocLinkID())
            dest.setAllocLinkID(src.getAllocLinkID().getValue());

        if(src.isSetAllocLinkType())
            dest.setAllocLinkType(src.getAllocLinkType().getValue());

        if(src.isSetBookingRefID())
            dest.setBookingRefID(src.getBookingRefID().getValue());

        if(src.isSetAllocNoOrdersType())
            dest.setAllocNoOrdersType(src.getAllocNoOrdersType().getValue());

        if(src.isSetPreviouslyReported())
            dest.setPreviouslyReported(src.getPreviouslyReported().getValue());

        if(src.isSetReversalIndicator())
            dest.setReversalIndicator(src.getReversalIndicator().getValue());

        if(src.isSetMatchType())
            dest.setMatchType(src.getMatchType().getValue());

        if(src.isSetSide())
            dest.setSide(src.getSide().getValue()+"");

        if(src.isSetQuantity())
            dest.setQuantity(src.getQuantity().getValue());

        if(src.isSetQtyType())
            dest.setQtyType(src.getQtyType().getValue());

        if(src.isSetLastMkt())
            dest.setLastMkt(src.getLastMkt().getValue());

        if(src.isSetTradeOriginationDate())
            dest.setTradeOriginationDate(src.getTradeOriginationDate().getValue());

        if(src.isSetTradingSessionID())
            dest.setTradingSessionID(src.getTradingSessionID().getValue());

        if(src.isSetTradingSessionSubID())
            dest.setTradingSessionSubID(src.getTradingSessionSubID().getValue());

        if(src.isSetPriceType())
            dest.setPriceType(src.getPriceType().getValue());

        if(src.isSetAvgPx())
            dest.setAvgPx(src.getAvgPx().getValue());

        if(src.isSetAvgParPx())
            dest.setAvgParPx(src.getAvgParPx().getValue());

        if(src.isSetCurrency())
            dest.setCurrency(src.getCurrency().getValue());

        if(src.isSetAvgPxPrecision())
            dest.setAvgPxPrecision(src.getAvgPxPrecision().getValue());

        if(src.isSetTradeDate())
            dest.setTradeDate(src.getTradeDate().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetSettlType())
            dest.setSettlType(src.getSettlType().getValue()+"");

        if(src.isSetSettlDate())
            dest.setSettlDate(src.getSettlDate().getValue());

        if(src.isSetBookingType())
            dest.setBookingType(src.getBookingType().getValue());

        if(src.isSetGrossTradeAmt())
            dest.setGrossTradeAmt(src.getGrossTradeAmt().getValue());

        if(src.isSetConcession())
            dest.setConcession(src.getConcession().getValue());

        if(src.isSetTotalTakedown())
            dest.setTotalTakedown(src.getTotalTakedown().getValue());

        if(src.isSetNetMoney())
            dest.setNetMoney(src.getNetMoney().getValue());

        if(src.isSetPositionEffect())
            dest.setPositionEffect(src.getPositionEffect().getValue()+"");

        if(src.isSetAutoAcceptIndicator())
            dest.setAutoAcceptIndicator(src.getAutoAcceptIndicator().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());

        if(src.isSetNumDaysInterest())
            dest.setNumDaysInterest(src.getNumDaysInterest().getValue());

        if(src.isSetAccruedInterestRate())
            dest.setAccruedInterestRate(new BigDecimal(src.getAccruedInterestRate().getValue()));

        if(src.isSetAccruedInterestAmt())
            dest.setAccruedInterestAmt(src.getAccruedInterestAmt().getValue());

        if(src.isSetTotalAccruedInterestAmt())
            dest.setTotalAccruedInterestAmt(src.getTotalAccruedInterestAmt().getValue());

        if(src.isSetInterestAtMaturity())
            dest.setInterestAtMaturity(src.getInterestAtMaturity().getValue());

        if(src.isSetEndAccruedInterestAmt())
            dest.setEndAccruedInterestAmt(src.getEndAccruedInterestAmt().getValue());

        if(src.isSetStartCash())
            dest.setStartCash(src.getStartCash().getValue());

        if(src.isSetEndCash())
            dest.setEndCash(src.getEndCash().getValue());

        if(src.isSetLegalConfirm())
            dest.setLegalConfirm(src.getLegalConfirm().getValue());

        if(src.isSetTotNoAllocs())
            dest.setTotNoAllocs(src.getTotNoAllocs().getValue());

        if(src.isSetLastFragment())
            dest.setLastFragment(src.getLastFragment().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"
        try {
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setInstrumentExtension(cl.bithaus.qfix.translator.component.InstrumentExtensionTranslator.fromFix(src.getInstrumentExtension()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setFinancingDetails(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.fromFix(src.getFinancingDetails()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setSpreadOrBenchmarkCurveData(cl.bithaus.qfix.translator.component.SpreadOrBenchmarkCurveDataTranslator.fromFix(src.getSpreadOrBenchmarkCurveData()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setParties(cl.bithaus.qfix.translator.component.PartiesTranslator.fromFix(src.getParties()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setStipulations(cl.bithaus.qfix.translator.component.StipulationsTranslator.fromFix(src.getStipulations()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setYieldData(cl.bithaus.qfix.translator.component.YieldDataTranslator.fromFix(src.getYieldData()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoOrders()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoOrders().getField());
            List<cl.bithaus.fix.AllocationReport.NoOrders.NoOrdersEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.ClOrdID clOrdID = new cl.bithaus.qfix.fields.ClOrdID();
            cl.bithaus.qfix.fields.OrderID orderID = new cl.bithaus.qfix.fields.OrderID();
            cl.bithaus.qfix.fields.SecondaryOrderID secondaryOrderID = new cl.bithaus.qfix.fields.SecondaryOrderID();
            cl.bithaus.qfix.fields.SecondaryClOrdID secondaryClOrdID = new cl.bithaus.qfix.fields.SecondaryClOrdID();
            cl.bithaus.qfix.fields.ListID listID = new cl.bithaus.qfix.fields.ListID();
            cl.bithaus.qfix.fields.OrderQty orderQty = new cl.bithaus.qfix.fields.OrderQty();
            cl.bithaus.qfix.fields.OrderAvgPx orderAvgPx = new cl.bithaus.qfix.fields.OrderAvgPx();
            cl.bithaus.qfix.fields.OrderBookingQty orderBookingQty = new cl.bithaus.qfix.fields.OrderBookingQty();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.AllocationReport.NoOrders.NoOrdersEntry entry = 
                    new cl.bithaus.fix.AllocationReport.NoOrders.NoOrdersEntry();

                if(g.isSetField(clOrdID)) {
                    clOrdID = (cl.bithaus.qfix.fields.ClOrdID) g.getField(clOrdID);
                    entry.setClOrdID(clOrdID.getValue());

                }
                if(g.isSetField(orderID)) {
                    orderID = (cl.bithaus.qfix.fields.OrderID) g.getField(orderID);
                    entry.setOrderID(orderID.getValue());

                }
                if(g.isSetField(secondaryOrderID)) {
                    secondaryOrderID = (cl.bithaus.qfix.fields.SecondaryOrderID) g.getField(secondaryOrderID);
                    entry.setSecondaryOrderID(secondaryOrderID.getValue());

                }
                if(g.isSetField(secondaryClOrdID)) {
                    secondaryClOrdID = (cl.bithaus.qfix.fields.SecondaryClOrdID) g.getField(secondaryClOrdID);
                    entry.setSecondaryClOrdID(secondaryClOrdID.getValue());

                }
                if(g.isSetField(listID)) {
                    listID = (cl.bithaus.qfix.fields.ListID) g.getField(listID);
                    entry.setListID(listID.getValue());

                }
                if(g.isSetField(orderQty)) {
                    orderQty = (cl.bithaus.qfix.fields.OrderQty) g.getField(orderQty);
                    entry.setOrderQty(orderQty.getValue());

                }
                if(g.isSetField(orderAvgPx)) {
                    orderAvgPx = (cl.bithaus.qfix.fields.OrderAvgPx) g.getField(orderAvgPx);
                    entry.setOrderAvgPx(orderAvgPx.getValue());

                }
                if(g.isSetField(orderBookingQty)) {
                    orderBookingQty = (cl.bithaus.qfix.fields.OrderBookingQty) g.getField(orderBookingQty);
                    entry.setOrderBookingQty(orderBookingQty.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoExecs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoExecs().getField());
            List<cl.bithaus.fix.AllocationReport.NoExecs.NoExecsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.LastQty lastQty = new cl.bithaus.qfix.fields.LastQty();
            cl.bithaus.qfix.fields.ExecID execID = new cl.bithaus.qfix.fields.ExecID();
            cl.bithaus.qfix.fields.SecondaryExecID secondaryExecID = new cl.bithaus.qfix.fields.SecondaryExecID();
            cl.bithaus.qfix.fields.LastPx lastPx = new cl.bithaus.qfix.fields.LastPx();
            cl.bithaus.qfix.fields.LastParPx lastParPx = new cl.bithaus.qfix.fields.LastParPx();
            cl.bithaus.qfix.fields.LastCapacity lastCapacity = new cl.bithaus.qfix.fields.LastCapacity();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.AllocationReport.NoExecs.NoExecsEntry entry = 
                    new cl.bithaus.fix.AllocationReport.NoExecs.NoExecsEntry();

                if(g.isSetField(lastQty)) {
                    lastQty = (cl.bithaus.qfix.fields.LastQty) g.getField(lastQty);
                    entry.setLastQty(lastQty.getValue());

                }
                if(g.isSetField(execID)) {
                    execID = (cl.bithaus.qfix.fields.ExecID) g.getField(execID);
                    entry.setExecID(execID.getValue());

                }
                if(g.isSetField(secondaryExecID)) {
                    secondaryExecID = (cl.bithaus.qfix.fields.SecondaryExecID) g.getField(secondaryExecID);
                    entry.setSecondaryExecID(secondaryExecID.getValue());

                }
                if(g.isSetField(lastPx)) {
                    lastPx = (cl.bithaus.qfix.fields.LastPx) g.getField(lastPx);
                    entry.setLastPx(lastPx.getValue());

                }
                if(g.isSetField(lastParPx)) {
                    lastParPx = (cl.bithaus.qfix.fields.LastParPx) g.getField(lastParPx);
                    entry.setLastParPx(lastParPx.getValue());

                }
                if(g.isSetField(lastCapacity)) {
                    lastCapacity = (cl.bithaus.qfix.fields.LastCapacity) g.getField(lastCapacity);
                    entry.setLastCapacity(lastCapacity.getValue()+"");
                }

                result.add(entry);                
            }

        }
        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.AllocationReport.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.AllocationReport.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.AllocationReport.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.AllocationReport.NoLegs.NoLegsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.AllocationReport.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.AllocationReport.NoLegs.NoLegsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoAllocs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoAllocs().getField());
            List<cl.bithaus.fix.AllocationReport.NoAllocs.NoAllocsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.AllocAccount allocAccount = new cl.bithaus.qfix.fields.AllocAccount();
            cl.bithaus.qfix.fields.AllocAcctIDSource allocAcctIDSource = new cl.bithaus.qfix.fields.AllocAcctIDSource();
            cl.bithaus.qfix.fields.MatchStatus matchStatus = new cl.bithaus.qfix.fields.MatchStatus();
            cl.bithaus.qfix.fields.AllocPrice allocPrice = new cl.bithaus.qfix.fields.AllocPrice();
            cl.bithaus.qfix.fields.AllocQty allocQty = new cl.bithaus.qfix.fields.AllocQty();
            cl.bithaus.qfix.fields.IndividualAllocID individualAllocID = new cl.bithaus.qfix.fields.IndividualAllocID();
            cl.bithaus.qfix.fields.ProcessCode processCode = new cl.bithaus.qfix.fields.ProcessCode();
            cl.bithaus.qfix.fields.NotifyBrokerOfCredit notifyBrokerOfCredit = new cl.bithaus.qfix.fields.NotifyBrokerOfCredit();
            cl.bithaus.qfix.fields.AllocHandlInst allocHandlInst = new cl.bithaus.qfix.fields.AllocHandlInst();
            cl.bithaus.qfix.fields.AllocText allocText = new cl.bithaus.qfix.fields.AllocText();
            cl.bithaus.qfix.fields.EncodedAllocTextLen encodedAllocTextLen = new cl.bithaus.qfix.fields.EncodedAllocTextLen();
            cl.bithaus.qfix.fields.EncodedAllocText encodedAllocText = new cl.bithaus.qfix.fields.EncodedAllocText();
            cl.bithaus.qfix.fields.AllocAvgPx allocAvgPx = new cl.bithaus.qfix.fields.AllocAvgPx();
            cl.bithaus.qfix.fields.AllocNetMoney allocNetMoney = new cl.bithaus.qfix.fields.AllocNetMoney();
            cl.bithaus.qfix.fields.SettlCurrAmt settlCurrAmt = new cl.bithaus.qfix.fields.SettlCurrAmt();
            cl.bithaus.qfix.fields.AllocSettlCurrAmt allocSettlCurrAmt = new cl.bithaus.qfix.fields.AllocSettlCurrAmt();
            cl.bithaus.qfix.fields.SettlCurrency settlCurrency = new cl.bithaus.qfix.fields.SettlCurrency();
            cl.bithaus.qfix.fields.AllocSettlCurrency allocSettlCurrency = new cl.bithaus.qfix.fields.AllocSettlCurrency();
            cl.bithaus.qfix.fields.SettlCurrFxRate settlCurrFxRate = new cl.bithaus.qfix.fields.SettlCurrFxRate();
            cl.bithaus.qfix.fields.SettlCurrFxRateCalc settlCurrFxRateCalc = new cl.bithaus.qfix.fields.SettlCurrFxRateCalc();
            cl.bithaus.qfix.fields.AllocAccruedInterestAmt allocAccruedInterestAmt = new cl.bithaus.qfix.fields.AllocAccruedInterestAmt();
            cl.bithaus.qfix.fields.AllocInterestAtMaturity allocInterestAtMaturity = new cl.bithaus.qfix.fields.AllocInterestAtMaturity();
            cl.bithaus.qfix.fields.ClearingFeeIndicator clearingFeeIndicator = new cl.bithaus.qfix.fields.ClearingFeeIndicator();
            cl.bithaus.qfix.fields.AllocSettlInstType allocSettlInstType = new cl.bithaus.qfix.fields.AllocSettlInstType();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.AllocationReport.NoAllocs.NoAllocsEntry entry = 
                    new cl.bithaus.fix.AllocationReport.NoAllocs.NoAllocsEntry();

                if(g.isSetField(allocAccount)) {
                    allocAccount = (cl.bithaus.qfix.fields.AllocAccount) g.getField(allocAccount);
                    entry.setAllocAccount(allocAccount.getValue());

                }
                if(g.isSetField(allocAcctIDSource)) {
                    allocAcctIDSource = (cl.bithaus.qfix.fields.AllocAcctIDSource) g.getField(allocAcctIDSource);
                    entry.setAllocAcctIDSource(allocAcctIDSource.getValue());

                }
                if(g.isSetField(matchStatus)) {
                    matchStatus = (cl.bithaus.qfix.fields.MatchStatus) g.getField(matchStatus);
                    entry.setMatchStatus(matchStatus.getValue()+"");
                }
                if(g.isSetField(allocPrice)) {
                    allocPrice = (cl.bithaus.qfix.fields.AllocPrice) g.getField(allocPrice);
                    entry.setAllocPrice(allocPrice.getValue());

                }
                if(g.isSetField(allocQty)) {
                    allocQty = (cl.bithaus.qfix.fields.AllocQty) g.getField(allocQty);
                    entry.setAllocQty(allocQty.getValue());

                }
                if(g.isSetField(individualAllocID)) {
                    individualAllocID = (cl.bithaus.qfix.fields.IndividualAllocID) g.getField(individualAllocID);
                    entry.setIndividualAllocID(individualAllocID.getValue());

                }
                if(g.isSetField(processCode)) {
                    processCode = (cl.bithaus.qfix.fields.ProcessCode) g.getField(processCode);
                    entry.setProcessCode(processCode.getValue()+"");
                }
                if(g.isSetField(notifyBrokerOfCredit)) {
                    notifyBrokerOfCredit = (cl.bithaus.qfix.fields.NotifyBrokerOfCredit) g.getField(notifyBrokerOfCredit);
                    entry.setNotifyBrokerOfCredit(notifyBrokerOfCredit.getValue());

                }
                if(g.isSetField(allocHandlInst)) {
                    allocHandlInst = (cl.bithaus.qfix.fields.AllocHandlInst) g.getField(allocHandlInst);
                    entry.setAllocHandlInst(allocHandlInst.getValue());

                }
                if(g.isSetField(allocText)) {
                    allocText = (cl.bithaus.qfix.fields.AllocText) g.getField(allocText);
                    entry.setAllocText(allocText.getValue());

                }
                if(g.isSetField(encodedAllocTextLen)) {
                    encodedAllocTextLen = (cl.bithaus.qfix.fields.EncodedAllocTextLen) g.getField(encodedAllocTextLen);
                    entry.setEncodedAllocTextLen(encodedAllocTextLen.getValue());

                }
                if(g.isSetField(encodedAllocText)) {
                    encodedAllocText = (cl.bithaus.qfix.fields.EncodedAllocText) g.getField(encodedAllocText);
                    entry.setEncodedAllocText(encodedAllocText.getValue());

                }
                if(g.isSetField(allocAvgPx)) {
                    allocAvgPx = (cl.bithaus.qfix.fields.AllocAvgPx) g.getField(allocAvgPx);
                    entry.setAllocAvgPx(allocAvgPx.getValue());

                }
                if(g.isSetField(allocNetMoney)) {
                    allocNetMoney = (cl.bithaus.qfix.fields.AllocNetMoney) g.getField(allocNetMoney);
                    entry.setAllocNetMoney(allocNetMoney.getValue());

                }
                if(g.isSetField(settlCurrAmt)) {
                    settlCurrAmt = (cl.bithaus.qfix.fields.SettlCurrAmt) g.getField(settlCurrAmt);
                    entry.setSettlCurrAmt(settlCurrAmt.getValue());

                }
                if(g.isSetField(allocSettlCurrAmt)) {
                    allocSettlCurrAmt = (cl.bithaus.qfix.fields.AllocSettlCurrAmt) g.getField(allocSettlCurrAmt);
                    entry.setAllocSettlCurrAmt(allocSettlCurrAmt.getValue());

                }
                if(g.isSetField(settlCurrency)) {
                    settlCurrency = (cl.bithaus.qfix.fields.SettlCurrency) g.getField(settlCurrency);
                    entry.setSettlCurrency(settlCurrency.getValue());

                }
                if(g.isSetField(allocSettlCurrency)) {
                    allocSettlCurrency = (cl.bithaus.qfix.fields.AllocSettlCurrency) g.getField(allocSettlCurrency);
                    entry.setAllocSettlCurrency(allocSettlCurrency.getValue());

                }
                if(g.isSetField(settlCurrFxRate)) {
                    settlCurrFxRate = (cl.bithaus.qfix.fields.SettlCurrFxRate) g.getField(settlCurrFxRate);
                    entry.setSettlCurrFxRate(new BigDecimal(settlCurrFxRate.getValue()));
                }
                if(g.isSetField(settlCurrFxRateCalc)) {
                    settlCurrFxRateCalc = (cl.bithaus.qfix.fields.SettlCurrFxRateCalc) g.getField(settlCurrFxRateCalc);
                    entry.setSettlCurrFxRateCalc(settlCurrFxRateCalc.getValue()+"");
                }
                if(g.isSetField(allocAccruedInterestAmt)) {
                    allocAccruedInterestAmt = (cl.bithaus.qfix.fields.AllocAccruedInterestAmt) g.getField(allocAccruedInterestAmt);
                    entry.setAllocAccruedInterestAmt(allocAccruedInterestAmt.getValue());

                }
                if(g.isSetField(allocInterestAtMaturity)) {
                    allocInterestAtMaturity = (cl.bithaus.qfix.fields.AllocInterestAtMaturity) g.getField(allocInterestAtMaturity);
                    entry.setAllocInterestAtMaturity(allocInterestAtMaturity.getValue());

                }
                if(g.isSetField(clearingFeeIndicator)) {
                    clearingFeeIndicator = (cl.bithaus.qfix.fields.ClearingFeeIndicator) g.getField(clearingFeeIndicator);
                    entry.setClearingFeeIndicator(clearingFeeIndicator.getValue());

                }
                if(g.isSetField(allocSettlInstType)) {
                    allocSettlInstType = (cl.bithaus.qfix.fields.AllocSettlInstType) g.getField(allocSettlInstType);
                    entry.setAllocSettlInstType(allocSettlInstType.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

