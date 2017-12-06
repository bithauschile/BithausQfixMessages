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

/**
 * Fix Components Class
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


}

