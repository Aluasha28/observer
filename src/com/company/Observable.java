package com.company;

import java.util.ArrayList;

public abstract class Observable {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    public void subscribe(Observer observer){
        if (!observers.contains(observer)){
            observers.add(observer);
        }
    };
    public void unsubscribe(Observer observer){
        if (observers.contains(observer)){
            observers.remove(observer);
        }
    };
    public void sendMessage(Message post){
        for (Observer observer : observers){
            observer.update(post);
        }
    };
}
