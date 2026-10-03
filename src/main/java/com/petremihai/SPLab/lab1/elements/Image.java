package com.petremihai.SPLab.lab1.elements;

import com.petremihai.SPLab.lab1.Element;

import java.util.List;

public class Image implements Element{
    private String title;
    private String alt;
    private String path;

    public Image(String title){
        this.title = title;
    }

    @Override
    public void print(){
        System.out.println("Image Title: " + this.title);
        System.out.println("Alt: " + this.alt);
    }

    @Override
    public void addElement(Element element){}

    @Override
    public void removeElement(Element element){}

    @Override
    public Element getElement(int index){ return null; }
}
