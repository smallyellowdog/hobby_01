package com.xuyi.engine.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        //假设容器装着processor
        Map<Class,Object> contains = new ConcurrentHashMap<>();

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

        //excute
    }
}
