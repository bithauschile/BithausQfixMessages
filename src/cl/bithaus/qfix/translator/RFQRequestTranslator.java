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
 * Fix - Bithaus format component translator for RFQRequest
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class RFQRequestTranslator  {

    public static cl.bithaus.qfix.msg.RFQRequest toFix(cl.bithaus.fix.RFQRequest src) {

        cl.bithaus.qfix.msg.RFQRequest dest = new cl.bithaus.qfix.msg.RFQRequest();

        if(src.getRFQReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.RFQReqID(src.getRFQReqID()));
        
        if(src.getSubscriptionRequestType() != null)
            if(src.getSubscriptionRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SubscriptionRequestType(src.getSubscriptionRequestType().charAt(0)));
        


        if(src.getNoRelatedSym() != null && src.getNoRelatedSym().size() > 0) {

            for(cl.bithaus.fix.RFQRequest.NoRelatedSym.NoRelatedSymEntry entry : src.getNoRelatedSym().getGroups()) {

                cl.bithaus.qfix.msg.RFQRequest.NoRelatedSym aux = 
                    new cl.bithaus.qfix.msg.RFQRequest.NoRelatedSym();

                aux.set(new cl.bithaus.qfix.fields.PrevClosePx(entry.getPrevClosePx()));
                aux.set(new cl.bithaus.qfix.fields.QuoteRequestType(entry.getQuoteRequestType()));
                aux.set(new cl.bithaus.qfix.fields.QuoteType(entry.getQuoteType()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.RFQRequest fromFix(cl.bithaus.qfix.msg.RFQRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.RFQRequest dest = new cl.bithaus.fix.RFQRequest();

        if(src.isSetRFQReqID())
            dest.setRFQReqID(src.getRFQReqID().getValue());

        if(src.isSetSubscriptionRequestType())
            dest.setSubscriptionRequestType(src.getSubscriptionRequestType().getValue()+"");


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"


        if(src.isSetNoRelatedSym()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoRelatedSym().getField());
            List<cl.bithaus.fix.RFQRequest.NoRelatedSym.NoRelatedSymEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.PrevClosePx prevClosePx = new cl.bithaus.qfix.fields.PrevClosePx();
            cl.bithaus.qfix.fields.QuoteRequestType quoteRequestType = new cl.bithaus.qfix.fields.QuoteRequestType();
            cl.bithaus.qfix.fields.QuoteType quoteType = new cl.bithaus.qfix.fields.QuoteType();
            cl.bithaus.qfix.fields.TradingSessionID tradingSessionID = new cl.bithaus.qfix.fields.TradingSessionID();
            cl.bithaus.qfix.fields.TradingSessionSubID tradingSessionSubID = new cl.bithaus.qfix.fields.TradingSessionSubID();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.RFQRequest.NoRelatedSym.NoRelatedSymEntry entry = 
                    new cl.bithaus.fix.RFQRequest.NoRelatedSym.NoRelatedSymEntry();

                if(g.isSetField(prevClosePx)) {
                    prevClosePx = (cl.bithaus.qfix.fields.PrevClosePx) g.getField(prevClosePx);
                    entry.setPrevClosePx(prevClosePx.getValue());

                }
                if(g.isSetField(quoteRequestType)) {
                    quoteRequestType = (cl.bithaus.qfix.fields.QuoteRequestType) g.getField(quoteRequestType);
                    entry.setQuoteRequestType(quoteRequestType.getValue());

                }
                if(g.isSetField(quoteType)) {
                    quoteType = (cl.bithaus.qfix.fields.QuoteType) g.getField(quoteType);
                    entry.setQuoteType(quoteType.getValue());

                }
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
        return dest;

    }
}

