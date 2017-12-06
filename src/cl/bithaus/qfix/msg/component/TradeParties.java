
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TradeParties extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 552,  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public TradeParties() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.NoSides value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoSides get(cl.bithaus.qfix.fields.NoSides value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoSides getNoSides() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoSides());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoSides field) {
		return isSetField(field);
	}

	public boolean isSetNoSides() {
		return isSetField(552);
	}

	public static class NoSides extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {54, 10140, 10141, 10142, 10143, 0};

		public NoSides() {
			super(552, 54, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.Side value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Side get(cl.bithaus.qfix.fields.Side value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Side getSide() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Side());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Side field) {
		return isSetField(field);
	}

	public boolean isSetSide() {
		return isSetField(54);
	}

	public void set(cl.bithaus.qfix.fields.EnteringFirm value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EnteringFirm get(cl.bithaus.qfix.fields.EnteringFirm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EnteringFirm getEnteringFirm() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EnteringFirm());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EnteringFirm field) {
		return isSetField(field);
	}

	public boolean isSetEnteringFirm() {
		return isSetField(10140);
	}

	public void set(cl.bithaus.qfix.fields.ExecutingFirm value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ExecutingFirm get(cl.bithaus.qfix.fields.ExecutingFirm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ExecutingFirm getExecutingFirm() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ExecutingFirm());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ExecutingFirm field) {
		return isSetField(field);
	}

	public boolean isSetExecutingFirm() {
		return isSetField(10141);
	}

	public void set(cl.bithaus.qfix.fields.EnteringTrader value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EnteringTrader get(cl.bithaus.qfix.fields.EnteringTrader value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EnteringTrader getEnteringTrader() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EnteringTrader());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EnteringTrader field) {
		return isSetField(field);
	}

	public boolean isSetEnteringTrader() {
		return isSetField(10142);
	}

	public void set(cl.bithaus.qfix.fields.FundManager value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.FundManager get(cl.bithaus.qfix.fields.FundManager value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.FundManager getFundManager() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.FundManager());
	}

	public boolean isSet(cl.bithaus.qfix.fields.FundManager field) {
		return isSetField(field);
	}

	public boolean isSetFundManager() {
		return isSetField(10143);
	}

	}

}
