
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;


public class UserRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BE";
	

	public UserRequest() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public UserRequest(cl.bithaus.qfix.fields.UserRequestID userRequestID, cl.bithaus.qfix.fields.UserRequestType userRequestType, cl.bithaus.qfix.fields.Username username) {
		this();
		setField(userRequestID);
		setField(userRequestType);
		setField(username);
	}
	
	public void set(cl.bithaus.qfix.fields.UserRequestID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UserRequestID get(cl.bithaus.qfix.fields.UserRequestID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UserRequestID getUserRequestID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UserRequestID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UserRequestID field) {
		return isSetField(field);
	}

	public boolean isSetUserRequestID() {
		return isSetField(923);
	}

	public void set(cl.bithaus.qfix.fields.UserRequestType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UserRequestType get(cl.bithaus.qfix.fields.UserRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UserRequestType getUserRequestType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UserRequestType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UserRequestType field) {
		return isSetField(field);
	}

	public boolean isSetUserRequestType() {
		return isSetField(924);
	}

	public void set(cl.bithaus.qfix.fields.Username value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Username get(cl.bithaus.qfix.fields.Username value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Username getUsername() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Username());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Username field) {
		return isSetField(field);
	}

	public boolean isSetUsername() {
		return isSetField(553);
	}

	public void set(cl.bithaus.qfix.fields.Password value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Password get(cl.bithaus.qfix.fields.Password value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Password getPassword() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Password());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Password field) {
		return isSetField(field);
	}

	public boolean isSetPassword() {
		return isSetField(554);
	}

	public void set(cl.bithaus.qfix.fields.NewPassword value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NewPassword get(cl.bithaus.qfix.fields.NewPassword value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NewPassword getNewPassword() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NewPassword());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NewPassword field) {
		return isSetField(field);
	}

	public boolean isSetNewPassword() {
		return isSetField(925);
	}

	public void set(cl.bithaus.qfix.fields.RawDataLength value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RawDataLength get(cl.bithaus.qfix.fields.RawDataLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RawDataLength getRawDataLength() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RawDataLength());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RawDataLength field) {
		return isSetField(field);
	}

	public boolean isSetRawDataLength() {
		return isSetField(95);
	}

	public void set(cl.bithaus.qfix.fields.RawData value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RawData get(cl.bithaus.qfix.fields.RawData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RawData getRawData() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RawData());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RawData field) {
		return isSetField(field);
	}

	public boolean isSetRawData() {
		return isSetField(96);
	}

}
