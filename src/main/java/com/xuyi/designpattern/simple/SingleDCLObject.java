package com.xuyi.designpattern.simple;

/**
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * volatile：保证指令不可重排序
 */
public class SingleDCLObject {
    private volatile static SingleDCLObject singleDCLObject;

    private SingleDCLObject(){}

    public static SingleDCLObject getInstance(){
        if(singleDCLObject == null){
            synchronized (SingleDCLObject.class){
                if(singleDCLObject == null){
                    singleDCLObject = new SingleDCLObject();
                }
            }
        }
        return singleDCLObject;
    }
}
