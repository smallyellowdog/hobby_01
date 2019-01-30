package com.xuyi.designpattern.factory.simple;

import com.xuyi.designpattern.factory.business.Log;
import com.xuyi.designpattern.factory.business.LogType;

public class Main {
    public static void main(String[] args) {
        Log log1 = LogFactory.getLogFactory(LogType.LOG1);
        log1.console();

        Log log2 = LogFactory.getLogFactory(LogType.LOG2);
        log2.console();
    }
}
