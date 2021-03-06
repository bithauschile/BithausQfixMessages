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
 * Fix - Bithaus format component translator for CollateralInquiryAck
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class CollateralInquiryAckTranslator  {

    public static cl.bithaus.qfix.msg.CollateralInquiryAck toFix(cl.bithaus.fix.CollateralInquiryAck src) {

        cl.bithaus.qfix.msg.CollateralInquiryAck dest = new cl.bithaus.qfix.msg.CollateralInquiryAck();

        if(src.getCollInquiryID() != null)
            dest.set(new cl.bithaus.qfix.fields.CollInquiryID(src.getCollInquiryID()));
        
        if(src.getCollInquiryStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.CollInquiryStatus(src.getCollInquiryStatus()));
        
        if(src.getCollInquiryResult() != null)
            dest.set(new cl.bithaus.qfix.fields.CollInquiryResult(src.getCollInquiryResult()));
        
        if(src.getTotNumReports() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNumReports(src.getTotNumReports()));
        
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
        
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
        
        if(src.getClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdID(src.getClOrdID()));
        
        if(src.getOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderID(src.getOrderID()));
        
        if(src.getSecondaryOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryOrderID(src.getSecondaryOrderID()));
        
        if(src.getSecondaryClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(src.getSecondaryClOrdID()));
        
        if(src.getSettlDate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlDate(src.getSettlDate()));
        
        if(src.getQuantity() != null)
            dest.set(new cl.bithaus.qfix.fields.Quantity(src.getQuantity()));
        
        if(src.getQtyType() != null)
            dest.set(new cl.bithaus.qfix.fields.QtyType(src.getQtyType()));
        
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
        
        if(src.getNoLegs() != null)
            dest.set(new cl.bithaus.qfix.fields.NoLegs(src.getNoLegs()));
        
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
        
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
        
        if(src.getSettlSessID() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlSessID(src.getSettlSessID()));
        
        if(src.getSettlSessSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlSessSubID(src.getSettlSessSubID()));
        
        if(src.getClearingBusinessDate() != null)
            dest.set(new cl.bithaus.qfix.fields.ClearingBusinessDate(src.getClearingBusinessDate()));
        
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

        if(src.getFinancingDetails() != null)
            dest.set(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.toFix(src.getFinancingDetails()));

        if(src.getInstrumentLeg() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentLegTranslator.toFix(src.getInstrumentLeg()));


        if(src.getNoCollInquiryQualifier() != null && src.getNoCollInquiryQualifier().size() > 0) {

            for(cl.bithaus.fix.CollateralInquiryAck.NoCollInquiryQualifier.NoCollInquiryQualifierEntry entry : src.getNoCollInquiryQualifier().getGroups()) {

                cl.bithaus.qfix.msg.CollateralInquiryAck.NoCollInquiryQualifier aux = 
                    new cl.bithaus.qfix.msg.CollateralInquiryAck.NoCollInquiryQualifier();

                aux.set(new cl.bithaus.qfix.fields.CollInquiryQualifier(entry.getCollInquiryQualifier()));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoExecs() != null && src.getNoExecs().size() > 0) {

            for(cl.bithaus.fix.CollateralInquiryAck.NoExecs.NoExecsEntry entry : src.getNoExecs().getGroups()) {

                cl.bithaus.qfix.msg.CollateralInquiryAck.NoExecs aux = 
                    new cl.bithaus.qfix.msg.CollateralInquiryAck.NoExecs();

                aux.set(new cl.bithaus.qfix.fields.ExecID(entry.getExecID()));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoTrades() != null && src.getNoTrades().size() > 0) {

            for(cl.bithaus.fix.CollateralInquiryAck.NoTrades.NoTradesEntry entry : src.getNoTrades().getGroups()) {

                cl.bithaus.qfix.msg.CollateralInquiryAck.NoTrades aux = 
                    new cl.bithaus.qfix.msg.CollateralInquiryAck.NoTrades();

                aux.set(new cl.bithaus.qfix.fields.TradeReportID(entry.getTradeReportID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryTradeReportID(entry.getSecondaryTradeReportID()));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.CollateralInquiryAck.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.CollateralInquiryAck.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.CollateralInquiryAck.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.CollateralInquiryAck fromFix(cl.bithaus.qfix.msg.CollateralInquiryAck src) 
        throws FieldNotFound {

        cl.bithaus.fix.CollateralInquiryAck dest = new cl.bithaus.fix.CollateralInquiryAck();

        if(src.isSetCollInquiryID())
            dest.setCollInquiryID(src.getCollInquiryID().getValue());

        if(src.isSetCollInquiryStatus())
            dest.setCollInquiryStatus(src.getCollInquiryStatus().getValue());

        if(src.isSetCollInquiryResult())
            dest.setCollInquiryResult(src.getCollInquiryResult().getValue());

        if(src.isSetTotNumReports())
            dest.setTotNumReports(src.getTotNumReports().getValue());

        if(src.isSetAccount())
            dest.setAccount(src.getAccount().getValue());

        if(src.isSetAccountType())
            dest.setAccountType(src.getAccountType().getValue());

        if(src.isSetClOrdID())
            dest.setClOrdID(src.getClOrdID().getValue());

        if(src.isSetOrderID())
            dest.setOrderID(src.getOrderID().getValue());

        if(src.isSetSecondaryOrderID())
            dest.setSecondaryOrderID(src.getSecondaryOrderID().getValue());

        if(src.isSetSecondaryClOrdID())
            dest.setSecondaryClOrdID(src.getSecondaryClOrdID().getValue());

        if(src.isSetSettlDate())
            dest.setSettlDate(src.getSettlDate().getValue());

        if(src.isSetQuantity())
            dest.setQuantity(src.getQuantity().getValue());

        if(src.isSetQtyType())
            dest.setQtyType(src.getQtyType().getValue());

        if(src.isSetCurrency())
            dest.setCurrency(src.getCurrency().getValue());

        if(src.isSetNoLegs())
            dest.setNoLegs(src.getNoLegs().getValue());

        if(src.isSetTradingSessionID())
            dest.setTradingSessionID(src.getTradingSessionID().getValue());

        if(src.isSetTradingSessionSubID())
            dest.setTradingSessionSubID(src.getTradingSessionSubID().getValue());

        if(src.isSetSettlSessID())
            dest.setSettlSessID(src.getSettlSessID().getValue());

        if(src.isSetSettlSessSubID())
            dest.setSettlSessSubID(src.getSettlSessSubID().getValue());

        if(src.isSetClearingBusinessDate())
            dest.setClearingBusinessDate(src.getClearingBusinessDate().getValue());

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
            dest.setFinancingDetails(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.fromFix(src.getFinancingDetails()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setInstrumentLeg(cl.bithaus.qfix.translator.component.InstrumentLegTranslator.fromFix(src.getInstrumentLeg()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoCollInquiryQualifier()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoCollInquiryQualifier().getField());
            List<cl.bithaus.fix.CollateralInquiryAck.NoCollInquiryQualifier.NoCollInquiryQualifierEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.CollInquiryQualifier collInquiryQualifier = new cl.bithaus.qfix.fields.CollInquiryQualifier();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.CollateralInquiryAck.NoCollInquiryQualifier.NoCollInquiryQualifierEntry entry = 
                    new cl.bithaus.fix.CollateralInquiryAck.NoCollInquiryQualifier.NoCollInquiryQualifierEntry();

                if(g.isSetField(collInquiryQualifier)) {
                    collInquiryQualifier = (cl.bithaus.qfix.fields.CollInquiryQualifier) g.getField(collInquiryQualifier);
                    entry.setCollInquiryQualifier(collInquiryQualifier.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoExecs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoExecs().getField());
            List<cl.bithaus.fix.CollateralInquiryAck.NoExecs.NoExecsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.ExecID execID = new cl.bithaus.qfix.fields.ExecID();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.CollateralInquiryAck.NoExecs.NoExecsEntry entry = 
                    new cl.bithaus.fix.CollateralInquiryAck.NoExecs.NoExecsEntry();

                if(g.isSetField(execID)) {
                    execID = (cl.bithaus.qfix.fields.ExecID) g.getField(execID);
                    entry.setExecID(execID.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoTrades()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoTrades().getField());
            List<cl.bithaus.fix.CollateralInquiryAck.NoTrades.NoTradesEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.TradeReportID tradeReportID = new cl.bithaus.qfix.fields.TradeReportID();
            cl.bithaus.qfix.fields.SecondaryTradeReportID secondaryTradeReportID = new cl.bithaus.qfix.fields.SecondaryTradeReportID();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.CollateralInquiryAck.NoTrades.NoTradesEntry entry = 
                    new cl.bithaus.fix.CollateralInquiryAck.NoTrades.NoTradesEntry();

                if(g.isSetField(tradeReportID)) {
                    tradeReportID = (cl.bithaus.qfix.fields.TradeReportID) g.getField(tradeReportID);
                    entry.setTradeReportID(tradeReportID.getValue());

                }
                if(g.isSetField(secondaryTradeReportID)) {
                    secondaryTradeReportID = (cl.bithaus.qfix.fields.SecondaryTradeReportID) g.getField(secondaryTradeReportID);
                    entry.setSecondaryTradeReportID(secondaryTradeReportID.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.CollateralInquiryAck.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.CollateralInquiryAck.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.CollateralInquiryAck.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        return dest;

    }
}

