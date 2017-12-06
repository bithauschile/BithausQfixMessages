
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MarketDataIncrementalRefresh extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "X";
	

	public MarketDataIncrementalRefresh() {
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
		private static final int[] ORDER = {279, 285, 269, 278, 280, 55, 65, 48, 22, 454, 460, 461, 167, 762, 200, 541, 224, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 947, 206, 231, 223, 207, 106, 348, 349, 107, 350, 351, 691, 667, 875, 876, 864, 873, 874, 10160, 10161, 10162, 10225, 10224, 10165, 10166, 10174, 10176, 10228, 10229, 466, 291, 292, 270, 15, 120, 271, 272, 273, 274, 275, 336, 625, 276, 277, 282, 283, 284, 286, 59, 432, 126, 110, 18, 287, 37, 198, 299, 288, 289, 346, 290, 546, 811, 451, 58, 354, 355, 5463, 11, 453, 10124, 10125, 10127, 552, 10147, 10150, 10148, 10149, 10151, 10152, 10153, 10154, 10167, 10163, 10159, 63, 10171, 10170, 10172, 10168, 10169, 10175, 10173, 10212, 423, 54, 38, 192, 10210, 10211, 10217, 10218, 10219, 10220, 10221, 10222, 10223, 10216, 1020, 10231, 64, 10238, 10239, 10240, 10241, 10242, 10243, 10244, 0};

		public NoMDEntries() {
			super(268, 279, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.MDUpdateAction value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MDUpdateAction get(cl.bithaus.qfix.fields.MDUpdateAction value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MDUpdateAction getMDUpdateAction() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MDUpdateAction());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MDUpdateAction field) {
		return isSetField(field);
	}

	public boolean isSetMDUpdateAction() {
		return isSetField(279);
	}

	public void set(cl.bithaus.qfix.fields.DeleteReason value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DeleteReason get(cl.bithaus.qfix.fields.DeleteReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DeleteReason getDeleteReason() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DeleteReason());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DeleteReason field) {
		return isSetField(field);
	}

	public boolean isSetDeleteReason() {
		return isSetField(285);
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
