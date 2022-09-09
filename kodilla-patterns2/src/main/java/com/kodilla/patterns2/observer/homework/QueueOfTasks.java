package com.kodilla.patterns2.observer.homework;

import java.util.*;

public class QueueOfTasks implements ObservableH {

    private final List<ObserverH> observers;
    private final List<String> queueOfTasks;
    private final String student;



    public QueueOfTasks(final String student) {
        this.observers = new ArrayList<>();
        this.queueOfTasks = new ArrayList<>();
        this.student = student;
    }

    public void addTask(String task) {
        queueOfTasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverH observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverH observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverH observer) {
        observers.remove(observer);
    }

    public List<String> getTasks() {
        return queueOfTasks;
    }

    public String getStudent() {
        return student;
    }
}
