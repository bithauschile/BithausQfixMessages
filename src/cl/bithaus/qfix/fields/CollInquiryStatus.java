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


public class CollInquiryStatus extends IntField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 945;
	public static final int ACCEPTED = 0;
	public static final int ACCEPTED_WITH_WARNINGS = 1;
	public static final int COMPLETED = 2;
	public static final int COMPLETED_WITH_WARNINGS = 3;
	public static final int REJECTED = 4;
	
	public CollInquiryStatus() {
		super(945);
	}

	public CollInquiryStatus(int data) {
		super(945, data);
	}
	
}
