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
public class ConfirmationTranslator  {

    public static cl.bithaus.qfix.msg.Confirmation toFix(cl.bithaus.fix.Confirmation src) {

        cl.bithaus.qfix.msg.Confirmation dest = new cl.bithaus.qfix.msg.Confirmation();

        if(src.getConfirmID() != null)
            dest.set(new cl.bithaus.qfix.fields.ConfirmID(src.getConfirmID()));
            
        if(src.getConfirmRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.ConfirmRefID(src.getConfirmRefID()));
            
        if(src.getConfirmReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.ConfirmReqID(src.getConfirmReqID()));
            
        if(src.getConfirmTransType() != null)
            dest.set(new cl.bithaus.qfix.fields.ConfirmTransType(src.getConfirmTransType()));
            
        if(src.getConfirmType() != null)
            dest.set(new cl.bithaus.qfix.fields.ConfirmType(src.getConfirmType()));
            
        if(src.getCopyMsgIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.CopyMsgIndicator(src.getCopyMsgIndicator()));
            
        if(src.getLegalConfirm() != null)
            dest.set(new cl.bithaus.qfix.fields.LegalConfirm(src.getLegalConfirm()));
            
        if(src.getConfirmStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.ConfirmStatus(src.getConfirmStatus()));
            
        if(src.getAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocID(src.getAllocID()));
            
        if(src.getSecondaryAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryAllocID(src.getSecondaryAllocID()));
            
        if(src.getIndividualAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.IndividualAllocID(src.getIndividualAllocID()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
        if(src.getTradeDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeDate(src.getTradeDate()));
            
        if(src.getAllocQty() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocQty(src.getAllocQty()));
            
        if(src.getQtyType() != null)
            dest.set(new cl.bithaus.qfix.fields.QtyType(src.getQtyType()));
            
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getLastMkt() != null)
            dest.set(new cl.bithaus.qfix.fields.LastMkt(src.getLastMkt()));
            
        if(src.getAllocAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocAccount(src.getAllocAccount()));
            
        if(src.getAllocAcctIDSource() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocAcctIDSource(src.getAllocAcctIDSource()));
            
        if(src.getAllocAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocAccountType(src.getAllocAccountType()));
            
        if(src.getAvgPx() != null)
            dest.set(new cl.bithaus.qfix.fields.AvgPx(src.getAvgPx()));
            
        if(src.getAvgPxPrecision() != null)
            dest.set(new cl.bithaus.qfix.fields.AvgPxPrecision(src.getAvgPxPrecision()));
            
        if(src.getPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.PriceType(src.getPriceType()));
            
        if(src.getAvgParPx() != null)
            dest.set(new cl.bithaus.qfix.fields.AvgParPx(src.getAvgParPx()));
            
        if(src.getReportedPx() != null)
            dest.set(new cl.bithaus.qfix.fields.ReportedPx(src.getReportedPx()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            
        if(src.getProcessCode() != null)
            if(src.getProcessCode().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.ProcessCode(src.getProcessCode().charAt(0)));
            
        if(src.getGrossTradeAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.GrossTradeAmt(src.getGrossTradeAmt()));
            
        if(src.getNumDaysInterest() != null)
            dest.set(new cl.bithaus.qfix.fields.NumDaysInterest(src.getNumDaysInterest()));
            
        if(src.getExDate() != null)
            dest.set(new cl.bithaus.qfix.fields.ExDate(src.getExDate()));
            
        if(src.getAccruedInterestRate() != null)
            dest.set(new cl.bithaus.qfix.fields.AccruedInterestRate(src.getAccruedInterestRate().doubleValue()));
            
        if(src.getAccruedInterestAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.AccruedInterestAmt(src.getAccruedInterestAmt()));
            
        if(src.getInterestAtMaturity() != null)
            dest.set(new cl.bithaus.qfix.fields.InterestAtMaturity(src.getInterestAtMaturity()));
            
        if(src.getEndAccruedInterestAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.EndAccruedInterestAmt(src.getEndAccruedInterestAmt()));
            
        if(src.getStartCash() != null)
            dest.set(new cl.bithaus.qfix.fields.StartCash(src.getStartCash()));
            
        if(src.getEndCash() != null)
            dest.set(new cl.bithaus.qfix.fields.EndCash(src.getEndCash()));
            
        if(src.getConcession() != null)
            dest.set(new cl.bithaus.qfix.fields.Concession(src.getConcession()));
            
        if(src.getTotalTakedown() != null)
            dest.set(new cl.bithaus.qfix.fields.TotalTakedown(src.getTotalTakedown()));
            
        if(src.getNetMoney() != null)
            dest.set(new cl.bithaus.qfix.fields.NetMoney(src.getNetMoney()));
            
        if(src.getMaturityNetMoney() != null)
            dest.set(new cl.bithaus.qfix.fields.MaturityNetMoney(src.getMaturityNetMoney()));
            
        if(src.getSettlCurrAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlCurrAmt(src.getSettlCurrAmt()));
            
        if(src.getSettlCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlCurrency(src.getSettlCurrency()));
            
        if(src.getSettlCurrFxRate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlCurrFxRate(src.getSettlCurrFxRate().floatValue()));
            
        if(src.getSettlCurrFxRateCalc() != null)
            if(src.getSettlCurrFxRateCalc().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SettlCurrFxRateCalc(src.getSettlCurrFxRateCalc().charAt(0)));
            
        if(src.getSettlType() != null)
            if(src.getSettlType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SettlType(src.getSettlType().charAt(0)));
            
        if(src.getSettlDate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlDate(src.getSettlDate()));
            
        if(src.getSharedCommission() != null)
            dest.set(new cl.bithaus.qfix.fields.SharedCommission(src.getSharedCommission()));
            

        if(src.getNoOrders() != null && src.getNoOrders().size() > 0) {

            for(cl.bithaus.fix.Confirmation.NoOrders.NoOrdersEntry entry : src.getNoOrders().getGroups()) {

                cl.bithaus.qfix.msg.Confirmation.NoOrders aux = 
                    new cl.bithaus.qfix.msg.Confirmation.NoOrders();

                aux.set(new cl.bithaus.qfix.fields.ClOrdID(entry.getClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.OrderID(entry.getOrderID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryOrderID(entry.getSecondaryOrderID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(entry.getSecondaryClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.ListID(entry.getListID()));
                aux.set(new cl.bithaus.qfix.fields.OrderQty(entry.getOrderQty()));
                aux.set(new cl.bithaus.qfix.fields.OrderAvgPx(entry.getOrderAvgPx()));
                aux.set(new cl.bithaus.qfix.fields.OrderBookingQty(entry.getOrderBookingQty()));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.Confirmation.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.Confirmation.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.Confirmation.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.Confirmation.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.Confirmation.NoLegs aux = 
                    new cl.bithaus.qfix.msg.Confirmation.NoLegs();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoCapacities() != null && src.getNoCapacities().size() > 0) {

            for(cl.bithaus.fix.Confirmation.NoCapacities.NoCapacitiesEntry entry : src.getNoCapacities().getGroups()) {

                cl.bithaus.qfix.msg.Confirmation.NoCapacities aux = 
                    new cl.bithaus.qfix.msg.Confirmation.NoCapacities();

                if(entry.getOrderCapacity().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.OrderCapacity(entry.getOrderCapacity().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.OrderRestrictions(entry.getOrderRestrictions()));
                aux.set(new cl.bithaus.qfix.fields.OrderCapacityQty(entry.getOrderCapacityQty()));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoMiscFees() != null && src.getNoMiscFees().size() > 0) {

            for(cl.bithaus.fix.Confirmation.NoMiscFees.NoMiscFeesEntry entry : src.getNoMiscFees().getGroups()) {

                cl.bithaus.qfix.msg.Confirmation.NoMiscFees aux = 
                    new cl.bithaus.qfix.msg.Confirmation.NoMiscFees();

                aux.set(new cl.bithaus.qfix.fields.MiscFeeAmt(entry.getMiscFeeAmt()));
                aux.set(new cl.bithaus.qfix.fields.MiscFeeCurr(entry.getMiscFeeCurr()));
                if(entry.getMiscFeeType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.MiscFeeType(entry.getMiscFeeType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.MiscFeeBasis(entry.getMiscFeeBasis()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

