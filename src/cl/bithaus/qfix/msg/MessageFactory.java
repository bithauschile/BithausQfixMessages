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

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {
	@Override
	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case cl.bithaus.qfix.msg.Heartbeat.MSGTYPE:
				return new cl.bithaus.qfix.msg.Heartbeat();
	
			case cl.bithaus.qfix.msg.Logon.MSGTYPE:
				return new cl.bithaus.qfix.msg.Logon();
	
			case cl.bithaus.qfix.msg.TestRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.TestRequest();
	
			case cl.bithaus.qfix.msg.ResendRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.ResendRequest();
	
			case cl.bithaus.qfix.msg.Reject.MSGTYPE:
				return new cl.bithaus.qfix.msg.Reject();
	
			case cl.bithaus.qfix.msg.SequenceReset.MSGTYPE:
				return new cl.bithaus.qfix.msg.SequenceReset();
	
			case cl.bithaus.qfix.msg.Logout.MSGTYPE:
				return new cl.bithaus.qfix.msg.Logout();
	
			case cl.bithaus.qfix.msg.BusinessMessageReject.MSGTYPE:
				return new cl.bithaus.qfix.msg.BusinessMessageReject();
	
			case cl.bithaus.qfix.msg.UserRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.UserRequest();
	
			case cl.bithaus.qfix.msg.UserResponse.MSGTYPE:
				return new cl.bithaus.qfix.msg.UserResponse();
	
			case cl.bithaus.qfix.msg.Advertisement.MSGTYPE:
				return new cl.bithaus.qfix.msg.Advertisement();
	
			case cl.bithaus.qfix.msg.IndicationOfInterest.MSGTYPE:
				return new cl.bithaus.qfix.msg.IndicationOfInterest();
	
			case cl.bithaus.qfix.msg.News.MSGTYPE:
				return new cl.bithaus.qfix.msg.News();
	
			case cl.bithaus.qfix.msg.Email.MSGTYPE:
				return new cl.bithaus.qfix.msg.Email();
	
			case cl.bithaus.qfix.msg.QuoteRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.QuoteRequest();
	
			case cl.bithaus.qfix.msg.QuoteResponse.MSGTYPE:
				return new cl.bithaus.qfix.msg.QuoteResponse();
	
			case cl.bithaus.qfix.msg.QuoteRequestReject.MSGTYPE:
				return new cl.bithaus.qfix.msg.QuoteRequestReject();
	
			case cl.bithaus.qfix.msg.RFQRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.RFQRequest();
	
			case cl.bithaus.qfix.msg.Quote.MSGTYPE:
				return new cl.bithaus.qfix.msg.Quote();
	
			case cl.bithaus.qfix.msg.QuoteCancel.MSGTYPE:
				return new cl.bithaus.qfix.msg.QuoteCancel();
	
			case cl.bithaus.qfix.msg.QuoteStatusRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.QuoteStatusRequest();
	
			case cl.bithaus.qfix.msg.QuoteStatusReport.MSGTYPE:
				return new cl.bithaus.qfix.msg.QuoteStatusReport();
	
			case cl.bithaus.qfix.msg.MassQuote.MSGTYPE:
				return new cl.bithaus.qfix.msg.MassQuote();
	
			case cl.bithaus.qfix.msg.MassQuoteAcknowledgement.MSGTYPE:
				return new cl.bithaus.qfix.msg.MassQuoteAcknowledgement();
	
			case cl.bithaus.qfix.msg.MarketDataRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.MarketDataRequest();
	
			case cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.MSGTYPE:
				return new cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh();
	
			case cl.bithaus.qfix.msg.MarketDataIncrementalRefresh.MSGTYPE:
				return new cl.bithaus.qfix.msg.MarketDataIncrementalRefresh();
	
			case cl.bithaus.qfix.msg.MarketDataRequestReject.MSGTYPE:
				return new cl.bithaus.qfix.msg.MarketDataRequestReject();
	
			case cl.bithaus.qfix.msg.SecurityDefinitionRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.SecurityDefinitionRequest();
	
			case cl.bithaus.qfix.msg.SecurityDefinition.MSGTYPE:
				return new cl.bithaus.qfix.msg.SecurityDefinition();
	
			case cl.bithaus.qfix.msg.SecurityTypeRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.SecurityTypeRequest();
	
			case cl.bithaus.qfix.msg.SecurityTypes.MSGTYPE:
				return new cl.bithaus.qfix.msg.SecurityTypes();
	
			case cl.bithaus.qfix.msg.SecurityListRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.SecurityListRequest();
	
			case cl.bithaus.qfix.msg.SecurityList.MSGTYPE:
				return new cl.bithaus.qfix.msg.SecurityList();
	
			case cl.bithaus.qfix.msg.SecurityListUpdateReport.MSGTYPE:
				return new cl.bithaus.qfix.msg.SecurityListUpdateReport();
	
			case cl.bithaus.qfix.msg.DerivativeSecurityListRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.DerivativeSecurityListRequest();
	
			case cl.bithaus.qfix.msg.DerivativeSecurityList.MSGTYPE:
				return new cl.bithaus.qfix.msg.DerivativeSecurityList();
	
			case cl.bithaus.qfix.msg.SecurityStatusRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.SecurityStatusRequest();
	
			case cl.bithaus.qfix.msg.SecurityStatus.MSGTYPE:
				return new cl.bithaus.qfix.msg.SecurityStatus();
	
			case cl.bithaus.qfix.msg.TradingSessionStatusRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.TradingSessionStatusRequest();
	
			case cl.bithaus.qfix.msg.TradingSessionStatus.MSGTYPE:
				return new cl.bithaus.qfix.msg.TradingSessionStatus();
	
			case cl.bithaus.qfix.msg.NewOrderSingle.MSGTYPE:
				return new cl.bithaus.qfix.msg.NewOrderSingle();
	
			case cl.bithaus.qfix.msg.ExecutionReport.MSGTYPE:
				return new cl.bithaus.qfix.msg.ExecutionReport();
	
			case cl.bithaus.qfix.msg.DontKnowTrade.MSGTYPE:
				return new cl.bithaus.qfix.msg.DontKnowTrade();
	
			case cl.bithaus.qfix.msg.OrderCancelReplaceRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.OrderCancelReplaceRequest();
	
			case cl.bithaus.qfix.msg.OrderCancelRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.OrderCancelRequest();
	
			case cl.bithaus.qfix.msg.OrderCancelReject.MSGTYPE:
				return new cl.bithaus.qfix.msg.OrderCancelReject();
	
			case cl.bithaus.qfix.msg.OrderStatusRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.OrderStatusRequest();
	
			case cl.bithaus.qfix.msg.OrderMassCancelRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.OrderMassCancelRequest();
	
			case cl.bithaus.qfix.msg.OrderMassCancelReport.MSGTYPE:
				return new cl.bithaus.qfix.msg.OrderMassCancelReport();
	
			case cl.bithaus.qfix.msg.OrderMassStatusRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.OrderMassStatusRequest();
	
			case cl.bithaus.qfix.msg.NewOrderCross.MSGTYPE:
				return new cl.bithaus.qfix.msg.NewOrderCross();
	
			case cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest();
	
			case cl.bithaus.qfix.msg.CrossOrderCancelRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.CrossOrderCancelRequest();
	
			case cl.bithaus.qfix.msg.NewOrderMultileg.MSGTYPE:
				return new cl.bithaus.qfix.msg.NewOrderMultileg();
	
			case cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest();
	
			case cl.bithaus.qfix.msg.BidRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.BidRequest();
	
			case cl.bithaus.qfix.msg.BidResponse.MSGTYPE:
				return new cl.bithaus.qfix.msg.BidResponse();
	
			case cl.bithaus.qfix.msg.NewOrderList.MSGTYPE:
				return new cl.bithaus.qfix.msg.NewOrderList();
	
			case cl.bithaus.qfix.msg.ListStrikePrice.MSGTYPE:
				return new cl.bithaus.qfix.msg.ListStrikePrice();
	
			case cl.bithaus.qfix.msg.ListStatus.MSGTYPE:
				return new cl.bithaus.qfix.msg.ListStatus();
	
			case cl.bithaus.qfix.msg.ListExecute.MSGTYPE:
				return new cl.bithaus.qfix.msg.ListExecute();
	
			case cl.bithaus.qfix.msg.ListCancelRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.ListCancelRequest();
	
			case cl.bithaus.qfix.msg.ListStatusRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.ListStatusRequest();
	
			case cl.bithaus.qfix.msg.AllocationInstruction.MSGTYPE:
				return new cl.bithaus.qfix.msg.AllocationInstruction();
	
			case cl.bithaus.qfix.msg.AllocationInstructionAck.MSGTYPE:
				return new cl.bithaus.qfix.msg.AllocationInstructionAck();
	
			case cl.bithaus.qfix.msg.AllocationReport.MSGTYPE:
				return new cl.bithaus.qfix.msg.AllocationReport();
	
			case cl.bithaus.qfix.msg.AllocationReportAck.MSGTYPE:
				return new cl.bithaus.qfix.msg.AllocationReportAck();
	
			case cl.bithaus.qfix.msg.Confirmation.MSGTYPE:
				return new cl.bithaus.qfix.msg.Confirmation();
	
			case cl.bithaus.qfix.msg.ConfirmationAck.MSGTYPE:
				return new cl.bithaus.qfix.msg.ConfirmationAck();
	
			case cl.bithaus.qfix.msg.ConfirmationRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.ConfirmationRequest();
	
			case cl.bithaus.qfix.msg.SettlementInstructions.MSGTYPE:
				return new cl.bithaus.qfix.msg.SettlementInstructions();
	
			case cl.bithaus.qfix.msg.SettlementInstructionRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.SettlementInstructionRequest();
	
			case cl.bithaus.qfix.msg.TradeCaptureReportRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.TradeCaptureReportRequest();
	
			case cl.bithaus.qfix.msg.TradeCaptureReportRequestAck.MSGTYPE:
				return new cl.bithaus.qfix.msg.TradeCaptureReportRequestAck();
	
			case cl.bithaus.qfix.msg.TradeCaptureReport.MSGTYPE:
				return new cl.bithaus.qfix.msg.TradeCaptureReport();
	
			case cl.bithaus.qfix.msg.TradeCaptureReportAck.MSGTYPE:
				return new cl.bithaus.qfix.msg.TradeCaptureReportAck();
	
			case cl.bithaus.qfix.msg.RegistrationInstructions.MSGTYPE:
				return new cl.bithaus.qfix.msg.RegistrationInstructions();
	
			case cl.bithaus.qfix.msg.RegistrationInstructionsResponse.MSGTYPE:
				return new cl.bithaus.qfix.msg.RegistrationInstructionsResponse();
	
			case cl.bithaus.qfix.msg.PositionMaintenanceRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.PositionMaintenanceRequest();
	
			case cl.bithaus.qfix.msg.PositionMaintenanceReport.MSGTYPE:
				return new cl.bithaus.qfix.msg.PositionMaintenanceReport();
	
			case cl.bithaus.qfix.msg.RequestForPositions.MSGTYPE:
				return new cl.bithaus.qfix.msg.RequestForPositions();
	
			case cl.bithaus.qfix.msg.RequestForPositionsAck.MSGTYPE:
				return new cl.bithaus.qfix.msg.RequestForPositionsAck();
	
			case cl.bithaus.qfix.msg.PositionReport.MSGTYPE:
				return new cl.bithaus.qfix.msg.PositionReport();
	
			case cl.bithaus.qfix.msg.AssignmentReport.MSGTYPE:
				return new cl.bithaus.qfix.msg.AssignmentReport();
	
			case cl.bithaus.qfix.msg.CollateralRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.CollateralRequest();
	
			case cl.bithaus.qfix.msg.CollateralAssignment.MSGTYPE:
				return new cl.bithaus.qfix.msg.CollateralAssignment();
	
			case cl.bithaus.qfix.msg.CollateralResponse.MSGTYPE:
				return new cl.bithaus.qfix.msg.CollateralResponse();
	
			case cl.bithaus.qfix.msg.CollateralReport.MSGTYPE:
				return new cl.bithaus.qfix.msg.CollateralReport();
	
			case cl.bithaus.qfix.msg.CollateralInquiry.MSGTYPE:
				return new cl.bithaus.qfix.msg.CollateralInquiry();
	
			case cl.bithaus.qfix.msg.NetworkStatusRequest.MSGTYPE:
				return new cl.bithaus.qfix.msg.NetworkStatusRequest();
	
			case cl.bithaus.qfix.msg.NetworkStatusResponse.MSGTYPE:
				return new cl.bithaus.qfix.msg.NetworkStatusResponse();
	
			case cl.bithaus.qfix.msg.CollateralInquiryAck.MSGTYPE:
				return new cl.bithaus.qfix.msg.CollateralInquiryAck();
	
		}

		return new cl.bithaus.qfix.msg.Message();
	}

	@Override
	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case cl.bithaus.qfix.msg.Logon.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoMsgTypes.FIELD:
					return new cl.bithaus.qfix.msg.Logon.NoMsgTypes();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.Advertisement.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.Advertisement.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.Advertisement.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.Advertisement.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.Advertisement.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.Advertisement.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.Advertisement.NoEvents();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.IndicationOfInterest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.IndicationOfInterest.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.IndicationOfInterest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.IndicationOfInterest.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.IndicationOfInterest.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegStipulations.FIELD:
					return new cl.bithaus.qfix.msg.IndicationOfInterest.NoLegs.NoLegStipulations();
	
				case cl.bithaus.qfix.fields.NoIOIQualifiers.FIELD:
					return new cl.bithaus.qfix.msg.IndicationOfInterest.NoIOIQualifiers();
	
				case cl.bithaus.qfix.fields.NoRoutingIDs.FIELD:
					return new cl.bithaus.qfix.msg.IndicationOfInterest.NoRoutingIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.IndicationOfInterest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.IndicationOfInterest.NoEvents();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.IndicationOfInterest.NoStipulations();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.News.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoRoutingIDs.FIELD:
					return new cl.bithaus.qfix.msg.News.NoRoutingIDs();
	
				case cl.bithaus.qfix.fields.NoRelatedSym.FIELD:
					return new cl.bithaus.qfix.msg.News.NoRelatedSym();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.News.NoRelatedSym.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.News.NoRelatedSym.NoEvents();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.News.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.News.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.News.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.News.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.LinesOfText.FIELD:
					return new cl.bithaus.qfix.msg.News.LinesOfText();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.Email.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoRoutingIDs.FIELD:
					return new cl.bithaus.qfix.msg.Email.NoRoutingIDs();
	
				case cl.bithaus.qfix.fields.NoRelatedSym.FIELD:
					return new cl.bithaus.qfix.msg.Email.NoRelatedSym();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.Email.NoRelatedSym.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.Email.NoRelatedSym.NoEvents();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.Email.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.Email.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.Email.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.Email.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.LinesOfText.FIELD:
					return new cl.bithaus.qfix.msg.Email.LinesOfText();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.QuoteRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoRelatedSym.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequest.NoRelatedSym();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequest.NoRelatedSym.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequest.NoRelatedSym.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequest.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegStipulations.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequest.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoQuoteQualifiers.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequest.NoRelatedSym.NoQuoteQualifiers();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequest.NoRelatedSym.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequest.NoRelatedSym.NoEvents();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequest.NoRelatedSym.NoStipulations();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequest.NoRelatedSym.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequest.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.QuoteResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoQuoteQualifiers.FIELD:
					return new cl.bithaus.qfix.msg.QuoteResponse.NoQuoteQualifiers();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.QuoteResponse.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteResponse.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteResponse.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteResponse.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegStipulations.FIELD:
					return new cl.bithaus.qfix.msg.QuoteResponse.NoLegs.NoLegStipulations();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteResponse.NoLegs.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteResponse.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteResponse.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteResponse.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteResponse.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.QuoteResponse.NoEvents();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.QuoteResponse.NoStipulations();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.QuoteRequestReject.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoRelatedSym.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequestReject.NoRelatedSym();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequestReject.NoRelatedSym.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequestReject.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequestReject.NoRelatedSym.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequestReject.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegStipulations.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequestReject.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequestReject.NoRelatedSym.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequestReject.NoRelatedSym.NoEvents();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequestReject.NoRelatedSym.NoStipulations();
	
				case cl.bithaus.qfix.fields.NoQuoteQualifiers.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequestReject.NoQuoteQualifiers();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequestReject.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteRequestReject.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.RFQRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoRelatedSym.FIELD:
					return new cl.bithaus.qfix.msg.RFQRequest.NoRelatedSym();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.RFQRequest.NoRelatedSym.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.RFQRequest.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.RFQRequest.NoRelatedSym.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.RFQRequest.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.RFQRequest.NoRelatedSym.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.RFQRequest.NoRelatedSym.NoEvents();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.Quote.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoQuoteQualifiers.FIELD:
					return new cl.bithaus.qfix.msg.Quote.NoQuoteQualifiers();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.Quote.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.Quote.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.Quote.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.Quote.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegStipulations.FIELD:
					return new cl.bithaus.qfix.msg.Quote.NoLegs.NoLegStipulations();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.Quote.NoLegs.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.Quote.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.Quote.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.Quote.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.Quote.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.Quote.NoEvents();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.Quote.NoStipulations();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.QuoteCancel.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoQuoteEntries.FIELD:
					return new cl.bithaus.qfix.msg.QuoteCancel.NoQuoteEntries();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.QuoteCancel.NoQuoteEntries.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteCancel.NoQuoteEntries.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteCancel.NoQuoteEntries.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteCancel.NoQuoteEntries.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteCancel.NoQuoteEntries.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.QuoteCancel.NoQuoteEntries.NoEvents();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteCancel.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteCancel.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.QuoteStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusRequest.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusRequest.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusRequest.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusRequest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusRequest.NoEvents();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusRequest.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.QuoteStatusReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusReport.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusReport.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusReport.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegStipulations.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusReport.NoLegs.NoLegStipulations();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusReport.NoLegs.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoQuoteQualifiers.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusReport.NoQuoteQualifiers();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusReport.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusReport.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusReport.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusReport.NoEvents();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.QuoteStatusReport.NoStipulations();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.MassQuote.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoQuoteSets.FIELD:
					return new cl.bithaus.qfix.msg.MassQuote.NoQuoteSets();
	
				case cl.bithaus.qfix.fields.NoQuoteEntries.FIELD:
					return new cl.bithaus.qfix.msg.MassQuote.NoQuoteSets.NoQuoteEntries();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.MassQuote.NoQuoteSets.NoQuoteEntries.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.MassQuote.NoQuoteSets.NoQuoteEntries.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.MassQuote.NoQuoteSets.NoQuoteEntries.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.MassQuote.NoQuoteSets.NoQuoteEntries.NoEvents();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.MassQuote.NoQuoteSets.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.MassQuote.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.MassQuote.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.MassQuoteAcknowledgement.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoQuoteSets.FIELD:
					return new cl.bithaus.qfix.msg.MassQuoteAcknowledgement.NoQuoteSets();
	
				case cl.bithaus.qfix.fields.NoQuoteEntries.FIELD:
					return new cl.bithaus.qfix.msg.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoEvents();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.MassQuoteAcknowledgement.NoQuoteSets.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.MassQuoteAcknowledgement.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.MassQuoteAcknowledgement.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.MarketDataRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoMDEntryTypes.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataRequest.NoMDEntryTypes();
	
				case cl.bithaus.qfix.fields.NoRelatedSym.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataRequest.NoRelatedSym();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataRequest.NoRelatedSym.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataRequest.NoRelatedSym.NoEvents();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataRequest.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataRequest.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoMDEntries.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoMDEntries();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoMDEntries.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoMDEntries.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSides.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoMDEntries.NoSides();
	
				case cl.bithaus.qfix.fields.NoOIBBestPrices.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoMDEntries.NoOIBBestPrices();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataSnapshotFullRefresh.NoEvents();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.MarketDataIncrementalRefresh.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoMDEntries.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataIncrementalRefresh.NoMDEntries();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataIncrementalRefresh.NoMDEntries.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataIncrementalRefresh.NoMDEntries.NoEvents();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataIncrementalRefresh.NoMDEntries.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataIncrementalRefresh.NoMDEntries.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSides.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataIncrementalRefresh.NoMDEntries.NoSides();
	
				case cl.bithaus.qfix.fields.NoOIBBestPrices.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataIncrementalRefresh.NoMDEntries.NoOIBBestPrices();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.MarketDataRequestReject.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoAltMDSource.FIELD:
					return new cl.bithaus.qfix.msg.MarketDataRequestReject.NoAltMDSource();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.SecurityDefinitionRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.SecurityDefinitionRequest.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityDefinitionRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.SecurityDefinitionRequest.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityDefinitionRequest.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityDefinitionRequest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.SecurityDefinitionRequest.NoEvents();
	
				case cl.bithaus.qfix.fields.NoInstrAttrib.FIELD:
					return new cl.bithaus.qfix.msg.SecurityDefinitionRequest.NoInstrAttrib();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.SecurityDefinition.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.SecurityDefinition.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityDefinition.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.SecurityDefinition.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityDefinition.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityDefinition.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.SecurityDefinition.NoEvents();
	
				case cl.bithaus.qfix.fields.NoInstrAttrib.FIELD:
					return new cl.bithaus.qfix.msg.SecurityDefinition.NoInstrAttrib();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.SecurityTypes.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoSecurityTypes.FIELD:
					return new cl.bithaus.qfix.msg.SecurityTypes.NoSecurityTypes();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.SecurityListRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.SecurityListRequest.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityListRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.SecurityListRequest.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityListRequest.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityListRequest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.SecurityListRequest.NoEvents();
	
				case cl.bithaus.qfix.fields.NoInstrAttrib.FIELD:
					return new cl.bithaus.qfix.msg.SecurityListRequest.NoInstrAttrib();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.SecurityList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoRelatedSym.FIELD:
					return new cl.bithaus.qfix.msg.SecurityList.NoRelatedSym();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.SecurityList.NoRelatedSym.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityList.NoRelatedSym.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.SecurityList.NoRelatedSym.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityList.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegStipulations.FIELD:
					return new cl.bithaus.qfix.msg.SecurityList.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityList.NoRelatedSym.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.SecurityList.NoRelatedSym.NoEvents();
	
				case cl.bithaus.qfix.fields.NoInstrAttrib.FIELD:
					return new cl.bithaus.qfix.msg.SecurityList.NoRelatedSym.NoInstrAttrib();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.SecurityList.NoRelatedSym.NoStipulations();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.SecurityListUpdateReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoRelatedSym.FIELD:
					return new cl.bithaus.qfix.msg.SecurityListUpdateReport.NoRelatedSym();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityListUpdateReport.NoRelatedSym.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.SecurityListUpdateReport.NoRelatedSym.NoEvents();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.DerivativeSecurityListRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.DerivativeSecurityListRequest.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.DerivativeSecurityList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoRelatedSym.FIELD:
					return new cl.bithaus.qfix.msg.DerivativeSecurityList.NoRelatedSym();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.DerivativeSecurityList.NoRelatedSym.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.DerivativeSecurityList.NoRelatedSym.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.DerivativeSecurityList.NoRelatedSym.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.DerivativeSecurityList.NoRelatedSym.NoEvents();
	
				case cl.bithaus.qfix.fields.NoInstrAttrib.FIELD:
					return new cl.bithaus.qfix.msg.DerivativeSecurityList.NoRelatedSym.NoInstrAttrib();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.DerivativeSecurityList.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.SecurityStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.SecurityStatusRequest.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityStatusRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.SecurityStatusRequest.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityStatusRequest.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityStatusRequest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.SecurityStatusRequest.NoEvents();
	
				case cl.bithaus.qfix.fields.NoInstrAttrib.FIELD:
					return new cl.bithaus.qfix.msg.SecurityStatusRequest.NoInstrAttrib();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.SecurityStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.SecurityStatus.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityStatus.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.SecurityStatus.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityStatus.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.SecurityStatus.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.SecurityStatus.NoEvents();
	
				case cl.bithaus.qfix.fields.NoInstrAttrib.FIELD:
					return new cl.bithaus.qfix.msg.SecurityStatus.NoInstrAttrib();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.NewOrderSingle.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoTradingSessions.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderSingle.NoTradingSessions();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderSingle.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderSingle.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderSingle.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderSingle.NoEvents();
	
				case cl.bithaus.qfix.fields.NoSpecialOrderData.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderSingle.NoSpecialOrderData();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.ExecutionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoContraBrokers.FIELD:
					return new cl.bithaus.qfix.msg.ExecutionReport.NoContraBrokers();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.ExecutionReport.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.ExecutionReport.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegStipulations.FIELD:
					return new cl.bithaus.qfix.msg.ExecutionReport.NoLegs.NoLegStipulations();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.ExecutionReport.NoLegs.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.ExecutionReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.ExecutionReport.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.ExecutionReport.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.ExecutionReport.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.ExecutionReport.NoEvents();
	
				case cl.bithaus.qfix.fields.NoSpecialOrderData.FIELD:
					return new cl.bithaus.qfix.msg.ExecutionReport.NoSpecialOrderData();
	
				case cl.bithaus.qfix.fields.NoOIBBestPrices.FIELD:
					return new cl.bithaus.qfix.msg.ExecutionReport.NoOIBBestPrices();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.DontKnowTrade.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.DontKnowTrade.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.DontKnowTrade.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.DontKnowTrade.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.DontKnowTrade.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.DontKnowTrade.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.DontKnowTrade.NoEvents();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.OrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.OrderCancelReplaceRequest.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.OrderCancelReplaceRequest.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.OrderCancelReplaceRequest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.OrderCancelReplaceRequest.NoEvents();
	
				case cl.bithaus.qfix.fields.NoSpecialOrderData.FIELD:
					return new cl.bithaus.qfix.msg.OrderCancelReplaceRequest.NoSpecialOrderData();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.OrderCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.OrderCancelRequest.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.OrderCancelRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.OrderCancelRequest.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.OrderCancelRequest.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.OrderCancelRequest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.OrderCancelRequest.NoEvents();
	
				case cl.bithaus.qfix.fields.NoSpecialOrderData.FIELD:
					return new cl.bithaus.qfix.msg.OrderCancelRequest.NoSpecialOrderData();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.OrderStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.OrderStatusRequest.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.OrderStatusRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.OrderStatusRequest.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.OrderStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.OrderStatusRequest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.OrderStatusRequest.NoEvents();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.OrderMassCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.OrderMassCancelRequest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.OrderMassCancelRequest.NoEvents();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.OrderMassCancelRequest.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.OrderMassCancelReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoAffectedOrders.FIELD:
					return new cl.bithaus.qfix.msg.OrderMassCancelReport.NoAffectedOrders();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.OrderMassCancelReport.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.OrderMassCancelReport.NoEvents();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.OrderMassCancelReport.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.OrderMassStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.OrderMassStatusRequest.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.OrderMassStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.OrderMassStatusRequest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.OrderMassStatusRequest.NoEvents();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.OrderMassStatusRequest.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.NewOrderCross.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoSides.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderCross.NoSides();
	
				case cl.bithaus.qfix.fields.NoAllocs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderCross.NoSides.NoAllocs();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderCross.NoSides.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderCross.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderCross.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderCross.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderCross.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderCross.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderCross.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderCross.NoEvents();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderCross.NoStipulations();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoSides.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoSides();
	
				case cl.bithaus.qfix.fields.NoAllocs.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoSides.NoAllocs();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoEvents();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelReplaceRequest.NoStipulations();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.CrossOrderCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoSides.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoSides();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoSides.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.CrossOrderCancelRequest.NoEvents();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.NewOrderMultileg.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoAllocs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoAllocs();
	
				case cl.bithaus.qfix.fields.NoNested3PartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoAllocs.NoNested3PartyIDs();
	
				case cl.bithaus.qfix.fields.NoNested3PartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case cl.bithaus.qfix.fields.NoTradingSessions.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoTradingSessions();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegAllocs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoLegs.NoLegAllocs();
	
				case cl.bithaus.qfix.fields.NoNested2PartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case cl.bithaus.qfix.fields.NoNested2PartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegStipulations.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoLegs.NoLegStipulations();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoLegs.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderMultileg.NoEvents();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoAllocs.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoAllocs();
	
				case cl.bithaus.qfix.fields.NoNested3PartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoAllocs.NoNested3PartyIDs();
	
				case cl.bithaus.qfix.fields.NoNested3PartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case cl.bithaus.qfix.fields.NoTradingSessions.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoTradingSessions();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegAllocs.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoLegs.NoLegAllocs();
	
				case cl.bithaus.qfix.fields.NoNested2PartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case cl.bithaus.qfix.fields.NoNested2PartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegStipulations.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoLegs.NoLegStipulations();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoLegs.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.MultilegOrderCancelReplaceRequest.NoEvents();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.BidRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoBidDescriptors.FIELD:
					return new cl.bithaus.qfix.msg.BidRequest.NoBidDescriptors();
	
				case cl.bithaus.qfix.fields.NoBidComponents.FIELD:
					return new cl.bithaus.qfix.msg.BidRequest.NoBidComponents();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.BidResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoBidComponents.FIELD:
					return new cl.bithaus.qfix.msg.BidResponse.NoBidComponents();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.NewOrderList.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoOrders.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderList.NoOrders();
	
				case cl.bithaus.qfix.fields.NoTradingSessions.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderList.NoOrders.NoTradingSessions();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderList.NoOrders.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderList.NoOrders.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderList.NoOrders.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderList.NoOrders.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderList.NoOrders.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderList.NoOrders.NoEvents();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.NewOrderList.NoOrders.NoStipulations();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.ListStrikePrice.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoStrikes.FIELD:
					return new cl.bithaus.qfix.msg.ListStrikePrice.NoStrikes();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.ListStrikePrice.NoStrikes.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.ListStrikePrice.NoStrikes.NoEvents();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.ListStrikePrice.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.ListStrikePrice.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.ListStatus.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoOrders.FIELD:
					return new cl.bithaus.qfix.msg.ListStatus.NoOrders();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.ListCancelRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.ListCancelRequest.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.ListCancelRequest.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.ListCancelRequest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.ListCancelRequest.NoEvents();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.AllocationInstruction.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoOrders.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoOrders();
	
				case cl.bithaus.qfix.fields.NoNested2PartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoOrders.NoNested2PartyIDs();
	
				case cl.bithaus.qfix.fields.NoNested2PartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case cl.bithaus.qfix.fields.NoExecs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoExecs();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoAllocs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoAllocs();
	
				case cl.bithaus.qfix.fields.NoMiscFees.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoAllocs.NoMiscFees();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoAllocs.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoDlvyInst.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoAllocs.NoDlvyInst();
	
				case cl.bithaus.qfix.fields.NoSettlPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoAllocs.NoDlvyInst.NoSettlPartyIDs();
	
				case cl.bithaus.qfix.fields.NoSettlPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoAllocs.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoEvents();
	
				case cl.bithaus.qfix.fields.NoInstrAttrib.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoInstrAttrib();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstruction.NoStipulations();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.AllocationInstructionAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoAllocs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstructionAck.NoAllocs();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstructionAck.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationInstructionAck.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.AllocationReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoOrders.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoOrders();
	
				case cl.bithaus.qfix.fields.NoNested2PartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoOrders.NoNested2PartyIDs();
	
				case cl.bithaus.qfix.fields.NoNested2PartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case cl.bithaus.qfix.fields.NoExecs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoExecs();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoAllocs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoAllocs();
	
				case cl.bithaus.qfix.fields.NoMiscFees.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoAllocs.NoMiscFees();
	
				case cl.bithaus.qfix.fields.NoClearingInstructions.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoAllocs.NoClearingInstructions();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoAllocs.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoDlvyInst.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoAllocs.NoDlvyInst();
	
				case cl.bithaus.qfix.fields.NoSettlPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoAllocs.NoDlvyInst.NoSettlPartyIDs();
	
				case cl.bithaus.qfix.fields.NoSettlPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoAllocs.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoEvents();
	
				case cl.bithaus.qfix.fields.NoInstrAttrib.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoInstrAttrib();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReport.NoStipulations();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.AllocationReportAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoAllocs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReportAck.NoAllocs();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReportAck.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.AllocationReportAck.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.Confirmation.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoOrders.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoOrders();
	
				case cl.bithaus.qfix.fields.NoNested2PartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoOrders.NoNested2PartyIDs();
	
				case cl.bithaus.qfix.fields.NoNested2PartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoCapacities.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoCapacities();
	
				case cl.bithaus.qfix.fields.NoMiscFees.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoMiscFees();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoTrdRegTimestamps.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoTrdRegTimestamps();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoEvents();
	
				case cl.bithaus.qfix.fields.NoInstrAttrib.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoInstrAttrib();
	
				case cl.bithaus.qfix.fields.NoDlvyInst.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoDlvyInst();
	
				case cl.bithaus.qfix.fields.NoSettlPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoDlvyInst.NoSettlPartyIDs();
	
				case cl.bithaus.qfix.fields.NoSettlPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.Confirmation.NoStipulations();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.ConfirmationRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoOrders.FIELD:
					return new cl.bithaus.qfix.msg.ConfirmationRequest.NoOrders();
	
				case cl.bithaus.qfix.fields.NoNested2PartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.ConfirmationRequest.NoOrders.NoNested2PartyIDs();
	
				case cl.bithaus.qfix.fields.NoNested2PartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.ConfirmationRequest.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.SettlementInstructions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoSettlInst.FIELD:
					return new cl.bithaus.qfix.msg.SettlementInstructions.NoSettlInst();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.SettlementInstructions.NoSettlInst.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.SettlementInstructions.NoSettlInst.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoDlvyInst.FIELD:
					return new cl.bithaus.qfix.msg.SettlementInstructions.NoSettlInst.NoDlvyInst();
	
				case cl.bithaus.qfix.fields.NoSettlPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.SettlementInstructions.NoSettlInst.NoDlvyInst.NoSettlPartyIDs();
	
				case cl.bithaus.qfix.fields.NoSettlPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.SettlementInstructions.NoSettlInst.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.SettlementInstructionRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.SettlementInstructionRequest.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.SettlementInstructionRequest.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.TradeCaptureReportRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportRequest.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportRequest.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportRequest.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoDates.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportRequest.NoDates();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportRequest.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportRequest.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportRequest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportRequest.NoEvents();
	
				case cl.bithaus.qfix.fields.NoInstrAttrib.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportRequest.NoInstrAttrib();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.TradeCaptureReportRequestAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportRequestAck.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportRequestAck.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportRequestAck.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportRequestAck.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportRequestAck.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportRequestAck.NoEvents();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.TradeCaptureReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegStipulations.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoLegs.NoLegStipulations();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoLegs.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSides.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoSides();
	
				case cl.bithaus.qfix.fields.NoClearingInstructions.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoSides.NoClearingInstructions();
	
				case cl.bithaus.qfix.fields.NoContAmts.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoSides.NoContAmts();
	
				case cl.bithaus.qfix.fields.NoMiscFees.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoSides.NoMiscFees();
	
				case cl.bithaus.qfix.fields.NoAllocs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoSides.NoAllocs();
	
				case cl.bithaus.qfix.fields.NoNested2PartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs();
	
				case cl.bithaus.qfix.fields.NoNested2PartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoSides.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoSides.NoStipulations();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoEvents();
	
				case cl.bithaus.qfix.fields.NoPosAmt.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoPosAmt();
	
				case cl.bithaus.qfix.fields.NoTrdRegTimestamps.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReport.NoTrdRegTimestamps();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.TradeCaptureReportAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportAck.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportAck.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoLegStipulations.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportAck.NoLegs.NoLegStipulations();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoAllocs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportAck.NoAllocs();
	
				case cl.bithaus.qfix.fields.NoNested2PartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportAck.NoAllocs.NoNested2PartyIDs();
	
				case cl.bithaus.qfix.fields.NoNested2PartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportAck.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportAck.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportAck.NoEvents();
	
				case cl.bithaus.qfix.fields.NoTrdRegTimestamps.FIELD:
					return new cl.bithaus.qfix.msg.TradeCaptureReportAck.NoTrdRegTimestamps();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.RegistrationInstructions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoRegistDtls.FIELD:
					return new cl.bithaus.qfix.msg.RegistrationInstructions.NoRegistDtls();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoDistribInsts.FIELD:
					return new cl.bithaus.qfix.msg.RegistrationInstructions.NoDistribInsts();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.RegistrationInstructions.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.RegistrationInstructions.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.RegistrationInstructionsResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.RegistrationInstructionsResponse.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.RegistrationInstructionsResponse.NoPartyIDs.NoPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.PositionMaintenanceRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoTradingSessions.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoTradingSessions();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoEvents();
	
				case cl.bithaus.qfix.fields.NoPositions.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoPositions();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.PositionMaintenanceReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceReport.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceReport.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceReport.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoTradingSessions.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceReport.NoTradingSessions();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceReport.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceReport.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceReport.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceReport.NoEvents();
	
				case cl.bithaus.qfix.fields.NoPositions.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceReport.NoPositions();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoPosAmt.FIELD:
					return new cl.bithaus.qfix.msg.PositionMaintenanceReport.NoPosAmt();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.RequestForPositions.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositions.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositions.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositions.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositions.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoTradingSessions.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositions.NoTradingSessions();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositions.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositions.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositions.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositions.NoEvents();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.RequestForPositionsAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositionsAck.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositionsAck.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositionsAck.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositionsAck.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositionsAck.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositionsAck.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositionsAck.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.RequestForPositionsAck.NoEvents();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.PositionReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoLegs.FIELD:
					return new cl.bithaus.qfix.msg.PositionReport.NoLegs();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.PositionReport.NoLegs.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.PositionReport.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.PositionReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.PositionReport.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.PositionReport.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.PositionReport.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.PositionReport.NoEvents();
	
				case cl.bithaus.qfix.fields.NoPositions.FIELD:
					return new cl.bithaus.qfix.msg.PositionReport.NoPositions();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.PositionReport.NoPositions.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.PositionReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoPosAmt.FIELD:
					return new cl.bithaus.qfix.msg.PositionReport.NoPosAmt();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.AssignmentReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.AssignmentReport.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.AssignmentReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.AssignmentReport.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.AssignmentReport.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.AssignmentReport.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.AssignmentReport.NoEvents();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.AssignmentReport.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoPositions.FIELD:
					return new cl.bithaus.qfix.msg.AssignmentReport.NoPositions();
	
				case cl.bithaus.qfix.fields.NoNestedPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.AssignmentReport.NoPositions.NoNestedPartyIDs();
	
				case cl.bithaus.qfix.fields.NoNestedPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.AssignmentReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoPosAmt.FIELD:
					return new cl.bithaus.qfix.msg.AssignmentReport.NoPosAmt();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.CollateralRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoExecs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralRequest.NoExecs();
	
				case cl.bithaus.qfix.fields.NoTrades.FIELD:
					return new cl.bithaus.qfix.msg.CollateralRequest.NoTrades();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.CollateralRequest.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralRequest.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoMiscFees.FIELD:
					return new cl.bithaus.qfix.msg.CollateralRequest.NoMiscFees();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralRequest.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralRequest.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralRequest.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.CollateralRequest.NoEvents();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralRequest.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoTrdRegTimestamps.FIELD:
					return new cl.bithaus.qfix.msg.CollateralRequest.NoTrdRegTimestamps();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.CollateralRequest.NoStipulations();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.CollateralAssignment.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoExecs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralAssignment.NoExecs();
	
				case cl.bithaus.qfix.fields.NoTrades.FIELD:
					return new cl.bithaus.qfix.msg.CollateralAssignment.NoTrades();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.CollateralAssignment.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralAssignment.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoMiscFees.FIELD:
					return new cl.bithaus.qfix.msg.CollateralAssignment.NoMiscFees();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralAssignment.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralAssignment.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralAssignment.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.CollateralAssignment.NoEvents();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralAssignment.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoTrdRegTimestamps.FIELD:
					return new cl.bithaus.qfix.msg.CollateralAssignment.NoTrdRegTimestamps();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.CollateralAssignment.NoStipulations();
	
				case cl.bithaus.qfix.fields.NoDlvyInst.FIELD:
					return new cl.bithaus.qfix.msg.CollateralAssignment.NoDlvyInst();
	
				case cl.bithaus.qfix.fields.NoSettlPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralAssignment.NoDlvyInst.NoSettlPartyIDs();
	
				case cl.bithaus.qfix.fields.NoSettlPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralAssignment.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.CollateralResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoExecs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralResponse.NoExecs();
	
				case cl.bithaus.qfix.fields.NoTrades.FIELD:
					return new cl.bithaus.qfix.msg.CollateralResponse.NoTrades();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.CollateralResponse.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralResponse.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoMiscFees.FIELD:
					return new cl.bithaus.qfix.msg.CollateralResponse.NoMiscFees();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralResponse.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralResponse.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralResponse.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.CollateralResponse.NoEvents();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralResponse.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoTrdRegTimestamps.FIELD:
					return new cl.bithaus.qfix.msg.CollateralResponse.NoTrdRegTimestamps();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.CollateralResponse.NoStipulations();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.CollateralReport.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoExecs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralReport.NoExecs();
	
				case cl.bithaus.qfix.fields.NoTrades.FIELD:
					return new cl.bithaus.qfix.msg.CollateralReport.NoTrades();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.CollateralReport.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralReport.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoMiscFees.FIELD:
					return new cl.bithaus.qfix.msg.CollateralReport.NoMiscFees();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralReport.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralReport.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralReport.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.CollateralReport.NoEvents();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralReport.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoTrdRegTimestamps.FIELD:
					return new cl.bithaus.qfix.msg.CollateralReport.NoTrdRegTimestamps();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.CollateralReport.NoStipulations();
	
				case cl.bithaus.qfix.fields.NoDlvyInst.FIELD:
					return new cl.bithaus.qfix.msg.CollateralReport.NoDlvyInst();
	
				case cl.bithaus.qfix.fields.NoSettlPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralReport.NoDlvyInst.NoSettlPartyIDs();
	
				case cl.bithaus.qfix.fields.NoSettlPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralReport.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.CollateralInquiry.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoCollInquiryQualifier.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiry.NoCollInquiryQualifier();
	
				case cl.bithaus.qfix.fields.NoExecs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiry.NoExecs();
	
				case cl.bithaus.qfix.fields.NoTrades.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiry.NoTrades();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiry.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiry.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiry.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiry.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiry.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiry.NoEvents();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiry.NoLegSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoTrdRegTimestamps.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiry.NoTrdRegTimestamps();
	
				case cl.bithaus.qfix.fields.NoStipulations.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiry.NoStipulations();
	
				case cl.bithaus.qfix.fields.NoDlvyInst.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiry.NoDlvyInst();
	
				case cl.bithaus.qfix.fields.NoSettlPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiry.NoDlvyInst.NoSettlPartyIDs();
	
				case cl.bithaus.qfix.fields.NoSettlPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiry.NoDlvyInst.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.NetworkStatusRequest.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoCompIDs.FIELD:
					return new cl.bithaus.qfix.msg.NetworkStatusRequest.NoCompIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.NetworkStatusResponse.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoCompIDs.FIELD:
					return new cl.bithaus.qfix.msg.NetworkStatusResponse.NoCompIDs();
	
				}
				break;
	
			case cl.bithaus.qfix.msg.CollateralInquiryAck.MSGTYPE:
				switch (correspondingFieldID) {
			
				case cl.bithaus.qfix.fields.NoCollInquiryQualifier.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiryAck.NoCollInquiryQualifier();
	
				case cl.bithaus.qfix.fields.NoExecs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiryAck.NoExecs();
	
				case cl.bithaus.qfix.fields.NoTrades.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiryAck.NoTrades();
	
				case cl.bithaus.qfix.fields.NoUnderlyings.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiryAck.NoUnderlyings();
	
				case cl.bithaus.qfix.fields.NoUnderlyingSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiryAck.NoUnderlyings.NoUnderlyingSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoPartyIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiryAck.NoPartyIDs();
	
				case cl.bithaus.qfix.fields.NoPartySubIDs.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiryAck.NoPartyIDs.NoPartySubIDs();
	
				case cl.bithaus.qfix.fields.NoSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiryAck.NoSecurityAltID();
	
				case cl.bithaus.qfix.fields.NoEvents.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiryAck.NoEvents();
	
				case cl.bithaus.qfix.fields.NoLegSecurityAltID.FIELD:
					return new cl.bithaus.qfix.msg.CollateralInquiryAck.NoLegSecurityAltID();
	
				}
				break;
	
		}

		return null;
	}
}
