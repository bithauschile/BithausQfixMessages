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
 * Fix - Bithaus format component translator for QuoteStatusReport
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class QuoteStatusReportTranslator  {

    public static cl.bithaus.qfix.msg.QuoteStatusReport toFix(cl.bithaus.fix.QuoteStatusReport src) {

        cl.bithaus.qfix.msg.QuoteStatusReport dest = new cl.bithaus.qfix.msg.QuoteStatusReport();

        if(src.getQuoteStatusReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteStatusReqID(src.getQuoteStatusReqID()));
        
        if(src.getQuoteReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteReqID(src.getQuoteReqID()));
        
        if(src.getQuoteID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteID(src.getQuoteID()));
        
        if(src.getQuoteRespID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteRespID(src.getQuoteRespID()));
        
        if(src.getQuoteType() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteType(src.getQuoteType()));
        
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
        
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
        
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
        
        if(src.getSettlType() != null)
            if(src.getSettlType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SettlType(src.getSettlType().charAt(0)));
        
        if(src.getSettlDate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlDate(src.getSettlDate()));
        
        if(src.getSettlDate2() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlDate2(src.getSettlDate2()));
        
        if(src.getOrderQty2() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderQty2(src.getOrderQty2()));
        
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
        
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
        
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
        
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
        
        if(src.getExpireTime() != null)
            dest.set(new cl.bithaus.qfix.fields.ExpireTime(src.getExpireTime()));
        
        if(src.getPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.Price(src.getPrice()));
        
        if(src.getPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.PriceType(src.getPriceType()));
        
        if(src.getBidPx() != null)
            dest.set(new cl.bithaus.qfix.fields.BidPx(src.getBidPx()));
        
        if(src.getOfferPx() != null)
            dest.set(new cl.bithaus.qfix.fields.OfferPx(src.getOfferPx()));
        
        if(src.getMktBidPx() != null)
            dest.set(new cl.bithaus.qfix.fields.MktBidPx(src.getMktBidPx()));
        
        if(src.getMktOfferPx() != null)
            dest.set(new cl.bithaus.qfix.fields.MktOfferPx(src.getMktOfferPx()));
        
        if(src.getMinBidSize() != null)
            dest.set(new cl.bithaus.qfix.fields.MinBidSize(src.getMinBidSize()));
        
        if(src.getBidSize() != null)
            dest.set(new cl.bithaus.qfix.fields.BidSize(src.getBidSize()));
        
        if(src.getMinOfferSize() != null)
            dest.set(new cl.bithaus.qfix.fields.MinOfferSize(src.getMinOfferSize()));
        
        if(src.getOfferSize() != null)
            dest.set(new cl.bithaus.qfix.fields.OfferSize(src.getOfferSize()));
        
        if(src.getValidUntilTime() != null)
            dest.set(new cl.bithaus.qfix.fields.ValidUntilTime(src.getValidUntilTime()));
        
        if(src.getBidSpotRate() != null)
            dest.set(new cl.bithaus.qfix.fields.BidSpotRate(src.getBidSpotRate()));
        
        if(src.getOfferSpotRate() != null)
            dest.set(new cl.bithaus.qfix.fields.OfferSpotRate(src.getOfferSpotRate()));
        
        if(src.getBidForwardPoints() != null)
            dest.set(new cl.bithaus.qfix.fields.BidForwardPoints(src.getBidForwardPoints()));
        
        if(src.getOfferForwardPoints() != null)
            dest.set(new cl.bithaus.qfix.fields.OfferForwardPoints(src.getOfferForwardPoints()));
        
        if(src.getMidPx() != null)
            dest.set(new cl.bithaus.qfix.fields.MidPx(src.getMidPx()));
        
        if(src.getBidYield() != null)
            dest.set(new cl.bithaus.qfix.fields.BidYield(src.getBidYield().doubleValue()));
        
        if(src.getMidYield() != null)
            dest.set(new cl.bithaus.qfix.fields.MidYield(src.getMidYield().doubleValue()));
        
        if(src.getOfferYield() != null)
            dest.set(new cl.bithaus.qfix.fields.OfferYield(src.getOfferYield().doubleValue()));
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getOrdType() != null)
            if(src.getOrdType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.OrdType(src.getOrdType().charAt(0)));
        
        if(src.getBidForwardPoints2() != null)
            dest.set(new cl.bithaus.qfix.fields.BidForwardPoints2(src.getBidForwardPoints2()));
        
        if(src.getOfferForwardPoints2() != null)
            dest.set(new cl.bithaus.qfix.fields.OfferForwardPoints2(src.getOfferForwardPoints2()));
        
        if(src.getSettlCurrBidFxRate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlCurrBidFxRate(src.getSettlCurrBidFxRate().floatValue()));
        
        if(src.getSettlCurrOfferFxRate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlCurrOfferFxRate(src.getSettlCurrOfferFxRate().floatValue()));
        
        if(src.getSettlCurrFxRateCalc() != null)
            if(src.getSettlCurrFxRateCalc().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SettlCurrFxRateCalc(src.getSettlCurrFxRateCalc().charAt(0)));
        
        if(src.getCommType() != null)
            if(src.getCommType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.CommType(src.getCommType().charAt(0)));
        
        if(src.getCommission() != null)
            dest.set(new cl.bithaus.qfix.fields.Commission(src.getCommission()));
        
        if(src.getCustOrderCapacity() != null)
            dest.set(new cl.bithaus.qfix.fields.CustOrderCapacity(src.getCustOrderCapacity()));
        
        if(src.getExDestination() != null)
            dest.set(new cl.bithaus.qfix.fields.ExDestination(src.getExDestination()));
        
        if(src.getQuoteStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteStatus(src.getQuoteStatus()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));

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

            for(cl.bithaus.fix.QuoteStatusReport.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.QuoteStatusReport.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.QuoteStatusReport.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.QuoteStatusReport.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.QuoteStatusReport.NoLegs aux = 
                    new cl.bithaus.qfix.msg.QuoteStatusReport.NoLegs();

                aux.set(new cl.bithaus.qfix.fields.LegQty(entry.getLegQty()));
                aux.set(new cl.bithaus.qfix.fields.LegSwapType(entry.getLegSwapType()));
                if(entry.getLegSettlType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.LegSettlType(entry.getLegSettlType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.LegSettlDate(entry.getLegSettlDate()));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoQuoteQualifiers() != null && src.getNoQuoteQualifiers().size() > 0) {

            for(cl.bithaus.fix.QuoteStatusReport.NoQuoteQualifiers.NoQuoteQualifiersEntry entry : src.getNoQuoteQualifiers().getGroups()) {

                cl.bithaus.qfix.msg.QuoteStatusReport.NoQuoteQualifiers aux = 
                    new cl.bithaus.qfix.msg.QuoteStatusReport.NoQuoteQualifiers();

                if(entry.getQuoteQualifier().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.QuoteQualifier(entry.getQuoteQualifier().charAt(0)));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.QuoteStatusReport fromFix(cl.bithaus.qfix.msg.QuoteStatusReport src) 
        throws FieldNotFound {

        cl.bithaus.fix.QuoteStatusReport dest = new cl.bithaus.fix.QuoteStatusReport();

        if(src.isSetQuoteStatusReqID())
            dest.setQuoteStatusReqID(src.getQuoteStatusReqID().getValue());

        if(src.isSetQuoteReqID())
            dest.setQuoteReqID(src.getQuoteReqID().getValue());

        if(src.isSetQuoteID())
            dest.setQuoteID(src.getQuoteID().getValue());

        if(src.isSetQuoteRespID())
            dest.setQuoteRespID(src.getQuoteRespID().getValue());

        if(src.isSetQuoteType())
            dest.setQuoteType(src.getQuoteType().getValue());

        if(src.isSetTradingSessionID())
            dest.setTradingSessionID(src.getTradingSessionID().getValue());

        if(src.isSetTradingSessionSubID())
            dest.setTradingSessionSubID(src.getTradingSessionSubID().getValue());

        if(src.isSetSide())
            dest.setSide(src.getSide().getValue()+"");

        if(src.isSetSettlType())
            dest.setSettlType(src.getSettlType().getValue()+"");

        if(src.isSetSettlDate())
            dest.setSettlDate(src.getSettlDate().getValue());

        if(src.isSetSettlDate2())
            dest.setSettlDate2(src.getSettlDate2().getValue());

        if(src.isSetOrderQty2())
            dest.setOrderQty2(src.getOrderQty2().getValue());

        if(src.isSetCurrency())
            dest.setCurrency(src.getCurrency().getValue());

        if(src.isSetAccount())
            dest.setAccount(src.getAccount().getValue());

        if(src.isSetAcctIDSource())
            dest.setAcctIDSource(src.getAcctIDSource().getValue());

        if(src.isSetAccountType())
            dest.setAccountType(src.getAccountType().getValue());

        if(src.isSetExpireTime())
            dest.setExpireTime(src.getExpireTime().getValue());

        if(src.isSetPrice())
            dest.setPrice(src.getPrice().getValue());

        if(src.isSetPriceType())
            dest.setPriceType(src.getPriceType().getValue());

        if(src.isSetBidPx())
            dest.setBidPx(src.getBidPx().getValue());

        if(src.isSetOfferPx())
            dest.setOfferPx(src.getOfferPx().getValue());

        if(src.isSetMktBidPx())
            dest.setMktBidPx(src.getMktBidPx().getValue());

        if(src.isSetMktOfferPx())
            dest.setMktOfferPx(src.getMktOfferPx().getValue());

        if(src.isSetMinBidSize())
            dest.setMinBidSize(src.getMinBidSize().getValue());

        if(src.isSetBidSize())
            dest.setBidSize(src.getBidSize().getValue());

        if(src.isSetMinOfferSize())
            dest.setMinOfferSize(src.getMinOfferSize().getValue());

        if(src.isSetOfferSize())
            dest.setOfferSize(src.getOfferSize().getValue());

        if(src.isSetValidUntilTime())
            dest.setValidUntilTime(src.getValidUntilTime().getValue());

        if(src.isSetBidSpotRate())
            dest.setBidSpotRate(src.getBidSpotRate().getValue());

        if(src.isSetOfferSpotRate())
            dest.setOfferSpotRate(src.getOfferSpotRate().getValue());

        if(src.isSetBidForwardPoints())
            dest.setBidForwardPoints(src.getBidForwardPoints().getValue());

        if(src.isSetOfferForwardPoints())
            dest.setOfferForwardPoints(src.getOfferForwardPoints().getValue());

        if(src.isSetMidPx())
            dest.setMidPx(src.getMidPx().getValue());

        if(src.isSetBidYield())
            dest.setBidYield(new BigDecimal(src.getBidYield().getValue()));

        if(src.isSetMidYield())
            dest.setMidYield(new BigDecimal(src.getMidYield().getValue()));

        if(src.isSetOfferYield())
            dest.setOfferYield(new BigDecimal(src.getOfferYield().getValue()));

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetOrdType())
            dest.setOrdType(src.getOrdType().getValue()+"");

        if(src.isSetBidForwardPoints2())
            dest.setBidForwardPoints2(src.getBidForwardPoints2().getValue());

        if(src.isSetOfferForwardPoints2())
            dest.setOfferForwardPoints2(src.getOfferForwardPoints2().getValue());

        if(src.isSetSettlCurrBidFxRate())
            dest.setSettlCurrBidFxRate(new BigDecimal(src.getSettlCurrBidFxRate().getValue()));

        if(src.isSetSettlCurrOfferFxRate())
            dest.setSettlCurrOfferFxRate(new BigDecimal(src.getSettlCurrOfferFxRate().getValue()));

        if(src.isSetSettlCurrFxRateCalc())
            dest.setSettlCurrFxRateCalc(src.getSettlCurrFxRateCalc().getValue()+"");

        if(src.isSetCommType())
            dest.setCommType(src.getCommType().getValue()+"");

        if(src.isSetCommission())
            dest.setCommission(src.getCommission().getValue());

        if(src.isSetCustOrderCapacity())
            dest.setCustOrderCapacity(src.getCustOrderCapacity().getValue());

        if(src.isSetExDestination())
            dest.setExDestination(src.getExDestination().getValue());

        if(src.isSetQuoteStatus())
            dest.setQuoteStatus(src.getQuoteStatus().getValue());

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
            List<cl.bithaus.fix.QuoteStatusReport.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.QuoteStatusReport.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.QuoteStatusReport.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.QuoteStatusReport.NoLegs.NoLegsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.LegQty legQty = new cl.bithaus.qfix.fields.LegQty();
            cl.bithaus.qfix.fields.LegSwapType legSwapType = new cl.bithaus.qfix.fields.LegSwapType();
            cl.bithaus.qfix.fields.LegSettlType legSettlType = new cl.bithaus.qfix.fields.LegSettlType();
            cl.bithaus.qfix.fields.LegSettlDate legSettlDate = new cl.bithaus.qfix.fields.LegSettlDate();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.QuoteStatusReport.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.QuoteStatusReport.NoLegs.NoLegsEntry();

                if(g.isSetField(legQty)) {
                    legQty = (cl.bithaus.qfix.fields.LegQty) g.getField(legQty);
                    entry.setLegQty(legQty.getValue());

                }
                if(g.isSetField(legSwapType)) {
                    legSwapType = (cl.bithaus.qfix.fields.LegSwapType) g.getField(legSwapType);
                    entry.setLegSwapType(legSwapType.getValue());

                }
                if(g.isSetField(legSettlType)) {
                    legSettlType = (cl.bithaus.qfix.fields.LegSettlType) g.getField(legSettlType);
                    entry.setLegSettlType(legSettlType.getValue()+"");
                }
                if(g.isSetField(legSettlDate)) {
                    legSettlDate = (cl.bithaus.qfix.fields.LegSettlDate) g.getField(legSettlDate);
                    entry.setLegSettlDate(legSettlDate.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoQuoteQualifiers()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoQuoteQualifiers().getField());
            List<cl.bithaus.fix.QuoteStatusReport.NoQuoteQualifiers.NoQuoteQualifiersEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.QuoteQualifier quoteQualifier = new cl.bithaus.qfix.fields.QuoteQualifier();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.QuoteStatusReport.NoQuoteQualifiers.NoQuoteQualifiersEntry entry = 
                    new cl.bithaus.fix.QuoteStatusReport.NoQuoteQualifiers.NoQuoteQualifiersEntry();

                if(g.isSetField(quoteQualifier)) {
                    quoteQualifier = (cl.bithaus.qfix.fields.QuoteQualifier) g.getField(quoteQualifier);
                    entry.setQuoteQualifier(quoteQualifier.getValue()+"");
                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

