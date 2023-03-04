package com.demo.tt.behavioral.observer.demo;

public class Context {
    public static void main(String[] args) {
        ConcreteObserver observer=new ConcreteObserver();
        ConcreteSubject subject=new ConcreteSubject();

        subject.addObserver(observer);
        subject.notifyObservers();

    }
}
