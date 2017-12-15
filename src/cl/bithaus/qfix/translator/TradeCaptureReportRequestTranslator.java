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
 * Fix - Bithaus format component translator for TradeCaptureReportRequest
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
        

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getInstrumentExtension() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentExtensionTranslator.toFix(src.getInstrumentExtension()));

        if(src.getFinancingDetails() != null)
            dest.set(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.toFix(src.getFinancingDetails()));


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

    public static cl.bithaus.fix.TradeCaptureReportRequest fromFix(cl.bithaus.qfix.msg.TradeCaptureReportRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.TradeCaptureReportRequest dest = new cl.bithaus.fix.TradeCaptureReportRequest();

        if(src.isSetTradeRequestID())
            dest.setTradeRequestID(src.getTradeRequestID().getValue());

        if(src.isSetTradeRequestType())
            dest.setTradeRequestType(src.getTradeRequestType().getValue());

        if(src.isSetSubscriptionRequestType())
            dest.setSubscriptionRequestType(src.getSubscriptionRequestType().getValue()+"");

        if(src.isSetTradeReportID())
            dest.setTradeReportID(src.getTradeReportID().getValue());

        if(src.isSetSecondaryTradeReportID())
            dest.setSecondaryTradeReportID(src.getSecondaryTradeReportID().getValue());

        if(src.isSetExecID())
            dest.setExecID(src.getExecID().getValue());

        if(src.isSetExecType())
            dest.setExecType(src.getExecType().getValue()+"");

        if(src.isSetOrderID())
            dest.setOrderID(src.getOrderID().getValue());

        if(src.isSetClOrdID())
            dest.setClOrdID(src.getClOrdID().getValue());

        if(src.isSetMatchStatus())
            dest.setMatchStatus(src.getMatchStatus().getValue()+"");

        if(src.isSetTrdType())
            dest.setTrdType(src.getTrdType().getValue());

        if(src.isSetTrdSubType())
            dest.setTrdSubType(src.getTrdSubType().getValue());

        if(src.isSetTransferReason())
            dest.setTransferReason(src.getTransferReason().getValue());

        if(src.isSetSecondaryTrdType())
            dest.setSecondaryTrdType(src.getSecondaryTrdType().getValue());

        if(src.isSetTradeLinkID())
            dest.setTradeLinkID(src.getTradeLinkID().getValue());

        if(src.isSetTrdMatchID())
            dest.setTrdMatchID(src.getTrdMatchID().getValue());

        if(src.isSetClearingBusinessDate())
            dest.setClearingBusinessDate(src.getClearingBusinessDate().getValue());

        if(src.isSetTradingSessionID())
            dest.setTradingSessionID(src.getTradingSessionID().getValue());

        if(src.isSetTradingSessionSubID())
            dest.setTradingSessionSubID(src.getTradingSessionSubID().getValue());

        if(src.isSetTimeBracket())
            dest.setTimeBracket(src.getTimeBracket().getValue());

        if(src.isSetSide())
            dest.setSide(src.getSide().getValue()+"");

        if(src.isSetMultiLegReportingType())
            dest.setMultiLegReportingType(src.getMultiLegReportingType().getValue()+"");

        if(src.isSetTradeInputSource())
            dest.setTradeInputSource(src.getTradeInputSource().getValue());

        if(src.isSetTradeInputDevice())
            dest.setTradeInputDevice(src.getTradeInputDevice().getValue());

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
            dest.setInstrumentExtension(cl.bithaus.qfix.translator.component.InstrumentExtensionTranslator.fromFix(src.getInstrumentExtension()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setFinancingDetails(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.fromFix(src.getFinancingDetails()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.TradeCaptureReportRequest.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.TradeCaptureReportRequest.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.TradeCaptureReportRequest.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.TradeCaptureReportRequest.NoLegs.NoLegsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.TradeCaptureReportRequest.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.TradeCaptureReportRequest.NoLegs.NoLegsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoDates()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoDates().getField());
            List<cl.bithaus.fix.TradeCaptureReportRequest.NoDates.NoDatesEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.TradeDate tradeDate = new cl.bithaus.qfix.fields.TradeDate();
            cl.bithaus.qfix.fields.TransactTime transactTime = new cl.bithaus.qfix.fields.TransactTime();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.TradeCaptureReportRequest.NoDates.NoDatesEntry entry = 
                    new cl.bithaus.fix.TradeCaptureReportRequest.NoDates.NoDatesEntry();

                if(g.isSetField(tradeDate)) {
                    tradeDate = (cl.bithaus.qfix.fields.TradeDate) g.getField(tradeDate);
                    entry.setTradeDate(tradeDate.getValue());

                }
                if(g.isSetField(transactTime)) {
                    transactTime = (cl.bithaus.qfix.fields.TransactTime) g.getField(transactTime);
                    entry.setTransactTime(transactTime.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

