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
 * Fix - Bithaus format component translator for Email
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class EmailTranslator  {

    public static cl.bithaus.qfix.msg.Email toFix(cl.bithaus.fix.Email src) {

        cl.bithaus.qfix.msg.Email dest = new cl.bithaus.qfix.msg.Email();

        if(src.getEmailThreadID() != null)
            dest.set(new cl.bithaus.qfix.fields.EmailThreadID(src.getEmailThreadID()));
        
        if(src.getEmailType() != null)
            if(src.getEmailType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.EmailType(src.getEmailType().charAt(0)));
        
        if(src.getOrigTime() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigTime(src.getOrigTime()));
        
        if(src.getSubject() != null)
            dest.set(new cl.bithaus.qfix.fields.Subject(src.getSubject()));
        
        if(src.getEncodedSubjectLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedSubjectLen(src.getEncodedSubjectLen()));
        
        if(src.getEncodedSubject() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedSubject(src.getEncodedSubject()));
        
        if(src.getOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderID(src.getOrderID()));
        
        if(src.getClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdID(src.getClOrdID()));
        
        if(src.getRawDataLength() != null)
            dest.set(new cl.bithaus.qfix.fields.RawDataLength(src.getRawDataLength()));
        
        if(src.getRawData() != null)
            dest.set(new cl.bithaus.qfix.fields.RawData(src.getRawData()));
        
        if(src.getNewsSourceSystem() != null)
            dest.set(new cl.bithaus.qfix.fields.NewsSourceSystem(src.getNewsSourceSystem()));
        


        if(src.getNoRoutingIDs() != null && src.getNoRoutingIDs().size() > 0) {

            for(cl.bithaus.fix.Email.NoRoutingIDs.NoRoutingIDsEntry entry : src.getNoRoutingIDs().getGroups()) {

                cl.bithaus.qfix.msg.Email.NoRoutingIDs aux = 
                    new cl.bithaus.qfix.msg.Email.NoRoutingIDs();

                aux.set(new cl.bithaus.qfix.fields.RoutingType(entry.getRoutingType()));
                aux.set(new cl.bithaus.qfix.fields.RoutingID(entry.getRoutingID()));

                dest.addGroup(aux);
            }            
        }

        if(src.getNoRelatedSym() != null && src.getNoRelatedSym().size() > 0) {

            for(cl.bithaus.fix.Email.NoRelatedSym.NoRelatedSymEntry entry : src.getNoRelatedSym().getGroups()) {

                cl.bithaus.qfix.msg.Email.NoRelatedSym aux = 
                    new cl.bithaus.qfix.msg.Email.NoRelatedSym();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.Email.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.Email.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.Email.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.Email.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.Email.NoLegs aux = 
                    new cl.bithaus.qfix.msg.Email.NoLegs();


                dest.addGroup(aux);
            }            
        }

        if(src.getLinesOfText() != null && src.getLinesOfText().size() > 0) {

            for(cl.bithaus.fix.Email.LinesOfText.LinesOfTextEntry entry : src.getLinesOfText().getGroups()) {

                cl.bithaus.qfix.msg.Email.LinesOfText aux = 
                    new cl.bithaus.qfix.msg.Email.LinesOfText();

                aux.set(new cl.bithaus.qfix.fields.Text(entry.getText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedTextLen(entry.getEncodedTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedText(entry.getEncodedText()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.Email fromFix(cl.bithaus.qfix.msg.Email src) 
        throws FieldNotFound {

        cl.bithaus.fix.Email dest = new cl.bithaus.fix.Email();

        if(src.isSetEmailThreadID())
            dest.setEmailThreadID(src.getEmailThreadID().getValue());

        if(src.isSetEmailType())
            dest.setEmailType(src.getEmailType().getValue()+"");

        if(src.isSetOrigTime())
            dest.setOrigTime(src.getOrigTime().getValue());

        if(src.isSetSubject())
            dest.setSubject(src.getSubject().getValue());

        if(src.isSetEncodedSubjectLen())
            dest.setEncodedSubjectLen(src.getEncodedSubjectLen().getValue());

        if(src.isSetEncodedSubject())
            dest.setEncodedSubject(src.getEncodedSubject().getValue());

        if(src.isSetOrderID())
            dest.setOrderID(src.getOrderID().getValue());

        if(src.isSetClOrdID())
            dest.setClOrdID(src.getClOrdID().getValue());

        if(src.isSetRawDataLength())
            dest.setRawDataLength(src.getRawDataLength().getValue());

        if(src.isSetRawData())
            dest.setRawData(src.getRawData().getValue());

        if(src.isSetNewsSourceSystem())
            dest.setNewsSourceSystem(src.getNewsSourceSystem().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"


        if(src.isSetNoRoutingIDs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoRoutingIDs().getField());
            List<cl.bithaus.fix.Email.NoRoutingIDs.NoRoutingIDsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.RoutingType routingType = new cl.bithaus.qfix.fields.RoutingType();
            cl.bithaus.qfix.fields.RoutingID routingID = new cl.bithaus.qfix.fields.RoutingID();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.Email.NoRoutingIDs.NoRoutingIDsEntry entry = 
                    new cl.bithaus.fix.Email.NoRoutingIDs.NoRoutingIDsEntry();

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
            List<cl.bithaus.fix.Email.NoRelatedSym.NoRelatedSymEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.Email.NoRelatedSym.NoRelatedSymEntry entry = 
                    new cl.bithaus.fix.Email.NoRelatedSym.NoRelatedSymEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.Email.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.Email.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.Email.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.Email.NoLegs.NoLegsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.Email.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.Email.NoLegs.NoLegsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetLinesOfText()) {

            List<quickfix.Group> gList = src.getGroups(src.getLinesOfText().getField());
            List<cl.bithaus.fix.Email.LinesOfText.LinesOfTextEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.Text text = new cl.bithaus.qfix.fields.Text();
            cl.bithaus.qfix.fields.EncodedTextLen encodedTextLen = new cl.bithaus.qfix.fields.EncodedTextLen();
            cl.bithaus.qfix.fields.EncodedText encodedText = new cl.bithaus.qfix.fields.EncodedText();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.Email.LinesOfText.LinesOfTextEntry entry = 
                    new cl.bithaus.fix.Email.LinesOfText.LinesOfTextEntry();

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

