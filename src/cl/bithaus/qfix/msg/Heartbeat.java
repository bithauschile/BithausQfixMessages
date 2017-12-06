
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;


public class Heartbeat extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "0";
	

	public Heartbeat() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public void set(cl.bithaus.qfix.fields.TestReqID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TestReqID get(cl.bithaus.qfix.fields.TestReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TestReqID getTestReqID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TestReqID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TestReqID field) {
		return isSetField(field);
	}

	public boolean isSetTestReqID() {
		return isSetField(112);
	}

}
