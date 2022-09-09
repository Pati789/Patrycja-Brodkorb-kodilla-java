package com.kodilla.patterns2.observer.homework;


public interface ObservableH {

    void registerObserver(ObserverH observer);
    void notifyObservers();
    void removeObserver(ObserverH observer);


}
