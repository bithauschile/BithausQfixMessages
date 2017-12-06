
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;


public class LegBenchmarkCurveData extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 676, 677, 678, 679, 680,  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public LegBenchmarkCurveData() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.LegBenchmarkCurveCurrency value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegBenchmarkCurveCurrency get(cl.bithaus.qfix.fields.LegBenchmarkCurveCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegBenchmarkCurveCurrency getLegBenchmarkCurveCurrency() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegBenchmarkCurveCurrency());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegBenchmarkCurveCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegBenchmarkCurveCurrency() {
		return isSetField(676);
	}

	public void set(cl.bithaus.qfix.fields.LegBenchmarkCurveName value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegBenchmarkCurveName get(cl.bithaus.qfix.fields.LegBenchmarkCurveName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegBenchmarkCurveName getLegBenchmarkCurveName() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegBenchmarkCurveName());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegBenchmarkCurveName field) {
		return isSetField(field);
	}

	public boolean isSetLegBenchmarkCurveName() {
		return isSetField(677);
	}

	public void set(cl.bithaus.qfix.fields.LegBenchmarkCurvePoint value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegBenchmarkCurvePoint get(cl.bithaus.qfix.fields.LegBenchmarkCurvePoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegBenchmarkCurvePoint getLegBenchmarkCurvePoint() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegBenchmarkCurvePoint());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegBenchmarkCurvePoint field) {
		return isSetField(field);
	}

	public boolean isSetLegBenchmarkCurvePoint() {
		return isSetField(678);
	}

	public void set(cl.bithaus.qfix.fields.LegBenchmarkPrice value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegBenchmarkPrice get(cl.bithaus.qfix.fields.LegBenchmarkPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegBenchmarkPrice getLegBenchmarkPrice() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegBenchmarkPrice());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegBenchmarkPrice field) {
		return isSetField(field);
	}

	public boolean isSetLegBenchmarkPrice() {
		return isSetField(679);
	}

	public void set(cl.bithaus.qfix.fields.LegBenchmarkPriceType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LegBenchmarkPriceType get(cl.bithaus.qfix.fields.LegBenchmarkPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LegBenchmarkPriceType getLegBenchmarkPriceType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LegBenchmarkPriceType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LegBenchmarkPriceType field) {
		return isSetField(field);
	}

	public boolean isSetLegBenchmarkPriceType() {
		return isSetField(680);
	}

}
