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
            

        if(src.getNoQuoteEntries() != null && src.getNoQuoteEntries().size() > 0) {

            for(cl.bithaus.fix.QuoteCancel.NoQuoteEntries.NoQuoteEntriesEntry entry : src.getNoQuoteEntries().getGroups()) {

                cl.bithaus.qfix.msg.QuoteCancel.NoQuoteEntries aux = 
                    new cl.bithaus.qfix.msg.QuoteCancel.NoQuoteEntries();


                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

