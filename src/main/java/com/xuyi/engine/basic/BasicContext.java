package com.xuyi.engine.basic;

public interface BasicContext<REQ,RESP> {

    REQ getRequest();

    RESP getResponse();
}
