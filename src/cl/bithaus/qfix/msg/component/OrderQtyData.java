
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;


public class OrderQtyData extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 38, 152, 516, 468, 469,  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public OrderQtyData() {
		super();
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

	public void set(cl.bithaus.qfix.fields.CashOrderQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CashOrderQty get(cl.bithaus.qfix.fields.CashOrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CashOrderQty getCashOrderQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CashOrderQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CashOrderQty field) {
		return isSetField(field);
	}

	public boolean isSetCashOrderQty() {
		return isSetField(152);
	}

	public void set(cl.bithaus.qfix.fields.OrderPercent value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrderPercent get(cl.bithaus.qfix.fields.OrderPercent value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrderPercent getOrderPercent() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrderPercent());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrderPercent field) {
		return isSetField(field);
	}

	public boolean isSetOrderPercent() {
		return isSetField(516);
	}

	public void set(cl.bithaus.qfix.fields.RoundingDirection value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RoundingDirection get(cl.bithaus.qfix.fields.RoundingDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RoundingDirection getRoundingDirection() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RoundingDirection());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RoundingDirection field) {
		return isSetField(field);
	}

	public boolean isSetRoundingDirection() {
		return isSetField(468);
	}

	public void set(cl.bithaus.qfix.fields.RoundingModulus value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RoundingModulus get(cl.bithaus.qfix.fields.RoundingModulus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RoundingModulus getRoundingModulus() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RoundingModulus());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RoundingModulus field) {
		return isSetField(field);
	}

	public boolean isSetRoundingModulus() {
		return isSetField(469);
	}

}
