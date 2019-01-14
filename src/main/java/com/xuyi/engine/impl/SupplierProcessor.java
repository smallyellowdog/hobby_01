package com.xuyi.engine.impl;

import com.xuyi.engine.basic.BasicProcessor;
import com.xuyi.engine.otherinfo.SupplierInfo;

public class SupplierProcessor implements BasicProcessor<OrderDetailContext> {
    @Override
    public void excute(OrderDetailContext context) {
        //mock supplierinfo
        SupplierInfo supplierInfo = new SupplierInfo();

        context.setSupplierInfo(supplierInfo);
    }
}
