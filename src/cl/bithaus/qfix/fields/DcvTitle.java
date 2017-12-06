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


public class DcvTitle extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 10212;
	public static final String OTHER = "1";
	public static final String NO_DCV = "2";
	public static final String CERTIFIED = "3";
	public static final String DCV = "4";
	public static final String DEPOSIT = "5";
	public static final String PRIMARY_NO_DCV = "6";
	
	public DcvTitle() {
		super(10212);
	}

	public DcvTitle(String data) {
		super(10212, data);
	}
	
}
