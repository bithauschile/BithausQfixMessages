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
public class PositionMaintenanceReportTranslator  {

    public static cl.bithaus.qfix.msg.PositionMaintenanceReport toFix(cl.bithaus.fix.PositionMaintenanceReport src) {

        cl.bithaus.qfix.msg.PositionMaintenanceReport dest = new cl.bithaus.qfix.msg.PositionMaintenanceReport();

        if(src.getPosMaintRptID() != null)
            dest.set(new cl.bithaus.qfix.fields.PosMaintRptID(src.getPosMaintRptID()));
            
        if(src.getPosTransType() != null)
            dest.set(new cl.bithaus.qfix.fields.PosTransType(src.getPosTransType()));
            
        if(src.getPosReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.PosReqID(src.getPosReqID()));
            
        if(src.getPosMaintAction() != null)
            dest.set(new cl.bithaus.qfix.fields.PosMaintAction(src.getPosMaintAction()));
            
        if(src.getOrigPosReqRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigPosReqRefID(src.getOrigPosReqRefID()));
            
        if(src.getPosMaintStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.PosMaintStatus(src.getPosMaintStatus()));
            
        if(src.getPosMaintResult() != null)
            dest.set(new cl.bithaus.qfix.fields.PosMaintResult(src.getPosMaintResult()));
            
        if(src.getClearingBusinessDate() != null)
            dest.set(new cl.bithaus.qfix.fields.ClearingBusinessDate(src.getClearingBusinessDate()));
            
        if(src.getSettlSessID() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlSessID(src.getSettlSessID()));
            
        if(src.getSettlSessSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlSessSubID(src.getSettlSessSubID()));
            
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
            
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
            
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
        if(src.getAdjustmentType() != null)
            dest.set(new cl.bithaus.qfix.fields.AdjustmentType(src.getAdjustmentType()));
            
        if(src.getThresholdAmount() != null)
            dest.set(new cl.bithaus.qfix.fields.ThresholdAmount(src.getThresholdAmount()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.PositionMaintenanceReport.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.PositionMaintenanceReport.NoLegs aux = 
                    new cl.bithaus.qfix.msg.PositionMaintenanceReport.NoLegs();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.PositionMaintenanceReport.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.PositionMaintenanceReport.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.PositionMaintenanceReport.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoTradingSessions() != null && src.getNoTradingSessions().size() > 0) {

            for(cl.bithaus.fix.PositionMaintenanceReport.NoTradingSessions.NoTradingSessionsEntry entry : src.getNoTradingSessions().getGroups()) {

                cl.bithaus.qfix.msg.PositionMaintenanceReport.NoTradingSessions aux = 
                    new cl.bithaus.qfix.msg.PositionMaintenanceReport.NoTradingSessions();

                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

