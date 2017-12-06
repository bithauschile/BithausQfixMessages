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
public class MassQuoteAcknowledgementTranslator  {

    public static cl.bithaus.qfix.msg.MassQuoteAcknowledgement toFix(cl.bithaus.fix.MassQuoteAcknowledgement src) {

        cl.bithaus.qfix.msg.MassQuoteAcknowledgement dest = new cl.bithaus.qfix.msg.MassQuoteAcknowledgement();

        if(src.getQuoteReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteReqID(src.getQuoteReqID()));
            
        if(src.getQuoteID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteID(src.getQuoteID()));
            
        if(src.getQuoteStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteStatus(src.getQuoteStatus()));
            
        if(src.getQuoteRejectReason() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteRejectReason(src.getQuoteRejectReason()));
            
        if(src.getQuoteResponseLevel() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteResponseLevel(src.getQuoteResponseLevel()));
            
        if(src.getQuoteType() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteType(src.getQuoteType()));
            
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
            
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
            
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            

        if(src.getNoQuoteSets() != null && src.getNoQuoteSets().size() > 0) {

            for(cl.bithaus.fix.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteSetsEntry entry : src.getNoQuoteSets().getGroups()) {

                cl.bithaus.qfix.msg.MassQuoteAcknowledgement.NoQuoteSets aux = 
                    new cl.bithaus.qfix.msg.MassQuoteAcknowledgement.NoQuoteSets();

                aux.set(new cl.bithaus.qfix.fields.QuoteSetID(entry.getQuoteSetID()));
                aux.set(new cl.bithaus.qfix.fields.TotNoQuoteEntries(entry.getTotNoQuoteEntries()));
                aux.set(new cl.bithaus.qfix.fields.LastFragment(entry.getLastFragment()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

