package com.petremihai.SPLab.observer;

import com.petremihai.SPLab.lab1.Book;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// ConcreteSubject: notifica toti observatorii cand se adauga o carte noua
@Component
public class AllBooksSubject implements Subject {
    private final List<Observer> observers = new CopyOnWriteArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }

    public void add(Book book) {
        notifyObservers(book);
    }
}
