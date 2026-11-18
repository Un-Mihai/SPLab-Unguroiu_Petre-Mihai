package com.petremihai.SPLab.lab1;

public interface Element {
    void render();
    void add(Element e);
    void remove(Element e);
    Element get(int index);
    public void accept(Visitor visitor);
}