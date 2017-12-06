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


public class ExDestination extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 100;
	public static final String BOLSA_DE_SANTIAGO = "XSGO";
	public static final String BOLSA_DE_LIMA = "XLIM";
	public static final String BOLSA_DE_COLOMBIA = "XBOG";
	public static final String MERCADO_INTERBOLSA_CHILENO = "OIB";
	public static final String MERCADO_OFF_SHORE = "OFS";
	public static final String RF_REMATE_HOLANDES = "DAU";
	public static final String RF_REMATE_CONCURRENTE = "EAU";
	public static final String RF_TELERENTA = "TLR";
	
	public ExDestination() {
		super(100);
	}

	public ExDestination(String data) {
		super(100, data);
	}
	
}