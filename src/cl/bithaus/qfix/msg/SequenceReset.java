
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;


public class SequenceReset extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "4";
	

	public SequenceReset() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public SequenceReset(cl.bithaus.qfix.fields.NewSeqNo newSeqNo) {
		this();
		setField(newSeqNo);
	}
	
	public void set(cl.bithaus.qfix.fields.GapFillFlag value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.GapFillFlag get(cl.bithaus.qfix.fields.GapFillFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.GapFillFlag getGapFillFlag() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.GapFillFlag());
	}

	public boolean isSet(cl.bithaus.qfix.fields.GapFillFlag field) {
		return isSetField(field);
	}

	public boolean isSetGapFillFlag() {
		return isSetField(123);
	}

	public void set(cl.bithaus.qfix.fields.NewSeqNo value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NewSeqNo get(cl.bithaus.qfix.fields.NewSeqNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NewSeqNo getNewSeqNo() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NewSeqNo());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NewSeqNo field) {
		return isSetField(field);
	}

	public boolean isSetNewSeqNo() {
		return isSetField(36);
	}

}
