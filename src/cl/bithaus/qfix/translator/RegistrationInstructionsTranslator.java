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
public class RegistrationInstructionsTranslator  {

    public static cl.bithaus.qfix.msg.RegistrationInstructions toFix(cl.bithaus.fix.RegistrationInstructions src) {

        cl.bithaus.qfix.msg.RegistrationInstructions dest = new cl.bithaus.qfix.msg.RegistrationInstructions();

        if(src.getRegistID() != null)
            dest.set(new cl.bithaus.qfix.fields.RegistID(src.getRegistID()));
            
        if(src.getRegistTransType() != null)
            if(src.getRegistTransType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.RegistTransType(src.getRegistTransType().charAt(0)));
            
        if(src.getRegistRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.RegistRefID(src.getRegistRefID()));
            
        if(src.getClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdID(src.getClOrdID()));
            
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
            
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
            
        if(src.getRegistAcctType() != null)
            dest.set(new cl.bithaus.qfix.fields.RegistAcctType(src.getRegistAcctType()));
            
        if(src.getTaxAdvantageType() != null)
            dest.set(new cl.bithaus.qfix.fields.TaxAdvantageType(src.getTaxAdvantageType()));
            
        if(src.getOwnershipType() != null)
            if(src.getOwnershipType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.OwnershipType(src.getOwnershipType().charAt(0)));
            

        if(src.getNoRegistDtls() != null && src.getNoRegistDtls().size() > 0) {

            for(cl.bithaus.fix.RegistrationInstructions.NoRegistDtls.NoRegistDtlsEntry entry : src.getNoRegistDtls().getGroups()) {

                cl.bithaus.qfix.msg.RegistrationInstructions.NoRegistDtls aux = 
                    new cl.bithaus.qfix.msg.RegistrationInstructions.NoRegistDtls();

                aux.set(new cl.bithaus.qfix.fields.RegistDtls(entry.getRegistDtls()));
                aux.set(new cl.bithaus.qfix.fields.RegistEmail(entry.getRegistEmail()));
                aux.set(new cl.bithaus.qfix.fields.MailingDtls(entry.getMailingDtls()));
                aux.set(new cl.bithaus.qfix.fields.MailingInst(entry.getMailingInst()));
                aux.set(new cl.bithaus.qfix.fields.OwnerType(entry.getOwnerType()));
                aux.set(new cl.bithaus.qfix.fields.DateOfBirth(entry.getDateOfBirth()));
                aux.set(new cl.bithaus.qfix.fields.InvestorCountryOfResidence(entry.getInvestorCountryOfResidence()));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoDistribInsts() != null && src.getNoDistribInsts().size() > 0) {

            for(cl.bithaus.fix.RegistrationInstructions.NoDistribInsts.NoDistribInstsEntry entry : src.getNoDistribInsts().getGroups()) {

                cl.bithaus.qfix.msg.RegistrationInstructions.NoDistribInsts aux = 
                    new cl.bithaus.qfix.msg.RegistrationInstructions.NoDistribInsts();

                aux.set(new cl.bithaus.qfix.fields.DistribPaymentMethod(entry.getDistribPaymentMethod()));
                aux.set(new cl.bithaus.qfix.fields.DistribPercentage(entry.getDistribPercentage().doubleValue()));
                aux.set(new cl.bithaus.qfix.fields.CashDistribCurr(entry.getCashDistribCurr()));
                aux.set(new cl.bithaus.qfix.fields.CashDistribAgentName(entry.getCashDistribAgentName()));
                aux.set(new cl.bithaus.qfix.fields.CashDistribAgentCode(entry.getCashDistribAgentCode()));
                aux.set(new cl.bithaus.qfix.fields.CashDistribAgentAcctNumber(entry.getCashDistribAgentAcctNumber()));
                aux.set(new cl.bithaus.qfix.fields.CashDistribPayRef(entry.getCashDistribPayRef()));
                aux.set(new cl.bithaus.qfix.fields.CashDistribAgentAcctName(entry.getCashDistribAgentAcctName()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

