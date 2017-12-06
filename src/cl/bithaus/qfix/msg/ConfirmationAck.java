
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;


public class ConfirmationAck extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "AU";
	

	public ConfirmationAck() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public ConfirmationAck(cl.bithaus.qfix.fields.ConfirmID confirmID, cl.bithaus.qfix.fields.TradeDate tradeDate, cl.bithaus.qfix.fields.TransactTime transactTime, cl.bithaus.qfix.fields.AffirmStatus affirmStatus) {
		this();
		setField(confirmID);
		setField(tradeDate);
		setField(transactTime);
		setField(affirmStatus);
	}
	
	public void set(cl.bithaus.qfix.fields.ConfirmID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ConfirmID get(cl.bithaus.qfix.fields.ConfirmID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ConfirmID getConfirmID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ConfirmID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ConfirmID field) {
		return isSetField(field);
	}

	public boolean isSetConfirmID() {
		return isSetField(664);
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

	public void set(cl.bithaus.qfix.fields.TransactTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TransactTime get(cl.bithaus.qfix.fields.TransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TransactTime getTransactTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TransactTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TransactTime field) {
		return isSetField(field);
	}

	public boolean isSetTransactTime() {
		return isSetField(60);
	}

	public void set(cl.bithaus.qfix.fields.AffirmStatus value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AffirmStatus get(cl.bithaus.qfix.fields.AffirmStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AffirmStatus getAffirmStatus() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AffirmStatus());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AffirmStatus field) {
		return isSetField(field);
	}

	public boolean isSetAffirmStatus() {
		return isSetField(940);
	}

	public void set(cl.bithaus.qfix.fields.ConfirmRejReason value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ConfirmRejReason get(cl.bithaus.qfix.fields.ConfirmRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ConfirmRejReason getConfirmRejReason() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ConfirmRejReason());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ConfirmRejReason field) {
		return isSetField(field);
	}

	public boolean isSetConfirmRejReason() {
		return isSetField(774);
	}

	public void set(cl.bithaus.qfix.fields.MatchStatus value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MatchStatus get(cl.bithaus.qfix.fields.MatchStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MatchStatus getMatchStatus() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MatchStatus());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MatchStatus field) {
		return isSetField(field);
	}

	public boolean isSetMatchStatus() {
		return isSetField(573);
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
