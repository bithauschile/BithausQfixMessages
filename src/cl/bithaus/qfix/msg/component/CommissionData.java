
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;


public class CommissionData extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 12, 13, 479, 497,  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public CommissionData() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.Commission value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Commission get(cl.bithaus.qfix.fields.Commission value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Commission getCommission() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Commission());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Commission field) {
		return isSetField(field);
	}

	public boolean isSetCommission() {
		return isSetField(12);
	}

	public void set(cl.bithaus.qfix.fields.CommType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CommType get(cl.bithaus.qfix.fields.CommType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CommType getCommType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CommType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CommType field) {
		return isSetField(field);
	}

	public boolean isSetCommType() {
		return isSetField(13);
	}

	public void set(cl.bithaus.qfix.fields.CommCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CommCurrency get(cl.bithaus.qfix.fields.CommCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CommCurrency getCommCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CommCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CommCurrency field) {
		return isSetField(field);
	}

	public boolean isSetCommCurrency() {
		return isSetField(479);
	}

	public void set(cl.bithaus.qfix.fields.FundRenewWaiv value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.FundRenewWaiv get(cl.bithaus.qfix.fields.FundRenewWaiv value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.FundRenewWaiv getFundRenewWaiv() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.FundRenewWaiv());
	}

	public boolean isSet(cl.bithaus.qfix.fields.FundRenewWaiv field) {
		return isSetField(field);
	}

	public boolean isSetFundRenewWaiv() {
		return isSetField(497);
	}

}
