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
 * Fix - Bithaus format component translator for News
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class NewsTranslator  {

    public static cl.bithaus.qfix.msg.News toFix(cl.bithaus.fix.News src) {

        cl.bithaus.qfix.msg.News dest = new cl.bithaus.qfix.msg.News();

        if(src.getOrigTime() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigTime(src.getOrigTime()));
        
        if(src.getUrgency() != null)
            if(src.getUrgency().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Urgency(src.getUrgency().charAt(0)));
        
        if(src.getHeadline() != null)
            dest.set(new cl.bithaus.qfix.fields.Headline(src.getHeadline()));
        
        if(src.getEncodedHeadlineLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedHeadlineLen(src.getEncodedHeadlineLen()));
        
        if(src.getEncodedHeadline() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedHeadline(src.getEncodedHeadline()));
        
        if(src.getURLLink() != null)
            dest.set(new cl.bithaus.qfix.fields.URLLink(src.getURLLink()));
        
        if(src.getRawDataLength() != null)
            dest.set(new cl.bithaus.qfix.fields.RawDataLength(src.getRawDataLength()));
        
        if(src.getRawData() != null)
            dest.set(new cl.bithaus.qfix.fields.RawData(src.getRawData()));
        
        if(src.getNewsType() != null)
            dest.set(new cl.bithaus.qfix.fields.NewsType(src.getNewsType()));
        
        if(src.getNewsCode() != null)
            dest.set(new cl.bithaus.qfix.fields.NewsCode(src.getNewsCode()));
        
        if(src.getNewsSourceSystem() != null)
            dest.set(new cl.bithaus.qfix.fields.NewsSourceSystem(src.getNewsSourceSystem()));
        


        if(src.getNoRoutingIDs() != null && src.getNoRoutingIDs().size() > 0) {

            for(cl.bithaus.fix.News.NoRoutingIDs.NoRoutingIDsEntry entry : src.getNoRoutingIDs().getGroups()) {

                cl.bithaus.qfix.msg.News.NoRoutingIDs aux = 
                    new cl.bithaus.qfix.msg.News.NoRoutingIDs();

                aux.set(new cl.bithaus.qfix.fields.RoutingType(entry.getRoutingType()));
                aux.set(new cl.bithaus.qfix.fields.RoutingID(entry.getRoutingID()));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoRelatedSym() != null && src.getNoRelatedSym().size() > 0) {

            for(cl.bithaus.fix.News.NoRelatedSym.NoRelatedSymEntry entry : src.getNoRelatedSym().getGroups()) {

                cl.bithaus.qfix.msg.News.NoRelatedSym aux = 
                    new cl.bithaus.qfix.msg.News.NoRelatedSym();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.News.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.News.NoLegs aux = 
                    new cl.bithaus.qfix.msg.News.NoLegs();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.News.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.News.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.News.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        if(src.getLinesOfText() != null && src.getLinesOfText().size() > 0) {

            for(cl.bithaus.fix.News.LinesOfText.LinesOfTextEntry entry : src.getLinesOfText().getGroups()) {

                cl.bithaus.qfix.msg.News.LinesOfText aux = 
                    new cl.bithaus.qfix.msg.News.LinesOfText();

                aux.set(new cl.bithaus.qfix.fields.Text(entry.getText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedTextLen(entry.getEncodedTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedText(entry.getEncodedText()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.News fromFix(cl.bithaus.qfix.msg.News src) 
        throws FieldNotFound {

        cl.bithaus.fix.News dest = new cl.bithaus.fix.News();

        if(src.isSetOrigTime())
            dest.setOrigTime(src.getOrigTime().getValue());

        if(src.isSetUrgency())
            dest.setUrgency(src.getUrgency().getValue()+"");

        if(src.isSetHeadline())
            dest.setHeadline(src.getHeadline().getValue());

        if(src.isSetEncodedHeadlineLen())
            dest.setEncodedHeadlineLen(src.getEncodedHeadlineLen().getValue());

        if(src.isSetEncodedHeadline())
            dest.setEncodedHeadline(src.getEncodedHeadline().getValue());

        if(src.isSetURLLink())
            dest.setURLLink(src.getURLLink().getValue());

        if(src.isSetRawDataLength())
            dest.setRawDataLength(src.getRawDataLength().getValue());

        if(src.isSetRawData())
            dest.setRawData(src.getRawData().getValue());

        if(src.isSetNewsType())
            dest.setNewsType(src.getNewsType().getValue());

        if(src.isSetNewsCode())
            dest.setNewsCode(src.getNewsCode().getValue());

        if(src.isSetNewsSourceSystem())
            dest.setNewsSourceSystem(src.getNewsSourceSystem().getValue());




        if(src.isSetNoRoutingIDs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoRoutingIDs().getField());
            List<cl.bithaus.fix.News.NoRoutingIDs.NoRoutingIDsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.RoutingType routingType = new cl.bithaus.qfix.fields.RoutingType();
            cl.bithaus.qfix.fields.RoutingID routingID = new cl.bithaus.qfix.fields.RoutingID();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.News.NoRoutingIDs.NoRoutingIDsEntry entry = 
                    new cl.bithaus.fix.News.NoRoutingIDs.NoRoutingIDsEntry();

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
        if(src.isSetNoRelatedSym()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoRelatedSym().getField());
            List<cl.bithaus.fix.News.NoRelatedSym.NoRelatedSymEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.News.NoRelatedSym.NoRelatedSymEntry entry = 
                    new cl.bithaus.fix.News.NoRelatedSym.NoRelatedSymEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.News.NoLegs.NoLegsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.News.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.News.NoLegs.NoLegsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.News.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.News.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.News.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetLinesOfText()) {

            List<quickfix.Group> gList = src.getGroups(src.getLinesOfText().getField());
            List<cl.bithaus.fix.News.LinesOfText.LinesOfTextEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.Text text = new cl.bithaus.qfix.fields.Text();
            cl.bithaus.qfix.fields.EncodedTextLen encodedTextLen = new cl.bithaus.qfix.fields.EncodedTextLen();
            cl.bithaus.qfix.fields.EncodedText encodedText = new cl.bithaus.qfix.fields.EncodedText();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.News.LinesOfText.LinesOfTextEntry entry = 
                    new cl.bithaus.fix.News.LinesOfText.LinesOfTextEntry();

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

