package com.xuyi.designpattern.simple;

/**
 * 懒汉式，线程安全
 */
public class SingleHungryObject {
    private static SingleHungryObject singleHungryObject;

    private SingleHungryObject(){}

    public static SingleHungryObject getInstance(){
        return singleHungryObject;
    }
}
