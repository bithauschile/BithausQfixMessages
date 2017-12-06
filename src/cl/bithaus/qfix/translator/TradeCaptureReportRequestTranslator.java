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
public class TradeCaptureReportRequestTranslator  {

    public static cl.bithaus.qfix.msg.TradeCaptureReportRequest toFix(cl.bithaus.fix.TradeCaptureReportRequest src) {

        cl.bithaus.qfix.msg.TradeCaptureReportRequest dest = new cl.bithaus.qfix.msg.TradeCaptureReportRequest();

        if(src.getTradeRequestID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeRequestID(src.getTradeRequestID()));
            
        if(src.getTradeRequestType() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeRequestType(src.getTradeRequestType()));
            
        if(src.getSubscriptionRequestType() != null)
            if(src.getSubscriptionRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SubscriptionRequestType(src.getSubscriptionRequestType().charAt(0)));
            
        if(src.getTradeReportID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeReportID(src.getTradeReportID()));
            
        if(src.getSecondaryTradeReportID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryTradeReportID(src.getSecondaryTradeReportID()));
            
        if(src.getExecID() != null)
            dest.set(new cl.bithaus.qfix.fields.ExecID(src.getExecID()));
            
        if(src.getExecType() != null)
            if(src.getExecType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.ExecType(src.getExecType().charAt(0)));
            
        if(src.getOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderID(src.getOrderID()));
            
        if(src.getClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdID(src.getClOrdID()));
            
        if(src.getMatchStatus() != null)
            if(src.getMatchStatus().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.MatchStatus(src.getMatchStatus().charAt(0)));
            
        if(src.getTrdType() != null)
            dest.set(new cl.bithaus.qfix.fields.TrdType(src.getTrdType()));
            
        if(src.getTrdSubType() != null)
            dest.set(new cl.bithaus.qfix.fields.TrdSubType(src.getTrdSubType()));
            
        if(src.getTransferReason() != null)
            dest.set(new cl.bithaus.qfix.fields.TransferReason(src.getTransferReason()));
            
        if(src.getSecondaryTrdType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryTrdType(src.getSecondaryTrdType()));
            
        if(src.getTradeLinkID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeLinkID(src.getTradeLinkID()));
            
        if(src.getTrdMatchID() != null)
            dest.set(new cl.bithaus.qfix.fields.TrdMatchID(src.getTrdMatchID()));
            
        if(src.getClearingBusinessDate() != null)
            dest.set(new cl.bithaus.qfix.fields.ClearingBusinessDate(src.getClearingBusinessDate()));
            
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
            
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
            
        if(src.getTimeBracket() != null)
            dest.set(new cl.bithaus.qfix.fields.TimeBracket(src.getTimeBracket()));
            
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
            
        if(src.getMultiLegReportingType() != null)
            if(src.getMultiLegReportingType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.MultiLegReportingType(src.getMultiLegReportingType().charAt(0)));
            
        if(src.getTradeInputSource() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeInputSource(src.getTradeInputSource()));
            
        if(src.getTradeInputDevice() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeInputDevice(src.getTradeInputDevice()));
            
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
            

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.TradeCaptureReportRequest.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.TradeCaptureReportRequest.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.TradeCaptureReportRequest.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.TradeCaptureReportRequest.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.TradeCaptureReportRequest.NoLegs aux = 
                    new cl.bithaus.qfix.msg.TradeCaptureReportRequest.NoLegs();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoDates() != null && src.getNoDates().size() > 0) {

            for(cl.bithaus.fix.TradeCaptureReportRequest.NoDates.NoDatesEntry entry : src.getNoDates().getGroups()) {

                cl.bithaus.qfix.msg.TradeCaptureReportRequest.NoDates aux = 
                    new cl.bithaus.qfix.msg.TradeCaptureReportRequest.NoDates();

                aux.set(new cl.bithaus.qfix.fields.TradeDate(entry.getTradeDate()));
                aux.set(new cl.bithaus.qfix.fields.TransactTime(entry.getTransactTime()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

