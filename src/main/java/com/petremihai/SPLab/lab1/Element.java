package com.petremihai.SPLab.lab1;

public interface Element {
    void print();
    void addElement(Element element);
    void removeElement(Element element);
    Element getElement(int index);
}
