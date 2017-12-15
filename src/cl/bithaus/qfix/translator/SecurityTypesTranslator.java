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
 * Fix - Bithaus format component translator for SecurityTypes
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class SecurityTypesTranslator  {

    public static cl.bithaus.qfix.msg.SecurityTypes toFix(cl.bithaus.fix.SecurityTypes src) {

        cl.bithaus.qfix.msg.SecurityTypes dest = new cl.bithaus.qfix.msg.SecurityTypes();

        if(src.getSecurityReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityReqID(src.getSecurityReqID()));
        
        if(src.getSecurityResponseID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityResponseID(src.getSecurityResponseID()));
        
        if(src.getSecurityResponseType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityResponseType(src.getSecurityResponseType()));
        
        if(src.getTotNoSecurityTypes() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNoSecurityTypes(src.getTotNoSecurityTypes()));
        
        if(src.getLastFragment() != null)
            dest.set(new cl.bithaus.qfix.fields.LastFragment(src.getLastFragment()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
        
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
        
        if(src.getSubscriptionRequestType() != null)
            if(src.getSubscriptionRequestType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SubscriptionRequestType(src.getSubscriptionRequestType().charAt(0)));
        


        if(src.getNoSecurityTypes() != null && src.getNoSecurityTypes().size() > 0) {

            for(cl.bithaus.fix.SecurityTypes.NoSecurityTypes.NoSecurityTypesEntry entry : src.getNoSecurityTypes().getGroups()) {

                cl.bithaus.qfix.msg.SecurityTypes.NoSecurityTypes aux = 
                    new cl.bithaus.qfix.msg.SecurityTypes.NoSecurityTypes();

                aux.set(new cl.bithaus.qfix.fields.SecurityType(entry.getSecurityType()));
                aux.set(new cl.bithaus.qfix.fields.SecuritySubType(entry.getSecuritySubType()));
                aux.set(new cl.bithaus.qfix.fields.Product(entry.getProduct()));
                aux.set(new cl.bithaus.qfix.fields.CFICode(entry.getCFICode()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.SecurityTypes fromFix(cl.bithaus.qfix.msg.SecurityTypes src) 
        throws FieldNotFound {

        cl.bithaus.fix.SecurityTypes dest = new cl.bithaus.fix.SecurityTypes();

        if(src.isSetSecurityReqID())
            dest.setSecurityReqID(src.getSecurityReqID().getValue());

        if(src.isSetSecurityResponseID())
            dest.setSecurityResponseID(src.getSecurityResponseID().getValue());

        if(src.isSetSecurityResponseType())
            dest.setSecurityResponseType(src.getSecurityResponseType().getValue());

        if(src.isSetTotNoSecurityTypes())
            dest.setTotNoSecurityTypes(src.getTotNoSecurityTypes().getValue());

        if(src.isSetLastFragment())
            dest.setLastFragment(src.getLastFragment().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());

        if(src.isSetTradingSessionID())
            dest.setTradingSessionID(src.getTradingSessionID().getValue());

        if(src.isSetTradingSessionSubID())
            dest.setTradingSessionSubID(src.getTradingSessionSubID().getValue());

        if(src.isSetSubscriptionRequestType())
            dest.setSubscriptionRequestType(src.getSubscriptionRequestType().getValue()+"");


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"


        if(src.isSetNoSecurityTypes()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoSecurityTypes().getField());
            List<cl.bithaus.fix.SecurityTypes.NoSecurityTypes.NoSecurityTypesEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.SecurityType securityType = new cl.bithaus.qfix.fields.SecurityType();
            cl.bithaus.qfix.fields.SecuritySubType securitySubType = new cl.bithaus.qfix.fields.SecuritySubType();
            cl.bithaus.qfix.fields.Product product = new cl.bithaus.qfix.fields.Product();
            cl.bithaus.qfix.fields.CFICode cFICode = new cl.bithaus.qfix.fields.CFICode();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.SecurityTypes.NoSecurityTypes.NoSecurityTypesEntry entry = 
                    new cl.bithaus.fix.SecurityTypes.NoSecurityTypes.NoSecurityTypesEntry();

                if(g.isSetField(securityType)) {
                    securityType = (cl.bithaus.qfix.fields.SecurityType) g.getField(securityType);
                    entry.setSecurityType(securityType.getValue());

                }
                if(g.isSetField(securitySubType)) {
                    securitySubType = (cl.bithaus.qfix.fields.SecuritySubType) g.getField(securitySubType);
                    entry.setSecuritySubType(securitySubType.getValue());

                }
                if(g.isSetField(product)) {
                    product = (cl.bithaus.qfix.fields.Product) g.getField(product);
                    entry.setProduct(product.getValue());

                }
                if(g.isSetField(cFICode)) {
                    cFICode = (cl.bithaus.qfix.fields.CFICode) g.getField(cFICode);
                    entry.setCFICode(cFICode.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

