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
 * Fix - Bithaus format component translator for QuoteRequest
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class QuoteRequestTranslator  {

    public static cl.bithaus.qfix.msg.QuoteRequest toFix(cl.bithaus.fix.QuoteRequest src) {

        cl.bithaus.qfix.msg.QuoteRequest dest = new cl.bithaus.qfix.msg.QuoteRequest();

        if(src.getQuoteReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.QuoteReqID(src.getQuoteReqID()));
        
        if(src.getRFQReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.RFQReqID(src.getRFQReqID()));
        
        if(src.getClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdID(src.getClOrdID()));
        
        if(src.getOrderCapacity() != null)
            if(src.getOrderCapacity().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.OrderCapacity(src.getOrderCapacity().charAt(0)));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        


        if(src.getNoRelatedSym() != null && src.getNoRelatedSym().size() > 0) {

            for(cl.bithaus.fix.QuoteRequest.NoRelatedSym.NoRelatedSymEntry entry : src.getNoRelatedSym().getGroups()) {

                cl.bithaus.qfix.msg.QuoteRequest.NoRelatedSym aux = 
                    new cl.bithaus.qfix.msg.QuoteRequest.NoRelatedSym();

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
                aux.set(new cl.bithaus.qfix.fields.QuotePriceType(entry.getQuotePriceType()));
                if(entry.getOrdType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.OrdType(entry.getOrdType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.ValidUntilTime(entry.getValidUntilTime()));
                aux.set(new cl.bithaus.qfix.fields.ExpireTime(entry.getExpireTime()));
                aux.set(new cl.bithaus.qfix.fields.TransactTime(entry.getTransactTime()));
                aux.set(new cl.bithaus.qfix.fields.PriceType(entry.getPriceType()));
                aux.set(new cl.bithaus.qfix.fields.Price(entry.getPrice()));
                aux.set(new cl.bithaus.qfix.fields.Price2(entry.getPrice2()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.QuoteRequest fromFix(cl.bithaus.qfix.msg.QuoteRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.QuoteRequest dest = new cl.bithaus.fix.QuoteRequest();

        if(src.isSetQuoteReqID())
            dest.setQuoteReqID(src.getQuoteReqID().getValue());

        if(src.isSetRFQReqID())
            dest.setRFQReqID(src.getRFQReqID().getValue());

        if(src.isSetClOrdID())
            dest.setClOrdID(src.getClOrdID().getValue());

        if(src.isSetOrderCapacity())
            dest.setOrderCapacity(src.getOrderCapacity().getValue()+"");

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"


        if(src.isSetNoRelatedSym()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoRelatedSym().getField());
            List<cl.bithaus.fix.QuoteRequest.NoRelatedSym.NoRelatedSymEntry> result = new LinkedList<>();

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
            cl.bithaus.qfix.fields.QuotePriceType quotePriceType = new cl.bithaus.qfix.fields.QuotePriceType();
            cl.bithaus.qfix.fields.OrdType ordType = new cl.bithaus.qfix.fields.OrdType();
            cl.bithaus.qfix.fields.ValidUntilTime validUntilTime = new cl.bithaus.qfix.fields.ValidUntilTime();
            cl.bithaus.qfix.fields.ExpireTime expireTime = new cl.bithaus.qfix.fields.ExpireTime();
            cl.bithaus.qfix.fields.TransactTime transactTime = new cl.bithaus.qfix.fields.TransactTime();
            cl.bithaus.qfix.fields.PriceType priceType = new cl.bithaus.qfix.fields.PriceType();
            cl.bithaus.qfix.fields.Price price = new cl.bithaus.qfix.fields.Price();
            cl.bithaus.qfix.fields.Price2 price2 = new cl.bithaus.qfix.fields.Price2();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.QuoteRequest.NoRelatedSym.NoRelatedSymEntry entry = 
                    new cl.bithaus.fix.QuoteRequest.NoRelatedSym.NoRelatedSymEntry();

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
                if(g.isSetField(quotePriceType)) {
                    quotePriceType = (cl.bithaus.qfix.fields.QuotePriceType) g.getField(quotePriceType);
                    entry.setQuotePriceType(quotePriceType.getValue());

                }
                if(g.isSetField(ordType)) {
                    ordType = (cl.bithaus.qfix.fields.OrdType) g.getField(ordType);
                    entry.setOrdType(ordType.getValue()+"");
                }
                if(g.isSetField(validUntilTime)) {
                    validUntilTime = (cl.bithaus.qfix.fields.ValidUntilTime) g.getField(validUntilTime);
                    entry.setValidUntilTime(validUntilTime.getValue());

                }
                if(g.isSetField(expireTime)) {
                    expireTime = (cl.bithaus.qfix.fields.ExpireTime) g.getField(expireTime);
                    entry.setExpireTime(expireTime.getValue());

                }
                if(g.isSetField(transactTime)) {
                    transactTime = (cl.bithaus.qfix.fields.TransactTime) g.getField(transactTime);
                    entry.setTransactTime(transactTime.getValue());

                }
                if(g.isSetField(priceType)) {
                    priceType = (cl.bithaus.qfix.fields.PriceType) g.getField(priceType);
                    entry.setPriceType(priceType.getValue());

                }
                if(g.isSetField(price)) {
                    price = (cl.bithaus.qfix.fields.Price) g.getField(price);
                    entry.setPrice(price.getValue());

                }
                if(g.isSetField(price2)) {
                    price2 = (cl.bithaus.qfix.fields.Price2) g.getField(price2);
                    entry.setPrice2(price2.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

