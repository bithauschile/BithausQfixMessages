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
 * Fix - Bithaus format component translator for RegistrationInstructions
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
        

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));


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

    public static cl.bithaus.fix.RegistrationInstructions fromFix(cl.bithaus.qfix.msg.RegistrationInstructions src) 
        throws FieldNotFound {

        cl.bithaus.fix.RegistrationInstructions dest = new cl.bithaus.fix.RegistrationInstructions();

        if(src.isSetRegistID())
            dest.setRegistID(src.getRegistID().getValue());

        if(src.isSetRegistTransType())
            dest.setRegistTransType(src.getRegistTransType().getValue()+"");

        if(src.isSetRegistRefID())
            dest.setRegistRefID(src.getRegistRefID().getValue());

        if(src.isSetClOrdID())
            dest.setClOrdID(src.getClOrdID().getValue());

        if(src.isSetAccount())
            dest.setAccount(src.getAccount().getValue());

        if(src.isSetAcctIDSource())
            dest.setAcctIDSource(src.getAcctIDSource().getValue());

        if(src.isSetRegistAcctType())
            dest.setRegistAcctType(src.getRegistAcctType().getValue());

        if(src.isSetTaxAdvantageType())
            dest.setTaxAdvantageType(src.getTaxAdvantageType().getValue());

        if(src.isSetOwnershipType())
            dest.setOwnershipType(src.getOwnershipType().getValue()+"");


        if(src.getParties() != null)
            dest.setParties(cl.bithaus.qfix.translator.component.PartiesTranslator.fromFix(src.getParties()));



        if(src.isSetNoRegistDtls()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoRegistDtls().getField());
            List<cl.bithaus.fix.RegistrationInstructions.NoRegistDtls.NoRegistDtlsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.RegistDtls registDtls = new cl.bithaus.qfix.fields.RegistDtls();
            cl.bithaus.qfix.fields.RegistEmail registEmail = new cl.bithaus.qfix.fields.RegistEmail();
            cl.bithaus.qfix.fields.MailingDtls mailingDtls = new cl.bithaus.qfix.fields.MailingDtls();
            cl.bithaus.qfix.fields.MailingInst mailingInst = new cl.bithaus.qfix.fields.MailingInst();
            cl.bithaus.qfix.fields.OwnerType ownerType = new cl.bithaus.qfix.fields.OwnerType();
            cl.bithaus.qfix.fields.DateOfBirth dateOfBirth = new cl.bithaus.qfix.fields.DateOfBirth();
            cl.bithaus.qfix.fields.InvestorCountryOfResidence investorCountryOfResidence = new cl.bithaus.qfix.fields.InvestorCountryOfResidence();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.RegistrationInstructions.NoRegistDtls.NoRegistDtlsEntry entry = 
                    new cl.bithaus.fix.RegistrationInstructions.NoRegistDtls.NoRegistDtlsEntry();

                if(g.isSetField(registDtls)) {
                    registDtls = (cl.bithaus.qfix.fields.RegistDtls) g.getField(registDtls);
                    entry.setRegistDtls(registDtls.getValue());

                }
                if(g.isSetField(registEmail)) {
                    registEmail = (cl.bithaus.qfix.fields.RegistEmail) g.getField(registEmail);
                    entry.setRegistEmail(registEmail.getValue());

                }
                if(g.isSetField(mailingDtls)) {
                    mailingDtls = (cl.bithaus.qfix.fields.MailingDtls) g.getField(mailingDtls);
                    entry.setMailingDtls(mailingDtls.getValue());

                }
                if(g.isSetField(mailingInst)) {
                    mailingInst = (cl.bithaus.qfix.fields.MailingInst) g.getField(mailingInst);
                    entry.setMailingInst(mailingInst.getValue());

                }
                if(g.isSetField(ownerType)) {
                    ownerType = (cl.bithaus.qfix.fields.OwnerType) g.getField(ownerType);
                    entry.setOwnerType(ownerType.getValue());

                }
                if(g.isSetField(dateOfBirth)) {
                    dateOfBirth = (cl.bithaus.qfix.fields.DateOfBirth) g.getField(dateOfBirth);
                    entry.setDateOfBirth(dateOfBirth.getValue());

                }
                if(g.isSetField(investorCountryOfResidence)) {
                    investorCountryOfResidence = (cl.bithaus.qfix.fields.InvestorCountryOfResidence) g.getField(investorCountryOfResidence);
                    entry.setInvestorCountryOfResidence(investorCountryOfResidence.getValue());

                }

                result.add(entry);                
            }

        }
        if(src.isSetNoDistribInsts()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoDistribInsts().getField());
            List<cl.bithaus.fix.RegistrationInstructions.NoDistribInsts.NoDistribInstsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.DistribPaymentMethod distribPaymentMethod = new cl.bithaus.qfix.fields.DistribPaymentMethod();
            cl.bithaus.qfix.fields.DistribPercentage distribPercentage = new cl.bithaus.qfix.fields.DistribPercentage();
            cl.bithaus.qfix.fields.CashDistribCurr cashDistribCurr = new cl.bithaus.qfix.fields.CashDistribCurr();
            cl.bithaus.qfix.fields.CashDistribAgentName cashDistribAgentName = new cl.bithaus.qfix.fields.CashDistribAgentName();
            cl.bithaus.qfix.fields.CashDistribAgentCode cashDistribAgentCode = new cl.bithaus.qfix.fields.CashDistribAgentCode();
            cl.bithaus.qfix.fields.CashDistribAgentAcctNumber cashDistribAgentAcctNumber = new cl.bithaus.qfix.fields.CashDistribAgentAcctNumber();
            cl.bithaus.qfix.fields.CashDistribPayRef cashDistribPayRef = new cl.bithaus.qfix.fields.CashDistribPayRef();
            cl.bithaus.qfix.fields.CashDistribAgentAcctName cashDistribAgentAcctName = new cl.bithaus.qfix.fields.CashDistribAgentAcctName();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.RegistrationInstructions.NoDistribInsts.NoDistribInstsEntry entry = 
                    new cl.bithaus.fix.RegistrationInstructions.NoDistribInsts.NoDistribInstsEntry();

                if(g.isSetField(distribPaymentMethod)) {
                    distribPaymentMethod = (cl.bithaus.qfix.fields.DistribPaymentMethod) g.getField(distribPaymentMethod);
                    entry.setDistribPaymentMethod(distribPaymentMethod.getValue());

                }
                if(g.isSetField(distribPercentage)) {
                    distribPercentage = (cl.bithaus.qfix.fields.DistribPercentage) g.getField(distribPercentage);
                    entry.setDistribPercentage(new BigDecimal(distribPercentage.getValue()));
                }
                if(g.isSetField(cashDistribCurr)) {
                    cashDistribCurr = (cl.bithaus.qfix.fields.CashDistribCurr) g.getField(cashDistribCurr);
                    entry.setCashDistribCurr(cashDistribCurr.getValue());

                }
                if(g.isSetField(cashDistribAgentName)) {
                    cashDistribAgentName = (cl.bithaus.qfix.fields.CashDistribAgentName) g.getField(cashDistribAgentName);
                    entry.setCashDistribAgentName(cashDistribAgentName.getValue());

                }
                if(g.isSetField(cashDistribAgentCode)) {
                    cashDistribAgentCode = (cl.bithaus.qfix.fields.CashDistribAgentCode) g.getField(cashDistribAgentCode);
                    entry.setCashDistribAgentCode(cashDistribAgentCode.getValue());

                }
                if(g.isSetField(cashDistribAgentAcctNumber)) {
                    cashDistribAgentAcctNumber = (cl.bithaus.qfix.fields.CashDistribAgentAcctNumber) g.getField(cashDistribAgentAcctNumber);
                    entry.setCashDistribAgentAcctNumber(cashDistribAgentAcctNumber.getValue());

                }
                if(g.isSetField(cashDistribPayRef)) {
                    cashDistribPayRef = (cl.bithaus.qfix.fields.CashDistribPayRef) g.getField(cashDistribPayRef);
                    entry.setCashDistribPayRef(cashDistribPayRef.getValue());

                }
                if(g.isSetField(cashDistribAgentAcctName)) {
                    cashDistribAgentAcctName = (cl.bithaus.qfix.fields.CashDistribAgentAcctName) g.getField(cashDistribAgentAcctName);
                    entry.setCashDistribAgentAcctName(cashDistribAgentAcctName.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

