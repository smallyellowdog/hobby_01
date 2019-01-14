package com.xuyi.aop.target;

public class Sleep {

    public void huhu(){
        System.out.println("下雪天最喜欢睡觉了...");
    }

    //cglib增强类无法对final修饰的方法进行重写，从而aop失效
    public final void zuomeng(){
        System.out.println("好梦...");
    }
}
