package com.petremihai.SPLab.lab1.elements;

import com.petremihai.SPLab.lab1.Element;
import com.petremihai.SPLab.lab1.Visitor;
import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element {
    private List<String> entries;

    public TableOfContents() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String title, int pageNumber) {
        entries.add(title + " .................... " + pageNumber);
    }

    public void print() {
        System.out.println("Table of Contents");
        for (String entry : entries) {
            System.out.println(entry);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override public Element get(int index){
        return null;
    }

    @Override
    public void add(Element e){

    }

    @Override
    public void remove(Element e){

    }
}