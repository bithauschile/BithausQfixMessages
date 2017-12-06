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


}

