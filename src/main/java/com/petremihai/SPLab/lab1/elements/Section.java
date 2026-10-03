package com.petremihai.SPLab.lab1.elements;

import com.petremihai.SPLab.lab1.Element;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    private String title;
    private List<Element> elements;

    public Section(String title){
        this.title = title;
        this.elements = new ArrayList<>();
    }

    @Override
    public void print(){
        System.out.println("Section Title: " + this.title);
        for(Element element : this.elements){
            element.print();
        }
    }

    @Override
    public void addElement(Element element){
        this.elements.add(element);
    }

    @Override
    public void removeElement(Element element){
        this.elements.remove(element);
    }

    @Override
    public Element getElement(int index){
        return this.elements.get(index);
    }
}
