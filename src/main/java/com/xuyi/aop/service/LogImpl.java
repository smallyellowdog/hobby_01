package com.xuyi.aop.service;

import java.util.Date;

public class LogImpl implements Action {
    @Override
    public void before() {
        System.out.println(new Date() + "..开始记录日志");
    }

    @Override
    public void after() {
        System.out.println(new Date() + "..结束记录日志");
    }
}
