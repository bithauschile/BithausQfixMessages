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
public class RequestForPositionsAckTranslator  {

    public static cl.bithaus.qfix.msg.RequestForPositionsAck toFix(cl.bithaus.fix.RequestForPositionsAck src) {

        cl.bithaus.qfix.msg.RequestForPositionsAck dest = new cl.bithaus.qfix.msg.RequestForPositionsAck();

        if(src.getPosMaintRptID() != null)
            dest.set(new cl.bithaus.qfix.fields.PosMaintRptID(src.getPosMaintRptID()));
            
        if(src.getPosReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.PosReqID(src.getPosReqID()));
            
        if(src.getTotalNumPosReports() != null)
            dest.set(new cl.bithaus.qfix.fields.TotalNumPosReports(src.getTotalNumPosReports()));
            
        if(src.getUnsolicitedIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.UnsolicitedIndicator(src.getUnsolicitedIndicator()));
            
        if(src.getPosReqResult() != null)
            dest.set(new cl.bithaus.qfix.fields.PosReqResult(src.getPosReqResult()));
            
        if(src.getPosReqStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.PosReqStatus(src.getPosReqStatus()));
            
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
            
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
            
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getResponseTransportType() != null)
            dest.set(new cl.bithaus.qfix.fields.ResponseTransportType(src.getResponseTransportType()));
            
        if(src.getResponseDestination() != null)
            dest.set(new cl.bithaus.qfix.fields.ResponseDestination(src.getResponseDestination()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            

        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.RequestForPositionsAck.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.RequestForPositionsAck.NoLegs aux = 
                    new cl.bithaus.qfix.msg.RequestForPositionsAck.NoLegs();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.RequestForPositionsAck.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.RequestForPositionsAck.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.RequestForPositionsAck.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

