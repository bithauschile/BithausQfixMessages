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
public class CollateralRequestTranslator  {

    public static cl.bithaus.qfix.msg.CollateralRequest toFix(cl.bithaus.fix.CollateralRequest src) {

        cl.bithaus.qfix.msg.CollateralRequest dest = new cl.bithaus.qfix.msg.CollateralRequest();

        if(src.getCollReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.CollReqID(src.getCollReqID()));
            
        if(src.getCollAsgnReason() != null)
            dest.set(new cl.bithaus.qfix.fields.CollAsgnReason(src.getCollAsgnReason()));
            
        if(src.getTransactTime() != null)
            dest.set(new cl.bithaus.qfix.fields.TransactTime(src.getTransactTime()));
            
        if(src.getExpireTime() != null)
            dest.set(new cl.bithaus.qfix.fields.ExpireTime(src.getExpireTime()));
            
        if(src.getAccount() != null)
            dest.set(new cl.bithaus.qfix.fields.Account(src.getAccount()));
            
        if(src.getAccountType() != null)
            dest.set(new cl.bithaus.qfix.fields.AccountType(src.getAccountType()));
            
        if(src.getClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.ClOrdID(src.getClOrdID()));
            
        if(src.getOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.OrderID(src.getOrderID()));
            
        if(src.getSecondaryOrderID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryOrderID(src.getSecondaryOrderID()));
            
        if(src.getSecondaryClOrdID() != null)
            dest.set(new cl.bithaus.qfix.fields.SecondaryClOrdID(src.getSecondaryClOrdID()));
            
        if(src.getSettlDate() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlDate(src.getSettlDate()));
            
        if(src.getQuantity() != null)
            dest.set(new cl.bithaus.qfix.fields.Quantity(src.getQuantity()));
            
        if(src.getQtyType() != null)
            dest.set(new cl.bithaus.qfix.fields.QtyType(src.getQtyType()));
            
        if(src.getCurrency() != null)
            dest.set(new cl.bithaus.qfix.fields.Currency(src.getCurrency()));
            
        if(src.getNoLegs() != null)
            dest.set(new cl.bithaus.qfix.fields.NoLegs(src.getNoLegs()));
            
        if(src.getMarginExcess() != null)
            dest.set(new cl.bithaus.qfix.fields.MarginExcess(src.getMarginExcess()));
            
        if(src.getTotalNetValue() != null)
            dest.set(new cl.bithaus.qfix.fields.TotalNetValue(src.getTotalNetValue()));
            
        if(src.getCashOutstanding() != null)
            dest.set(new cl.bithaus.qfix.fields.CashOutstanding(src.getCashOutstanding()));
            
        if(src.getSide() != null)
            if(src.getSide().length() > 0)
                dest.set(new cl.bithaus.qfix.fields.Side(src.getSide().charAt(0)));
            
        if(src.getPrice() != null)
            dest.set(new cl.bithaus.qfix.fields.Price(src.getPrice()));
            
        if(src.getPriceType() != null)
            dest.set(new cl.bithaus.qfix.fields.PriceType(src.getPriceType()));
            
        if(src.getAccruedInterestAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.AccruedInterestAmt(src.getAccruedInterestAmt()));
            
        if(src.getEndAccruedInterestAmt() != null)
            dest.set(new cl.bithaus.qfix.fields.EndAccruedInterestAmt(src.getEndAccruedInterestAmt()));
            
        if(src.getStartCash() != null)
            dest.set(new cl.bithaus.qfix.fields.StartCash(src.getStartCash()));
            
        if(src.getEndCash() != null)
            dest.set(new cl.bithaus.qfix.fields.EndCash(src.getEndCash()));
            
        if(src.getTradingSessionID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionID(src.getTradingSessionID()));
            
        if(src.getTradingSessionSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.TradingSessionSubID(src.getTradingSessionSubID()));
            
        if(src.getSettlSessID() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlSessID(src.getSettlSessID()));
            
        if(src.getSettlSessSubID() != null)
            dest.set(new cl.bithaus.qfix.fields.SettlSessSubID(src.getSettlSessSubID()));
            
        if(src.getClearingBusinessDate() != null)
            dest.set(new cl.bithaus.qfix.fields.ClearingBusinessDate(src.getClearingBusinessDate()));
            
        if(src.getText() != null)
            dest.set(new cl.bithaus.qfix.fields.Text(src.getText()));
            
        if(src.getEncodedTextLen() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedTextLen(src.getEncodedTextLen()));
            
        if(src.getEncodedText() != null)
            dest.set(new cl.bithaus.qfix.fields.EncodedText(src.getEncodedText()));
            

        if(src.getNoExecs() != null && src.getNoExecs().size() > 0) {

            for(cl.bithaus.fix.CollateralRequest.NoExecs.NoExecsEntry entry : src.getNoExecs().getGroups()) {

                cl.bithaus.qfix.msg.CollateralRequest.NoExecs aux = 
                    new cl.bithaus.qfix.msg.CollateralRequest.NoExecs();

                aux.set(new cl.bithaus.qfix.fields.ExecID(entry.getExecID()));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoTrades() != null && src.getNoTrades().size() > 0) {

            for(cl.bithaus.fix.CollateralRequest.NoTrades.NoTradesEntry entry : src.getNoTrades().getGroups()) {

                cl.bithaus.qfix.msg.CollateralRequest.NoTrades aux = 
                    new cl.bithaus.qfix.msg.CollateralRequest.NoTrades();

                aux.set(new cl.bithaus.qfix.fields.TradeReportID(entry.getTradeReportID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryTradeReportID(entry.getSecondaryTradeReportID()));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.CollateralRequest.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.CollateralRequest.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.CollateralRequest.NoUnderlyings();

                aux.set(new cl.bithaus.qfix.fields.CollAction(entry.getCollAction()));

                dest.addGroup(aux);
            }            
        }
        if(src.getNoMiscFees() != null && src.getNoMiscFees().size() > 0) {

            for(cl.bithaus.fix.CollateralRequest.NoMiscFees.NoMiscFeesEntry entry : src.getNoMiscFees().getGroups()) {

                cl.bithaus.qfix.msg.CollateralRequest.NoMiscFees aux = 
                    new cl.bithaus.qfix.msg.CollateralRequest.NoMiscFees();

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

