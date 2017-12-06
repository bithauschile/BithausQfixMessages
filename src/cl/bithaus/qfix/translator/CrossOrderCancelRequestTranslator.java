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
 * Fix - Bithaus format component translator for CrossOrderCancelRequest
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class CrossOrderCancelRequestTranslator  {

    public static cl.bithaus.qfix.msg.CrossOrderCancelRequest toFix(cl.bithaus.fix.CrossOrderCancelRequest src) {

        cl.bithaus.qfix.msg.CrossOrderCancelRequest dest = new cl.bithaus.qfix.msg.CrossOrderCancelRequest();

        if(src.getOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderID(src.getOrderID()));
        
        if(src.getCrossID() != null)
            dest.set(new cl.bithaus.qfix.fields.CrossID(src.getCrossID()));
        
        if(src.getOrigCrossID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigCrossID(src.getOrigCrossID()));
        
        if(src.getCrossType() != null)
            dest.set(new cl.bithaus.qfix.fields.CrossType(src.getCrossType()));
        
        if(src.getCrossPrioritization() != null)
            dest.set(new cl.bithaus.qfix.fields.CrossPrioritization(src.getCrossPrioritization()));
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getExDestination() != null)
            dest.set(new cl.bithaus.qfix.fields.ExDestination(src.getExDestination()));
        

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));


        if(src.getNoSides() != null && src.getNoSides().size() > 0) {

            for(cl.bithaus.fix.CrossOrderCancelRequest.NoSides.NoSidesEntry entry : src.getNoSides().getGroups()) {

                cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoSides aux = 
                    new cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoSides();

                if(entry.getSide().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Side(entry.getSide().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.OrigClOrdID(entry.getOrigClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.ClOrdID(entry.getClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(entry.getSecondaryClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.ClOrdLinkID(entry.getClOrdLinkID()));
                aux.set(new cl.bithaus.qfix.fields.OrigOrdModTime(entry.getOrigOrdModTime()));
                aux.set(new cl.bithaus.qfix.fields.TradeOriginationDate(entry.getTradeOriginationDate()));
                aux.set(new cl.bithaus.qfix.fields.TradeDate(entry.getTradeDate()));
                aux.set(new cl.bithaus.qfix.fields.ComplianceID(entry.getComplianceID()));
                aux.set(new cl.bithaus.qfix.fields.Text(entry.getText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedTextLen(entry.getEncodedTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedText(entry.getEncodedText()));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.CrossOrderCancelRequest.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.CrossOrderCancelRequest.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoLegs aux = 
                    new cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoLegs();


                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.CrossOrderCancelRequest fromFix(cl.bithaus.qfix.msg.CrossOrderCancelRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.CrossOrderCancelRequest dest = new cl.bithaus.fix.CrossOrderCancelRequest();

        if(src.isSetOrderID())
            dest.setOrderID(src.getOrderID().getValue());

        if(src.isSetCrossID())
            dest.setCrossID(src.getCrossID().getValue());

        if(src.isSetOrigCrossID())
            dest.setOrigCrossID(src.getOrigCrossID().getValue());

        if(src.isSetCrossType())
            dest.setCrossType(src.getCrossType().getValue());

        if(src.isSetCrossPrioritization())
            dest.setCrossPrioritization(src.getCrossPrioritization().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetExDestination())
            dest.setExDestination(src.getExDestination().getValue());


        if(src.getInstrument() != null)
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));



        if(src.isSetNoSides()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoSides().getField());
            List<cl.bithaus.fix.CrossOrderCancelRequest.NoSides.NoSidesEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.Side side = new cl.bithaus.qfix.fields.Side();
            cl.bithaus.qfix.fields.OrigClOrdID origClOrdID = new cl.bithaus.qfix.fields.OrigClOrdID();
            cl.bithaus.qfix.fields.ClOrdID clOrdID = new cl.bithaus.qfix.fields.ClOrdID();
            cl.bithaus.qfix.fields.SecondaryClOrdID secondaryClOrdID = new cl.bithaus.qfix.fields.SecondaryClOrdID();
            cl.bithaus.qfix.fields.ClOrdLinkID clOrdLinkID = new cl.bithaus.qfix.fields.ClOrdLinkID();
            cl.bithaus.qfix.fields.OrigOrdModTime origOrdModTime = new cl.bithaus.qfix.fields.OrigOrdModTime();
            cl.bithaus.qfix.fields.TradeOriginationDate tradeOriginationDate = new cl.bithaus.qfix.fields.TradeOriginationDate();
            cl.bithaus.qfix.fields.TradeDate tradeDate = new cl.bithaus.qfix.fields.TradeDate();
            cl.bithaus.qfix.fields.ComplianceID complianceID = new cl.bithaus.qfix.fields.ComplianceID();
            cl.bithaus.qfix.fields.Text text = new cl.bithaus.qfix.fields.Text();
            cl.bithaus.qfix.fields.EncodedTextLen encodedTextLen = new cl.bithaus.qfix.fields.EncodedTextLen();
            cl.bithaus.qfix.fields.EncodedText encodedText = new cl.bithaus.qfix.fields.EncodedText();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.CrossOrderCancelRequest.NoSides.NoSidesEntry entry = 
                    new cl.bithaus.fix.CrossOrderCancelRequest.NoSides.NoSidesEntry();

                if(g.isSetField(side)) {
                    side = (cl.bithaus.qfix.fields.Side) g.getField(side);
                    entry.setSide(side.getValue()+"");
                }
                if(g.isSetField(origClOrdID)) {
                    origClOrdID = (cl.bithaus.qfix.fields.OrigClOrdID) g.getField(origClOrdID);
                    entry.setOrigClOrdID(origClOrdID.getValue());

                }
                if(g.isSetField(clOrdID)) {
                    clOrdID = (cl.bithaus.qfix.fields.ClOrdID) g.getField(clOrdID);
                    entry.setClOrdID(clOrdID.getValue());

                }
                if(g.isSetField(secondaryClOrdID)) {
                    secondaryClOrdID = (cl.bithaus.qfix.fields.SecondaryClOrdID) g.getField(secondaryClOrdID);
                    entry.setSecondaryClOrdID(secondaryClOrdID.getValue());

                }
                if(g.isSetField(clOrdLinkID)) {
                    clOrdLinkID = (cl.bithaus.qfix.fields.ClOrdLinkID) g.getField(clOrdLinkID);
                    entry.setClOrdLinkID(clOrdLinkID.getValue());

                }
                if(g.isSetField(origOrdModTime)) {
                    origOrdModTime = (cl.bithaus.qfix.fields.OrigOrdModTime) g.getField(origOrdModTime);
                    entry.setOrigOrdModTime(origOrdModTime.getValue());

                }
                if(g.isSetField(tradeOriginationDate)) {
                    tradeOriginationDate = (cl.bithaus.qfix.fields.TradeOriginationDate) g.getField(tradeOriginationDate);
                    entry.setTradeOriginationDate(tradeOriginationDate.getValue());

                }
                if(g.isSetField(tradeDate)) {
                    tradeDate = (cl.bithaus.qfix.fields.TradeDate) g.getField(tradeDate);
                    entry.setTradeDate(tradeDate.getValue());

                }
                if(g.isSetField(complianceID)) {
                    complianceID = (cl.bithaus.qfix.fields.ComplianceID) g.getField(complianceID);
                    entry.setComplianceID(complianceID.getValue());

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
        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.CrossOrderCancelRequest.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.CrossOrderCancelRequest.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.CrossOrderCancelRequest.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.CrossOrderCancelRequest.NoLegs.NoLegsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.CrossOrderCancelRequest.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.CrossOrderCancelRequest.NoLegs.NoLegsEntry();


                result.add(entry);                
            }

        }
        return dest;

    }
}

