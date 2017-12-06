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
public class MarketDataSnapshotFullRefreshTranslator  {

    public static cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh toFix(cl.bithaus.fix.MarketDataSnapshotFullRefresh src) {

        cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh dest = new cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh();

        if(src.getMDReqID() != null)
            dest.set(new cl.bithaus.qfix.fields.MDReqID(src.getMDReqID()));
            
        if(src.getFinancialStatus() != null)
            dest.set(new cl.bithaus.qfix.fields.FinancialStatus(src.getFinancialStatus()));
            
        if(src.getCorporateAction() != null)
            dest.set(new cl.bithaus.qfix.fields.CorporateAction(src.getCorporateAction()));
            
        if(src.getNetChgPrevDay() != null)
            dest.set(new cl.bithaus.qfix.fields.NetChgPrevDay(src.getNetChgPrevDay()));
            
        if(src.getLastFragment() != null)
            dest.set(new cl.bithaus.qfix.fields.LastFragment(src.getLastFragment()));
            
        if(src.getApplQueueDepth() != null)
            dest.set(new cl.bithaus.qfix.fields.ApplQueueDepth(src.getApplQueueDepth()));
            
        if(src.getApplQueueResolution() != null)
            dest.set(new cl.bithaus.qfix.fields.ApplQueueResolution(src.getApplQueueResolution()));
            

        if(src.getNoUnderlyings() != null && src.getNoUnderlyings().size() > 0) {

            for(cl.bithaus.fix.MarketDataSnapshotFullRefresh.NoUnderlyings.NoUnderlyingsEntry entry : src.getNoUnderlyings().getGroups()) {

                cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoUnderlyings aux = 
                    new cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoUnderlyings();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoLegs() != null && src.getNoLegs().size() > 0) {

            for(cl.bithaus.fix.MarketDataSnapshotFullRefresh.NoLegs.NoLegsEntry entry : src.getNoLegs().getGroups()) {

                cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoLegs aux = 
                    new cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoLegs();


                dest.addGroup(aux);
            }            
        }
        if(src.getNoMDEntries() != null && src.getNoMDEntries().size() > 0) {

            for(cl.bithaus.fix.MarketDataSnapshotFullRefresh.NoMDEntries.NoMDEntriesEntry entry : src.getNoMDEntries().getGroups()) {

                cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoMDEntries aux = 
                    new cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoMDEntries();

                if(entry.getMDEntryType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.MDEntryType(entry.getMDEntryType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.MDEntryPx(entry.getMDEntryPx()));
                aux.set(new cl.bithaus.qfix.fields.Currency(entry.getCurrency()));
                aux.set(new cl.bithaus.qfix.fields.SettlCurrency(entry.getSettlCurrency()));
                aux.set(new cl.bithaus.qfix.fields.MDEntrySize(entry.getMDEntrySize()));
                aux.set(new cl.bithaus.qfix.fields.MDEntryDate(entry.getMDEntryDate()));
                aux.set(new cl.bithaus.qfix.fields.MDEntryTime(entry.getMDEntryTime()));
                if(entry.getTickDirection().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.TickDirection(entry.getTickDirection().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.MDMkt(entry.getMDMkt()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionID(entry.getTradingSessionID()));
                aux.set(new cl.bithaus.qfix.fields.TradingSessionSubID(entry.getTradingSessionSubID()));
                aux.set(new cl.bithaus.qfix.fields.QuoteCondition(entry.getQuoteCondition()));
                aux.set(new cl.bithaus.qfix.fields.TradeCondition(entry.getTradeCondition()));
                aux.set(new cl.bithaus.qfix.fields.MDEntryOriginator(entry.getMDEntryOriginator()));
                aux.set(new cl.bithaus.qfix.fields.LocationID(entry.getLocationID()));
                aux.set(new cl.bithaus.qfix.fields.DeskID(entry.getDeskID()));
                aux.set(new cl.bithaus.qfix.fields.OpenCloseSettlFlag(entry.getOpenCloseSettlFlag()));
                if(entry.getTimeInForce().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.TimeInForce(entry.getTimeInForce().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.ExpireDate(entry.getExpireDate()));
                aux.set(new cl.bithaus.qfix.fields.ExpireTime(entry.getExpireTime()));
                aux.set(new cl.bithaus.qfix.fields.MinQty(entry.getMinQty()));
                aux.set(new cl.bithaus.qfix.fields.ExecInst(entry.getExecInst()));
                aux.set(new cl.bithaus.qfix.fields.SellerDays(entry.getSellerDays()));
                aux.set(new cl.bithaus.qfix.fields.OrderID(entry.getOrderID()));
                aux.set(new cl.bithaus.qfix.fields.SecondaryOrderID(entry.getSecondaryOrderID()));
                aux.set(new cl.bithaus.qfix.fields.QuoteEntryID(entry.getQuoteEntryID()));
                aux.set(new cl.bithaus.qfix.fields.MDEntryBuyer(entry.getMDEntryBuyer()));
                aux.set(new cl.bithaus.qfix.fields.MDEntrySeller(entry.getMDEntrySeller()));
                aux.set(new cl.bithaus.qfix.fields.NumberOfOrders(entry.getNumberOfOrders()));
                aux.set(new cl.bithaus.qfix.fields.MDEntryPositionNo(entry.getMDEntryPositionNo()));
                aux.set(new cl.bithaus.qfix.fields.Scope(entry.getScope()));
                aux.set(new cl.bithaus.qfix.fields.PriceDelta(entry.getPriceDelta().floatValue()));
                aux.set(new cl.bithaus.qfix.fields.Text(entry.getText()));
                aux.set(new cl.bithaus.qfix.fields.EncodedTextLen(entry.getEncodedTextLen()));
                aux.set(new cl.bithaus.qfix.fields.EncodedText(entry.getEncodedText()));
                aux.set(new cl.bithaus.qfix.fields.TradeID(entry.getTradeID()));
                aux.set(new cl.bithaus.qfix.fields.ClOrdID(entry.getClOrdID()));
                aux.set(new cl.bithaus.qfix.fields.MDEntryID(entry.getMDEntryID()));
                aux.set(new cl.bithaus.qfix.fields.MDEntryRefID(entry.getMDEntryRefID()));
                aux.set(new cl.bithaus.qfix.fields.EntryStep(entry.getEntryStep()));
                aux.set(new cl.bithaus.qfix.fields.ClosingPrice(entry.getClosingPrice()));
                aux.set(new cl.bithaus.qfix.fields.ShortSell(entry.getShortSell()));
                aux.set(new cl.bithaus.qfix.fields.BookingRefID(entry.getBookingRefID()));
                if(entry.getPrePayment().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.PrePayment(entry.getPrePayment().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.PublicRate(entry.getPublicRate()));
                aux.set(new cl.bithaus.qfix.fields.MaxRate(entry.getMaxRate()));
                aux.set(new cl.bithaus.qfix.fields.OwnRate(entry.getOwnRate()));
                if(entry.getBestStance().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.BestStance(entry.getBestStance().charAt(0)));
                if(entry.getDivisible().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Divisible(entry.getDivisible().charAt(0)));
                if(entry.getModified().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Modified(entry.getModified().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.ForwardPrice(entry.getForwardPrice()));
                aux.set(new cl.bithaus.qfix.fields.IndexSocietyFactor(entry.getIndexSocietyFactor()));
                aux.set(new cl.bithaus.qfix.fields.IndexWeight(entry.getIndexWeight()));
                aux.set(new cl.bithaus.qfix.fields.IndexNoFreeFloat(entry.getIndexNoFreeFloat()));
                aux.set(new cl.bithaus.qfix.fields.AuctionId(entry.getAuctionId()));
                aux.set(new cl.bithaus.qfix.fields.MDMaturity(entry.getMDMaturity()));
                aux.set(new cl.bithaus.qfix.fields.MDAdjustmentCurrency(entry.getMDAdjustmentCurrency()));
                if(entry.getSettlType().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.SettlType(entry.getSettlType().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.CoraMaturity(entry.getCoraMaturity()));
                aux.set(new cl.bithaus.qfix.fields.Duration(entry.getDuration()));
                aux.set(new cl.bithaus.qfix.fields.Convexity(entry.getConvexity()));
                aux.set(new cl.bithaus.qfix.fields.TIR(entry.getTIR()));
                aux.set(new cl.bithaus.qfix.fields.LocalCurrencyValue(entry.getLocalCurrencyValue()));
                aux.set(new cl.bithaus.qfix.fields.ValuedAmount(entry.getValuedAmount()));
                aux.set(new cl.bithaus.qfix.fields.Issuer(entry.getIssuer()));
                aux.set(new cl.bithaus.qfix.fields.InvesmentAmount(entry.getInvesmentAmount()));
                aux.set(new cl.bithaus.qfix.fields.DcvTitle(entry.getDcvTitle()));
                aux.set(new cl.bithaus.qfix.fields.PriceType(entry.getPriceType()));
                if(entry.getSide().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Side(entry.getSide().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.OrderQty(entry.getOrderQty()));
                aux.set(new cl.bithaus.qfix.fields.OrderQty2(entry.getOrderQty2()));
                aux.set(new cl.bithaus.qfix.fields.OwnDemand(entry.getOwnDemand()));
                aux.set(new cl.bithaus.qfix.fields.TotalDemand(entry.getTotalDemand()));
                if(entry.getAggressor().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.Aggressor(entry.getAggressor().charAt(0)));
                aux.set(new cl.bithaus.qfix.fields.OrderSubID(entry.getOrderSubID()));
                aux.set(new cl.bithaus.qfix.fields.FractionID(entry.getFractionID()));
                aux.set(new cl.bithaus.qfix.fields.NoFractions(entry.getNoFractions()));
                aux.set(new cl.bithaus.qfix.fields.NoAdjudicatedFractions(entry.getNoAdjudicatedFractions()));
                aux.set(new cl.bithaus.qfix.fields.HasPriority(entry.getHasPriority()));
                aux.set(new cl.bithaus.qfix.fields.HasBid(entry.getHasBid()));
                aux.set(new cl.bithaus.qfix.fields.NoOffers(entry.getNoOffers()));
                aux.set(new cl.bithaus.qfix.fields.TradeVolume(entry.getTradeVolume()));
                aux.set(new cl.bithaus.qfix.fields.SettlDate(entry.getSettlDate()));
                aux.set(new cl.bithaus.qfix.fields.MinRate(entry.getMinRate()));
                aux.set(new cl.bithaus.qfix.fields.Change(entry.getChange()));
                aux.set(new cl.bithaus.qfix.fields.ReturnLastSevenDays(entry.getReturnLastSevenDays()));
                aux.set(new cl.bithaus.qfix.fields.ReturnLastThirtyDays(entry.getReturnLastThirtyDays()));
                aux.set(new cl.bithaus.qfix.fields.ReturnLatsFiftyTwoWeeks(entry.getReturnLatsFiftyTwoWeeks()));
                aux.set(new cl.bithaus.qfix.fields.MinRateLastFiftyTwoWeeks(entry.getMinRateLastFiftyTwoWeeks()));
                aux.set(new cl.bithaus.qfix.fields.MaxRateLastFiftyTwoWeeks(entry.getMaxRateLastFiftyTwoWeeks()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }


}

