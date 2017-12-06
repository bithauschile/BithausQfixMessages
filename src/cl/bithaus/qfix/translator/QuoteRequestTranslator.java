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


}

