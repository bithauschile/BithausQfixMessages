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


public class IifValAdjustmentCurrency extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 10177;
	public static final char CLP = '1';
	public static final char UF_PAGADERO_CLP = '2';
	public static final char USD_PAGADERO_CLP = '3';
	public static final char USD_PAGADERO_USD = '4';
	public static final char ICP_PAGADERO_CLP = '5';
	public static final char EUR_PAGADERO_CLP = '6';
	public static final char EUR_PAGADERO_EUR = '7';
	public static final char IVP_PAGADERO_CLP = '8';
	public static final char OTHER = '9';
	
	public IifValAdjustmentCurrency() {
		super(10177);
	}

	public IifValAdjustmentCurrency(String data) {
		super(10177, data);
	}
	
}
