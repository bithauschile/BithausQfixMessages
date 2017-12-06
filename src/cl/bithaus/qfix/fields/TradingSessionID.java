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


public class TradingSessionID extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 336;
	public static final String OPENING = "1";
	public static final String CONTINOUS = "2";
	public static final String VOLATILITY_AUCTION = "3";
	public static final String CLOSING = "4";
	public static final String AFTERHOUR = "5";
	public static final String REMATE_MARTILLERO = "6";
	public static final String REMATE_ELECTRONICO = "7";
	public static final String RUEDA = "8";
	public static final String REMATE_SERIALIZADO = "9";
	public static final String OIB_LOCAL = "10";
	public static final String OIB_EXTERNO = "11";
	public static final String CLOSING_ORDER_ADMINISTRATION = "12";
	public static final String CLOSED = "13";
	public static final String AUCTION_OFFER = "14";
	public static final String AUCTION_STANCE = "15";
	public static final String TELERENTA_T1 = "16";
	public static final String TELERENTA_T2 = "17";
	public static final String REMATE_HOLANDES = "18";
	
	public TradingSessionID() {
		super(336);
	}

	public TradingSessionID(String data) {
		super(336, data);
	}
	
}
