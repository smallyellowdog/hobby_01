package com.xuyi.designpattern.engine.basic;

import java.util.Map;

public interface BasicEngine {
    BasicEngine register(Class<? extends BasicProcessor> BasicProcessorType);

    BasicEngine start(Map<Class,Object> map);
    void excute(BasicContext context);
}
