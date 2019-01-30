package com.xuyi.designpattern.simple;

/**
 * 懒汉式，线程不安全，多线程下会引发线程安全问题
 * example：如A线程进入这个方法还没有初始化，B线程也进来了这时候对导致最后初始化两个
 */
public class SingleLazyObject {
    private static SingleLazyObject singleObject;

    private SingleLazyObject(){}

    public static SingleLazyObject getInstance(){
        if(singleObject == null){
            singleObject = new SingleLazyObject();
        }
        return singleObject;
    }
}
