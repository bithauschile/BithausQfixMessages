
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class OrderStatusRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "H";
	

	public OrderStatusRequest() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public OrderStatusRequest(cl.bithaus.qfix.fields.ClOrdID clOrdID, cl.bithaus.qfix.fields.Side side) {
		this();
		setField(clOrdID);
		setField(side);
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

	public void set(cl.bithaus.qfix.fields.OrdStatusReqID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrdStatusReqID get(cl.bithaus.qfix.fields.OrdStatusReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrdStatusReqID getOrdStatusReqID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrdStatusReqID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrdStatusReqID field) {
		return isSetField(field);
	}

	public boolean isSetOrdStatusReqID() {
		return isSetField(790);
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

}
