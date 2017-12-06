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

/**
 * Fix Components Class
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


}

