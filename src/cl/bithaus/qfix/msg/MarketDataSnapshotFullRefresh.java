
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MarketDataSnapshotFullRefresh extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "W";
	

	public MarketDataSnapshotFullRefresh() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public void set(cl.bithaus.qfix.fields.MDReqID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDReqID get(cl.bithaus.qfix.fields.MDReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDReqID getMDReqID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDReqID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDReqID field) {
		return isSetField(field);
	}

	public boolean isSetMDReqID() {
		return isSetField(262);
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

	public void set(cl.bithaus.qfix.fields.FinancialStatus value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.FinancialStatus get(cl.bithaus.qfix.fields.FinancialStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.FinancialStatus getFinancialStatus() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.FinancialStatus());
	}

	public boolean isSet(cl.bithaus.qfix.fields.FinancialStatus field) {
		return isSetField(field);
	}

	public boolean isSetFinancialStatus() {
		return isSetField(291);
	}

	public void set(cl.bithaus.qfix.fields.CorporateAction value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CorporateAction get(cl.bithaus.qfix.fields.CorporateAction value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CorporateAction getCorporateAction() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CorporateAction());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CorporateAction field) {
		return isSetField(field);
	}

	public boolean isSetCorporateAction() {
		return isSetField(292);
	}

	public void set(cl.bithaus.qfix.fields.NetChgPrevDay value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NetChgPrevDay get(cl.bithaus.qfix.fields.NetChgPrevDay value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NetChgPrevDay getNetChgPrevDay() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NetChgPrevDay());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NetChgPrevDay field) {
		return isSetField(field);
	}

	public boolean isSetNetChgPrevDay() {
		return isSetField(451);
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

	public void set(cl.bithaus.qfix.fields.NoMDEntries value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoMDEntries get(cl.bithaus.qfix.fields.NoMDEntries value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoMDEntries getNoMDEntries() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoMDEntries());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoMDEntries field) {
		return isSetField(field);
	}

	public boolean isSetNoMDEntries() {
		return isSetField(268);
	}

	public static class NoMDEntries extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {269, 270, 15, 120, 271, 272, 273, 274, 275, 336, 625, 276, 277, 282, 283, 284, 286, 59, 432, 126, 110, 18, 287, 37, 198, 299, 288, 289, 346, 290, 546, 811, 58, 354, 355, 5463, 11, 278, 280, 453, 10124, 10125, 10127, 466, 10147, 10150, 10148, 10149, 10151, 10152, 10153, 10154, 10155, 10156, 10157, 552, 10167, 10163, 10159, 63, 10171, 10170, 10172, 10168, 10169, 10175, 106, 10173, 10212, 423, 54, 38, 192, 10210, 10211, 10217, 10218, 10219, 10220, 10221, 10222, 10223, 10216, 1020, 10231, 64, 10238, 10239, 10240, 10241, 10242, 10243, 10244, 0};

		public NoMDEntries() {
			super(268, 269, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.MDEntryType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDEntryType get(cl.bithaus.qfix.fields.MDEntryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDEntryType getMDEntryType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDEntryType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDEntryType field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryType() {
		return isSetField(269);
	}

	public void set(cl.bithaus.qfix.fields.MDEntryPx value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDEntryPx get(cl.bithaus.qfix.fields.MDEntryPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDEntryPx getMDEntryPx() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDEntryPx());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDEntryPx field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryPx() {
		return isSetField(270);
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

	public void set(cl.bithaus.qfix.fields.MDEntrySize value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDEntrySize get(cl.bithaus.qfix.fields.MDEntrySize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDEntrySize getMDEntrySize() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDEntrySize());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDEntrySize field) {
		return isSetField(field);
	}

	public boolean isSetMDEntrySize() {
		return isSetField(271);
	}

	public void set(cl.bithaus.qfix.fields.MDEntryDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDEntryDate get(cl.bithaus.qfix.fields.MDEntryDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDEntryDate getMDEntryDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDEntryDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDEntryDate field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryDate() {
		return isSetField(272);
	}

	public void set(cl.bithaus.qfix.fields.MDEntryTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDEntryTime get(cl.bithaus.qfix.fields.MDEntryTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDEntryTime getMDEntryTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDEntryTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDEntryTime field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryTime() {
		return isSetField(273);
	}

	public void set(cl.bithaus.qfix.fields.TickDirection value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TickDirection get(cl.bithaus.qfix.fields.TickDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TickDirection getTickDirection() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TickDirection());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TickDirection field) {
		return isSetField(field);
	}

	public boolean isSetTickDirection() {
		return isSetField(274);
	}

	public void set(cl.bithaus.qfix.fields.MDMkt value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDMkt get(cl.bithaus.qfix.fields.MDMkt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDMkt getMDMkt() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDMkt());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDMkt field) {
		return isSetField(field);
	}

	public boolean isSetMDMkt() {
		return isSetField(275);
	}

	public void set(cl.bithaus.qfix.fields.TradingSessionID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradingSessionID get(cl.bithaus.qfix.fields.TradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradingSessionID getTradingSessionID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradingSessionID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionID() {
		return isSetField(336);
	}

	public void set(cl.bithaus.qfix.fields.TradingSessionSubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradingSessionSubID get(cl.bithaus.qfix.fields.TradingSessionSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradingSessionSubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradingSessionSubID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionSubID() {
		return isSetField(625);
	}

	public void set(cl.bithaus.qfix.fields.QuoteCondition value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.QuoteCondition get(cl.bithaus.qfix.fields.QuoteCondition value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.QuoteCondition getQuoteCondition() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.QuoteCondition());
	}

	public boolean isSet(cl.bithaus.qfix.fields.QuoteCondition field) {
		return isSetField(field);
	}

	public boolean isSetQuoteCondition() {
		return isSetField(276);
	}

	public void set(cl.bithaus.qfix.fields.TradeCondition value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeCondition get(cl.bithaus.qfix.fields.TradeCondition value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeCondition getTradeCondition() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeCondition());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeCondition field) {
		return isSetField(field);
	}

	public boolean isSetTradeCondition() {
		return isSetField(277);
	}

	public void set(cl.bithaus.qfix.fields.MDEntryOriginator value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDEntryOriginator get(cl.bithaus.qfix.fields.MDEntryOriginator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDEntryOriginator getMDEntryOriginator() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDEntryOriginator());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDEntryOriginator field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryOriginator() {
		return isSetField(282);
	}

	public void set(cl.bithaus.qfix.fields.LocationID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LocationID get(cl.bithaus.qfix.fields.LocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LocationID getLocationID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LocationID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LocationID field) {
		return isSetField(field);
	}

	public boolean isSetLocationID() {
		return isSetField(283);
	}

	public void set(cl.bithaus.qfix.fields.DeskID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DeskID get(cl.bithaus.qfix.fields.DeskID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DeskID getDeskID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DeskID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DeskID field) {
		return isSetField(field);
	}

	public boolean isSetDeskID() {
		return isSetField(284);
	}

	public void set(cl.bithaus.qfix.fields.OpenCloseSettlFlag value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OpenCloseSettlFlag get(cl.bithaus.qfix.fields.OpenCloseSettlFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OpenCloseSettlFlag getOpenCloseSettlFlag() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OpenCloseSettlFlag());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OpenCloseSettlFlag field) {
		return isSetField(field);
	}

	public boolean isSetOpenCloseSettlFlag() {
		return isSetField(286);
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

	public void set(cl.bithaus.qfix.fields.SellerDays value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SellerDays get(cl.bithaus.qfix.fields.SellerDays value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SellerDays getSellerDays() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SellerDays());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SellerDays field) {
		return isSetField(field);
	}

	public boolean isSetSellerDays() {
		return isSetField(287);
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

	public void set(cl.bithaus.qfix.fields.QuoteEntryID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.QuoteEntryID get(cl.bithaus.qfix.fields.QuoteEntryID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.QuoteEntryID getQuoteEntryID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.QuoteEntryID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.QuoteEntryID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteEntryID() {
		return isSetField(299);
	}

	public void set(cl.bithaus.qfix.fields.MDEntryBuyer value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDEntryBuyer get(cl.bithaus.qfix.fields.MDEntryBuyer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDEntryBuyer getMDEntryBuyer() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDEntryBuyer());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDEntryBuyer field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryBuyer() {
		return isSetField(288);
	}

	public void set(cl.bithaus.qfix.fields.MDEntrySeller value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDEntrySeller get(cl.bithaus.qfix.fields.MDEntrySeller value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDEntrySeller getMDEntrySeller() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDEntrySeller());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDEntrySeller field) {
		return isSetField(field);
	}

	public boolean isSetMDEntrySeller() {
		return isSetField(289);
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

	public void set(cl.bithaus.qfix.fields.MDEntryPositionNo value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDEntryPositionNo get(cl.bithaus.qfix.fields.MDEntryPositionNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDEntryPositionNo getMDEntryPositionNo() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDEntryPositionNo());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDEntryPositionNo field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryPositionNo() {
		return isSetField(290);
	}

	public void set(cl.bithaus.qfix.fields.Scope value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Scope get(cl.bithaus.qfix.fields.Scope value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Scope getScope() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Scope());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Scope field) {
		return isSetField(field);
	}

	public boolean isSetScope() {
		return isSetField(546);
	}

	public void set(cl.bithaus.qfix.fields.PriceDelta value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PriceDelta get(cl.bithaus.qfix.fields.PriceDelta value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PriceDelta getPriceDelta() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PriceDelta());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PriceDelta field) {
		return isSetField(field);
	}

	public boolean isSetPriceDelta() {
		return isSetField(811);
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

	public void set(cl.bithaus.qfix.fields.TradeID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeID get(cl.bithaus.qfix.fields.TradeID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeID getTradeID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeID field) {
		return isSetField(field);
	}

	public boolean isSetTradeID() {
		return isSetField(5463);
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

	public void set(cl.bithaus.qfix.fields.MDEntryID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDEntryID get(cl.bithaus.qfix.fields.MDEntryID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDEntryID getMDEntryID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDEntryID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDEntryID field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryID() {
		return isSetField(278);
	}

	public void set(cl.bithaus.qfix.fields.MDEntryRefID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDEntryRefID get(cl.bithaus.qfix.fields.MDEntryRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDEntryRefID getMDEntryRefID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDEntryRefID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDEntryRefID field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryRefID() {
		return isSetField(280);
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

	public void set(cl.bithaus.qfix.fields.EntryStep value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EntryStep get(cl.bithaus.qfix.fields.EntryStep value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EntryStep getEntryStep() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EntryStep());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EntryStep field) {
		return isSetField(field);
	}

	public boolean isSetEntryStep() {
		return isSetField(10124);
	}

	public void set(cl.bithaus.qfix.fields.ClosingPrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ClosingPrice get(cl.bithaus.qfix.fields.ClosingPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ClosingPrice getClosingPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ClosingPrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ClosingPrice field) {
		return isSetField(field);
	}

	public boolean isSetClosingPrice() {
		return isSetField(10125);
	}

	public void set(cl.bithaus.qfix.fields.ShortSell value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ShortSell get(cl.bithaus.qfix.fields.ShortSell value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ShortSell getShortSell() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ShortSell());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ShortSell field) {
		return isSetField(field);
	}

	public boolean isSetShortSell() {
		return isSetField(10127);
	}

	public void set(cl.bithaus.qfix.fields.BookingRefID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BookingRefID get(cl.bithaus.qfix.fields.BookingRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BookingRefID getBookingRefID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BookingRefID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BookingRefID field) {
		return isSetField(field);
	}

	public boolean isSetBookingRefID() {
		return isSetField(466);
	}

	public void set(cl.bithaus.qfix.fields.PrePayment value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PrePayment get(cl.bithaus.qfix.fields.PrePayment value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PrePayment getPrePayment() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PrePayment());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PrePayment field) {
		return isSetField(field);
	}

	public boolean isSetPrePayment() {
		return isSetField(10147);
	}

	public void set(cl.bithaus.qfix.fields.PublicRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PublicRate get(cl.bithaus.qfix.fields.PublicRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PublicRate getPublicRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PublicRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PublicRate field) {
		return isSetField(field);
	}

	public boolean isSetPublicRate() {
		return isSetField(10150);
	}

	public void set(cl.bithaus.qfix.fields.MaxRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MaxRate get(cl.bithaus.qfix.fields.MaxRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MaxRate getMaxRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MaxRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MaxRate field) {
		return isSetField(field);
	}

	public boolean isSetMaxRate() {
		return isSetField(10148);
	}

	public void set(cl.bithaus.qfix.fields.OwnRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OwnRate get(cl.bithaus.qfix.fields.OwnRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OwnRate getOwnRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OwnRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OwnRate field) {
		return isSetField(field);
	}

	public boolean isSetOwnRate() {
		return isSetField(10149);
	}

	public void set(cl.bithaus.qfix.fields.BestStance value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BestStance get(cl.bithaus.qfix.fields.BestStance value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BestStance getBestStance() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BestStance());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BestStance field) {
		return isSetField(field);
	}

	public boolean isSetBestStance() {
		return isSetField(10151);
	}

	public void set(cl.bithaus.qfix.fields.Divisible value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Divisible get(cl.bithaus.qfix.fields.Divisible value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Divisible getDivisible() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Divisible());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Divisible field) {
		return isSetField(field);
	}

	public boolean isSetDivisible() {
		return isSetField(10152);
	}

	public void set(cl.bithaus.qfix.fields.Modified value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Modified get(cl.bithaus.qfix.fields.Modified value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Modified getModified() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Modified());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Modified field) {
		return isSetField(field);
	}

	public boolean isSetModified() {
		return isSetField(10153);
	}

	public void set(cl.bithaus.qfix.fields.ForwardPrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ForwardPrice get(cl.bithaus.qfix.fields.ForwardPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ForwardPrice getForwardPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ForwardPrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ForwardPrice field) {
		return isSetField(field);
	}

	public boolean isSetForwardPrice() {
		return isSetField(10154);
	}

	public void set(cl.bithaus.qfix.fields.IndexSocietyFactor value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IndexSocietyFactor get(cl.bithaus.qfix.fields.IndexSocietyFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IndexSocietyFactor getIndexSocietyFactor() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IndexSocietyFactor());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IndexSocietyFactor field) {
		return isSetField(field);
	}

	public boolean isSetIndexSocietyFactor() {
		return isSetField(10155);
	}

	public void set(cl.bithaus.qfix.fields.IndexWeight value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IndexWeight get(cl.bithaus.qfix.fields.IndexWeight value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IndexWeight getIndexWeight() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IndexWeight());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IndexWeight field) {
		return isSetField(field);
	}

	public boolean isSetIndexWeight() {
		return isSetField(10156);
	}

	public void set(cl.bithaus.qfix.fields.IndexNoFreeFloat value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.IndexNoFreeFloat get(cl.bithaus.qfix.fields.IndexNoFreeFloat value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.IndexNoFreeFloat getIndexNoFreeFloat() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.IndexNoFreeFloat());
	}

	public boolean isSet(cl.bithaus.qfix.fields.IndexNoFreeFloat field) {
		return isSetField(field);
	}

	public boolean isSetIndexNoFreeFloat() {
		return isSetField(10157);
	}

	public void set(cl.bithaus.qfix.msg.component.TradeParties component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.TradeParties get(cl.bithaus.qfix.msg.component.TradeParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.TradeParties getTradeParties() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.TradeParties());
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
		private static final int[] ORDER = {54, 10140, 10141, 10142, 10143, 0};

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

	public void set(cl.bithaus.qfix.fields.EnteringFirm value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EnteringFirm get(cl.bithaus.qfix.fields.EnteringFirm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EnteringFirm getEnteringFirm() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EnteringFirm());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EnteringFirm field) {
		return isSetField(field);
	}

	public boolean isSetEnteringFirm() {
		return isSetField(10140);
	}

	public void set(cl.bithaus.qfix.fields.ExecutingFirm value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ExecutingFirm get(cl.bithaus.qfix.fields.ExecutingFirm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ExecutingFirm getExecutingFirm() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ExecutingFirm());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ExecutingFirm field) {
		return isSetField(field);
	}

	public boolean isSetExecutingFirm() {
		return isSetField(10141);
	}

	public void set(cl.bithaus.qfix.fields.EnteringTrader value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EnteringTrader get(cl.bithaus.qfix.fields.EnteringTrader value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EnteringTrader getEnteringTrader() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EnteringTrader());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EnteringTrader field) {
		return isSetField(field);
	}

	public boolean isSetEnteringTrader() {
		return isSetField(10142);
	}

	public void set(cl.bithaus.qfix.fields.FundManager value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.FundManager get(cl.bithaus.qfix.fields.FundManager value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.FundManager getFundManager() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.FundManager());
	}

	public boolean isSet(cl.bithaus.qfix.fields.FundManager field) {
		return isSetField(field);
	}

	public boolean isSetFundManager() {
		return isSetField(10143);
	}

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

	public void set(cl.bithaus.qfix.fields.MDMaturity value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDMaturity get(cl.bithaus.qfix.fields.MDMaturity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDMaturity getMDMaturity() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDMaturity());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDMaturity field) {
		return isSetField(field);
	}

	public boolean isSetMDMaturity() {
		return isSetField(10163);
	}

	public void set(cl.bithaus.qfix.fields.MDAdjustmentCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDAdjustmentCurrency get(cl.bithaus.qfix.fields.MDAdjustmentCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDAdjustmentCurrency getMDAdjustmentCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDAdjustmentCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDAdjustmentCurrency field) {
		return isSetField(field);
	}

	public boolean isSetMDAdjustmentCurrency() {
		return isSetField(10159);
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

	public void set(cl.bithaus.qfix.fields.CoraMaturity value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CoraMaturity get(cl.bithaus.qfix.fields.CoraMaturity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CoraMaturity getCoraMaturity() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CoraMaturity());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CoraMaturity field) {
		return isSetField(field);
	}

	public boolean isSetCoraMaturity() {
		return isSetField(10171);
	}

	public void set(cl.bithaus.qfix.fields.Duration value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Duration get(cl.bithaus.qfix.fields.Duration value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Duration getDuration() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Duration());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Duration field) {
		return isSetField(field);
	}

	public boolean isSetDuration() {
		return isSetField(10170);
	}

	public void set(cl.bithaus.qfix.fields.Convexity value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Convexity get(cl.bithaus.qfix.fields.Convexity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Convexity getConvexity() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Convexity());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Convexity field) {
		return isSetField(field);
	}

	public boolean isSetConvexity() {
		return isSetField(10172);
	}

	public void set(cl.bithaus.qfix.fields.TIR value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TIR get(cl.bithaus.qfix.fields.TIR value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TIR getTIR() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TIR());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TIR field) {
		return isSetField(field);
	}

	public boolean isSetTIR() {
		return isSetField(10168);
	}

	public void set(cl.bithaus.qfix.fields.LocalCurrencyValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LocalCurrencyValue get(cl.bithaus.qfix.fields.LocalCurrencyValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LocalCurrencyValue getLocalCurrencyValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LocalCurrencyValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LocalCurrencyValue field) {
		return isSetField(field);
	}

	public boolean isSetLocalCurrencyValue() {
		return isSetField(10169);
	}

	public void set(cl.bithaus.qfix.fields.ValuedAmount value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ValuedAmount get(cl.bithaus.qfix.fields.ValuedAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ValuedAmount getValuedAmount() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ValuedAmount());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ValuedAmount field) {
		return isSetField(field);
	}

	public boolean isSetValuedAmount() {
		return isSetField(10175);
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

	public void set(cl.bithaus.qfix.fields.InvesmentAmount value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.InvesmentAmount get(cl.bithaus.qfix.fields.InvesmentAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.InvesmentAmount getInvesmentAmount() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.InvesmentAmount());
	}

	public boolean isSet(cl.bithaus.qfix.fields.InvesmentAmount field) {
		return isSetField(field);
	}

	public boolean isSetInvesmentAmount() {
		return isSetField(10173);
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

	public void set(cl.bithaus.qfix.fields.OwnDemand value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OwnDemand get(cl.bithaus.qfix.fields.OwnDemand value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OwnDemand getOwnDemand() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OwnDemand());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OwnDemand field) {
		return isSetField(field);
	}

	public boolean isSetOwnDemand() {
		return isSetField(10210);
	}

	public void set(cl.bithaus.qfix.fields.TotalDemand value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TotalDemand get(cl.bithaus.qfix.fields.TotalDemand value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TotalDemand getTotalDemand() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TotalDemand());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TotalDemand field) {
		return isSetField(field);
	}

	public boolean isSetTotalDemand() {
		return isSetField(10211);
	}

	public void set(cl.bithaus.qfix.fields.Aggressor value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Aggressor get(cl.bithaus.qfix.fields.Aggressor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Aggressor getAggressor() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Aggressor());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Aggressor field) {
		return isSetField(field);
	}

	public boolean isSetAggressor() {
		return isSetField(10217);
	}

	public void set(cl.bithaus.qfix.fields.OrderSubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrderSubID get(cl.bithaus.qfix.fields.OrderSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrderSubID getOrderSubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrderSubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrderSubID field) {
		return isSetField(field);
	}

	public boolean isSetOrderSubID() {
		return isSetField(10218);
	}

	public void set(cl.bithaus.qfix.fields.FractionID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.FractionID get(cl.bithaus.qfix.fields.FractionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.FractionID getFractionID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.FractionID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.FractionID field) {
		return isSetField(field);
	}

	public boolean isSetFractionID() {
		return isSetField(10219);
	}

	public void set(cl.bithaus.qfix.fields.NoFractions value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoFractions get(cl.bithaus.qfix.fields.NoFractions value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoFractions getNoFractions() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoFractions());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoFractions field) {
		return isSetField(field);
	}

	public boolean isSetNoFractions() {
		return isSetField(10220);
	}

	public void set(cl.bithaus.qfix.fields.NoAdjudicatedFractions value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoAdjudicatedFractions get(cl.bithaus.qfix.fields.NoAdjudicatedFractions value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoAdjudicatedFractions getNoAdjudicatedFractions() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoAdjudicatedFractions());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoAdjudicatedFractions field) {
		return isSetField(field);
	}

	public boolean isSetNoAdjudicatedFractions() {
		return isSetField(10221);
	}

	public void set(cl.bithaus.qfix.fields.HasPriority value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.HasPriority get(cl.bithaus.qfix.fields.HasPriority value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.HasPriority getHasPriority() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.HasPriority());
	}

	public boolean isSet(cl.bithaus.qfix.fields.HasPriority field) {
		return isSetField(field);
	}

	public boolean isSetHasPriority() {
		return isSetField(10222);
	}

	public void set(cl.bithaus.qfix.fields.HasBid value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.HasBid get(cl.bithaus.qfix.fields.HasBid value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.HasBid getHasBid() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.HasBid());
	}

	public boolean isSet(cl.bithaus.qfix.fields.HasBid field) {
		return isSetField(field);
	}

	public boolean isSetHasBid() {
		return isSetField(10223);
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

	public void set(cl.bithaus.qfix.fields.TradeVolume value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeVolume get(cl.bithaus.qfix.fields.TradeVolume value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeVolume getTradeVolume() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeVolume());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeVolume field) {
		return isSetField(field);
	}

	public boolean isSetTradeVolume() {
		return isSetField(1020);
	}

	public void set(cl.bithaus.qfix.msg.component.OIBBestPriceData component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.OIBBestPriceData get(cl.bithaus.qfix.msg.component.OIBBestPriceData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.OIBBestPriceData getOIBBestPriceData() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.OIBBestPriceData());
	}

	public void set(cl.bithaus.qfix.fields.NoOIBBestPrices value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoOIBBestPrices get(cl.bithaus.qfix.fields.NoOIBBestPrices value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoOIBBestPrices getNoOIBBestPrices() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoOIBBestPrices());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoOIBBestPrices field) {
		return isSetField(field);
	}

	public boolean isSetNoOIBBestPrices() {
		return isSetField(10231);
	}

	public static class NoOIBBestPrices extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {10232, 10233, 10234, 10235, 10236, 10237, 0};

		public NoOIBBestPrices() {
			super(10231, 10232, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.OIBBestPriceExchange value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OIBBestPriceExchange get(cl.bithaus.qfix.fields.OIBBestPriceExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OIBBestPriceExchange getOIBBestPriceExchange() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OIBBestPriceExchange());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OIBBestPriceExchange field) {
		return isSetField(field);
	}

	public boolean isSetOIBBestPriceExchange() {
		return isSetField(10232);
	}

	public void set(cl.bithaus.qfix.fields.OIBBestPriceTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OIBBestPriceTime get(cl.bithaus.qfix.fields.OIBBestPriceTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OIBBestPriceTime getOIBBestPriceTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OIBBestPriceTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OIBBestPriceTime field) {
		return isSetField(field);
	}

	public boolean isSetOIBBestPriceTime() {
		return isSetField(10233);
	}

	public void set(cl.bithaus.qfix.fields.OIBBestPriceBuyingQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OIBBestPriceBuyingQty get(cl.bithaus.qfix.fields.OIBBestPriceBuyingQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OIBBestPriceBuyingQty getOIBBestPriceBuyingQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OIBBestPriceBuyingQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OIBBestPriceBuyingQty field) {
		return isSetField(field);
	}

	public boolean isSetOIBBestPriceBuyingQty() {
		return isSetField(10234);
	}

	public void set(cl.bithaus.qfix.fields.OIBBestPriceBuyingPrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OIBBestPriceBuyingPrice get(cl.bithaus.qfix.fields.OIBBestPriceBuyingPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OIBBestPriceBuyingPrice getOIBBestPriceBuyingPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OIBBestPriceBuyingPrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OIBBestPriceBuyingPrice field) {
		return isSetField(field);
	}

	public boolean isSetOIBBestPriceBuyingPrice() {
		return isSetField(10235);
	}

	public void set(cl.bithaus.qfix.fields.OIBBestPriceSellingQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OIBBestPriceSellingQty get(cl.bithaus.qfix.fields.OIBBestPriceSellingQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OIBBestPriceSellingQty getOIBBestPriceSellingQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OIBBestPriceSellingQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OIBBestPriceSellingQty field) {
		return isSetField(field);
	}

	public boolean isSetOIBBestPriceSellingQty() {
		return isSetField(10236);
	}

	public void set(cl.bithaus.qfix.fields.OIBBestPriceSellingPrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OIBBestPriceSellingPrice get(cl.bithaus.qfix.fields.OIBBestPriceSellingPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OIBBestPriceSellingPrice getOIBBestPriceSellingPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OIBBestPriceSellingPrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OIBBestPriceSellingPrice field) {
		return isSetField(field);
	}

	public boolean isSetOIBBestPriceSellingPrice() {
		return isSetField(10237);
	}

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

	public void set(cl.bithaus.qfix.fields.MinRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MinRate get(cl.bithaus.qfix.fields.MinRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MinRate getMinRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MinRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MinRate field) {
		return isSetField(field);
	}

	public boolean isSetMinRate() {
		return isSetField(10238);
	}

	public void set(cl.bithaus.qfix.fields.Change value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Change get(cl.bithaus.qfix.fields.Change value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Change getChange() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Change());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Change field) {
		return isSetField(field);
	}

	public boolean isSetChange() {
		return isSetField(10239);
	}

	public void set(cl.bithaus.qfix.fields.ReturnLastSevenDays value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ReturnLastSevenDays get(cl.bithaus.qfix.fields.ReturnLastSevenDays value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ReturnLastSevenDays getReturnLastSevenDays() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ReturnLastSevenDays());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ReturnLastSevenDays field) {
		return isSetField(field);
	}

	public boolean isSetReturnLastSevenDays() {
		return isSetField(10240);
	}

	public void set(cl.bithaus.qfix.fields.ReturnLastThirtyDays value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ReturnLastThirtyDays get(cl.bithaus.qfix.fields.ReturnLastThirtyDays value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ReturnLastThirtyDays getReturnLastThirtyDays() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ReturnLastThirtyDays());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ReturnLastThirtyDays field) {
		return isSetField(field);
	}

	public boolean isSetReturnLastThirtyDays() {
		return isSetField(10241);
	}

	public void set(cl.bithaus.qfix.fields.ReturnLatsFiftyTwoWeeks value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ReturnLatsFiftyTwoWeeks get(cl.bithaus.qfix.fields.ReturnLatsFiftyTwoWeeks value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ReturnLatsFiftyTwoWeeks getReturnLatsFiftyTwoWeeks() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ReturnLatsFiftyTwoWeeks());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ReturnLatsFiftyTwoWeeks field) {
		return isSetField(field);
	}

	public boolean isSetReturnLatsFiftyTwoWeeks() {
		return isSetField(10242);
	}

	public void set(cl.bithaus.qfix.fields.MinRateLastFiftyTwoWeeks value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MinRateLastFiftyTwoWeeks get(cl.bithaus.qfix.fields.MinRateLastFiftyTwoWeeks value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MinRateLastFiftyTwoWeeks getMinRateLastFiftyTwoWeeks() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MinRateLastFiftyTwoWeeks());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MinRateLastFiftyTwoWeeks field) {
		return isSetField(field);
	}

	public boolean isSetMinRateLastFiftyTwoWeeks() {
		return isSetField(10243);
	}

	public void set(cl.bithaus.qfix.fields.MaxRateLastFiftyTwoWeeks value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MaxRateLastFiftyTwoWeeks get(cl.bithaus.qfix.fields.MaxRateLastFiftyTwoWeeks value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MaxRateLastFiftyTwoWeeks getMaxRateLastFiftyTwoWeeks() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MaxRateLastFiftyTwoWeeks());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MaxRateLastFiftyTwoWeeks field) {
		return isSetField(field);
	}

	public boolean isSetMaxRateLastFiftyTwoWeeks() {
		return isSetField(10244);
	}

	}

	public void set(cl.bithaus.qfix.fields.ApplQueueDepth value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ApplQueueDepth get(cl.bithaus.qfix.fields.ApplQueueDepth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ApplQueueDepth getApplQueueDepth() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ApplQueueDepth());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ApplQueueDepth field) {
		return isSetField(field);
	}

	public boolean isSetApplQueueDepth() {
		return isSetField(813);
	}

	public void set(cl.bithaus.qfix.fields.ApplQueueResolution value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ApplQueueResolution get(cl.bithaus.qfix.fields.ApplQueueResolution value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ApplQueueResolution getApplQueueResolution() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ApplQueueResolution());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ApplQueueResolution field) {
		return isSetField(field);
	}

	public boolean isSetApplQueueResolution() {
		return isSetField(814);
	}

}
