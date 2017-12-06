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
 * Fix - Bithaus format component translator for BidResponse
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class BidResponseTranslator  {

    public static cl.bithaus.qfix.msg.BidResponse toFix(cl.bithaus.fix.BidResponse src) {

        cl.bithaus.qfix.msg.BidResponse dest = new cl.bithaus.qfix.msg.BidResponse();

        if(src.getBidID() != null)
            dest.set(new cl.bithaus.qfix.fields.BidID(src.getBidID()));
        
        if(src.getClientBidID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClientBidID(src.getClientBidID()));
        


        if(src.getNoBidComponents() != null && src.getNoBidComponents().size() > 0) {

            for(cl.bithaus.fix.BidResponse.NoBidComponents.NoBidComponentsEntry entry : src.getNoBidComponents().getGroups()) {

                cl.bithaus.qfix.msg.BidResponse.NoBidComponents aux = 
                    new cl.bithaus.qfix.msg.BidResponse.NoBidComponents();

                aux.set(new cl.bithaus.qfix.fields.ListID(entry.getListID()));
                aux.set(new cl.bithaus.qfix.fields.Country(entry.getCountry()));
                if(entry.getSide().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Side(entry.getSide().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.Price(entry.getPrice()));
                aux.set(new cl.bithaus.qfix.fields.PriceType(entry.getPriceType()));
                aux.set(new cl.bithaus.qfix.fields.FairValue(entry.getFairValue()));
                aux.set(new cl.bithaus.qfix.fields.NetGrossInd(entry.getNetGrossInd()));
                if(entry.getSettlType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.SettlType(entry.getSettlType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.SettlDate(entry.getSettlDate()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));
                aux.set(new cl.bithaus.qfix.fields.Text(entry.getText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedTextLen(entry.getEncodedTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedText(entry.getEncodedText()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.BidResponse fromFix(cl.bithaus.qfix.msg.BidResponse src) 
        throws FieldNotFound {

        cl.bithaus.fix.BidResponse dest = new cl.bithaus.fix.BidResponse();

        if(src.isSetBidID())
            dest.setBidID(src.getBidID().getValue());

        if(src.isSetClientBidID())
            dest.setClientBidID(src.getClientBidID().getValue());




        if(src.isSetNoBidComponents()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoBidComponents().getField());
            List<cl.bithaus.fix.BidResponse.NoBidComponents.NoBidComponentsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.ListID listID = new cl.bithaus.qfix.fields.ListID();
            cl.bithaus.qfix.fields.Country country = new cl.bithaus.qfix.fields.Country();
            cl.bithaus.qfix.fields.Side side = new cl.bithaus.qfix.fields.Side();
            cl.bithaus.qfix.fields.Price price = new cl.bithaus.qfix.fields.Price();
            cl.bithaus.qfix.fields.PriceType priceType = new cl.bithaus.qfix.fields.PriceType();
            cl.bithaus.qfix.fields.FairValue fairValue = new cl.bithaus.qfix.fields.FairValue();
            cl.bithaus.qfix.fields.NetGrossInd netGrossInd = new cl.bithaus.qfix.fields.NetGrossInd();
            cl.bithaus.qfix.fields.SettlType settlType = new cl.bithaus.qfix.fields.SettlType();
            cl.bithaus.qfix.fields.SettlDate settlDate = new cl.bithaus.qfix.fields.SettlDate();
            cl.bithaus.qfix.fields.TradingSessionID tradingSessionID = new cl.bithaus.qfix.fields.TradingSessionID();
            cl.bithaus.qfix.fields.TradingSessionSubID tradingSessionSubID = new cl.bithaus.qfix.fields.TradingSessionSubID();
            cl.bithaus.qfix.fields.Text text = new cl.bithaus.qfix.fields.Text();
            cl.bithaus.qfix.fields.EncodedTextLen encodedTextLen = new cl.bithaus.qfix.fields.EncodedTextLen();
            cl.bithaus.qfix.fields.EncodedText encodedText = new cl.bithaus.qfix.fields.EncodedText();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.BidResponse.NoBidComponents.NoBidComponentsEntry entry = 
                    new cl.bithaus.fix.BidResponse.NoBidComponents.NoBidComponentsEntry();

                if(g.isSetField(listID)) {
                    listID = (cl.bithaus.qfix.fields.ListID) g.getField(listID);
                    entry.setListID(listID.getValue());

                }
                if(g.isSetField(country)) {
                    country = (cl.bithaus.qfix.fields.Country) g.getField(country);
                    entry.setCountry(country.getValue());

                }
                if(g.isSetField(side)) {
                    side = (cl.bithaus.qfix.fields.Side) g.getField(side);
                    entry.setSide(side.getValue()+"");
                }
                if(g.isSetField(price)) {
                    price = (cl.bithaus.qfix.fields.Price) g.getField(price);
                    entry.setPrice(price.getValue());

                }
                if(g.isSetField(priceType)) {
                    priceType = (cl.bithaus.qfix.fields.PriceType) g.getField(priceType);
                    entry.setPriceType(priceType.getValue());

                }
                if(g.isSetField(fairValue)) {
                    fairValue = (cl.bithaus.qfix.fields.FairValue) g.getField(fairValue);
                    entry.setFairValue(fairValue.getValue());

                }
                if(g.isSetField(netGrossInd)) {
                    netGrossInd = (cl.bithaus.qfix.fields.NetGrossInd) g.getField(netGrossInd);
                    entry.setNetGrossInd(netGrossInd.getValue());

                }
                if(g.isSetField(settlType)) {
                    settlType = (cl.bithaus.qfix.fields.SettlType) g.getField(settlType);
                    entry.setSettlType(settlType.getValue()+"");
                }
                if(g.isSetField(settlDate)) {
                    settlDate = (cl.bithaus.qfix.fields.SettlDate) g.getField(settlDate);
                    entry.setSettlDate(settlDate.getValue());

                }
                if(g.isSetField(tradingSessionID)) {
                    tradingSessionID = (cl.bithaus.qfix.fields.TradingSessionID) g.getField(tradingSessionID);
                    entry.setTradingSessionID(tradingSessionID.getValue());

                }
                if(g.isSetField(tradingSessionSubID)) {
                    tradingSessionSubID = (cl.bithaus.qfix.fields.TradingSessionSubID) g.getField(tradingSessionSubID);
                    entry.setTradingSessionSubID(tradingSessionSubID.getValue());

                }
                if(g.isSetField(text)) {
                    text = (cl.bithaus.qfix.fields.Text) g.getField(text);
                    entry.setText(text.getValue());

                }
                if(g.isSetField(encodedTextLen)) {
                    encodedTextLen = (cl.bithaus.qfix.fields.EncodedTextLen) g.getField(encodedTextLen);
                    entry.setEncodedTextLen(encodedTextLen.getValue());

                }
                if(g.isSetField(encodedText)) {
                    encodedText = (cl.bithaus.qfix.fields.EncodedText) g.getField(encodedText);
                    entry.setEncodedText(encodedText.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

