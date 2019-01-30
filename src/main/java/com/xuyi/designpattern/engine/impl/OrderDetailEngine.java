package com.xuyi.designpattern.engine.impl;

import com.xuyi.designpattern.engine.basic.BasicContext;
import com.xuyi.designpattern.engine.basic.BasicEngine;
import com.xuyi.designpattern.engine.basic.BasicProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderDetailEngine implements BasicEngine {

    private List<Class<? extends BasicProcessor>> registerClass = new ArrayList<>();

    private List<BasicProcessor> basicProcessors = new ArrayList<>();

    @Override
    public BasicEngine register(Class<? extends BasicProcessor> BasicProcessorType) {
        registerClass.add(BasicProcessorType);
        return this;
    }

    @Override
    public void excute(BasicContext context) {
        basicProcessors.forEach(basicProcessor -> {
            basicProcessor.excute(context);
        });
    }

    @Override
    public BasicEngine start(Map<Class, Object> map) {
        this.registerClass.forEach(cs -> {
            BasicProcessor obj = (BasicProcessor)map.get(cs);
            if(obj != null){
                basicProcessors.add(obj);
            }
        });
        return this;
    }
}
