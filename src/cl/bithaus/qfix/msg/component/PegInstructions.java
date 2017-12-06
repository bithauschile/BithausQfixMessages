
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;


public class PegInstructions extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 211,  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public PegInstructions() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.PegOffsetValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PegOffsetValue get(cl.bithaus.qfix.fields.PegOffsetValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PegOffsetValue getPegOffsetValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PegOffsetValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PegOffsetValue field) {
		return isSetField(field);
	}

	public boolean isSetPegOffsetValue() {
		return isSetField(211);
	}

}
