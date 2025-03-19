package com.mycompany;

public interface MySubject {
    void addObserver(MyObserver observer);

    void removeObserver(MyObserver observer);

    void notifyObservers();
}
