
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class BidResponse extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "l";
	

	public BidResponse() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
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
		private static final int[] ORDER = {12, 13, 479, 497, 66, 421, 54, 44, 423, 406, 430, 63, 64, 336, 625, 58, 354, 355, 0};

		public NoBidComponents() {
			super(420, 12, ORDER);
		}
		
	public void set(cl.bithaus.qfix.msg.component.CommissionData component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.CommissionData get(cl.bithaus.qfix.msg.component.CommissionData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.CommissionData getCommissionData() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.CommissionData());
	}

	public void set(cl.bithaus.qfix.fields.Commission value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Commission get(cl.bithaus.qfix.fields.Commission value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Commission getCommission() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Commission());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Commission field) {
		return isSetField(field);
	}

	public boolean isSetCommission() {
		return isSetField(12);
	}

	public void set(cl.bithaus.qfix.fields.CommType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CommType get(cl.bithaus.qfix.fields.CommType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CommType getCommType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CommType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CommType field) {
		return isSetField(field);
	}

	public boolean isSetCommType() {
		return isSetField(13);
	}

	public void set(cl.bithaus.qfix.fields.CommCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CommCurrency get(cl.bithaus.qfix.fields.CommCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CommCurrency getCommCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CommCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CommCurrency field) {
		return isSetField(field);
	}

	public boolean isSetCommCurrency() {
		return isSetField(479);
	}

	public void set(cl.bithaus.qfix.fields.FundRenewWaiv value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.FundRenewWaiv get(cl.bithaus.qfix.fields.FundRenewWaiv value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.FundRenewWaiv getFundRenewWaiv() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.FundRenewWaiv());
	}

	public boolean isSet(cl.bithaus.qfix.fields.FundRenewWaiv field) {
		return isSetField(field);
	}

	public boolean isSetFundRenewWaiv() {
		return isSetField(497);
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

	public void set(cl.bithaus.qfix.fields.Country value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Country get(cl.bithaus.qfix.fields.Country value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Country getCountry() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Country());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Country field) {
		return isSetField(field);
	}

	public boolean isSetCountry() {
		return isSetField(421);
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

	public void set(cl.bithaus.qfix.fields.Price value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Price get(cl.bithaus.qfix.fields.Price value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Price getPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Price());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Price field) {
		return isSetField(field);
	}

	public boolean isSetPrice() {
		return isSetField(44);
	}

	public void set(cl.bithaus.qfix.fields.PriceType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PriceType get(cl.bithaus.qfix.fields.PriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PriceType getPriceType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PriceType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PriceType field) {
		return isSetField(field);
	}

	public boolean isSetPriceType() {
		return isSetField(423);
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

}
