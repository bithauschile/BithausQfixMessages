
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class ConfirmationRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BH";
	

	public ConfirmationRequest() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public ConfirmationRequest(cl.bithaus.qfix.fields.ConfirmReqID confirmReqID, cl.bithaus.qfix.fields.ConfirmType confirmType, cl.bithaus.qfix.fields.TransactTime transactTime) {
		this();
		setField(confirmReqID);
		setField(confirmType);
		setField(transactTime);
	}
	
	public void set(cl.bithaus.qfix.fields.ConfirmReqID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ConfirmReqID get(cl.bithaus.qfix.fields.ConfirmReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ConfirmReqID getConfirmReqID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ConfirmReqID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ConfirmReqID field) {
		return isSetField(field);
	}

	public boolean isSetConfirmReqID() {
		return isSetField(859);
	}

	public void set(cl.bithaus.qfix.fields.ConfirmType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ConfirmType get(cl.bithaus.qfix.fields.ConfirmType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ConfirmType getConfirmType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ConfirmType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ConfirmType field) {
		return isSetField(field);
	}

	public boolean isSetConfirmType() {
		return isSetField(773);
	}

	public void set(cl.bithaus.qfix.fields.NoOrders value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoOrders get(cl.bithaus.qfix.fields.NoOrders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoOrders getNoOrders() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoOrders());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoOrders field) {
		return isSetField(field);
	}

	public boolean isSetNoOrders() {
		return isSetField(73);
	}

	public static class NoOrders extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {11, 37, 198, 526, 66, 756, 38, 799, 800, 0};

		public NoOrders() {
			super(73, 11, ORDER);
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

	public void set(cl.bithaus.qfix.fields.SecondaryOrderID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecondaryOrderID get(cl.bithaus.qfix.fields.SecondaryOrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecondaryOrderID getSecondaryOrderID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecondaryOrderID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecondaryOrderID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryOrderID() {
		return isSetField(198);
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

	public void set(cl.bithaus.qfix.msg.component.NestedParties2 component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.NestedParties2 get(cl.bithaus.qfix.msg.component.NestedParties2 component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.NestedParties2 getNestedParties2() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.NestedParties2());
	}

	public void set(cl.bithaus.qfix.fields.NoNested2PartyIDs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoNested2PartyIDs get(cl.bithaus.qfix.fields.NoNested2PartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoNested2PartyIDs getNoNested2PartyIDs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoNested2PartyIDs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoNested2PartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNested2PartyIDs() {
		return isSetField(756);
	}

	public static class NoNested2PartyIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {757, 758, 759, 806, 0};

		public NoNested2PartyIDs() {
			super(756, 757, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.Nested2PartyID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Nested2PartyID get(cl.bithaus.qfix.fields.Nested2PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Nested2PartyID getNested2PartyID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Nested2PartyID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Nested2PartyID field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyID() {
		return isSetField(757);
	}

	public void set(cl.bithaus.qfix.fields.Nested2PartyIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Nested2PartyIDSource get(cl.bithaus.qfix.fields.Nested2PartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Nested2PartyIDSource getNested2PartyIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Nested2PartyIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Nested2PartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyIDSource() {
		return isSetField(758);
	}

	public void set(cl.bithaus.qfix.fields.Nested2PartyRole value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Nested2PartyRole get(cl.bithaus.qfix.fields.Nested2PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Nested2PartyRole getNested2PartyRole() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Nested2PartyRole());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Nested2PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyRole() {
		return isSetField(759);
	}

	public void set(cl.bithaus.qfix.fields.NoNested2PartySubIDs value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoNested2PartySubIDs get(cl.bithaus.qfix.fields.NoNested2PartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoNested2PartySubIDs getNoNested2PartySubIDs() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoNested2PartySubIDs());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoNested2PartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNested2PartySubIDs() {
		return isSetField(806);
	}

	public static class NoNested2PartySubIDs extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {760, 807, 0};

		public NoNested2PartySubIDs() {
			super(806, 760, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.Nested2PartySubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Nested2PartySubID get(cl.bithaus.qfix.fields.Nested2PartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Nested2PartySubID getNested2PartySubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Nested2PartySubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Nested2PartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartySubID() {
		return isSetField(760);
	}

	public void set(cl.bithaus.qfix.fields.Nested2PartySubIDType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Nested2PartySubIDType get(cl.bithaus.qfix.fields.Nested2PartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Nested2PartySubIDType getNested2PartySubIDType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Nested2PartySubIDType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Nested2PartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartySubIDType() {
		return isSetField(807);
	}

	}

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

	public void set(cl.bithaus.qfix.fields.OrderAvgPx value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrderAvgPx get(cl.bithaus.qfix.fields.OrderAvgPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrderAvgPx getOrderAvgPx() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrderAvgPx());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrderAvgPx field) {
		return isSetField(field);
	}

	public boolean isSetOrderAvgPx() {
		return isSetField(799);
	}

	public void set(cl.bithaus.qfix.fields.OrderBookingQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrderBookingQty get(cl.bithaus.qfix.fields.OrderBookingQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrderBookingQty getOrderBookingQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrderBookingQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrderBookingQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderBookingQty() {
		return isSetField(800);
	}

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

	public void set(cl.bithaus.qfix.fields.SecondaryAllocID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecondaryAllocID get(cl.bithaus.qfix.fields.SecondaryAllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecondaryAllocID getSecondaryAllocID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecondaryAllocID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecondaryAllocID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryAllocID() {
		return isSetField(793);
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

	public void set(cl.bithaus.qfix.fields.AllocAccountType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AllocAccountType get(cl.bithaus.qfix.fields.AllocAccountType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AllocAccountType getAllocAccountType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AllocAccountType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AllocAccountType field) {
		return isSetField(field);
	}

	public boolean isSetAllocAccountType() {
		return isSetField(798);
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

}
