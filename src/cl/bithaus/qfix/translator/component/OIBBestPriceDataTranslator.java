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

package cl.bithaus.qfix.translator.component;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import quickfix.FieldNotFound;


/**
 * Fix - Bithaus format component translator for OIBBestPriceData
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class OIBBestPriceDataTranslator  {

    public static cl.bithaus.qfix.msg.component.OIBBestPriceData toFix(cl.bithaus.fix.components.OIBBestPriceData src) {

        cl.bithaus.qfix.msg.component.OIBBestPriceData dest = new cl.bithaus.qfix.msg.component.OIBBestPriceData();


        if(src.getNoOIBBestPrices() != null && src.getNoOIBBestPrices().size() > 0) {

            for(cl.bithaus.fix.components.OIBBestPriceData.NoOIBBestPrices.NoOIBBestPricesEntry entry : src.getNoOIBBestPrices().getGroups()) {

                cl.bithaus.qfix.msg.component.OIBBestPriceData.NoOIBBestPrices aux = 
                    new cl.bithaus.qfix.msg.component.OIBBestPriceData.NoOIBBestPrices();

                aux.set(new cl.bithaus.qfix.fields.OIBBestPriceExchange(entry.getOIBBestPriceExchange()));
                aux.set(new cl.bithaus.qfix.fields.OIBBestPriceTime(entry.getOIBBestPriceTime()));
                aux.set(new cl.bithaus.qfix.fields.OIBBestPriceBuyingQty(entry.getOIBBestPriceBuyingQty()));
                aux.set(new cl.bithaus.qfix.fields.OIBBestPriceBuyingPrice(entry.getOIBBestPriceBuyingPrice()));
                aux.set(new cl.bithaus.qfix.fields.OIBBestPriceSellingQty(entry.getOIBBestPriceSellingQty()));
                aux.set(new cl.bithaus.qfix.fields.OIBBestPriceSellingPrice(entry.getOIBBestPriceSellingPrice()));

                dest.addGroup(aux);
            }            
        }

        return dest;
    }

    public static cl.bithaus.fix.components.OIBBestPriceData fromFix(cl.bithaus.qfix.msg.component.OIBBestPriceData src) 
        throws FieldNotFound {

        cl.bithaus.fix.components.OIBBestPriceData dest = new cl.bithaus.fix.components.OIBBestPriceData();



        if(src.isSetNoOIBBestPrices()) {

            List<quickfix.Group> gList = src.getGroups(src.getNoOIBBestPrices().getField());
            List<cl.bithaus.fix.components.OIBBestPriceData.NoOIBBestPrices.NoOIBBestPricesEntry> result = new LinkedList<>();

            cl.bithaus.qfix.fields.OIBBestPriceExchange oIBBestPriceExchange = new cl.bithaus.qfix.fields.OIBBestPriceExchange();
            cl.bithaus.qfix.fields.OIBBestPriceTime oIBBestPriceTime = new cl.bithaus.qfix.fields.OIBBestPriceTime();
            cl.bithaus.qfix.fields.OIBBestPriceBuyingQty oIBBestPriceBuyingQty = new cl.bithaus.qfix.fields.OIBBestPriceBuyingQty();
            cl.bithaus.qfix.fields.OIBBestPriceBuyingPrice oIBBestPriceBuyingPrice = new cl.bithaus.qfix.fields.OIBBestPriceBuyingPrice();
            cl.bithaus.qfix.fields.OIBBestPriceSellingQty oIBBestPriceSellingQty = new cl.bithaus.qfix.fields.OIBBestPriceSellingQty();
            cl.bithaus.qfix.fields.OIBBestPriceSellingPrice oIBBestPriceSellingPrice = new cl.bithaus.qfix.fields.OIBBestPriceSellingPrice();

            for(quickfix.Group g : gList) {

                cl.bithaus.fix.components.OIBBestPriceData.NoOIBBestPrices.NoOIBBestPricesEntry entry = 
                    new cl.bithaus.fix.components.OIBBestPriceData.NoOIBBestPrices.NoOIBBestPricesEntry();

                if(g.isSetField(oIBBestPriceExchange)) {
                    oIBBestPriceExchange = (cl.bithaus.qfix.fields.OIBBestPriceExchange) g.getField(oIBBestPriceExchange);
                    entry.setOIBBestPriceExchange(oIBBestPriceExchange.getValue());

                }
                if(g.isSetField(oIBBestPriceTime)) {
                    oIBBestPriceTime = (cl.bithaus.qfix.fields.OIBBestPriceTime) g.getField(oIBBestPriceTime);
                    entry.setOIBBestPriceTime(oIBBestPriceTime.getValue());

                }
                if(g.isSetField(oIBBestPriceBuyingQty)) {
                    oIBBestPriceBuyingQty = (cl.bithaus.qfix.fields.OIBBestPriceBuyingQty) g.getField(oIBBestPriceBuyingQty);
                    entry.setOIBBestPriceBuyingQty(oIBBestPriceBuyingQty.getValue());

                }
                if(g.isSetField(oIBBestPriceBuyingPrice)) {
                    oIBBestPriceBuyingPrice = (cl.bithaus.qfix.fields.OIBBestPriceBuyingPrice) g.getField(oIBBestPriceBuyingPrice);
                    entry.setOIBBestPriceBuyingPrice(oIBBestPriceBuyingPrice.getValue());

                }
                if(g.isSetField(oIBBestPriceSellingQty)) {
                    oIBBestPriceSellingQty = (cl.bithaus.qfix.fields.OIBBestPriceSellingQty) g.getField(oIBBestPriceSellingQty);
                    entry.setOIBBestPriceSellingQty(oIBBestPriceSellingQty.getValue());

                }
                if(g.isSetField(oIBBestPriceSellingPrice)) {
                    oIBBestPriceSellingPrice = (cl.bithaus.qfix.fields.OIBBestPriceSellingPrice) g.getField(oIBBestPriceSellingPrice);
                    entry.setOIBBestPriceSellingPrice(oIBBestPriceSellingPrice.getValue());

                }

                result.add(entry);                
            }

 
        }

        return dest;

    }
}

