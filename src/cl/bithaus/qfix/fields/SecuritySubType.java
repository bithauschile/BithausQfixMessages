/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package cl.bithaus.qfix.fields;

import quickfix.StringField;


public class SecuritySubType extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 762;
	public static final String ETF = "E";
	public static final String DollarFutures = "D";
	public static final String EquityFutures = "I";
	public static final String FixedIncomeFutures = "BT";
	public static final String AverageRateFutures = "A";
	public static final String InflationInsuranceFutures = "C";
	public static final String SimultaneousMarket = "S";
	public static final String FixedIncomeRFTF = "RFTF";
	public static final String FixedIncomeRFFL = "RFFL";
	public static final String FixedIncomeBR = "BR";
	public static final String FixedIncomePRTP = "PRTP";
	public static final String FixedIncomeCORA = "CORA";
	
	public SecuritySubType() {
		super(762);
	}

	public SecuritySubType(String data) {
		super(762, data);
	}
	
}
