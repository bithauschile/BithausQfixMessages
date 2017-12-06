
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;


public class UserResponse extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BF";
	

	public UserResponse() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public UserResponse(cl.bithaus.qfix.fields.UserRequestID userRequestID, cl.bithaus.qfix.fields.Username username) {
		this();
		setField(userRequestID);
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

	public void set(cl.bithaus.qfix.fields.UserStatus value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UserStatus get(cl.bithaus.qfix.fields.UserStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UserStatus getUserStatus() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UserStatus());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UserStatus field) {
		return isSetField(field);
	}

	public boolean isSetUserStatus() {
		return isSetField(926);
	}

	public void set(cl.bithaus.qfix.fields.UserStatusText value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UserStatusText get(cl.bithaus.qfix.fields.UserStatusText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UserStatusText getUserStatusText() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UserStatusText());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UserStatusText field) {
		return isSetField(field);
	}

	public boolean isSetUserStatusText() {
		return isSetField(927);
	}

}
