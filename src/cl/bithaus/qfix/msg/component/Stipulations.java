
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class Stipulations extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 232,  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public Stipulations() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.NoStipulations value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoStipulations get(cl.bithaus.qfix.fields.NoStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoStipulations getNoStipulations() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoStipulations());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoStipulations() {
		return isSetField(232);
	}

	public static class NoStipulations extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {233, 234, 0};

		public NoStipulations() {
			super(232, 233, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.StipulationType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StipulationType get(cl.bithaus.qfix.fields.StipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StipulationType getStipulationType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StipulationType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StipulationType field) {
		return isSetField(field);
	}

	public boolean isSetStipulationType() {
		return isSetField(233);
	}

	public void set(cl.bithaus.qfix.fields.StipulationValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StipulationValue get(cl.bithaus.qfix.fields.StipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StipulationValue getStipulationValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StipulationValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetStipulationValue() {
		return isSetField(234);
	}

	}

}
