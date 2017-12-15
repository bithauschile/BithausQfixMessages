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
 * Fix - Bithaus format component translator for TradeCaptureReportRequestAck
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class TradeCaptureReportRequestAckTranslator  {

    public static cl.bithaus.qfix.msg.TradeCaptureReportRequestAck toFix(cl.bithaus.fix.TradeCaptureReportRequestAck src) {

        cl.bithaus.qfix.msg.TradeCaptureReportRequestAck dest = new cl.bithaus.qfix.msg.TradeCaptureReportRequestAck();

        if(src.getTradeRequestID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeRequestID(src.getTradeRequestID()));
        
        if(src.getTradeRequestType() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeRequestType(src.getTradeRequestType()));
        
        if(src.getSubscriptionRequestType() != null)
            if(src.getSubscriptionRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SubscriptionRequestType(src.getSubscriptionRequestType().charAt(0)));
        
        if(src.getTotNumTradeReports() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNumTradeReports(src.getTotNumTradeReports()));
        
        if(src.getTradeRequestResult() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeRequestResult(src.getTradeRequestResult()));
        
        if(src.getTradeRequestStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeRequestStatus(src.getTradeRequestStatus()));
        
        if(src.getMultiLegReportingType() != null)
            if(src.getMultiLegReportingType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.MultiLegReportingType(src.getMultiLegReportingType().charAt(0)));
        
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
        

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));


        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.TradeCaptureReportRequestAck.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.TradeCaptureReportRequestAck.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.TradeCaptureReportRequestAck.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.TradeCaptureReportRequestAck.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.TradeCaptureReportRequestAck.NoLegs aux = 
                    new cl.bithaus.qfix.msg.TradeCaptureReportRequestAck.NoLegs();


                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.TradeCaptureReportRequestAck fromFix(cl.bithaus.qfix.msg.TradeCaptureReportRequestAck src) 
        throws FieldNotFound {

        cl.bithaus.fix.TradeCaptureReportRequestAck dest = new cl.bithaus.fix.TradeCaptureReportRequestAck();

        if(src.isSetTradeRequestID())
            dest.setTradeRequestID(src.getTradeRequestID().getValue());

        if(src.isSetTradeRequestType())
            dest.setTradeRequestType(src.getTradeRequestType().getValue());

        if(src.isSetSubscriptionRequestType())
            dest.setSubscriptionRequestType(src.getSubscriptionRequestType().getValue()+"");

        if(src.isSetTotNumTradeReports())
            dest.setTotNumTradeReports(src.getTotNumTradeReports().getValue());

        if(src.isSetTradeRequestResult())
            dest.setTradeRequestResult(src.getTradeRequestResult().getValue());

        if(src.isSetTradeRequestStatus())
            dest.setTradeRequestStatus(src.getTradeRequestStatus().getValue());

        if(src.isSetMultiLegReportingType())
            dest.setMultiLegReportingType(src.getMultiLegReportingType().getValue()+"");

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
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.TradeCaptureReportRequestAck.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.TradeCaptureReportRequestAck.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.TradeCaptureReportRequestAck.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.TradeCaptureReportRequestAck.NoLegs.NoLegsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.TradeCaptureReportRequestAck.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.TradeCaptureReportRequestAck.NoLegs.NoLegsEntry();


                result.add(entry);                
            }

        }
        return dest;

    }
}

