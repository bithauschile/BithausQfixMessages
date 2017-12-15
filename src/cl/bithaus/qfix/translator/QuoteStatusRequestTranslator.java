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
 * Fix - Bithaus format component translator for QuoteStatusRequest
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class QuoteStatusRequestTranslator  {

    public static cl.bithaus.qfix.msg.QuoteStatusRequest toFix(cl.bithaus.fix.QuoteStatusRequest src) {

        cl.bithaus.qfix.msg.QuoteStatusRequest dest = new cl.bithaus.qfix.msg.QuoteStatusRequest();

        if(src.getQuoteStatusReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteStatusReqID(src.getQuoteStatusReqID()));
        
        if(src.getQuoteID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteID(src.getQuoteID()));
        
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
        
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
        
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
        
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
        
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
        
        if(src.getSubscriptionRequestType() != null)
            if(src.getSubscriptionRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SubscriptionRequestType(src.getSubscriptionRequestType().charAt(0)));
        

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getFinancingDetails() != null)
            dest.set(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.toFix(src.getFinancingDetails()));

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));


        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.QuoteStatusRequest.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.QuoteStatusRequest.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.QuoteStatusRequest.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.QuoteStatusRequest.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.QuoteStatusRequest.NoLegs aux = 
                    new cl.bithaus.qfix.msg.QuoteStatusRequest.NoLegs();


                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.QuoteStatusRequest fromFix(cl.bithaus.qfix.msg.QuoteStatusRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.QuoteStatusRequest dest = new cl.bithaus.fix.QuoteStatusRequest();

        if(src.isSetQuoteStatusReqID())
            dest.setQuoteStatusReqID(src.getQuoteStatusReqID().getValue());

        if(src.isSetQuoteID())
            dest.setQuoteID(src.getQuoteID().getValue());

        if(src.isSetAccount())
            dest.setAccount(src.getAccount().getValue());

        if(src.isSetAcctIDSource())
            dest.setAcctIDSource(src.getAcctIDSource().getValue());

        if(src.isSetAccountType())
            dest.setAccountType(src.getAccountType().getValue());

        if(src.isSetTradingSessionID())
            dest.setTradingSessionID(src.getTradingSessionID().getValue());

        if(src.isSetTradingSessionSubID())
            dest.setTradingSessionSubID(src.getTradingSessionSubID().getValue());

        if(src.isSetSubscriptionRequestType())
            dest.setSubscriptionRequestType(src.getSubscriptionRequestType().getValue()+"");


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"
        try {
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setFinancingDetails(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.fromFix(src.getFinancingDetails()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setParties(cl.bithaus.qfix.translator.component.PartiesTranslator.fromFix(src.getParties()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.QuoteStatusRequest.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.QuoteStatusRequest.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.QuoteStatusRequest.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.QuoteStatusRequest.NoLegs.NoLegsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.QuoteStatusRequest.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.QuoteStatusRequest.NoLegs.NoLegsEntry();


                result.add(entry);                
            }

        }
        return dest;

    }
}

