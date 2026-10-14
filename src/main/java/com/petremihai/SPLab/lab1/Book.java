package com.petremihai.SPLab.lab1;

import com.petremihai.SPLab.lab1.elements.Section;
import java.util.ArrayList;
import java.util.List;

public class Book implements Element {
    private String title;
    private List<Element> contents = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addContent(Element e) {
        contents.add(e);
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
        for (Element e : contents) {
            e.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element e : contents) {
            e.accept(visitor);
        }
    }

    @Override public void add(Element e) { addContent(e); }
    @Override public void remove(Element e) { contents.remove(e); }
    @Override public Element get(int index) { return contents.get(index); }
}