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


}

