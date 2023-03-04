package com.demo.tt.behavioral.observer.demo;



public class ConcreteObserver implements AbstractObserver{

    @Override
    public void handle() {
        System.out.println("i am a observer, i get message now");
    }
}
