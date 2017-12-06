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
public class InstrumentLegTranslator  {

    public static cl.bithaus.qfix.msg.component.InstrumentLeg toFix(cl.bithaus.fix.components.InstrumentLeg src) {

        cl.bithaus.qfix.msg.component.InstrumentLeg dest = new cl.bithaus.qfix.msg.component.InstrumentLeg();

        if(src.getLegSymbol() != null)
            dest.set(new cl.bithaus.qfix.fields.LegSymbol(src.getLegSymbol()));
            
        if(src.getLegSymbolSfx() != null)
            dest.set(new cl.bithaus.qfix.fields.LegSymbolSfx(src.getLegSymbolSfx()));
            
        if(src.getLegSecurityID() != null)
            dest.set(new cl.bithaus.qfix.fields.LegSecurityID(src.getLegSecurityID()));
            
        if(src.getLegSecurityIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.LegSecurityIDSource(src.getLegSecurityIDSource()));
            
        if(src.getLegProduct() != null)
            dest.set(new cl.bithaus.qfix.fields.LegProduct(src.getLegProduct()));
            
        if(src.getLegCFICode() != null)
            dest.set(new cl.bithaus.qfix.fields.LegCFICode(src.getLegCFICode()));
            
        if(src.getLegSecurityType() != null)
            dest.set(new cl.bithaus.qfix.fields.LegSecurityType(src.getLegSecurityType()));
            
        if(src.getLegSecuritySubType() != null)
            dest.set(new cl.bithaus.qfix.fields.LegSecuritySubType(src.getLegSecuritySubType()));
            
        if(src.getLegMaturityMonthYear() != null)
            dest.set(new cl.bithaus.qfix.fields.LegMaturityMonthYear(src.getLegMaturityMonthYear()));
            
        if(src.getLegMaturityDate() != null)
            dest.set(new cl.bithaus.qfix.fields.LegMaturityDate(src.getLegMaturityDate()));
            
        if(src.getLegCouponPaymentDate() != null)
            dest.set(new cl.bithaus.qfix.fields.LegCouponPaymentDate(src.getLegCouponPaymentDate()));
            
        if(src.getLegIssueDate() != null)
            dest.set(new cl.bithaus.qfix.fields.LegIssueDate(src.getLegIssueDate()));
            
        if(src.getLegRepoCollateralSecurityType() != null)
            dest.set(new cl.bithaus.qfix.fields.LegRepoCollateralSecurityType(src.getLegRepoCollateralSecurityType()));
            
        if(src.getLegRepurchaseTerm() != null)
            dest.set(new cl.bithaus.qfix.fields.LegRepurchaseTerm(src.getLegRepurchaseTerm()));
            
        if(src.getLegRepurchaseRate() != null)
            dest.set(new cl.bithaus.qfix.fields.LegRepurchaseRate(src.getLegRepurchaseRate().doubleValue()));
            
        if(src.getLegFactor() != null)
            dest.set(new cl.bithaus.qfix.fields.LegFactor(src.getLegFactor().floatValue()));
            
        if(src.getLegCreditRating() != null)
            dest.set(new cl.bithaus.qfix.fields.LegCreditRating(src.getLegCreditRating()));
            
        if(src.getLegInstrRegistry() != null)
            dest.set(new cl.bithaus.qfix.fields.LegInstrRegistry(src.getLegInstrRegistry()));
            
        if(src.getLegCountryOfIssue() != null)
            dest.set(new cl.bithaus.qfix.fields.LegCountryOfIssue(src.getLegCountryOfIssue()));
            
        if(src.getLegStateOrProvinceOfIssue() != null)
            dest.set(new cl.bithaus.qfix.fields.LegStateOrProvinceOfIssue(src.getLegStateOrProvinceOfIssue()));
            
        if(src.getLegLocaleOfIssue() != null)
            dest.set(new cl.bithaus.qfix.fields.LegLocaleOfIssue(src.getLegLocaleOfIssue()));
            
        if(src.getLegRedemptionDate() != null)
            dest.set(new cl.bithaus.qfix.fields.LegRedemptionDate(src.getLegRedemptionDate()));
            
        if(src.getLegStrikePrice() != null)
            dest.set(new cl.bithaus.qfix.fields.LegStrikePrice(src.getLegStrikePrice()));
            
        if(src.getLegStrikeCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.LegStrikeCurrency(src.getLegStrikeCurrency()));
            
        if(src.getLegOptAttribute() != null)
            if(src.getLegOptAttribute().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.LegOptAttribute(src.getLegOptAttribute().charAt(0)));
            
        if(src.getLegContractMultiplier() != null)
            dest.set(new cl.bithaus.qfix.fields.LegContractMultiplier(src.getLegContractMultiplier().floatValue()));
            
        if(src.getLegCouponRate() != null)
            dest.set(new cl.bithaus.qfix.fields.LegCouponRate(src.getLegCouponRate().doubleValue()));
            
        if(src.getLegSecurityExchange() != null)
            dest.set(new cl.bithaus.qfix.fields.LegSecurityExchange(src.getLegSecurityExchange()));
            
        if(src.getLegIssuer() != null)
            dest.set(new cl.bithaus.qfix.fields.LegIssuer(src.getLegIssuer()));
            
        if(src.getEncodedLegIssuerLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedLegIssuerLen(src.getEncodedLegIssuerLen()));
            
        if(src.getEncodedLegIssuer() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedLegIssuer(src.getEncodedLegIssuer()));
            
        if(src.getLegSecurityDesc() != null)
            dest.set(new cl.bithaus.qfix.fields.LegSecurityDesc(src.getLegSecurityDesc()));
            
        if(src.getEncodedLegSecurityDescLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedLegSecurityDescLen(src.getEncodedLegSecurityDescLen()));
            
        if(src.getEncodedLegSecurityDesc() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedLegSecurityDesc(src.getEncodedLegSecurityDesc()));
            
        if(src.getLegRatioQty() != null)
            dest.set(new cl.bithaus.qfix.fields.LegRatioQty(src.getLegRatioQty().floatValue()));
            
        if(src.getLegSide() != null)
            if(src.getLegSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.LegSide(src.getLegSide().charAt(0)));
            
        if(src.getLegCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.LegCurrency(src.getLegCurrency()));
            
        if(src.getLegPool() != null)
            dest.set(new cl.bithaus.qfix.fields.LegPool(src.getLegPool()));
            
        if(src.getLegDatedDate() != null)
            dest.set(new cl.bithaus.qfix.fields.LegDatedDate(src.getLegDatedDate()));
            
        if(src.getLegContractSettlMonth() != null)
            dest.set(new cl.bithaus.qfix.fields.LegContractSettlMonth(src.getLegContractSettlMonth()));
            
        if(src.getLegInterestAccrualDate() != null)
            dest.set(new cl.bithaus.qfix.fields.LegInterestAccrualDate(src.getLegInterestAccrualDate()));
            

        if(src.getNoLegSecurityAltID() != null && src.getNoLegSecurityAltID().size() > 0) {

            for(cl.bithaus.fix.components.InstrumentLeg.NoLegSecurityAltID.NoLegSecurityAltIDEntry entry : src.getNoLegSecurityAltID().getGroups()) {

                cl.bithaus.qfix.msg.component.InstrumentLeg.NoLegSecurityAltID aux = 
                    new cl.bithaus.qfix.msg.component.InstrumentLeg.NoLegSecurityAltID();

                aux.set(new cl.bithaus.qfix.fields.LegSecurityAltID(entry.getLegSecurityAltID()));
                aux.set(new cl.bithaus.qfix.fields.LegSecurityAltIDSource(entry.getLegSecurityAltIDSource()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

