package com.xuyi.engine.impl;

import com.xuyi.engine.basic.BasicContext;
import com.xuyi.engine.basic.BasicProcessor;
import com.xuyi.engine.otherinfo.OrderInfo;

public class OrderDetailProcessor implements BasicProcessor<OrderDetailContext> {
    @Override
    public void excute(OrderDetailContext context) {

        //mock orderInfo
        OrderInfo orderInfo = new OrderInfo();

        context.setOrderInfo(orderInfo);
    }
}
