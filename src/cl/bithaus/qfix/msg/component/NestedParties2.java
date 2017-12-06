
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class NestedParties2 extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 756,  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public NestedParties2() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.NoNested2PartyIDs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoNested2PartyIDs get(cl.bithaus.qfix.fields.NoNested2PartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoNested2PartyIDs getNoNested2PartyIDs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoNested2PartyIDs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoNested2PartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNested2PartyIDs() {
		return isSetField(756);
	}

	public static class NoNested2PartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {757, 758, 759, 806, 0};

		public NoNested2PartyIDs() {
			super(756, 757, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.Nested2PartyID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Nested2PartyID get(cl.bithaus.qfix.fields.Nested2PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Nested2PartyID getNested2PartyID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Nested2PartyID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Nested2PartyID field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyID() {
		return isSetField(757);
	}

	public void set(cl.bithaus.qfix.fields.Nested2PartyIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Nested2PartyIDSource get(cl.bithaus.qfix.fields.Nested2PartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Nested2PartyIDSource getNested2PartyIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Nested2PartyIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Nested2PartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyIDSource() {
		return isSetField(758);
	}

	public void set(cl.bithaus.qfix.fields.Nested2PartyRole value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Nested2PartyRole get(cl.bithaus.qfix.fields.Nested2PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Nested2PartyRole getNested2PartyRole() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Nested2PartyRole());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Nested2PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyRole() {
		return isSetField(759);
	}

	public void set(cl.bithaus.qfix.fields.NoNested2PartySubIDs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoNested2PartySubIDs get(cl.bithaus.qfix.fields.NoNested2PartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoNested2PartySubIDs getNoNested2PartySubIDs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoNested2PartySubIDs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoNested2PartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNested2PartySubIDs() {
		return isSetField(806);
	}

	public static class NoNested2PartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {760, 807, 0};

		public NoNested2PartySubIDs() {
			super(806, 760, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.Nested2PartySubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Nested2PartySubID get(cl.bithaus.qfix.fields.Nested2PartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Nested2PartySubID getNested2PartySubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Nested2PartySubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Nested2PartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartySubID() {
		return isSetField(760);
	}

	public void set(cl.bithaus.qfix.fields.Nested2PartySubIDType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Nested2PartySubIDType get(cl.bithaus.qfix.fields.Nested2PartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Nested2PartySubIDType getNested2PartySubIDType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Nested2PartySubIDType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Nested2PartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartySubIDType() {
		return isSetField(807);
	}

	}

	}

}
