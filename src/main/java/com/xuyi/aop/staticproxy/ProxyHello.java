package com.xuyi.aop.staticproxy;

import com.xuyi.aop.service.LogUtils;
import com.xuyi.aop.target.Hello;

public class ProxyHello implements Hello {

    private Hello hello;

    public ProxyHello(Hello hello) {
        this.hello = hello;
    }

    @Override
    public String sayHello() {
        LogUtils.printLog();
        return hello.sayHello();
    }
}
