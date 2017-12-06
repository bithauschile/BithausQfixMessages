
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;


public class Reject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "3";
	

	public Reject() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public Reject(cl.bithaus.qfix.fields.RefSeqNum refSeqNum) {
		this();
		setField(refSeqNum);
	}
	
	public void set(cl.bithaus.qfix.fields.RefSeqNum value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RefSeqNum get(cl.bithaus.qfix.fields.RefSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RefSeqNum getRefSeqNum() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RefSeqNum());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RefSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetRefSeqNum() {
		return isSetField(45);
	}

	public void set(cl.bithaus.qfix.fields.RefTagID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RefTagID get(cl.bithaus.qfix.fields.RefTagID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RefTagID getRefTagID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RefTagID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RefTagID field) {
		return isSetField(field);
	}

	public boolean isSetRefTagID() {
		return isSetField(371);
	}

	public void set(cl.bithaus.qfix.fields.RefMsgType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RefMsgType get(cl.bithaus.qfix.fields.RefMsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RefMsgType getRefMsgType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RefMsgType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RefMsgType field) {
		return isSetField(field);
	}

	public boolean isSetRefMsgType() {
		return isSetField(372);
	}

	public void set(cl.bithaus.qfix.fields.SessionRejectReason value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SessionRejectReason get(cl.bithaus.qfix.fields.SessionRejectReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SessionRejectReason getSessionRejectReason() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SessionRejectReason());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SessionRejectReason field) {
		return isSetField(field);
	}

	public boolean isSetSessionRejectReason() {
		return isSetField(373);
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
