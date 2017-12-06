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


}

