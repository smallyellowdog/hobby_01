package com.xuyi.designpattern.factory.simple;

import com.xuyi.designpattern.factory.business.Log;
import com.xuyi.designpattern.factory.business.Log1;
import com.xuyi.designpattern.factory.business.Log2;
import com.xuyi.designpattern.factory.business.LogType;

/**
 * 后续如果有新的日志框架接入还要写，不符合开放闭合原则
 */
public class LogFactory {
    public static Log getLogFactory(LogType logType){

        if(logType == LogType.LOG1){
            return new Log1();
        }else if(logType == LogType.LOG2){
            return  new Log2();
        }
        return null;
    }
}
