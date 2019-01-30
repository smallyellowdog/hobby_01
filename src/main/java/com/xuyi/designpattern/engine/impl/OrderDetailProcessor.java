package com.xuyi.designpattern.engine.impl;

import com.xuyi.designpattern.engine.basic.BasicProcessor;
import com.xuyi.designpattern.engine.otherinfo.OrderInfo;

public class OrderDetailProcessor implements BasicProcessor<OrderDetailContext> {
    @Override
    public void excute(OrderDetailContext context) {

        //mock orderInfo
        OrderInfo orderInfo = new OrderInfo();

        context.setOrderInfo(orderInfo);
    }
}
