
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class SecurityTypes extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "w";
	

	public SecurityTypes() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public SecurityTypes(cl.bithaus.qfix.fields.SecurityReqID securityReqID, cl.bithaus.qfix.fields.SecurityResponseID securityResponseID, cl.bithaus.qfix.fields.SecurityResponseType securityResponseType) {
		this();
		setField(securityReqID);
		setField(securityResponseID);
		setField(securityResponseType);
	}
	
	public void set(cl.bithaus.qfix.fields.SecurityReqID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecurityReqID get(cl.bithaus.qfix.fields.SecurityReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecurityReqID getSecurityReqID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecurityReqID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecurityReqID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityReqID() {
		return isSetField(320);
	}

	public void set(cl.bithaus.qfix.fields.SecurityResponseID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecurityResponseID get(cl.bithaus.qfix.fields.SecurityResponseID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecurityResponseID getSecurityResponseID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecurityResponseID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecurityResponseID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityResponseID() {
		return isSetField(322);
	}

	public void set(cl.bithaus.qfix.fields.SecurityResponseType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecurityResponseType get(cl.bithaus.qfix.fields.SecurityResponseType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecurityResponseType getSecurityResponseType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecurityResponseType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecurityResponseType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityResponseType() {
		return isSetField(323);
	}

	public void set(cl.bithaus.qfix.fields.TotNoSecurityTypes value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TotNoSecurityTypes get(cl.bithaus.qfix.fields.TotNoSecurityTypes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TotNoSecurityTypes getTotNoSecurityTypes() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TotNoSecurityTypes());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TotNoSecurityTypes field) {
		return isSetField(field);
	}

	public boolean isSetTotNoSecurityTypes() {
		return isSetField(557);
	}

	public void set(cl.bithaus.qfix.fields.LastFragment value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LastFragment get(cl.bithaus.qfix.fields.LastFragment value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LastFragment getLastFragment() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LastFragment());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LastFragment field) {
		return isSetField(field);
	}

	public boolean isSetLastFragment() {
		return isSetField(893);
	}

	public void set(cl.bithaus.qfix.fields.NoSecurityTypes value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoSecurityTypes get(cl.bithaus.qfix.fields.NoSecurityTypes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoSecurityTypes getNoSecurityTypes() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoSecurityTypes());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoSecurityTypes field) {
		return isSetField(field);
	}

	public boolean isSetNoSecurityTypes() {
		return isSetField(558);
	}

	public static class NoSecurityTypes extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {167, 762, 460, 461, 0};

		public NoSecurityTypes() {
			super(558, 167, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.SecurityType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecurityType get(cl.bithaus.qfix.fields.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecurityType getSecurityType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecurityType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(cl.bithaus.qfix.fields.SecuritySubType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecuritySubType get(cl.bithaus.qfix.fields.SecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecuritySubType getSecuritySubType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecuritySubType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetSecuritySubType() {
		return isSetField(762);
	}

	public void set(cl.bithaus.qfix.fields.Product value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Product get(cl.bithaus.qfix.fields.Product value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Product getProduct() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Product());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Product field) {
		return isSetField(field);
	}

	public boolean isSetProduct() {
		return isSetField(460);
	}

	public void set(cl.bithaus.qfix.fields.CFICode value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CFICode get(cl.bithaus.qfix.fields.CFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CFICode getCFICode() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CFICode());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CFICode field) {
		return isSetField(field);
	}

	public boolean isSetCFICode() {
		return isSetField(461);
	}

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

}
