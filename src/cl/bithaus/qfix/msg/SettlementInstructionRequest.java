
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class SettlementInstructionRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "AV";
	

	public SettlementInstructionRequest() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public SettlementInstructionRequest(cl.bithaus.qfix.fields.SettlInstReqID settlInstReqID, cl.bithaus.qfix.fields.TransactTime transactTime) {
		this();
		setField(settlInstReqID);
		setField(transactTime);
	}
	
	public void set(cl.bithaus.qfix.fields.SettlInstReqID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlInstReqID get(cl.bithaus.qfix.fields.SettlInstReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlInstReqID getSettlInstReqID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlInstReqID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlInstReqID field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstReqID() {
		return isSetField(791);
	}

	public void set(cl.bithaus.qfix.fields.TransactTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TransactTime get(cl.bithaus.qfix.fields.TransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TransactTime getTransactTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TransactTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TransactTime field) {
		return isSetField(field);
	}

	public boolean isSetTransactTime() {
		return isSetField(60);
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

	public void set(cl.bithaus.qfix.fields.AllocAccount value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AllocAccount get(cl.bithaus.qfix.fields.AllocAccount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AllocAccount getAllocAccount() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AllocAccount());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AllocAccount field) {
		return isSetField(field);
	}

	public boolean isSetAllocAccount() {
		return isSetField(79);
	}

	public void set(cl.bithaus.qfix.fields.AllocAcctIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AllocAcctIDSource get(cl.bithaus.qfix.fields.AllocAcctIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AllocAcctIDSource getAllocAcctIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AllocAcctIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AllocAcctIDSource field) {
		return isSetField(field);
	}

	public boolean isSetAllocAcctIDSource() {
		return isSetField(661);
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

	public void set(cl.bithaus.qfix.fields.Product value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Product get(cl.bithaus.qfix.fields.Product value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Product getProduct() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Product());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Product field) {
		return isSetField(field);
	}

	public boolean isSetProduct() {
		return isSetField(460);
	}

	public void set(cl.bithaus.qfix.fields.SecurityType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecurityType get(cl.bithaus.qfix.fields.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecurityType getSecurityType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecurityType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(cl.bithaus.qfix.fields.CFICode value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CFICode get(cl.bithaus.qfix.fields.CFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CFICode getCFICode() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CFICode());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CFICode field) {
		return isSetField(field);
	}

	public boolean isSetCFICode() {
		return isSetField(461);
	}

	public void set(cl.bithaus.qfix.fields.EffectiveTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EffectiveTime get(cl.bithaus.qfix.fields.EffectiveTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EffectiveTime getEffectiveTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EffectiveTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EffectiveTime field) {
		return isSetField(field);
	}

	public boolean isSetEffectiveTime() {
		return isSetField(168);
	}

	public void set(cl.bithaus.qfix.fields.ExpireTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ExpireTime get(cl.bithaus.qfix.fields.ExpireTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ExpireTime getExpireTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ExpireTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ExpireTime field) {
		return isSetField(field);
	}

	public boolean isSetExpireTime() {
		return isSetField(126);
	}

	public void set(cl.bithaus.qfix.fields.LastUpdateTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LastUpdateTime get(cl.bithaus.qfix.fields.LastUpdateTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LastUpdateTime getLastUpdateTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LastUpdateTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LastUpdateTime field) {
		return isSetField(field);
	}

	public boolean isSetLastUpdateTime() {
		return isSetField(779);
	}

	public void set(cl.bithaus.qfix.fields.StandInstDbType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StandInstDbType get(cl.bithaus.qfix.fields.StandInstDbType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StandInstDbType getStandInstDbType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StandInstDbType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StandInstDbType field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbType() {
		return isSetField(169);
	}

	public void set(cl.bithaus.qfix.fields.StandInstDbName value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StandInstDbName get(cl.bithaus.qfix.fields.StandInstDbName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StandInstDbName getStandInstDbName() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StandInstDbName());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StandInstDbName field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbName() {
		return isSetField(170);
	}

	public void set(cl.bithaus.qfix.fields.StandInstDbID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StandInstDbID get(cl.bithaus.qfix.fields.StandInstDbID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StandInstDbID getStandInstDbID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StandInstDbID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StandInstDbID field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbID() {
		return isSetField(171);
	}

}
