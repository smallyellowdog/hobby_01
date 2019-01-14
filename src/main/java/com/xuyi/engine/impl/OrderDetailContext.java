package com.xuyi.engine.impl;

import com.xuyi.engine.basic.BasicContext;
import com.xuyi.engine.otherinfo.OrderInfo;
import com.xuyi.engine.otherinfo.SupplierInfo;
import com.xuyi.engine.otherinfo.UserInfo;
import lombok.Data;

/**
 * 订单上下文对象
 */
@Data
public class OrderDetailContext implements BasicContext<OrderQueryRequest,OrderQueryResponse> {

    private OrderQueryRequest orderQueryRequest;

    private OrderQueryResponse orderQueryResponse;

    private SupplierInfo supplierInfo;

    private UserInfo userInfo;

    private OrderInfo orderInfo;

    @Override
    public OrderQueryRequest getRequest() {
        return orderQueryRequest;
    }

    @Override
    public OrderQueryResponse getResponse() {
        return orderQueryResponse;
    }
}
