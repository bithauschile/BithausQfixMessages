/*
 * Copyright (c) BitHaus Software Factory & Boutique (Chile)
 * All rights reserved. www.bithaus.cl.
 * 
 * All rights to this product are owned by BitHaus Chile and may only by used 
 * under the terms of its associated license document. 
 * You may NOT copy, modify, sublicense or distribute this source file or 
 * portions of it unless previously authorized by writing by BitHaus Chile.
 * In any event, this notice must always be included verbatim with this file.
 * 
 */

package cl.bithaus.qfix.translator;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import quickfix.FieldNotFound;


/**
 * Fix - Bithaus format component translator for Logon
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class LogonTranslator  {

    public static cl.bithaus.qfix.msg.Logon toFix(cl.bithaus.fix.Logon src) {

        cl.bithaus.qfix.msg.Logon dest = new cl.bithaus.qfix.msg.Logon();

        if(src.getEncryptMethod() != null)
            dest.set(new cl.bithaus.qfix.fields.EncryptMethod(src.getEncryptMethod()));
        
        if(src.getHeartBtInt() != null)
            dest.set(new cl.bithaus.qfix.fields.HeartBtInt(src.getHeartBtInt()));
        
        if(src.getRawDataLength() != null)
            dest.set(new cl.bithaus.qfix.fields.RawDataLength(src.getRawDataLength()));
        
        if(src.getRawData() != null)
            dest.set(new cl.bithaus.qfix.fields.RawData(src.getRawData()));
        
        if(src.getResetSeqNumFlag() != null)
            dest.set(new cl.bithaus.qfix.fields.ResetSeqNumFlag(src.getResetSeqNumFlag()));
        
        if(src.getNextExpectedMsgSeqNum() != null)
            dest.set(new cl.bithaus.qfix.fields.NextExpectedMsgSeqNum(src.getNextExpectedMsgSeqNum()));
        
        if(src.getMaxMessageSize() != null)
            dest.set(new cl.bithaus.qfix.fields.MaxMessageSize(src.getMaxMessageSize()));
        
        if(src.getTestMessageIndicator() != null)
            dest.set(new cl.bithaus.qfix.fields.TestMessageIndicator(src.getTestMessageIndicator()));
        
        if(src.getUsername() != null)
            dest.set(new cl.bithaus.qfix.fields.Username(src.getUsername()));
        
        if(src.getPassword() != null)
            dest.set(new cl.bithaus.qfix.fields.Password(src.getPassword()));
        


        if(src.getNoMsgTypes() != null && src.getNoMsgTypes().size() > 0) {

            for(cl.bithaus.fix.Logon.NoMsgTypes.NoMsgTypesEntry entry : src.getNoMsgTypes().getGroups()) {

                cl.bithaus.qfix.msg.Logon.NoMsgTypes aux = 
                    new cl.bithaus.qfix.msg.Logon.NoMsgTypes();

                aux.set(new cl.bithaus.qfix.fields.RefMsgType(entry.getRefMsgType()));
                if(entry.getMsgDirection().length() > 0)
                    aux.set(new cl.bithaus.qfix.fields.MsgDirection(entry.getMsgDirection().charAt(0)));

                dest.addGroup(aux);
            }            
        }


        return dest;
    }

    public static cl.bithaus.fix.Logon fromFix(cl.bithaus.qfix.msg.Logon src) 
        throws FieldNotFound {

        cl.bithaus.fix.Logon dest = new cl.bithaus.fix.Logon();

        if(src.isSetEncryptMethod())
            dest.setEncryptMethod(src.getEncryptMethod().getValue());

        if(src.isSetHeartBtInt())
            dest.setHeartBtInt(src.getHeartBtInt().getValue());

        if(src.isSetRawDataLength())
            dest.setRawDataLength(src.getRawDataLength().getValue());

        if(src.isSetRawData())
            dest.setRawData(src.getRawData().getValue());

        if(src.isSetResetSeqNumFlag())
            dest.setResetSeqNumFlag(src.getResetSeqNumFlag().getValue());

        if(src.isSetNextExpectedMsgSeqNum())
            dest.setNextExpectedMsgSeqNum(src.getNextExpectedMsgSeqNum().getValue());

        if(src.isSetMaxMessageSize())
            dest.setMaxMessageSize(src.getMaxMessageSize().getValue());

        if(src.isSetTestMessageIndicator())
            dest.setTestMessageIndicator(src.getTestMessageIndicator().getValue());

        if(src.isSetUsername())
            dest.setUsername(src.getUsername().getValue());

        if(src.isSetPassword())
            dest.setPassword(src.getPassword().getValue());




        if(src.isSetNoMsgTypes()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoMsgTypes().getField());
            List<cl.bithaus.fix.Logon.NoMsgTypes.NoMsgTypesEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.RefMsgType refMsgType = new cl.bithaus.qfix.fields.RefMsgType();
            cl.bithaus.qfix.fields.MsgDirection msgDirection = new cl.bithaus.qfix.fields.MsgDirection();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.Logon.NoMsgTypes.NoMsgTypesEntry entry = 
                    new cl.bithaus.fix.Logon.NoMsgTypes.NoMsgTypesEntry();

                if(g.isSetField(refMsgType)) {
                    refMsgType = (cl.bithaus.qfix.fields.RefMsgType) g.getField(refMsgType);
                    entry.setRefMsgType(refMsgType.getValue());

                }
                if(g.isSetField(msgDirection)) {
                    msgDirection = (cl.bithaus.qfix.fields.MsgDirection) g.getField(msgDirection);
                    entry.setMsgDirection(msgDirection.getValue()+"");
                }

                result.add(entry);                
            }

        }
        return dest;

    }
}

