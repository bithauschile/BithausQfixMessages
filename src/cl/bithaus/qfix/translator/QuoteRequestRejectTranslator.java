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
 * Fix - Bithaus format component translator for QuoteRequestReject
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class QuoteRequestRejectTranslator  {

    public static cl.bithaus.qfix.msg.QuoteRequestReject toFix(cl.bithaus.fix.QuoteRequestReject src) {

        cl.bithaus.qfix.msg.QuoteRequestReject dest = new cl.bithaus.qfix.msg.QuoteRequestReject();

        if(src.getQuoteReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteReqID(src.getQuoteReqID()));
        
        if(src.getRFQReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.RFQReqID(src.getRFQReqID()));
        
        if(src.getQuoteRequestRejectReason() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteRequestRejectReason(src.getQuoteRequestRejectReason()));
        
        if(src.getQuotePriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.QuotePriceType(src.getQuotePriceType()));
        
        if(src.getOrdType() != null)
            if(src.getOrdType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.OrdType(src.getOrdType().charAt(0)));
        
        if(src.getExpireTime() != null)
            dest.set(new cl.bithaus.qfix.fields.ExpireTime(src.getExpireTime()));
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.PriceType(src.getPriceType()));
        
        if(src.getPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.Price(src.getPrice()));
        
        if(src.getPrice2() != null)
            dest.set(new cl.bithaus.qfix.fields.Price2(src.getPrice2()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        

        if(src.getSpreadOrBenchmarkCurveData() != null)
            dest.set(cl.bithaus.qfix.translator.component.SpreadOrBenchmarkCurveDataTranslator.toFix(src.getSpreadOrBenchmarkCurveData()));

        if(src.getYieldData() != null)
            dest.set(cl.bithaus.qfix.translator.component.YieldDataTranslator.toFix(src.getYieldData()));

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));


        if(src.getNoRelatedSym() != null && src.getNoRelatedSym().size() > 0) {

            for(cl.bithaus.fix.QuoteRequestReject.NoRelatedSym.NoRelatedSymEntry entry : src.getNoRelatedSym().getGroups()) {

                cl.bithaus.qfix.msg.QuoteRequestReject.NoRelatedSym aux = 
                    new cl.bithaus.qfix.msg.QuoteRequestReject.NoRelatedSym();

                aux.set(new cl.bithaus.qfix.fields.PrevClosePx(entry.getPrevClosePx()));
                aux.set(new cl.bithaus.qfix.fields.QuoteRequestType(entry.getQuoteRequestType()));
                aux.set(new cl.bithaus.qfix.fields.QuoteType(entry.getQuoteType()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));
                aux.set(new cl.bithaus.qfix.fields.TradeOriginationDate(entry.getTradeOriginationDate()));
                if(entry.getSide().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Side(entry.getSide().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.QtyType(entry.getQtyType()));
                if(entry.getSettlType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.SettlType(entry.getSettlType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.SettlDate(entry.getSettlDate()));
                aux.set(new cl.bithaus.qfix.fields.SettlDate2(entry.getSettlDate2()));
                aux.set(new cl.bithaus.qfix.fields.OrderQty2(entry.getOrderQty2()));
                aux.set(new cl.bithaus.qfix.fields.Currency(entry.getCurrency()));
                aux.set(new cl.bithaus.qfix.fields.Account(entry.getAccount()));
                aux.set(new cl.bithaus.qfix.fields.AcctIDSource(entry.getAcctIDSource()));
                aux.set(new cl.bithaus.qfix.fields.AccountType(entry.getAccountType()));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoQuoteQualifiers() != null && src.getNoQuoteQualifiers().size() > 0) {

            for(cl.bithaus.fix.QuoteRequestReject.NoQuoteQualifiers.NoQuoteQualifiersEntry entry : src.getNoQuoteQualifiers().getGroups()) {

                cl.bithaus.qfix.msg.QuoteRequestReject.NoQuoteQualifiers aux = 
                    new cl.bithaus.qfix.msg.QuoteRequestReject.NoQuoteQualifiers();

                if(entry.getQuoteQualifier().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.QuoteQualifier(entry.getQuoteQualifier().charAt(0)));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.QuoteRequestReject fromFix(cl.bithaus.qfix.msg.QuoteRequestReject src) 
        throws FieldNotFound {

        cl.bithaus.fix.QuoteRequestReject dest = new cl.bithaus.fix.QuoteRequestReject();

        if(src.isSetQuoteReqID())
            dest.setQuoteReqID(src.getQuoteReqID().getValue());

        if(src.isSetRFQReqID())
            dest.setRFQReqID(src.getRFQReqID().getValue());

        if(src.isSetQuoteRequestRejectReason())
            dest.setQuoteRequestRejectReason(src.getQuoteRequestRejectReason().getValue());

        if(src.isSetQuotePriceType())
            dest.setQuotePriceType(src.getQuotePriceType().getValue());

        if(src.isSetOrdType())
            dest.setOrdType(src.getOrdType().getValue()+"");

        if(src.isSetExpireTime())
            dest.setExpireTime(src.getExpireTime().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetPriceType())
            dest.setPriceType(src.getPriceType().getValue());

        if(src.isSetPrice())
            dest.setPrice(src.getPrice().getValue());

        if(src.isSetPrice2())
            dest.setPrice2(src.getPrice2().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"
        try {
            dest.setSpreadOrBenchmarkCurveData(cl.bithaus.qfix.translator.component.SpreadOrBenchmarkCurveDataTranslator.fromFix(src.getSpreadOrBenchmarkCurveData()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setYieldData(cl.bithaus.qfix.translator.component.YieldDataTranslator.fromFix(src.getYieldData()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setParties(cl.bithaus.qfix.translator.component.PartiesTranslator.fromFix(src.getParties()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoRelatedSym()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoRelatedSym().getField());
            List<cl.bithaus.fix.QuoteRequestReject.NoRelatedSym.NoRelatedSymEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.PrevClosePx prevClosePx = new cl.bithaus.qfix.fields.PrevClosePx();
            cl.bithaus.qfix.fields.QuoteRequestType quoteRequestType = new cl.bithaus.qfix.fields.QuoteRequestType();
            cl.bithaus.qfix.fields.QuoteType quoteType = new cl.bithaus.qfix.fields.QuoteType();
            cl.bithaus.qfix.fields.TradingSessionID tradingSessionID = new cl.bithaus.qfix.fields.TradingSessionID();
            cl.bithaus.qfix.fields.TradingSessionSubID tradingSessionSubID = new cl.bithaus.qfix.fields.TradingSessionSubID();
            cl.bithaus.qfix.fields.TradeOriginationDate tradeOriginationDate = new cl.bithaus.qfix.fields.TradeOriginationDate();
            cl.bithaus.qfix.fields.Side side = new cl.bithaus.qfix.fields.Side();
            cl.bithaus.qfix.fields.QtyType qtyType = new cl.bithaus.qfix.fields.QtyType();
            cl.bithaus.qfix.fields.SettlType settlType = new cl.bithaus.qfix.fields.SettlType();
            cl.bithaus.qfix.fields.SettlDate settlDate = new cl.bithaus.qfix.fields.SettlDate();
            cl.bithaus.qfix.fields.SettlDate2 settlDate2 = new cl.bithaus.qfix.fields.SettlDate2();
            cl.bithaus.qfix.fields.OrderQty2 orderQty2 = new cl.bithaus.qfix.fields.OrderQty2();
            cl.bithaus.qfix.fields.Currency currency = new cl.bithaus.qfix.fields.Currency();
            cl.bithaus.qfix.fields.Account account = new cl.bithaus.qfix.fields.Account();
            cl.bithaus.qfix.fields.AcctIDSource acctIDSource = new cl.bithaus.qfix.fields.AcctIDSource();
            cl.bithaus.qfix.fields.AccountType accountType = new cl.bithaus.qfix.fields.AccountType();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.QuoteRequestReject.NoRelatedSym.NoRelatedSymEntry entry = 
                    new cl.bithaus.fix.QuoteRequestReject.NoRelatedSym.NoRelatedSymEntry();

                if(g.isSetField(prevClosePx)) {
                    prevClosePx = (cl.bithaus.qfix.fields.PrevClosePx) g.getField(prevClosePx);
                    entry.setPrevClosePx(prevClosePx.getValue());

                }
                if(g.isSetField(quoteRequestType)) {
                    quoteRequestType = (cl.bithaus.qfix.fields.QuoteRequestType) g.getField(quoteRequestType);
                    entry.setQuoteRequestType(quoteRequestType.getValue());

                }
                if(g.isSetField(quoteType)) {
                    quoteType = (cl.bithaus.qfix.fields.QuoteType) g.getField(quoteType);
                    entry.setQuoteType(quoteType.getValue());

                }
                if(g.isSetField(tradingSessionID)) {
                    tradingSessionID = (cl.bithaus.qfix.fields.TradingSessionID) g.getField(tradingSessionID);
                    entry.setTradingSessionID(tradingSessionID.getValue());

                }
                if(g.isSetField(tradingSessionSubID)) {
                    tradingSessionSubID = (cl.bithaus.qfix.fields.TradingSessionSubID) g.getField(tradingSessionSubID);
                    entry.setTradingSessionSubID(tradingSessionSubID.getValue());

                }
                if(g.isSetField(tradeOriginationDate)) {
                    tradeOriginationDate = (cl.bithaus.qfix.fields.TradeOriginationDate) g.getField(tradeOriginationDate);
                    entry.setTradeOriginationDate(tradeOriginationDate.getValue());

                }
                if(g.isSetField(side)) {
                    side = (cl.bithaus.qfix.fields.Side) g.getField(side);
                    entry.setSide(side.getValue()+"");
                }
                if(g.isSetField(qtyType)) {
                    qtyType = (cl.bithaus.qfix.fields.QtyType) g.getField(qtyType);
                    entry.setQtyType(qtyType.getValue());

                }
                if(g.isSetField(settlType)) {
                    settlType = (cl.bithaus.qfix.fields.SettlType) g.getField(settlType);
                    entry.setSettlType(settlType.getValue()+"");
                }
                if(g.isSetField(settlDate)) {
                    settlDate = (cl.bithaus.qfix.fields.SettlDate) g.getField(settlDate);
                    entry.setSettlDate(settlDate.getValue());

                }
                if(g.isSetField(settlDate2)) {
                    settlDate2 = (cl.bithaus.qfix.fields.SettlDate2) g.getField(settlDate2);
                    entry.setSettlDate2(settlDate2.getValue());

                }
                if(g.isSetField(orderQty2)) {
                    orderQty2 = (cl.bithaus.qfix.fields.OrderQty2) g.getField(orderQty2);
                    entry.setOrderQty2(orderQty2.getValue());

                }
                if(g.isSetField(currency)) {
                    currency = (cl.bithaus.qfix.fields.Currency) g.getField(currency);
                    entry.setCurrency(currency.getValue());

                }
                if(g.isSetField(account)) {
                    account = (cl.bithaus.qfix.fields.Account) g.getField(account);
                    entry.setAccount(account.getValue());

                }
                if(g.isSetField(acctIDSource)) {
                    acctIDSource = (cl.bithaus.qfix.fields.AcctIDSource) g.getField(acctIDSource);
                    entry.setAcctIDSource(acctIDSource.getValue());

                }
                if(g.isSetField(accountType)) {
                    accountType = (cl.bithaus.qfix.fields.AccountType) g.getField(accountType);
                    entry.setAccountType(accountType.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoQuoteQualifiers()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoQuoteQualifiers().getField());
            List<cl.bithaus.fix.QuoteRequestReject.NoQuoteQualifiers.NoQuoteQualifiersEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.QuoteQualifier quoteQualifier = new cl.bithaus.qfix.fields.QuoteQualifier();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.QuoteRequestReject.NoQuoteQualifiers.NoQuoteQualifiersEntry entry = 
                    new cl.bithaus.fix.QuoteRequestReject.NoQuoteQualifiers.NoQuoteQualifiersEntry();

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

