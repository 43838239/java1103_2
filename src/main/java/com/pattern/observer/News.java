package com.pattern.observer;

import java.util.List;

public class News implements Subject{
private List<Observer> observers = new ArrayList<>();

        

    @Override
    public void add(Observer observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Observer observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObserver(Observer observer) {
        observer.Stream().forEach(o ->)
    }
}
