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
 * Fix - Bithaus format component translator for MassQuote
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
        

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));


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

    public static cl.bithaus.fix.MassQuote fromFix(cl.bithaus.qfix.msg.MassQuote src) 
        throws FieldNotFound {

        cl.bithaus.fix.MassQuote dest = new cl.bithaus.fix.MassQuote();

        if(src.isSetQuoteReqID())
            dest.setQuoteReqID(src.getQuoteReqID().getValue());

        if(src.isSetQuoteID())
            dest.setQuoteID(src.getQuoteID().getValue());

        if(src.isSetQuoteType())
            dest.setQuoteType(src.getQuoteType().getValue());

        if(src.isSetQuoteResponseLevel())
            dest.setQuoteResponseLevel(src.getQuoteResponseLevel().getValue());

        if(src.isSetAccount())
            dest.setAccount(src.getAccount().getValue());

        if(src.isSetAcctIDSource())
            dest.setAcctIDSource(src.getAcctIDSource().getValue());

        if(src.isSetAccountType())
            dest.setAccountType(src.getAccountType().getValue());

        if(src.isSetDefBidSize())
            dest.setDefBidSize(src.getDefBidSize().getValue());

        if(src.isSetDefOfferSize())
            dest.setDefOfferSize(src.getDefOfferSize().getValue());


        if(src.getParties() != null)
            dest.setParties(cl.bithaus.qfix.translator.component.PartiesTranslator.fromFix(src.getParties()));



        if(src.isSetNoQuoteSets()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoQuoteSets().getField());
            List<cl.bithaus.fix.MassQuote.NoQuoteSets.NoQuoteSetsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.QuoteSetID quoteSetID = new cl.bithaus.qfix.fields.QuoteSetID();
            cl.bithaus.qfix.fields.QuoteSetValidUntilTime quoteSetValidUntilTime = new cl.bithaus.qfix.fields.QuoteSetValidUntilTime();
            cl.bithaus.qfix.fields.TotNoQuoteEntries totNoQuoteEntries = new cl.bithaus.qfix.fields.TotNoQuoteEntries();
            cl.bithaus.qfix.fields.LastFragment lastFragment = new cl.bithaus.qfix.fields.LastFragment();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.MassQuote.NoQuoteSets.NoQuoteSetsEntry entry = 
                    new cl.bithaus.fix.MassQuote.NoQuoteSets.NoQuoteSetsEntry();

                if(g.isSetField(quoteSetID)) {
                    quoteSetID = (cl.bithaus.qfix.fields.QuoteSetID) g.getField(quoteSetID);
                    entry.setQuoteSetID(quoteSetID.getValue());

                }
                if(g.isSetField(quoteSetValidUntilTime)) {
                    quoteSetValidUntilTime = (cl.bithaus.qfix.fields.QuoteSetValidUntilTime) g.getField(quoteSetValidUntilTime);
                    entry.setQuoteSetValidUntilTime(quoteSetValidUntilTime.getValue());

                }
                if(g.isSetField(totNoQuoteEntries)) {
                    totNoQuoteEntries = (cl.bithaus.qfix.fields.TotNoQuoteEntries) g.getField(totNoQuoteEntries);
                    entry.setTotNoQuoteEntries(totNoQuoteEntries.getValue());

                }
                if(g.isSetField(lastFragment)) {
                    lastFragment = (cl.bithaus.qfix.fields.LastFragment) g.getField(lastFragment);
                    entry.setLastFragment(lastFragment.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

