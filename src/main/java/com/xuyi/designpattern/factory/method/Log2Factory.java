package com.xuyi.designpattern.factory.method;

import com.xuyi.designpattern.factory.business.Log;
import com.xuyi.designpattern.factory.business.Log2;

public class Log2Factory implements LogFactory {
    @Override
    public Log getInstance() {
        return new Log2();
    }
}
