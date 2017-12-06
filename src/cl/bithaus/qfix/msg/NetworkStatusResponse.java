
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class NetworkStatusResponse extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BD";
	

	public NetworkStatusResponse() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public NetworkStatusResponse(cl.bithaus.qfix.fields.NetworkStatusResponseType networkStatusResponseType) {
		this();
		setField(networkStatusResponseType);
	}
	
	public void set(cl.bithaus.qfix.fields.NetworkStatusResponseType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NetworkStatusResponseType get(cl.bithaus.qfix.fields.NetworkStatusResponseType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NetworkStatusResponseType getNetworkStatusResponseType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NetworkStatusResponseType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NetworkStatusResponseType field) {
		return isSetField(field);
	}

	public boolean isSetNetworkStatusResponseType() {
		return isSetField(937);
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

	public void set(cl.bithaus.qfix.fields.NetworkResponseID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NetworkResponseID get(cl.bithaus.qfix.fields.NetworkResponseID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NetworkResponseID getNetworkResponseID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NetworkResponseID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NetworkResponseID field) {
		return isSetField(field);
	}

	public boolean isSetNetworkResponseID() {
		return isSetField(932);
	}

	public void set(cl.bithaus.qfix.fields.LastNetworkResponseID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LastNetworkResponseID get(cl.bithaus.qfix.fields.LastNetworkResponseID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LastNetworkResponseID getLastNetworkResponseID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LastNetworkResponseID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LastNetworkResponseID field) {
		return isSetField(field);
	}

	public boolean isSetLastNetworkResponseID() {
		return isSetField(934);
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
		private static final int[] ORDER = {930, 931, 283, 284, 928, 929, 0};

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

	public void set(cl.bithaus.qfix.fields.StatusValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StatusValue get(cl.bithaus.qfix.fields.StatusValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StatusValue getStatusValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StatusValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StatusValue field) {
		return isSetField(field);
	}

	public boolean isSetStatusValue() {
		return isSetField(928);
	}

	public void set(cl.bithaus.qfix.fields.StatusText value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StatusText get(cl.bithaus.qfix.fields.StatusText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StatusText getStatusText() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StatusText());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StatusText field) {
		return isSetField(field);
	}

	public boolean isSetStatusText() {
		return isSetField(929);
	}

	}

}
