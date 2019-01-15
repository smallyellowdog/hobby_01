package com.xuyi.engine.impl;

import com.google.common.collect.Maps;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //假设容器装着processor
        Map<Class,Object> contains = Maps.newConcurrentMap();

        contains.put(UserProcessor.class,new UserProcessor());
        contains.put(SupplierProcessor.class,new SupplierProcessor());
        contains.put(OrderDetailProcessor.class,new OrderDetailProcessor());

        //init engine
        OrderDetailEngine orderDetailEngine = new OrderDetailEngine();

        //register processor
        orderDetailEngine.register(UserProcessor.class);
        orderDetailEngine.register(SupplierProcessor.class);
        orderDetailEngine.register(OrderDetailProcessor.class);

        //start processor
        orderDetailEngine.start(contains);

        //mock req
        OrderDetailContext orderDetailContext = new OrderDetailContext();
        OrderQueryRequest orderQueryRequest = new OrderQueryRequest();
        orderDetailContext.setOrderQueryRequest(orderQueryRequest);
        orderQueryRequest.setOrderId(159753l);

        //excute
        orderDetailEngine.excute(orderDetailContext);
    }
}
