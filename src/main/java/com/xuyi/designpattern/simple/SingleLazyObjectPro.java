package com.xuyi.designpattern.simple;

/**
 * 懒汉式 线程安全
 */
public class SingleLazyObjectPro {
    private static SingleLazyObjectPro singleObjectPro;

    private SingleLazyObjectPro(){}

    public static synchronized SingleLazyObjectPro getInstance(){
        if(singleObjectPro == null){
            singleObjectPro = new SingleLazyObjectPro();
        }
        return singleObjectPro;
    }
}
