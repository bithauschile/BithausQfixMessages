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
public class SettlementInstructionRequestTranslator  {

    public static cl.bithaus.qfix.msg.SettlementInstructionRequest toFix(cl.bithaus.fix.SettlementInstructionRequest src) {

        cl.bithaus.qfix.msg.SettlementInstructionRequest dest = new cl.bithaus.qfix.msg.SettlementInstructionRequest();

        if(src.getSettlInstReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlInstReqID(src.getSettlInstReqID()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
        if(src.getAllocAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocAccount(src.getAllocAccount()));
            
        if(src.getAllocAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocAcctIDSource(src.getAllocAcctIDSource()));
            
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
            
        if(src.getProduct() != null)
            dest.set(new cl.bithaus.qfix.fields.Product(src.getProduct()));
            
        if(src.getSecurityType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityType(src.getSecurityType()));
            
        if(src.getCFICode() != null)
            dest.set(new cl.bithaus.qfix.fields.CFICode(src.getCFICode()));
            
        if(src.getEffectiveTime() != null)
            dest.set(new cl.bithaus.qfix.fields.EffectiveTime(src.getEffectiveTime()));
            
        if(src.getExpireTime() != null)
            dest.set(new cl.bithaus.qfix.fields.ExpireTime(src.getExpireTime()));
            
        if(src.getLastUpdateTime() != null)
            dest.set(new cl.bithaus.qfix.fields.LastUpdateTime(src.getLastUpdateTime()));
            
        if(src.getStandInstDbType() != null)
            dest.set(new cl.bithaus.qfix.fields.StandInstDbType(src.getStandInstDbType()));
            
        if(src.getStandInstDbName() != null)
            dest.set(new cl.bithaus.qfix.fields.StandInstDbName(src.getStandInstDbName()));
            
        if(src.getStandInstDbID() != null)
            dest.set(new cl.bithaus.qfix.fields.StandInstDbID(src.getStandInstDbID()));
            


        return dest;
    }


}
