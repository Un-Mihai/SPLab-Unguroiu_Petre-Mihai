package com.petremihai.SPLab.lab1.elements;

import com.petremihai.SPLab.lab1.Element;
import com.petremihai.SPLab.lab1.Visitor;
import jakarta.persistence.Entity;

@Entity
public class Table extends BaseElement {
    private String title;

    protected Table() {}

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void render() {
        System.out.println("Table with title: " + title);
    }

    @Override public void add(Element e) {}
    @Override public void remove(Element e) {}
    @Override public Element get(int index) { return null; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
