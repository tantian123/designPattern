package com.demo.tt.creational.singleton;

// 静态内部类
public class SingleTon4 {
    private SingleTon4(){

    }
    public static class SingleTon{
        private static SingleTon4 instance=new SingleTon4();
    }
    public SingleTon4 getInstance(){
        return SingleTon.instance;
    }
}
