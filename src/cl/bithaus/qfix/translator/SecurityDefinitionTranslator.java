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
 * Fix - Bithaus format component translator for SecurityDefinition
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class SecurityDefinitionTranslator  {

    public static cl.bithaus.qfix.msg.SecurityDefinition toFix(cl.bithaus.fix.SecurityDefinition src) {

        cl.bithaus.qfix.msg.SecurityDefinition dest = new cl.bithaus.qfix.msg.SecurityDefinition();

        if(src.getSecurityReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityReqID(src.getSecurityReqID()));
        
        if(src.getSecurityResponseID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityResponseID(src.getSecurityResponseID()));
        
        if(src.getSecurityResponseType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityResponseType(src.getSecurityResponseType()));
        
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
        
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
        
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        
        if(src.getExpirationCycle() != null)
            dest.set(new cl.bithaus.qfix.fields.ExpirationCycle(src.getExpirationCycle()));
        
        if(src.getRoundLot() != null)
            dest.set(new cl.bithaus.qfix.fields.RoundLot(src.getRoundLot()));
        
        if(src.getMinTradeVol() != null)
            dest.set(new cl.bithaus.qfix.fields.MinTradeVol(src.getMinTradeVol()));
        

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getInstrumentExtension() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentExtensionTranslator.toFix(src.getInstrumentExtension()));


        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.SecurityDefinition.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.SecurityDefinition.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.SecurityDefinition.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.SecurityDefinition.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.SecurityDefinition.NoLegs aux = 
                    new cl.bithaus.qfix.msg.SecurityDefinition.NoLegs();


                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.SecurityDefinition fromFix(cl.bithaus.qfix.msg.SecurityDefinition src) 
        throws FieldNotFound {

        cl.bithaus.fix.SecurityDefinition dest = new cl.bithaus.fix.SecurityDefinition();

        if(src.isSetSecurityReqID())
            dest.setSecurityReqID(src.getSecurityReqID().getValue());

        if(src.isSetSecurityResponseID())
            dest.setSecurityResponseID(src.getSecurityResponseID().getValue());

        if(src.isSetSecurityResponseType())
            dest.setSecurityResponseType(src.getSecurityResponseType().getValue());

        if(src.isSetCurrency())
            dest.setCurrency(src.getCurrency().getValue());

        if(src.isSetTradingSessionID())
            dest.setTradingSessionID(src.getTradingSessionID().getValue());

        if(src.isSetTradingSessionSubID())
            dest.setTradingSessionSubID(src.getTradingSessionSubID().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());

        if(src.isSetExpirationCycle())
            dest.setExpirationCycle(src.getExpirationCycle().getValue());

        if(src.isSetRoundLot())
            dest.setRoundLot(src.getRoundLot().getValue());

        if(src.isSetMinTradeVol())
            dest.setMinTradeVol(src.getMinTradeVol().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"
        try {
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setInstrumentExtension(cl.bithaus.qfix.translator.component.InstrumentExtensionTranslator.fromFix(src.getInstrumentExtension()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.SecurityDefinition.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.SecurityDefinition.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.SecurityDefinition.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.SecurityDefinition.NoLegs.NoLegsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.SecurityDefinition.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.SecurityDefinition.NoLegs.NoLegsEntry();


                result.add(entry);                
            }

        }
        return dest;

    }
}

