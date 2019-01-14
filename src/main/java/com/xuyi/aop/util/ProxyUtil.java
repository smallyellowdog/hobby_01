package com.xuyi.aop.util;

import com.xuyi.aop.constant.MethodPositionEnum;

import java.lang.reflect.Method;
import java.util.List;

public class ProxyUtil {
    public static void action(List<Object> proxys, MethodPositionEnum Action){
        proxys.forEach(proxy ->{
            Class c = proxy.getClass();
            try {
                Method method1 = c.getDeclaredMethod(Action.getCode(),null);
                method1.invoke(proxy,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
