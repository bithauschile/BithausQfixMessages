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
 * Fix - Bithaus format component translator for TradeCaptureReportAck
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class TradeCaptureReportAckTranslator  {

    public static cl.bithaus.qfix.msg.TradeCaptureReportAck toFix(cl.bithaus.fix.TradeCaptureReportAck src) {

        cl.bithaus.qfix.msg.TradeCaptureReportAck dest = new cl.bithaus.qfix.msg.TradeCaptureReportAck();

        if(src.getTradeReportID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeReportID(src.getTradeReportID()));
        
        if(src.getTradeReportTransType() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeReportTransType(src.getTradeReportTransType()));
        
        if(src.getTradeReportType() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeReportType(src.getTradeReportType()));
        
        if(src.getTrdType() != null)
            dest.set(new cl.bithaus.qfix.fields.TrdType(src.getTrdType()));
        
        if(src.getTrdSubType() != null)
            dest.set(new cl.bithaus.qfix.fields.TrdSubType(src.getTrdSubType()));
        
        if(src.getSecondaryTrdType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryTrdType(src.getSecondaryTrdType()));
        
        if(src.getTransferReason() != null)
            dest.set(new cl.bithaus.qfix.fields.TransferReason(src.getTransferReason()));
        
        if(src.getExecType() != null)
            if(src.getExecType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.ExecType(src.getExecType().charAt(0)));
        
        if(src.getTradeReportRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeReportRefID(src.getTradeReportRefID()));
        
        if(src.getSecondaryTradeReportRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryTradeReportRefID(src.getSecondaryTradeReportRefID()));
        
        if(src.getTrdRptStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.TrdRptStatus(src.getTrdRptStatus()));
        
        if(src.getTradeReportRejectReason() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeReportRejectReason(src.getTradeReportRejectReason()));
        
        if(src.getSecondaryTradeReportID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryTradeReportID(src.getSecondaryTradeReportID()));
        
        if(src.getSubscriptionRequestType() != null)
            if(src.getSubscriptionRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SubscriptionRequestType(src.getSubscriptionRequestType().charAt(0)));
        
        if(src.getTradeLinkID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeLinkID(src.getTradeLinkID()));
        
        if(src.getTrdMatchID() != null)
            dest.set(new cl.bithaus.qfix.fields.TrdMatchID(src.getTrdMatchID()));
        
        if(src.getExecID() != null)
            dest.set(new cl.bithaus.qfix.fields.ExecID(src.getExecID()));
        
        if(src.getSecondaryExecID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryExecID(src.getSecondaryExecID()));
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getResponseTransportType() != null)
            dest.set(new cl.bithaus.qfix.fields.ResponseTransportType(src.getResponseTransportType()));
        
        if(src.getResponseDestination() != null)
            dest.set(new cl.bithaus.qfix.fields.ResponseDestination(src.getResponseDestination()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        
        if(src.getClearingFeeIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.ClearingFeeIndicator(src.getClearingFeeIndicator()));
        
        if(src.getOrderCapacity() != null)
            if(src.getOrderCapacity().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.OrderCapacity(src.getOrderCapacity().charAt(0)));
        
        if(src.getOrderRestrictions() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderRestrictions(src.getOrderRestrictions()));
        
        if(src.getCustOrderCapacity() != null)
            dest.set(new cl.bithaus.qfix.fields.CustOrderCapacity(src.getCustOrderCapacity()));
        
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
        
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
        
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
        
        if(src.getPositionEffect() != null)
            if(src.getPositionEffect().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.PositionEffect(src.getPositionEffect().charAt(0)));
        
        if(src.getPreallocMethod() != null)
            if(src.getPreallocMethod().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.PreallocMethod(src.getPreallocMethod().charAt(0)));
        

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getTrdRegTimestamps() != null)
            dest.set(cl.bithaus.qfix.translator.component.TrdRegTimestampsTranslator.toFix(src.getTrdRegTimestamps()));


        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.TradeCaptureReportAck.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.TradeCaptureReportAck.NoLegs aux = 
                    new cl.bithaus.qfix.msg.TradeCaptureReportAck.NoLegs();

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
                aux.set(new cl.bithaus.qfix.fields.LegLastPx(entry.getLegLastPx()));
                aux.set(new cl.bithaus.qfix.fields.TargetLegRefId(entry.getTargetLegRefId()));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoAllocs() != null && src.getNoAllocs().size() > 0) {

            for(cl.bithaus.fix.TradeCaptureReportAck.NoAllocs.NoAllocsEntry entry : src.getNoAllocs().getGroups()) {

                cl.bithaus.qfix.msg.TradeCaptureReportAck.NoAllocs aux = 
                    new cl.bithaus.qfix.msg.TradeCaptureReportAck.NoAllocs();

                aux.set(new cl.bithaus.qfix.fields.AllocAccount(entry.getAllocAccount()));
                aux.set(new cl.bithaus.qfix.fields.AllocAcctIDSource(entry.getAllocAcctIDSource()));
                aux.set(new cl.bithaus.qfix.fields.AllocSettlCurrency(entry.getAllocSettlCurrency()));
                aux.set(new cl.bithaus.qfix.fields.IndividualAllocID(entry.getIndividualAllocID()));
                aux.set(new cl.bithaus.qfix.fields.AllocQty(entry.getAllocQty()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.TradeCaptureReportAck fromFix(cl.bithaus.qfix.msg.TradeCaptureReportAck src) 
        throws FieldNotFound {

        cl.bithaus.fix.TradeCaptureReportAck dest = new cl.bithaus.fix.TradeCaptureReportAck();

        if(src.isSetTradeReportID())
            dest.setTradeReportID(src.getTradeReportID().getValue());

        if(src.isSetTradeReportTransType())
            dest.setTradeReportTransType(src.getTradeReportTransType().getValue());

        if(src.isSetTradeReportType())
            dest.setTradeReportType(src.getTradeReportType().getValue());

        if(src.isSetTrdType())
            dest.setTrdType(src.getTrdType().getValue());

        if(src.isSetTrdSubType())
            dest.setTrdSubType(src.getTrdSubType().getValue());

        if(src.isSetSecondaryTrdType())
            dest.setSecondaryTrdType(src.getSecondaryTrdType().getValue());

        if(src.isSetTransferReason())
            dest.setTransferReason(src.getTransferReason().getValue());

        if(src.isSetExecType())
            dest.setExecType(src.getExecType().getValue()+"");

        if(src.isSetTradeReportRefID())
            dest.setTradeReportRefID(src.getTradeReportRefID().getValue());

        if(src.isSetSecondaryTradeReportRefID())
            dest.setSecondaryTradeReportRefID(src.getSecondaryTradeReportRefID().getValue());

        if(src.isSetTrdRptStatus())
            dest.setTrdRptStatus(src.getTrdRptStatus().getValue());

        if(src.isSetTradeReportRejectReason())
            dest.setTradeReportRejectReason(src.getTradeReportRejectReason().getValue());

        if(src.isSetSecondaryTradeReportID())
            dest.setSecondaryTradeReportID(src.getSecondaryTradeReportID().getValue());

        if(src.isSetSubscriptionRequestType())
            dest.setSubscriptionRequestType(src.getSubscriptionRequestType().getValue()+"");

        if(src.isSetTradeLinkID())
            dest.setTradeLinkID(src.getTradeLinkID().getValue());

        if(src.isSetTrdMatchID())
            dest.setTrdMatchID(src.getTrdMatchID().getValue());

        if(src.isSetExecID())
            dest.setExecID(src.getExecID().getValue());

        if(src.isSetSecondaryExecID())
            dest.setSecondaryExecID(src.getSecondaryExecID().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetResponseTransportType())
            dest.setResponseTransportType(src.getResponseTransportType().getValue());

        if(src.isSetResponseDestination())
            dest.setResponseDestination(src.getResponseDestination().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());

        if(src.isSetClearingFeeIndicator())
            dest.setClearingFeeIndicator(src.getClearingFeeIndicator().getValue());

        if(src.isSetOrderCapacity())
            dest.setOrderCapacity(src.getOrderCapacity().getValue()+"");

        if(src.isSetOrderRestrictions())
            dest.setOrderRestrictions(src.getOrderRestrictions().getValue());

        if(src.isSetCustOrderCapacity())
            dest.setCustOrderCapacity(src.getCustOrderCapacity().getValue());

        if(src.isSetAccount())
            dest.setAccount(src.getAccount().getValue());

        if(src.isSetAcctIDSource())
            dest.setAcctIDSource(src.getAcctIDSource().getValue());

        if(src.isSetAccountType())
            dest.setAccountType(src.getAccountType().getValue());

        if(src.isSetPositionEffect())
            dest.setPositionEffect(src.getPositionEffect().getValue()+"");

        if(src.isSetPreallocMethod())
            dest.setPreallocMethod(src.getPreallocMethod().getValue()+"");


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"
        try {
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setTrdRegTimestamps(cl.bithaus.qfix.translator.component.TrdRegTimestampsTranslator.fromFix(src.getTrdRegTimestamps()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.TradeCaptureReportAck.NoLegs.NoLegsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.LegQty legQty = new cl.bithaus.qfix.fields.LegQty();
            cl.bithaus.qfix.fields.LegSwapType legSwapType = new cl.bithaus.qfix.fields.LegSwapType();
            cl.bithaus.qfix.fields.LegPositionEffect legPositionEffect = new cl.bithaus.qfix.fields.LegPositionEffect();
            cl.bithaus.qfix.fields.LegCoveredOrUncovered legCoveredOrUncovered = new cl.bithaus.qfix.fields.LegCoveredOrUncovered();
            cl.bithaus.qfix.fields.LegRefID legRefID = new cl.bithaus.qfix.fields.LegRefID();
            cl.bithaus.qfix.fields.LegPrice legPrice = new cl.bithaus.qfix.fields.LegPrice();
            cl.bithaus.qfix.fields.LegSettlType legSettlType = new cl.bithaus.qfix.fields.LegSettlType();
            cl.bithaus.qfix.fields.LegSettlDate legSettlDate = new cl.bithaus.qfix.fields.LegSettlDate();
            cl.bithaus.qfix.fields.LegLastPx legLastPx = new cl.bithaus.qfix.fields.LegLastPx();
            cl.bithaus.qfix.fields.TargetLegRefId targetLegRefId = new cl.bithaus.qfix.fields.TargetLegRefId();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.TradeCaptureReportAck.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.TradeCaptureReportAck.NoLegs.NoLegsEntry();

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
                if(g.isSetField(legLastPx)) {
                    legLastPx = (cl.bithaus.qfix.fields.LegLastPx) g.getField(legLastPx);
                    entry.setLegLastPx(legLastPx.getValue());

                }
                if(g.isSetField(targetLegRefId)) {
                    targetLegRefId = (cl.bithaus.qfix.fields.TargetLegRefId) g.getField(targetLegRefId);
                    entry.setTargetLegRefId(targetLegRefId.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoAllocs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoAllocs().getField());
            List<cl.bithaus.fix.TradeCaptureReportAck.NoAllocs.NoAllocsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.AllocAccount allocAccount = new cl.bithaus.qfix.fields.AllocAccount();
            cl.bithaus.qfix.fields.AllocAcctIDSource allocAcctIDSource = new cl.bithaus.qfix.fields.AllocAcctIDSource();
            cl.bithaus.qfix.fields.AllocSettlCurrency allocSettlCurrency = new cl.bithaus.qfix.fields.AllocSettlCurrency();
            cl.bithaus.qfix.fields.IndividualAllocID individualAllocID = new cl.bithaus.qfix.fields.IndividualAllocID();
            cl.bithaus.qfix.fields.AllocQty allocQty = new cl.bithaus.qfix.fields.AllocQty();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.TradeCaptureReportAck.NoAllocs.NoAllocsEntry entry = 
                    new cl.bithaus.fix.TradeCaptureReportAck.NoAllocs.NoAllocsEntry();

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
        return dest;

    }
}

