
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;


public class ApplicationSequenceControl extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 1180, 1181, 1350, 1352,  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public ApplicationSequenceControl() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.ApplID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ApplID get(cl.bithaus.qfix.fields.ApplID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ApplID getApplID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ApplID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ApplID field) {
		return isSetField(field);
	}

	public boolean isSetApplID() {
		return isSetField(1180);
	}

	public void set(cl.bithaus.qfix.fields.ApplSeqNum value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ApplSeqNum get(cl.bithaus.qfix.fields.ApplSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ApplSeqNum getApplSeqNum() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ApplSeqNum());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ApplSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetApplSeqNum() {
		return isSetField(1181);
	}

	public void set(cl.bithaus.qfix.fields.ApplLastSeqNum value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ApplLastSeqNum get(cl.bithaus.qfix.fields.ApplLastSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ApplLastSeqNum getApplLastSeqNum() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ApplLastSeqNum());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ApplLastSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetApplLastSeqNum() {
		return isSetField(1350);
	}

	public void set(cl.bithaus.qfix.fields.ApplResendFlag value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ApplResendFlag get(cl.bithaus.qfix.fields.ApplResendFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ApplResendFlag getApplResendFlag() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ApplResendFlag());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ApplResendFlag field) {
		return isSetField(field);
	}

	public boolean isSetApplResendFlag() {
		return isSetField(1352);
	}

}
