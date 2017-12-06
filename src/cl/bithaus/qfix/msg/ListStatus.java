
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class ListStatus extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "N";
	

	public ListStatus() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public ListStatus(cl.bithaus.qfix.fields.ListID listID, cl.bithaus.qfix.fields.ListStatusType listStatusType, cl.bithaus.qfix.fields.NoRpts noRpts, cl.bithaus.qfix.fields.ListOrderStatus listOrderStatus, cl.bithaus.qfix.fields.RptSeq rptSeq, cl.bithaus.qfix.fields.TotNoOrders totNoOrders) {
		this();
		setField(listID);
		setField(listStatusType);
		setField(noRpts);
		setField(listOrderStatus);
		setField(rptSeq);
		setField(totNoOrders);
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

	public void set(cl.bithaus.qfix.fields.ListStatusType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ListStatusType get(cl.bithaus.qfix.fields.ListStatusType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ListStatusType getListStatusType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ListStatusType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ListStatusType field) {
		return isSetField(field);
	}

	public boolean isSetListStatusType() {
		return isSetField(429);
	}

	public void set(cl.bithaus.qfix.fields.NoRpts value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoRpts get(cl.bithaus.qfix.fields.NoRpts value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoRpts getNoRpts() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoRpts());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoRpts field) {
		return isSetField(field);
	}

	public boolean isSetNoRpts() {
		return isSetField(82);
	}

	public void set(cl.bithaus.qfix.fields.ListOrderStatus value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ListOrderStatus get(cl.bithaus.qfix.fields.ListOrderStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ListOrderStatus getListOrderStatus() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ListOrderStatus());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ListOrderStatus field) {
		return isSetField(field);
	}

	public boolean isSetListOrderStatus() {
		return isSetField(431);
	}

	public void set(cl.bithaus.qfix.fields.RptSeq value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RptSeq get(cl.bithaus.qfix.fields.RptSeq value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RptSeq getRptSeq() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RptSeq());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RptSeq field) {
		return isSetField(field);
	}

	public boolean isSetRptSeq() {
		return isSetField(83);
	}

	public void set(cl.bithaus.qfix.fields.ListStatusText value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ListStatusText get(cl.bithaus.qfix.fields.ListStatusText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ListStatusText getListStatusText() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ListStatusText());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ListStatusText field) {
		return isSetField(field);
	}

	public boolean isSetListStatusText() {
		return isSetField(444);
	}

	public void set(cl.bithaus.qfix.fields.EncodedListStatusTextLen value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedListStatusTextLen get(cl.bithaus.qfix.fields.EncodedListStatusTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedListStatusTextLen getEncodedListStatusTextLen() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedListStatusTextLen());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedListStatusTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedListStatusTextLen() {
		return isSetField(445);
	}

	public void set(cl.bithaus.qfix.fields.EncodedListStatusText value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedListStatusText get(cl.bithaus.qfix.fields.EncodedListStatusText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedListStatusText getEncodedListStatusText() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedListStatusText());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedListStatusText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedListStatusText() {
		return isSetField(446);
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

	public void set(cl.bithaus.qfix.fields.TotNoOrders value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TotNoOrders get(cl.bithaus.qfix.fields.TotNoOrders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TotNoOrders getTotNoOrders() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TotNoOrders());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TotNoOrders field) {
		return isSetField(field);
	}

	public boolean isSetTotNoOrders() {
		return isSetField(68);
	}

	public void set(cl.bithaus.qfix.fields.LastFragment value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LastFragment get(cl.bithaus.qfix.fields.LastFragment value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LastFragment getLastFragment() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LastFragment());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LastFragment field) {
		return isSetField(field);
	}

	public boolean isSetLastFragment() {
		return isSetField(893);
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
		private static final int[] ORDER = {11, 526, 14, 39, 636, 151, 84, 6, 103, 58, 354, 355, 0};

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

	public void set(cl.bithaus.qfix.fields.CumQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CumQty get(cl.bithaus.qfix.fields.CumQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CumQty getCumQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CumQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CumQty field) {
		return isSetField(field);
	}

	public boolean isSetCumQty() {
		return isSetField(14);
	}

	public void set(cl.bithaus.qfix.fields.OrdStatus value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrdStatus get(cl.bithaus.qfix.fields.OrdStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrdStatus getOrdStatus() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrdStatus());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrdStatus field) {
		return isSetField(field);
	}

	public boolean isSetOrdStatus() {
		return isSetField(39);
	}

	public void set(cl.bithaus.qfix.fields.WorkingIndicator value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.WorkingIndicator get(cl.bithaus.qfix.fields.WorkingIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.WorkingIndicator getWorkingIndicator() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.WorkingIndicator());
	}

	public boolean isSet(cl.bithaus.qfix.fields.WorkingIndicator field) {
		return isSetField(field);
	}

	public boolean isSetWorkingIndicator() {
		return isSetField(636);
	}

	public void set(cl.bithaus.qfix.fields.LeavesQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LeavesQty get(cl.bithaus.qfix.fields.LeavesQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LeavesQty getLeavesQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LeavesQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LeavesQty field) {
		return isSetField(field);
	}

	public boolean isSetLeavesQty() {
		return isSetField(151);
	}

	public void set(cl.bithaus.qfix.fields.CxlQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CxlQty get(cl.bithaus.qfix.fields.CxlQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CxlQty getCxlQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CxlQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CxlQty field) {
		return isSetField(field);
	}

	public boolean isSetCxlQty() {
		return isSetField(84);
	}

	public void set(cl.bithaus.qfix.fields.AvgPx value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AvgPx get(cl.bithaus.qfix.fields.AvgPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AvgPx getAvgPx() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AvgPx());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AvgPx field) {
		return isSetField(field);
	}

	public boolean isSetAvgPx() {
		return isSetField(6);
	}

	public void set(cl.bithaus.qfix.fields.OrdRejReason value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrdRejReason get(cl.bithaus.qfix.fields.OrdRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrdRejReason getOrdRejReason() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrdRejReason());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrdRejReason field) {
		return isSetField(field);
	}

	public boolean isSetOrdRejReason() {
		return isSetField(103);
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

}
