
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MarketDataRequestReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "Y";
	

	public MarketDataRequestReject() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public MarketDataRequestReject(cl.bithaus.qfix.fields.MDReqID mDReqID) {
		this();
		setField(mDReqID);
	}
	
	public void set(cl.bithaus.qfix.fields.MDReqID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDReqID get(cl.bithaus.qfix.fields.MDReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDReqID getMDReqID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDReqID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDReqID field) {
		return isSetField(field);
	}

	public boolean isSetMDReqID() {
		return isSetField(262);
	}

	public void set(cl.bithaus.qfix.fields.MDReqRejReason value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDReqRejReason get(cl.bithaus.qfix.fields.MDReqRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDReqRejReason getMDReqRejReason() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDReqRejReason());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDReqRejReason field) {
		return isSetField(field);
	}

	public boolean isSetMDReqRejReason() {
		return isSetField(281);
	}

	public void set(cl.bithaus.qfix.fields.NoAltMDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoAltMDSource get(cl.bithaus.qfix.fields.NoAltMDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoAltMDSource getNoAltMDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoAltMDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoAltMDSource field) {
		return isSetField(field);
	}

	public boolean isSetNoAltMDSource() {
		return isSetField(816);
	}

	public static class NoAltMDSource extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {817, 0};

		public NoAltMDSource() {
			super(816, 817, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.AltMDSourceID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AltMDSourceID get(cl.bithaus.qfix.fields.AltMDSourceID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AltMDSourceID getAltMDSourceID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AltMDSourceID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AltMDSourceID field) {
		return isSetField(field);
	}

	public boolean isSetAltMDSourceID() {
		return isSetField(817);
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

}
