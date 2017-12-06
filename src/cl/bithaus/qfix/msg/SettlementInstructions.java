
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class SettlementInstructions extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "T";
	

	public SettlementInstructions() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public SettlementInstructions(cl.bithaus.qfix.fields.SettlInstMsgID settlInstMsgID, cl.bithaus.qfix.fields.SettlInstMode settlInstMode, cl.bithaus.qfix.fields.TransactTime transactTime) {
		this();
		setField(settlInstMsgID);
		setField(settlInstMode);
		setField(transactTime);
	}
	
	public void set(cl.bithaus.qfix.fields.SettlInstMsgID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlInstMsgID get(cl.bithaus.qfix.fields.SettlInstMsgID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlInstMsgID getSettlInstMsgID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlInstMsgID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlInstMsgID field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstMsgID() {
		return isSetField(777);
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

	public void set(cl.bithaus.qfix.fields.SettlInstMode value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlInstMode get(cl.bithaus.qfix.fields.SettlInstMode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlInstMode getSettlInstMode() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlInstMode());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlInstMode field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstMode() {
		return isSetField(160);
	}

	public void set(cl.bithaus.qfix.fields.SettlInstReqRejCode value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlInstReqRejCode get(cl.bithaus.qfix.fields.SettlInstReqRejCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlInstReqRejCode getSettlInstReqRejCode() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlInstReqRejCode());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlInstReqRejCode field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstReqRejCode() {
		return isSetField(792);
	}

	public void set(cl.bithaus.qfix.fields.Text value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Text get(cl.bithaus.qfix.fields.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Text getText() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Text());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

	public void set(cl.bithaus.qfix.fields.EncodedTextLen value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedTextLen get(cl.bithaus.qfix.fields.EncodedTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedTextLen());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedTextLen() {
		return isSetField(354);
	}

	public void set(cl.bithaus.qfix.fields.EncodedText value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedText get(cl.bithaus.qfix.fields.EncodedText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedText getEncodedText() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedText());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedText() {
		return isSetField(355);
	}

	public void set(cl.bithaus.qfix.fields.SettlInstSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlInstSource get(cl.bithaus.qfix.fields.SettlInstSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlInstSource getSettlInstSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlInstSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlInstSource field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstSource() {
		return isSetField(165);
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

	public void set(cl.bithaus.qfix.fields.NoSettlInst value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoSettlInst get(cl.bithaus.qfix.fields.NoSettlInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoSettlInst getNoSettlInst() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoSettlInst());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoSettlInst field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlInst() {
		return isSetField(778);
	}

	public static class NoSettlInst extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {162, 163, 214, 453, 54, 460, 167, 461, 168, 126, 779, 172, 169, 170, 171, 85, 492, 476, 488, 489, 503, 490, 491, 504, 505, 0};

		public NoSettlInst() {
			super(778, 162, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.SettlInstID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlInstID get(cl.bithaus.qfix.fields.SettlInstID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlInstID getSettlInstID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlInstID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlInstID field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstID() {
		return isSetField(162);
	}

	public void set(cl.bithaus.qfix.fields.SettlInstTransType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlInstTransType get(cl.bithaus.qfix.fields.SettlInstTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlInstTransType getSettlInstTransType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlInstTransType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlInstTransType field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstTransType() {
		return isSetField(163);
	}

	public void set(cl.bithaus.qfix.fields.SettlInstRefID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlInstRefID get(cl.bithaus.qfix.fields.SettlInstRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlInstRefID getSettlInstRefID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlInstRefID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlInstRefID field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstRefID() {
		return isSetField(214);
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

	public void set(cl.bithaus.qfix.msg.component.SettlInstructionsData component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.SettlInstructionsData get(cl.bithaus.qfix.msg.component.SettlInstructionsData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.SettlInstructionsData getSettlInstructionsData() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.SettlInstructionsData());
	}

	public void set(cl.bithaus.qfix.fields.SettlDeliveryType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlDeliveryType get(cl.bithaus.qfix.fields.SettlDeliveryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlDeliveryType getSettlDeliveryType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlDeliveryType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlDeliveryType field) {
		return isSetField(field);
	}

	public boolean isSetSettlDeliveryType() {
		return isSetField(172);
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

	public void set(cl.bithaus.qfix.fields.NoDlvyInst value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoDlvyInst get(cl.bithaus.qfix.fields.NoDlvyInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoDlvyInst getNoDlvyInst() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoDlvyInst());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoDlvyInst field) {
		return isSetField(field);
	}

	public boolean isSetNoDlvyInst() {
		return isSetField(85);
	}

	public static class NoDlvyInst extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {165, 787, 781, 0};

		public NoDlvyInst() {
			super(85, 165, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.SettlInstSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlInstSource get(cl.bithaus.qfix.fields.SettlInstSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlInstSource getSettlInstSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlInstSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlInstSource field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstSource() {
		return isSetField(165);
	}

	public void set(cl.bithaus.qfix.fields.DlvyInstType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DlvyInstType get(cl.bithaus.qfix.fields.DlvyInstType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DlvyInstType getDlvyInstType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DlvyInstType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DlvyInstType field) {
		return isSetField(field);
	}

	public boolean isSetDlvyInstType() {
		return isSetField(787);
	}

	public void set(cl.bithaus.qfix.msg.component.SettlParties component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.SettlParties get(cl.bithaus.qfix.msg.component.SettlParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.SettlParties getSettlParties() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.SettlParties());
	}

	public void set(cl.bithaus.qfix.fields.NoSettlPartyIDs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoSettlPartyIDs get(cl.bithaus.qfix.fields.NoSettlPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoSettlPartyIDs getNoSettlPartyIDs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoSettlPartyIDs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoSettlPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlPartyIDs() {
		return isSetField(781);
	}

	public static class NoSettlPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {782, 783, 784, 801, 0};

		public NoSettlPartyIDs() {
			super(781, 782, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.SettlPartyID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlPartyID get(cl.bithaus.qfix.fields.SettlPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlPartyID getSettlPartyID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlPartyID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlPartyID field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyID() {
		return isSetField(782);
	}

	public void set(cl.bithaus.qfix.fields.SettlPartyIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlPartyIDSource get(cl.bithaus.qfix.fields.SettlPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlPartyIDSource getSettlPartyIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlPartyIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyIDSource() {
		return isSetField(783);
	}

	public void set(cl.bithaus.qfix.fields.SettlPartyRole value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlPartyRole get(cl.bithaus.qfix.fields.SettlPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlPartyRole getSettlPartyRole() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlPartyRole());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyRole() {
		return isSetField(784);
	}

	public void set(cl.bithaus.qfix.fields.NoSettlPartySubIDs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoSettlPartySubIDs get(cl.bithaus.qfix.fields.NoSettlPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoSettlPartySubIDs getNoSettlPartySubIDs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoSettlPartySubIDs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoSettlPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlPartySubIDs() {
		return isSetField(801);
	}

	public static class NoSettlPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {785, 786, 0};

		public NoSettlPartySubIDs() {
			super(801, 785, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.SettlPartySubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlPartySubID get(cl.bithaus.qfix.fields.SettlPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlPartySubID getSettlPartySubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlPartySubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartySubID() {
		return isSetField(785);
	}

	public void set(cl.bithaus.qfix.fields.SettlPartySubIDType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlPartySubIDType get(cl.bithaus.qfix.fields.SettlPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlPartySubIDType getSettlPartySubIDType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlPartySubIDType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartySubIDType() {
		return isSetField(786);
	}

	}

	}

	}

	public void set(cl.bithaus.qfix.fields.PaymentMethod value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PaymentMethod get(cl.bithaus.qfix.fields.PaymentMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PaymentMethod getPaymentMethod() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PaymentMethod());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PaymentMethod field) {
		return isSetField(field);
	}

	public boolean isSetPaymentMethod() {
		return isSetField(492);
	}

	public void set(cl.bithaus.qfix.fields.PaymentRef value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PaymentRef get(cl.bithaus.qfix.fields.PaymentRef value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PaymentRef getPaymentRef() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PaymentRef());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PaymentRef field) {
		return isSetField(field);
	}

	public boolean isSetPaymentRef() {
		return isSetField(476);
	}

	public void set(cl.bithaus.qfix.fields.CardHolderName value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CardHolderName get(cl.bithaus.qfix.fields.CardHolderName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CardHolderName getCardHolderName() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CardHolderName());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CardHolderName field) {
		return isSetField(field);
	}

	public boolean isSetCardHolderName() {
		return isSetField(488);
	}

	public void set(cl.bithaus.qfix.fields.CardNumber value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CardNumber get(cl.bithaus.qfix.fields.CardNumber value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CardNumber getCardNumber() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CardNumber());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CardNumber field) {
		return isSetField(field);
	}

	public boolean isSetCardNumber() {
		return isSetField(489);
	}

	public void set(cl.bithaus.qfix.fields.CardStartDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CardStartDate get(cl.bithaus.qfix.fields.CardStartDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CardStartDate getCardStartDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CardStartDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CardStartDate field) {
		return isSetField(field);
	}

	public boolean isSetCardStartDate() {
		return isSetField(503);
	}

	public void set(cl.bithaus.qfix.fields.CardExpDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CardExpDate get(cl.bithaus.qfix.fields.CardExpDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CardExpDate getCardExpDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CardExpDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CardExpDate field) {
		return isSetField(field);
	}

	public boolean isSetCardExpDate() {
		return isSetField(490);
	}

	public void set(cl.bithaus.qfix.fields.CardIssNum value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CardIssNum get(cl.bithaus.qfix.fields.CardIssNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CardIssNum getCardIssNum() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CardIssNum());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CardIssNum field) {
		return isSetField(field);
	}

	public boolean isSetCardIssNum() {
		return isSetField(491);
	}

	public void set(cl.bithaus.qfix.fields.PaymentDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PaymentDate get(cl.bithaus.qfix.fields.PaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PaymentDate getPaymentDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PaymentDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetPaymentDate() {
		return isSetField(504);
	}

	public void set(cl.bithaus.qfix.fields.PaymentRemitterID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PaymentRemitterID get(cl.bithaus.qfix.fields.PaymentRemitterID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PaymentRemitterID getPaymentRemitterID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PaymentRemitterID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PaymentRemitterID field) {
		return isSetField(field);
	}

	public boolean isSetPaymentRemitterID() {
		return isSetField(505);
	}

	}

}
