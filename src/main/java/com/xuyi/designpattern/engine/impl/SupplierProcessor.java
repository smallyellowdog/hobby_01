package com.xuyi.designpattern.engine.impl;

import com.xuyi.designpattern.engine.basic.BasicProcessor;
import com.xuyi.designpattern.engine.otherinfo.SupplierInfo;

public class SupplierProcessor implements BasicProcessor<OrderDetailContext> {
    @Override
    public void excute(OrderDetailContext context) {
        //mock supplierinfo
        SupplierInfo supplierInfo = new SupplierInfo();

        context.setSupplierInfo(supplierInfo);
    }
}
