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

/**
 * Fix Components Class
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


}

