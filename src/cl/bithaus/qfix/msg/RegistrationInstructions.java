
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;

import quickfix.Group;

public class RegistrationInstructions extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "o";
	

	public RegistrationInstructions() {
		super();
		getHeader().setField(new cl.bithaus.qfix.fields.MsgType(MSGTYPE));
	}
	
	public RegistrationInstructions(cl.bithaus.qfix.fields.RegistID registID, cl.bithaus.qfix.fields.RegistTransType registTransType, cl.bithaus.qfix.fields.RegistRefID registRefID) {
		this();
		setField(registID);
		setField(registTransType);
		setField(registRefID);
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

	public void set(cl.bithaus.qfix.fields.RegistTransType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RegistTransType get(cl.bithaus.qfix.fields.RegistTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RegistTransType getRegistTransType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RegistTransType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RegistTransType field) {
		return isSetField(field);
	}

	public boolean isSetRegistTransType() {
		return isSetField(514);
	}

	public void set(cl.bithaus.qfix.fields.RegistRefID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RegistRefID get(cl.bithaus.qfix.fields.RegistRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RegistRefID getRegistRefID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RegistRefID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RegistRefID field) {
		return isSetField(field);
	}

	public boolean isSetRegistRefID() {
		return isSetField(508);
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

	public void set(cl.bithaus.qfix.fields.RegistAcctType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RegistAcctType get(cl.bithaus.qfix.fields.RegistAcctType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RegistAcctType getRegistAcctType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RegistAcctType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RegistAcctType field) {
		return isSetField(field);
	}

	public boolean isSetRegistAcctType() {
		return isSetField(493);
	}

	public void set(cl.bithaus.qfix.fields.TaxAdvantageType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TaxAdvantageType get(cl.bithaus.qfix.fields.TaxAdvantageType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TaxAdvantageType getTaxAdvantageType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TaxAdvantageType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TaxAdvantageType field) {
		return isSetField(field);
	}

	public boolean isSetTaxAdvantageType() {
		return isSetField(495);
	}

	public void set(cl.bithaus.qfix.fields.OwnershipType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OwnershipType get(cl.bithaus.qfix.fields.OwnershipType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OwnershipType getOwnershipType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OwnershipType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OwnershipType field) {
		return isSetField(field);
	}

	public boolean isSetOwnershipType() {
		return isSetField(517);
	}

	public void set(cl.bithaus.qfix.fields.NoRegistDtls value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoRegistDtls get(cl.bithaus.qfix.fields.NoRegistDtls value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoRegistDtls getNoRegistDtls() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoRegistDtls());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoRegistDtls field) {
		return isSetField(field);
	}

	public boolean isSetNoRegistDtls() {
		return isSetField(473);
	}

	public static class NoRegistDtls extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {509, 511, 474, 482, 539, 522, 486, 475, 0};

		public NoRegistDtls() {
			super(473, 509, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.RegistDtls value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RegistDtls get(cl.bithaus.qfix.fields.RegistDtls value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RegistDtls getRegistDtls() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RegistDtls());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RegistDtls field) {
		return isSetField(field);
	}

	public boolean isSetRegistDtls() {
		return isSetField(509);
	}

	public void set(cl.bithaus.qfix.fields.RegistEmail value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.RegistEmail get(cl.bithaus.qfix.fields.RegistEmail value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.RegistEmail getRegistEmail() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.RegistEmail());
	}

	public boolean isSet(cl.bithaus.qfix.fields.RegistEmail field) {
		return isSetField(field);
	}

	public boolean isSetRegistEmail() {
		return isSetField(511);
	}

	public void set(cl.bithaus.qfix.fields.MailingDtls value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MailingDtls get(cl.bithaus.qfix.fields.MailingDtls value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MailingDtls getMailingDtls() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MailingDtls());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MailingDtls field) {
		return isSetField(field);
	}

	public boolean isSetMailingDtls() {
		return isSetField(474);
	}

	public void set(cl.bithaus.qfix.fields.MailingInst value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MailingInst get(cl.bithaus.qfix.fields.MailingInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MailingInst getMailingInst() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MailingInst());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MailingInst field) {
		return isSetField(field);
	}

	public boolean isSetMailingInst() {
		return isSetField(482);
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

	public void set(cl.bithaus.qfix.fields.OwnerType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OwnerType get(cl.bithaus.qfix.fields.OwnerType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OwnerType getOwnerType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OwnerType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OwnerType field) {
		return isSetField(field);
	}

	public boolean isSetOwnerType() {
		return isSetField(522);
	}

	public void set(cl.bithaus.qfix.fields.DateOfBirth value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DateOfBirth get(cl.bithaus.qfix.fields.DateOfBirth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DateOfBirth getDateOfBirth() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DateOfBirth());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DateOfBirth field) {
		return isSetField(field);
	}

	public boolean isSetDateOfBirth() {
		return isSetField(486);
	}

	public void set(cl.bithaus.qfix.fields.InvestorCountryOfResidence value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.InvestorCountryOfResidence get(cl.bithaus.qfix.fields.InvestorCountryOfResidence value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.InvestorCountryOfResidence getInvestorCountryOfResidence() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.InvestorCountryOfResidence());
	}

	public boolean isSet(cl.bithaus.qfix.fields.InvestorCountryOfResidence field) {
		return isSetField(field);
	}

	public boolean isSetInvestorCountryOfResidence() {
		return isSetField(475);
	}

	}

	public void set(cl.bithaus.qfix.fields.NoDistribInsts value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoDistribInsts get(cl.bithaus.qfix.fields.NoDistribInsts value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoDistribInsts getNoDistribInsts() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoDistribInsts());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoDistribInsts field) {
		return isSetField(field);
	}

	public boolean isSetNoDistribInsts() {
		return isSetField(510);
	}

	public static class NoDistribInsts extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {477, 512, 478, 498, 499, 500, 501, 502, 0};

		public NoDistribInsts() {
			super(510, 477, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.DistribPaymentMethod value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DistribPaymentMethod get(cl.bithaus.qfix.fields.DistribPaymentMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DistribPaymentMethod getDistribPaymentMethod() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DistribPaymentMethod());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DistribPaymentMethod field) {
		return isSetField(field);
	}

	public boolean isSetDistribPaymentMethod() {
		return isSetField(477);
	}

	public void set(cl.bithaus.qfix.fields.DistribPercentage value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DistribPercentage get(cl.bithaus.qfix.fields.DistribPercentage value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DistribPercentage getDistribPercentage() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DistribPercentage());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DistribPercentage field) {
		return isSetField(field);
	}

	public boolean isSetDistribPercentage() {
		return isSetField(512);
	}

	public void set(cl.bithaus.qfix.fields.CashDistribCurr value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CashDistribCurr get(cl.bithaus.qfix.fields.CashDistribCurr value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CashDistribCurr getCashDistribCurr() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CashDistribCurr());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CashDistribCurr field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribCurr() {
		return isSetField(478);
	}

	public void set(cl.bithaus.qfix.fields.CashDistribAgentName value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CashDistribAgentName get(cl.bithaus.qfix.fields.CashDistribAgentName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CashDistribAgentName getCashDistribAgentName() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CashDistribAgentName());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CashDistribAgentName field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribAgentName() {
		return isSetField(498);
	}

	public void set(cl.bithaus.qfix.fields.CashDistribAgentCode value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CashDistribAgentCode get(cl.bithaus.qfix.fields.CashDistribAgentCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CashDistribAgentCode getCashDistribAgentCode() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CashDistribAgentCode());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CashDistribAgentCode field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribAgentCode() {
		return isSetField(499);
	}

	public void set(cl.bithaus.qfix.fields.CashDistribAgentAcctNumber value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CashDistribAgentAcctNumber get(cl.bithaus.qfix.fields.CashDistribAgentAcctNumber value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CashDistribAgentAcctNumber getCashDistribAgentAcctNumber() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CashDistribAgentAcctNumber());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CashDistribAgentAcctNumber field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribAgentAcctNumber() {
		return isSetField(500);
	}

	public void set(cl.bithaus.qfix.fields.CashDistribPayRef value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CashDistribPayRef get(cl.bithaus.qfix.fields.CashDistribPayRef value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CashDistribPayRef getCashDistribPayRef() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CashDistribPayRef());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CashDistribPayRef field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribPayRef() {
		return isSetField(501);
	}

	public void set(cl.bithaus.qfix.fields.CashDistribAgentAcctName value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CashDistribAgentAcctName get(cl.bithaus.qfix.fields.CashDistribAgentAcctName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CashDistribAgentAcctName getCashDistribAgentAcctName() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CashDistribAgentAcctName());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CashDistribAgentAcctName field) {
		return isSetField(field);
	}

	public boolean isSetCashDistribAgentAcctName() {
		return isSetField(502);
	}

	}

}
