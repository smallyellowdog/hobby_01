package com.xuyi.designpattern.factory.method;

import com.xuyi.designpattern.factory.business.Log;

/**
 * 工厂方法模式
 */
public class Main {
    public static void main (String[] args) throws Exception{

        LogFactory log1Factory = (LogFactory)Class.forName("com.xuyi.designpattern.factory.method.Log1Factory").newInstance();
        LogFactory log2Factory = (LogFactory)Class.forName("com.xuyi.designpattern.factory.method.Log2Factory").newInstance();

        Log log1 = log1Factory.getInstance();
        Log log2 = log2Factory.getInstance();

        log1.console();
        log2.console();
    }
}
