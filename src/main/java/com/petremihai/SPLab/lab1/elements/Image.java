package com.petremihai.SPLab.lab1.elements;

import com.petremihai.SPLab.lab1.Element;
import com.petremihai.SPLab.lab1.Visitor;
import jakarta.persistence.*;

import java.util.concurrent.TimeUnit;

@Entity
public class Image extends BaseElement {
    private String url;

    protected Image() {}

    public Image(String url) {
        this.url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + url);
    }

    @Override public void add(Element e) {}
    @Override public void remove(Element e) {}
    @Override public Element get(int index) { return null; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}