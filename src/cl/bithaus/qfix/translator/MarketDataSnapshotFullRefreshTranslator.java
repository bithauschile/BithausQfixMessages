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
 * Fix - Bithaus format component translator for MarketDataSnapshotFullRefresh
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
        

        if(src.getInstrument() != null)
            dest.set(cl.bithaus.qfix.translator.component.InstrumentTranslator.toFix(src.getInstrument()));


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

    public static cl.bithaus.fix.MarketDataSnapshotFullRefresh fromFix(cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh src) 
        throws FieldNotFound {

        cl.bithaus.fix.MarketDataSnapshotFullRefresh dest = new cl.bithaus.fix.MarketDataSnapshotFullRefresh();

        if(src.isSetMDReqID())
            dest.setMDReqID(src.getMDReqID().getValue());

        if(src.isSetFinancialStatus())
            dest.setFinancialStatus(src.getFinancialStatus().getValue());

        if(src.isSetCorporateAction())
            dest.setCorporateAction(src.getCorporateAction().getValue());

        if(src.isSetNetChgPrevDay())
            dest.setNetChgPrevDay(src.getNetChgPrevDay().getValue());

        if(src.isSetLastFragment())
            dest.setLastFragment(src.getLastFragment().getValue());

        if(src.isSetApplQueueDepth())
            dest.setApplQueueDepth(src.getApplQueueDepth().getValue());

        if(src.isSetApplQueueResolution())
            dest.setApplQueueResolution(src.getApplQueueResolution().getValue());


        if(src.getInstrument() != null)
            dest.setInstrument(cl.bithaus.qfix.translator.component.InstrumentTranslator.fromFix(src.getInstrument()));



        if(src.isSetNoUnderlyings()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoUnderlyings().getField());
            List<cl.bithaus.fix.MarketDataSnapshotFullRefresh.NoUnderlyings.NoUnderlyingsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.MarketDataSnapshotFullRefresh.NoUnderlyings.NoUnderlyingsEntry entry = 
                    new cl.bithaus.fix.MarketDataSnapshotFullRefresh.NoUnderlyings.NoUnderlyingsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoLegs()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoLegs().getField());
            List<cl.bithaus.fix.MarketDataSnapshotFullRefresh.NoLegs.NoLegsEntry> result = new LinkedList<>();


            for(quickfix.Group g : gList) {

                cl.bithaus.fix.MarketDataSnapshotFullRefresh.NoLegs.NoLegsEntry entry = 
                    new cl.bithaus.fix.MarketDataSnapshotFullRefresh.NoLegs.NoLegsEntry();


                result.add(entry);                
            }

        }
        if(src.isSetNoMDEntries()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoMDEntries().getField());
            List<cl.bithaus.fix.MarketDataSnapshotFullRefresh.NoMDEntries.NoMDEntriesEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.MDEntryType mDEntryType = new cl.bithaus.qfix.fields.MDEntryType();
            cl.bithaus.qfix.fields.MDEntryPx mDEntryPx = new cl.bithaus.qfix.fields.MDEntryPx();
            cl.bithaus.qfix.fields.Currency currency = new cl.bithaus.qfix.fields.Currency();
            cl.bithaus.qfix.fields.SettlCurrency settlCurrency = new cl.bithaus.qfix.fields.SettlCurrency();
            cl.bithaus.qfix.fields.MDEntrySize mDEntrySize = new cl.bithaus.qfix.fields.MDEntrySize();
            cl.bithaus.qfix.fields.MDEntryDate mDEntryDate = new cl.bithaus.qfix.fields.MDEntryDate();
            cl.bithaus.qfix.fields.MDEntryTime mDEntryTime = new cl.bithaus.qfix.fields.MDEntryTime();
            cl.bithaus.qfix.fields.TickDirection tickDirection = new cl.bithaus.qfix.fields.TickDirection();
            cl.bithaus.qfix.fields.MDMkt mDMkt = new cl.bithaus.qfix.fields.MDMkt();
            cl.bithaus.qfix.fields.TradingSessionID tradingSessionID = new cl.bithaus.qfix.fields.TradingSessionID();
            cl.bithaus.qfix.fields.TradingSessionSubID tradingSessionSubID = new cl.bithaus.qfix.fields.TradingSessionSubID();
            cl.bithaus.qfix.fields.QuoteCondition quoteCondition = new cl.bithaus.qfix.fields.QuoteCondition();
            cl.bithaus.qfix.fields.TradeCondition tradeCondition = new cl.bithaus.qfix.fields.TradeCondition();
            cl.bithaus.qfix.fields.MDEntryOriginator mDEntryOriginator = new cl.bithaus.qfix.fields.MDEntryOriginator();
            cl.bithaus.qfix.fields.LocationID locationID = new cl.bithaus.qfix.fields.LocationID();
            cl.bithaus.qfix.fields.DeskID deskID = new cl.bithaus.qfix.fields.DeskID();
            cl.bithaus.qfix.fields.OpenCloseSettlFlag openCloseSettlFlag = new cl.bithaus.qfix.fields.OpenCloseSettlFlag();
            cl.bithaus.qfix.fields.TimeInForce timeInForce = new cl.bithaus.qfix.fields.TimeInForce();
            cl.bithaus.qfix.fields.ExpireDate expireDate = new cl.bithaus.qfix.fields.ExpireDate();
            cl.bithaus.qfix.fields.ExpireTime expireTime = new cl.bithaus.qfix.fields.ExpireTime();
            cl.bithaus.qfix.fields.MinQty minQty = new cl.bithaus.qfix.fields.MinQty();
            cl.bithaus.qfix.fields.ExecInst execInst = new cl.bithaus.qfix.fields.ExecInst();
            cl.bithaus.qfix.fields.SellerDays sellerDays = new cl.bithaus.qfix.fields.SellerDays();
            cl.bithaus.qfix.fields.OrderID orderID = new cl.bithaus.qfix.fields.OrderID();
            cl.bithaus.qfix.fields.SecondaryOrderID secondaryOrderID = new cl.bithaus.qfix.fields.SecondaryOrderID();
            cl.bithaus.qfix.fields.QuoteEntryID quoteEntryID = new cl.bithaus.qfix.fields.QuoteEntryID();
            cl.bithaus.qfix.fields.MDEntryBuyer mDEntryBuyer = new cl.bithaus.qfix.fields.MDEntryBuyer();
            cl.bithaus.qfix.fields.MDEntrySeller mDEntrySeller = new cl.bithaus.qfix.fields.MDEntrySeller();
            cl.bithaus.qfix.fields.NumberOfOrders numberOfOrders = new cl.bithaus.qfix.fields.NumberOfOrders();
            cl.bithaus.qfix.fields.MDEntryPositionNo mDEntryPositionNo = new cl.bithaus.qfix.fields.MDEntryPositionNo();
            cl.bithaus.qfix.fields.Scope scope = new cl.bithaus.qfix.fields.Scope();
            cl.bithaus.qfix.fields.PriceDelta priceDelta = new cl.bithaus.qfix.fields.PriceDelta();
            cl.bithaus.qfix.fields.Text text = new cl.bithaus.qfix.fields.Text();
            cl.bithaus.qfix.fields.EncodedTextLen encodedTextLen = new cl.bithaus.qfix.fields.EncodedTextLen();
            cl.bithaus.qfix.fields.EncodedText encodedText = new cl.bithaus.qfix.fields.EncodedText();
            cl.bithaus.qfix.fields.TradeID tradeID = new cl.bithaus.qfix.fields.TradeID();
            cl.bithaus.qfix.fields.ClOrdID clOrdID = new cl.bithaus.qfix.fields.ClOrdID();
            cl.bithaus.qfix.fields.MDEntryID mDEntryID = new cl.bithaus.qfix.fields.MDEntryID();
            cl.bithaus.qfix.fields.MDEntryRefID mDEntryRefID = new cl.bithaus.qfix.fields.MDEntryRefID();
            cl.bithaus.qfix.fields.EntryStep entryStep = new cl.bithaus.qfix.fields.EntryStep();
            cl.bithaus.qfix.fields.ClosingPrice closingPrice = new cl.bithaus.qfix.fields.ClosingPrice();
            cl.bithaus.qfix.fields.ShortSell shortSell = new cl.bithaus.qfix.fields.ShortSell();
            cl.bithaus.qfix.fields.BookingRefID bookingRefID = new cl.bithaus.qfix.fields.BookingRefID();
            cl.bithaus.qfix.fields.PrePayment prePayment = new cl.bithaus.qfix.fields.PrePayment();
            cl.bithaus.qfix.fields.PublicRate publicRate = new cl.bithaus.qfix.fields.PublicRate();
            cl.bithaus.qfix.fields.MaxRate maxRate = new cl.bithaus.qfix.fields.MaxRate();
            cl.bithaus.qfix.fields.OwnRate ownRate = new cl.bithaus.qfix.fields.OwnRate();
            cl.bithaus.qfix.fields.BestStance bestStance = new cl.bithaus.qfix.fields.BestStance();
            cl.bithaus.qfix.fields.Divisible divisible = new cl.bithaus.qfix.fields.Divisible();
            cl.bithaus.qfix.fields.Modified modified = new cl.bithaus.qfix.fields.Modified();
            cl.bithaus.qfix.fields.ForwardPrice forwardPrice = new cl.bithaus.qfix.fields.ForwardPrice();
            cl.bithaus.qfix.fields.IndexSocietyFactor indexSocietyFactor = new cl.bithaus.qfix.fields.IndexSocietyFactor();
            cl.bithaus.qfix.fields.IndexWeight indexWeight = new cl.bithaus.qfix.fields.IndexWeight();
            cl.bithaus.qfix.fields.IndexNoFreeFloat indexNoFreeFloat = new cl.bithaus.qfix.fields.IndexNoFreeFloat();
            cl.bithaus.qfix.fields.AuctionId auctionId = new cl.bithaus.qfix.fields.AuctionId();
            cl.bithaus.qfix.fields.MDMaturity mDMaturity = new cl.bithaus.qfix.fields.MDMaturity();
            cl.bithaus.qfix.fields.MDAdjustmentCurrency mDAdjustmentCurrency = new cl.bithaus.qfix.fields.MDAdjustmentCurrency();
            cl.bithaus.qfix.fields.SettlType settlType = new cl.bithaus.qfix.fields.SettlType();
            cl.bithaus.qfix.fields.CoraMaturity coraMaturity = new cl.bithaus.qfix.fields.CoraMaturity();
            cl.bithaus.qfix.fields.Duration duration = new cl.bithaus.qfix.fields.Duration();
            cl.bithaus.qfix.fields.Convexity convexity = new cl.bithaus.qfix.fields.Convexity();
            cl.bithaus.qfix.fields.TIR tIR = new cl.bithaus.qfix.fields.TIR();
            cl.bithaus.qfix.fields.LocalCurrencyValue localCurrencyValue = new cl.bithaus.qfix.fields.LocalCurrencyValue();
            cl.bithaus.qfix.fields.ValuedAmount valuedAmount = new cl.bithaus.qfix.fields.ValuedAmount();
            cl.bithaus.qfix.fields.Issuer issuer = new cl.bithaus.qfix.fields.Issuer();
            cl.bithaus.qfix.fields.InvesmentAmount invesmentAmount = new cl.bithaus.qfix.fields.InvesmentAmount();
            cl.bithaus.qfix.fields.DcvTitle dcvTitle = new cl.bithaus.qfix.fields.DcvTitle();
            cl.bithaus.qfix.fields.PriceType priceType = new cl.bithaus.qfix.fields.PriceType();
            cl.bithaus.qfix.fields.Side side = new cl.bithaus.qfix.fields.Side();
            cl.bithaus.qfix.fields.OrderQty orderQty = new cl.bithaus.qfix.fields.OrderQty();
            cl.bithaus.qfix.fields.OrderQty2 orderQty2 = new cl.bithaus.qfix.fields.OrderQty2();
            cl.bithaus.qfix.fields.OwnDemand ownDemand = new cl.bithaus.qfix.fields.OwnDemand();
            cl.bithaus.qfix.fields.TotalDemand totalDemand = new cl.bithaus.qfix.fields.TotalDemand();
            cl.bithaus.qfix.fields.Aggressor aggressor = new cl.bithaus.qfix.fields.Aggressor();
            cl.bithaus.qfix.fields.OrderSubID orderSubID = new cl.bithaus.qfix.fields.OrderSubID();
            cl.bithaus.qfix.fields.FractionID fractionID = new cl.bithaus.qfix.fields.FractionID();
            cl.bithaus.qfix.fields.NoFractions noFractions = new cl.bithaus.qfix.fields.NoFractions();
            cl.bithaus.qfix.fields.NoAdjudicatedFractions noAdjudicatedFractions = new cl.bithaus.qfix.fields.NoAdjudicatedFractions();
            cl.bithaus.qfix.fields.HasPriority hasPriority = new cl.bithaus.qfix.fields.HasPriority();
            cl.bithaus.qfix.fields.HasBid hasBid = new cl.bithaus.qfix.fields.HasBid();
            cl.bithaus.qfix.fields.NoOffers noOffers = new cl.bithaus.qfix.fields.NoOffers();
            cl.bithaus.qfix.fields.TradeVolume tradeVolume = new cl.bithaus.qfix.fields.TradeVolume();
            cl.bithaus.qfix.fields.SettlDate settlDate = new cl.bithaus.qfix.fields.SettlDate();
            cl.bithaus.qfix.fields.MinRate minRate = new cl.bithaus.qfix.fields.MinRate();
            cl.bithaus.qfix.fields.Change change = new cl.bithaus.qfix.fields.Change();
            cl.bithaus.qfix.fields.ReturnLastSevenDays returnLastSevenDays = new cl.bithaus.qfix.fields.ReturnLastSevenDays();
            cl.bithaus.qfix.fields.ReturnLastThirtyDays returnLastThirtyDays = new cl.bithaus.qfix.fields.ReturnLastThirtyDays();
            cl.bithaus.qfix.fields.ReturnLatsFiftyTwoWeeks returnLatsFiftyTwoWeeks = new cl.bithaus.qfix.fields.ReturnLatsFiftyTwoWeeks();
            cl.bithaus.qfix.fields.MinRateLastFiftyTwoWeeks minRateLastFiftyTwoWeeks = new cl.bithaus.qfix.fields.MinRateLastFiftyTwoWeeks();
            cl.bithaus.qfix.fields.MaxRateLastFiftyTwoWeeks maxRateLastFiftyTwoWeeks = new cl.bithaus.qfix.fields.MaxRateLastFiftyTwoWeeks();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.MarketDataSnapshotFullRefresh.NoMDEntries.NoMDEntriesEntry entry = 
                    new cl.bithaus.fix.MarketDataSnapshotFullRefresh.NoMDEntries.NoMDEntriesEntry();

                if(g.isSetField(mDEntryType)) {
                    mDEntryType = (cl.bithaus.qfix.fields.MDEntryType) g.getField(mDEntryType);
                    entry.setMDEntryType(mDEntryType.getValue()+"");
                }
                if(g.isSetField(mDEntryPx)) {
                    mDEntryPx = (cl.bithaus.qfix.fields.MDEntryPx) g.getField(mDEntryPx);
                    entry.setMDEntryPx(mDEntryPx.getValue());

                }
                if(g.isSetField(currency)) {
                    currency = (cl.bithaus.qfix.fields.Currency) g.getField(currency);
                    entry.setCurrency(currency.getValue());

                }
                if(g.isSetField(settlCurrency)) {
                    settlCurrency = (cl.bithaus.qfix.fields.SettlCurrency) g.getField(settlCurrency);
                    entry.setSettlCurrency(settlCurrency.getValue());

                }
                if(g.isSetField(mDEntrySize)) {
                    mDEntrySize = (cl.bithaus.qfix.fields.MDEntrySize) g.getField(mDEntrySize);
                    entry.setMDEntrySize(mDEntrySize.getValue());

                }
                if(g.isSetField(mDEntryDate)) {
                    mDEntryDate = (cl.bithaus.qfix.fields.MDEntryDate) g.getField(mDEntryDate);
                    entry.setMDEntryDate(mDEntryDate.getValue());

                }
                if(g.isSetField(mDEntryTime)) {
                    mDEntryTime = (cl.bithaus.qfix.fields.MDEntryTime) g.getField(mDEntryTime);
                    entry.setMDEntryTime(mDEntryTime.getValue());

                }
                if(g.isSetField(tickDirection)) {
                    tickDirection = (cl.bithaus.qfix.fields.TickDirection) g.getField(tickDirection);
                    entry.setTickDirection(tickDirection.getValue()+"");
                }
                if(g.isSetField(mDMkt)) {
                    mDMkt = (cl.bithaus.qfix.fields.MDMkt) g.getField(mDMkt);
                    entry.setMDMkt(mDMkt.getValue());

                }
                if(g.isSetField(tradingSessionID)) {
                    tradingSessionID = (cl.bithaus.qfix.fields.TradingSessionID) g.getField(tradingSessionID);
                    entry.setTradingSessionID(tradingSessionID.getValue());

                }
                if(g.isSetField(tradingSessionSubID)) {
                    tradingSessionSubID = (cl.bithaus.qfix.fields.TradingSessionSubID) g.getField(tradingSessionSubID);
                    entry.setTradingSessionSubID(tradingSessionSubID.getValue());

                }
                if(g.isSetField(quoteCondition)) {
                    quoteCondition = (cl.bithaus.qfix.fields.QuoteCondition) g.getField(quoteCondition);
                    entry.setQuoteCondition(quoteCondition.getValue());

                }
                if(g.isSetField(tradeCondition)) {
                    tradeCondition = (cl.bithaus.qfix.fields.TradeCondition) g.getField(tradeCondition);
                    entry.setTradeCondition(tradeCondition.getValue());

                }
                if(g.isSetField(mDEntryOriginator)) {
                    mDEntryOriginator = (cl.bithaus.qfix.fields.MDEntryOriginator) g.getField(mDEntryOriginator);
                    entry.setMDEntryOriginator(mDEntryOriginator.getValue());

                }
                if(g.isSetField(locationID)) {
                    locationID = (cl.bithaus.qfix.fields.LocationID) g.getField(locationID);
                    entry.setLocationID(locationID.getValue());

                }
                if(g.isSetField(deskID)) {
                    deskID = (cl.bithaus.qfix.fields.DeskID) g.getField(deskID);
                    entry.setDeskID(deskID.getValue());

                }
                if(g.isSetField(openCloseSettlFlag)) {
                    openCloseSettlFlag = (cl.bithaus.qfix.fields.OpenCloseSettlFlag) g.getField(openCloseSettlFlag);
                    entry.setOpenCloseSettlFlag(openCloseSettlFlag.getValue());

                }
                if(g.isSetField(timeInForce)) {
                    timeInForce = (cl.bithaus.qfix.fields.TimeInForce) g.getField(timeInForce);
                    entry.setTimeInForce(timeInForce.getValue()+"");
                }
                if(g.isSetField(expireDate)) {
                    expireDate = (cl.bithaus.qfix.fields.ExpireDate) g.getField(expireDate);
                    entry.setExpireDate(expireDate.getValue());

                }
                if(g.isSetField(expireTime)) {
                    expireTime = (cl.bithaus.qfix.fields.ExpireTime) g.getField(expireTime);
                    entry.setExpireTime(expireTime.getValue());

                }
                if(g.isSetField(minQty)) {
                    minQty = (cl.bithaus.qfix.fields.MinQty) g.getField(minQty);
                    entry.setMinQty(minQty.getValue());

                }
                if(g.isSetField(execInst)) {
                    execInst = (cl.bithaus.qfix.fields.ExecInst) g.getField(execInst);
                    entry.setExecInst(execInst.getValue());

                }
                if(g.isSetField(sellerDays)) {
                    sellerDays = (cl.bithaus.qfix.fields.SellerDays) g.getField(sellerDays);
                    entry.setSellerDays(sellerDays.getValue());

                }
                if(g.isSetField(orderID)) {
                    orderID = (cl.bithaus.qfix.fields.OrderID) g.getField(orderID);
                    entry.setOrderID(orderID.getValue());

                }
                if(g.isSetField(secondaryOrderID)) {
                    secondaryOrderID = (cl.bithaus.qfix.fields.SecondaryOrderID) g.getField(secondaryOrderID);
                    entry.setSecondaryOrderID(secondaryOrderID.getValue());

                }
                if(g.isSetField(quoteEntryID)) {
                    quoteEntryID = (cl.bithaus.qfix.fields.QuoteEntryID) g.getField(quoteEntryID);
                    entry.setQuoteEntryID(quoteEntryID.getValue());

                }
                if(g.isSetField(mDEntryBuyer)) {
                    mDEntryBuyer = (cl.bithaus.qfix.fields.MDEntryBuyer) g.getField(mDEntryBuyer);
                    entry.setMDEntryBuyer(mDEntryBuyer.getValue());

                }
                if(g.isSetField(mDEntrySeller)) {
                    mDEntrySeller = (cl.bithaus.qfix.fields.MDEntrySeller) g.getField(mDEntrySeller);
                    entry.setMDEntrySeller(mDEntrySeller.getValue());

                }
                if(g.isSetField(numberOfOrders)) {
                    numberOfOrders = (cl.bithaus.qfix.fields.NumberOfOrders) g.getField(numberOfOrders);
                    entry.setNumberOfOrders(numberOfOrders.getValue());

                }
                if(g.isSetField(mDEntryPositionNo)) {
                    mDEntryPositionNo = (cl.bithaus.qfix.fields.MDEntryPositionNo) g.getField(mDEntryPositionNo);
                    entry.setMDEntryPositionNo(mDEntryPositionNo.getValue());

                }
                if(g.isSetField(scope)) {
                    scope = (cl.bithaus.qfix.fields.Scope) g.getField(scope);
                    entry.setScope(scope.getValue());

                }
                if(g.isSetField(priceDelta)) {
                    priceDelta = (cl.bithaus.qfix.fields.PriceDelta) g.getField(priceDelta);
                    entry.setPriceDelta(new BigDecimal(priceDelta.getValue()));
                }
                if(g.isSetField(text)) {
                    text = (cl.bithaus.qfix.fields.Text) g.getField(text);
                    entry.setText(text.getValue());

                }
                if(g.isSetField(encodedTextLen)) {
                    encodedTextLen = (cl.bithaus.qfix.fields.EncodedTextLen) g.getField(encodedTextLen);
                    entry.setEncodedTextLen(encodedTextLen.getValue());

                }
                if(g.isSetField(encodedText)) {
                    encodedText = (cl.bithaus.qfix.fields.EncodedText) g.getField(encodedText);
                    entry.setEncodedText(encodedText.getValue());

                }
                if(g.isSetField(tradeID)) {
                    tradeID = (cl.bithaus.qfix.fields.TradeID) g.getField(tradeID);
                    entry.setTradeID(tradeID.getValue());

                }
                if(g.isSetField(clOrdID)) {
                    clOrdID = (cl.bithaus.qfix.fields.ClOrdID) g.getField(clOrdID);
                    entry.setClOrdID(clOrdID.getValue());

                }
                if(g.isSetField(mDEntryID)) {
                    mDEntryID = (cl.bithaus.qfix.fields.MDEntryID) g.getField(mDEntryID);
                    entry.setMDEntryID(mDEntryID.getValue());

                }
                if(g.isSetField(mDEntryRefID)) {
                    mDEntryRefID = (cl.bithaus.qfix.fields.MDEntryRefID) g.getField(mDEntryRefID);
                    entry.setMDEntryRefID(mDEntryRefID.getValue());

                }
                if(g.isSetField(entryStep)) {
                    entryStep = (cl.bithaus.qfix.fields.EntryStep) g.getField(entryStep);
                    entry.setEntryStep(entryStep.getValue());

                }
                if(g.isSetField(closingPrice)) {
                    closingPrice = (cl.bithaus.qfix.fields.ClosingPrice) g.getField(closingPrice);
                    entry.setClosingPrice(closingPrice.getValue());

                }
                if(g.isSetField(shortSell)) {
                    shortSell = (cl.bithaus.qfix.fields.ShortSell) g.getField(shortSell);
                    entry.setShortSell(shortSell.getValue());

                }
                if(g.isSetField(bookingRefID)) {
                    bookingRefID = (cl.bithaus.qfix.fields.BookingRefID) g.getField(bookingRefID);
                    entry.setBookingRefID(bookingRefID.getValue());

                }
                if(g.isSetField(prePayment)) {
                    prePayment = (cl.bithaus.qfix.fields.PrePayment) g.getField(prePayment);
                    entry.setPrePayment(prePayment.getValue()+"");
                }
                if(g.isSetField(publicRate)) {
                    publicRate = (cl.bithaus.qfix.fields.PublicRate) g.getField(publicRate);
                    entry.setPublicRate(publicRate.getValue());

                }
                if(g.isSetField(maxRate)) {
                    maxRate = (cl.bithaus.qfix.fields.MaxRate) g.getField(maxRate);
                    entry.setMaxRate(maxRate.getValue());

                }
                if(g.isSetField(ownRate)) {
                    ownRate = (cl.bithaus.qfix.fields.OwnRate) g.getField(ownRate);
                    entry.setOwnRate(ownRate.getValue());

                }
                if(g.isSetField(bestStance)) {
                    bestStance = (cl.bithaus.qfix.fields.BestStance) g.getField(bestStance);
                    entry.setBestStance(bestStance.getValue()+"");
                }
                if(g.isSetField(divisible)) {
                    divisible = (cl.bithaus.qfix.fields.Divisible) g.getField(divisible);
                    entry.setDivisible(divisible.getValue()+"");
                }
                if(g.isSetField(modified)) {
                    modified = (cl.bithaus.qfix.fields.Modified) g.getField(modified);
                    entry.setModified(modified.getValue()+"");
                }
                if(g.isSetField(forwardPrice)) {
                    forwardPrice = (cl.bithaus.qfix.fields.ForwardPrice) g.getField(forwardPrice);
                    entry.setForwardPrice(forwardPrice.getValue());

                }
                if(g.isSetField(indexSocietyFactor)) {
                    indexSocietyFactor = (cl.bithaus.qfix.fields.IndexSocietyFactor) g.getField(indexSocietyFactor);
                    entry.setIndexSocietyFactor(indexSocietyFactor.getValue());

                }
                if(g.isSetField(indexWeight)) {
                    indexWeight = (cl.bithaus.qfix.fields.IndexWeight) g.getField(indexWeight);
                    entry.setIndexWeight(indexWeight.getValue());

                }
                if(g.isSetField(indexNoFreeFloat)) {
                    indexNoFreeFloat = (cl.bithaus.qfix.fields.IndexNoFreeFloat) g.getField(indexNoFreeFloat);
                    entry.setIndexNoFreeFloat(indexNoFreeFloat.getValue());

                }
                if(g.isSetField(auctionId)) {
                    auctionId = (cl.bithaus.qfix.fields.AuctionId) g.getField(auctionId);
                    entry.setAuctionId(auctionId.getValue());

                }
                if(g.isSetField(mDMaturity)) {
                    mDMaturity = (cl.bithaus.qfix.fields.MDMaturity) g.getField(mDMaturity);
                    entry.setMDMaturity(mDMaturity.getValue());

                }
                if(g.isSetField(mDAdjustmentCurrency)) {
                    mDAdjustmentCurrency = (cl.bithaus.qfix.fields.MDAdjustmentCurrency) g.getField(mDAdjustmentCurrency);
                    entry.setMDAdjustmentCurrency(mDAdjustmentCurrency.getValue());

                }
                if(g.isSetField(settlType)) {
                    settlType = (cl.bithaus.qfix.fields.SettlType) g.getField(settlType);
                    entry.setSettlType(settlType.getValue()+"");
                }
                if(g.isSetField(coraMaturity)) {
                    coraMaturity = (cl.bithaus.qfix.fields.CoraMaturity) g.getField(coraMaturity);
                    entry.setCoraMaturity(coraMaturity.getValue());

                }
                if(g.isSetField(duration)) {
                    duration = (cl.bithaus.qfix.fields.Duration) g.getField(duration);
                    entry.setDuration(duration.getValue());

                }
                if(g.isSetField(convexity)) {
                    convexity = (cl.bithaus.qfix.fields.Convexity) g.getField(convexity);
                    entry.setConvexity(convexity.getValue());

                }
                if(g.isSetField(tIR)) {
                    tIR = (cl.bithaus.qfix.fields.TIR) g.getField(tIR);
                    entry.setTIR(tIR.getValue());

                }
                if(g.isSetField(localCurrencyValue)) {
                    localCurrencyValue = (cl.bithaus.qfix.fields.LocalCurrencyValue) g.getField(localCurrencyValue);
                    entry.setLocalCurrencyValue(localCurrencyValue.getValue());

                }
                if(g.isSetField(valuedAmount)) {
                    valuedAmount = (cl.bithaus.qfix.fields.ValuedAmount) g.getField(valuedAmount);
                    entry.setValuedAmount(valuedAmount.getValue());

                }
                if(g.isSetField(issuer)) {
                    issuer = (cl.bithaus.qfix.fields.Issuer) g.getField(issuer);
                    entry.setIssuer(issuer.getValue());

                }
                if(g.isSetField(invesmentAmount)) {
                    invesmentAmount = (cl.bithaus.qfix.fields.InvesmentAmount) g.getField(invesmentAmount);
                    entry.setInvesmentAmount(invesmentAmount.getValue());

                }
                if(g.isSetField(dcvTitle)) {
                    dcvTitle = (cl.bithaus.qfix.fields.DcvTitle) g.getField(dcvTitle);
                    entry.setDcvTitle(dcvTitle.getValue());

                }
                if(g.isSetField(priceType)) {
                    priceType = (cl.bithaus.qfix.fields.PriceType) g.getField(priceType);
                    entry.setPriceType(priceType.getValue());

                }
                if(g.isSetField(side)) {
                    side = (cl.bithaus.qfix.fields.Side) g.getField(side);
                    entry.setSide(side.getValue()+"");
                }
                if(g.isSetField(orderQty)) {
                    orderQty = (cl.bithaus.qfix.fields.OrderQty) g.getField(orderQty);
                    entry.setOrderQty(orderQty.getValue());

                }
                if(g.isSetField(orderQty2)) {
                    orderQty2 = (cl.bithaus.qfix.fields.OrderQty2) g.getField(orderQty2);
                    entry.setOrderQty2(orderQty2.getValue());

                }
                if(g.isSetField(ownDemand)) {
                    ownDemand = (cl.bithaus.qfix.fields.OwnDemand) g.getField(ownDemand);
                    entry.setOwnDemand(ownDemand.getValue());

                }
                if(g.isSetField(totalDemand)) {
                    totalDemand = (cl.bithaus.qfix.fields.TotalDemand) g.getField(totalDemand);
                    entry.setTotalDemand(totalDemand.getValue());

                }
                if(g.isSetField(aggressor)) {
                    aggressor = (cl.bithaus.qfix.fields.Aggressor) g.getField(aggressor);
                    entry.setAggressor(aggressor.getValue()+"");
                }
                if(g.isSetField(orderSubID)) {
                    orderSubID = (cl.bithaus.qfix.fields.OrderSubID) g.getField(orderSubID);
                    entry.setOrderSubID(orderSubID.getValue());

                }
                if(g.isSetField(fractionID)) {
                    fractionID = (cl.bithaus.qfix.fields.FractionID) g.getField(fractionID);
                    entry.setFractionID(fractionID.getValue());

                }
                if(g.isSetField(noFractions)) {
                    noFractions = (cl.bithaus.qfix.fields.NoFractions) g.getField(noFractions);
                    entry.setNoFractions(noFractions.getValue());

                }
                if(g.isSetField(noAdjudicatedFractions)) {
                    noAdjudicatedFractions = (cl.bithaus.qfix.fields.NoAdjudicatedFractions) g.getField(noAdjudicatedFractions);
                    entry.setNoAdjudicatedFractions(noAdjudicatedFractions.getValue());

                }
                if(g.isSetField(hasPriority)) {
                    hasPriority = (cl.bithaus.qfix.fields.HasPriority) g.getField(hasPriority);
                    entry.setHasPriority(hasPriority.getValue());

                }
                if(g.isSetField(hasBid)) {
                    hasBid = (cl.bithaus.qfix.fields.HasBid) g.getField(hasBid);
                    entry.setHasBid(hasBid.getValue());

                }
                if(g.isSetField(noOffers)) {
                    noOffers = (cl.bithaus.qfix.fields.NoOffers) g.getField(noOffers);
                    entry.setNoOffers(noOffers.getValue());

                }
                if(g.isSetField(tradeVolume)) {
                    tradeVolume = (cl.bithaus.qfix.fields.TradeVolume) g.getField(tradeVolume);
                    entry.setTradeVolume(tradeVolume.getValue());

                }
                if(g.isSetField(settlDate)) {
                    settlDate = (cl.bithaus.qfix.fields.SettlDate) g.getField(settlDate);
                    entry.setSettlDate(settlDate.getValue());

                }
                if(g.isSetField(minRate)) {
                    minRate = (cl.bithaus.qfix.fields.MinRate) g.getField(minRate);
                    entry.setMinRate(minRate.getValue());

                }
                if(g.isSetField(change)) {
                    change = (cl.bithaus.qfix.fields.Change) g.getField(change);
                    entry.setChange(change.getValue());

                }
                if(g.isSetField(returnLastSevenDays)) {
                    returnLastSevenDays = (cl.bithaus.qfix.fields.ReturnLastSevenDays) g.getField(returnLastSevenDays);
                    entry.setReturnLastSevenDays(returnLastSevenDays.getValue());

                }
                if(g.isSetField(returnLastThirtyDays)) {
                    returnLastThirtyDays = (cl.bithaus.qfix.fields.ReturnLastThirtyDays) g.getField(returnLastThirtyDays);
                    entry.setReturnLastThirtyDays(returnLastThirtyDays.getValue());

                }
                if(g.isSetField(returnLatsFiftyTwoWeeks)) {
                    returnLatsFiftyTwoWeeks = (cl.bithaus.qfix.fields.ReturnLatsFiftyTwoWeeks) g.getField(returnLatsFiftyTwoWeeks);
                    entry.setReturnLatsFiftyTwoWeeks(returnLatsFiftyTwoWeeks.getValue());

                }
                if(g.isSetField(minRateLastFiftyTwoWeeks)) {
                    minRateLastFiftyTwoWeeks = (cl.bithaus.qfix.fields.MinRateLastFiftyTwoWeeks) g.getField(minRateLastFiftyTwoWeeks);
                    entry.setMinRateLastFiftyTwoWeeks(minRateLastFiftyTwoWeeks.getValue());

                }
                if(g.isSetField(maxRateLastFiftyTwoWeeks)) {
                    maxRateLastFiftyTwoWeeks = (cl.bithaus.qfix.fields.MaxRateLastFiftyTwoWeeks) g.getField(maxRateLastFiftyTwoWeeks);
                    entry.setMaxRateLastFiftyTwoWeeks(maxRateLastFiftyTwoWeeks.getValue());

                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

