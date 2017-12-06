
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class NestedParties extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 539,  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public NestedParties() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.NoNestedPartyIDs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoNestedPartyIDs get(cl.bithaus.qfix.fields.NoNestedPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoNestedPartyIDs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoNestedPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartyIDs() {
		return isSetField(539);
	}

	public static class NoNestedPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {524, 525, 538, 804, 0};

		public NoNestedPartyIDs() {
			super(539, 524, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.NestedPartyID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NestedPartyID get(cl.bithaus.qfix.fields.NestedPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NestedPartyID getNestedPartyID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NestedPartyID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NestedPartyID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyID() {
		return isSetField(524);
	}

	public void set(cl.bithaus.qfix.fields.NestedPartyIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NestedPartyIDSource get(cl.bithaus.qfix.fields.NestedPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NestedPartyIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NestedPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyIDSource() {
		return isSetField(525);
	}

	public void set(cl.bithaus.qfix.fields.NestedPartyRole value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NestedPartyRole get(cl.bithaus.qfix.fields.NestedPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NestedPartyRole());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NestedPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyRole() {
		return isSetField(538);
	}

	public void set(cl.bithaus.qfix.fields.NoNestedPartySubIDs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoNestedPartySubIDs get(cl.bithaus.qfix.fields.NoNestedPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoNestedPartySubIDs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoNestedPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartySubIDs() {
		return isSetField(804);
	}

	public static class NoNestedPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {545, 805, 0};

		public NoNestedPartySubIDs() {
			super(804, 545, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.NestedPartySubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NestedPartySubID get(cl.bithaus.qfix.fields.NestedPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NestedPartySubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NestedPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubID() {
		return isSetField(545);
	}

	public void set(cl.bithaus.qfix.fields.NestedPartySubIDType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NestedPartySubIDType get(cl.bithaus.qfix.fields.NestedPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NestedPartySubIDType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NestedPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubIDType() {
		return isSetField(805);
	}

	}

	}

}
