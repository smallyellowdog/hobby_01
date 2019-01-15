package com.xuyi.aop;

import com.google.common.collect.Lists;
import com.xuyi.aop.dynamic.CglibProxy;
import com.xuyi.aop.dynamic.DynamicProxyHello;
import com.xuyi.aop.service.AuthService;
import com.xuyi.aop.service.LogImpl;
import com.xuyi.aop.target.Hello;
import com.xuyi.aop.target.HelloImpl;
import com.xuyi.aop.target.Sleep;
import com.xuyi.aop.staticproxy.ProxyHello;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //static aop、
        ProxyHello proxyHello = new ProxyHello(new HelloImpl());
        System.out.println(proxyHello.sayHello());


        //切面类，多切面
        List list = Lists.newArrayList();
        list.add(new LogImpl());
        list.add(new AuthService());//add(...)

        //jdk dynamic aop、
        Hello hello = (Hello) new DynamicProxyHello().bind(new HelloImpl(),list);

        String s = hello.sayHello();

        System.out.println(s);

        //cglib dynamic aop、
        Sleep sleep = new Sleep();
        Sleep sleepProxy = (Sleep)new CglibProxy().newInstance(sleep,list);
        sleepProxy.huhu();
        sleepProxy.zuomeng();
    }
}
