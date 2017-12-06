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
 * Fix - Bithaus format component translator for OrderCancelRequest
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class OrderCancelRequestTranslator  {

    public static cl.bithaus.qfix.msg.OrderCancelRequest toFix(cl.bithaus.fix.OrderCancelRequest src) {

        cl.bithaus.qfix.msg.OrderCancelRequest dest = new cl.bithaus.qfix.msg.OrderCancelRequest();

        if(src.getOrigClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigClOrdID(src.getOrigClOrdID()));
        
        if(src.getOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderID(src.getOrderID()));
        
        if(src.getClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdID(src.getClOrdID()));
        
        if(src.getSecondaryClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(src.getSecondaryClOrdID()));
        
        if(src.getClOrdLinkID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdLinkID(src.getClOrdLinkID()));
        
        if(src.getListID() != null)
            dest.set(new cl.bithaus.qfix.fields.ListID(src.getListID()));
        
        if(src.getOrigOrdModTime() != null)
            dest.set(new cl.bithaus.qfix.fields.OrigOrdModTime(src.getOrigOrdModTime()));
        
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
        
        if(src.getAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AcctIDSource(src.getAcctIDSource()));
        
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
        
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
        
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
        
        if(src.getComplianceID() != null)
            dest.set(new cl.bithaus.qfix.fields.ComplianceID(src.getComplianceID()));
        
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
        
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
        
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
        
        if(src.getMoveToOIB() != null)
            dest.set(new cl.bithaus.qfix.fields.MoveToOIB(src.getMoveToOIB()));
        
        if(src.getExDestination() != null)
            dest.set(new cl.bithaus.qfix.fields.ExDestination(src.getExDestination()));
        

        if(src.getParties() != null)
            dest.set(cl.bithaus.qfix.translator.component.PartiesTranslator.toFix(src.getParties()));

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));

        if(src.getFinancingDetails() != null)
            dest.set(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.toFix(src.getFinancingDetails()));

        if(src.getOrderQtyData() != null)
            dest.set(cl.bithaus.qfix.translator.component.OrderQtyDataTranslator.toFix(src.getOrderQtyData()));

        if(src.getSpecialOrderData() != null)
            dest.set(cl.bithaus.qfix.translator.component.SpecialOrderDataTranslator.toFix(src.getSpecialOrderData()));


        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.OrderCancelRequest.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.OrderCancelRequest.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.OrderCancelRequest.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.OrderCancelRequest fromFix(cl.bithaus.qfix.msg.OrderCancelRequest src) 
        throws FieldNotFound {

        cl.bithaus.fix.OrderCancelRequest dest = new cl.bithaus.fix.OrderCancelRequest();

        if(src.isSetOrigClOrdID())
            dest.setOrigClOrdID(src.getOrigClOrdID().getValue());

        if(src.isSetOrderID())
            dest.setOrderID(src.getOrderID().getValue());

        if(src.isSetClOrdID())
            dest.setClOrdID(src.getClOrdID().getValue());

        if(src.isSetSecondaryClOrdID())
            dest.setSecondaryClOrdID(src.getSecondaryClOrdID().getValue());

        if(src.isSetClOrdLinkID())
            dest.setClOrdLinkID(src.getClOrdLinkID().getValue());

        if(src.isSetListID())
            dest.setListID(src.getListID().getValue());

        if(src.isSetOrigOrdModTime())
            dest.setOrigOrdModTime(src.getOrigOrdModTime().getValue());

        if(src.isSetAccount())
            dest.setAccount(src.getAccount().getValue());

        if(src.isSetAcctIDSource())
            dest.setAcctIDSource(src.getAcctIDSource().getValue());

        if(src.isSetAccountType())
            dest.setAccountType(src.getAccountType().getValue());

        if(src.isSetSide())
            dest.setSide(src.getSide().getValue()+"");

        if(src.isSetTransactTime())
            dest.setTransactTime(src.getTransactTime().getValue());

        if(src.isSetComplianceID())
            dest.setComplianceID(src.getComplianceID().getValue());

        if(src.isSetText())
            dest.setText(src.getText().getValue());

        if(src.isSetEncodedTextLen())
            dest.setEncodedTextLen(src.getEncodedTextLen().getValue());

        if(src.isSetEncodedText())
            dest.setEncodedText(src.getEncodedText().getValue());

        if(src.isSetMoveToOIB())
            dest.setMoveToOIB(src.getMoveToOIB().getValue());

        if(src.isSetExDestination())
            dest.setExDestination(src.getExDestination().getValue());


        if(src.getParties() != null)
            dest.setParties(cl.bithaus.qfix.translator.component.PartiesTranslator.fromFix(src.getParties()));

        if(src.getInstrument() != null)
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));

        if(src.getFinancingDetails() != null)
            dest.setFinancingDetails(cl.bithaus.qfix.translator.component.FinancingDetailsTranslator.fromFix(src.getFinancingDetails()));

        if(src.getOrderQtyData() != null)
            dest.setOrderQtyData(cl.bithaus.qfix.translator.component.OrderQtyDataTranslator.fromFix(src.getOrderQtyData()));

        if(src.getSpecialOrderData() != null)
            dest.setSpecialOrderData(cl.bithaus.qfix.translator.component.SpecialOrderDataTranslator.fromFix(src.getSpecialOrderData()));



        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.OrderCancelRequest.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.OrderCancelRequest.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.OrderCancelRequest.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        return dest;

    }
}

