package com.demo.tt.creational.singleton;

// 饿汉
// 线程安全 类加载时就创建了
public class SingleTon1 {
    private static SingleTon1 instance=new SingleTon1();

    private SingleTon1(){}

    public SingleTon1 getInstance(){
        return instance;
    }
}
