
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class PositionAmountData extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 753,  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public PositionAmountData() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.NoPosAmt value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoPosAmt get(cl.bithaus.qfix.fields.NoPosAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoPosAmt getNoPosAmt() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoPosAmt());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoPosAmt field) {
		return isSetField(field);
	}

	public boolean isSetNoPosAmt() {
		return isSetField(753);
	}

	public static class NoPosAmt extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {707, 708, 0};

		public NoPosAmt() {
			super(753, 707, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.PosAmtType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PosAmtType get(cl.bithaus.qfix.fields.PosAmtType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PosAmtType getPosAmtType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PosAmtType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PosAmtType field) {
		return isSetField(field);
	}

	public boolean isSetPosAmtType() {
		return isSetField(707);
	}

	public void set(cl.bithaus.qfix.fields.PosAmt value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PosAmt get(cl.bithaus.qfix.fields.PosAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PosAmt getPosAmt() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PosAmt());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PosAmt field) {
		return isSetField(field);
	}

	public boolean isSetPosAmt() {
		return isSetField(708);
	}

	}

}
