package com.demo.tt.behavioral.observer.demo;


import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements AbstractSubject{
    private List<AbstractObserver> observerList=new ArrayList<>();

    @Override
    public void addObserver(AbstractObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(AbstractObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(AbstractObserver::handle);
    }
}
