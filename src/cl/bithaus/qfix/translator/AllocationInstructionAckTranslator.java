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
 * Fix - Bithaus format component translator for AllocationInstructionAck
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class AllocationInstructionAckTranslator  {

    public static cl.bithaus.qfix.msg.AllocationInstructionAck toFix(cl.bithaus.fix.AllocationInstructionAck src) {

        cl.bithaus.qfix.msg.AllocationInstructionAck dest = new cl.bithaus.qfix.msg.AllocationInstructionAck();

        if(src.getAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocID(src.getAllocID()));
        
        if(src.getSecondaryAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryAllocID(src.getSecondaryAllocID()));
        
        if(src.getTradeDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeDate(src.getTradeDate()));
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getAllocStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocStatus(src.getAllocStatus()));
        
        if(src.getAllocRejCode() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocRejCode(src.getAllocRejCode()));
        
        if(src.getAllocType() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocType(src.getAllocType()));
        
        if(src.getAllocIntermedReqType() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocIntermedReqType(src.getAllocIntermedReqType()));
        
        if(src.getMatchStatus() != null)
            if(src.getMatchStatus().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.MatchStatus(src.getMatchStatus().charAt(0)));
        
        if(src.getProduct() != null)
            dest.set(new cl.bithaus.qfix.fields.Product(src.getProduct()));
        
        if(src.getSecurityType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityType(src.getSecurityType()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));


        if(src.getNoAllocs() != null && src.getNoAllocs().size() > 0) {

            for(cl.bithaus.fix.AllocationInstructionAck.NoAllocs.NoAllocsEntry entry : src.getNoAllocs().getGroups()) {

                cl.bithaus.qfix.msg.AllocationInstructionAck.NoAllocs aux = 
                    new cl.bithaus.qfix.msg.AllocationInstructionAck.NoAllocs();

                aux.set(new cl.bithaus.qfix.fields.AllocAccount(entry.getAllocAccount()));
                aux.set(new cl.bithaus.qfix.fields.AllocAcctIDSource(entry.getAllocAcctIDSource()));
                aux.set(new cl.bithaus.qfix.fields.AllocPrice(entry.getAllocPrice()));
                aux.set(new cl.bithaus.qfix.fields.IndividualAllocID(entry.getIndividualAllocID()));
                aux.set(new cl.bithaus.qfix.fields.IndividualAllocRejCode(entry.getIndividualAllocRejCode()));
                aux.set(new cl.bithaus.qfix.fields.AllocText(entry.getAllocText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedAllocTextLen(entry.getEncodedAllocTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedAllocText(entry.getEncodedAllocText()));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.AllocationInstructionAck fromFix(cl.bithaus.qfix.msg.AllocationInstructionAck src) 
        throws FieldNotFound {

        cl.bithaus.fix.AllocationInstructionAck dest = new cl.bithaus.fix.AllocationInstructionAck();

        if(src.isSetAllocID())
            dest.setAllocID(src.getAllocID().getValue());

        if(src.isSetSecondaryAllocID())
            dest.setSecondaryAllocID(src.getSecondaryAllocID().getValue());

        if(src.isSetTradeDate())
            dest.setTradeDate(src.getTradeDate().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetAllocStatus())
            dest.setAllocStatus(src.getAllocStatus().getValue());

        if(src.isSetAllocRejCode())
            dest.setAllocRejCode(src.getAllocRejCode().getValue());

        if(src.isSetAllocType())
            dest.setAllocType(src.getAllocType().getValue());

        if(src.isSetAllocIntermedReqType())
            dest.setAllocIntermedReqType(src.getAllocIntermedReqType().getValue());

        if(src.isSetMatchStatus())
            dest.setMatchStatus(src.getMatchStatus().getValue()+"");

        if(src.isSetProduct())
            dest.setProduct(src.getProduct().getValue());

        if(src.isSetSecurityType())
            dest.setSecurityType(src.getSecurityType().getValue());

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


        if(src.isSetNoAllocs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoAllocs().getField());
            List<cl.bithaus.fix.AllocationInstructionAck.NoAllocs.NoAllocsEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.AllocAccount allocAccount = new cl.bithaus.qfix.fields.AllocAccount();
            cl.bithaus.qfix.fields.AllocAcctIDSource allocAcctIDSource = new cl.bithaus.qfix.fields.AllocAcctIDSource();
            cl.bithaus.qfix.fields.AllocPrice allocPrice = new cl.bithaus.qfix.fields.AllocPrice();
            cl.bithaus.qfix.fields.IndividualAllocID individualAllocID = new cl.bithaus.qfix.fields.IndividualAllocID();
            cl.bithaus.qfix.fields.IndividualAllocRejCode individualAllocRejCode = new cl.bithaus.qfix.fields.IndividualAllocRejCode();
            cl.bithaus.qfix.fields.AllocText allocText = new cl.bithaus.qfix.fields.AllocText();
            cl.bithaus.qfix.fields.EncodedAllocTextLen encodedAllocTextLen = new cl.bithaus.qfix.fields.EncodedAllocTextLen();
            cl.bithaus.qfix.fields.EncodedAllocText encodedAllocText = new cl.bithaus.qfix.fields.EncodedAllocText();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.AllocationInstructionAck.NoAllocs.NoAllocsEntry entry = 
                    new cl.bithaus.fix.AllocationInstructionAck.NoAllocs.NoAllocsEntry();

                if(g.isSetField(allocAccount)) {
                    allocAccount = (cl.bithaus.qfix.fields.AllocAccount) g.getField(allocAccount);
                    entry.setAllocAccount(allocAccount.getValue());

                }
                if(g.isSetField(allocAcctIDSource)) {
                    allocAcctIDSource = (cl.bithaus.qfix.fields.AllocAcctIDSource) g.getField(allocAcctIDSource);
                    entry.setAllocAcctIDSource(allocAcctIDSource.getValue());

                }
                if(g.isSetField(allocPrice)) {
                    allocPrice = (cl.bithaus.qfix.fields.AllocPrice) g.getField(allocPrice);
                    entry.setAllocPrice(allocPrice.getValue());

                }
                if(g.isSetField(individualAllocID)) {
                    individualAllocID = (cl.bithaus.qfix.fields.IndividualAllocID) g.getField(individualAllocID);
                    entry.setIndividualAllocID(individualAllocID.getValue());

                }
                if(g.isSetField(individualAllocRejCode)) {
                    individualAllocRejCode = (cl.bithaus.qfix.fields.IndividualAllocRejCode) g.getField(individualAllocRejCode);
                    entry.setIndividualAllocRejCode(individualAllocRejCode.getValue());

                }
                if(g.isSetField(allocText)) {
                    allocText = (cl.bithaus.qfix.fields.AllocText) g.getField(allocText);
                    entry.setAllocText(allocText.getValue());

                }
                if(g.isSetField(encodedAllocTextLen)) {
                    encodedAllocTextLen = (cl.bithaus.qfix.fields.EncodedAllocTextLen) g.getField(encodedAllocTextLen);
                    entry.setEncodedAllocTextLen(encodedAllocTextLen.getValue());

                }
                if(g.isSetField(encodedAllocText)) {
                    encodedAllocText = (cl.bithaus.qfix.fields.EncodedAllocText) g.getField(encodedAllocText);
                    entry.setEncodedAllocText(encodedAllocText.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

