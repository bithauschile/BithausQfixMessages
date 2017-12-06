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

import quickfix.CharField;


public class StopPxCondition extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 5255;
	public static final char GREATER_OR_EQUAL_THAN_BEST_BID = '0';
	public static final char GREATER_OR_EQUAL_THAN_BEST_OFFER = '1';
	public static final char LESS_OR_EQUAL_THAN_BEST_BID = '2';
	public static final char LESS_OR_EQUAL_THAN_BEST_OFFER = '3';
	public static final char LESS_OR_EQUAL_THAN_CLOSING_PRICE_TRADE = '4';
	public static final char GREATER_OR_EQUAL_THAN_CLOSING_PRICE_TRADE = '5';
	
	public StopPxCondition() {
		super(5255);
	}

	public StopPxCondition(char data) {
		super(5255, data);
	}
	
}
