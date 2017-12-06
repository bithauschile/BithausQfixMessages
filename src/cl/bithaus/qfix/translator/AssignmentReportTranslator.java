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
            

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.AssignmentReport.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.AssignmentReport.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.AssignmentReport.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

