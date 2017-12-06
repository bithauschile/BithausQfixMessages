
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;


public class OrderCancelReject extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "9";
	

	public OrderCancelReject() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public OrderCancelReject(cl.bithaus.qfix.fields.OrderID orderID, cl.bithaus.qfix.fields.ClOrdID clOrdID, cl.bithaus.qfix.fields.OrigClOrdID origClOrdID, cl.bithaus.qfix.fields.OrdStatus ordStatus, cl.bithaus.qfix.fields.CxlRejResponseTo cxlRejResponseTo) {
		this();
		setField(orderID);
		setField(clOrdID);
		setField(origClOrdID);
		setField(ordStatus);
		setField(cxlRejResponseTo);
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

	public void set(cl.bithaus.qfix.fields.CxlRejResponseTo value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CxlRejResponseTo get(cl.bithaus.qfix.fields.CxlRejResponseTo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CxlRejResponseTo getCxlRejResponseTo() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CxlRejResponseTo());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CxlRejResponseTo field) {
		return isSetField(field);
	}

	public boolean isSetCxlRejResponseTo() {
		return isSetField(434);
	}

	public void set(cl.bithaus.qfix.fields.CxlRejReason value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CxlRejReason get(cl.bithaus.qfix.fields.CxlRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CxlRejReason getCxlRejReason() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CxlRejReason());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CxlRejReason field) {
		return isSetField(field);
	}

	public boolean isSetCxlRejReason() {
		return isSetField(102);
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
