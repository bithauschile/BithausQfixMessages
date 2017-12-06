
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class CrossOrderCancelReplaceRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "t";
	

	public CrossOrderCancelReplaceRequest() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public CrossOrderCancelReplaceRequest(cl.bithaus.qfix.fields.CrossID crossID, cl.bithaus.qfix.fields.OrigCrossID origCrossID, cl.bithaus.qfix.fields.CrossType crossType, cl.bithaus.qfix.fields.CrossPrioritization crossPrioritization, cl.bithaus.qfix.fields.TransactTime transactTime, cl.bithaus.qfix.fields.OrdType ordType, cl.bithaus.qfix.fields.TimeInForce timeInForce) {
		this();
		setField(crossID);
		setField(origCrossID);
		setField(crossType);
		setField(crossPrioritization);
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

	public void set(cl.bithaus.qfix.fields.CrossID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CrossID get(cl.bithaus.qfix.fields.CrossID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CrossID getCrossID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CrossID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CrossID field) {
		return isSetField(field);
	}

	public boolean isSetCrossID() {
		return isSetField(548);
	}

	public void set(cl.bithaus.qfix.fields.OrigCrossID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrigCrossID get(cl.bithaus.qfix.fields.OrigCrossID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrigCrossID getOrigCrossID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrigCrossID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrigCrossID field) {
		return isSetField(field);
	}

	public boolean isSetOrigCrossID() {
		return isSetField(551);
	}

	public void set(cl.bithaus.qfix.fields.CrossType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CrossType get(cl.bithaus.qfix.fields.CrossType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CrossType getCrossType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CrossType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CrossType field) {
		return isSetField(field);
	}

	public boolean isSetCrossType() {
		return isSetField(549);
	}

	public void set(cl.bithaus.qfix.fields.CrossPrioritization value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CrossPrioritization get(cl.bithaus.qfix.fields.CrossPrioritization value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CrossPrioritization getCrossPrioritization() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CrossPrioritization());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CrossPrioritization field) {
		return isSetField(field);
	}

	public boolean isSetCrossPrioritization() {
		return isSetField(550);
	}

	public void set(cl.bithaus.qfix.fields.NoSides value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoSides get(cl.bithaus.qfix.fields.NoSides value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoSides getNoSides() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoSides());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoSides field) {
		return isSetField(field);
	}

	public boolean isSetNoSides() {
		return isSetField(552);
	}

	public static class NoSides extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {54, 41, 11, 526, 583, 586, 453, 229, 75, 1, 660, 581, 589, 590, 591, 70, 78, 854, 38, 152, 516, 468, 469, 12, 13, 479, 497, 528, 529, 582, 121, 120, 775, 58, 354, 355, 77, 203, 544, 635, 377, 659, 0};

		public NoSides() {
			super(552, 54, ORDER);
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

	public void set(cl.bithaus.qfix.fields.AccountType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AccountType get(cl.bithaus.qfix.fields.AccountType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AccountType getAccountType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AccountType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AccountType field) {
		return isSetField(field);
	}

	public boolean isSetAccountType() {
		return isSetField(581);
	}

	public void set(cl.bithaus.qfix.fields.DayBookingInst value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DayBookingInst get(cl.bithaus.qfix.fields.DayBookingInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DayBookingInst getDayBookingInst() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DayBookingInst());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DayBookingInst field) {
		return isSetField(field);
	}

	public boolean isSetDayBookingInst() {
		return isSetField(589);
	}

	public void set(cl.bithaus.qfix.fields.BookingUnit value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BookingUnit get(cl.bithaus.qfix.fields.BookingUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BookingUnit getBookingUnit() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BookingUnit());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BookingUnit field) {
		return isSetField(field);
	}

	public boolean isSetBookingUnit() {
		return isSetField(590);
	}

	public void set(cl.bithaus.qfix.fields.PreallocMethod value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PreallocMethod get(cl.bithaus.qfix.fields.PreallocMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PreallocMethod getPreallocMethod() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PreallocMethod());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PreallocMethod field) {
		return isSetField(field);
	}

	public boolean isSetPreallocMethod() {
		return isSetField(591);
	}

	public void set(cl.bithaus.qfix.fields.AllocID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AllocID get(cl.bithaus.qfix.fields.AllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AllocID getAllocID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AllocID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AllocID field) {
		return isSetField(field);
	}

	public boolean isSetAllocID() {
		return isSetField(70);
	}

	public void set(cl.bithaus.qfix.fields.NoAllocs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoAllocs get(cl.bithaus.qfix.fields.NoAllocs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoAllocs getNoAllocs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoAllocs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoAllocs field) {
		return isSetField(field);
	}

	public boolean isSetNoAllocs() {
		return isSetField(78);
	}

	public static class NoAllocs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {79, 661, 736, 467, 539, 80, 0};

		public NoAllocs() {
			super(78, 79, ORDER);
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

	public void set(cl.bithaus.qfix.fields.AllocSettlCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AllocSettlCurrency get(cl.bithaus.qfix.fields.AllocSettlCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AllocSettlCurrency getAllocSettlCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AllocSettlCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AllocSettlCurrency field) {
		return isSetField(field);
	}

	public boolean isSetAllocSettlCurrency() {
		return isSetField(736);
	}

	public void set(cl.bithaus.qfix.fields.IndividualAllocID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IndividualAllocID get(cl.bithaus.qfix.fields.IndividualAllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IndividualAllocID getIndividualAllocID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IndividualAllocID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IndividualAllocID field) {
		return isSetField(field);
	}

	public boolean isSetIndividualAllocID() {
		return isSetField(467);
	}

	public void set(cl.bithaus.qfix.msg.component.NestedParties component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.NestedParties get(cl.bithaus.qfix.msg.component.NestedParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.NestedParties getNestedParties() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.NestedParties());
	}

	public void set(cl.bithaus.qfix.fields.NoNestedPartyIDs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoNestedPartyIDs get(cl.bithaus.qfix.fields.NoNestedPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoNestedPartyIDs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoNestedPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartyIDs() {
		return isSetField(539);
	}

	public static class NoNestedPartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {524, 525, 538, 804, 0};

		public NoNestedPartyIDs() {
			super(539, 524, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.NestedPartyID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NestedPartyID get(cl.bithaus.qfix.fields.NestedPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NestedPartyID getNestedPartyID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NestedPartyID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NestedPartyID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyID() {
		return isSetField(524);
	}

	public void set(cl.bithaus.qfix.fields.NestedPartyIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NestedPartyIDSource get(cl.bithaus.qfix.fields.NestedPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NestedPartyIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NestedPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyIDSource() {
		return isSetField(525);
	}

	public void set(cl.bithaus.qfix.fields.NestedPartyRole value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NestedPartyRole get(cl.bithaus.qfix.fields.NestedPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NestedPartyRole());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NestedPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyRole() {
		return isSetField(538);
	}

	public void set(cl.bithaus.qfix.fields.NoNestedPartySubIDs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoNestedPartySubIDs get(cl.bithaus.qfix.fields.NoNestedPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoNestedPartySubIDs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoNestedPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartySubIDs() {
		return isSetField(804);
	}

	public static class NoNestedPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {545, 805, 0};

		public NoNestedPartySubIDs() {
			super(804, 545, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.NestedPartySubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NestedPartySubID get(cl.bithaus.qfix.fields.NestedPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NestedPartySubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NestedPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubID() {
		return isSetField(545);
	}

	public void set(cl.bithaus.qfix.fields.NestedPartySubIDType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NestedPartySubIDType get(cl.bithaus.qfix.fields.NestedPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NestedPartySubIDType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NestedPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubIDType() {
		return isSetField(805);
	}

	}

	}

	public void set(cl.bithaus.qfix.fields.AllocQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AllocQty get(cl.bithaus.qfix.fields.AllocQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AllocQty getAllocQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AllocQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AllocQty field) {
		return isSetField(field);
	}

	public boolean isSetAllocQty() {
		return isSetField(80);
	}

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

	public void set(cl.bithaus.qfix.msg.component.CommissionData component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.CommissionData get(cl.bithaus.qfix.msg.component.CommissionData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.CommissionData getCommissionData() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.CommissionData());
	}

	public void set(cl.bithaus.qfix.fields.Commission value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Commission get(cl.bithaus.qfix.fields.Commission value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Commission getCommission() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Commission());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Commission field) {
		return isSetField(field);
	}

	public boolean isSetCommission() {
		return isSetField(12);
	}

	public void set(cl.bithaus.qfix.fields.CommType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CommType get(cl.bithaus.qfix.fields.CommType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CommType getCommType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CommType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CommType field) {
		return isSetField(field);
	}

	public boolean isSetCommType() {
		return isSetField(13);
	}

	public void set(cl.bithaus.qfix.fields.CommCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CommCurrency get(cl.bithaus.qfix.fields.CommCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CommCurrency getCommCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CommCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CommCurrency field) {
		return isSetField(field);
	}

	public boolean isSetCommCurrency() {
		return isSetField(479);
	}

	public void set(cl.bithaus.qfix.fields.FundRenewWaiv value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.FundRenewWaiv get(cl.bithaus.qfix.fields.FundRenewWaiv value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.FundRenewWaiv getFundRenewWaiv() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.FundRenewWaiv());
	}

	public boolean isSet(cl.bithaus.qfix.fields.FundRenewWaiv field) {
		return isSetField(field);
	}

	public boolean isSetFundRenewWaiv() {
		return isSetField(497);
	}

	public void set(cl.bithaus.qfix.fields.OrderCapacity value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrderCapacity get(cl.bithaus.qfix.fields.OrderCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrderCapacity getOrderCapacity() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrderCapacity());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrderCapacity field) {
		return isSetField(field);
	}

	public boolean isSetOrderCapacity() {
		return isSetField(528);
	}

	public void set(cl.bithaus.qfix.fields.OrderRestrictions value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrderRestrictions get(cl.bithaus.qfix.fields.OrderRestrictions value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrderRestrictions getOrderRestrictions() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrderRestrictions());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrderRestrictions field) {
		return isSetField(field);
	}

	public boolean isSetOrderRestrictions() {
		return isSetField(529);
	}

	public void set(cl.bithaus.qfix.fields.CustOrderCapacity value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CustOrderCapacity get(cl.bithaus.qfix.fields.CustOrderCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CustOrderCapacity getCustOrderCapacity() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CustOrderCapacity());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CustOrderCapacity field) {
		return isSetField(field);
	}

	public boolean isSetCustOrderCapacity() {
		return isSetField(582);
	}

	public void set(cl.bithaus.qfix.fields.ForexReq value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ForexReq get(cl.bithaus.qfix.fields.ForexReq value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ForexReq getForexReq() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ForexReq());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ForexReq field) {
		return isSetField(field);
	}

	public boolean isSetForexReq() {
		return isSetField(121);
	}

	public void set(cl.bithaus.qfix.fields.SettlCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlCurrency get(cl.bithaus.qfix.fields.SettlCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlCurrency getSettlCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlCurrency field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrency() {
		return isSetField(120);
	}

	public void set(cl.bithaus.qfix.fields.BookingType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BookingType get(cl.bithaus.qfix.fields.BookingType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BookingType getBookingType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BookingType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BookingType field) {
		return isSetField(field);
	}

	public boolean isSetBookingType() {
		return isSetField(775);
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

	public void set(cl.bithaus.qfix.fields.PositionEffect value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PositionEffect get(cl.bithaus.qfix.fields.PositionEffect value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PositionEffect getPositionEffect() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PositionEffect());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PositionEffect field) {
		return isSetField(field);
	}

	public boolean isSetPositionEffect() {
		return isSetField(77);
	}

	public void set(cl.bithaus.qfix.fields.CoveredOrUncovered value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CoveredOrUncovered get(cl.bithaus.qfix.fields.CoveredOrUncovered value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CoveredOrUncovered getCoveredOrUncovered() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CoveredOrUncovered());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CoveredOrUncovered field) {
		return isSetField(field);
	}

	public boolean isSetCoveredOrUncovered() {
		return isSetField(203);
	}

	public void set(cl.bithaus.qfix.fields.CashMargin value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CashMargin get(cl.bithaus.qfix.fields.CashMargin value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CashMargin getCashMargin() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CashMargin());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CashMargin field) {
		return isSetField(field);
	}

	public boolean isSetCashMargin() {
		return isSetField(544);
	}

	public void set(cl.bithaus.qfix.fields.ClearingFeeIndicator value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ClearingFeeIndicator get(cl.bithaus.qfix.fields.ClearingFeeIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ClearingFeeIndicator getClearingFeeIndicator() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ClearingFeeIndicator());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ClearingFeeIndicator field) {
		return isSetField(field);
	}

	public boolean isSetClearingFeeIndicator() {
		return isSetField(635);
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

	public void set(cl.bithaus.qfix.fields.SideComplianceID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SideComplianceID get(cl.bithaus.qfix.fields.SideComplianceID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SideComplianceID getSideComplianceID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SideComplianceID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SideComplianceID field) {
		return isSetField(field);
	}

	public boolean isSetSideComplianceID() {
		return isSetField(659);
	}

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

	public void set(cl.bithaus.qfix.fields.NoUnderlyings value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoUnderlyings get(cl.bithaus.qfix.fields.NoUnderlyings value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoUnderlyings getNoUnderlyings() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoUnderlyings());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoUnderlyings field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyings() {
		return isSetField(711);
	}

	public static class NoUnderlyings extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {311, 312, 309, 305, 457, 462, 463, 310, 763, 313, 542, 241, 242, 243, 244, 245, 246, 256, 595, 592, 593, 594, 247, 316, 941, 317, 436, 435, 308, 306, 362, 363, 307, 364, 365, 877, 878, 318, 879, 810, 882, 883, 884, 885, 886, 887, 0};

		public NoUnderlyings() {
			super(711, 311, ORDER);
		}
		
	public void set(cl.bithaus.qfix.msg.component.UnderlyingInstrument component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.UnderlyingInstrument get(cl.bithaus.qfix.msg.component.UnderlyingInstrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.UnderlyingInstrument getUnderlyingInstrument() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.UnderlyingInstrument());
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingSymbol value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingSymbol get(cl.bithaus.qfix.fields.UnderlyingSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingSymbol getUnderlyingSymbol() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingSymbol());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingSymbol field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbol() {
		return isSetField(311);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingSymbolSfx value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingSymbolSfx get(cl.bithaus.qfix.fields.UnderlyingSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingSymbolSfx getUnderlyingSymbolSfx() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingSymbolSfx());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbolSfx() {
		return isSetField(312);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingSecurityID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingSecurityID get(cl.bithaus.qfix.fields.UnderlyingSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingSecurityID getUnderlyingSecurityID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingSecurityID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityID() {
		return isSetField(309);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingSecurityIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingSecurityIDSource get(cl.bithaus.qfix.fields.UnderlyingSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingSecurityIDSource getUnderlyingSecurityIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingSecurityIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityIDSource() {
		return isSetField(305);
	}

	public void set(cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID get(cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID getNoUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingSecurityAltID() {
		return isSetField(457);
	}

	public static class NoUnderlyingSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {458, 459, 0};

		public NoUnderlyingSecurityAltID() {
			super(457, 458, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.UnderlyingSecurityAltID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingSecurityAltID get(cl.bithaus.qfix.fields.UnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingSecurityAltID getUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingSecurityAltID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltID() {
		return isSetField(458);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingSecurityAltIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingSecurityAltIDSource get(cl.bithaus.qfix.fields.UnderlyingSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingSecurityAltIDSource getUnderlyingSecurityAltIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingSecurityAltIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltIDSource() {
		return isSetField(459);
	}

	}

	public void set(cl.bithaus.qfix.fields.UnderlyingProduct value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingProduct get(cl.bithaus.qfix.fields.UnderlyingProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingProduct getUnderlyingProduct() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingProduct());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingProduct field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingProduct() {
		return isSetField(462);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingCFICode value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingCFICode get(cl.bithaus.qfix.fields.UnderlyingCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingCFICode getUnderlyingCFICode() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingCFICode());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingCFICode field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCFICode() {
		return isSetField(463);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingSecurityType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingSecurityType get(cl.bithaus.qfix.fields.UnderlyingSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingSecurityType getUnderlyingSecurityType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingSecurityType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityType() {
		return isSetField(310);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingSecuritySubType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingSecuritySubType get(cl.bithaus.qfix.fields.UnderlyingSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingSecuritySubType getUnderlyingSecuritySubType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingSecuritySubType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecuritySubType() {
		return isSetField(763);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingMaturityMonthYear value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingMaturityMonthYear get(cl.bithaus.qfix.fields.UnderlyingMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingMaturityMonthYear getUnderlyingMaturityMonthYear() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingMaturityMonthYear());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityMonthYear() {
		return isSetField(313);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingMaturityDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingMaturityDate get(cl.bithaus.qfix.fields.UnderlyingMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingMaturityDate getUnderlyingMaturityDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingMaturityDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityDate() {
		return isSetField(542);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingCouponPaymentDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingCouponPaymentDate get(cl.bithaus.qfix.fields.UnderlyingCouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingCouponPaymentDate getUnderlyingCouponPaymentDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingCouponPaymentDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingCouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCouponPaymentDate() {
		return isSetField(241);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingIssueDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingIssueDate get(cl.bithaus.qfix.fields.UnderlyingIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingIssueDate getUnderlyingIssueDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingIssueDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingIssueDate() {
		return isSetField(242);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingRepoCollateralSecurityType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingRepoCollateralSecurityType get(cl.bithaus.qfix.fields.UnderlyingRepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingRepoCollateralSecurityType getUnderlyingRepoCollateralSecurityType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingRepoCollateralSecurityType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingRepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepoCollateralSecurityType() {
		return isSetField(243);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingRepurchaseTerm value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingRepurchaseTerm get(cl.bithaus.qfix.fields.UnderlyingRepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingRepurchaseTerm getUnderlyingRepurchaseTerm() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingRepurchaseTerm());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingRepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepurchaseTerm() {
		return isSetField(244);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingRepurchaseRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingRepurchaseRate get(cl.bithaus.qfix.fields.UnderlyingRepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingRepurchaseRate getUnderlyingRepurchaseRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingRepurchaseRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingRepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepurchaseRate() {
		return isSetField(245);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingFactor value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingFactor get(cl.bithaus.qfix.fields.UnderlyingFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingFactor getUnderlyingFactor() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingFactor());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingFactor field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingFactor() {
		return isSetField(246);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingCreditRating value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingCreditRating get(cl.bithaus.qfix.fields.UnderlyingCreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingCreditRating getUnderlyingCreditRating() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingCreditRating());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingCreditRating field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCreditRating() {
		return isSetField(256);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingInstrRegistry value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingInstrRegistry get(cl.bithaus.qfix.fields.UnderlyingInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingInstrRegistry getUnderlyingInstrRegistry() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingInstrRegistry());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrRegistry() {
		return isSetField(595);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingCountryOfIssue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingCountryOfIssue get(cl.bithaus.qfix.fields.UnderlyingCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingCountryOfIssue getUnderlyingCountryOfIssue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingCountryOfIssue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCountryOfIssue() {
		return isSetField(592);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingStateOrProvinceOfIssue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingStateOrProvinceOfIssue get(cl.bithaus.qfix.fields.UnderlyingStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingStateOrProvinceOfIssue getUnderlyingStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingStateOrProvinceOfIssue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStateOrProvinceOfIssue() {
		return isSetField(593);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingLocaleOfIssue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingLocaleOfIssue get(cl.bithaus.qfix.fields.UnderlyingLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingLocaleOfIssue getUnderlyingLocaleOfIssue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingLocaleOfIssue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLocaleOfIssue() {
		return isSetField(594);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingRedemptionDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingRedemptionDate get(cl.bithaus.qfix.fields.UnderlyingRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingRedemptionDate getUnderlyingRedemptionDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingRedemptionDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRedemptionDate() {
		return isSetField(247);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingStrikePrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingStrikePrice get(cl.bithaus.qfix.fields.UnderlyingStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingStrikePrice getUnderlyingStrikePrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingStrikePrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikePrice() {
		return isSetField(316);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingStrikeCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingStrikeCurrency get(cl.bithaus.qfix.fields.UnderlyingStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingStrikeCurrency getUnderlyingStrikeCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingStrikeCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikeCurrency() {
		return isSetField(941);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingOptAttribute value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingOptAttribute get(cl.bithaus.qfix.fields.UnderlyingOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingOptAttribute getUnderlyingOptAttribute() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingOptAttribute());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingOptAttribute() {
		return isSetField(317);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingContractMultiplier value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingContractMultiplier get(cl.bithaus.qfix.fields.UnderlyingContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingContractMultiplier getUnderlyingContractMultiplier() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingContractMultiplier());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingContractMultiplier() {
		return isSetField(436);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingCouponRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingCouponRate get(cl.bithaus.qfix.fields.UnderlyingCouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingCouponRate getUnderlyingCouponRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingCouponRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingCouponRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCouponRate() {
		return isSetField(435);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingSecurityExchange value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingSecurityExchange get(cl.bithaus.qfix.fields.UnderlyingSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingSecurityExchange getUnderlyingSecurityExchange() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingSecurityExchange());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityExchange() {
		return isSetField(308);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingIssuer value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingIssuer get(cl.bithaus.qfix.fields.UnderlyingIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingIssuer getUnderlyingIssuer() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingIssuer());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingIssuer field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingIssuer() {
		return isSetField(306);
	}

	public void set(cl.bithaus.qfix.fields.EncodedUnderlyingIssuerLen value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedUnderlyingIssuerLen get(cl.bithaus.qfix.fields.EncodedUnderlyingIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedUnderlyingIssuerLen getEncodedUnderlyingIssuerLen() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedUnderlyingIssuerLen());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedUnderlyingIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingIssuerLen() {
		return isSetField(362);
	}

	public void set(cl.bithaus.qfix.fields.EncodedUnderlyingIssuer value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedUnderlyingIssuer get(cl.bithaus.qfix.fields.EncodedUnderlyingIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedUnderlyingIssuer getEncodedUnderlyingIssuer() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedUnderlyingIssuer());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedUnderlyingIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingIssuer() {
		return isSetField(363);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingSecurityDesc value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingSecurityDesc get(cl.bithaus.qfix.fields.UnderlyingSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingSecurityDesc getUnderlyingSecurityDesc() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingSecurityDesc());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityDesc() {
		return isSetField(307);
	}

	public void set(cl.bithaus.qfix.fields.EncodedUnderlyingSecurityDescLen value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedUnderlyingSecurityDescLen get(cl.bithaus.qfix.fields.EncodedUnderlyingSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedUnderlyingSecurityDescLen getEncodedUnderlyingSecurityDescLen() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedUnderlyingSecurityDescLen());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedUnderlyingSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingSecurityDescLen() {
		return isSetField(364);
	}

	public void set(cl.bithaus.qfix.fields.EncodedUnderlyingSecurityDesc value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedUnderlyingSecurityDesc get(cl.bithaus.qfix.fields.EncodedUnderlyingSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedUnderlyingSecurityDesc getEncodedUnderlyingSecurityDesc() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedUnderlyingSecurityDesc());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedUnderlyingSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingSecurityDesc() {
		return isSetField(365);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingCPProgram value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingCPProgram get(cl.bithaus.qfix.fields.UnderlyingCPProgram value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingCPProgram getUnderlyingCPProgram() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingCPProgram());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingCPProgram field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCPProgram() {
		return isSetField(877);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingCPRegType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingCPRegType get(cl.bithaus.qfix.fields.UnderlyingCPRegType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingCPRegType getUnderlyingCPRegType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingCPRegType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingCPRegType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCPRegType() {
		return isSetField(878);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingCurrency get(cl.bithaus.qfix.fields.UnderlyingCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingCurrency getUnderlyingCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrency() {
		return isSetField(318);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingQty get(cl.bithaus.qfix.fields.UnderlyingQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingQty getUnderlyingQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingQty field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingQty() {
		return isSetField(879);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingPx value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingPx get(cl.bithaus.qfix.fields.UnderlyingPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingPx getUnderlyingPx() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingPx());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingPx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPx() {
		return isSetField(810);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingDirtyPrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingDirtyPrice get(cl.bithaus.qfix.fields.UnderlyingDirtyPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingDirtyPrice getUnderlyingDirtyPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingDirtyPrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingDirtyPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingDirtyPrice() {
		return isSetField(882);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingEndPrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingEndPrice get(cl.bithaus.qfix.fields.UnderlyingEndPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingEndPrice getUnderlyingEndPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingEndPrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingEndPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingEndPrice() {
		return isSetField(883);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingStartValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingStartValue get(cl.bithaus.qfix.fields.UnderlyingStartValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingStartValue getUnderlyingStartValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingStartValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingStartValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStartValue() {
		return isSetField(884);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingCurrentValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingCurrentValue get(cl.bithaus.qfix.fields.UnderlyingCurrentValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingCurrentValue getUnderlyingCurrentValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingCurrentValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingCurrentValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrentValue() {
		return isSetField(885);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingEndValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingEndValue get(cl.bithaus.qfix.fields.UnderlyingEndValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingEndValue getUnderlyingEndValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingEndValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingEndValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingEndValue() {
		return isSetField(886);
	}

	public void set(cl.bithaus.qfix.msg.component.UnderlyingStipulations component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.UnderlyingStipulations get(cl.bithaus.qfix.msg.component.UnderlyingStipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.UnderlyingStipulations getUnderlyingStipulations() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.UnderlyingStipulations());
	}

	public void set(cl.bithaus.qfix.fields.NoUnderlyingStips value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoUnderlyingStips get(cl.bithaus.qfix.fields.NoUnderlyingStips value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoUnderlyingStips getNoUnderlyingStips() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoUnderlyingStips());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoUnderlyingStips field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingStips() {
		return isSetField(887);
	}

	public static class NoUnderlyingStips extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {888, 889, 0};

		public NoUnderlyingStips() {
			super(887, 888, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.UnderlyingStipType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingStipType get(cl.bithaus.qfix.fields.UnderlyingStipType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingStipType getUnderlyingStipType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingStipType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingStipType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStipType() {
		return isSetField(888);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingStipValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingStipValue get(cl.bithaus.qfix.fields.UnderlyingStipValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingStipValue getUnderlyingStipValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingStipValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingStipValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStipValue() {
		return isSetField(889);
	}

	}

	}

	public void set(cl.bithaus.qfix.fields.NoLegs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoLegs get(cl.bithaus.qfix.fields.NoLegs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoLegs getNoLegs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoLegs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoLegs field) {
		return isSetField(field);
	}

	public boolean isSetNoLegs() {
		return isSetField(555);
	}

	public static class NoLegs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {600, 601, 602, 603, 604, 607, 608, 609, 764, 610, 611, 248, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 556, 740, 739, 955, 956, 0};

		public NoLegs() {
			super(555, 600, ORDER);
		}
		
	public void set(cl.bithaus.qfix.msg.component.InstrumentLeg component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.InstrumentLeg get(cl.bithaus.qfix.msg.component.InstrumentLeg component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.InstrumentLeg getInstrumentLeg() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.InstrumentLeg());
	}

	public void set(cl.bithaus.qfix.fields.LegSymbol value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegSymbol get(cl.bithaus.qfix.fields.LegSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegSymbol getLegSymbol() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegSymbol());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegSymbol field) {
		return isSetField(field);
	}

	public boolean isSetLegSymbol() {
		return isSetField(600);
	}

	public void set(cl.bithaus.qfix.fields.LegSymbolSfx value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegSymbolSfx get(cl.bithaus.qfix.fields.LegSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegSymbolSfx getLegSymbolSfx() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegSymbolSfx());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetLegSymbolSfx() {
		return isSetField(601);
	}

	public void set(cl.bithaus.qfix.fields.LegSecurityID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegSecurityID get(cl.bithaus.qfix.fields.LegSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegSecurityID getLegSecurityID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegSecurityID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityID() {
		return isSetField(602);
	}

	public void set(cl.bithaus.qfix.fields.LegSecurityIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegSecurityIDSource get(cl.bithaus.qfix.fields.LegSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegSecurityIDSource getLegSecurityIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegSecurityIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityIDSource() {
		return isSetField(603);
	}

	public void set(cl.bithaus.qfix.fields.NoLegSecurityAltID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoLegSecurityAltID get(cl.bithaus.qfix.fields.NoLegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoLegSecurityAltID getNoLegSecurityAltID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoLegSecurityAltID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoLegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoLegSecurityAltID() {
		return isSetField(604);
	}

	public static class NoLegSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {605, 606, 0};

		public NoLegSecurityAltID() {
			super(604, 605, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.LegSecurityAltID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegSecurityAltID get(cl.bithaus.qfix.fields.LegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegSecurityAltID getLegSecurityAltID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegSecurityAltID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityAltID() {
		return isSetField(605);
	}

	public void set(cl.bithaus.qfix.fields.LegSecurityAltIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegSecurityAltIDSource get(cl.bithaus.qfix.fields.LegSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegSecurityAltIDSource getLegSecurityAltIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegSecurityAltIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityAltIDSource() {
		return isSetField(606);
	}

	}

	public void set(cl.bithaus.qfix.fields.LegProduct value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegProduct get(cl.bithaus.qfix.fields.LegProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegProduct getLegProduct() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegProduct());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegProduct field) {
		return isSetField(field);
	}

	public boolean isSetLegProduct() {
		return isSetField(607);
	}

	public void set(cl.bithaus.qfix.fields.LegCFICode value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegCFICode get(cl.bithaus.qfix.fields.LegCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegCFICode getLegCFICode() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegCFICode());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegCFICode field) {
		return isSetField(field);
	}

	public boolean isSetLegCFICode() {
		return isSetField(608);
	}

	public void set(cl.bithaus.qfix.fields.LegSecurityType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegSecurityType get(cl.bithaus.qfix.fields.LegSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegSecurityType getLegSecurityType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegSecurityType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityType() {
		return isSetField(609);
	}

	public void set(cl.bithaus.qfix.fields.LegSecuritySubType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegSecuritySubType get(cl.bithaus.qfix.fields.LegSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegSecuritySubType getLegSecuritySubType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegSecuritySubType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetLegSecuritySubType() {
		return isSetField(764);
	}

	public void set(cl.bithaus.qfix.fields.LegMaturityMonthYear value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegMaturityMonthYear get(cl.bithaus.qfix.fields.LegMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegMaturityMonthYear getLegMaturityMonthYear() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegMaturityMonthYear());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityMonthYear() {
		return isSetField(610);
	}

	public void set(cl.bithaus.qfix.fields.LegMaturityDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegMaturityDate get(cl.bithaus.qfix.fields.LegMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegMaturityDate getLegMaturityDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegMaturityDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityDate() {
		return isSetField(611);
	}

	public void set(cl.bithaus.qfix.fields.LegCouponPaymentDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegCouponPaymentDate get(cl.bithaus.qfix.fields.LegCouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegCouponPaymentDate getLegCouponPaymentDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegCouponPaymentDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegCouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetLegCouponPaymentDate() {
		return isSetField(248);
	}

	public void set(cl.bithaus.qfix.fields.LegIssueDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegIssueDate get(cl.bithaus.qfix.fields.LegIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegIssueDate getLegIssueDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegIssueDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetLegIssueDate() {
		return isSetField(249);
	}

	public void set(cl.bithaus.qfix.fields.LegRepoCollateralSecurityType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegRepoCollateralSecurityType get(cl.bithaus.qfix.fields.LegRepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegRepoCollateralSecurityType getLegRepoCollateralSecurityType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegRepoCollateralSecurityType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegRepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetLegRepoCollateralSecurityType() {
		return isSetField(250);
	}

	public void set(cl.bithaus.qfix.fields.LegRepurchaseTerm value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegRepurchaseTerm get(cl.bithaus.qfix.fields.LegRepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegRepurchaseTerm getLegRepurchaseTerm() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegRepurchaseTerm());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegRepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetLegRepurchaseTerm() {
		return isSetField(251);
	}

	public void set(cl.bithaus.qfix.fields.LegRepurchaseRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegRepurchaseRate get(cl.bithaus.qfix.fields.LegRepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegRepurchaseRate getLegRepurchaseRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegRepurchaseRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegRepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetLegRepurchaseRate() {
		return isSetField(252);
	}

	public void set(cl.bithaus.qfix.fields.LegFactor value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegFactor get(cl.bithaus.qfix.fields.LegFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegFactor getLegFactor() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegFactor());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegFactor field) {
		return isSetField(field);
	}

	public boolean isSetLegFactor() {
		return isSetField(253);
	}

	public void set(cl.bithaus.qfix.fields.LegCreditRating value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegCreditRating get(cl.bithaus.qfix.fields.LegCreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegCreditRating getLegCreditRating() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegCreditRating());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegCreditRating field) {
		return isSetField(field);
	}

	public boolean isSetLegCreditRating() {
		return isSetField(257);
	}

	public void set(cl.bithaus.qfix.fields.LegInstrRegistry value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegInstrRegistry get(cl.bithaus.qfix.fields.LegInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegInstrRegistry getLegInstrRegistry() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegInstrRegistry());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetLegInstrRegistry() {
		return isSetField(599);
	}

	public void set(cl.bithaus.qfix.fields.LegCountryOfIssue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegCountryOfIssue get(cl.bithaus.qfix.fields.LegCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegCountryOfIssue getLegCountryOfIssue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegCountryOfIssue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegCountryOfIssue() {
		return isSetField(596);
	}

	public void set(cl.bithaus.qfix.fields.LegStateOrProvinceOfIssue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegStateOrProvinceOfIssue get(cl.bithaus.qfix.fields.LegStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegStateOrProvinceOfIssue getLegStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegStateOrProvinceOfIssue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegStateOrProvinceOfIssue() {
		return isSetField(597);
	}

	public void set(cl.bithaus.qfix.fields.LegLocaleOfIssue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegLocaleOfIssue get(cl.bithaus.qfix.fields.LegLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegLocaleOfIssue getLegLocaleOfIssue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegLocaleOfIssue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegLocaleOfIssue() {
		return isSetField(598);
	}

	public void set(cl.bithaus.qfix.fields.LegRedemptionDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegRedemptionDate get(cl.bithaus.qfix.fields.LegRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegRedemptionDate getLegRedemptionDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegRedemptionDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetLegRedemptionDate() {
		return isSetField(254);
	}

	public void set(cl.bithaus.qfix.fields.LegStrikePrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegStrikePrice get(cl.bithaus.qfix.fields.LegStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegStrikePrice getLegStrikePrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegStrikePrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetLegStrikePrice() {
		return isSetField(612);
	}

	public void set(cl.bithaus.qfix.fields.LegStrikeCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegStrikeCurrency get(cl.bithaus.qfix.fields.LegStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegStrikeCurrency getLegStrikeCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegStrikeCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegStrikeCurrency() {
		return isSetField(942);
	}

	public void set(cl.bithaus.qfix.fields.LegOptAttribute value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegOptAttribute get(cl.bithaus.qfix.fields.LegOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegOptAttribute getLegOptAttribute() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegOptAttribute());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetLegOptAttribute() {
		return isSetField(613);
	}

	public void set(cl.bithaus.qfix.fields.LegContractMultiplier value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegContractMultiplier get(cl.bithaus.qfix.fields.LegContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegContractMultiplier getLegContractMultiplier() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegContractMultiplier());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetLegContractMultiplier() {
		return isSetField(614);
	}

	public void set(cl.bithaus.qfix.fields.LegCouponRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegCouponRate get(cl.bithaus.qfix.fields.LegCouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegCouponRate getLegCouponRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegCouponRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegCouponRate field) {
		return isSetField(field);
	}

	public boolean isSetLegCouponRate() {
		return isSetField(615);
	}

	public void set(cl.bithaus.qfix.fields.LegSecurityExchange value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegSecurityExchange get(cl.bithaus.qfix.fields.LegSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegSecurityExchange getLegSecurityExchange() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegSecurityExchange());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityExchange() {
		return isSetField(616);
	}

	public void set(cl.bithaus.qfix.fields.LegIssuer value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegIssuer get(cl.bithaus.qfix.fields.LegIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegIssuer getLegIssuer() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegIssuer());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegIssuer field) {
		return isSetField(field);
	}

	public boolean isSetLegIssuer() {
		return isSetField(617);
	}

	public void set(cl.bithaus.qfix.fields.EncodedLegIssuerLen value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedLegIssuerLen get(cl.bithaus.qfix.fields.EncodedLegIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedLegIssuerLen getEncodedLegIssuerLen() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedLegIssuerLen());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedLegIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegIssuerLen() {
		return isSetField(618);
	}

	public void set(cl.bithaus.qfix.fields.EncodedLegIssuer value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedLegIssuer get(cl.bithaus.qfix.fields.EncodedLegIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedLegIssuer getEncodedLegIssuer() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedLegIssuer());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedLegIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegIssuer() {
		return isSetField(619);
	}

	public void set(cl.bithaus.qfix.fields.LegSecurityDesc value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegSecurityDesc get(cl.bithaus.qfix.fields.LegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegSecurityDesc getLegSecurityDesc() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegSecurityDesc());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityDesc() {
		return isSetField(620);
	}

	public void set(cl.bithaus.qfix.fields.EncodedLegSecurityDescLen value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedLegSecurityDescLen get(cl.bithaus.qfix.fields.EncodedLegSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedLegSecurityDescLen getEncodedLegSecurityDescLen() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedLegSecurityDescLen());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedLegSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegSecurityDescLen() {
		return isSetField(621);
	}

	public void set(cl.bithaus.qfix.fields.EncodedLegSecurityDesc value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedLegSecurityDesc get(cl.bithaus.qfix.fields.EncodedLegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedLegSecurityDesc getEncodedLegSecurityDesc() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedLegSecurityDesc());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedLegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegSecurityDesc() {
		return isSetField(622);
	}

	public void set(cl.bithaus.qfix.fields.LegRatioQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegRatioQty get(cl.bithaus.qfix.fields.LegRatioQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegRatioQty getLegRatioQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegRatioQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegRatioQty field) {
		return isSetField(field);
	}

	public boolean isSetLegRatioQty() {
		return isSetField(623);
	}

	public void set(cl.bithaus.qfix.fields.LegSide value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegSide get(cl.bithaus.qfix.fields.LegSide value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegSide getLegSide() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegSide());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegSide field) {
		return isSetField(field);
	}

	public boolean isSetLegSide() {
		return isSetField(624);
	}

	public void set(cl.bithaus.qfix.fields.LegCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegCurrency get(cl.bithaus.qfix.fields.LegCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegCurrency getLegCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegCurrency() {
		return isSetField(556);
	}

	public void set(cl.bithaus.qfix.fields.LegPool value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegPool get(cl.bithaus.qfix.fields.LegPool value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegPool getLegPool() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegPool());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegPool field) {
		return isSetField(field);
	}

	public boolean isSetLegPool() {
		return isSetField(740);
	}

	public void set(cl.bithaus.qfix.fields.LegDatedDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegDatedDate get(cl.bithaus.qfix.fields.LegDatedDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegDatedDate getLegDatedDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegDatedDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegDatedDate field) {
		return isSetField(field);
	}

	public boolean isSetLegDatedDate() {
		return isSetField(739);
	}

	public void set(cl.bithaus.qfix.fields.LegContractSettlMonth value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegContractSettlMonth get(cl.bithaus.qfix.fields.LegContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegContractSettlMonth getLegContractSettlMonth() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegContractSettlMonth());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetLegContractSettlMonth() {
		return isSetField(955);
	}

	public void set(cl.bithaus.qfix.fields.LegInterestAccrualDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegInterestAccrualDate get(cl.bithaus.qfix.fields.LegInterestAccrualDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegInterestAccrualDate getLegInterestAccrualDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegInterestAccrualDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegInterestAccrualDate field) {
		return isSetField(field);
	}

	public boolean isSetLegInterestAccrualDate() {
		return isSetField(956);
	}

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

	public void set(cl.bithaus.qfix.fields.ProcessCode value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ProcessCode get(cl.bithaus.qfix.fields.ProcessCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ProcessCode getProcessCode() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ProcessCode());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ProcessCode field) {
		return isSetField(field);
	}

	public boolean isSetProcessCode() {
		return isSetField(81);
	}

	public void set(cl.bithaus.qfix.fields.PrevClosePx value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PrevClosePx get(cl.bithaus.qfix.fields.PrevClosePx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PrevClosePx getPrevClosePx() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PrevClosePx());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PrevClosePx field) {
		return isSetField(field);
	}

	public boolean isSetPrevClosePx() {
		return isSetField(140);
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

	public void set(cl.bithaus.qfix.msg.component.Stipulations component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.Stipulations get(cl.bithaus.qfix.msg.component.Stipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.Stipulations getStipulations() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.Stipulations());
	}

	public void set(cl.bithaus.qfix.fields.NoStipulations value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoStipulations get(cl.bithaus.qfix.fields.NoStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoStipulations getNoStipulations() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoStipulations());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoStipulations() {
		return isSetField(232);
	}

	public static class NoStipulations extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {233, 234, 0};

		public NoStipulations() {
			super(232, 233, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.StipulationType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StipulationType get(cl.bithaus.qfix.fields.StipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StipulationType getStipulationType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StipulationType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StipulationType field) {
		return isSetField(field);
	}

	public boolean isSetStipulationType() {
		return isSetField(233);
	}

	public void set(cl.bithaus.qfix.fields.StipulationValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StipulationValue get(cl.bithaus.qfix.fields.StipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StipulationValue getStipulationValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StipulationValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetStipulationValue() {
		return isSetField(234);
	}

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

	public void set(cl.bithaus.qfix.msg.component.SpreadOrBenchmarkCurveData component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.SpreadOrBenchmarkCurveData get(cl.bithaus.qfix.msg.component.SpreadOrBenchmarkCurveData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveData() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.SpreadOrBenchmarkCurveData());
	}

	public void set(cl.bithaus.qfix.fields.Spread value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Spread get(cl.bithaus.qfix.fields.Spread value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Spread getSpread() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Spread());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Spread field) {
		return isSetField(field);
	}

	public boolean isSetSpread() {
		return isSetField(218);
	}

	public void set(cl.bithaus.qfix.fields.BenchmarkCurveCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BenchmarkCurveCurrency get(cl.bithaus.qfix.fields.BenchmarkCurveCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BenchmarkCurveCurrency getBenchmarkCurveCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BenchmarkCurveCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BenchmarkCurveCurrency field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurveCurrency() {
		return isSetField(220);
	}

	public void set(cl.bithaus.qfix.fields.BenchmarkCurveName value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BenchmarkCurveName get(cl.bithaus.qfix.fields.BenchmarkCurveName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BenchmarkCurveName getBenchmarkCurveName() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BenchmarkCurveName());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BenchmarkCurveName field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurveName() {
		return isSetField(221);
	}

	public void set(cl.bithaus.qfix.fields.BenchmarkCurvePoint value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BenchmarkCurvePoint get(cl.bithaus.qfix.fields.BenchmarkCurvePoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BenchmarkCurvePoint getBenchmarkCurvePoint() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BenchmarkCurvePoint());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BenchmarkCurvePoint field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurvePoint() {
		return isSetField(222);
	}

	public void set(cl.bithaus.qfix.fields.BenchmarkPrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BenchmarkPrice get(cl.bithaus.qfix.fields.BenchmarkPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BenchmarkPrice getBenchmarkPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BenchmarkPrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BenchmarkPrice field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkPrice() {
		return isSetField(662);
	}

	public void set(cl.bithaus.qfix.fields.BenchmarkPriceType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BenchmarkPriceType get(cl.bithaus.qfix.fields.BenchmarkPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BenchmarkPriceType getBenchmarkPriceType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BenchmarkPriceType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BenchmarkPriceType field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkPriceType() {
		return isSetField(663);
	}

	public void set(cl.bithaus.qfix.fields.BenchmarkSecurityID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BenchmarkSecurityID get(cl.bithaus.qfix.fields.BenchmarkSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BenchmarkSecurityID getBenchmarkSecurityID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BenchmarkSecurityID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BenchmarkSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkSecurityID() {
		return isSetField(699);
	}

	public void set(cl.bithaus.qfix.fields.BenchmarkSecurityIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BenchmarkSecurityIDSource get(cl.bithaus.qfix.fields.BenchmarkSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BenchmarkSecurityIDSource getBenchmarkSecurityIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BenchmarkSecurityIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BenchmarkSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkSecurityIDSource() {
		return isSetField(761);
	}

	public void set(cl.bithaus.qfix.msg.component.YieldData component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.YieldData get(cl.bithaus.qfix.msg.component.YieldData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.YieldData getYieldData() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.YieldData());
	}

	public void set(cl.bithaus.qfix.fields.YieldType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.YieldType get(cl.bithaus.qfix.fields.YieldType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.YieldType getYieldType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.YieldType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.YieldType field) {
		return isSetField(field);
	}

	public boolean isSetYieldType() {
		return isSetField(235);
	}

	public void set(cl.bithaus.qfix.fields.Yield value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Yield get(cl.bithaus.qfix.fields.Yield value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Yield getYield() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Yield());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Yield field) {
		return isSetField(field);
	}

	public boolean isSetYield() {
		return isSetField(236);
	}

	public void set(cl.bithaus.qfix.fields.YieldCalcDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.YieldCalcDate get(cl.bithaus.qfix.fields.YieldCalcDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.YieldCalcDate getYieldCalcDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.YieldCalcDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.YieldCalcDate field) {
		return isSetField(field);
	}

	public boolean isSetYieldCalcDate() {
		return isSetField(701);
	}

	public void set(cl.bithaus.qfix.fields.YieldRedemptionDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.YieldRedemptionDate get(cl.bithaus.qfix.fields.YieldRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.YieldRedemptionDate getYieldRedemptionDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.YieldRedemptionDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.YieldRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionDate() {
		return isSetField(696);
	}

	public void set(cl.bithaus.qfix.fields.YieldRedemptionPrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.YieldRedemptionPrice get(cl.bithaus.qfix.fields.YieldRedemptionPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.YieldRedemptionPrice getYieldRedemptionPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.YieldRedemptionPrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.YieldRedemptionPrice field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionPrice() {
		return isSetField(697);
	}

	public void set(cl.bithaus.qfix.fields.YieldRedemptionPriceType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.YieldRedemptionPriceType get(cl.bithaus.qfix.fields.YieldRedemptionPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.YieldRedemptionPriceType getYieldRedemptionPriceType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.YieldRedemptionPriceType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.YieldRedemptionPriceType field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionPriceType() {
		return isSetField(698);
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

	public void set(cl.bithaus.qfix.fields.ComplianceID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ComplianceID get(cl.bithaus.qfix.fields.ComplianceID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ComplianceID getComplianceID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ComplianceID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ComplianceID field) {
		return isSetField(field);
	}

	public boolean isSetComplianceID() {
		return isSetField(376);
	}

	public void set(cl.bithaus.qfix.fields.IOIid value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IOIid get(cl.bithaus.qfix.fields.IOIid value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IOIid getIOIid() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IOIid());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IOIid field) {
		return isSetField(field);
	}

	public boolean isSetIOIid() {
		return isSetField(23);
	}

	public void set(cl.bithaus.qfix.fields.QuoteID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.QuoteID get(cl.bithaus.qfix.fields.QuoteID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.QuoteID getQuoteID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.QuoteID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.QuoteID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteID() {
		return isSetField(117);
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

	public void set(cl.bithaus.qfix.fields.ExpireDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ExpireDate get(cl.bithaus.qfix.fields.ExpireDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ExpireDate getExpireDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ExpireDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ExpireDate field) {
		return isSetField(field);
	}

	public boolean isSetExpireDate() {
		return isSetField(432);
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

	public void set(cl.bithaus.qfix.fields.GTBookingInst value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.GTBookingInst get(cl.bithaus.qfix.fields.GTBookingInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.GTBookingInst getGTBookingInst() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.GTBookingInst());
	}

	public boolean isSet(cl.bithaus.qfix.fields.GTBookingInst field) {
		return isSetField(field);
	}

	public boolean isSetGTBookingInst() {
		return isSetField(427);
	}

	public void set(cl.bithaus.qfix.fields.MaxShow value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MaxShow get(cl.bithaus.qfix.fields.MaxShow value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MaxShow getMaxShow() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MaxShow());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MaxShow field) {
		return isSetField(field);
	}

	public boolean isSetMaxShow() {
		return isSetField(210);
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

	public void set(cl.bithaus.qfix.fields.CancellationRights value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CancellationRights get(cl.bithaus.qfix.fields.CancellationRights value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CancellationRights getCancellationRights() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CancellationRights());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CancellationRights field) {
		return isSetField(field);
	}

	public boolean isSetCancellationRights() {
		return isSetField(480);
	}

	public void set(cl.bithaus.qfix.fields.MoneyLaunderingStatus value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MoneyLaunderingStatus get(cl.bithaus.qfix.fields.MoneyLaunderingStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MoneyLaunderingStatus getMoneyLaunderingStatus() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MoneyLaunderingStatus());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MoneyLaunderingStatus field) {
		return isSetField(field);
	}

	public boolean isSetMoneyLaunderingStatus() {
		return isSetField(481);
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

	public void set(cl.bithaus.qfix.fields.Designation value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Designation get(cl.bithaus.qfix.fields.Designation value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Designation getDesignation() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Designation());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Designation field) {
		return isSetField(field);
	}

	public boolean isSetDesignation() {
		return isSetField(494);
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

}
