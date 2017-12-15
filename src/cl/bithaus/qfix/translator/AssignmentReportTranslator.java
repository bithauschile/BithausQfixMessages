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
 * Fix - Bithaus format component translator for AssignmentReport
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class AssignmentReportTranslator  {

    public static cl.bithaus.qfix.msg.AssignmentReport toFix(cl.bithaus.fix.AssignmentReport src) {

        cl.bithaus.qfix.msg.AssignmentReport dest = new cl.bithaus.qfix.msg.AssignmentReport();

        if(src.getAsgnRptID() != null)
            dest.set(new cl.bithaus.qfix.fields.AsgnRptID(src.getAsgnRptID()));
        
        if(src.getTotNumAssignmentReports() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNumAssignmentReports(src.getTotNumAssignmentReports()));
        
        if(src.getLastRptRequested() != null)
            dest.set(new cl.bithaus.qfix.fields.LastRptRequested(src.getLastRptRequested()));
        
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
        
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
        
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
        
        if(src.getNoLegs() != null)
            dest.set(new cl.bithaus.qfix.fields.NoLegs(src.getNoLegs()));
        
        if(src.getThresholdAmount() != null)
            dest.set(new cl.bithaus.qfix.fields.ThresholdAmount(src.getThresholdAmount()));
        
        if(src.getSettlPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlPrice(src.getSettlPrice()));
        
        if(src.getSettlPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlPriceType(src.getSettlPriceType()));
        
        if(src.getUnderlyingSettlPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingSettlPrice(src.getUnderlyingSettlPrice()));
        
        if(src.getExpireDate() != null)
            dest.set(new cl.bithaus.qfix.fields.ExpireDate(src.getExpireDate()));
        
        if(src.getAssignmentMethod() != null)
            if(src.getAssignmentMethod().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.AssignmentMethod(src.getAssignmentMethod().charAt(0)));
        
        if(src.getAssignmentUnit() != null)
            dest.set(new cl.bithaus.qfix.fields.AssignmentUnit(src.getAssignmentUnit()));
        
        if(src.getOpenInterest() != null)
            dest.set(new cl.bithaus.qfix.fields.OpenInterest(src.getOpenInterest()));
        
        if(src.getExerciseMethod() != null)
            if(src.getExerciseMethod().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.ExerciseMethod(src.getExerciseMethod().charAt(0)));
        
        if(src.getSettlSessID() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlSessID(src.getSettlSessID()));
        
        if(src.getSettlSessSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlSessSubID(src.getSettlSessSubID()));
        
        if(src.getClearingBusinessDate() != null)
            dest.set(new cl.bithaus.qfix.fields.ClearingBusinessDate(src.getClearingBusinessDate()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getInstrumentLeg() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentLegTranslator.toFix(src.getInstrumentLeg()));

        if(src.getPositionQty() != null)
            dest.set(cl.bithaus.qfix.translator.component.PositionQtyTranslator.toFix(src.getPositionQty()));

        if(src.getPositionAmountData() != null)
            dest.set(cl.bithaus.qfix.translator.component.PositionAmountDataTranslator.toFix(src.getPositionAmountData()));


        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.AssignmentReport.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.AssignmentReport.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.AssignmentReport.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.AssignmentReport fromFix(cl.bithaus.qfix.msg.AssignmentReport src) 
        throws FieldNotFound {

        cl.bithaus.fix.AssignmentReport dest = new cl.bithaus.fix.AssignmentReport();

        if(src.isSetAsgnRptID())
            dest.setAsgnRptID(src.getAsgnRptID().getValue());

        if(src.isSetTotNumAssignmentReports())
            dest.setTotNumAssignmentReports(src.getTotNumAssignmentReports().getValue());

        if(src.isSetLastRptRequested())
            dest.setLastRptRequested(src.getLastRptRequested().getValue());

        if(src.isSetAccount())
            dest.setAccount(src.getAccount().getValue());

        if(src.isSetAccountType())
            dest.setAccountType(src.getAccountType().getValue());

        if(src.isSetCurrency())
            dest.setCurrency(src.getCurrency().getValue());

        if(src.isSetNoLegs())
            dest.setNoLegs(src.getNoLegs().getValue());

        if(src.isSetThresholdAmount())
            dest.setThresholdAmount(src.getThresholdAmount().getValue());

        if(src.isSetSettlPrice())
            dest.setSettlPrice(src.getSettlPrice().getValue());

        if(src.isSetSettlPriceType())
            dest.setSettlPriceType(src.getSettlPriceType().getValue());

        if(src.isSetUnderlyingSettlPrice())
            dest.setUnderlyingSettlPrice(src.getUnderlyingSettlPrice().getValue());

        if(src.isSetExpireDate())
            dest.setExpireDate(src.getExpireDate().getValue());

        if(src.isSetAssignmentMethod())
            dest.setAssignmentMethod(src.getAssignmentMethod().getValue()+"");

        if(src.isSetAssignmentUnit())
            dest.setAssignmentUnit(src.getAssignmentUnit().getValue());

        if(src.isSetOpenInterest())
            dest.setOpenInterest(src.getOpenInterest().getValue());

        if(src.isSetExerciseMethod())
            dest.setExerciseMethod(src.getExerciseMethod().getValue()+"");

        if(src.isSetSettlSessID())
            dest.setSettlSessID(src.getSettlSessID().getValue());

        if(src.isSetSettlSessSubID())
            dest.setSettlSessSubID(src.getSettlSessSubID().getValue());

        if(src.isSetClearingBusinessDate())
            dest.setClearingBusinessDate(src.getClearingBusinessDate().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());


        // Hay alguna forma de preguntar si el componente viene en el mensaje?
        // Aca atrapamos la exception sin notificar como un reemplazo al "isSet"
        try {
            dest.setParties(cl.bithaus.qfix.translator.component.PartiesTranslator.fromFix(src.getParties()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setInstrumentLeg(cl.bithaus.qfix.translator.component.InstrumentLegTranslator.fromFix(src.getInstrumentLeg()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setPositionQty(cl.bithaus.qfix.translator.component.PositionQtyTranslator.fromFix(src.getPositionQty()));
        }
        catch(FieldNotFound e) {}
        try {
            dest.setPositionAmountData(cl.bithaus.qfix.translator.component.PositionAmountDataTranslator.fromFix(src.getPositionAmountData()));
        }
        catch(FieldNotFound e) {}


        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.AssignmentReport.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.AssignmentReport.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.AssignmentReport.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        return dest;

    }
}

