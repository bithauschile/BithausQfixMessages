
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;


public class ResendRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "2";
	

	public ResendRequest() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public ResendRequest(cl.bithaus.qfix.fields.BeginSeqNo beginSeqNo, cl.bithaus.qfix.fields.EndSeqNo endSeqNo) {
		this();
		setField(beginSeqNo);
		setField(endSeqNo);
	}
	
	public void set(cl.bithaus.qfix.fields.BeginSeqNo value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BeginSeqNo get(cl.bithaus.qfix.fields.BeginSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BeginSeqNo getBeginSeqNo() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BeginSeqNo());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BeginSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetBeginSeqNo() {
		return isSetField(7);
	}

	public void set(cl.bithaus.qfix.fields.EndSeqNo value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EndSeqNo get(cl.bithaus.qfix.fields.EndSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EndSeqNo getEndSeqNo() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EndSeqNo());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EndSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetEndSeqNo() {
		return isSetField(16);
	}

}
