
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;


public class BusinessMessageReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "j";
	

	public BusinessMessageReject() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public BusinessMessageReject(cl.bithaus.qfix.fields.RefMsgType refMsgType, cl.bithaus.qfix.fields.BusinessRejectReason businessRejectReason) {
		this();
		setField(refMsgType);
		setField(businessRejectReason);
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

	public void set(cl.bithaus.qfix.fields.BusinessRejectRefID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BusinessRejectRefID get(cl.bithaus.qfix.fields.BusinessRejectRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BusinessRejectRefID getBusinessRejectRefID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BusinessRejectRefID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BusinessRejectRefID field) {
		return isSetField(field);
	}

	public boolean isSetBusinessRejectRefID() {
		return isSetField(379);
	}

	public void set(cl.bithaus.qfix.fields.BusinessRejectReason value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BusinessRejectReason get(cl.bithaus.qfix.fields.BusinessRejectReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BusinessRejectReason getBusinessRejectReason() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BusinessRejectReason());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BusinessRejectReason field) {
		return isSetField(field);
	}

	public boolean isSetBusinessRejectReason() {
		return isSetField(380);
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
