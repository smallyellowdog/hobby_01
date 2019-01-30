package com.xuyi.designpattern.engine.basic;

public interface BasicProcessor <CONTEXT extends BasicContext> {
    void excute(CONTEXT context);
}
