package com.petremihai.SPLab.lab1.elements;

import com.petremihai.SPLab.lab1.Element;
import com.petremihai.SPLab.lab1.elements.alignments.AlignRight;
import com.petremihai.SPLab.lab1.elements.alignments.Alignment;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element{
    private String text;
    private List<Element> elements;
    private Alignment alignmentStrategy;

    public Paragraph(String text){
        this.text = text;
        this.elements = new ArrayList<>();
        this.alignmentStrategy = null;
    }

    public String getText(){
        return this.text;
    }

    public int getNumberOfElements(){
        return this.elements.size();
    }

    @Override
    public String toString(){
        return this.text;
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
