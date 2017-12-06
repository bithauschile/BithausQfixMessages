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


public class NewsSourceSystem extends StringField {

	static final long serialVersionUID = 20050617;

	public static final int FIELD = 10146;
	public static final char MERCADO_ACCIONES = 'A';
	public static final char MERCADO_DERIVADOS = 'V';
	public static final char MERCADO_FUTUROS_DE_IPSA = 'I';
	public static final char MERCADO_FUTUROS_DE_DOLAR = 'D';
	public static final char MERCADO_FUTUROS_DE_RENTA_FIJA = 'B';
	public static final char MERCADO_FUTUROS_DE_INDICE_DE_CAMARA_PROMEDIO = 'N';
	public static final char MERCADO_FUTUROS_DE_SEGURO_DE_INFLACION = 'G';
	public static final char MERCADO_SIMULTANEAS = 'S';
	public static final char MERCADO_REMATE_CONCURRENTE_RF = 'R';
	public static final char MERCADO_TELERENTA_RF = 'T';
	public static final char MERCADO_REMATE_HOLANDES_RF = 'H';
	
	public NewsSourceSystem() {
		super(10146);
	}

	public NewsSourceSystem(String data) {
		super(10146, data);
	}
	
}
