
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TrdRegTimestamps extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 768,  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public TrdRegTimestamps() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.NoTrdRegTimestamps value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoTrdRegTimestamps get(cl.bithaus.qfix.fields.NoTrdRegTimestamps value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoTrdRegTimestamps getNoTrdRegTimestamps() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoTrdRegTimestamps());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoTrdRegTimestamps field) {
		return isSetField(field);
	}

	public boolean isSetNoTrdRegTimestamps() {
		return isSetField(768);
	}

	public static class NoTrdRegTimestamps extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {769, 770, 771, 0};

		public NoTrdRegTimestamps() {
			super(768, 769, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.TrdRegTimestamp value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TrdRegTimestamp get(cl.bithaus.qfix.fields.TrdRegTimestamp value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TrdRegTimestamp getTrdRegTimestamp() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TrdRegTimestamp());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TrdRegTimestamp field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestamp() {
		return isSetField(769);
	}

	public void set(cl.bithaus.qfix.fields.TrdRegTimestampType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TrdRegTimestampType get(cl.bithaus.qfix.fields.TrdRegTimestampType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TrdRegTimestampType getTrdRegTimestampType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TrdRegTimestampType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TrdRegTimestampType field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestampType() {
		return isSetField(770);
	}

	public void set(cl.bithaus.qfix.fields.TrdRegTimestampOrigin value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TrdRegTimestampOrigin get(cl.bithaus.qfix.fields.TrdRegTimestampOrigin value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TrdRegTimestampOrigin getTrdRegTimestampOrigin() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TrdRegTimestampOrigin());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TrdRegTimestampOrigin field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestampOrigin() {
		return isSetField(771);
	}

	}

}
