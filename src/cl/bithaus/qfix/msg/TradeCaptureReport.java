
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TradeCaptureReport extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "AE";
	

	public TradeCaptureReport() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public TradeCaptureReport(cl.bithaus.qfix.fields.TradeReportID tradeReportID, cl.bithaus.qfix.fields.PreviouslyReported previouslyReported, cl.bithaus.qfix.fields.LastQty lastQty, cl.bithaus.qfix.fields.LastPx lastPx, cl.bithaus.qfix.fields.TradeDate tradeDate, cl.bithaus.qfix.fields.TransactTime transactTime) {
		this();
		setField(tradeReportID);
		setField(previouslyReported);
		setField(lastQty);
		setField(lastPx);
		setField(tradeDate);
		setField(transactTime);
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

	public void set(cl.bithaus.qfix.fields.TradeRequestID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeRequestID get(cl.bithaus.qfix.fields.TradeRequestID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeRequestID getTradeRequestID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeRequestID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeRequestID field) {
		return isSetField(field);
	}

	public boolean isSetTradeRequestID() {
		return isSetField(568);
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

	public void set(cl.bithaus.qfix.fields.TotNumTradeReports value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TotNumTradeReports get(cl.bithaus.qfix.fields.TotNumTradeReports value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TotNumTradeReports getTotNumTradeReports() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TotNumTradeReports());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TotNumTradeReports field) {
		return isSetField(field);
	}

	public boolean isSetTotNumTradeReports() {
		return isSetField(748);
	}

	public void set(cl.bithaus.qfix.fields.LastRptRequested value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LastRptRequested get(cl.bithaus.qfix.fields.LastRptRequested value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LastRptRequested getLastRptRequested() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LastRptRequested());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LastRptRequested field) {
		return isSetField(field);
	}

	public boolean isSetLastRptRequested() {
		return isSetField(912);
	}

	public void set(cl.bithaus.qfix.fields.UnsolicitedIndicator value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnsolicitedIndicator get(cl.bithaus.qfix.fields.UnsolicitedIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnsolicitedIndicator getUnsolicitedIndicator() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnsolicitedIndicator());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnsolicitedIndicator field) {
		return isSetField(field);
	}

	public boolean isSetUnsolicitedIndicator() {
		return isSetField(325);
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

	public void set(cl.bithaus.qfix.fields.ExecRestatementReason value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ExecRestatementReason get(cl.bithaus.qfix.fields.ExecRestatementReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ExecRestatementReason getExecRestatementReason() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ExecRestatementReason());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ExecRestatementReason field) {
		return isSetField(field);
	}

	public boolean isSetExecRestatementReason() {
		return isSetField(378);
	}

	public void set(cl.bithaus.qfix.fields.PreviouslyReported value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PreviouslyReported get(cl.bithaus.qfix.fields.PreviouslyReported value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PreviouslyReported getPreviouslyReported() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PreviouslyReported());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PreviouslyReported field) {
		return isSetField(field);
	}

	public boolean isSetPreviouslyReported() {
		return isSetField(570);
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

	public void set(cl.bithaus.qfix.fields.UnderlyingTradingSessionID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingTradingSessionID get(cl.bithaus.qfix.fields.UnderlyingTradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingTradingSessionID getUnderlyingTradingSessionID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingTradingSessionID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingTradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingTradingSessionID() {
		return isSetField(822);
	}

	public void set(cl.bithaus.qfix.fields.UnderlyingTradingSessionSubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.UnderlyingTradingSessionSubID get(cl.bithaus.qfix.fields.UnderlyingTradingSessionSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.UnderlyingTradingSessionSubID getUnderlyingTradingSessionSubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.UnderlyingTradingSessionSubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.UnderlyingTradingSessionSubID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingTradingSessionSubID() {
		return isSetField(823);
	}

	public void set(cl.bithaus.qfix.fields.LastQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LastQty get(cl.bithaus.qfix.fields.LastQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LastQty getLastQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LastQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LastQty field) {
		return isSetField(field);
	}

	public boolean isSetLastQty() {
		return isSetField(32);
	}

	public void set(cl.bithaus.qfix.fields.LastPx value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LastPx get(cl.bithaus.qfix.fields.LastPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LastPx getLastPx() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LastPx());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LastPx field) {
		return isSetField(field);
	}

	public boolean isSetLastPx() {
		return isSetField(31);
	}

	public void set(cl.bithaus.qfix.fields.LastParPx value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LastParPx get(cl.bithaus.qfix.fields.LastParPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LastParPx getLastParPx() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LastParPx());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LastParPx field) {
		return isSetField(field);
	}

	public boolean isSetLastParPx() {
		return isSetField(669);
	}

	public void set(cl.bithaus.qfix.fields.LastSpotRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LastSpotRate get(cl.bithaus.qfix.fields.LastSpotRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LastSpotRate getLastSpotRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LastSpotRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LastSpotRate field) {
		return isSetField(field);
	}

	public boolean isSetLastSpotRate() {
		return isSetField(194);
	}

	public void set(cl.bithaus.qfix.fields.LastForwardPoints value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LastForwardPoints get(cl.bithaus.qfix.fields.LastForwardPoints value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LastForwardPoints getLastForwardPoints() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LastForwardPoints());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LastForwardPoints field) {
		return isSetField(field);
	}

	public boolean isSetLastForwardPoints() {
		return isSetField(195);
	}

	public void set(cl.bithaus.qfix.fields.LastMkt value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LastMkt get(cl.bithaus.qfix.fields.LastMkt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LastMkt getLastMkt() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LastMkt());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LastMkt field) {
		return isSetField(field);
	}

	public boolean isSetLastMkt() {
		return isSetField(30);
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

	public void set(cl.bithaus.qfix.fields.ClearingBusinessDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ClearingBusinessDate get(cl.bithaus.qfix.fields.ClearingBusinessDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ClearingBusinessDate getClearingBusinessDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ClearingBusinessDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ClearingBusinessDate field) {
		return isSetField(field);
	}

	public boolean isSetClearingBusinessDate() {
		return isSetField(715);
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

	public void set(cl.bithaus.qfix.fields.AvgPxIndicator value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AvgPxIndicator get(cl.bithaus.qfix.fields.AvgPxIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AvgPxIndicator getAvgPxIndicator() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AvgPxIndicator());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AvgPxIndicator field) {
		return isSetField(field);
	}

	public boolean isSetAvgPxIndicator() {
		return isSetField(819);
	}

	public void set(cl.bithaus.qfix.msg.component.PositionAmountData component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.PositionAmountData get(cl.bithaus.qfix.msg.component.PositionAmountData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.PositionAmountData getPositionAmountData() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.PositionAmountData());
	}

	public void set(cl.bithaus.qfix.fields.NoPosAmt value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoPosAmt get(cl.bithaus.qfix.fields.NoPosAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoPosAmt getNoPosAmt() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoPosAmt());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoPosAmt field) {
		return isSetField(field);
	}

	public boolean isSetNoPosAmt() {
		return isSetField(753);
	}

	public static class NoPosAmt extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {707, 708, 0};

		public NoPosAmt() {
			super(753, 707, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.PosAmtType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PosAmtType get(cl.bithaus.qfix.fields.PosAmtType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PosAmtType getPosAmtType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PosAmtType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PosAmtType field) {
		return isSetField(field);
	}

	public boolean isSetPosAmtType() {
		return isSetField(707);
	}

	public void set(cl.bithaus.qfix.fields.PosAmt value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PosAmt get(cl.bithaus.qfix.fields.PosAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PosAmt getPosAmt() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PosAmt());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PosAmt field) {
		return isSetField(field);
	}

	public boolean isSetPosAmt() {
		return isSetField(708);
	}

	}

	public void set(cl.bithaus.qfix.fields.MultiLegReportingType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MultiLegReportingType get(cl.bithaus.qfix.fields.MultiLegReportingType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MultiLegReportingType getMultiLegReportingType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MultiLegReportingType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MultiLegReportingType field) {
		return isSetField(field);
	}

	public boolean isSetMultiLegReportingType() {
		return isSetField(442);
	}

	public void set(cl.bithaus.qfix.fields.TradeLegRefID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeLegRefID get(cl.bithaus.qfix.fields.TradeLegRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeLegRefID getTradeLegRefID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeLegRefID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeLegRefID field) {
		return isSetField(field);
	}

	public boolean isSetTradeLegRefID() {
		return isSetField(824);
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

	public void set(cl.bithaus.qfix.fields.MatchType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MatchType get(cl.bithaus.qfix.fields.MatchType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MatchType getMatchType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MatchType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MatchType field) {
		return isSetField(field);
	}

	public boolean isSetMatchType() {
		return isSetField(574);
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
		private static final int[] ORDER = {54, 37, 198, 11, 526, 66, 453, 1, 660, 581, 81, 575, 576, 635, 578, 579, 821, 15, 376, 377, 528, 529, 582, 40, 18, 483, 336, 625, 943, 12, 13, 479, 497, 381, 157, 230, 158, 159, 738, 920, 921, 922, 238, 237, 118, 119, 120, 155, 156, 77, 58, 354, 355, 752, 518, 232, 136, 825, 826, 591, 70, 78, 0};

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

	public void set(cl.bithaus.qfix.fields.OddLot value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OddLot get(cl.bithaus.qfix.fields.OddLot value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OddLot getOddLot() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OddLot());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OddLot field) {
		return isSetField(field);
	}

	public boolean isSetOddLot() {
		return isSetField(575);
	}

	public void set(cl.bithaus.qfix.fields.NoClearingInstructions value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoClearingInstructions get(cl.bithaus.qfix.fields.NoClearingInstructions value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoClearingInstructions getNoClearingInstructions() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoClearingInstructions());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoClearingInstructions field) {
		return isSetField(field);
	}

	public boolean isSetNoClearingInstructions() {
		return isSetField(576);
	}

	public static class NoClearingInstructions extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {577, 0};

		public NoClearingInstructions() {
			super(576, 577, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.ClearingInstruction value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ClearingInstruction get(cl.bithaus.qfix.fields.ClearingInstruction value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ClearingInstruction getClearingInstruction() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ClearingInstruction());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ClearingInstruction field) {
		return isSetField(field);
	}

	public boolean isSetClearingInstruction() {
		return isSetField(577);
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

	public void set(cl.bithaus.qfix.fields.TradeInputSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeInputSource get(cl.bithaus.qfix.fields.TradeInputSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeInputSource getTradeInputSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeInputSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeInputSource field) {
		return isSetField(field);
	}

	public boolean isSetTradeInputSource() {
		return isSetField(578);
	}

	public void set(cl.bithaus.qfix.fields.TradeInputDevice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeInputDevice get(cl.bithaus.qfix.fields.TradeInputDevice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeInputDevice getTradeInputDevice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeInputDevice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeInputDevice field) {
		return isSetField(field);
	}

	public boolean isSetTradeInputDevice() {
		return isSetField(579);
	}

	public void set(cl.bithaus.qfix.fields.OrderInputDevice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrderInputDevice get(cl.bithaus.qfix.fields.OrderInputDevice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrderInputDevice getOrderInputDevice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrderInputDevice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrderInputDevice field) {
		return isSetField(field);
	}

	public boolean isSetOrderInputDevice() {
		return isSetField(821);
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

	public void set(cl.bithaus.qfix.fields.TransBkdTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TransBkdTime get(cl.bithaus.qfix.fields.TransBkdTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TransBkdTime getTransBkdTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TransBkdTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TransBkdTime field) {
		return isSetField(field);
	}

	public boolean isSetTransBkdTime() {
		return isSetField(483);
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

	public void set(cl.bithaus.qfix.fields.TimeBracket value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TimeBracket get(cl.bithaus.qfix.fields.TimeBracket value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TimeBracket getTimeBracket() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TimeBracket());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TimeBracket field) {
		return isSetField(field);
	}

	public boolean isSetTimeBracket() {
		return isSetField(943);
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

	public void set(cl.bithaus.qfix.fields.GrossTradeAmt value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.GrossTradeAmt get(cl.bithaus.qfix.fields.GrossTradeAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.GrossTradeAmt getGrossTradeAmt() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.GrossTradeAmt());
	}

	public boolean isSet(cl.bithaus.qfix.fields.GrossTradeAmt field) {
		return isSetField(field);
	}

	public boolean isSetGrossTradeAmt() {
		return isSetField(381);
	}

	public void set(cl.bithaus.qfix.fields.NumDaysInterest value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NumDaysInterest get(cl.bithaus.qfix.fields.NumDaysInterest value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NumDaysInterest getNumDaysInterest() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NumDaysInterest());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NumDaysInterest field) {
		return isSetField(field);
	}

	public boolean isSetNumDaysInterest() {
		return isSetField(157);
	}

	public void set(cl.bithaus.qfix.fields.ExDate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ExDate get(cl.bithaus.qfix.fields.ExDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ExDate getExDate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ExDate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ExDate field) {
		return isSetField(field);
	}

	public boolean isSetExDate() {
		return isSetField(230);
	}

	public void set(cl.bithaus.qfix.fields.AccruedInterestRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AccruedInterestRate get(cl.bithaus.qfix.fields.AccruedInterestRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AccruedInterestRate getAccruedInterestRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AccruedInterestRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AccruedInterestRate field) {
		return isSetField(field);
	}

	public boolean isSetAccruedInterestRate() {
		return isSetField(158);
	}

	public void set(cl.bithaus.qfix.fields.AccruedInterestAmt value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.AccruedInterestAmt get(cl.bithaus.qfix.fields.AccruedInterestAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.AccruedInterestAmt getAccruedInterestAmt() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.AccruedInterestAmt());
	}

	public boolean isSet(cl.bithaus.qfix.fields.AccruedInterestAmt field) {
		return isSetField(field);
	}

	public boolean isSetAccruedInterestAmt() {
		return isSetField(159);
	}

	public void set(cl.bithaus.qfix.fields.InterestAtMaturity value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.InterestAtMaturity get(cl.bithaus.qfix.fields.InterestAtMaturity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.InterestAtMaturity getInterestAtMaturity() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.InterestAtMaturity());
	}

	public boolean isSet(cl.bithaus.qfix.fields.InterestAtMaturity field) {
		return isSetField(field);
	}

	public boolean isSetInterestAtMaturity() {
		return isSetField(738);
	}

	public void set(cl.bithaus.qfix.fields.EndAccruedInterestAmt value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EndAccruedInterestAmt get(cl.bithaus.qfix.fields.EndAccruedInterestAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EndAccruedInterestAmt getEndAccruedInterestAmt() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EndAccruedInterestAmt());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EndAccruedInterestAmt field) {
		return isSetField(field);
	}

	public boolean isSetEndAccruedInterestAmt() {
		return isSetField(920);
	}

	public void set(cl.bithaus.qfix.fields.StartCash value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StartCash get(cl.bithaus.qfix.fields.StartCash value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StartCash getStartCash() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StartCash());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StartCash field) {
		return isSetField(field);
	}

	public boolean isSetStartCash() {
		return isSetField(921);
	}

	public void set(cl.bithaus.qfix.fields.EndCash value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.EndCash get(cl.bithaus.qfix.fields.EndCash value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.EndCash getEndCash() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.EndCash());
	}

	public boolean isSet(cl.bithaus.qfix.fields.EndCash field) {
		return isSetField(field);
	}

	public boolean isSetEndCash() {
		return isSetField(922);
	}

	public void set(cl.bithaus.qfix.fields.Concession value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Concession get(cl.bithaus.qfix.fields.Concession value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Concession getConcession() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Concession());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Concession field) {
		return isSetField(field);
	}

	public boolean isSetConcession() {
		return isSetField(238);
	}

	public void set(cl.bithaus.qfix.fields.TotalTakedown value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TotalTakedown get(cl.bithaus.qfix.fields.TotalTakedown value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TotalTakedown getTotalTakedown() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TotalTakedown());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TotalTakedown field) {
		return isSetField(field);
	}

	public boolean isSetTotalTakedown() {
		return isSetField(237);
	}

	public void set(cl.bithaus.qfix.fields.NetMoney value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NetMoney get(cl.bithaus.qfix.fields.NetMoney value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NetMoney getNetMoney() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NetMoney());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NetMoney field) {
		return isSetField(field);
	}

	public boolean isSetNetMoney() {
		return isSetField(118);
	}

	public void set(cl.bithaus.qfix.fields.SettlCurrAmt value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlCurrAmt get(cl.bithaus.qfix.fields.SettlCurrAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlCurrAmt getSettlCurrAmt() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlCurrAmt());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlCurrAmt field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrAmt() {
		return isSetField(119);
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

	public void set(cl.bithaus.qfix.fields.SettlCurrFxRate value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlCurrFxRate get(cl.bithaus.qfix.fields.SettlCurrFxRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlCurrFxRate getSettlCurrFxRate() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlCurrFxRate());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlCurrFxRate field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrFxRate() {
		return isSetField(155);
	}

	public void set(cl.bithaus.qfix.fields.SettlCurrFxRateCalc value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SettlCurrFxRateCalc get(cl.bithaus.qfix.fields.SettlCurrFxRateCalc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SettlCurrFxRateCalc getSettlCurrFxRateCalc() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SettlCurrFxRateCalc());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SettlCurrFxRateCalc field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrFxRateCalc() {
		return isSetField(156);
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

	public void set(cl.bithaus.qfix.fields.SideMultiLegReportingType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SideMultiLegReportingType get(cl.bithaus.qfix.fields.SideMultiLegReportingType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SideMultiLegReportingType getSideMultiLegReportingType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SideMultiLegReportingType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SideMultiLegReportingType field) {
		return isSetField(field);
	}

	public boolean isSetSideMultiLegReportingType() {
		return isSetField(752);
	}

	public void set(cl.bithaus.qfix.fields.NoContAmts value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoContAmts get(cl.bithaus.qfix.fields.NoContAmts value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoContAmts getNoContAmts() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoContAmts());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoContAmts field) {
		return isSetField(field);
	}

	public boolean isSetNoContAmts() {
		return isSetField(518);
	}

	public static class NoContAmts extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {519, 520, 521, 0};

		public NoContAmts() {
			super(518, 519, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.ContAmtType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ContAmtType get(cl.bithaus.qfix.fields.ContAmtType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ContAmtType getContAmtType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ContAmtType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ContAmtType field) {
		return isSetField(field);
	}

	public boolean isSetContAmtType() {
		return isSetField(519);
	}

	public void set(cl.bithaus.qfix.fields.ContAmtValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ContAmtValue get(cl.bithaus.qfix.fields.ContAmtValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ContAmtValue getContAmtValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ContAmtValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ContAmtValue field) {
		return isSetField(field);
	}

	public boolean isSetContAmtValue() {
		return isSetField(520);
	}

	public void set(cl.bithaus.qfix.fields.ContAmtCurr value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ContAmtCurr get(cl.bithaus.qfix.fields.ContAmtCurr value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ContAmtCurr getContAmtCurr() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ContAmtCurr());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ContAmtCurr field) {
		return isSetField(field);
	}

	public boolean isSetContAmtCurr() {
		return isSetField(521);
	}

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

	public void set(cl.bithaus.qfix.fields.NoMiscFees value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoMiscFees get(cl.bithaus.qfix.fields.NoMiscFees value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoMiscFees getNoMiscFees() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoMiscFees());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoMiscFees field) {
		return isSetField(field);
	}

	public boolean isSetNoMiscFees() {
		return isSetField(136);
	}

	public static class NoMiscFees extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {137, 138, 139, 891, 0};

		public NoMiscFees() {
			super(136, 137, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.MiscFeeAmt value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MiscFeeAmt get(cl.bithaus.qfix.fields.MiscFeeAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MiscFeeAmt getMiscFeeAmt() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MiscFeeAmt());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MiscFeeAmt field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeAmt() {
		return isSetField(137);
	}

	public void set(cl.bithaus.qfix.fields.MiscFeeCurr value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MiscFeeCurr get(cl.bithaus.qfix.fields.MiscFeeCurr value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MiscFeeCurr getMiscFeeCurr() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MiscFeeCurr());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MiscFeeCurr field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeCurr() {
		return isSetField(138);
	}

	public void set(cl.bithaus.qfix.fields.MiscFeeType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MiscFeeType get(cl.bithaus.qfix.fields.MiscFeeType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MiscFeeType getMiscFeeType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MiscFeeType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MiscFeeType field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeType() {
		return isSetField(139);
	}

	public void set(cl.bithaus.qfix.fields.MiscFeeBasis value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MiscFeeBasis get(cl.bithaus.qfix.fields.MiscFeeBasis value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MiscFeeBasis getMiscFeeBasis() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MiscFeeBasis());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MiscFeeBasis field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeBasis() {
		return isSetField(891);
	}

	}

	public void set(cl.bithaus.qfix.fields.ExchangeRule value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ExchangeRule get(cl.bithaus.qfix.fields.ExchangeRule value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ExchangeRule getExchangeRule() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ExchangeRule());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ExchangeRule field) {
		return isSetField(field);
	}

	public boolean isSetExchangeRule() {
		return isSetField(825);
	}

	public void set(cl.bithaus.qfix.fields.TradeAllocIndicator value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TradeAllocIndicator get(cl.bithaus.qfix.fields.TradeAllocIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TradeAllocIndicator getTradeAllocIndicator() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TradeAllocIndicator());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TradeAllocIndicator field) {
		return isSetField(field);
	}

	public boolean isSetTradeAllocIndicator() {
		return isSetField(826);
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

	public void set(cl.bithaus.qfix.fields.CopyMsgIndicator value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CopyMsgIndicator get(cl.bithaus.qfix.fields.CopyMsgIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CopyMsgIndicator getCopyMsgIndicator() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CopyMsgIndicator());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CopyMsgIndicator field) {
		return isSetField(field);
	}

	public boolean isSetCopyMsgIndicator() {
		return isSetField(797);
	}

	public void set(cl.bithaus.qfix.fields.PublishTrdIndicator value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PublishTrdIndicator get(cl.bithaus.qfix.fields.PublishTrdIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PublishTrdIndicator getPublishTrdIndicator() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PublishTrdIndicator());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PublishTrdIndicator field) {
		return isSetField(field);
	}

	public boolean isSetPublishTrdIndicator() {
		return isSetField(852);
	}

	public void set(cl.bithaus.qfix.fields.ShortSaleReason value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ShortSaleReason get(cl.bithaus.qfix.fields.ShortSaleReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ShortSaleReason getShortSaleReason() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ShortSaleReason());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ShortSaleReason field) {
		return isSetField(field);
	}

	public boolean isSetShortSaleReason() {
		return isSetField(853);
	}

}
