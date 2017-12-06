
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;


public class IRFValorization extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 10191, 10206, 10207, 10208, 10192, 10193, 10194, 10195, 10196, 10197, 10198, 10199, 10200, 10201, 10202, 10203, 10204, 10205, 10209,  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public IRFValorization() {
		super();
	}
	
	public IRFValorization(cl.bithaus.qfix.fields.IrfValSymbol irfValSymbol, cl.bithaus.qfix.fields.IrfValDate irfValDate, cl.bithaus.qfix.fields.IrfValSettlType irfValSettlType, cl.bithaus.qfix.fields.IrfValQty irfValQty) {
		this();
		setField(irfValSymbol);
		setField(irfValDate);
		setField(irfValSettlType);
		setField(irfValQty);
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

}
