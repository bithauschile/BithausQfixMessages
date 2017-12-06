
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class OIBBestPriceData extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 10231,  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public OIBBestPriceData() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.NoOIBBestPrices value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoOIBBestPrices get(cl.bithaus.qfix.fields.NoOIBBestPrices value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoOIBBestPrices getNoOIBBestPrices() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoOIBBestPrices());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoOIBBestPrices field) {
		return isSetField(field);
	}

	public boolean isSetNoOIBBestPrices() {
		return isSetField(10231);
	}

	public static class NoOIBBestPrices extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {10232, 10233, 10234, 10235, 10236, 10237, 0};

		public NoOIBBestPrices() {
			super(10231, 10232, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.OIBBestPriceExchange value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OIBBestPriceExchange get(cl.bithaus.qfix.fields.OIBBestPriceExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OIBBestPriceExchange getOIBBestPriceExchange() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OIBBestPriceExchange());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OIBBestPriceExchange field) {
		return isSetField(field);
	}

	public boolean isSetOIBBestPriceExchange() {
		return isSetField(10232);
	}

	public void set(cl.bithaus.qfix.fields.OIBBestPriceTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OIBBestPriceTime get(cl.bithaus.qfix.fields.OIBBestPriceTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OIBBestPriceTime getOIBBestPriceTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OIBBestPriceTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OIBBestPriceTime field) {
		return isSetField(field);
	}

	public boolean isSetOIBBestPriceTime() {
		return isSetField(10233);
	}

	public void set(cl.bithaus.qfix.fields.OIBBestPriceBuyingQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OIBBestPriceBuyingQty get(cl.bithaus.qfix.fields.OIBBestPriceBuyingQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OIBBestPriceBuyingQty getOIBBestPriceBuyingQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OIBBestPriceBuyingQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OIBBestPriceBuyingQty field) {
		return isSetField(field);
	}

	public boolean isSetOIBBestPriceBuyingQty() {
		return isSetField(10234);
	}

	public void set(cl.bithaus.qfix.fields.OIBBestPriceBuyingPrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OIBBestPriceBuyingPrice get(cl.bithaus.qfix.fields.OIBBestPriceBuyingPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OIBBestPriceBuyingPrice getOIBBestPriceBuyingPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OIBBestPriceBuyingPrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OIBBestPriceBuyingPrice field) {
		return isSetField(field);
	}

	public boolean isSetOIBBestPriceBuyingPrice() {
		return isSetField(10235);
	}

	public void set(cl.bithaus.qfix.fields.OIBBestPriceSellingQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OIBBestPriceSellingQty get(cl.bithaus.qfix.fields.OIBBestPriceSellingQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OIBBestPriceSellingQty getOIBBestPriceSellingQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OIBBestPriceSellingQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OIBBestPriceSellingQty field) {
		return isSetField(field);
	}

	public boolean isSetOIBBestPriceSellingQty() {
		return isSetField(10236);
	}

	public void set(cl.bithaus.qfix.fields.OIBBestPriceSellingPrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OIBBestPriceSellingPrice get(cl.bithaus.qfix.fields.OIBBestPriceSellingPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OIBBestPriceSellingPrice getOIBBestPriceSellingPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OIBBestPriceSellingPrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OIBBestPriceSellingPrice field) {
		return isSetField(field);
	}

	public boolean isSetOIBBestPriceSellingPrice() {
		return isSetField(10237);
	}

	}

}
