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
 * Fix - Bithaus format component translator for MarketDataRequest
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
        

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));


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

    public static cl.bithaus.fix.MarketDataRequest fromFix(cl.bithaus.qfix.msg.MarketDataRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.MarketDataRequest dest = new cl.bithaus.fix.MarketDataRequest();

        if(src.isSetMDReqID())
            dest.setMDReqID(src.getMDReqID().getValue());

        if(src.isSetSubscriptionRequestType())
            dest.setSubscriptionRequestType(src.getSubscriptionRequestType().getValue()+"");

        if(src.isSetMarketDepth())
            dest.setMarketDepth(src.getMarketDepth().getValue());

        if(src.isSetMDUpdateType())
            dest.setMDUpdateType(src.getMDUpdateType().getValue());

        if(src.isSetAggregatedBook())
            dest.setAggregatedBook(src.getAggregatedBook().getValue());

        if(src.isSetOpenCloseSettlFlag())
            dest.setOpenCloseSettlFlag(src.getOpenCloseSettlFlag().getValue());

        if(src.isSetScope())
            dest.setScope(src.getScope().getValue());

        if(src.isSetMDImplicitDelete())
            dest.setMDImplicitDelete(src.getMDImplicitDelete().getValue());

        if(src.isSetApplQueueAction())
            dest.setApplQueueAction(src.getApplQueueAction().getValue());

        if(src.isSetApplQueueMax())
            dest.setApplQueueMax(src.getApplQueueMax().getValue());

        if(src.isSetRefOrderID())
            dest.setRefOrderID(src.getRefOrderID().getValue());

        if(src.isSetRefOrderIDSource())
            dest.setRefOrderIDSource(src.getRefOrderIDSource().getValue()+"");

        if(src.isSetRefOrderSubID())
            dest.setRefOrderSubID(src.getRefOrderSubID().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"
        try {
            dest.setParties(cl.bithaus.qfix.translator.component.PartiesTranslator.fromFix(src.getParties()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoMDEntryTypes()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoMDEntryTypes().getField());
            List<cl.bithaus.fix.MarketDataRequest.NoMDEntryTypes.NoMDEntryTypesEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.MDEntryType mDEntryType = new cl.bithaus.qfix.fields.MDEntryType();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.MarketDataRequest.NoMDEntryTypes.NoMDEntryTypesEntry entry = 
                    new cl.bithaus.fix.MarketDataRequest.NoMDEntryTypes.NoMDEntryTypesEntry();

                if(g.isSetField(mDEntryType)) {
                    mDEntryType = (cl.bithaus.qfix.fields.MDEntryType) g.getField(mDEntryType);
                    entry.setMDEntryType(mDEntryType.getValue()+"");
                }

                result.add(entry);                
            }

        }
        if(src.isSetNoRelatedSym()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoRelatedSym().getField());
            List<cl.bithaus.fix.MarketDataRequest.NoRelatedSym.NoRelatedSymEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.BookingRefID bookingRefID = new cl.bithaus.qfix.fields.BookingRefID();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.MarketDataRequest.NoRelatedSym.NoRelatedSymEntry entry = 
                    new cl.bithaus.fix.MarketDataRequest.NoRelatedSym.NoRelatedSymEntry();

                if(g.isSetField(bookingRefID)) {
                    bookingRefID = (cl.bithaus.qfix.fields.BookingRefID) g.getField(bookingRefID);
                    entry.setBookingRefID(bookingRefID.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

