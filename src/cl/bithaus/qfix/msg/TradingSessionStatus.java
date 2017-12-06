
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;


public class TradingSessionStatus extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "h";
	

	public TradingSessionStatus() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public TradingSessionStatus(cl.bithaus.qfix.fields.TradingSessionID tradingSessionID, cl.bithaus.qfix.fields.TradSesStatus tradSesStatus) {
		this();
		setField(tradingSessionID);
		setField(tradSesStatus);
	}
	
	public void set(cl.bithaus.qfix.fields.TradSesReqID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradSesReqID get(cl.bithaus.qfix.fields.TradSesReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradSesReqID getTradSesReqID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradSesReqID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradSesReqID field) {
		return isSetField(field);
	}

	public boolean isSetTradSesReqID() {
		return isSetField(335);
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

	public void set(cl.bithaus.qfix.fields.TradSesMethod value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradSesMethod get(cl.bithaus.qfix.fields.TradSesMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradSesMethod getTradSesMethod() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradSesMethod());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradSesMethod field) {
		return isSetField(field);
	}

	public boolean isSetTradSesMethod() {
		return isSetField(338);
	}

	public void set(cl.bithaus.qfix.fields.TradSesMode value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradSesMode get(cl.bithaus.qfix.fields.TradSesMode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradSesMode getTradSesMode() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradSesMode());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradSesMode field) {
		return isSetField(field);
	}

	public boolean isSetTradSesMode() {
		return isSetField(339);
	}

	public void set(cl.bithaus.qfix.fields.UnsolicitedIndicator value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnsolicitedIndicator get(cl.bithaus.qfix.fields.UnsolicitedIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnsolicitedIndicator getUnsolicitedIndicator() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnsolicitedIndicator());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnsolicitedIndicator field) {
		return isSetField(field);
	}

	public boolean isSetUnsolicitedIndicator() {
		return isSetField(325);
	}

	public void set(cl.bithaus.qfix.fields.TradSesStatus value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradSesStatus get(cl.bithaus.qfix.fields.TradSesStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradSesStatus getTradSesStatus() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradSesStatus());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradSesStatus field) {
		return isSetField(field);
	}

	public boolean isSetTradSesStatus() {
		return isSetField(340);
	}

	public void set(cl.bithaus.qfix.fields.TradSesStatusRejReason value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradSesStatusRejReason get(cl.bithaus.qfix.fields.TradSesStatusRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradSesStatusRejReason getTradSesStatusRejReason() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradSesStatusRejReason());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradSesStatusRejReason field) {
		return isSetField(field);
	}

	public boolean isSetTradSesStatusRejReason() {
		return isSetField(567);
	}

	public void set(cl.bithaus.qfix.fields.TradSesStartTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradSesStartTime get(cl.bithaus.qfix.fields.TradSesStartTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradSesStartTime getTradSesStartTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradSesStartTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradSesStartTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesStartTime() {
		return isSetField(341);
	}

	public void set(cl.bithaus.qfix.fields.TradSesOpenTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradSesOpenTime get(cl.bithaus.qfix.fields.TradSesOpenTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradSesOpenTime getTradSesOpenTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradSesOpenTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradSesOpenTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesOpenTime() {
		return isSetField(342);
	}

	public void set(cl.bithaus.qfix.fields.TradSesPreCloseTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradSesPreCloseTime get(cl.bithaus.qfix.fields.TradSesPreCloseTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradSesPreCloseTime getTradSesPreCloseTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradSesPreCloseTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradSesPreCloseTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesPreCloseTime() {
		return isSetField(343);
	}

	public void set(cl.bithaus.qfix.fields.TradSesCloseTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradSesCloseTime get(cl.bithaus.qfix.fields.TradSesCloseTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradSesCloseTime getTradSesCloseTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradSesCloseTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradSesCloseTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesCloseTime() {
		return isSetField(344);
	}

	public void set(cl.bithaus.qfix.fields.TradSesEndTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradSesEndTime get(cl.bithaus.qfix.fields.TradSesEndTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradSesEndTime getTradSesEndTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradSesEndTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradSesEndTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesEndTime() {
		return isSetField(345);
	}

	public void set(cl.bithaus.qfix.fields.TotalVolumeTraded value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TotalVolumeTraded get(cl.bithaus.qfix.fields.TotalVolumeTraded value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TotalVolumeTraded getTotalVolumeTraded() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TotalVolumeTraded());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TotalVolumeTraded field) {
		return isSetField(field);
	}

	public boolean isSetTotalVolumeTraded() {
		return isSetField(387);
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

	public void set(cl.bithaus.qfix.fields.ExDestination value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ExDestination get(cl.bithaus.qfix.fields.ExDestination value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ExDestination getExDestination() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ExDestination());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ExDestination field) {
		return isSetField(field);
	}

	public boolean isSetExDestination() {
		return isSetField(100);
	}

	public void set(cl.bithaus.qfix.fields.AuctionId value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AuctionId get(cl.bithaus.qfix.fields.AuctionId value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AuctionId getAuctionId() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AuctionId());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AuctionId field) {
		return isSetField(field);
	}

	public boolean isSetAuctionId() {
		return isSetField(10167);
	}

	public void set(cl.bithaus.qfix.fields.MarketSegmentID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MarketSegmentID get(cl.bithaus.qfix.fields.MarketSegmentID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MarketSegmentID getMarketSegmentID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MarketSegmentID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MarketSegmentID field) {
		return isSetField(field);
	}

	public boolean isSetMarketSegmentID() {
		return isSetField(1300);
	}

	public void set(cl.bithaus.qfix.fields.OffersNumber value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OffersNumber get(cl.bithaus.qfix.fields.OffersNumber value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OffersNumber getOffersNumber() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OffersNumber());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OffersNumber field) {
		return isSetField(field);
	}

	public boolean isSetOffersNumber() {
		return isSetField(10226);
	}

	public void set(cl.bithaus.qfix.fields.OffersAmount value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OffersAmount get(cl.bithaus.qfix.fields.OffersAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OffersAmount getOffersAmount() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OffersAmount());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OffersAmount field) {
		return isSetField(field);
	}

	public boolean isSetOffersAmount() {
		return isSetField(10227);
	}

}
