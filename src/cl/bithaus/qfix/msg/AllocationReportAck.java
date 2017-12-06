
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class AllocationReportAck extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "AT";
	

	public AllocationReportAck() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public AllocationReportAck(cl.bithaus.qfix.fields.AllocReportID allocReportID, cl.bithaus.qfix.fields.AllocID allocID, cl.bithaus.qfix.fields.TransactTime transactTime, cl.bithaus.qfix.fields.AllocStatus allocStatus) {
		this();
		setField(allocReportID);
		setField(allocID);
		setField(transactTime);
		setField(allocStatus);
	}
	
	public void set(cl.bithaus.qfix.fields.AllocReportID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AllocReportID get(cl.bithaus.qfix.fields.AllocReportID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AllocReportID getAllocReportID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AllocReportID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AllocReportID field) {
		return isSetField(field);
	}

	public boolean isSetAllocReportID() {
		return isSetField(755);
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

	public void set(cl.bithaus.qfix.fields.AllocStatus value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AllocStatus get(cl.bithaus.qfix.fields.AllocStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AllocStatus getAllocStatus() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AllocStatus());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AllocStatus field) {
		return isSetField(field);
	}

	public boolean isSetAllocStatus() {
		return isSetField(87);
	}

	public void set(cl.bithaus.qfix.fields.AllocRejCode value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AllocRejCode get(cl.bithaus.qfix.fields.AllocRejCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AllocRejCode getAllocRejCode() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AllocRejCode());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AllocRejCode field) {
		return isSetField(field);
	}

	public boolean isSetAllocRejCode() {
		return isSetField(88);
	}

	public void set(cl.bithaus.qfix.fields.AllocReportType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AllocReportType get(cl.bithaus.qfix.fields.AllocReportType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AllocReportType getAllocReportType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AllocReportType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AllocReportType field) {
		return isSetField(field);
	}

	public boolean isSetAllocReportType() {
		return isSetField(794);
	}

	public void set(cl.bithaus.qfix.fields.AllocIntermedReqType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AllocIntermedReqType get(cl.bithaus.qfix.fields.AllocIntermedReqType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AllocIntermedReqType getAllocIntermedReqType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AllocIntermedReqType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AllocIntermedReqType field) {
		return isSetField(field);
	}

	public boolean isSetAllocIntermedReqType() {
		return isSetField(808);
	}

	public void set(cl.bithaus.qfix.fields.MatchStatus value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MatchStatus get(cl.bithaus.qfix.fields.MatchStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MatchStatus getMatchStatus() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MatchStatus());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MatchStatus field) {
		return isSetField(field);
	}

	public boolean isSetMatchStatus() {
		return isSetField(573);
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
		private static final int[] ORDER = {79, 661, 366, 467, 776, 161, 360, 361, 0};

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

	public void set(cl.bithaus.qfix.fields.AllocPrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AllocPrice get(cl.bithaus.qfix.fields.AllocPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AllocPrice getAllocPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AllocPrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AllocPrice field) {
		return isSetField(field);
	}

	public boolean isSetAllocPrice() {
		return isSetField(366);
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

	public void set(cl.bithaus.qfix.fields.IndividualAllocRejCode value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IndividualAllocRejCode get(cl.bithaus.qfix.fields.IndividualAllocRejCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IndividualAllocRejCode getIndividualAllocRejCode() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IndividualAllocRejCode());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IndividualAllocRejCode field) {
		return isSetField(field);
	}

	public boolean isSetIndividualAllocRejCode() {
		return isSetField(776);
	}

	public void set(cl.bithaus.qfix.fields.AllocText value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AllocText get(cl.bithaus.qfix.fields.AllocText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AllocText getAllocText() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AllocText());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AllocText field) {
		return isSetField(field);
	}

	public boolean isSetAllocText() {
		return isSetField(161);
	}

	public void set(cl.bithaus.qfix.fields.EncodedAllocTextLen value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedAllocTextLen get(cl.bithaus.qfix.fields.EncodedAllocTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedAllocTextLen getEncodedAllocTextLen() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedAllocTextLen());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedAllocTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedAllocTextLen() {
		return isSetField(360);
	}

	public void set(cl.bithaus.qfix.fields.EncodedAllocText value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EncodedAllocText get(cl.bithaus.qfix.fields.EncodedAllocText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EncodedAllocText getEncodedAllocText() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EncodedAllocText());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EncodedAllocText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedAllocText() {
		return isSetField(361);
	}

	}

}
