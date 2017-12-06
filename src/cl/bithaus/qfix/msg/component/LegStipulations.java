
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class LegStipulations extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 683,  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public LegStipulations() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.NoLegStipulations value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoLegStipulations get(cl.bithaus.qfix.fields.NoLegStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoLegStipulations getNoLegStipulations() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoLegStipulations());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoLegStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoLegStipulations() {
		return isSetField(683);
	}

	public static class NoLegStipulations extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {688, 689, 0};

		public NoLegStipulations() {
			super(683, 688, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.LegStipulationType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegStipulationType get(cl.bithaus.qfix.fields.LegStipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegStipulationType getLegStipulationType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegStipulationType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegStipulationType field) {
		return isSetField(field);
	}

	public boolean isSetLegStipulationType() {
		return isSetField(688);
	}

	public void set(cl.bithaus.qfix.fields.LegStipulationValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegStipulationValue get(cl.bithaus.qfix.fields.LegStipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegStipulationValue getLegStipulationValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegStipulationValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegStipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetLegStipulationValue() {
		return isSetField(689);
	}

	}

}
