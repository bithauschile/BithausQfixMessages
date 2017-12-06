
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;


public class BookAttributes extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 63, 10123, 549, 10132, 38,  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public BookAttributes() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.SettlType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlType get(cl.bithaus.qfix.fields.SettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlType getSettlType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlType field) {
		return isSetField(field);
	}

	public boolean isSetSettlType() {
		return isSetField(63);
	}

	public void set(cl.bithaus.qfix.fields.Cross value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Cross get(cl.bithaus.qfix.fields.Cross value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Cross getCross() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Cross());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Cross field) {
		return isSetField(field);
	}

	public boolean isSetCross() {
		return isSetField(10123);
	}

	public void set(cl.bithaus.qfix.fields.CrossType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CrossType get(cl.bithaus.qfix.fields.CrossType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CrossType getCrossType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CrossType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CrossType field) {
		return isSetField(field);
	}

	public boolean isSetCrossType() {
		return isSetField(549);
	}

	public void set(cl.bithaus.qfix.fields.RoundLotBook value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RoundLotBook get(cl.bithaus.qfix.fields.RoundLotBook value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RoundLotBook getRoundLotBook() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RoundLotBook());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RoundLotBook field) {
		return isSetField(field);
	}

	public boolean isSetRoundLotBook() {
		return isSetField(10132);
	}

	public void set(cl.bithaus.qfix.fields.OrderQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrderQty get(cl.bithaus.qfix.fields.OrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrderQty getOrderQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrderQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrderQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty() {
		return isSetField(38);
	}

}
