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
public class SecurityListUpdateReportTranslator  {

    public static cl.bithaus.qfix.msg.SecurityListUpdateReport toFix(cl.bithaus.fix.SecurityListUpdateReport src) {

        cl.bithaus.qfix.msg.SecurityListUpdateReport dest = new cl.bithaus.qfix.msg.SecurityListUpdateReport();

        if(src.getSecurityReportID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityReportID(src.getSecurityReportID()));
            
        if(src.getSecurityReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityReqID(src.getSecurityReqID()));
            
        if(src.getSecurityResponseID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityResponseID(src.getSecurityResponseID()));
            
        if(src.getSecurityRequestResult() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityRequestResult(src.getSecurityRequestResult()));
            
        if(src.getTotNoRelatedSym() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNoRelatedSym(src.getTotNoRelatedSym()));
            
        if(src.getClearingBusinessDate() != null)
            dest.set(new cl.bithaus.qfix.fields.ClearingBusinessDate(src.getClearingBusinessDate()));
            
        if(src.getSecurityUpdateAction() != null)
            if(src.getSecurityUpdateAction().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SecurityUpdateAction(src.getSecurityUpdateAction().charAt(0)));
            
        if(src.getCorporateAction() != null)
            dest.set(new cl.bithaus.qfix.fields.CorporateAction(src.getCorporateAction()));
            
        if(src.getLastFragment() != null)
            dest.set(new cl.bithaus.qfix.fields.LastFragment(src.getLastFragment()));
            
        if(src.getMarketID() != null)
            dest.set(new cl.bithaus.qfix.fields.MarketID(src.getMarketID()));
            
        if(src.getMarketSegmentID() != null)
            dest.set(new cl.bithaus.qfix.fields.MarketSegmentID(src.getMarketSegmentID()));
            
        if(src.getSecurityListID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityListID(src.getSecurityListID()));
            
        if(src.getSecurityListRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityListRefID(src.getSecurityListRefID()));
            
        if(src.getSecurityListDesc() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityListDesc(src.getSecurityListDesc()));
            
        if(src.getEncodedSecurityListDescLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedSecurityListDescLen(src.getEncodedSecurityListDescLen()));
            
        if(src.getEncodedSecurityListDesc() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedSecurityListDesc(src.getEncodedSecurityListDesc()));
            
        if(src.getSecurityListType() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityListType(src.getSecurityListType()));
            
        if(src.getSecurityListTypeSource() != null)
            dest.set(new cl.bithaus.qfix.fields.SecurityListTypeSource(src.getSecurityListTypeSource()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            


        return dest;
    }


}

