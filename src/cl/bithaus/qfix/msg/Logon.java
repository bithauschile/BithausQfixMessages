
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class Logon extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "A";
	

	public Logon() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public Logon(cl.bithaus.qfix.fields.EncryptMethod encryptMethod, cl.bithaus.qfix.fields.HeartBtInt heartBtInt) {
		this();
		setField(encryptMethod);
		setField(heartBtInt);
	}
	
	public void set(cl.bithaus.qfix.fields.EncryptMethod value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncryptMethod get(cl.bithaus.qfix.fields.EncryptMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncryptMethod getEncryptMethod() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncryptMethod());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncryptMethod field) {
		return isSetField(field);
	}

	public boolean isSetEncryptMethod() {
		return isSetField(98);
	}

	public void set(cl.bithaus.qfix.fields.HeartBtInt value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.HeartBtInt get(cl.bithaus.qfix.fields.HeartBtInt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.HeartBtInt getHeartBtInt() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.HeartBtInt());
	}

	public boolean isSet(cl.bithaus.qfix.fields.HeartBtInt field) {
		return isSetField(field);
	}

	public boolean isSetHeartBtInt() {
		return isSetField(108);
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

	public void set(cl.bithaus.qfix.fields.ResetSeqNumFlag value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ResetSeqNumFlag get(cl.bithaus.qfix.fields.ResetSeqNumFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ResetSeqNumFlag getResetSeqNumFlag() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ResetSeqNumFlag());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ResetSeqNumFlag field) {
		return isSetField(field);
	}

	public boolean isSetResetSeqNumFlag() {
		return isSetField(141);
	}

	public void set(cl.bithaus.qfix.fields.NextExpectedMsgSeqNum value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NextExpectedMsgSeqNum get(cl.bithaus.qfix.fields.NextExpectedMsgSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NextExpectedMsgSeqNum getNextExpectedMsgSeqNum() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NextExpectedMsgSeqNum());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NextExpectedMsgSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetNextExpectedMsgSeqNum() {
		return isSetField(789);
	}

	public void set(cl.bithaus.qfix.fields.MaxMessageSize value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MaxMessageSize get(cl.bithaus.qfix.fields.MaxMessageSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MaxMessageSize getMaxMessageSize() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MaxMessageSize());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MaxMessageSize field) {
		return isSetField(field);
	}

	public boolean isSetMaxMessageSize() {
		return isSetField(383);
	}

	public void set(cl.bithaus.qfix.fields.NoMsgTypes value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoMsgTypes get(cl.bithaus.qfix.fields.NoMsgTypes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoMsgTypes getNoMsgTypes() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoMsgTypes());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoMsgTypes field) {
		return isSetField(field);
	}

	public boolean isSetNoMsgTypes() {
		return isSetField(384);
	}

	public static class NoMsgTypes extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {372, 385, 0};

		public NoMsgTypes() {
			super(384, 372, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.RefMsgType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RefMsgType get(cl.bithaus.qfix.fields.RefMsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RefMsgType getRefMsgType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RefMsgType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RefMsgType field) {
		return isSetField(field);
	}

	public boolean isSetRefMsgType() {
		return isSetField(372);
	}

	public void set(cl.bithaus.qfix.fields.MsgDirection value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MsgDirection get(cl.bithaus.qfix.fields.MsgDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MsgDirection getMsgDirection() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MsgDirection());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MsgDirection field) {
		return isSetField(field);
	}

	public boolean isSetMsgDirection() {
		return isSetField(385);
	}

	}

	public void set(cl.bithaus.qfix.fields.TestMessageIndicator value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TestMessageIndicator get(cl.bithaus.qfix.fields.TestMessageIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TestMessageIndicator getTestMessageIndicator() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TestMessageIndicator());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TestMessageIndicator field) {
		return isSetField(field);
	}

	public boolean isSetTestMessageIndicator() {
		return isSetField(464);
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

}
