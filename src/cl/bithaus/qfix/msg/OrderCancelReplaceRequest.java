
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class OrderCancelReplaceRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "G";
	

	public OrderCancelReplaceRequest() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public OrderCancelReplaceRequest(cl.bithaus.qfix.fields.OrigClOrdID origClOrdID, cl.bithaus.qfix.fields.ClOrdID clOrdID, cl.bithaus.qfix.fields.SettlType settlType, cl.bithaus.qfix.fields.Side side, cl.bithaus.qfix.fields.TransactTime transactTime, cl.bithaus.qfix.fields.OrdType ordType, cl.bithaus.qfix.fields.TimeInForce timeInForce) {
		this();
		setField(origClOrdID);
		setField(clOrdID);
		setField(settlType);
		setField(side);
		setField(transactTime);
		setField(ordType);
		setField(timeInForce);
	}
	
	public void set(cl.bithaus.qfix.fields.OrderID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrderID get(cl.bithaus.qfix.fields.OrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrderID getOrderID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrderID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrderID field) {
		return isSetField(field);
	}

	public boolean isSetOrderID() {
		return isSetField(37);
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

	public void set(cl.bithaus.qfix.fields.TradeOriginationDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeOriginationDate get(cl.bithaus.qfix.fields.TradeOriginationDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeOriginationDate getTradeOriginationDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeOriginationDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeOriginationDate field) {
		return isSetField(field);
	}

	public boolean isSetTradeOriginationDate() {
		return isSetField(229);
	}

	public void set(cl.bithaus.qfix.fields.TradeDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeDate get(cl.bithaus.qfix.fields.TradeDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeDate getTradeDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeDate field) {
		return isSetField(field);
	}

	public boolean isSetTradeDate() {
		return isSetField(75);
	}

	public void set(cl.bithaus.qfix.fields.OrigClOrdID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrigClOrdID get(cl.bithaus.qfix.fields.OrigClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrigClOrdID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrigClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetOrigClOrdID() {
		return isSetField(41);
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

	public void set(cl.bithaus.qfix.fields.SecondaryClOrdID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecondaryClOrdID get(cl.bithaus.qfix.fields.SecondaryClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecondaryClOrdID getSecondaryClOrdID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecondaryClOrdID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecondaryClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryClOrdID() {
		return isSetField(526);
	}

	public void set(cl.bithaus.qfix.fields.ClOrdLinkID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ClOrdLinkID get(cl.bithaus.qfix.fields.ClOrdLinkID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ClOrdLinkID getClOrdLinkID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ClOrdLinkID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ClOrdLinkID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdLinkID() {
		return isSetField(583);
	}

	public void set(cl.bithaus.qfix.fields.ListID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ListID get(cl.bithaus.qfix.fields.ListID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ListID getListID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ListID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ListID field) {
		return isSetField(field);
	}

	public boolean isSetListID() {
		return isSetField(66);
	}

	public void set(cl.bithaus.qfix.fields.OrigOrdModTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrigOrdModTime get(cl.bithaus.qfix.fields.OrigOrdModTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrigOrdModTime getOrigOrdModTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrigOrdModTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrigOrdModTime field) {
		return isSetField(field);
	}

	public boolean isSetOrigOrdModTime() {
		return isSetField(586);
	}

	public void set(cl.bithaus.qfix.fields.SettlType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlType get(cl.bithaus.qfix.fields.SettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlType getSettlType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlType field) {
		return isSetField(field);
	}

	public boolean isSetSettlType() {
		return isSetField(63);
	}

	public void set(cl.bithaus.qfix.fields.SettlDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlDate get(cl.bithaus.qfix.fields.SettlDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlDate getSettlDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlDate field) {
		return isSetField(field);
	}

	public boolean isSetSettlDate() {
		return isSetField(64);
	}

	public void set(cl.bithaus.qfix.fields.HandlInst value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.HandlInst get(cl.bithaus.qfix.fields.HandlInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.HandlInst getHandlInst() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.HandlInst());
	}

	public boolean isSet(cl.bithaus.qfix.fields.HandlInst field) {
		return isSetField(field);
	}

	public boolean isSetHandlInst() {
		return isSetField(21);
	}

	public void set(cl.bithaus.qfix.fields.ExecInst value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ExecInst get(cl.bithaus.qfix.fields.ExecInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ExecInst getExecInst() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ExecInst());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ExecInst field) {
		return isSetField(field);
	}

	public boolean isSetExecInst() {
		return isSetField(18);
	}

	public void set(cl.bithaus.qfix.fields.MinQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MinQty get(cl.bithaus.qfix.fields.MinQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MinQty getMinQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MinQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MinQty field) {
		return isSetField(field);
	}

	public boolean isSetMinQty() {
		return isSetField(110);
	}

	public void set(cl.bithaus.qfix.fields.MaxFloor value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MaxFloor get(cl.bithaus.qfix.fields.MaxFloor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MaxFloor getMaxFloor() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MaxFloor());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MaxFloor field) {
		return isSetField(field);
	}

	public boolean isSetMaxFloor() {
		return isSetField(111);
	}

	public void set(cl.bithaus.qfix.fields.ExDestination value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ExDestination get(cl.bithaus.qfix.fields.ExDestination value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ExDestination getExDestination() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ExDestination());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ExDestination field) {
		return isSetField(field);
	}

	public boolean isSetExDestination() {
		return isSetField(100);
	}

	public void set(cl.bithaus.qfix.msg.component.Instrument component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.Instrument get(cl.bithaus.qfix.msg.component.Instrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.Instrument getInstrument() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.Instrument());
	}

	public void set(cl.bithaus.qfix.fields.Symbol value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Symbol get(cl.bithaus.qfix.fields.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Symbol getSymbol() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Symbol());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
	}

	public void set(cl.bithaus.qfix.fields.SymbolSfx value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SymbolSfx get(cl.bithaus.qfix.fields.SymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SymbolSfx getSymbolSfx() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SymbolSfx());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetSymbolSfx() {
		return isSetField(65);
	}

	public void set(cl.bithaus.qfix.fields.SecurityID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecurityID get(cl.bithaus.qfix.fields.SecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecurityID getSecurityID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecurityID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecurityID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityID() {
		return isSetField(48);
	}

	public void set(cl.bithaus.qfix.fields.SecurityIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecurityIDSource get(cl.bithaus.qfix.fields.SecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecurityIDSource getSecurityIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecurityIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSecurityIDSource() {
		return isSetField(22);
	}

	public void set(cl.bithaus.qfix.fields.NoSecurityAltID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoSecurityAltID get(cl.bithaus.qfix.fields.NoSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoSecurityAltID getNoSecurityAltID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoSecurityAltID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoSecurityAltID() {
		return isSetField(454);
	}

	public static class NoSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {455, 456, 0};

		public NoSecurityAltID() {
			super(454, 455, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.SecurityAltID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecurityAltID get(cl.bithaus.qfix.fields.SecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecurityAltID getSecurityAltID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecurityAltID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltID() {
		return isSetField(455);
	}

	public void set(cl.bithaus.qfix.fields.SecurityAltIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecurityAltIDSource get(cl.bithaus.qfix.fields.SecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecurityAltIDSource getSecurityAltIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecurityAltIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltIDSource() {
		return isSetField(456);
	}

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

	public void set(cl.bithaus.qfix.fields.SecuritySubType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecuritySubType get(cl.bithaus.qfix.fields.SecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecuritySubType getSecuritySubType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecuritySubType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetSecuritySubType() {
		return isSetField(762);
	}

	public void set(cl.bithaus.qfix.fields.MaturityMonthYear value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MaturityMonthYear get(cl.bithaus.qfix.fields.MaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MaturityMonthYear getMaturityMonthYear() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MaturityMonthYear());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetMaturityMonthYear() {
		return isSetField(200);
	}

	public void set(cl.bithaus.qfix.fields.MaturityDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MaturityDate get(cl.bithaus.qfix.fields.MaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MaturityDate getMaturityDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MaturityDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetMaturityDate() {
		return isSetField(541);
	}

	public void set(cl.bithaus.qfix.fields.CouponPaymentDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CouponPaymentDate get(cl.bithaus.qfix.fields.CouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CouponPaymentDate getCouponPaymentDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CouponPaymentDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetCouponPaymentDate() {
		return isSetField(224);
	}

	public void set(cl.bithaus.qfix.fields.IssueDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IssueDate get(cl.bithaus.qfix.fields.IssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IssueDate getIssueDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IssueDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IssueDate field) {
		return isSetField(field);
	}

	public boolean isSetIssueDate() {
		return isSetField(225);
	}

	public void set(cl.bithaus.qfix.fields.RepoCollateralSecurityType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RepoCollateralSecurityType get(cl.bithaus.qfix.fields.RepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RepoCollateralSecurityType getRepoCollateralSecurityType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RepoCollateralSecurityType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetRepoCollateralSecurityType() {
		return isSetField(239);
	}

	public void set(cl.bithaus.qfix.fields.RepurchaseTerm value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RepurchaseTerm get(cl.bithaus.qfix.fields.RepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RepurchaseTerm getRepurchaseTerm() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RepurchaseTerm());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetRepurchaseTerm() {
		return isSetField(226);
	}

	public void set(cl.bithaus.qfix.fields.RepurchaseRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RepurchaseRate get(cl.bithaus.qfix.fields.RepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RepurchaseRate getRepurchaseRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RepurchaseRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetRepurchaseRate() {
		return isSetField(227);
	}

	public void set(cl.bithaus.qfix.fields.Factor value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Factor get(cl.bithaus.qfix.fields.Factor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Factor getFactor() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Factor());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Factor field) {
		return isSetField(field);
	}

	public boolean isSetFactor() {
		return isSetField(228);
	}

	public void set(cl.bithaus.qfix.fields.CreditRating value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CreditRating get(cl.bithaus.qfix.fields.CreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CreditRating getCreditRating() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CreditRating());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CreditRating field) {
		return isSetField(field);
	}

	public boolean isSetCreditRating() {
		return isSetField(255);
	}

	public void set(cl.bithaus.qfix.fields.InstrRegistry value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.InstrRegistry get(cl.bithaus.qfix.fields.InstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.InstrRegistry getInstrRegistry() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.InstrRegistry());
	}

	public boolean isSet(cl.bithaus.qfix.fields.InstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetInstrRegistry() {
		return isSetField(543);
	}

	public void set(cl.bithaus.qfix.fields.CountryOfIssue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CountryOfIssue get(cl.bithaus.qfix.fields.CountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CountryOfIssue getCountryOfIssue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CountryOfIssue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetCountryOfIssue() {
		return isSetField(470);
	}

	public void set(cl.bithaus.qfix.fields.StateOrProvinceOfIssue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StateOrProvinceOfIssue get(cl.bithaus.qfix.fields.StateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StateOrProvinceOfIssue getStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StateOrProvinceOfIssue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetStateOrProvinceOfIssue() {
		return isSetField(471);
	}

	public void set(cl.bithaus.qfix.fields.LocaleOfIssue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LocaleOfIssue get(cl.bithaus.qfix.fields.LocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LocaleOfIssue getLocaleOfIssue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LocaleOfIssue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLocaleOfIssue() {
		return isSetField(472);
	}

	public void set(cl.bithaus.qfix.fields.RedemptionDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RedemptionDate get(cl.bithaus.qfix.fields.RedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RedemptionDate getRedemptionDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RedemptionDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetRedemptionDate() {
		return isSetField(240);
	}

	public void set(cl.bithaus.qfix.fields.StrikePrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StrikePrice get(cl.bithaus.qfix.fields.StrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StrikePrice getStrikePrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StrikePrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetStrikePrice() {
		return isSetField(202);
	}

	public void set(cl.bithaus.qfix.fields.StrikeCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StrikeCurrency get(cl.bithaus.qfix.fields.StrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StrikeCurrency getStrikeCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StrikeCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetStrikeCurrency() {
		return isSetField(947);
	}

	public void set(cl.bithaus.qfix.fields.OptAttribute value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OptAttribute get(cl.bithaus.qfix.fields.OptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OptAttribute getOptAttribute() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OptAttribute());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetOptAttribute() {
		return isSetField(206);
	}

	public void set(cl.bithaus.qfix.fields.ContractMultiplier value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ContractMultiplier get(cl.bithaus.qfix.fields.ContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ContractMultiplier getContractMultiplier() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ContractMultiplier());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetContractMultiplier() {
		return isSetField(231);
	}

	public void set(cl.bithaus.qfix.fields.CouponRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CouponRate get(cl.bithaus.qfix.fields.CouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CouponRate getCouponRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CouponRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CouponRate field) {
		return isSetField(field);
	}

	public boolean isSetCouponRate() {
		return isSetField(223);
	}

	public void set(cl.bithaus.qfix.fields.SecurityExchange value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecurityExchange get(cl.bithaus.qfix.fields.SecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecurityExchange getSecurityExchange() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecurityExchange());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetSecurityExchange() {
		return isSetField(207);
	}

	public void set(cl.bithaus.qfix.fields.Issuer value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Issuer get(cl.bithaus.qfix.fields.Issuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Issuer getIssuer() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Issuer());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Issuer field) {
		return isSetField(field);
	}

	public boolean isSetIssuer() {
		return isSetField(106);
	}

	public void set(cl.bithaus.qfix.fields.EncodedIssuerLen value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedIssuerLen get(cl.bithaus.qfix.fields.EncodedIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedIssuerLen getEncodedIssuerLen() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedIssuerLen());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedIssuerLen() {
		return isSetField(348);
	}

	public void set(cl.bithaus.qfix.fields.EncodedIssuer value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedIssuer get(cl.bithaus.qfix.fields.EncodedIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedIssuer getEncodedIssuer() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedIssuer());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedIssuer() {
		return isSetField(349);
	}

	public void set(cl.bithaus.qfix.fields.SecurityDesc value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecurityDesc get(cl.bithaus.qfix.fields.SecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecurityDesc getSecurityDesc() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecurityDesc());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetSecurityDesc() {
		return isSetField(107);
	}

	public void set(cl.bithaus.qfix.fields.EncodedSecurityDescLen value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedSecurityDescLen get(cl.bithaus.qfix.fields.EncodedSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedSecurityDescLen getEncodedSecurityDescLen() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedSecurityDescLen());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSecurityDescLen() {
		return isSetField(350);
	}

	public void set(cl.bithaus.qfix.fields.EncodedSecurityDesc value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedSecurityDesc get(cl.bithaus.qfix.fields.EncodedSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedSecurityDesc getEncodedSecurityDesc() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedSecurityDesc());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSecurityDesc() {
		return isSetField(351);
	}

	public void set(cl.bithaus.qfix.fields.Pool value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Pool get(cl.bithaus.qfix.fields.Pool value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Pool getPool() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Pool());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Pool field) {
		return isSetField(field);
	}

	public boolean isSetPool() {
		return isSetField(691);
	}

	public void set(cl.bithaus.qfix.fields.ContractSettlMonth value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ContractSettlMonth get(cl.bithaus.qfix.fields.ContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ContractSettlMonth getContractSettlMonth() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ContractSettlMonth());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetContractSettlMonth() {
		return isSetField(667);
	}

	public void set(cl.bithaus.qfix.fields.CPProgram value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CPProgram get(cl.bithaus.qfix.fields.CPProgram value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CPProgram getCPProgram() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CPProgram());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CPProgram field) {
		return isSetField(field);
	}

	public boolean isSetCPProgram() {
		return isSetField(875);
	}

	public void set(cl.bithaus.qfix.fields.CPRegType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CPRegType get(cl.bithaus.qfix.fields.CPRegType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CPRegType getCPRegType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CPRegType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CPRegType field) {
		return isSetField(field);
	}

	public boolean isSetCPRegType() {
		return isSetField(876);
	}

	public void set(cl.bithaus.qfix.fields.NoEvents value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoEvents get(cl.bithaus.qfix.fields.NoEvents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoEvents getNoEvents() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoEvents());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoEvents field) {
		return isSetField(field);
	}

	public boolean isSetNoEvents() {
		return isSetField(864);
	}

	public static class NoEvents extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {865, 866, 867, 868, 0};

		public NoEvents() {
			super(864, 865, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.EventType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EventType get(cl.bithaus.qfix.fields.EventType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EventType getEventType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EventType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EventType field) {
		return isSetField(field);
	}

	public boolean isSetEventType() {
		return isSetField(865);
	}

	public void set(cl.bithaus.qfix.fields.EventDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EventDate get(cl.bithaus.qfix.fields.EventDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EventDate getEventDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EventDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EventDate field) {
		return isSetField(field);
	}

	public boolean isSetEventDate() {
		return isSetField(866);
	}

	public void set(cl.bithaus.qfix.fields.EventPx value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EventPx get(cl.bithaus.qfix.fields.EventPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EventPx getEventPx() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EventPx());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EventPx field) {
		return isSetField(field);
	}

	public boolean isSetEventPx() {
		return isSetField(867);
	}

	public void set(cl.bithaus.qfix.fields.EventText value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EventText get(cl.bithaus.qfix.fields.EventText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EventText getEventText() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EventText());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EventText field) {
		return isSetField(field);
	}

	public boolean isSetEventText() {
		return isSetField(868);
	}

	}

	public void set(cl.bithaus.qfix.fields.DatedDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DatedDate get(cl.bithaus.qfix.fields.DatedDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DatedDate getDatedDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DatedDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DatedDate field) {
		return isSetField(field);
	}

	public boolean isSetDatedDate() {
		return isSetField(873);
	}

	public void set(cl.bithaus.qfix.fields.InterestAccrualDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.InterestAccrualDate get(cl.bithaus.qfix.fields.InterestAccrualDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.InterestAccrualDate getInterestAccrualDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.InterestAccrualDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.InterestAccrualDate field) {
		return isSetField(field);
	}

	public boolean isSetInterestAccrualDate() {
		return isSetField(874);
	}

	public void set(cl.bithaus.qfix.fields.Family value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Family get(cl.bithaus.qfix.fields.Family value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Family getFamily() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Family());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Family field) {
		return isSetField(field);
	}

	public boolean isSetFamily() {
		return isSetField(10160);
	}

	public void set(cl.bithaus.qfix.fields.SplitFactor value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SplitFactor get(cl.bithaus.qfix.fields.SplitFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SplitFactor getSplitFactor() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SplitFactor());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SplitFactor field) {
		return isSetField(field);
	}

	public boolean isSetSplitFactor() {
		return isSetField(10161);
	}

	public void set(cl.bithaus.qfix.fields.Bolson value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Bolson get(cl.bithaus.qfix.fields.Bolson value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Bolson getBolson() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Bolson());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Bolson field) {
		return isSetField(field);
	}

	public boolean isSetBolson() {
		return isSetField(10162);
	}

	public void set(cl.bithaus.qfix.fields.PaymentCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PaymentCurrency get(cl.bithaus.qfix.fields.PaymentCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PaymentCurrency getPaymentCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PaymentCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PaymentCurrency field) {
		return isSetField(field);
	}

	public boolean isSetPaymentCurrency() {
		return isSetField(10225);
	}

	public void set(cl.bithaus.qfix.fields.AdjustmentCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AdjustmentCurrency get(cl.bithaus.qfix.fields.AdjustmentCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AdjustmentCurrency getAdjustmentCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AdjustmentCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AdjustmentCurrency field) {
		return isSetField(field);
	}

	public boolean isSetAdjustmentCurrency() {
		return isSetField(10224);
	}

	public void set(cl.bithaus.qfix.fields.MinCut value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MinCut get(cl.bithaus.qfix.fields.MinCut value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MinCut getMinCut() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MinCut());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MinCut field) {
		return isSetField(field);
	}

	public boolean isSetMinCut() {
		return isSetField(10165);
	}

	public void set(cl.bithaus.qfix.fields.IssueAmount value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IssueAmount get(cl.bithaus.qfix.fields.IssueAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IssueAmount getIssueAmount() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IssueAmount());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IssueAmount field) {
		return isSetField(field);
	}

	public boolean isSetIssueAmount() {
		return isSetField(10166);
	}

	public void set(cl.bithaus.qfix.fields.RiskIndicator value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RiskIndicator get(cl.bithaus.qfix.fields.RiskIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RiskIndicator getRiskIndicator() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RiskIndicator());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RiskIndicator field) {
		return isSetField(field);
	}

	public boolean isSetRiskIndicator() {
		return isSetField(10174);
	}

	public void set(cl.bithaus.qfix.fields.FixedIncomePriceType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.FixedIncomePriceType get(cl.bithaus.qfix.fields.FixedIncomePriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.FixedIncomePriceType getFixedIncomePriceType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.FixedIncomePriceType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.FixedIncomePriceType field) {
		return isSetField(field);
	}

	public boolean isSetFixedIncomePriceType() {
		return isSetField(10176);
	}

	public void set(cl.bithaus.qfix.fields.InstrumentRisk value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.InstrumentRisk get(cl.bithaus.qfix.fields.InstrumentRisk value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.InstrumentRisk getInstrumentRisk() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.InstrumentRisk());
	}

	public boolean isSet(cl.bithaus.qfix.fields.InstrumentRisk field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentRisk() {
		return isSetField(10228);
	}

	public void set(cl.bithaus.qfix.fields.InstrumentType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.InstrumentType get(cl.bithaus.qfix.fields.InstrumentType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.InstrumentType getInstrumentType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.InstrumentType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.InstrumentType field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentType() {
		return isSetField(10229);
	}

	public void set(cl.bithaus.qfix.msg.component.FinancingDetails component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.FinancingDetails get(cl.bithaus.qfix.msg.component.FinancingDetails component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.FinancingDetails getFinancingDetails() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.FinancingDetails());
	}

	public void set(cl.bithaus.qfix.fields.AgreementDesc value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AgreementDesc get(cl.bithaus.qfix.fields.AgreementDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AgreementDesc getAgreementDesc() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AgreementDesc());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AgreementDesc field) {
		return isSetField(field);
	}

	public boolean isSetAgreementDesc() {
		return isSetField(913);
	}

	public void set(cl.bithaus.qfix.fields.AgreementID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AgreementID get(cl.bithaus.qfix.fields.AgreementID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AgreementID getAgreementID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AgreementID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AgreementID field) {
		return isSetField(field);
	}

	public boolean isSetAgreementID() {
		return isSetField(914);
	}

	public void set(cl.bithaus.qfix.fields.AgreementDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AgreementDate get(cl.bithaus.qfix.fields.AgreementDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AgreementDate getAgreementDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AgreementDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AgreementDate field) {
		return isSetField(field);
	}

	public boolean isSetAgreementDate() {
		return isSetField(915);
	}

	public void set(cl.bithaus.qfix.fields.AgreementCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AgreementCurrency get(cl.bithaus.qfix.fields.AgreementCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AgreementCurrency getAgreementCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AgreementCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AgreementCurrency field) {
		return isSetField(field);
	}

	public boolean isSetAgreementCurrency() {
		return isSetField(918);
	}

	public void set(cl.bithaus.qfix.fields.TerminationType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TerminationType get(cl.bithaus.qfix.fields.TerminationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TerminationType getTerminationType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TerminationType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TerminationType field) {
		return isSetField(field);
	}

	public boolean isSetTerminationType() {
		return isSetField(788);
	}

	public void set(cl.bithaus.qfix.fields.StartDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StartDate get(cl.bithaus.qfix.fields.StartDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StartDate getStartDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StartDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StartDate field) {
		return isSetField(field);
	}

	public boolean isSetStartDate() {
		return isSetField(916);
	}

	public void set(cl.bithaus.qfix.fields.EndDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EndDate get(cl.bithaus.qfix.fields.EndDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EndDate getEndDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EndDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EndDate field) {
		return isSetField(field);
	}

	public boolean isSetEndDate() {
		return isSetField(917);
	}

	public void set(cl.bithaus.qfix.fields.DeliveryType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DeliveryType get(cl.bithaus.qfix.fields.DeliveryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DeliveryType getDeliveryType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DeliveryType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DeliveryType field) {
		return isSetField(field);
	}

	public boolean isSetDeliveryType() {
		return isSetField(919);
	}

	public void set(cl.bithaus.qfix.fields.MarginRatio value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MarginRatio get(cl.bithaus.qfix.fields.MarginRatio value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MarginRatio getMarginRatio() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MarginRatio());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MarginRatio field) {
		return isSetField(field);
	}

	public boolean isSetMarginRatio() {
		return isSetField(898);
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

	public void set(cl.bithaus.qfix.fields.QtyType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.QtyType get(cl.bithaus.qfix.fields.QtyType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.QtyType getQtyType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.QtyType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.QtyType field) {
		return isSetField(field);
	}

	public boolean isSetQtyType() {
		return isSetField(854);
	}

	public void set(cl.bithaus.qfix.msg.component.OrderQtyData component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.OrderQtyData get(cl.bithaus.qfix.msg.component.OrderQtyData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.OrderQtyData getOrderQtyData() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.OrderQtyData());
	}

	public void set(cl.bithaus.qfix.fields.OrderQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrderQty get(cl.bithaus.qfix.fields.OrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrderQty getOrderQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrderQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrderQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty() {
		return isSetField(38);
	}

	public void set(cl.bithaus.qfix.fields.CashOrderQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CashOrderQty get(cl.bithaus.qfix.fields.CashOrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CashOrderQty getCashOrderQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CashOrderQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CashOrderQty field) {
		return isSetField(field);
	}

	public boolean isSetCashOrderQty() {
		return isSetField(152);
	}

	public void set(cl.bithaus.qfix.fields.OrderPercent value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrderPercent get(cl.bithaus.qfix.fields.OrderPercent value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrderPercent getOrderPercent() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrderPercent());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrderPercent field) {
		return isSetField(field);
	}

	public boolean isSetOrderPercent() {
		return isSetField(516);
	}

	public void set(cl.bithaus.qfix.fields.RoundingDirection value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RoundingDirection get(cl.bithaus.qfix.fields.RoundingDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RoundingDirection getRoundingDirection() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RoundingDirection());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RoundingDirection field) {
		return isSetField(field);
	}

	public boolean isSetRoundingDirection() {
		return isSetField(468);
	}

	public void set(cl.bithaus.qfix.fields.RoundingModulus value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RoundingModulus get(cl.bithaus.qfix.fields.RoundingModulus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RoundingModulus getRoundingModulus() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RoundingModulus());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RoundingModulus field) {
		return isSetField(field);
	}

	public boolean isSetRoundingModulus() {
		return isSetField(469);
	}

	public void set(cl.bithaus.qfix.fields.OrdType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrdType get(cl.bithaus.qfix.fields.OrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrdType getOrdType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrdType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrdType field) {
		return isSetField(field);
	}

	public boolean isSetOrdType() {
		return isSetField(40);
	}

	public void set(cl.bithaus.qfix.fields.PriceType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PriceType get(cl.bithaus.qfix.fields.PriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PriceType getPriceType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PriceType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PriceType field) {
		return isSetField(field);
	}

	public boolean isSetPriceType() {
		return isSetField(423);
	}

	public void set(cl.bithaus.qfix.fields.Price value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Price get(cl.bithaus.qfix.fields.Price value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Price getPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Price());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Price field) {
		return isSetField(field);
	}

	public boolean isSetPrice() {
		return isSetField(44);
	}

	public void set(cl.bithaus.qfix.fields.StopPx value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StopPx get(cl.bithaus.qfix.fields.StopPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StopPx getStopPx() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StopPx());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StopPx field) {
		return isSetField(field);
	}

	public boolean isSetStopPx() {
		return isSetField(99);
	}

	public void set(cl.bithaus.qfix.msg.component.PegInstructions component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.PegInstructions get(cl.bithaus.qfix.msg.component.PegInstructions component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.PegInstructions getPegInstructions() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.PegInstructions());
	}

	public void set(cl.bithaus.qfix.fields.PegOffsetValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PegOffsetValue get(cl.bithaus.qfix.fields.PegOffsetValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PegOffsetValue getPegOffsetValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PegOffsetValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PegOffsetValue field) {
		return isSetField(field);
	}

	public boolean isSetPegOffsetValue() {
		return isSetField(211);
	}

	public void set(cl.bithaus.qfix.msg.component.DiscretionInstructions component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.DiscretionInstructions get(cl.bithaus.qfix.msg.component.DiscretionInstructions component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.DiscretionInstructions getDiscretionInstructions() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.DiscretionInstructions());
	}

	public void set(cl.bithaus.qfix.fields.DiscretionInst value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DiscretionInst get(cl.bithaus.qfix.fields.DiscretionInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DiscretionInst getDiscretionInst() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DiscretionInst());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DiscretionInst field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionInst() {
		return isSetField(388);
	}

	public void set(cl.bithaus.qfix.fields.DiscretionOffsetValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DiscretionOffsetValue get(cl.bithaus.qfix.fields.DiscretionOffsetValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DiscretionOffsetValue getDiscretionOffsetValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DiscretionOffsetValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DiscretionOffsetValue field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionOffsetValue() {
		return isSetField(389);
	}

	public void set(cl.bithaus.qfix.fields.DiscretionMoveType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DiscretionMoveType get(cl.bithaus.qfix.fields.DiscretionMoveType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DiscretionMoveType getDiscretionMoveType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DiscretionMoveType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DiscretionMoveType field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionMoveType() {
		return isSetField(841);
	}

	public void set(cl.bithaus.qfix.fields.DiscretionOffsetType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DiscretionOffsetType get(cl.bithaus.qfix.fields.DiscretionOffsetType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DiscretionOffsetType getDiscretionOffsetType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DiscretionOffsetType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DiscretionOffsetType field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionOffsetType() {
		return isSetField(842);
	}

	public void set(cl.bithaus.qfix.fields.DiscretionLimitType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DiscretionLimitType get(cl.bithaus.qfix.fields.DiscretionLimitType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DiscretionLimitType getDiscretionLimitType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DiscretionLimitType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DiscretionLimitType field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionLimitType() {
		return isSetField(843);
	}

	public void set(cl.bithaus.qfix.fields.DiscretionRoundDirection value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DiscretionRoundDirection get(cl.bithaus.qfix.fields.DiscretionRoundDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DiscretionRoundDirection getDiscretionRoundDirection() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DiscretionRoundDirection());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DiscretionRoundDirection field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionRoundDirection() {
		return isSetField(844);
	}

	public void set(cl.bithaus.qfix.fields.DiscretionScope value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DiscretionScope get(cl.bithaus.qfix.fields.DiscretionScope value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DiscretionScope getDiscretionScope() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DiscretionScope());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DiscretionScope field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionScope() {
		return isSetField(846);
	}

	public void set(cl.bithaus.qfix.fields.TargetStrategy value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TargetStrategy get(cl.bithaus.qfix.fields.TargetStrategy value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TargetStrategy getTargetStrategy() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TargetStrategy());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TargetStrategy field) {
		return isSetField(field);
	}

	public boolean isSetTargetStrategy() {
		return isSetField(847);
	}

	public void set(cl.bithaus.qfix.fields.TargetStrategyParameters value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TargetStrategyParameters get(cl.bithaus.qfix.fields.TargetStrategyParameters value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TargetStrategyParameters getTargetStrategyParameters() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TargetStrategyParameters());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TargetStrategyParameters field) {
		return isSetField(field);
	}

	public boolean isSetTargetStrategyParameters() {
		return isSetField(848);
	}

	public void set(cl.bithaus.qfix.fields.ParticipationRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ParticipationRate get(cl.bithaus.qfix.fields.ParticipationRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ParticipationRate getParticipationRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ParticipationRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ParticipationRate field) {
		return isSetField(field);
	}

	public boolean isSetParticipationRate() {
		return isSetField(849);
	}

	public void set(cl.bithaus.qfix.fields.SolicitedFlag value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SolicitedFlag get(cl.bithaus.qfix.fields.SolicitedFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SolicitedFlag getSolicitedFlag() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SolicitedFlag());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SolicitedFlag field) {
		return isSetField(field);
	}

	public boolean isSetSolicitedFlag() {
		return isSetField(377);
	}

	public void set(cl.bithaus.qfix.fields.Currency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Currency get(cl.bithaus.qfix.fields.Currency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Currency getCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Currency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Currency field) {
		return isSetField(field);
	}

	public boolean isSetCurrency() {
		return isSetField(15);
	}

	public void set(cl.bithaus.qfix.fields.TimeInForce value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TimeInForce get(cl.bithaus.qfix.fields.TimeInForce value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TimeInForce getTimeInForce() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TimeInForce());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TimeInForce field) {
		return isSetField(field);
	}

	public boolean isSetTimeInForce() {
		return isSetField(59);
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

	public void set(cl.bithaus.qfix.fields.OrderQty2 value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrderQty2 get(cl.bithaus.qfix.fields.OrderQty2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrderQty2 getOrderQty2() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrderQty2());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrderQty2 field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty2() {
		return isSetField(192);
	}

	public void set(cl.bithaus.qfix.fields.Price2 value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Price2 get(cl.bithaus.qfix.fields.Price2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Price2 getPrice2() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Price2());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Price2 field) {
		return isSetField(field);
	}

	public boolean isSetPrice2() {
		return isSetField(640);
	}

	public void set(cl.bithaus.qfix.fields.LocateReqd value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LocateReqd get(cl.bithaus.qfix.fields.LocateReqd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LocateReqd getLocateReqd() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LocateReqd());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LocateReqd field) {
		return isSetField(field);
	}

	public boolean isSetLocateReqd() {
		return isSetField(114);
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

	public void set(cl.bithaus.qfix.fields.StopPxCondition value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StopPxCondition get(cl.bithaus.qfix.fields.StopPxCondition value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StopPxCondition getStopPxCondition() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StopPxCondition());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StopPxCondition field) {
		return isSetField(field);
	}

	public boolean isSetStopPxCondition() {
		return isSetField(5255);
	}

	public void set(cl.bithaus.qfix.msg.component.SpecialOrderData component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.SpecialOrderData get(cl.bithaus.qfix.msg.component.SpecialOrderData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.SpecialOrderData getSpecialOrderData() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.SpecialOrderData());
	}

	public void set(cl.bithaus.qfix.fields.SpecialOrderType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SpecialOrderType get(cl.bithaus.qfix.fields.SpecialOrderType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SpecialOrderType getSpecialOrderType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SpecialOrderType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SpecialOrderType field) {
		return isSetField(field);
	}

	public boolean isSetSpecialOrderType() {
		return isSetField(10128);
	}

	public void set(cl.bithaus.qfix.fields.NumberOfOrders value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NumberOfOrders get(cl.bithaus.qfix.fields.NumberOfOrders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NumberOfOrders getNumberOfOrders() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NumberOfOrders());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NumberOfOrders field) {
		return isSetField(field);
	}

	public boolean isSetNumberOfOrders() {
		return isSetField(346);
	}

	public void set(cl.bithaus.qfix.fields.OrderNumber value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrderNumber get(cl.bithaus.qfix.fields.OrderNumber value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrderNumber getOrderNumber() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrderNumber());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrderNumber field) {
		return isSetField(field);
	}

	public boolean isSetOrderNumber() {
		return isSetField(10133);
	}

	public void set(cl.bithaus.qfix.fields.NoSpecialOrderData value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoSpecialOrderData get(cl.bithaus.qfix.fields.NoSpecialOrderData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoSpecialOrderData getNoSpecialOrderData() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoSpecialOrderData());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoSpecialOrderData field) {
		return isSetField(field);
	}

	public boolean isSetNoSpecialOrderData() {
		return isSetField(10131);
	}

	public static class NoSpecialOrderData extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {10129, 10130, 0};

		public NoSpecialOrderData() {
			super(10131, 10129, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.SpecialOrderDataTypeID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SpecialOrderDataTypeID get(cl.bithaus.qfix.fields.SpecialOrderDataTypeID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SpecialOrderDataTypeID getSpecialOrderDataTypeID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SpecialOrderDataTypeID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SpecialOrderDataTypeID field) {
		return isSetField(field);
	}

	public boolean isSetSpecialOrderDataTypeID() {
		return isSetField(10129);
	}

	public void set(cl.bithaus.qfix.fields.SpecialOrderDataValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SpecialOrderDataValue get(cl.bithaus.qfix.fields.SpecialOrderDataValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SpecialOrderDataValue getSpecialOrderDataValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SpecialOrderDataValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SpecialOrderDataValue field) {
		return isSetField(field);
	}

	public boolean isSetSpecialOrderDataValue() {
		return isSetField(10130);
	}

	}

	public void set(cl.bithaus.qfix.fields.RefOrderID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RefOrderID get(cl.bithaus.qfix.fields.RefOrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RefOrderID getRefOrderID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RefOrderID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RefOrderID field) {
		return isSetField(field);
	}

	public boolean isSetRefOrderID() {
		return isSetField(1080);
	}

	public void set(cl.bithaus.qfix.fields.RefOrderIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RefOrderIDSource get(cl.bithaus.qfix.fields.RefOrderIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RefOrderIDSource getRefOrderIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RefOrderIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RefOrderIDSource field) {
		return isSetField(field);
	}

	public boolean isSetRefOrderIDSource() {
		return isSetField(1081);
	}

	public void set(cl.bithaus.qfix.fields.AuctionId value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AuctionId get(cl.bithaus.qfix.fields.AuctionId value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AuctionId getAuctionId() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AuctionId());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AuctionId field) {
		return isSetField(field);
	}

	public boolean isSetAuctionId() {
		return isSetField(10167);
	}

	public void set(cl.bithaus.qfix.msg.component.IIFValorization component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.IIFValorization get(cl.bithaus.qfix.msg.component.IIFValorization component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.IIFValorization getIIFValorization() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.IIFValorization());
	}

	public void set(cl.bithaus.qfix.fields.IifValAdjustmentCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IifValAdjustmentCurrency get(cl.bithaus.qfix.fields.IifValAdjustmentCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IifValAdjustmentCurrency getIifValAdjustmentCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IifValAdjustmentCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IifValAdjustmentCurrency field) {
		return isSetField(field);
	}

	public boolean isSetIifValAdjustmentCurrency() {
		return isSetField(10177);
	}

	public void set(cl.bithaus.qfix.fields.IifValDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IifValDate get(cl.bithaus.qfix.fields.IifValDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IifValDate getIifValDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IifValDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IifValDate field) {
		return isSetField(field);
	}

	public boolean isSetIifValDate() {
		return isSetField(10178);
	}

	public void set(cl.bithaus.qfix.fields.IifValSettlType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IifValSettlType get(cl.bithaus.qfix.fields.IifValSettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IifValSettlType getIifValSettlType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IifValSettlType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IifValSettlType field) {
		return isSetField(field);
	}

	public boolean isSetIifValSettlType() {
		return isSetField(10179);
	}

	public void set(cl.bithaus.qfix.fields.IifValDueDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IifValDueDate get(cl.bithaus.qfix.fields.IifValDueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IifValDueDate getIifValDueDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IifValDueDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IifValDueDate field) {
		return isSetField(field);
	}

	public boolean isSetIifValDueDate() {
		return isSetField(10180);
	}

	public void set(cl.bithaus.qfix.fields.IifValDueDays value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IifValDueDays get(cl.bithaus.qfix.fields.IifValDueDays value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IifValDueDays getIifValDueDays() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IifValDueDays());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IifValDueDays field) {
		return isSetField(field);
	}

	public boolean isSetIifValDueDays() {
		return isSetField(10181);
	}

	public void set(cl.bithaus.qfix.fields.IifValInterestRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IifValInterestRate get(cl.bithaus.qfix.fields.IifValInterestRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IifValInterestRate getIifValInterestRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IifValInterestRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IifValInterestRate field) {
		return isSetField(field);
	}

	public boolean isSetIifValInterestRate() {
		return isSetField(10182);
	}

	public void set(cl.bithaus.qfix.fields.IifValRescueAmount value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IifValRescueAmount get(cl.bithaus.qfix.fields.IifValRescueAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IifValRescueAmount getIifValRescueAmount() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IifValRescueAmount());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IifValRescueAmount field) {
		return isSetField(field);
	}

	public boolean isSetIifValRescueAmount() {
		return isSetField(10183);
	}

	public void set(cl.bithaus.qfix.fields.IifValInvestmentAmount value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IifValInvestmentAmount get(cl.bithaus.qfix.fields.IifValInvestmentAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IifValInvestmentAmount getIifValInvestmentAmount() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IifValInvestmentAmount());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IifValInvestmentAmount field) {
		return isSetField(field);
	}

	public boolean isSetIifValInvestmentAmount() {
		return isSetField(10184);
	}

	public void set(cl.bithaus.qfix.fields.IifValInvestmentAmountAdjustedCurrence value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IifValInvestmentAmountAdjustedCurrence get(cl.bithaus.qfix.fields.IifValInvestmentAmountAdjustedCurrence value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IifValInvestmentAmountAdjustedCurrence getIifValInvestmentAmountAdjustedCurrence() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IifValInvestmentAmountAdjustedCurrence());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IifValInvestmentAmountAdjustedCurrence field) {
		return isSetField(field);
	}

	public boolean isSetIifValInvestmentAmountAdjustedCurrence() {
		return isSetField(10185);
	}

	public void set(cl.bithaus.qfix.fields.IifValFloatSymbol value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IifValFloatSymbol get(cl.bithaus.qfix.fields.IifValFloatSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IifValFloatSymbol getIifValFloatSymbol() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IifValFloatSymbol());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IifValFloatSymbol field) {
		return isSetField(field);
	}

	public boolean isSetIifValFloatSymbol() {
		return isSetField(10186);
	}

	public void set(cl.bithaus.qfix.fields.IifValFloatIssueDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IifValFloatIssueDate get(cl.bithaus.qfix.fields.IifValFloatIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IifValFloatIssueDate getIifValFloatIssueDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IifValFloatIssueDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IifValFloatIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetIifValFloatIssueDate() {
		return isSetField(10187);
	}

	public void set(cl.bithaus.qfix.fields.IifValFloatNominalQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IifValFloatNominalQty get(cl.bithaus.qfix.fields.IifValFloatNominalQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IifValFloatNominalQty getIifValFloatNominalQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IifValFloatNominalQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IifValFloatNominalQty field) {
		return isSetField(field);
	}

	public boolean isSetIifValFloatNominalQty() {
		return isSetField(10188);
	}

	public void set(cl.bithaus.qfix.fields.IifValFloatEstimatedInterestRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IifValFloatEstimatedInterestRate get(cl.bithaus.qfix.fields.IifValFloatEstimatedInterestRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IifValFloatEstimatedInterestRate getIifValFloatEstimatedInterestRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IifValFloatEstimatedInterestRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IifValFloatEstimatedInterestRate field) {
		return isSetField(field);
	}

	public boolean isSetIifValFloatEstimatedInterestRate() {
		return isSetField(10189);
	}

	public void set(cl.bithaus.qfix.fields.IifValReferentialValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IifValReferentialValue get(cl.bithaus.qfix.fields.IifValReferentialValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IifValReferentialValue getIifValReferentialValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IifValReferentialValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IifValReferentialValue field) {
		return isSetField(field);
	}

	public boolean isSetIifValReferentialValue() {
		return isSetField(10190);
	}

	public void set(cl.bithaus.qfix.msg.component.IRFValorization component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.IRFValorization get(cl.bithaus.qfix.msg.component.IRFValorization component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.IRFValorization getIRFValorization() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.IRFValorization());
	}

	public void set(cl.bithaus.qfix.fields.IrfValSymbol value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValSymbol get(cl.bithaus.qfix.fields.IrfValSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValSymbol getIrfValSymbol() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValSymbol());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValSymbol field) {
		return isSetField(field);
	}

	public boolean isSetIrfValSymbol() {
		return isSetField(10191);
	}

	public void set(cl.bithaus.qfix.fields.IrfValAdjustmentCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValAdjustmentCurrency get(cl.bithaus.qfix.fields.IrfValAdjustmentCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValAdjustmentCurrency getIrfValAdjustmentCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValAdjustmentCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValAdjustmentCurrency field) {
		return isSetField(field);
	}

	public boolean isSetIrfValAdjustmentCurrency() {
		return isSetField(10206);
	}

	public void set(cl.bithaus.qfix.fields.IrfValDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValDate get(cl.bithaus.qfix.fields.IrfValDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValDate getIrfValDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValDate field) {
		return isSetField(field);
	}

	public boolean isSetIrfValDate() {
		return isSetField(10207);
	}

	public void set(cl.bithaus.qfix.fields.IrfValSettlType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValSettlType get(cl.bithaus.qfix.fields.IrfValSettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValSettlType getIrfValSettlType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValSettlType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValSettlType field) {
		return isSetField(field);
	}

	public boolean isSetIrfValSettlType() {
		return isSetField(10208);
	}

	public void set(cl.bithaus.qfix.fields.IrfValQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValQty get(cl.bithaus.qfix.fields.IrfValQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValQty getIrfValQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValQty field) {
		return isSetField(field);
	}

	public boolean isSetIrfValQty() {
		return isSetField(10192);
	}

	public void set(cl.bithaus.qfix.fields.IrfValTir value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValTir get(cl.bithaus.qfix.fields.IrfValTir value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValTir getIrfValTir() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValTir());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValTir field) {
		return isSetField(field);
	}

	public boolean isSetIrfValTir() {
		return isSetField(10193);
	}

	public void set(cl.bithaus.qfix.fields.IrfValPrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValPrice get(cl.bithaus.qfix.fields.IrfValPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValPrice getIrfValPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValPrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValPrice field) {
		return isSetField(field);
	}

	public boolean isSetIrfValPrice() {
		return isSetField(10194);
	}

	public void set(cl.bithaus.qfix.fields.IrfValAmount value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValAmount get(cl.bithaus.qfix.fields.IrfValAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValAmount getIrfValAmount() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValAmount());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValAmount field) {
		return isSetField(field);
	}

	public boolean isSetIrfValAmount() {
		return isSetField(10195);
	}

	public void set(cl.bithaus.qfix.fields.IrfValAmountAdjustedCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValAmountAdjustedCurrency get(cl.bithaus.qfix.fields.IrfValAmountAdjustedCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValAmountAdjustedCurrency getIrfValAmountAdjustedCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValAmountAdjustedCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValAmountAdjustedCurrency field) {
		return isSetField(field);
	}

	public boolean isSetIrfValAmountAdjustedCurrency() {
		return isSetField(10196);
	}

	public void set(cl.bithaus.qfix.fields.IrfValSettlAmount value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValSettlAmount get(cl.bithaus.qfix.fields.IrfValSettlAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValSettlAmount getIrfValSettlAmount() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValSettlAmount());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValSettlAmount field) {
		return isSetField(field);
	}

	public boolean isSetIrfValSettlAmount() {
		return isSetField(10197);
	}

	public void set(cl.bithaus.qfix.fields.IrfValPar value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValPar get(cl.bithaus.qfix.fields.IrfValPar value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValPar getIrfValPar() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValPar());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValPar field) {
		return isSetField(field);
	}

	public boolean isSetIrfValPar() {
		return isSetField(10198);
	}

	public void set(cl.bithaus.qfix.fields.IrfValPeriod value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValPeriod get(cl.bithaus.qfix.fields.IrfValPeriod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValPeriod getIrfValPeriod() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValPeriod());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValPeriod field) {
		return isSetField(field);
	}

	public boolean isSetIrfValPeriod() {
		return isSetField(10199);
	}

	public void set(cl.bithaus.qfix.fields.IrfValDuration value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValDuration get(cl.bithaus.qfix.fields.IrfValDuration value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValDuration getIrfValDuration() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValDuration());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValDuration field) {
		return isSetField(field);
	}

	public boolean isSetIrfValDuration() {
		return isSetField(10200);
	}

	public void set(cl.bithaus.qfix.fields.IrfValConvex value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValConvex get(cl.bithaus.qfix.fields.IrfValConvex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValConvex getIrfValConvex() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValConvex());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValConvex field) {
		return isSetField(field);
	}

	public boolean isSetIrfValConvex() {
		return isSetField(10201);
	}

	public void set(cl.bithaus.qfix.fields.IrfValFloatingRateParValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValFloatingRateParValue get(cl.bithaus.qfix.fields.IrfValFloatingRateParValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValFloatingRateParValue getIrfValFloatingRateParValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValFloatingRateParValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValFloatingRateParValue field) {
		return isSetField(field);
	}

	public boolean isSetIrfValFloatingRateParValue() {
		return isSetField(10202);
	}

	public void set(cl.bithaus.qfix.fields.IrfValFloatingRateEstRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValFloatingRateEstRate get(cl.bithaus.qfix.fields.IrfValFloatingRateEstRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValFloatingRateEstRate getIrfValFloatingRateEstRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValFloatingRateEstRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValFloatingRateEstRate field) {
		return isSetField(field);
	}

	public boolean isSetIrfValFloatingRateEstRate() {
		return isSetField(10203);
	}

	public void set(cl.bithaus.qfix.fields.IrfValOtherPeriodYears value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValOtherPeriodYears get(cl.bithaus.qfix.fields.IrfValOtherPeriodYears value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValOtherPeriodYears getIrfValOtherPeriodYears() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValOtherPeriodYears());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValOtherPeriodYears field) {
		return isSetField(field);
	}

	public boolean isSetIrfValOtherPeriodYears() {
		return isSetField(10204);
	}

	public void set(cl.bithaus.qfix.fields.IrfValOtherEstYearInflationRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValOtherEstYearInflationRate get(cl.bithaus.qfix.fields.IrfValOtherEstYearInflationRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValOtherEstYearInflationRate getIrfValOtherEstYearInflationRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValOtherEstYearInflationRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValOtherEstYearInflationRate field) {
		return isSetField(field);
	}

	public boolean isSetIrfValOtherEstYearInflationRate() {
		return isSetField(10205);
	}

	public void set(cl.bithaus.qfix.fields.IrfValReferentialValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IrfValReferentialValue get(cl.bithaus.qfix.fields.IrfValReferentialValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IrfValReferentialValue getIrfValReferentialValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IrfValReferentialValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IrfValReferentialValue field) {
		return isSetField(field);
	}

	public boolean isSetIrfValReferentialValue() {
		return isSetField(10209);
	}

	public void set(cl.bithaus.qfix.fields.DcvTitle value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DcvTitle get(cl.bithaus.qfix.fields.DcvTitle value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DcvTitle getDcvTitle() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DcvTitle());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DcvTitle field) {
		return isSetField(field);
	}

	public boolean isSetDcvTitle() {
		return isSetField(10212);
	}

	public void set(cl.bithaus.qfix.fields.Expressed value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Expressed get(cl.bithaus.qfix.fields.Expressed value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Expressed getExpressed() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Expressed());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Expressed field) {
		return isSetField(field);
	}

	public boolean isSetExpressed() {
		return isSetField(10213);
	}

	public void set(cl.bithaus.qfix.fields.NoOffers value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoOffers get(cl.bithaus.qfix.fields.NoOffers value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoOffers getNoOffers() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoOffers());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoOffers field) {
		return isSetField(field);
	}

	public boolean isSetNoOffers() {
		return isSetField(10216);
	}

}
