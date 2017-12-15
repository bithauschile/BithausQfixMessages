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
 * Fix - Bithaus format component translator for MassQuoteAcknowledgement
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
        

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));


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

    public static cl.bithaus.fix.MassQuoteAcknowledgement fromFix(cl.bithaus.qfix.msg.MassQuoteAcknowledgement src) 
        throws FieldNotFound {

        cl.bithaus.fix.MassQuoteAcknowledgement dest = new cl.bithaus.fix.MassQuoteAcknowledgement();

        if(src.isSetQuoteReqID())
            dest.setQuoteReqID(src.getQuoteReqID().getValue());

        if(src.isSetQuoteID())
            dest.setQuoteID(src.getQuoteID().getValue());

        if(src.isSetQuoteStatus())
            dest.setQuoteStatus(src.getQuoteStatus().getValue());

        if(src.isSetQuoteRejectReason())
            dest.setQuoteRejectReason(src.getQuoteRejectReason().getValue());

        if(src.isSetQuoteResponseLevel())
            dest.setQuoteResponseLevel(src.getQuoteResponseLevel().getValue());

        if(src.isSetQuoteType())
            dest.setQuoteType(src.getQuoteType().getValue());

        if(src.isSetAccount())
            dest.setAccount(src.getAccount().getValue());

        if(src.isSetAcctIDSource())
            dest.setAcctIDSource(src.getAcctIDSource().getValue());

        if(src.isSetAccountType())
            dest.setAccountType(src.getAccountType().getValue());

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


        if(src.isSetNoQuoteSets()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoQuoteSets().getField());
            List<cl.bithaus.fix.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteSetsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.QuoteSetID quoteSetID = new cl.bithaus.qfix.fields.QuoteSetID();
            cl.bithaus.qfix.fields.TotNoQuoteEntries totNoQuoteEntries = new cl.bithaus.qfix.fields.TotNoQuoteEntries();
            cl.bithaus.qfix.fields.LastFragment lastFragment = new cl.bithaus.qfix.fields.LastFragment();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteSetsEntry entry = 
                    new cl.bithaus.fix.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteSetsEntry();

                if(g.isSetField(quoteSetID)) {
                    quoteSetID = (cl.bithaus.qfix.fields.QuoteSetID) g.getField(quoteSetID);
                    entry.setQuoteSetID(quoteSetID.getValue());

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

