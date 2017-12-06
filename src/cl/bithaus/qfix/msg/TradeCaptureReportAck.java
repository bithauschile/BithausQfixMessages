
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TradeCaptureReportAck extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "AR";
	

	public TradeCaptureReportAck() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public TradeCaptureReportAck(cl.bithaus.qfix.fields.TradeReportID tradeReportID, cl.bithaus.qfix.fields.ExecType execType) {
		this();
		setField(tradeReportID);
		setField(execType);
	}
	
	public void set(cl.bithaus.qfix.fields.TradeReportID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeReportID get(cl.bithaus.qfix.fields.TradeReportID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeReportID getTradeReportID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeReportID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeReportID field) {
		return isSetField(field);
	}

	public boolean isSetTradeReportID() {
		return isSetField(571);
	}

	public void set(cl.bithaus.qfix.fields.TradeReportTransType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeReportTransType get(cl.bithaus.qfix.fields.TradeReportTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeReportTransType getTradeReportTransType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeReportTransType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeReportTransType field) {
		return isSetField(field);
	}

	public boolean isSetTradeReportTransType() {
		return isSetField(487);
	}

	public void set(cl.bithaus.qfix.fields.TradeReportType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeReportType get(cl.bithaus.qfix.fields.TradeReportType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeReportType getTradeReportType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeReportType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeReportType field) {
		return isSetField(field);
	}

	public boolean isSetTradeReportType() {
		return isSetField(856);
	}

	public void set(cl.bithaus.qfix.fields.TrdType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TrdType get(cl.bithaus.qfix.fields.TrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TrdType getTrdType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TrdType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TrdType field) {
		return isSetField(field);
	}

	public boolean isSetTrdType() {
		return isSetField(828);
	}

	public void set(cl.bithaus.qfix.fields.TrdSubType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TrdSubType get(cl.bithaus.qfix.fields.TrdSubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TrdSubType getTrdSubType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TrdSubType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TrdSubType field) {
		return isSetField(field);
	}

	public boolean isSetTrdSubType() {
		return isSetField(829);
	}

	public void set(cl.bithaus.qfix.fields.SecondaryTrdType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecondaryTrdType get(cl.bithaus.qfix.fields.SecondaryTrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecondaryTrdType getSecondaryTrdType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecondaryTrdType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecondaryTrdType field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryTrdType() {
		return isSetField(855);
	}

	public void set(cl.bithaus.qfix.fields.TransferReason value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TransferReason get(cl.bithaus.qfix.fields.TransferReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TransferReason getTransferReason() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TransferReason());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TransferReason field) {
		return isSetField(field);
	}

	public boolean isSetTransferReason() {
		return isSetField(830);
	}

	public void set(cl.bithaus.qfix.fields.ExecType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ExecType get(cl.bithaus.qfix.fields.ExecType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ExecType getExecType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ExecType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ExecType field) {
		return isSetField(field);
	}

	public boolean isSetExecType() {
		return isSetField(150);
	}

	public void set(cl.bithaus.qfix.fields.TradeReportRefID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeReportRefID get(cl.bithaus.qfix.fields.TradeReportRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeReportRefID getTradeReportRefID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeReportRefID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeReportRefID field) {
		return isSetField(field);
	}

	public boolean isSetTradeReportRefID() {
		return isSetField(572);
	}

	public void set(cl.bithaus.qfix.fields.SecondaryTradeReportRefID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecondaryTradeReportRefID get(cl.bithaus.qfix.fields.SecondaryTradeReportRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecondaryTradeReportRefID getSecondaryTradeReportRefID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecondaryTradeReportRefID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecondaryTradeReportRefID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryTradeReportRefID() {
		return isSetField(881);
	}

	public void set(cl.bithaus.qfix.fields.TrdRptStatus value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TrdRptStatus get(cl.bithaus.qfix.fields.TrdRptStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TrdRptStatus getTrdRptStatus() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TrdRptStatus());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TrdRptStatus field) {
		return isSetField(field);
	}

	public boolean isSetTrdRptStatus() {
		return isSetField(939);
	}

	public void set(cl.bithaus.qfix.fields.TradeReportRejectReason value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeReportRejectReason get(cl.bithaus.qfix.fields.TradeReportRejectReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeReportRejectReason getTradeReportRejectReason() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeReportRejectReason());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeReportRejectReason field) {
		return isSetField(field);
	}

	public boolean isSetTradeReportRejectReason() {
		return isSetField(751);
	}

	public void set(cl.bithaus.qfix.fields.SecondaryTradeReportID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecondaryTradeReportID get(cl.bithaus.qfix.fields.SecondaryTradeReportID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecondaryTradeReportID getSecondaryTradeReportID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecondaryTradeReportID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecondaryTradeReportID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryTradeReportID() {
		return isSetField(818);
	}

	public void set(cl.bithaus.qfix.fields.SubscriptionRequestType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SubscriptionRequestType get(cl.bithaus.qfix.fields.SubscriptionRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SubscriptionRequestType getSubscriptionRequestType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SubscriptionRequestType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SubscriptionRequestType field) {
		return isSetField(field);
	}

	public boolean isSetSubscriptionRequestType() {
		return isSetField(263);
	}

	public void set(cl.bithaus.qfix.fields.TradeLinkID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeLinkID get(cl.bithaus.qfix.fields.TradeLinkID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeLinkID getTradeLinkID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeLinkID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeLinkID field) {
		return isSetField(field);
	}

	public boolean isSetTradeLinkID() {
		return isSetField(820);
	}

	public void set(cl.bithaus.qfix.fields.TrdMatchID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TrdMatchID get(cl.bithaus.qfix.fields.TrdMatchID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TrdMatchID getTrdMatchID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TrdMatchID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TrdMatchID field) {
		return isSetField(field);
	}

	public boolean isSetTrdMatchID() {
		return isSetField(880);
	}

	public void set(cl.bithaus.qfix.fields.ExecID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ExecID get(cl.bithaus.qfix.fields.ExecID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ExecID getExecID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ExecID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ExecID field) {
		return isSetField(field);
	}

	public boolean isSetExecID() {
		return isSetField(17);
	}

	public void set(cl.bithaus.qfix.fields.SecondaryExecID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecondaryExecID get(cl.bithaus.qfix.fields.SecondaryExecID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecondaryExecID getSecondaryExecID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecondaryExecID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecondaryExecID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryExecID() {
		return isSetField(527);
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

	public void set(cl.bithaus.qfix.msg.component.TrdRegTimestamps component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.TrdRegTimestamps get(cl.bithaus.qfix.msg.component.TrdRegTimestamps component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.TrdRegTimestamps getTrdRegTimestamps() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.TrdRegTimestamps());
	}

	public void set(cl.bithaus.qfix.fields.NoTrdRegTimestamps value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoTrdRegTimestamps get(cl.bithaus.qfix.fields.NoTrdRegTimestamps value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoTrdRegTimestamps getNoTrdRegTimestamps() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoTrdRegTimestamps());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoTrdRegTimestamps field) {
		return isSetField(field);
	}

	public boolean isSetNoTrdRegTimestamps() {
		return isSetField(768);
	}

	public static class NoTrdRegTimestamps extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {769, 770, 771, 0};

		public NoTrdRegTimestamps() {
			super(768, 769, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.TrdRegTimestamp value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TrdRegTimestamp get(cl.bithaus.qfix.fields.TrdRegTimestamp value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TrdRegTimestamp getTrdRegTimestamp() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TrdRegTimestamp());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TrdRegTimestamp field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestamp() {
		return isSetField(769);
	}

	public void set(cl.bithaus.qfix.fields.TrdRegTimestampType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TrdRegTimestampType get(cl.bithaus.qfix.fields.TrdRegTimestampType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TrdRegTimestampType getTrdRegTimestampType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TrdRegTimestampType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TrdRegTimestampType field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestampType() {
		return isSetField(770);
	}

	public void set(cl.bithaus.qfix.fields.TrdRegTimestampOrigin value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TrdRegTimestampOrigin get(cl.bithaus.qfix.fields.TrdRegTimestampOrigin value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TrdRegTimestampOrigin getTrdRegTimestampOrigin() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TrdRegTimestampOrigin());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TrdRegTimestampOrigin field) {
		return isSetField(field);
	}

	public boolean isSetTrdRegTimestampOrigin() {
		return isSetField(771);
	}

	}

	public void set(cl.bithaus.qfix.fields.ResponseTransportType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ResponseTransportType get(cl.bithaus.qfix.fields.ResponseTransportType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ResponseTransportType getResponseTransportType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ResponseTransportType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ResponseTransportType field) {
		return isSetField(field);
	}

	public boolean isSetResponseTransportType() {
		return isSetField(725);
	}

	public void set(cl.bithaus.qfix.fields.ResponseDestination value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ResponseDestination get(cl.bithaus.qfix.fields.ResponseDestination value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ResponseDestination getResponseDestination() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ResponseDestination());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ResponseDestination field) {
		return isSetField(field);
	}

	public boolean isSetResponseDestination() {
		return isSetField(726);
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
		private static final int[] ORDER = {600, 601, 602, 603, 604, 607, 608, 609, 764, 610, 611, 248, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 556, 740, 739, 955, 956, 687, 690, 683, 564, 565, 539, 654, 566, 587, 588, 637, 10158, 0};

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

	public void set(cl.bithaus.qfix.fields.LegQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegQty get(cl.bithaus.qfix.fields.LegQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegQty getLegQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegQty field) {
		return isSetField(field);
	}

	public boolean isSetLegQty() {
		return isSetField(687);
	}

	public void set(cl.bithaus.qfix.fields.LegSwapType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegSwapType get(cl.bithaus.qfix.fields.LegSwapType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegSwapType getLegSwapType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegSwapType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegSwapType field) {
		return isSetField(field);
	}

	public boolean isSetLegSwapType() {
		return isSetField(690);
	}

	public void set(cl.bithaus.qfix.msg.component.LegStipulations component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.LegStipulations get(cl.bithaus.qfix.msg.component.LegStipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.LegStipulations getLegStipulations() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.LegStipulations());
	}

	public void set(cl.bithaus.qfix.fields.NoLegStipulations value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoLegStipulations get(cl.bithaus.qfix.fields.NoLegStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoLegStipulations getNoLegStipulations() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoLegStipulations());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoLegStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoLegStipulations() {
		return isSetField(683);
	}

	public static class NoLegStipulations extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {688, 689, 0};

		public NoLegStipulations() {
			super(683, 688, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.LegStipulationType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegStipulationType get(cl.bithaus.qfix.fields.LegStipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegStipulationType getLegStipulationType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegStipulationType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegStipulationType field) {
		return isSetField(field);
	}

	public boolean isSetLegStipulationType() {
		return isSetField(688);
	}

	public void set(cl.bithaus.qfix.fields.LegStipulationValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegStipulationValue get(cl.bithaus.qfix.fields.LegStipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegStipulationValue getLegStipulationValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegStipulationValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegStipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetLegStipulationValue() {
		return isSetField(689);
	}

	}

	public void set(cl.bithaus.qfix.fields.LegPositionEffect value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegPositionEffect get(cl.bithaus.qfix.fields.LegPositionEffect value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegPositionEffect getLegPositionEffect() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegPositionEffect());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegPositionEffect field) {
		return isSetField(field);
	}

	public boolean isSetLegPositionEffect() {
		return isSetField(564);
	}

	public void set(cl.bithaus.qfix.fields.LegCoveredOrUncovered value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegCoveredOrUncovered get(cl.bithaus.qfix.fields.LegCoveredOrUncovered value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegCoveredOrUncovered getLegCoveredOrUncovered() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegCoveredOrUncovered());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegCoveredOrUncovered field) {
		return isSetField(field);
	}

	public boolean isSetLegCoveredOrUncovered() {
		return isSetField(565);
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

	public void set(cl.bithaus.qfix.fields.LegRefID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegRefID get(cl.bithaus.qfix.fields.LegRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegRefID getLegRefID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegRefID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegRefID field) {
		return isSetField(field);
	}

	public boolean isSetLegRefID() {
		return isSetField(654);
	}

	public void set(cl.bithaus.qfix.fields.LegPrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegPrice get(cl.bithaus.qfix.fields.LegPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegPrice getLegPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegPrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegPrice field) {
		return isSetField(field);
	}

	public boolean isSetLegPrice() {
		return isSetField(566);
	}

	public void set(cl.bithaus.qfix.fields.LegSettlType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegSettlType get(cl.bithaus.qfix.fields.LegSettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegSettlType getLegSettlType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegSettlType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegSettlType field) {
		return isSetField(field);
	}

	public boolean isSetLegSettlType() {
		return isSetField(587);
	}

	public void set(cl.bithaus.qfix.fields.LegSettlDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegSettlDate get(cl.bithaus.qfix.fields.LegSettlDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegSettlDate getLegSettlDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegSettlDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegSettlDate field) {
		return isSetField(field);
	}

	public boolean isSetLegSettlDate() {
		return isSetField(588);
	}

	public void set(cl.bithaus.qfix.fields.LegLastPx value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegLastPx get(cl.bithaus.qfix.fields.LegLastPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegLastPx getLegLastPx() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegLastPx());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegLastPx field) {
		return isSetField(field);
	}

	public boolean isSetLegLastPx() {
		return isSetField(637);
	}

	public void set(cl.bithaus.qfix.fields.TargetLegRefId value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TargetLegRefId get(cl.bithaus.qfix.fields.TargetLegRefId value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TargetLegRefId getTargetLegRefId() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TargetLegRefId());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TargetLegRefId field) {
		return isSetField(field);
	}

	public boolean isSetTargetLegRefId() {
		return isSetField(10158);
	}

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
		private static final int[] ORDER = {79, 661, 736, 467, 756, 80, 0};

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

}
