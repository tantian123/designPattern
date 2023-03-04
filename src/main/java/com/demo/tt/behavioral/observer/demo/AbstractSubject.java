package com.demo.tt.behavioral.observer.demo;


public interface AbstractSubject {

    void addObserver(AbstractObserver observer);

    void deleteObserver(AbstractObserver observer);

    void notifyObservers();
}
