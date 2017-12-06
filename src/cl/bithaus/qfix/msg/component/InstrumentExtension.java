
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class InstrumentExtension extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 668, 869,  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 870,  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public InstrumentExtension() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.DeliveryForm value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DeliveryForm get(cl.bithaus.qfix.fields.DeliveryForm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DeliveryForm getDeliveryForm() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DeliveryForm());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DeliveryForm field) {
		return isSetField(field);
	}

	public boolean isSetDeliveryForm() {
		return isSetField(668);
	}

	public void set(cl.bithaus.qfix.fields.PctAtRisk value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PctAtRisk get(cl.bithaus.qfix.fields.PctAtRisk value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PctAtRisk getPctAtRisk() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PctAtRisk());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PctAtRisk field) {
		return isSetField(field);
	}

	public boolean isSetPctAtRisk() {
		return isSetField(869);
	}

	public void set(cl.bithaus.qfix.fields.NoInstrAttrib value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoInstrAttrib get(cl.bithaus.qfix.fields.NoInstrAttrib value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoInstrAttrib getNoInstrAttrib() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoInstrAttrib());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoInstrAttrib field) {
		return isSetField(field);
	}

	public boolean isSetNoInstrAttrib() {
		return isSetField(870);
	}

	public static class NoInstrAttrib extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {871, 872, 0};

		public NoInstrAttrib() {
			super(870, 871, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.InstrAttribType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.InstrAttribType get(cl.bithaus.qfix.fields.InstrAttribType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.InstrAttribType getInstrAttribType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.InstrAttribType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.InstrAttribType field) {
		return isSetField(field);
	}

	public boolean isSetInstrAttribType() {
		return isSetField(871);
	}

	public void set(cl.bithaus.qfix.fields.InstrAttribValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.InstrAttribValue get(cl.bithaus.qfix.fields.InstrAttribValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.InstrAttribValue getInstrAttribValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.InstrAttribValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.InstrAttribValue field) {
		return isSetField(field);
	}

	public boolean isSetInstrAttribValue() {
		return isSetField(872);
	}

	}

}
