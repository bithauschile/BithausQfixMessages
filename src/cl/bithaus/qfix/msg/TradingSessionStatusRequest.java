
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;


public class TradingSessionStatusRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "g";
	

	public TradingSessionStatusRequest() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public TradingSessionStatusRequest(cl.bithaus.qfix.fields.TradSesReqID tradSesReqID, cl.bithaus.qfix.fields.SubscriptionRequestType subscriptionRequestType) {
		this();
		setField(tradSesReqID);
		setField(subscriptionRequestType);
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

	public void set(cl.bithaus.qfix.fields.SubscriptionRequestType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SubscriptionRequestType get(cl.bithaus.qfix.fields.SubscriptionRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SubscriptionRequestType getSubscriptionRequestType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SubscriptionRequestType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SubscriptionRequestType field) {
		return isSetField(field);
	}

	public boolean isSetSubscriptionRequestType() {
		return isSetField(263);
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

}
