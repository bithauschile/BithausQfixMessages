
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class RegistrationInstructionsResponse extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "p";
	

	public RegistrationInstructionsResponse() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public RegistrationInstructionsResponse(cl.bithaus.qfix.fields.RegistID registID, cl.bithaus.qfix.fields.RegistTransType registTransType, cl.bithaus.qfix.fields.RegistRefID registRefID, cl.bithaus.qfix.fields.RegistStatus registStatus) {
		this();
		setField(registID);
		setField(registTransType);
		setField(registRefID);
		setField(registStatus);
	}
	
	public void set(cl.bithaus.qfix.fields.RegistID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RegistID get(cl.bithaus.qfix.fields.RegistID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RegistID getRegistID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RegistID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RegistID field) {
		return isSetField(field);
	}

	public boolean isSetRegistID() {
		return isSetField(513);
	}

	public void set(cl.bithaus.qfix.fields.RegistTransType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RegistTransType get(cl.bithaus.qfix.fields.RegistTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RegistTransType getRegistTransType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RegistTransType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RegistTransType field) {
		return isSetField(field);
	}

	public boolean isSetRegistTransType() {
		return isSetField(514);
	}

	public void set(cl.bithaus.qfix.fields.RegistRefID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RegistRefID get(cl.bithaus.qfix.fields.RegistRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RegistRefID getRegistRefID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RegistRefID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RegistRefID field) {
		return isSetField(field);
	}

	public boolean isSetRegistRefID() {
		return isSetField(508);
	}

	public void set(cl.bithaus.qfix.fields.ClOrdID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ClOrdID get(cl.bithaus.qfix.fields.ClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ClOrdID getClOrdID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ClOrdID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdID() {
		return isSetField(11);
	}

	public void set(cl.bithaus.qfix.msg.component.Parties component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.Parties get(cl.bithaus.qfix.msg.component.Parties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.Parties getParties() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.Parties());
	}

	public void set(cl.bithaus.qfix.fields.NoPartyIDs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoPartyIDs get(cl.bithaus.qfix.fields.NoPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoPartyIDs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartyIDs() {
		return isSetField(453);
	}

	public static class NoPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {448, 447, 452, 802, 0};

		public NoPartyIDs() {
			super(453, 448, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.PartyID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PartyID get(cl.bithaus.qfix.fields.PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PartyID getPartyID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PartyID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PartyID field) {
		return isSetField(field);
	}

	public boolean isSetPartyID() {
		return isSetField(448);
	}

	public void set(cl.bithaus.qfix.fields.PartyIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PartyIDSource get(cl.bithaus.qfix.fields.PartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PartyIDSource getPartyIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PartyIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetPartyIDSource() {
		return isSetField(447);
	}

	public void set(cl.bithaus.qfix.fields.PartyRole value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PartyRole get(cl.bithaus.qfix.fields.PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PartyRole getPartyRole() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PartyRole());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetPartyRole() {
		return isSetField(452);
	}

	public void set(cl.bithaus.qfix.fields.NoPartySubIDs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoPartySubIDs get(cl.bithaus.qfix.fields.NoPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoPartySubIDs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartySubIDs() {
		return isSetField(802);
	}

	public static class NoPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {523, 803, 0};

		public NoPartySubIDs() {
			super(802, 523, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.PartySubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PartySubID get(cl.bithaus.qfix.fields.PartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PartySubID getPartySubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PartySubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PartySubID field) {
		return isSetField(field);
	}

	public boolean isSetPartySubID() {
		return isSetField(523);
	}

	public void set(cl.bithaus.qfix.fields.PartySubIDType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PartySubIDType get(cl.bithaus.qfix.fields.PartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PartySubIDType getPartySubIDType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PartySubIDType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetPartySubIDType() {
		return isSetField(803);
	}

	}

	}

	public void set(cl.bithaus.qfix.fields.Account value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Account get(cl.bithaus.qfix.fields.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Account getAccount() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Account());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
	}

	public void set(cl.bithaus.qfix.fields.AcctIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AcctIDSource get(cl.bithaus.qfix.fields.AcctIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AcctIDSource getAcctIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AcctIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AcctIDSource field) {
		return isSetField(field);
	}

	public boolean isSetAcctIDSource() {
		return isSetField(660);
	}

	public void set(cl.bithaus.qfix.fields.RegistStatus value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RegistStatus get(cl.bithaus.qfix.fields.RegistStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RegistStatus getRegistStatus() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RegistStatus());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RegistStatus field) {
		return isSetField(field);
	}

	public boolean isSetRegistStatus() {
		return isSetField(506);
	}

	public void set(cl.bithaus.qfix.fields.RegistRejReasonCode value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RegistRejReasonCode get(cl.bithaus.qfix.fields.RegistRejReasonCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RegistRejReasonCode getRegistRejReasonCode() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RegistRejReasonCode());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RegistRejReasonCode field) {
		return isSetField(field);
	}

	public boolean isSetRegistRejReasonCode() {
		return isSetField(507);
	}

	public void set(cl.bithaus.qfix.fields.RegistRejReasonText value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RegistRejReasonText get(cl.bithaus.qfix.fields.RegistRejReasonText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RegistRejReasonText getRegistRejReasonText() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RegistRejReasonText());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RegistRejReasonText field) {
		return isSetField(field);
	}

	public boolean isSetRegistRejReasonText() {
		return isSetField(496);
	}

}
