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

import quickfix.IntField;


public class NewsType extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 10144;
	public static final int MARKET_EVENT = 1;
	public static final int SYMBOL_NEWS = 2;
	public static final int SYMBOL_SUSPENSION = 3;
	public static final int ALARM = 4;
	public static final int CROSS_ORDER = 5;
	public static final int SYMBOL_RESUME = 6;
	public static final int LOCAL_NEWS = 7;
	public static final int MARKET_NEWS = 8;
	public static final int OTHER = 9999;
	
	public NewsType() {
		super(10144);
	}

	public NewsType(int data) {
		super(10144, data);
	}
	
}
