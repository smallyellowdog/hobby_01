package com.xuyi.engine.basic;

public interface BasicProcessor <CONTEXT extends BasicContext> {
    void excute(CONTEXT context);
}
