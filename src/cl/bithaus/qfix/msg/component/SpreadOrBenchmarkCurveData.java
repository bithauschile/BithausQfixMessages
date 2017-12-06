
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;


public class SpreadOrBenchmarkCurveData extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 218, 220, 221, 222, 662, 663, 699, 761,  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public SpreadOrBenchmarkCurveData() {
		super();
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

}
