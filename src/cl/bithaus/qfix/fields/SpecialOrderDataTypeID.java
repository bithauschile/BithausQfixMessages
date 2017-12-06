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


public class SpecialOrderDataTypeID extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 10129;
	public static final char SPREAD_ORIG_PRICE = '1';
	public static final char SPREAD_ORIG_SPREAD = '2';
	public static final char BRACKET_PARENT_ORIG_PRICE = '3';
	public static final char BRACKET_PARENT_MAX_FLOOR = '4';
	public static final char BRACKET_PARENT_ORIG_QTY = '5';
	public static final char BRACKET_LIMIT_CHILD_PRICE = '6';
	public static final char BRACKET_LIMIT_CHILD_MAX_FLOOR = '7';
	public static final char BRACKET_STOP_CHILD_STOP_PX = '8';
	public static final char GROUP_ID = '9';
	
	public SpecialOrderDataTypeID() {
		super(10129);
	}

	public SpecialOrderDataTypeID(char data) {
		super(10129, data);
	}
	
}
