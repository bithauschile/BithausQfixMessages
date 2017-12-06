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
public class MassQuoteTranslator  {

    public static cl.bithaus.qfix.msg.MassQuote toFix(cl.bithaus.fix.MassQuote src) {

        cl.bithaus.qfix.msg.MassQuote dest = new cl.bithaus.qfix.msg.MassQuote();

        if(src.getQuoteReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteReqID(src.getQuoteReqID()));
            
        if(src.getQuoteID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteID(src.getQuoteID()));
            
        if(src.getQuoteType() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteType(src.getQuoteType()));
            
        if(src.getQuoteResponseLevel() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteResponseLevel(src.getQuoteResponseLevel()));
            
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
            
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
            
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
            
        if(src.getDefBidSize() != null)
            dest.set(new cl.bithaus.qfix.fields.DefBidSize(src.getDefBidSize()));
            
        if(src.getDefOfferSize() != null)
            dest.set(new cl.bithaus.qfix.fields.DefOfferSize(src.getDefOfferSize()));
            

        if(src.getNoQuoteSets() != null && src.getNoQuoteSets().size() > 0) {

            for(cl.bithaus.fix.MassQuote.NoQuoteSets.NoQuoteSetsEntry entry : src.getNoQuoteSets().getGroups()) {

                cl.bithaus.qfix.msg.MassQuote.NoQuoteSets aux = 
                    new cl.bithaus.qfix.msg.MassQuote.NoQuoteSets();

                aux.set(new cl.bithaus.qfix.fields.QuoteSetID(entry.getQuoteSetID()));
                aux.set(new cl.bithaus.qfix.fields.QuoteSetValidUntilTime(entry.getQuoteSetValidUntilTime()));
                aux.set(new cl.bithaus.qfix.fields.TotNoQuoteEntries(entry.getTotNoQuoteEntries()));
                aux.set(new cl.bithaus.qfix.fields.LastFragment(entry.getLastFragment()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

