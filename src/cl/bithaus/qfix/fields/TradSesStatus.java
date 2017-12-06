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


public class TradSesStatus extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 340;
	public static final int UNKNOWN = 0;
	public static final int HALTED = 1;
	public static final int OPEN = 2;
	public static final int CLOSED = 3;
	public static final int PRE_OPEN = 4;
	public static final int PRE_CLOSE = 5;
	public static final int REQUEST_REJECTED = 6;
	
	public TradSesStatus() {
		super(340);
	}

	public TradSesStatus(int data) {
		super(340, data);
	}
	
}