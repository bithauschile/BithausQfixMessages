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

package cl.bithaus.qfix.translator.component;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import quickfix.FieldNotFound;


/**
 * Fix - Bithaus format component translator for SecLstUpdRelSymGrp
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class SecLstUpdRelSymGrpTranslator  {

    public static cl.bithaus.qfix.msg.component.SecLstUpdRelSymGrp toFix(cl.bithaus.fix.components.SecLstUpdRelSymGrp src) {

        cl.bithaus.qfix.msg.component.SecLstUpdRelSymGrp dest = new cl.bithaus.qfix.msg.component.SecLstUpdRelSymGrp();


        if(src.getNoRelatedSym() != null && src.getNoRelatedSym().size() > 0) {

            for(cl.bithaus.fix.components.SecLstUpdRelSymGrp.NoRelatedSym.NoRelatedSymEntry entry : src.getNoRelatedSym().getGroups()) {

                cl.bithaus.qfix.msg.component.SecLstUpdRelSymGrp.NoRelatedSym aux = 
                    new cl.bithaus.qfix.msg.component.SecLstUpdRelSymGrp.NoRelatedSym();

                aux.set(new cl.bithaus.qfix.fields.Text(entry.getText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedTextLen(entry.getEncodedTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedText(entry.getEncodedText()));
                aux.set(new cl.bithaus.qfix.fields.Currency(entry.getCurrency()));
                if(entry.getListUpdateAction().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.ListUpdateAction(entry.getListUpdateAction().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.RelSymTransactTime(entry.getRelSymTransactTime()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }

    public static cl.bithaus.fix.components.SecLstUpdRelSymGrp fromFix(cl.bithaus.qfix.msg.component.SecLstUpdRelSymGrp src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.SecLstUpdRelSymGrp dest = new cl.bithaus.fix.components.SecLstUpdRelSymGrp();


        if(src.isSetNoRelatedSym()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoRelatedSym().getField());
            List<cl.bithaus.fix.components.SecLstUpdRelSymGrp.NoRelatedSym.NoRelatedSymEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.Text text = new cl.bithaus.qfix.fields.Text();
            cl.bithaus.qfix.fields.EncodedTextLen encodedTextLen = new cl.bithaus.qfix.fields.EncodedTextLen();
            cl.bithaus.qfix.fields.EncodedText encodedText = new cl.bithaus.qfix.fields.EncodedText();
            cl.bithaus.qfix.fields.Currency currency = new cl.bithaus.qfix.fields.Currency();
            cl.bithaus.qfix.fields.ListUpdateAction listUpdateAction = new cl.bithaus.qfix.fields.ListUpdateAction();
            cl.bithaus.qfix.fields.RelSymTransactTime relSymTransactTime = new cl.bithaus.qfix.fields.RelSymTransactTime();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.SecLstUpdRelSymGrp.NoRelatedSym.NoRelatedSymEntry entry = 
                    new cl.bithaus.fix.components.SecLstUpdRelSymGrp.NoRelatedSym.NoRelatedSymEntry();

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
                if(g.isSetField(currency)) {
                    currency = (cl.bithaus.qfix.fields.Currency) g.getField(currency);
                    entry.setCurrency(currency.getValue());

                }
                if(g.isSetField(listUpdateAction)) {
                    listUpdateAction = (cl.bithaus.qfix.fields.ListUpdateAction) g.getField(listUpdateAction);
                    entry.setListUpdateAction(listUpdateAction.getValue()+"");
                }
                if(g.isSetField(relSymTransactTime)) {
                    relSymTransactTime = (cl.bithaus.qfix.fields.RelSymTransactTime) g.getField(relSymTransactTime);
                    entry.setRelSymTransactTime(relSymTransactTime.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

