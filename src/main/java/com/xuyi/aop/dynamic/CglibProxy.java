package com.xuyi.aop.dynamic;

import com.xuyi.aop.constant.MethodPositionEnum;
import com.xuyi.aop.util.ProxyUtil;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.List;

public class CglibProxy implements MethodInterceptor {

    private Object target;

    private List<Object> proxys;

    public Object newInstance(Object o,List<Object> proxys){

        this.target = o;

        this.proxys = proxys;

        //创建加强器，用来创建动态代理类
        Enhancer enhancer = new Enhancer();

        //为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
        enhancer.setSuperclass(this.target.getClass());

        //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
        enhancer.setCallback(this);

        // 创建动态代理类对象并返回
        return enhancer.create();

    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        ProxyUtil.action(proxys, MethodPositionEnum.BEFORE);
        methodProxy.invoke(target,objects);
        ProxyUtil.action(proxys, MethodPositionEnum.AFTER);
        return null;
    }
}
