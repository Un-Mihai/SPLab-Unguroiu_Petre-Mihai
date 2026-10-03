package com.petremihai.SPLab.lab1.elements;

import com.petremihai.SPLab.lab1.Element;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element{
    private String text;
    private List<Element> elements;

    public Paragraph(String text){
        this.text = text;
        this.elements = new ArrayList<>();
    }

    @Override
    public void print(){
        System.out.println(this.text);
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
