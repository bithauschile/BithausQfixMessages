
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class SettlInstructionsData extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 172, 169, 170, 171,  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 85,  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public SettlInstructionsData() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.SettlDeliveryType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlDeliveryType get(cl.bithaus.qfix.fields.SettlDeliveryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlDeliveryType getSettlDeliveryType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlDeliveryType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlDeliveryType field) {
		return isSetField(field);
	}

	public boolean isSetSettlDeliveryType() {
		return isSetField(172);
	}

	public void set(cl.bithaus.qfix.fields.StandInstDbType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StandInstDbType get(cl.bithaus.qfix.fields.StandInstDbType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StandInstDbType getStandInstDbType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StandInstDbType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StandInstDbType field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbType() {
		return isSetField(169);
	}

	public void set(cl.bithaus.qfix.fields.StandInstDbName value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StandInstDbName get(cl.bithaus.qfix.fields.StandInstDbName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StandInstDbName getStandInstDbName() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StandInstDbName());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StandInstDbName field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbName() {
		return isSetField(170);
	}

	public void set(cl.bithaus.qfix.fields.StandInstDbID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StandInstDbID get(cl.bithaus.qfix.fields.StandInstDbID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StandInstDbID getStandInstDbID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StandInstDbID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StandInstDbID field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbID() {
		return isSetField(171);
	}

	public void set(cl.bithaus.qfix.fields.NoDlvyInst value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoDlvyInst get(cl.bithaus.qfix.fields.NoDlvyInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoDlvyInst getNoDlvyInst() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoDlvyInst());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoDlvyInst field) {
		return isSetField(field);
	}

	public boolean isSetNoDlvyInst() {
		return isSetField(85);
	}

	public static class NoDlvyInst extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {165, 787, 781, 0};

		public NoDlvyInst() {
			super(85, 165, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.SettlInstSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlInstSource get(cl.bithaus.qfix.fields.SettlInstSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlInstSource getSettlInstSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlInstSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlInstSource field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstSource() {
		return isSetField(165);
	}

	public void set(cl.bithaus.qfix.fields.DlvyInstType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DlvyInstType get(cl.bithaus.qfix.fields.DlvyInstType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DlvyInstType getDlvyInstType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DlvyInstType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DlvyInstType field) {
		return isSetField(field);
	}

	public boolean isSetDlvyInstType() {
		return isSetField(787);
	}

	public void set(cl.bithaus.qfix.msg.component.SettlParties component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.SettlParties get(cl.bithaus.qfix.msg.component.SettlParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.SettlParties getSettlParties() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.SettlParties());
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

}
