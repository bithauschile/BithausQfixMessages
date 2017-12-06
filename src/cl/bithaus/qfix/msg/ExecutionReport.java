
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class ExecutionReport extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "8";
	

	public ExecutionReport() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public ExecutionReport(cl.bithaus.qfix.fields.OrderID orderID, cl.bithaus.qfix.fields.ExecID execID, cl.bithaus.qfix.fields.ExecType execType, cl.bithaus.qfix.fields.OrdStatus ordStatus, cl.bithaus.qfix.fields.Side side, cl.bithaus.qfix.fields.LeavesQty leavesQty, cl.bithaus.qfix.fields.CumQty cumQty, cl.bithaus.qfix.fields.AvgPx avgPx) {
		this();
		setField(orderID);
		setField(execID);
		setField(execType);
		setField(ordStatus);
		setField(side);
		setField(leavesQty);
		setField(cumQty);
		setField(avgPx);
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

	public void set(cl.bithaus.qfix.fields.QuoteRespID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.QuoteRespID get(cl.bithaus.qfix.fields.QuoteRespID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.QuoteRespID getQuoteRespID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.QuoteRespID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.QuoteRespID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteRespID() {
		return isSetField(693);
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

	public void set(cl.bithaus.qfix.fields.MassStatusReqID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MassStatusReqID get(cl.bithaus.qfix.fields.MassStatusReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MassStatusReqID getMassStatusReqID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MassStatusReqID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MassStatusReqID field) {
		return isSetField(field);
	}

	public boolean isSetMassStatusReqID() {
		return isSetField(584);
	}

	public void set(cl.bithaus.qfix.fields.TotNumReports value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TotNumReports get(cl.bithaus.qfix.fields.TotNumReports value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TotNumReports getTotNumReports() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TotNumReports());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TotNumReports field) {
		return isSetField(field);
	}

	public boolean isSetTotNumReports() {
		return isSetField(911);
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

	public void set(cl.bithaus.qfix.fields.NoContraBrokers value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoContraBrokers get(cl.bithaus.qfix.fields.NoContraBrokers value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoContraBrokers getNoContraBrokers() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoContraBrokers());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoContraBrokers field) {
		return isSetField(field);
	}

	public boolean isSetNoContraBrokers() {
		return isSetField(382);
	}

	public static class NoContraBrokers extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {375, 337, 0};

		public NoContraBrokers() {
			super(382, 375, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.ContraBroker value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ContraBroker get(cl.bithaus.qfix.fields.ContraBroker value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ContraBroker getContraBroker() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ContraBroker());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ContraBroker field) {
		return isSetField(field);
	}

	public boolean isSetContraBroker() {
		return isSetField(375);
	}

	public void set(cl.bithaus.qfix.fields.ContraTrader value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ContraTrader get(cl.bithaus.qfix.fields.ContraTrader value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ContraTrader getContraTrader() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ContraTrader());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ContraTrader field) {
		return isSetField(field);
	}

	public boolean isSetContraTrader() {
		return isSetField(337);
	}

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

	public void set(cl.bithaus.qfix.fields.ExecRefID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ExecRefID get(cl.bithaus.qfix.fields.ExecRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ExecRefID getExecRefID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ExecRefID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ExecRefID field) {
		return isSetField(field);
	}

	public boolean isSetExecRefID() {
		return isSetField(19);
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

	public void set(cl.bithaus.qfix.fields.DayOrderQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DayOrderQty get(cl.bithaus.qfix.fields.DayOrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DayOrderQty getDayOrderQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DayOrderQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DayOrderQty field) {
		return isSetField(field);
	}

	public boolean isSetDayOrderQty() {
		return isSetField(424);
	}

	public void set(cl.bithaus.qfix.fields.DayCumQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DayCumQty get(cl.bithaus.qfix.fields.DayCumQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DayCumQty getDayCumQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DayCumQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DayCumQty field) {
		return isSetField(field);
	}

	public boolean isSetDayCumQty() {
		return isSetField(425);
	}

	public void set(cl.bithaus.qfix.fields.DayAvgPx value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DayAvgPx get(cl.bithaus.qfix.fields.DayAvgPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DayAvgPx getDayAvgPx() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DayAvgPx());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DayAvgPx field) {
		return isSetField(field);
	}

	public boolean isSetDayAvgPx() {
		return isSetField(426);
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

	public void set(cl.bithaus.qfix.fields.ReportToExch value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.ReportToExch get(cl.bithaus.qfix.fields.ReportToExch value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.ReportToExch getReportToExch() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.ReportToExch());
	}

	public boolean isSet(cl.bithaus.qfix.fields.ReportToExch field) {
		return isSetField(field);
	}

	public boolean isSetReportToExch() {
		return isSetField(113);
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

	public void set(cl.bithaus.qfix.fields.OrigAmount value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrigAmount get(cl.bithaus.qfix.fields.OrigAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrigAmount getOrigAmount() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrigAmount());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrigAmount field) {
		return isSetField(field);
	}

	public boolean isSetOrigAmount() {
		return isSetField(10230);
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

	public void set(cl.bithaus.qfix.fields.MoveToOIB value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MoveToOIB get(cl.bithaus.qfix.fields.MoveToOIB value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MoveToOIB getMoveToOIB() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MoveToOIB());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MoveToOIB field) {
		return isSetField(field);
	}

	public boolean isSetMoveToOIB() {
		return isSetField(10126);
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

	public void set(cl.bithaus.qfix.fields.OldQty value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OldQty get(cl.bithaus.qfix.fields.OldQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OldQty getOldQty() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OldQty());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OldQty field) {
		return isSetField(field);
	}

	public boolean isSetOldQty() {
		return isSetField(5036);
	}

	public void set(cl.bithaus.qfix.fields.OldPrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OldPrice get(cl.bithaus.qfix.fields.OldPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OldPrice getOldPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OldPrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OldPrice field) {
		return isSetField(field);
	}

	public boolean isSetOldPrice() {
		return isSetField(5037);
	}

	public void set(cl.bithaus.qfix.fields.StopPxCondition value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.StopPxCondition get(cl.bithaus.qfix.fields.StopPxCondition value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.StopPxCondition getStopPxCondition() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.StopPxCondition());
	}

	public boolean isSet(cl.bithaus.qfix.fields.StopPxCondition field) {
		return isSetField(field);
	}

	public boolean isSetStopPxCondition() {
		return isSetField(5255);
	}

	public void set(cl.bithaus.qfix.fields.Price2 value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Price2 get(cl.bithaus.qfix.fields.Price2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Price2 getPrice2() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Price2());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Price2 field) {
		return isSetField(field);
	}

	public boolean isSetPrice2() {
		return isSetField(640);
	}

	public void set(cl.bithaus.qfix.msg.component.SpecialOrderData component) {
		setComponent(component);
	}

	public cl.bithaus.qfix.msg.component.SpecialOrderData get(cl.bithaus.qfix.msg.component.SpecialOrderData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public cl.bithaus.qfix.msg.component.SpecialOrderData getSpecialOrderData() throws FieldNotFound {
		return get(new cl.bithaus.qfix.msg.component.SpecialOrderData());
	}

	public void set(cl.bithaus.qfix.fields.SpecialOrderType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SpecialOrderType get(cl.bithaus.qfix.fields.SpecialOrderType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SpecialOrderType getSpecialOrderType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SpecialOrderType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SpecialOrderType field) {
		return isSetField(field);
	}

	public boolean isSetSpecialOrderType() {
		return isSetField(10128);
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

	public void set(cl.bithaus.qfix.fields.OrderNumber value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrderNumber get(cl.bithaus.qfix.fields.OrderNumber value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrderNumber getOrderNumber() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrderNumber());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrderNumber field) {
		return isSetField(field);
	}

	public boolean isSetOrderNumber() {
		return isSetField(10133);
	}

	public void set(cl.bithaus.qfix.fields.NoSpecialOrderData value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoSpecialOrderData get(cl.bithaus.qfix.fields.NoSpecialOrderData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoSpecialOrderData getNoSpecialOrderData() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoSpecialOrderData());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoSpecialOrderData field) {
		return isSetField(field);
	}

	public boolean isSetNoSpecialOrderData() {
		return isSetField(10131);
	}

	public static class NoSpecialOrderData extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {10129, 10130, 0};

		public NoSpecialOrderData() {
			super(10131, 10129, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.SpecialOrderDataTypeID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SpecialOrderDataTypeID get(cl.bithaus.qfix.fields.SpecialOrderDataTypeID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SpecialOrderDataTypeID getSpecialOrderDataTypeID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SpecialOrderDataTypeID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SpecialOrderDataTypeID field) {
		return isSetField(field);
	}

	public boolean isSetSpecialOrderDataTypeID() {
		return isSetField(10129);
	}

	public void set(cl.bithaus.qfix.fields.SpecialOrderDataValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SpecialOrderDataValue get(cl.bithaus.qfix.fields.SpecialOrderDataValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SpecialOrderDataValue getSpecialOrderDataValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SpecialOrderDataValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SpecialOrderDataValue field) {
		return isSetField(field);
	}

	public boolean isSetSpecialOrderDataValue() {
		return isSetField(10130);
	}

	}

	public void set(cl.bithaus.qfix.fields.RoundLotBook value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RoundLotBook get(cl.bithaus.qfix.fields.RoundLotBook value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RoundLotBook getRoundLotBook() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RoundLotBook());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RoundLotBook field) {
		return isSetField(field);
	}

	public boolean isSetRoundLotBook() {
		return isSetField(10132);
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

	public void set(cl.bithaus.qfix.fields.RefOrderID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RefOrderID get(cl.bithaus.qfix.fields.RefOrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RefOrderID getRefOrderID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RefOrderID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RefOrderID field) {
		return isSetField(field);
	}

	public boolean isSetRefOrderID() {
		return isSetField(1080);
	}

	public void set(cl.bithaus.qfix.fields.RefOrderIDSource value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RefOrderIDSource get(cl.bithaus.qfix.fields.RefOrderIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RefOrderIDSource getRefOrderIDSource() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RefOrderIDSource());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RefOrderIDSource field) {
		return isSetField(field);
	}

	public boolean isSetRefOrderIDSource() {
		return isSetField(1081);
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

	public void set(cl.bithaus.qfix.fields.Expressed value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Expressed get(cl.bithaus.qfix.fields.Expressed value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Expressed getExpressed() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Expressed());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Expressed field) {
		return isSetField(field);
	}

	public boolean isSetExpressed() {
		return isSetField(10213);
	}

	public void set(cl.bithaus.qfix.fields.RefOrderSubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RefOrderSubID get(cl.bithaus.qfix.fields.RefOrderSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RefOrderSubID getRefOrderSubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RefOrderSubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RefOrderSubID field) {
		return isSetField(field);
	}

	public boolean isSetRefOrderSubID() {
		return isSetField(10214);
	}

	public void set(cl.bithaus.qfix.fields.RefFractionID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RefFractionID get(cl.bithaus.qfix.fields.RefFractionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RefFractionID getRefFractionID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RefFractionID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RefFractionID field) {
		return isSetField(field);
	}

	public boolean isSetRefFractionID() {
		return isSetField(10215);
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

}
