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


public class RoundLotBook extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 10132;
	public static final char IS_ROUND_LOT = '0';
	public static final char NOT_ROUND_LOT = '1';
	
	public RoundLotBook() {
		super(10132);
	}

	public RoundLotBook(char data) {
		super(10132, data);
	}
	
}
