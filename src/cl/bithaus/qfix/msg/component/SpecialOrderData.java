
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class SpecialOrderData extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 10128, 346, 10133,  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 10131,  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public SpecialOrderData() {
		super();
	}
	
	public SpecialOrderData(cl.bithaus.qfix.fields.SpecialOrderType specialOrderType, cl.bithaus.qfix.fields.NumberOfOrders numberOfOrders, cl.bithaus.qfix.fields.OrderNumber orderNumber) {
		this();
		setField(specialOrderType);
		setField(numberOfOrders);
		setField(orderNumber);
	}
	
	public void set(cl.bithaus.qfix.fields.SpecialOrderType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SpecialOrderType get(cl.bithaus.qfix.fields.SpecialOrderType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SpecialOrderType getSpecialOrderType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SpecialOrderType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SpecialOrderType field) {
		return isSetField(field);
	}

	public boolean isSetSpecialOrderType() {
		return isSetField(10128);
	}

	public void set(cl.bithaus.qfix.fields.NumberOfOrders value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NumberOfOrders get(cl.bithaus.qfix.fields.NumberOfOrders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NumberOfOrders getNumberOfOrders() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NumberOfOrders());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NumberOfOrders field) {
		return isSetField(field);
	}

	public boolean isSetNumberOfOrders() {
		return isSetField(346);
	}

	public void set(cl.bithaus.qfix.fields.OrderNumber value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrderNumber get(cl.bithaus.qfix.fields.OrderNumber value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrderNumber getOrderNumber() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrderNumber());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrderNumber field) {
		return isSetField(field);
	}

	public boolean isSetOrderNumber() {
		return isSetField(10133);
	}

	public void set(cl.bithaus.qfix.fields.NoSpecialOrderData value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoSpecialOrderData get(cl.bithaus.qfix.fields.NoSpecialOrderData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoSpecialOrderData getNoSpecialOrderData() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoSpecialOrderData());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoSpecialOrderData field) {
		return isSetField(field);
	}

	public boolean isSetNoSpecialOrderData() {
		return isSetField(10131);
	}

	public static class NoSpecialOrderData extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {10129, 10130, 0};

		public NoSpecialOrderData() {
			super(10131, 10129, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.SpecialOrderDataTypeID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SpecialOrderDataTypeID get(cl.bithaus.qfix.fields.SpecialOrderDataTypeID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SpecialOrderDataTypeID getSpecialOrderDataTypeID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SpecialOrderDataTypeID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SpecialOrderDataTypeID field) {
		return isSetField(field);
	}

	public boolean isSetSpecialOrderDataTypeID() {
		return isSetField(10129);
	}

	public void set(cl.bithaus.qfix.fields.SpecialOrderDataValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SpecialOrderDataValue get(cl.bithaus.qfix.fields.SpecialOrderDataValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SpecialOrderDataValue getSpecialOrderDataValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SpecialOrderDataValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SpecialOrderDataValue field) {
		return isSetField(field);
	}

	public boolean isSetSpecialOrderDataValue() {
		return isSetField(10130);
	}

	}

}
