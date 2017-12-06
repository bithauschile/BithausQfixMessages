
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class BidRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "k";
	

	public BidRequest() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public BidRequest(cl.bithaus.qfix.fields.ClientBidID clientBidID, cl.bithaus.qfix.fields.BidRequestTransType bidRequestTransType, cl.bithaus.qfix.fields.TotNoRelatedSym totNoRelatedSym, cl.bithaus.qfix.fields.BidType bidType, cl.bithaus.qfix.fields.BidTradeType bidTradeType, cl.bithaus.qfix.fields.BasisPxType basisPxType) {
		this();
		setField(clientBidID);
		setField(bidRequestTransType);
		setField(totNoRelatedSym);
		setField(bidType);
		setField(bidTradeType);
		setField(basisPxType);
	}
	
	public void set(cl.bithaus.qfix.fields.BidID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BidID get(cl.bithaus.qfix.fields.BidID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BidID getBidID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BidID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BidID field) {
		return isSetField(field);
	}

	public boolean isSetBidID() {
		return isSetField(390);
	}

	public void set(cl.bithaus.qfix.fields.ClientBidID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ClientBidID get(cl.bithaus.qfix.fields.ClientBidID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ClientBidID getClientBidID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ClientBidID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ClientBidID field) {
		return isSetField(field);
	}

	public boolean isSetClientBidID() {
		return isSetField(391);
	}

	public void set(cl.bithaus.qfix.fields.BidRequestTransType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BidRequestTransType get(cl.bithaus.qfix.fields.BidRequestTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BidRequestTransType getBidRequestTransType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BidRequestTransType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BidRequestTransType field) {
		return isSetField(field);
	}

	public boolean isSetBidRequestTransType() {
		return isSetField(374);
	}

	public void set(cl.bithaus.qfix.fields.ListName value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ListName get(cl.bithaus.qfix.fields.ListName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ListName getListName() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ListName());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ListName field) {
		return isSetField(field);
	}

	public boolean isSetListName() {
		return isSetField(392);
	}

	public void set(cl.bithaus.qfix.fields.TotNoRelatedSym value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TotNoRelatedSym get(cl.bithaus.qfix.fields.TotNoRelatedSym value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TotNoRelatedSym getTotNoRelatedSym() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TotNoRelatedSym());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TotNoRelatedSym field) {
		return isSetField(field);
	}

	public boolean isSetTotNoRelatedSym() {
		return isSetField(393);
	}

	public void set(cl.bithaus.qfix.fields.BidType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BidType get(cl.bithaus.qfix.fields.BidType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BidType getBidType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BidType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BidType field) {
		return isSetField(field);
	}

	public boolean isSetBidType() {
		return isSetField(394);
	}

	public void set(cl.bithaus.qfix.fields.NumTickets value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NumTickets get(cl.bithaus.qfix.fields.NumTickets value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NumTickets getNumTickets() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NumTickets());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NumTickets field) {
		return isSetField(field);
	}

	public boolean isSetNumTickets() {
		return isSetField(395);
	}

	public void set(cl.bithaus.qfix.fields.Currency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Currency get(cl.bithaus.qfix.fields.Currency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Currency getCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Currency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Currency field) {
		return isSetField(field);
	}

	public boolean isSetCurrency() {
		return isSetField(15);
	}

	public void set(cl.bithaus.qfix.fields.SideValue1 value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SideValue1 get(cl.bithaus.qfix.fields.SideValue1 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SideValue1 getSideValue1() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SideValue1());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SideValue1 field) {
		return isSetField(field);
	}

	public boolean isSetSideValue1() {
		return isSetField(396);
	}

	public void set(cl.bithaus.qfix.fields.SideValue2 value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SideValue2 get(cl.bithaus.qfix.fields.SideValue2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SideValue2 getSideValue2() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SideValue2());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SideValue2 field) {
		return isSetField(field);
	}

	public boolean isSetSideValue2() {
		return isSetField(397);
	}

	public void set(cl.bithaus.qfix.fields.NoBidDescriptors value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoBidDescriptors get(cl.bithaus.qfix.fields.NoBidDescriptors value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoBidDescriptors getNoBidDescriptors() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoBidDescriptors());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoBidDescriptors field) {
		return isSetField(field);
	}

	public boolean isSetNoBidDescriptors() {
		return isSetField(398);
	}

	public static class NoBidDescriptors extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {399, 400, 401, 404, 441, 402, 403, 405, 406, 407, 408, 0};

		public NoBidDescriptors() {
			super(398, 399, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.BidDescriptorType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BidDescriptorType get(cl.bithaus.qfix.fields.BidDescriptorType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BidDescriptorType getBidDescriptorType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BidDescriptorType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BidDescriptorType field) {
		return isSetField(field);
	}

	public boolean isSetBidDescriptorType() {
		return isSetField(399);
	}

	public void set(cl.bithaus.qfix.fields.BidDescriptor value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BidDescriptor get(cl.bithaus.qfix.fields.BidDescriptor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BidDescriptor getBidDescriptor() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BidDescriptor());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BidDescriptor field) {
		return isSetField(field);
	}

	public boolean isSetBidDescriptor() {
		return isSetField(400);
	}

	public void set(cl.bithaus.qfix.fields.SideValueInd value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SideValueInd get(cl.bithaus.qfix.fields.SideValueInd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SideValueInd getSideValueInd() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SideValueInd());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SideValueInd field) {
		return isSetField(field);
	}

	public boolean isSetSideValueInd() {
		return isSetField(401);
	}

	public void set(cl.bithaus.qfix.fields.LiquidityValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LiquidityValue get(cl.bithaus.qfix.fields.LiquidityValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LiquidityValue getLiquidityValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LiquidityValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LiquidityValue field) {
		return isSetField(field);
	}

	public boolean isSetLiquidityValue() {
		return isSetField(404);
	}

	public void set(cl.bithaus.qfix.fields.LiquidityNumSecurities value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LiquidityNumSecurities get(cl.bithaus.qfix.fields.LiquidityNumSecurities value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LiquidityNumSecurities getLiquidityNumSecurities() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LiquidityNumSecurities());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LiquidityNumSecurities field) {
		return isSetField(field);
	}

	public boolean isSetLiquidityNumSecurities() {
		return isSetField(441);
	}

	public void set(cl.bithaus.qfix.fields.LiquidityPctLow value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LiquidityPctLow get(cl.bithaus.qfix.fields.LiquidityPctLow value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LiquidityPctLow getLiquidityPctLow() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LiquidityPctLow());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LiquidityPctLow field) {
		return isSetField(field);
	}

	public boolean isSetLiquidityPctLow() {
		return isSetField(402);
	}

	public void set(cl.bithaus.qfix.fields.LiquidityPctHigh value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LiquidityPctHigh get(cl.bithaus.qfix.fields.LiquidityPctHigh value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LiquidityPctHigh getLiquidityPctHigh() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LiquidityPctHigh());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LiquidityPctHigh field) {
		return isSetField(field);
	}

	public boolean isSetLiquidityPctHigh() {
		return isSetField(403);
	}

	public void set(cl.bithaus.qfix.fields.EFPTrackingError value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EFPTrackingError get(cl.bithaus.qfix.fields.EFPTrackingError value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EFPTrackingError getEFPTrackingError() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EFPTrackingError());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EFPTrackingError field) {
		return isSetField(field);
	}

	public boolean isSetEFPTrackingError() {
		return isSetField(405);
	}

	public void set(cl.bithaus.qfix.fields.FairValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.FairValue get(cl.bithaus.qfix.fields.FairValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.FairValue getFairValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.FairValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.FairValue field) {
		return isSetField(field);
	}

	public boolean isSetFairValue() {
		return isSetField(406);
	}

	public void set(cl.bithaus.qfix.fields.OutsideIndexPct value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OutsideIndexPct get(cl.bithaus.qfix.fields.OutsideIndexPct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OutsideIndexPct getOutsideIndexPct() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OutsideIndexPct());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OutsideIndexPct field) {
		return isSetField(field);
	}

	public boolean isSetOutsideIndexPct() {
		return isSetField(407);
	}

	public void set(cl.bithaus.qfix.fields.ValueOfFutures value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ValueOfFutures get(cl.bithaus.qfix.fields.ValueOfFutures value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ValueOfFutures getValueOfFutures() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ValueOfFutures());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ValueOfFutures field) {
		return isSetField(field);
	}

	public boolean isSetValueOfFutures() {
		return isSetField(408);
	}

	}

	public void set(cl.bithaus.qfix.fields.NoBidComponents value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoBidComponents get(cl.bithaus.qfix.fields.NoBidComponents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoBidComponents getNoBidComponents() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoBidComponents());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoBidComponents field) {
		return isSetField(field);
	}

	public boolean isSetNoBidComponents() {
		return isSetField(420);
	}

	public static class NoBidComponents extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {66, 54, 336, 625, 430, 63, 64, 1, 660, 0};

		public NoBidComponents() {
			super(420, 66, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.ListID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ListID get(cl.bithaus.qfix.fields.ListID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ListID getListID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ListID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ListID field) {
		return isSetField(field);
	}

	public boolean isSetListID() {
		return isSetField(66);
	}

	public void set(cl.bithaus.qfix.fields.Side value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Side get(cl.bithaus.qfix.fields.Side value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Side getSide() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Side());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Side field) {
		return isSetField(field);
	}

	public boolean isSetSide() {
		return isSetField(54);
	}

	public void set(cl.bithaus.qfix.fields.TradingSessionID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradingSessionID get(cl.bithaus.qfix.fields.TradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradingSessionID getTradingSessionID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradingSessionID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionID() {
		return isSetField(336);
	}

	public void set(cl.bithaus.qfix.fields.TradingSessionSubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradingSessionSubID get(cl.bithaus.qfix.fields.TradingSessionSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradingSessionSubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradingSessionSubID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionSubID() {
		return isSetField(625);
	}

	public void set(cl.bithaus.qfix.fields.NetGrossInd value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NetGrossInd get(cl.bithaus.qfix.fields.NetGrossInd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NetGrossInd getNetGrossInd() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NetGrossInd());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NetGrossInd field) {
		return isSetField(field);
	}

	public boolean isSetNetGrossInd() {
		return isSetField(430);
	}

	public void set(cl.bithaus.qfix.fields.SettlType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlType get(cl.bithaus.qfix.fields.SettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlType getSettlType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlType field) {
		return isSetField(field);
	}

	public boolean isSetSettlType() {
		return isSetField(63);
	}

	public void set(cl.bithaus.qfix.fields.SettlDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlDate get(cl.bithaus.qfix.fields.SettlDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlDate getSettlDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlDate field) {
		return isSetField(field);
	}

	public boolean isSetSettlDate() {
		return isSetField(64);
	}

	public void set(cl.bithaus.qfix.fields.Account value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Account get(cl.bithaus.qfix.fields.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Account getAccount() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Account());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
	}

	public void set(cl.bithaus.qfix.fields.AcctIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AcctIDSource get(cl.bithaus.qfix.fields.AcctIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AcctIDSource getAcctIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AcctIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AcctIDSource field) {
		return isSetField(field);
	}

	public boolean isSetAcctIDSource() {
		return isSetField(660);
	}

	}

	public void set(cl.bithaus.qfix.fields.LiquidityIndType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LiquidityIndType get(cl.bithaus.qfix.fields.LiquidityIndType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LiquidityIndType getLiquidityIndType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LiquidityIndType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LiquidityIndType field) {
		return isSetField(field);
	}

	public boolean isSetLiquidityIndType() {
		return isSetField(409);
	}

	public void set(cl.bithaus.qfix.fields.WtAverageLiquidity value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.WtAverageLiquidity get(cl.bithaus.qfix.fields.WtAverageLiquidity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.WtAverageLiquidity getWtAverageLiquidity() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.WtAverageLiquidity());
	}

	public boolean isSet(cl.bithaus.qfix.fields.WtAverageLiquidity field) {
		return isSetField(field);
	}

	public boolean isSetWtAverageLiquidity() {
		return isSetField(410);
	}

	public void set(cl.bithaus.qfix.fields.ExchangeForPhysical value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ExchangeForPhysical get(cl.bithaus.qfix.fields.ExchangeForPhysical value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ExchangeForPhysical getExchangeForPhysical() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ExchangeForPhysical());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ExchangeForPhysical field) {
		return isSetField(field);
	}

	public boolean isSetExchangeForPhysical() {
		return isSetField(411);
	}

	public void set(cl.bithaus.qfix.fields.OutMainCntryUIndex value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OutMainCntryUIndex get(cl.bithaus.qfix.fields.OutMainCntryUIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OutMainCntryUIndex getOutMainCntryUIndex() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OutMainCntryUIndex());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OutMainCntryUIndex field) {
		return isSetField(field);
	}

	public boolean isSetOutMainCntryUIndex() {
		return isSetField(412);
	}

	public void set(cl.bithaus.qfix.fields.CrossPercent value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CrossPercent get(cl.bithaus.qfix.fields.CrossPercent value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CrossPercent getCrossPercent() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CrossPercent());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CrossPercent field) {
		return isSetField(field);
	}

	public boolean isSetCrossPercent() {
		return isSetField(413);
	}

	public void set(cl.bithaus.qfix.fields.ProgRptReqs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ProgRptReqs get(cl.bithaus.qfix.fields.ProgRptReqs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ProgRptReqs getProgRptReqs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ProgRptReqs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ProgRptReqs field) {
		return isSetField(field);
	}

	public boolean isSetProgRptReqs() {
		return isSetField(414);
	}

	public void set(cl.bithaus.qfix.fields.ProgPeriodInterval value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ProgPeriodInterval get(cl.bithaus.qfix.fields.ProgPeriodInterval value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ProgPeriodInterval getProgPeriodInterval() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ProgPeriodInterval());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ProgPeriodInterval field) {
		return isSetField(field);
	}

	public boolean isSetProgPeriodInterval() {
		return isSetField(415);
	}

	public void set(cl.bithaus.qfix.fields.IncTaxInd value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IncTaxInd get(cl.bithaus.qfix.fields.IncTaxInd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IncTaxInd getIncTaxInd() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IncTaxInd());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IncTaxInd field) {
		return isSetField(field);
	}

	public boolean isSetIncTaxInd() {
		return isSetField(416);
	}

	public void set(cl.bithaus.qfix.fields.ForexReq value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ForexReq get(cl.bithaus.qfix.fields.ForexReq value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ForexReq getForexReq() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ForexReq());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ForexReq field) {
		return isSetField(field);
	}

	public boolean isSetForexReq() {
		return isSetField(121);
	}

	public void set(cl.bithaus.qfix.fields.NumBidders value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NumBidders get(cl.bithaus.qfix.fields.NumBidders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NumBidders getNumBidders() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NumBidders());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NumBidders field) {
		return isSetField(field);
	}

	public boolean isSetNumBidders() {
		return isSetField(417);
	}

	public void set(cl.bithaus.qfix.fields.TradeDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeDate get(cl.bithaus.qfix.fields.TradeDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeDate getTradeDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeDate field) {
		return isSetField(field);
	}

	public boolean isSetTradeDate() {
		return isSetField(75);
	}

	public void set(cl.bithaus.qfix.fields.BidTradeType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BidTradeType get(cl.bithaus.qfix.fields.BidTradeType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BidTradeType getBidTradeType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BidTradeType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BidTradeType field) {
		return isSetField(field);
	}

	public boolean isSetBidTradeType() {
		return isSetField(418);
	}

	public void set(cl.bithaus.qfix.fields.BasisPxType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BasisPxType get(cl.bithaus.qfix.fields.BasisPxType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BasisPxType getBasisPxType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BasisPxType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BasisPxType field) {
		return isSetField(field);
	}

	public boolean isSetBasisPxType() {
		return isSetField(419);
	}

	public void set(cl.bithaus.qfix.fields.StrikeTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StrikeTime get(cl.bithaus.qfix.fields.StrikeTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StrikeTime getStrikeTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StrikeTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StrikeTime field) {
		return isSetField(field);
	}

	public boolean isSetStrikeTime() {
		return isSetField(443);
	}

	public void set(cl.bithaus.qfix.fields.Text value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Text get(cl.bithaus.qfix.fields.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Text getText() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Text());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

	public void set(cl.bithaus.qfix.fields.EncodedTextLen value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedTextLen get(cl.bithaus.qfix.fields.EncodedTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedTextLen());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedTextLen() {
		return isSetField(354);
	}

	public void set(cl.bithaus.qfix.fields.EncodedText value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedText get(cl.bithaus.qfix.fields.EncodedText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedText getEncodedText() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedText());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedText() {
		return isSetField(355);
	}

}
