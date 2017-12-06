
package cl.bithaus.qfix.msg.component;

import quickfix.FieldNotFound;


public class DiscretionInstructions extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 388, 389, 841, 842, 843, 844, 846,  };
	@Override
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	@Override
	protected int[] getGroupFields() { return componentGroups; }
	

	public DiscretionInstructions() {
		super();
	}
	
	public void set(cl.bithaus.qfix.fields.DiscretionInst value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DiscretionInst get(cl.bithaus.qfix.fields.DiscretionInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DiscretionInst getDiscretionInst() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DiscretionInst());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DiscretionInst field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionInst() {
		return isSetField(388);
	}

	public void set(cl.bithaus.qfix.fields.DiscretionOffsetValue value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DiscretionOffsetValue get(cl.bithaus.qfix.fields.DiscretionOffsetValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DiscretionOffsetValue getDiscretionOffsetValue() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DiscretionOffsetValue());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DiscretionOffsetValue field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionOffsetValue() {
		return isSetField(389);
	}

	public void set(cl.bithaus.qfix.fields.DiscretionMoveType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DiscretionMoveType get(cl.bithaus.qfix.fields.DiscretionMoveType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DiscretionMoveType getDiscretionMoveType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DiscretionMoveType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DiscretionMoveType field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionMoveType() {
		return isSetField(841);
	}

	public void set(cl.bithaus.qfix.fields.DiscretionOffsetType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DiscretionOffsetType get(cl.bithaus.qfix.fields.DiscretionOffsetType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DiscretionOffsetType getDiscretionOffsetType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DiscretionOffsetType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DiscretionOffsetType field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionOffsetType() {
		return isSetField(842);
	}

	public void set(cl.bithaus.qfix.fields.DiscretionLimitType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DiscretionLimitType get(cl.bithaus.qfix.fields.DiscretionLimitType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DiscretionLimitType getDiscretionLimitType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DiscretionLimitType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DiscretionLimitType field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionLimitType() {
		return isSetField(843);
	}

	public void set(cl.bithaus.qfix.fields.DiscretionRoundDirection value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DiscretionRoundDirection get(cl.bithaus.qfix.fields.DiscretionRoundDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DiscretionRoundDirection getDiscretionRoundDirection() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DiscretionRoundDirection());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DiscretionRoundDirection field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionRoundDirection() {
		return isSetField(844);
	}

	public void set(cl.bithaus.qfix.fields.DiscretionScope value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DiscretionScope get(cl.bithaus.qfix.fields.DiscretionScope value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DiscretionScope getDiscretionScope() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DiscretionScope());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DiscretionScope field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionScope() {
		return isSetField(846);
	}

}
