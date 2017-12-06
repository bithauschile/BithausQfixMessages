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
 * Fix - Bithaus format component translator for QuoteCancel
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class QuoteCancelTranslator  {

    public static cl.bithaus.qfix.msg.QuoteCancel toFix(cl.bithaus.fix.QuoteCancel src) {

        cl.bithaus.qfix.msg.QuoteCancel dest = new cl.bithaus.qfix.msg.QuoteCancel();

        if(src.getQuoteReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteReqID(src.getQuoteReqID()));
        
        if(src.getQuoteID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteID(src.getQuoteID()));
        
        if(src.getQuoteCancelType() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteCancelType(src.getQuoteCancelType()));
        
        if(src.getQuoteResponseLevel() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteResponseLevel(src.getQuoteResponseLevel()));
        
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
        

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));


        if(src.getNoQuoteEntries() != null && src.getNoQuoteEntries().size() > 0) {

            for(cl.bithaus.fix.QuoteCancel.NoQuoteEntries.NoQuoteEntriesEntry entry : src.getNoQuoteEntries().getGroups()) {

                cl.bithaus.qfix.msg.QuoteCancel.NoQuoteEntries aux = 
                    new cl.bithaus.qfix.msg.QuoteCancel.NoQuoteEntries();


                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.QuoteCancel fromFix(cl.bithaus.qfix.msg.QuoteCancel src) 
        throws FieldNotFound {

        cl.bithaus.fix.QuoteCancel dest = new cl.bithaus.fix.QuoteCancel();

        if(src.isSetQuoteReqID())
            dest.setQuoteReqID(src.getQuoteReqID().getValue());

        if(src.isSetQuoteID())
            dest.setQuoteID(src.getQuoteID().getValue());

        if(src.isSetQuoteCancelType())
            dest.setQuoteCancelType(src.getQuoteCancelType().getValue());

        if(src.isSetQuoteResponseLevel())
            dest.setQuoteResponseLevel(src.getQuoteResponseLevel().getValue());

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


        if(src.getParties() != null)
            dest.setParties(cl.bithaus.qfix.translator.component.PartiesTranslator.fromFix(src.getParties()));



        if(src.isSetNoQuoteEntries()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoQuoteEntries().getField());
            List<cl.bithaus.fix.QuoteCancel.NoQuoteEntries.NoQuoteEntriesEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.QuoteCancel.NoQuoteEntries.NoQuoteEntriesEntry entry = 
                    new cl.bithaus.fix.QuoteCancel.NoQuoteEntries.NoQuoteEntriesEntry();


                result.add(entry);                
            }

        }
        return dest;

    }
}

