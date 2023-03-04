package com.demo.tt.creational.singleton;

// 懒汉
public class SingleTon2 {
    private static SingleTon2 instance;
    private SingleTon2(){
    }
    public SingleTon2 getInstance(){
        if(instance==null){
            instance=new SingleTon2();
        }
        return instance;
    }
}
