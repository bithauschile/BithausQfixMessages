
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;


public class IIFValorization extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 10177, 10178, 10179, 10180, 10181, 10182, 10183, 10184, 10185, 10186, 10187, 10188, 10189, 10190,  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public IIFValorization() {
		super();
	}
	
	public IIFValorization(cl.bithaus.qfix.fields.IifValAdjustmentCurrency iifValAdjustmentCurrency, cl.bithaus.qfix.fields.IifValDate iifValDate, cl.bithaus.qfix.fields.IifValSettlType iifValSettlType, cl.bithaus.qfix.fields.IifValInterestRate iifValInterestRate, cl.bithaus.qfix.fields.IifValRescueAmount iifValRescueAmount) {
		this();
		setField(iifValAdjustmentCurrency);
		setField(iifValDate);
		setField(iifValSettlType);
		setField(iifValInterestRate);
		setField(iifValRescueAmount);
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

}
