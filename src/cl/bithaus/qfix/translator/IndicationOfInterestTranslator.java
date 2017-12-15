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
 * Fix - Bithaus format component translator for IndicationOfInterest
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class IndicationOfInterestTranslator  {

    public static cl.bithaus.qfix.msg.IndicationOfInterest toFix(cl.bithaus.fix.IndicationOfInterest src) {

        cl.bithaus.qfix.msg.IndicationOfInterest dest = new cl.bithaus.qfix.msg.IndicationOfInterest();

        if(src.getIOIid() != null)
            dest.set(new cl.bithaus.qfix.fields.IOIid(src.getIOIid()));
        
        if(src.getIOITransType() != null)
            if(src.getIOITransType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.IOITransType(src.getIOITransType().charAt(0)));
        
        if(src.getIOIRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.IOIRefID(src.getIOIRefID()));
        
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
        
        if(src.getQtyType() != null)
            dest.set(new cl.bithaus.qfix.fields.QtyType(src.getQtyType()));
        
        if(src.getIOIQty() != null)
            dest.set(new cl.bithaus.qfix.fields.IOIQty(src.getIOIQty()));
        
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
        
        if(src.getPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.PriceType(src.getPriceType()));
        
        if(src.getPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.Price(src.getPrice()));
        
        if(src.getValidUntilTime() != null)
            dest.set(new cl.bithaus.qfix.fields.ValidUntilTime(src.getValidUntilTime()));
        
        if(src.getIOIQltyInd() != null)
            if(src.getIOIQltyInd().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.IOIQltyInd(src.getIOIQltyInd().charAt(0)));
        
        if(src.getIOINaturalFlag() != null)
            dest.set(new cl.bithaus.qfix.fields.IOINaturalFlag(src.getIOINaturalFlag()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getURLLink() != null)
            dest.set(new cl.bithaus.qfix.fields.URLLink(src.getURLLink()));
        

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getFinancingDetails() != null)
            dest.set(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.toFix(src.getFinancingDetails()));

        if(src.getOrderQtyData() != null)
            dest.set(cl.bithaus.qfix.translator.component.OrderQtyDataTranslator.toFix(src.getOrderQtyData()));

        if(src.getStipulations() != null)
            dest.set(cl.bithaus.qfix.translator.component.StipulationsTranslator.toFix(src.getStipulations()));

        if(src.getSpreadOrBenchmarkCurveData() != null)
            dest.set(cl.bithaus.qfix.translator.component.SpreadOrBenchmarkCurveDataTranslator.toFix(src.getSpreadOrBenchmarkCurveData()));

        if(src.getYieldData() != null)
            dest.set(cl.bithaus.qfix.translator.component.YieldDataTranslator.toFix(src.getYieldData()));


        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.IndicationOfInterest.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.IndicationOfInterest.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.IndicationOfInterest.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.IndicationOfInterest.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.IndicationOfInterest.NoLegs aux = 
                    new cl.bithaus.qfix.msg.IndicationOfInterest.NoLegs();

                aux.set(new cl.bithaus.qfix.fields.LegIOIQty(entry.getLegIOIQty()));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoIOIQualifiers() != null && src.getNoIOIQualifiers().size() > 0) {

            for(cl.bithaus.fix.IndicationOfInterest.NoIOIQualifiers.NoIOIQualifiersEntry entry : src.getNoIOIQualifiers().getGroups()) {

                cl.bithaus.qfix.msg.IndicationOfInterest.NoIOIQualifiers aux = 
                    new cl.bithaus.qfix.msg.IndicationOfInterest.NoIOIQualifiers();

                if(entry.getIOIQualifier().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.IOIQualifier(entry.getIOIQualifier().charAt(0)));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoRoutingIDs() != null && src.getNoRoutingIDs().size() > 0) {

            for(cl.bithaus.fix.IndicationOfInterest.NoRoutingIDs.NoRoutingIDsEntry entry : src.getNoRoutingIDs().getGroups()) {

                cl.bithaus.qfix.msg.IndicationOfInterest.NoRoutingIDs aux = 
                    new cl.bithaus.qfix.msg.IndicationOfInterest.NoRoutingIDs();

                aux.set(new cl.bithaus.qfix.fields.RoutingType(entry.getRoutingType()));
                aux.set(new cl.bithaus.qfix.fields.RoutingID(entry.getRoutingID()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.IndicationOfInterest fromFix(cl.bithaus.qfix.msg.IndicationOfInterest src) 
        throws FieldNotFound {

        cl.bithaus.fix.IndicationOfInterest dest = new cl.bithaus.fix.IndicationOfInterest();

        if(src.isSetIOIid())
            dest.setIOIid(src.getIOIid().getValue());

        if(src.isSetIOITransType())
            dest.setIOITransType(src.getIOITransType().getValue()+"");

        if(src.isSetIOIRefID())
            dest.setIOIRefID(src.getIOIRefID().getValue());

        if(src.isSetSide())
            dest.setSide(src.getSide().getValue()+"");

        if(src.isSetQtyType())
            dest.setQtyType(src.getQtyType().getValue());

        if(src.isSetIOIQty())
            dest.setIOIQty(src.getIOIQty().getValue());

        if(src.isSetCurrency())
            dest.setCurrency(src.getCurrency().getValue());

        if(src.isSetPriceType())
            dest.setPriceType(src.getPriceType().getValue());

        if(src.isSetPrice())
            dest.setPrice(src.getPrice().getValue());

        if(src.isSetValidUntilTime())
            dest.setValidUntilTime(src.getValidUntilTime().getValue());

        if(src.isSetIOIQltyInd())
            dest.setIOIQltyInd(src.getIOIQltyInd().getValue()+"");

        if(src.isSetIOINaturalFlag())
            dest.setIOINaturalFlag(src.getIOINaturalFlag().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetURLLink())
            dest.setURLLink(src.getURLLink().getValue());


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
            dest.setOrderQtyData(cl.bithaus.qfix.translator.component.OrderQtyDataTranslator.fromFix(src.getOrderQtyData()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setStipulations(cl.bithaus.qfix.translator.component.StipulationsTranslator.fromFix(src.getStipulations()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setSpreadOrBenchmarkCurveData(cl.bithaus.qfix.translator.component.SpreadOrBenchmarkCurveDataTranslator.fromFix(src.getSpreadOrBenchmarkCurveData()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setYieldData(cl.bithaus.qfix.translator.component.YieldDataTranslator.fromFix(src.getYieldData()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.IndicationOfInterest.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.IndicationOfInterest.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.IndicationOfInterest.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.IndicationOfInterest.NoLegs.NoLegsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.LegIOIQty legIOIQty = new cl.bithaus.qfix.fields.LegIOIQty();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.IndicationOfInterest.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.IndicationOfInterest.NoLegs.NoLegsEntry();

                if(g.isSetField(legIOIQty)) {
                    legIOIQty = (cl.bithaus.qfix.fields.LegIOIQty) g.getField(legIOIQty);
                    entry.setLegIOIQty(legIOIQty.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoIOIQualifiers()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoIOIQualifiers().getField());
            List<cl.bithaus.fix.IndicationOfInterest.NoIOIQualifiers.NoIOIQualifiersEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.IOIQualifier iOIQualifier = new cl.bithaus.qfix.fields.IOIQualifier();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.IndicationOfInterest.NoIOIQualifiers.NoIOIQualifiersEntry entry = 
                    new cl.bithaus.fix.IndicationOfInterest.NoIOIQualifiers.NoIOIQualifiersEntry();

                if(g.isSetField(iOIQualifier)) {
                    iOIQualifier = (cl.bithaus.qfix.fields.IOIQualifier) g.getField(iOIQualifier);
                    entry.setIOIQualifier(iOIQualifier.getValue()+"");
                }

                result.add(entry);                
            }

        }
        if(src.isSetNoRoutingIDs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoRoutingIDs().getField());
            List<cl.bithaus.fix.IndicationOfInterest.NoRoutingIDs.NoRoutingIDsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.RoutingType routingType = new cl.bithaus.qfix.fields.RoutingType();
            cl.bithaus.qfix.fields.RoutingID routingID = new cl.bithaus.qfix.fields.RoutingID();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.IndicationOfInterest.NoRoutingIDs.NoRoutingIDsEntry entry = 
                    new cl.bithaus.fix.IndicationOfInterest.NoRoutingIDs.NoRoutingIDsEntry();

                if(g.isSetField(routingType)) {
                    routingType = (cl.bithaus.qfix.fields.RoutingType) g.getField(routingType);
                    entry.setRoutingType(routingType.getValue());

                }
                if(g.isSetField(routingID)) {
                    routingID = (cl.bithaus.qfix.fields.RoutingID) g.getField(routingID);
                    entry.setRoutingID(routingID.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

