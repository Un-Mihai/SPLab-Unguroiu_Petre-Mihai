package com.petremihai.SPLab.observer;

import com.petremihai.SPLab.lab1.Book;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(Book book);
}
