package com.xuyi.designpattern.factory.method;

import com.xuyi.designpattern.factory.business.Log;
import com.xuyi.designpattern.factory.business.Log1;

public class Log1Factory implements LogFactory{
    @Override
    public Log getInstance() {
        return new Log1();
    }
}
