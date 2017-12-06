
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class NetworkStatusRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BC";
	

	public NetworkStatusRequest() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public NetworkStatusRequest(cl.bithaus.qfix.fields.NetworkRequestType networkRequestType, cl.bithaus.qfix.fields.NetworkRequestID networkRequestID) {
		this();
		setField(networkRequestType);
		setField(networkRequestID);
	}
	
	public void set(cl.bithaus.qfix.fields.NetworkRequestType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NetworkRequestType get(cl.bithaus.qfix.fields.NetworkRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NetworkRequestType getNetworkRequestType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NetworkRequestType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NetworkRequestType field) {
		return isSetField(field);
	}

	public boolean isSetNetworkRequestType() {
		return isSetField(935);
	}

	public void set(cl.bithaus.qfix.fields.NetworkRequestID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NetworkRequestID get(cl.bithaus.qfix.fields.NetworkRequestID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NetworkRequestID getNetworkRequestID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NetworkRequestID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NetworkRequestID field) {
		return isSetField(field);
	}

	public boolean isSetNetworkRequestID() {
		return isSetField(933);
	}

	public void set(cl.bithaus.qfix.fields.NoCompIDs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoCompIDs get(cl.bithaus.qfix.fields.NoCompIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoCompIDs getNoCompIDs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoCompIDs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoCompIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoCompIDs() {
		return isSetField(936);
	}

	public static class NoCompIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {930, 931, 283, 284, 0};

		public NoCompIDs() {
			super(936, 930, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.RefCompID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RefCompID get(cl.bithaus.qfix.fields.RefCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RefCompID getRefCompID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RefCompID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RefCompID field) {
		return isSetField(field);
	}

	public boolean isSetRefCompID() {
		return isSetField(930);
	}

	public void set(cl.bithaus.qfix.fields.RefSubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RefSubID get(cl.bithaus.qfix.fields.RefSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RefSubID getRefSubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RefSubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RefSubID field) {
		return isSetField(field);
	}

	public boolean isSetRefSubID() {
		return isSetField(931);
	}

	public void set(cl.bithaus.qfix.fields.LocationID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LocationID get(cl.bithaus.qfix.fields.LocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LocationID getLocationID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LocationID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LocationID field) {
		return isSetField(field);
	}

	public boolean isSetLocationID() {
		return isSetField(283);
	}

	public void set(cl.bithaus.qfix.fields.DeskID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DeskID get(cl.bithaus.qfix.fields.DeskID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DeskID getDeskID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DeskID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DeskID field) {
		return isSetField(field);
	}

	public boolean isSetDeskID() {
		return isSetField(284);
	}

	}

}
