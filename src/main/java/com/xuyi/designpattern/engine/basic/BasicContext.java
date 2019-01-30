package com.xuyi.designpattern.engine.basic;

public interface BasicContext<REQ,RESP> {

    REQ getRequest();

    RESP getResponse();
}
