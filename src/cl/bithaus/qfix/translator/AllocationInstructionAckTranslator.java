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


}

