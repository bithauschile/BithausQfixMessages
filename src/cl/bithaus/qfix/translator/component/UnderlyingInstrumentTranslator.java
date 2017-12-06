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

package cl.bithaus.qfix.translator.component;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import quickfix.FieldNotFound;


/**
 * Fix - Bithaus format component translator for UnderlyingInstrument
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class UnderlyingInstrumentTranslator  {

    public static cl.bithaus.qfix.msg.component.UnderlyingInstrument toFix(cl.bithaus.fix.components.UnderlyingInstrument src) {

        cl.bithaus.qfix.msg.component.UnderlyingInstrument dest = new cl.bithaus.qfix.msg.component.UnderlyingInstrument();

        if(src.getUnderlyingSymbol() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingSymbol(src.getUnderlyingSymbol()));
            
        if(src.getUnderlyingSymbolSfx() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingSymbolSfx(src.getUnderlyingSymbolSfx()));
            
        if(src.getUnderlyingSecurityID() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingSecurityID(src.getUnderlyingSecurityID()));
            
        if(src.getUnderlyingSecurityIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingSecurityIDSource(src.getUnderlyingSecurityIDSource()));
            
        if(src.getUnderlyingProduct() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingProduct(src.getUnderlyingProduct()));
            
        if(src.getUnderlyingCFICode() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingCFICode(src.getUnderlyingCFICode()));
            
        if(src.getUnderlyingSecurityType() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingSecurityType(src.getUnderlyingSecurityType()));
            
        if(src.getUnderlyingSecuritySubType() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingSecuritySubType(src.getUnderlyingSecuritySubType()));
            
        if(src.getUnderlyingMaturityMonthYear() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingMaturityMonthYear(src.getUnderlyingMaturityMonthYear()));
            
        if(src.getUnderlyingMaturityDate() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingMaturityDate(src.getUnderlyingMaturityDate()));
            
        if(src.getUnderlyingCouponPaymentDate() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingCouponPaymentDate(src.getUnderlyingCouponPaymentDate()));
            
        if(src.getUnderlyingIssueDate() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingIssueDate(src.getUnderlyingIssueDate()));
            
        if(src.getUnderlyingRepoCollateralSecurityType() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingRepoCollateralSecurityType(src.getUnderlyingRepoCollateralSecurityType()));
            
        if(src.getUnderlyingRepurchaseTerm() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingRepurchaseTerm(src.getUnderlyingRepurchaseTerm()));
            
        if(src.getUnderlyingRepurchaseRate() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingRepurchaseRate(src.getUnderlyingRepurchaseRate().doubleValue()));
            
        if(src.getUnderlyingFactor() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingFactor(src.getUnderlyingFactor().floatValue()));
            
        if(src.getUnderlyingCreditRating() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingCreditRating(src.getUnderlyingCreditRating()));
            
        if(src.getUnderlyingInstrRegistry() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingInstrRegistry(src.getUnderlyingInstrRegistry()));
            
        if(src.getUnderlyingCountryOfIssue() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingCountryOfIssue(src.getUnderlyingCountryOfIssue()));
            
        if(src.getUnderlyingStateOrProvinceOfIssue() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingStateOrProvinceOfIssue(src.getUnderlyingStateOrProvinceOfIssue()));
            
        if(src.getUnderlyingLocaleOfIssue() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingLocaleOfIssue(src.getUnderlyingLocaleOfIssue()));
            
        if(src.getUnderlyingRedemptionDate() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingRedemptionDate(src.getUnderlyingRedemptionDate()));
            
        if(src.getUnderlyingStrikePrice() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingStrikePrice(src.getUnderlyingStrikePrice()));
            
        if(src.getUnderlyingStrikeCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingStrikeCurrency(src.getUnderlyingStrikeCurrency()));
            
        if(src.getUnderlyingOptAttribute() != null)
            if(src.getUnderlyingOptAttribute().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.UnderlyingOptAttribute(src.getUnderlyingOptAttribute().charAt(0)));
            
        if(src.getUnderlyingContractMultiplier() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingContractMultiplier(src.getUnderlyingContractMultiplier().floatValue()));
            
        if(src.getUnderlyingCouponRate() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingCouponRate(src.getUnderlyingCouponRate().doubleValue()));
            
        if(src.getUnderlyingSecurityExchange() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingSecurityExchange(src.getUnderlyingSecurityExchange()));
            
        if(src.getUnderlyingIssuer() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingIssuer(src.getUnderlyingIssuer()));
            
        if(src.getEncodedUnderlyingIssuerLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedUnderlyingIssuerLen(src.getEncodedUnderlyingIssuerLen()));
            
        if(src.getEncodedUnderlyingIssuer() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedUnderlyingIssuer(src.getEncodedUnderlyingIssuer()));
            
        if(src.getUnderlyingSecurityDesc() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingSecurityDesc(src.getUnderlyingSecurityDesc()));
            
        if(src.getEncodedUnderlyingSecurityDescLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedUnderlyingSecurityDescLen(src.getEncodedUnderlyingSecurityDescLen()));
            
        if(src.getEncodedUnderlyingSecurityDesc() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedUnderlyingSecurityDesc(src.getEncodedUnderlyingSecurityDesc()));
            
        if(src.getUnderlyingCPProgram() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingCPProgram(src.getUnderlyingCPProgram()));
            
        if(src.getUnderlyingCPRegType() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingCPRegType(src.getUnderlyingCPRegType()));
            
        if(src.getUnderlyingCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingCurrency(src.getUnderlyingCurrency()));
            
        if(src.getUnderlyingQty() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingQty(src.getUnderlyingQty()));
            
        if(src.getUnderlyingPx() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingPx(src.getUnderlyingPx()));
            
        if(src.getUnderlyingDirtyPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingDirtyPrice(src.getUnderlyingDirtyPrice()));
            
        if(src.getUnderlyingEndPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingEndPrice(src.getUnderlyingEndPrice()));
            
        if(src.getUnderlyingStartValue() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingStartValue(src.getUnderlyingStartValue()));
            
        if(src.getUnderlyingCurrentValue() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingCurrentValue(src.getUnderlyingCurrentValue()));
            
        if(src.getUnderlyingEndValue() != null)
            dest.set(new cl.bithaus.qfix.fields.UnderlyingEndValue(src.getUnderlyingEndValue()));
            

        if(src.getNoUnderlyingSecurityAltID() != null && src.getNoUnderlyingSecurityAltID().size() > 0) {

            for(cl.bithaus.fix.components.UnderlyingInstrument.NoUnderlyingSecurityAltID.NoUnderlyingSecurityAltIDEntry entry : src.getNoUnderlyingSecurityAltID().getGroups()) {

                cl.bithaus.qfix.msg.component.UnderlyingInstrument.NoUnderlyingSecurityAltID aux = 
                    new cl.bithaus.qfix.msg.component.UnderlyingInstrument.NoUnderlyingSecurityAltID();

                aux.set(new cl.bithaus.qfix.fields.UnderlyingSecurityAltID(entry.getUnderlyingSecurityAltID()));
                aux.set(new cl.bithaus.qfix.fields.UnderlyingSecurityAltIDSource(entry.getUnderlyingSecurityAltIDSource()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }

    public static cl.bithaus.fix.components.UnderlyingInstrument fromFix(cl.bithaus.qfix.msg.component.UnderlyingInstrument src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.UnderlyingInstrument dest = new cl.bithaus.fix.components.UnderlyingInstrument();

        if(src.isSetUnderlyingSymbol())
            dest.setUnderlyingSymbol(src.getUnderlyingSymbol().getValue());
        if(src.isSetUnderlyingSymbolSfx())
            dest.setUnderlyingSymbolSfx(src.getUnderlyingSymbolSfx().getValue());
        if(src.isSetUnderlyingSecurityID())
            dest.setUnderlyingSecurityID(src.getUnderlyingSecurityID().getValue());
        if(src.isSetUnderlyingSecurityIDSource())
            dest.setUnderlyingSecurityIDSource(src.getUnderlyingSecurityIDSource().getValue());
        if(src.isSetUnderlyingProduct())
            dest.setUnderlyingProduct(src.getUnderlyingProduct().getValue());
        if(src.isSetUnderlyingCFICode())
            dest.setUnderlyingCFICode(src.getUnderlyingCFICode().getValue());
        if(src.isSetUnderlyingSecurityType())
            dest.setUnderlyingSecurityType(src.getUnderlyingSecurityType().getValue());
        if(src.isSetUnderlyingSecuritySubType())
            dest.setUnderlyingSecuritySubType(src.getUnderlyingSecuritySubType().getValue());
        if(src.isSetUnderlyingMaturityMonthYear())
            dest.setUnderlyingMaturityMonthYear(src.getUnderlyingMaturityMonthYear().getValue());
        if(src.isSetUnderlyingMaturityDate())
            dest.setUnderlyingMaturityDate(src.getUnderlyingMaturityDate().getValue());
        if(src.isSetUnderlyingCouponPaymentDate())
            dest.setUnderlyingCouponPaymentDate(src.getUnderlyingCouponPaymentDate().getValue());
        if(src.isSetUnderlyingIssueDate())
            dest.setUnderlyingIssueDate(src.getUnderlyingIssueDate().getValue());
        if(src.isSetUnderlyingRepoCollateralSecurityType())
            dest.setUnderlyingRepoCollateralSecurityType(src.getUnderlyingRepoCollateralSecurityType().getValue());
        if(src.isSetUnderlyingRepurchaseTerm())
            dest.setUnderlyingRepurchaseTerm(src.getUnderlyingRepurchaseTerm().getValue());
        if(src.isSetUnderlyingRepurchaseRate())
            dest.setUnderlyingRepurchaseRate(new BigDecimal(src.getUnderlyingRepurchaseRate().getValue()));
        if(src.isSetUnderlyingFactor())
            dest.setUnderlyingFactor(new BigDecimal(src.getUnderlyingFactor().getValue()));
        if(src.isSetUnderlyingCreditRating())
            dest.setUnderlyingCreditRating(src.getUnderlyingCreditRating().getValue());
        if(src.isSetUnderlyingInstrRegistry())
            dest.setUnderlyingInstrRegistry(src.getUnderlyingInstrRegistry().getValue());
        if(src.isSetUnderlyingCountryOfIssue())
            dest.setUnderlyingCountryOfIssue(src.getUnderlyingCountryOfIssue().getValue());
        if(src.isSetUnderlyingStateOrProvinceOfIssue())
            dest.setUnderlyingStateOrProvinceOfIssue(src.getUnderlyingStateOrProvinceOfIssue().getValue());
        if(src.isSetUnderlyingLocaleOfIssue())
            dest.setUnderlyingLocaleOfIssue(src.getUnderlyingLocaleOfIssue().getValue());
        if(src.isSetUnderlyingRedemptionDate())
            dest.setUnderlyingRedemptionDate(src.getUnderlyingRedemptionDate().getValue());
        if(src.isSetUnderlyingStrikePrice())
            dest.setUnderlyingStrikePrice(src.getUnderlyingStrikePrice().getValue());
        if(src.isSetUnderlyingStrikeCurrency())
            dest.setUnderlyingStrikeCurrency(src.getUnderlyingStrikeCurrency().getValue());
        if(src.isSetUnderlyingOptAttribute())
            dest.setUnderlyingOptAttribute(src.getUnderlyingOptAttribute().getValue()+"");
        if(src.isSetUnderlyingContractMultiplier())
            dest.setUnderlyingContractMultiplier(new BigDecimal(src.getUnderlyingContractMultiplier().getValue()));
        if(src.isSetUnderlyingCouponRate())
            dest.setUnderlyingCouponRate(new BigDecimal(src.getUnderlyingCouponRate().getValue()));
        if(src.isSetUnderlyingSecurityExchange())
            dest.setUnderlyingSecurityExchange(src.getUnderlyingSecurityExchange().getValue());
        if(src.isSetUnderlyingIssuer())
            dest.setUnderlyingIssuer(src.getUnderlyingIssuer().getValue());
        if(src.isSetEncodedUnderlyingIssuerLen())
            dest.setEncodedUnderlyingIssuerLen(src.getEncodedUnderlyingIssuerLen().getValue());
        if(src.isSetEncodedUnderlyingIssuer())
            dest.setEncodedUnderlyingIssuer(src.getEncodedUnderlyingIssuer().getValue());
        if(src.isSetUnderlyingSecurityDesc())
            dest.setUnderlyingSecurityDesc(src.getUnderlyingSecurityDesc().getValue());
        if(src.isSetEncodedUnderlyingSecurityDescLen())
            dest.setEncodedUnderlyingSecurityDescLen(src.getEncodedUnderlyingSecurityDescLen().getValue());
        if(src.isSetEncodedUnderlyingSecurityDesc())
            dest.setEncodedUnderlyingSecurityDesc(src.getEncodedUnderlyingSecurityDesc().getValue());
        if(src.isSetUnderlyingCPProgram())
            dest.setUnderlyingCPProgram(src.getUnderlyingCPProgram().getValue());
        if(src.isSetUnderlyingCPRegType())
            dest.setUnderlyingCPRegType(src.getUnderlyingCPRegType().getValue());
        if(src.isSetUnderlyingCurrency())
            dest.setUnderlyingCurrency(src.getUnderlyingCurrency().getValue());
        if(src.isSetUnderlyingQty())
            dest.setUnderlyingQty(src.getUnderlyingQty().getValue());
        if(src.isSetUnderlyingPx())
            dest.setUnderlyingPx(src.getUnderlyingPx().getValue());
        if(src.isSetUnderlyingDirtyPrice())
            dest.setUnderlyingDirtyPrice(src.getUnderlyingDirtyPrice().getValue());
        if(src.isSetUnderlyingEndPrice())
            dest.setUnderlyingEndPrice(src.getUnderlyingEndPrice().getValue());
        if(src.isSetUnderlyingStartValue())
            dest.setUnderlyingStartValue(src.getUnderlyingStartValue().getValue());
        if(src.isSetUnderlyingCurrentValue())
            dest.setUnderlyingCurrentValue(src.getUnderlyingCurrentValue().getValue());
        if(src.isSetUnderlyingEndValue())
            dest.setUnderlyingEndValue(src.getUnderlyingEndValue().getValue());

        if(src.isSetNoUnderlyingSecurityAltID()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyingSecurityAltID().getField());
            List<cl.bithaus.fix.components.UnderlyingInstrument.NoUnderlyingSecurityAltID.NoUnderlyingSecurityAltIDEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.UnderlyingSecurityAltID underlyingSecurityAltID = new cl.bithaus.qfix.fields.UnderlyingSecurityAltID();
            cl.bithaus.qfix.fields.UnderlyingSecurityAltIDSource underlyingSecurityAltIDSource = new cl.bithaus.qfix.fields.UnderlyingSecurityAltIDSource();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.UnderlyingInstrument.NoUnderlyingSecurityAltID.NoUnderlyingSecurityAltIDEntry entry = 
                    new cl.bithaus.fix.components.UnderlyingInstrument.NoUnderlyingSecurityAltID.NoUnderlyingSecurityAltIDEntry();

                if(g.isSetField(underlyingSecurityAltID)) {
                    underlyingSecurityAltID = (cl.bithaus.qfix.fields.UnderlyingSecurityAltID) g.getField(underlyingSecurityAltID);
                    entry.setUnderlyingSecurityAltID(underlyingSecurityAltID.getValue());

                }
                if(g.isSetField(underlyingSecurityAltIDSource)) {
                    underlyingSecurityAltIDSource = (cl.bithaus.qfix.fields.UnderlyingSecurityAltIDSource) g.getField(underlyingSecurityAltIDSource);
                    entry.setUnderlyingSecurityAltIDSource(underlyingSecurityAltIDSource.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

