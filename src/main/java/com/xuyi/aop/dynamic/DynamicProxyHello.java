package com.xuyi.aop.dynamic;

import com.xuyi.aop.constant.MethodPositionEnum;
import com.xuyi.aop.util.ProxyUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

public class DynamicProxyHello implements InvocationHandler {

    private Object target;

    private List<Object> proxys;

    public Object bind(Object o,List<Object> proxys){
        this.target = o;
        this.proxys = proxys;
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        ProxyUtil.action(proxys,MethodPositionEnum.BEFORE);

        Object result = method.invoke(target,args);

        ProxyUtil.action(proxys,MethodPositionEnum.AFTER);

        return result;
    }


}
