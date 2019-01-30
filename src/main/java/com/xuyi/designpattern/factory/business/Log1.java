package com.xuyi.designpattern.factory.business;

import java.util.Date;

public class Log1 implements Log {
    @Override
    public void console() {
        System.out.print( "log1: " + new Date());
    }
}
