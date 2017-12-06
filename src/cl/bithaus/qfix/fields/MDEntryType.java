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


public class MDEntryType extends CharField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 269;
	public static final char BID = '0';
	public static final char OFFER = '1';
	public static final char TRADE = '2';
	public static final char INDEX_VALUE = '3';
	public static final char OPENING_PRICE = '4';
	public static final char CLOSING_PRICE = '5';
	public static final char SETTLEMENT_PRICE = '6';
	public static final char TRADING_SESSION_HIGH_PRICE = '7';
	public static final char TRADING_SESSION_LOW_PRICE = '8';
	public static final char TRADING_SESSION_VWAP_PRICE = '9';
	public static final char IMBALANCE = 'A';
	public static final char TRADE_VOLUME = 'B';
	public static final char OPEN_INTEREST = 'C';
	public static final char TRADE_AMOUNT = 'D';
	public static final char STOP_BID = 'E';
	public static final char STOP_OFFER = 'F';
	public static final char TREND = 'G';
	public static final char LAST_ORDERS = 'K';
	public static final char CBLIMITDOWN = 'b';
	public static final char CBLIMITUP = 'c';
	public static final char INDICATIVE_OPENING_PRICE = 'd';
	public static final char REFERENCE_PRICE = 'e';
	public static final char QUOTE_PRICE = 'f';
	public static final char BETTER_PRICE_SETTING_BID = 'g';
	public static final char BETTER_PRICE_SETTING_OFFER = 'h';
	public static final char PREVIOUS_BID = 'i';
	public static final char PREVIOUS_OFFER = 'j';
	public static final char PREVIOUS_TIME = 'k';
	public static final char EX_DIVIDEND = 'l';
	public static final char SERIALIZED_OFFER = 'm';
	public static final char SERIALIZED_BID = 'n';
	public static final char INDEX_COMPOSITION = 'o';
	public static final char FRACTIONS = 'q';
	public static final char DURATION = 'r';
	public static final char PROVISIONAL_ADJUDICATION_PRICE = 'S';
	public static final char OFFER_DA_IRF_IIF = 'u';
	public static final char OFFER_FIRM_DA_IRF_IIF = 'v';
	public static final char BID_DA_IRF_IIF = 'w';
	public static final char TRADE_DA_IRF_IIF = 'W';
	public static final char OFFER_CA_IRF = 'x';
	public static final char OFFER_CA_IIF = 'X';
	public static final char OFFER_FIRM_CA_IRF = 'y';
	public static final char OFFER_FIRM_CA_IIF = 'Y';
	public static final char TRADE_CA_IRF = 'z';
	public static final char TRADE_CA_IIF = 'Z';
	
	public MDEntryType() {
		super(269);
	}

	public MDEntryType(char data) {
		super(269, data);
	}
	
}
