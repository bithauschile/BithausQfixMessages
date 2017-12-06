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
 * Fix - Bithaus format component translator for InstrumentLeg
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

    public static cl.bithaus.fix.components.InstrumentLeg fromFix(cl.bithaus.qfix.msg.component.InstrumentLeg src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.InstrumentLeg dest = new cl.bithaus.fix.components.InstrumentLeg();

        if(src.isSetLegSymbol())
            dest.setLegSymbol(src.getLegSymbol().getValue());
            
        if(src.isSetLegSymbolSfx())
            dest.setLegSymbolSfx(src.getLegSymbolSfx().getValue());
            
        if(src.isSetLegSecurityID())
            dest.setLegSecurityID(src.getLegSecurityID().getValue());
            
        if(src.isSetLegSecurityIDSource())
            dest.setLegSecurityIDSource(src.getLegSecurityIDSource().getValue());
            
        if(src.isSetLegProduct())
            dest.setLegProduct(src.getLegProduct().getValue());
            
        if(src.isSetLegCFICode())
            dest.setLegCFICode(src.getLegCFICode().getValue());
            
        if(src.isSetLegSecurityType())
            dest.setLegSecurityType(src.getLegSecurityType().getValue());
            
        if(src.isSetLegSecuritySubType())
            dest.setLegSecuritySubType(src.getLegSecuritySubType().getValue());
            
        if(src.isSetLegMaturityMonthYear())
            dest.setLegMaturityMonthYear(src.getLegMaturityMonthYear().getValue());
            
        if(src.isSetLegMaturityDate())
            dest.setLegMaturityDate(src.getLegMaturityDate().getValue());
            
        if(src.isSetLegCouponPaymentDate())
            dest.setLegCouponPaymentDate(src.getLegCouponPaymentDate().getValue());
            
        if(src.isSetLegIssueDate())
            dest.setLegIssueDate(src.getLegIssueDate().getValue());
            
        if(src.isSetLegRepoCollateralSecurityType())
            dest.setLegRepoCollateralSecurityType(src.getLegRepoCollateralSecurityType().getValue());
            
        if(src.isSetLegRepurchaseTerm())
            dest.setLegRepurchaseTerm(src.getLegRepurchaseTerm().getValue());
            
        if(src.isSetLegRepurchaseRate())
            dest.setLegRepurchaseRate(new BigDecimal(src.getLegRepurchaseRate().getValue()));
            
        if(src.isSetLegFactor())
            dest.setLegFactor(new BigDecimal(src.getLegFactor().getValue()));
            
        if(src.isSetLegCreditRating())
            dest.setLegCreditRating(src.getLegCreditRating().getValue());
            
        if(src.isSetLegInstrRegistry())
            dest.setLegInstrRegistry(src.getLegInstrRegistry().getValue());
            
        if(src.isSetLegCountryOfIssue())
            dest.setLegCountryOfIssue(src.getLegCountryOfIssue().getValue());
            
        if(src.isSetLegStateOrProvinceOfIssue())
            dest.setLegStateOrProvinceOfIssue(src.getLegStateOrProvinceOfIssue().getValue());
            
        if(src.isSetLegLocaleOfIssue())
            dest.setLegLocaleOfIssue(src.getLegLocaleOfIssue().getValue());
            
        if(src.isSetLegRedemptionDate())
            dest.setLegRedemptionDate(src.getLegRedemptionDate().getValue());
            
        if(src.isSetLegStrikePrice())
            dest.setLegStrikePrice(src.getLegStrikePrice().getValue());
            
        if(src.isSetLegStrikeCurrency())
            dest.setLegStrikeCurrency(src.getLegStrikeCurrency().getValue());
            
        if(src.isSetLegOptAttribute())
            dest.setLegOptAttribute(src.getLegOptAttribute().getValue()+"");
            
        if(src.isSetLegContractMultiplier())
            dest.setLegContractMultiplier(new BigDecimal(src.getLegContractMultiplier().getValue()));
            
        if(src.isSetLegCouponRate())
            dest.setLegCouponRate(new BigDecimal(src.getLegCouponRate().getValue()));
            
        if(src.isSetLegSecurityExchange())
            dest.setLegSecurityExchange(src.getLegSecurityExchange().getValue());
            
        if(src.isSetLegIssuer())
            dest.setLegIssuer(src.getLegIssuer().getValue());
            
        if(src.isSetEncodedLegIssuerLen())
            dest.setEncodedLegIssuerLen(src.getEncodedLegIssuerLen().getValue());
            
        if(src.isSetEncodedLegIssuer())
            dest.setEncodedLegIssuer(src.getEncodedLegIssuer().getValue());
            
        if(src.isSetLegSecurityDesc())
            dest.setLegSecurityDesc(src.getLegSecurityDesc().getValue());
            
        if(src.isSetEncodedLegSecurityDescLen())
            dest.setEncodedLegSecurityDescLen(src.getEncodedLegSecurityDescLen().getValue());
            
        if(src.isSetEncodedLegSecurityDesc())
            dest.setEncodedLegSecurityDesc(src.getEncodedLegSecurityDesc().getValue());
            
        if(src.isSetLegRatioQty())
            dest.setLegRatioQty(new BigDecimal(src.getLegRatioQty().getValue()));
            
        if(src.isSetLegSide())
            dest.setLegSide(src.getLegSide().getValue()+"");
            
        if(src.isSetLegCurrency())
            dest.setLegCurrency(src.getLegCurrency().getValue());
            
        if(src.isSetLegPool())
            dest.setLegPool(src.getLegPool().getValue());
            
        if(src.isSetLegDatedDate())
            dest.setLegDatedDate(src.getLegDatedDate().getValue());
            
        if(src.isSetLegContractSettlMonth())
            dest.setLegContractSettlMonth(src.getLegContractSettlMonth().getValue());
            
        if(src.isSetLegInterestAccrualDate())
            dest.setLegInterestAccrualDate(src.getLegInterestAccrualDate().getValue());
            


        if(src.isSetNoLegSecurityAltID()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegSecurityAltID().getField());
            List<cl.bithaus.fix.components.InstrumentLeg.NoLegSecurityAltID.NoLegSecurityAltIDEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.LegSecurityAltID legSecurityAltID = new cl.bithaus.qfix.fields.LegSecurityAltID();
            cl.bithaus.qfix.fields.LegSecurityAltIDSource legSecurityAltIDSource = new cl.bithaus.qfix.fields.LegSecurityAltIDSource();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.InstrumentLeg.NoLegSecurityAltID.NoLegSecurityAltIDEntry entry = 
                    new cl.bithaus.fix.components.InstrumentLeg.NoLegSecurityAltID.NoLegSecurityAltIDEntry();

                if(g.isSetField(legSecurityAltID)) {
                    legSecurityAltID = (cl.bithaus.qfix.fields.LegSecurityAltID) g.getField(legSecurityAltID);
                    entry.setLegSecurityAltID(legSecurityAltID.getValue());

                }
                if(g.isSetField(legSecurityAltIDSource)) {
                    legSecurityAltIDSource = (cl.bithaus.qfix.fields.LegSecurityAltIDSource) g.getField(legSecurityAltIDSource);
                    entry.setLegSecurityAltIDSource(legSecurityAltIDSource.getValue());

                }

                result.add(entry);                
            }

 
        }

        return dest;

    }
}

