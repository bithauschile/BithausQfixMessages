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


}

