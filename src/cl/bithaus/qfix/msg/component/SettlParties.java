
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class SettlParties extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 781,  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public SettlParties() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.NoSettlPartyIDs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoSettlPartyIDs get(cl.bithaus.qfix.fields.NoSettlPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoSettlPartyIDs getNoSettlPartyIDs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoSettlPartyIDs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoSettlPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlPartyIDs() {
		return isSetField(781);
	}

	public static class NoSettlPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {782, 783, 784, 801, 0};

		public NoSettlPartyIDs() {
			super(781, 782, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.SettlPartyID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlPartyID get(cl.bithaus.qfix.fields.SettlPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlPartyID getSettlPartyID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlPartyID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlPartyID field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyID() {
		return isSetField(782);
	}

	public void set(cl.bithaus.qfix.fields.SettlPartyIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlPartyIDSource get(cl.bithaus.qfix.fields.SettlPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlPartyIDSource getSettlPartyIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlPartyIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyIDSource() {
		return isSetField(783);
	}

	public void set(cl.bithaus.qfix.fields.SettlPartyRole value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlPartyRole get(cl.bithaus.qfix.fields.SettlPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlPartyRole getSettlPartyRole() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlPartyRole());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyRole() {
		return isSetField(784);
	}

	public void set(cl.bithaus.qfix.fields.NoSettlPartySubIDs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoSettlPartySubIDs get(cl.bithaus.qfix.fields.NoSettlPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoSettlPartySubIDs getNoSettlPartySubIDs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoSettlPartySubIDs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoSettlPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlPartySubIDs() {
		return isSetField(801);
	}

	public static class NoSettlPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {785, 786, 0};

		public NoSettlPartySubIDs() {
			super(801, 785, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.SettlPartySubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlPartySubID get(cl.bithaus.qfix.fields.SettlPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlPartySubID getSettlPartySubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlPartySubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartySubID() {
		return isSetField(785);
	}

	public void set(cl.bithaus.qfix.fields.SettlPartySubIDType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlPartySubIDType get(cl.bithaus.qfix.fields.SettlPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlPartySubIDType getSettlPartySubIDType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlPartySubIDType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartySubIDType() {
		return isSetField(786);
	}

	}

	}

}
