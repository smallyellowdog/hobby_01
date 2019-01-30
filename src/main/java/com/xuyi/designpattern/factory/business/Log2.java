package com.xuyi.designpattern.factory.business;

import java.util.Date;

public class Log2 implements Log {
    @Override
    public void console() {
        System.out.print( "log2: " + new Date());
    }
}
