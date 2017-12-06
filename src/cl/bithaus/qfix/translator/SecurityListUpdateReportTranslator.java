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
 * Fix - Bithaus format component translator for SecurityListUpdateReport
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
        

        if(src.getSecLstUpdRelSymGrp() != null)
            dest.set(cl.bithaus.qfix.translator.component.SecLstUpdRelSymGrpTranslator.toFix(src.getSecLstUpdRelSymGrp()));

        if(src.getApplicationSequenceControl() != null)
            dest.set(cl.bithaus.qfix.translator.component.ApplicationSequenceControlTranslator.toFix(src.getApplicationSequenceControl()));



        return dest;
    }

    public static cl.bithaus.fix.SecurityListUpdateReport fromFix(cl.bithaus.qfix.msg.SecurityListUpdateReport src) 
        throws FieldNotFound {

        cl.bithaus.fix.SecurityListUpdateReport dest = new cl.bithaus.fix.SecurityListUpdateReport();

        if(src.isSetSecurityReportID())
            dest.setSecurityReportID(src.getSecurityReportID().getValue());

        if(src.isSetSecurityReqID())
            dest.setSecurityReqID(src.getSecurityReqID().getValue());

        if(src.isSetSecurityResponseID())
            dest.setSecurityResponseID(src.getSecurityResponseID().getValue());

        if(src.isSetSecurityRequestResult())
            dest.setSecurityRequestResult(src.getSecurityRequestResult().getValue());

        if(src.isSetTotNoRelatedSym())
            dest.setTotNoRelatedSym(src.getTotNoRelatedSym().getValue());

        if(src.isSetClearingBusinessDate())
            dest.setClearingBusinessDate(src.getClearingBusinessDate().getValue());

        if(src.isSetSecurityUpdateAction())
            dest.setSecurityUpdateAction(src.getSecurityUpdateAction().getValue()+"");

        if(src.isSetCorporateAction())
            dest.setCorporateAction(src.getCorporateAction().getValue());

        if(src.isSetLastFragment())
            dest.setLastFragment(src.getLastFragment().getValue());

        if(src.isSetMarketID())
            dest.setMarketID(src.getMarketID().getValue());

        if(src.isSetMarketSegmentID())
            dest.setMarketSegmentID(src.getMarketSegmentID().getValue());

        if(src.isSetSecurityListID())
            dest.setSecurityListID(src.getSecurityListID().getValue());

        if(src.isSetSecurityListRefID())
            dest.setSecurityListRefID(src.getSecurityListRefID().getValue());

        if(src.isSetSecurityListDesc())
            dest.setSecurityListDesc(src.getSecurityListDesc().getValue());

        if(src.isSetEncodedSecurityListDescLen())
            dest.setEncodedSecurityListDescLen(src.getEncodedSecurityListDescLen().getValue());

        if(src.isSetEncodedSecurityListDesc())
            dest.setEncodedSecurityListDesc(src.getEncodedSecurityListDesc().getValue());

        if(src.isSetSecurityListType())
            dest.setSecurityListType(src.getSecurityListType().getValue());

        if(src.isSetSecurityListTypeSource())
            dest.setSecurityListTypeSource(src.getSecurityListTypeSource().getValue());

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());


        if(src.getSecLstUpdRelSymGrp() != null)
            dest.setSecLstUpdRelSymGrp(cl.bithaus.qfix.translator.component.SecLstUpdRelSymGrpTranslator.fromFix(src.getSecLstUpdRelSymGrp()));

        if(src.getApplicationSequenceControl() != null)
            dest.setApplicationSequenceControl(cl.bithaus.qfix.translator.component.ApplicationSequenceControlTranslator.fromFix(src.getApplicationSequenceControl()));



        return dest;

    }
}

