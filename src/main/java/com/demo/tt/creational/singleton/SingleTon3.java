package com.demo.tt.creational.singleton;

// 双重校验锁
public class SingleTon3 {
    private static SingleTon3 instance;
    private SingleTon3(){
    }
    public SingleTon3 getInstance(){
        if(instance==null){
            synchronized(SingleTon3.class){
                if(instance==null){
                    instance=new SingleTon3();
                }
            }

        }
        return instance;
    }
}
