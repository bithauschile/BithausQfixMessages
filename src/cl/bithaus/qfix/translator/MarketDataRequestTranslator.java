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
public class MarketDataRequestTranslator  {

    public static cl.bithaus.qfix.msg.MarketDataRequest toFix(cl.bithaus.fix.MarketDataRequest src) {

        cl.bithaus.qfix.msg.MarketDataRequest dest = new cl.bithaus.qfix.msg.MarketDataRequest();

        if(src.getMDReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.MDReqID(src.getMDReqID()));
            
        if(src.getSubscriptionRequestType() != null)
            if(src.getSubscriptionRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SubscriptionRequestType(src.getSubscriptionRequestType().charAt(0)));
            
        if(src.getMarketDepth() != null)
            dest.set(new cl.bithaus.qfix.fields.MarketDepth(src.getMarketDepth()));
            
        if(src.getMDUpdateType() != null)
            dest.set(new cl.bithaus.qfix.fields.MDUpdateType(src.getMDUpdateType()));
            
        if(src.getAggregatedBook() != null)
            dest.set(new cl.bithaus.qfix.fields.AggregatedBook(src.getAggregatedBook()));
            
        if(src.getOpenCloseSettlFlag() != null)
            dest.set(new cl.bithaus.qfix.fields.OpenCloseSettlFlag(src.getOpenCloseSettlFlag()));
            
        if(src.getScope() != null)
            dest.set(new cl.bithaus.qfix.fields.Scope(src.getScope()));
            
        if(src.getMDImplicitDelete() != null)
            dest.set(new cl.bithaus.qfix.fields.MDImplicitDelete(src.getMDImplicitDelete()));
            
        if(src.getApplQueueAction() != null)
            dest.set(new cl.bithaus.qfix.fields.ApplQueueAction(src.getApplQueueAction()));
            
        if(src.getApplQueueMax() != null)
            dest.set(new cl.bithaus.qfix.fields.ApplQueueMax(src.getApplQueueMax()));
            
        if(src.getRefOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.RefOrderID(src.getRefOrderID()));
            
        if(src.getRefOrderIDSource() != null)
            if(src.getRefOrderIDSource().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.RefOrderIDSource(src.getRefOrderIDSource().charAt(0)));
            
        if(src.getRefOrderSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.RefOrderSubID(src.getRefOrderSubID()));
            

        if(src.getNoMDEntryTypes() != null && src.getNoMDEntryTypes().size() > 0) {

            for(cl.bithaus.fix.MarketDataRequest.NoMDEntryTypes.NoMDEntryTypesEntry entry : src.getNoMDEntryTypes().getGroups()) {

                cl.bithaus.qfix.msg.MarketDataRequest.NoMDEntryTypes aux = 
                    new cl.bithaus.qfix.msg.MarketDataRequest.NoMDEntryTypes();

                if(entry.getMDEntryType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.MDEntryType(entry.getMDEntryType().charAt(0)));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoRelatedSym() != null && src.getNoRelatedSym().size() > 0) {

            for(cl.bithaus.fix.MarketDataRequest.NoRelatedSym.NoRelatedSymEntry entry : src.getNoRelatedSym().getGroups()) {

                cl.bithaus.qfix.msg.MarketDataRequest.NoRelatedSym aux = 
                    new cl.bithaus.qfix.msg.MarketDataRequest.NoRelatedSym();

                aux.set(new cl.bithaus.qfix.fields.BookingRefID(entry.getBookingRefID()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

