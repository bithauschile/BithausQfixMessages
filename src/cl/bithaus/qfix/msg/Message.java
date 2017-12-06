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
package cl.bithaus.qfix.msg;

import quickfix.FieldNotFound;
  
import quickfix.field.*;

import quickfix.Group;

public class Message extends quickfix.Message {

	static final long serialVersionUID = 20050617;

	public Message() {
		this(null);
	}

	protected Message(int[] fieldOrder) {
		super(fieldOrder);
		header = new Header(this);
		trailer = new Trailer();
		
		getHeader().setField(new BeginString("FIX.4.4"));
			
	}

	public static class Header extends quickfix.Message.Header {

		static final long serialVersionUID = 20050617;

		public Header(Message msg) {
			// JNI compatibility
		}
		
	public void set(cl.bithaus.qfix.fields.BeginString value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BeginString get(cl.bithaus.qfix.fields.BeginString value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BeginString getBeginString() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BeginString());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BeginString field) {
		return isSetField(field);
	}

	public boolean isSetBeginString() {
		return isSetField(8);
	}

	public void set(cl.bithaus.qfix.fields.BodyLength value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.BodyLength get(cl.bithaus.qfix.fields.BodyLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.BodyLength getBodyLength() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.BodyLength());
	}

	public boolean isSet(cl.bithaus.qfix.fields.BodyLength field) {
		return isSetField(field);
	}

	public boolean isSetBodyLength() {
		return isSetField(9);
	}

	public void set(cl.bithaus.qfix.fields.MsgType value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MsgType get(cl.bithaus.qfix.fields.MsgType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MsgType getMsgType() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MsgType());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MsgType field) {
		return isSetField(field);
	}

	public boolean isSetMsgType() {
		return isSetField(35);
	}

	public void set(cl.bithaus.qfix.fields.SenderCompID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SenderCompID get(cl.bithaus.qfix.fields.SenderCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SenderCompID getSenderCompID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SenderCompID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SenderCompID field) {
		return isSetField(field);
	}

	public boolean isSetSenderCompID() {
		return isSetField(49);
	}

	public void set(cl.bithaus.qfix.fields.TargetCompID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TargetCompID get(cl.bithaus.qfix.fields.TargetCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TargetCompID getTargetCompID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TargetCompID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TargetCompID field) {
		return isSetField(field);
	}

	public boolean isSetTargetCompID() {
		return isSetField(56);
	}

	public void set(cl.bithaus.qfix.fields.OnBehalfOfCompID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OnBehalfOfCompID get(cl.bithaus.qfix.fields.OnBehalfOfCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OnBehalfOfCompID getOnBehalfOfCompID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OnBehalfOfCompID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OnBehalfOfCompID field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfCompID() {
		return isSetField(115);
	}

	public void set(cl.bithaus.qfix.fields.DeliverToCompID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DeliverToCompID get(cl.bithaus.qfix.fields.DeliverToCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DeliverToCompID getDeliverToCompID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DeliverToCompID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DeliverToCompID field) {
		return isSetField(field);
	}

	public boolean isSetDeliverToCompID() {
		return isSetField(128);
	}

	public void set(cl.bithaus.qfix.fields.SecureDataLen value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecureDataLen get(cl.bithaus.qfix.fields.SecureDataLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecureDataLen getSecureDataLen() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecureDataLen());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecureDataLen field) {
		return isSetField(field);
	}

	public boolean isSetSecureDataLen() {
		return isSetField(90);
	}

	public void set(cl.bithaus.qfix.fields.SecureData value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SecureData get(cl.bithaus.qfix.fields.SecureData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SecureData getSecureData() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SecureData());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SecureData field) {
		return isSetField(field);
	}

	public boolean isSetSecureData() {
		return isSetField(91);
	}

	public void set(cl.bithaus.qfix.fields.MsgSeqNum value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MsgSeqNum get(cl.bithaus.qfix.fields.MsgSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MsgSeqNum getMsgSeqNum() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MsgSeqNum());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MsgSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetMsgSeqNum() {
		return isSetField(34);
	}

	public void set(cl.bithaus.qfix.fields.SenderSubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SenderSubID get(cl.bithaus.qfix.fields.SenderSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SenderSubID getSenderSubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SenderSubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SenderSubID field) {
		return isSetField(field);
	}

	public boolean isSetSenderSubID() {
		return isSetField(50);
	}

	public void set(cl.bithaus.qfix.fields.SenderLocationID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SenderLocationID get(cl.bithaus.qfix.fields.SenderLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SenderLocationID getSenderLocationID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SenderLocationID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SenderLocationID field) {
		return isSetField(field);
	}

	public boolean isSetSenderLocationID() {
		return isSetField(142);
	}

	public void set(cl.bithaus.qfix.fields.TargetSubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TargetSubID get(cl.bithaus.qfix.fields.TargetSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TargetSubID getTargetSubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TargetSubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TargetSubID field) {
		return isSetField(field);
	}

	public boolean isSetTargetSubID() {
		return isSetField(57);
	}

	public void set(cl.bithaus.qfix.fields.TargetLocationID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.TargetLocationID get(cl.bithaus.qfix.fields.TargetLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.TargetLocationID getTargetLocationID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.TargetLocationID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.TargetLocationID field) {
		return isSetField(field);
	}

	public boolean isSetTargetLocationID() {
		return isSetField(143);
	}

	public void set(cl.bithaus.qfix.fields.OnBehalfOfSubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OnBehalfOfSubID get(cl.bithaus.qfix.fields.OnBehalfOfSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OnBehalfOfSubID getOnBehalfOfSubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OnBehalfOfSubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OnBehalfOfSubID field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfSubID() {
		return isSetField(116);
	}

	public void set(cl.bithaus.qfix.fields.OnBehalfOfLocationID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OnBehalfOfLocationID get(cl.bithaus.qfix.fields.OnBehalfOfLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OnBehalfOfLocationID getOnBehalfOfLocationID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OnBehalfOfLocationID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OnBehalfOfLocationID field) {
		return isSetField(field);
	}

	public boolean isSetOnBehalfOfLocationID() {
		return isSetField(144);
	}

	public void set(cl.bithaus.qfix.fields.DeliverToSubID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DeliverToSubID get(cl.bithaus.qfix.fields.DeliverToSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DeliverToSubID getDeliverToSubID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DeliverToSubID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DeliverToSubID field) {
		return isSetField(field);
	}

	public boolean isSetDeliverToSubID() {
		return isSetField(129);
	}

	public void set(cl.bithaus.qfix.fields.DeliverToLocationID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.DeliverToLocationID get(cl.bithaus.qfix.fields.DeliverToLocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.DeliverToLocationID getDeliverToLocationID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.DeliverToLocationID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.DeliverToLocationID field) {
		return isSetField(field);
	}

	public boolean isSetDeliverToLocationID() {
		return isSetField(145);
	}

	public void set(cl.bithaus.qfix.fields.PossDupFlag value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PossDupFlag get(cl.bithaus.qfix.fields.PossDupFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PossDupFlag getPossDupFlag() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PossDupFlag());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PossDupFlag field) {
		return isSetField(field);
	}

	public boolean isSetPossDupFlag() {
		return isSetField(43);
	}

	public void set(cl.bithaus.qfix.fields.PossResend value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.PossResend get(cl.bithaus.qfix.fields.PossResend value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.PossResend getPossResend() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.PossResend());
	}

	public boolean isSet(cl.bithaus.qfix.fields.PossResend field) {
		return isSetField(field);
	}

	public boolean isSetPossResend() {
		return isSetField(97);
	}

	public void set(cl.bithaus.qfix.fields.SendingTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SendingTime get(cl.bithaus.qfix.fields.SendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SendingTime getSendingTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SendingTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SendingTime field) {
		return isSetField(field);
	}

	public boolean isSetSendingTime() {
		return isSetField(52);
	}

	public void set(cl.bithaus.qfix.fields.OrigSendingTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.OrigSendingTime get(cl.bithaus.qfix.fields.OrigSendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.OrigSendingTime getOrigSendingTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.OrigSendingTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.OrigSendingTime field) {
		return isSetField(field);
	}

	public boolean isSetOrigSendingTime() {
		return isSetField(122);
	}

	public void set(cl.bithaus.qfix.fields.XmlDataLen value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.XmlDataLen get(cl.bithaus.qfix.fields.XmlDataLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.XmlDataLen getXmlDataLen() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.XmlDataLen());
	}

	public boolean isSet(cl.bithaus.qfix.fields.XmlDataLen field) {
		return isSetField(field);
	}

	public boolean isSetXmlDataLen() {
		return isSetField(212);
	}

	public void set(cl.bithaus.qfix.fields.XmlData value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.XmlData get(cl.bithaus.qfix.fields.XmlData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.XmlData getXmlData() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.XmlData());
	}

	public boolean isSet(cl.bithaus.qfix.fields.XmlData field) {
		return isSetField(field);
	}

	public boolean isSetXmlData() {
		return isSetField(213);
	}

	public void set(cl.bithaus.qfix.fields.MessageEncoding value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.MessageEncoding get(cl.bithaus.qfix.fields.MessageEncoding value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.MessageEncoding getMessageEncoding() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.MessageEncoding());
	}

	public boolean isSet(cl.bithaus.qfix.fields.MessageEncoding field) {
		return isSetField(field);
	}

	public boolean isSetMessageEncoding() {
		return isSetField(347);
	}

	public void set(cl.bithaus.qfix.fields.LastMsgSeqNumProcessed value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.LastMsgSeqNumProcessed get(cl.bithaus.qfix.fields.LastMsgSeqNumProcessed value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.LastMsgSeqNumProcessed getLastMsgSeqNumProcessed() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.LastMsgSeqNumProcessed());
	}

	public boolean isSet(cl.bithaus.qfix.fields.LastMsgSeqNumProcessed field) {
		return isSetField(field);
	}

	public boolean isSetLastMsgSeqNumProcessed() {
		return isSetField(369);
	}

	public void set(cl.bithaus.qfix.fields.NoHops value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.NoHops get(cl.bithaus.qfix.fields.NoHops value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.NoHops getNoHops() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.NoHops());
	}

	public boolean isSet(cl.bithaus.qfix.fields.NoHops field) {
		return isSetField(field);
	}

	public boolean isSetNoHops() {
		return isSetField(627);
	}

	public static class NoHops extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {628, 629, 630, 0};

		public NoHops() {
			super(627, 628, ORDER);
		}
		
	public void set(cl.bithaus.qfix.fields.HopCompID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.HopCompID get(cl.bithaus.qfix.fields.HopCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.HopCompID getHopCompID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.HopCompID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.HopCompID field) {
		return isSetField(field);
	}

	public boolean isSetHopCompID() {
		return isSetField(628);
	}

	public void set(cl.bithaus.qfix.fields.HopSendingTime value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.HopSendingTime get(cl.bithaus.qfix.fields.HopSendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.HopSendingTime getHopSendingTime() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.HopSendingTime());
	}

	public boolean isSet(cl.bithaus.qfix.fields.HopSendingTime field) {
		return isSetField(field);
	}

	public boolean isSetHopSendingTime() {
		return isSetField(629);
	}

	public void set(cl.bithaus.qfix.fields.HopRefID value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.HopRefID get(cl.bithaus.qfix.fields.HopRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.HopRefID getHopRefID() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.HopRefID());
	}

	public boolean isSet(cl.bithaus.qfix.fields.HopRefID field) {
		return isSetField(field);
	}

	public boolean isSetHopRefID() {
		return isSetField(630);
	}

	}

	}
	
	
	public void set(cl.bithaus.qfix.fields.SignatureLength value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.SignatureLength get(cl.bithaus.qfix.fields.SignatureLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.SignatureLength getSignatureLength() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.SignatureLength());
	}

	public boolean isSet(cl.bithaus.qfix.fields.SignatureLength field) {
		return isSetField(field);
	}

	public boolean isSetSignatureLength() {
		return isSetField(93);
	}

	public void set(cl.bithaus.qfix.fields.Signature value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.Signature get(cl.bithaus.qfix.fields.Signature value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.Signature getSignature() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.Signature());
	}

	public boolean isSet(cl.bithaus.qfix.fields.Signature field) {
		return isSetField(field);
	}

	public boolean isSetSignature() {
		return isSetField(89);
	}

	public void set(cl.bithaus.qfix.fields.CheckSum value) {
		setField(value);
	}

	public cl.bithaus.qfix.fields.CheckSum get(cl.bithaus.qfix.fields.CheckSum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public cl.bithaus.qfix.fields.CheckSum getCheckSum() throws FieldNotFound {
		return get(new cl.bithaus.qfix.fields.CheckSum());
	}

	public boolean isSet(cl.bithaus.qfix.fields.CheckSum field) {
		return isSetField(field);
	}

	public boolean isSetCheckSum() {
		return isSetField(10);
	}

}
