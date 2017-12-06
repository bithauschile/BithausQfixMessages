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
public class AllocationInstructionTranslator  {

    public static cl.bithaus.qfix.msg.AllocationInstruction toFix(cl.bithaus.fix.AllocationInstruction src) {

        cl.bithaus.qfix.msg.AllocationInstruction dest = new cl.bithaus.qfix.msg.AllocationInstruction();

        if(src.getAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocID(src.getAllocID()));
            
        if(src.getAllocTransType() != null)
            if(src.getAllocTransType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.AllocTransType(src.getAllocTransType().charAt(0)));
            
        if(src.getAllocType() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocType(src.getAllocType()));
            
        if(src.getSecondaryAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryAllocID(src.getSecondaryAllocID()));
            
        if(src.getRefAllocID() != null)
            dest.set(new cl.bithaus.qfix.fields.RefAllocID(src.getRefAllocID()));
            
        if(src.getAllocCancReplaceReason() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocCancReplaceReason(src.getAllocCancReplaceReason()));
            
        if(src.getAllocIntermedReqType() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocIntermedReqType(src.getAllocIntermedReqType()));
            
        if(src.getAllocLinkID() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocLinkID(src.getAllocLinkID()));
            
        if(src.getAllocLinkType() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocLinkType(src.getAllocLinkType()));
            
        if(src.getBookingRefID() != null)
            dest.set(new cl.bithaus.qfix.fields.BookingRefID(src.getBookingRefID()));
            
        if(src.getAllocNoOrdersType() != null)
            dest.set(new cl.bithaus.qfix.fields.AllocNoOrdersType(src.getAllocNoOrdersType()));
            
        if(src.getPreviouslyReported() != null)
            dest.set(new cl.bithaus.qfix.fields.PreviouslyReported(src.getPreviouslyReported()));
            
        if(src.getReversalIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.ReversalIndicator(src.getReversalIndicator()));
            
        if(src.getMatchType() != null)
            dest.set(new cl.bithaus.qfix.fields.MatchType(src.getMatchType()));
            
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
            
        if(src.getQuantity() != null)
            dest.set(new cl.bithaus.qfix.fields.Quantity(src.getQuantity()));
            
        if(src.getQtyType() != null)
            dest.set(new cl.bithaus.qfix.fields.QtyType(src.getQtyType()));
            
        if(src.getLastMkt() != null)
            dest.set(new cl.bithaus.qfix.fields.LastMkt(src.getLastMkt()));
            
        if(src.getTradeOriginationDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeOriginationDate(src.getTradeOriginationDate()));
            
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
            
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
            
        if(src.getPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.PriceType(src.getPriceType()));
            
        if(src.getAvgPx() != null)
            dest.set(new cl.bithaus.qfix.fields.AvgPx(src.getAvgPx()));
            
        if(src.getAvgParPx() != null)
            dest.set(new cl.bithaus.qfix.fields.AvgParPx(src.getAvgParPx()));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getAvgPxPrecision() != null)
            dest.set(new cl.bithaus.qfix.fields.AvgPxPrecision(src.getAvgPxPrecision()));
            
        if(src.getTradeDate() != null)
            dest.set(new cl.bithaus.qfix.fields.TradeDate(src.getTradeDate()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
        if(src.getSettlType() != null)
            if(src.getSettlType().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.SettlType(src.getSettlType().charAt(0)));
            
        if(src.getSettlDate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlDate(src.getSettlDate()));
            
        if(src.getBookingType() != null)
            dest.set(new cl.bithaus.qfix.fields.BookingType(src.getBookingType()));
            
        if(src.getGrossTradeAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.GrossTradeAmt(src.getGrossTradeAmt()));
            
        if(src.getConcession() != null)
            dest.set(new cl.bithaus.qfix.fields.Concession(src.getConcession()));
            
        if(src.getTotalTakedown() != null)
            dest.set(new cl.bithaus.qfix.fields.TotalTakedown(src.getTotalTakedown()));
            
        if(src.getNetMoney() != null)
            dest.set(new cl.bithaus.qfix.fields.NetMoney(src.getNetMoney()));
            
        if(src.getPositionEffect() != null)
            if(src.getPositionEffect().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.PositionEffect(src.getPositionEffect().charAt(0)));
            
        if(src.getAutoAcceptIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.AutoAcceptIndicator(src.getAutoAcceptIndicator()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            
        if(src.getNumDaysInterest() != null)
            dest.set(new cl.bithaus.qfix.fields.NumDaysInterest(src.getNumDaysInterest()));
            
        if(src.getAccruedInterestRate() != null)
            dest.set(new cl.bithaus.qfix.fields.AccruedInterestRate(src.getAccruedInterestRate().doubleValue()));
            
        if(src.getAccruedInterestAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.AccruedInterestAmt(src.getAccruedInterestAmt()));
            
        if(src.getTotalAccruedInterestAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.TotalAccruedInterestAmt(src.getTotalAccruedInterestAmt()));
            
        if(src.getInterestAtMaturity() != null)
            dest.set(new cl.bithaus.qfix.fields.InterestAtMaturity(src.getInterestAtMaturity()));
            
        if(src.getEndAccruedInterestAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.EndAccruedInterestAmt(src.getEndAccruedInterestAmt()));
            
        if(src.getStartCash() != null)
            dest.set(new cl.bithaus.qfix.fields.StartCash(src.getStartCash()));
            
        if(src.getEndCash() != null)
            dest.set(new cl.bithaus.qfix.fields.EndCash(src.getEndCash()));
            
        if(src.getLegalConfirm() != null)
            dest.set(new cl.bithaus.qfix.fields.LegalConfirm(src.getLegalConfirm()));
            
        if(src.getTotNoAllocs() != null)
            dest.set(new cl.bithaus.qfix.fields.TotNoAllocs(src.getTotNoAllocs()));
            
        if(src.getLastFragment() != null)
            dest.set(new cl.bithaus.qfix.fields.LastFragment(src.getLastFragment()));
            

        if(src.getNoOrders() != null && src.getNoOrders().size() > 0) {

            for(cl.bithaus.fix.AllocationInstruction.NoOrders.NoOrdersEntry entry : src.getNoOrders().getGroups()) {

                cl.bithaus.qfix.msg.AllocationInstruction.NoOrders aux = 
                    new cl.bithaus.qfix.msg.AllocationInstruction.NoOrders();

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
        if(src.getNoExecs() != null && src.getNoExecs().size() > 0) {

            for(cl.bithaus.fix.AllocationInstruction.NoExecs.NoExecsEntry entry : src.getNoExecs().getGroups()) {

                cl.bithaus.qfix.msg.AllocationInstruction.NoExecs aux = 
                    new cl.bithaus.qfix.msg.AllocationInstruction.NoExecs();

                aux.set(new cl.bithaus.qfix.fields.LastQty(entry.getLastQty()));
                aux.set(new cl.bithaus.qfix.fields.ExecID(entry.getExecID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryExecID(entry.getSecondaryExecID()));
                aux.set(new cl.bithaus.qfix.fields.LastPx(entry.getLastPx()));
                aux.set(new cl.bithaus.qfix.fields.LastParPx(entry.getLastParPx()));
                if(entry.getLastCapacity().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.LastCapacity(entry.getLastCapacity().charAt(0)));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.AllocationInstruction.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.AllocationInstruction.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.AllocationInstruction.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.AllocationInstruction.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.AllocationInstruction.NoLegs aux = 
                    new cl.bithaus.qfix.msg.AllocationInstruction.NoLegs();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoAllocs() != null && src.getNoAllocs().size() > 0) {

            for(cl.bithaus.fix.AllocationInstruction.NoAllocs.NoAllocsEntry entry : src.getNoAllocs().getGroups()) {

                cl.bithaus.qfix.msg.AllocationInstruction.NoAllocs aux = 
                    new cl.bithaus.qfix.msg.AllocationInstruction.NoAllocs();

                aux.set(new cl.bithaus.qfix.fields.AllocAccount(entry.getAllocAccount()));
                aux.set(new cl.bithaus.qfix.fields.AllocAcctIDSource(entry.getAllocAcctIDSource()));
                if(entry.getMatchStatus().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.MatchStatus(entry.getMatchStatus().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.AllocPrice(entry.getAllocPrice()));
                aux.set(new cl.bithaus.qfix.fields.AllocQty(entry.getAllocQty()));
                aux.set(new cl.bithaus.qfix.fields.IndividualAllocID(entry.getIndividualAllocID()));
                if(entry.getProcessCode().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.ProcessCode(entry.getProcessCode().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.NotifyBrokerOfCredit(entry.getNotifyBrokerOfCredit()));
                aux.set(new cl.bithaus.qfix.fields.AllocHandlInst(entry.getAllocHandlInst()));
                aux.set(new cl.bithaus.qfix.fields.AllocText(entry.getAllocText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedAllocTextLen(entry.getEncodedAllocTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedAllocText(entry.getEncodedAllocText()));
                aux.set(new cl.bithaus.qfix.fields.AllocAvgPx(entry.getAllocAvgPx()));
                aux.set(new cl.bithaus.qfix.fields.AllocNetMoney(entry.getAllocNetMoney()));
                aux.set(new cl.bithaus.qfix.fields.SettlCurrAmt(entry.getSettlCurrAmt()));
                aux.set(new cl.bithaus.qfix.fields.AllocSettlCurrAmt(entry.getAllocSettlCurrAmt()));
                aux.set(new cl.bithaus.qfix.fields.SettlCurrency(entry.getSettlCurrency()));
                aux.set(new cl.bithaus.qfix.fields.AllocSettlCurrency(entry.getAllocSettlCurrency()));
                aux.set(new cl.bithaus.qfix.fields.SettlCurrFxRate(entry.getSettlCurrFxRate().floatValue()));
                if(entry.getSettlCurrFxRateCalc().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.SettlCurrFxRateCalc(entry.getSettlCurrFxRateCalc().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.AccruedInterestAmt(entry.getAccruedInterestAmt()));
                aux.set(new cl.bithaus.qfix.fields.AllocAccruedInterestAmt(entry.getAllocAccruedInterestAmt()));
                aux.set(new cl.bithaus.qfix.fields.AllocInterestAtMaturity(entry.getAllocInterestAtMaturity()));
                if(entry.getSettlInstMode().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.SettlInstMode(entry.getSettlInstMode().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.NoClearingInstructions(entry.getNoClearingInstructions()));
                aux.set(new cl.bithaus.qfix.fields.ClearingInstruction(entry.getClearingInstruction()));
                aux.set(new cl.bithaus.qfix.fields.ClearingFeeIndicator(entry.getClearingFeeIndicator()));
                aux.set(new cl.bithaus.qfix.fields.AllocSettlInstType(entry.getAllocSettlInstType()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

