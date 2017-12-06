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
public class PositionMaintenanceRequestTranslator  {

    public static cl.bithaus.qfix.msg.PositionMaintenanceRequest toFix(cl.bithaus.fix.PositionMaintenanceRequest src) {

        cl.bithaus.qfix.msg.PositionMaintenanceRequest dest = new cl.bithaus.qfix.msg.PositionMaintenanceRequest();

        if(src.getPosReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.PosReqID(src.getPosReqID()));
            
        if(src.getPosTransType() != null)
            dest.set(new cl.bithaus.qfix.fields.PosTransType(src.getPosTransType()));
            
        if(src.getPosMaintAction() != null)
            dest.set(new cl.bithaus.qfix.fields.PosMaintAction(src.getPosMaintAction()));
            
        if(src.getOrigPosReqRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigPosReqRefID(src.getOrigPosReqRefID()));
            
        if(src.getPosMaintRptRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.PosMaintRptRefID(src.getPosMaintRptRefID()));
            
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
            
        if(src.getContraryInstructionIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.ContraryInstructionIndicator(src.getContraryInstructionIndicator()));
            
        if(src.getPriorSpreadIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.PriorSpreadIndicator(src.getPriorSpreadIndicator()));
            
        if(src.getThresholdAmount() != null)
            dest.set(new cl.bithaus.qfix.fields.ThresholdAmount(src.getThresholdAmount()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.PositionMaintenanceRequest.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoLegs aux = 
                    new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoLegs();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.PositionMaintenanceRequest.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoTradingSessions() != null && src.getNoTradingSessions().size() > 0) {

            for(cl.bithaus.fix.PositionMaintenanceRequest.NoTradingSessions.NoTradingSessionsEntry entry : src.getNoTradingSessions().getGroups()) {

                cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoTradingSessions aux = 
                    new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoTradingSessions();

                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

