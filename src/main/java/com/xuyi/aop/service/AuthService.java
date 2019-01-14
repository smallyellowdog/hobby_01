package com.xuyi.aop.service;

public class AuthService implements Action{
    @Override
    public void before() {
        System.out.println("权限校验开始...");
    }

    @Override
    public void after() {

    }
}
