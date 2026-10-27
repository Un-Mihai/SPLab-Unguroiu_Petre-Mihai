package com.petremihai.SPLab.lab1.elements;

import com.petremihai.SPLab.lab1.Element;
import com.petremihai.SPLab.lab1.Visitor;
import jakarta.persistence.*;

@Entity
public class ImageProxy extends BaseElement {
    private String url;
    @Transient
    private Image realImg;

    protected ImageProxy() {}

    public ImageProxy(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    private Image loadImage() {
        if (realImg == null) {
            realImg = new Image(url);
        }
        return realImg;
    }

    @Override
    public void print() {
        loadImage().print();
    }

    @Override public void add(Element e) {}
    @Override public void remove(Element e) {}
    @Override public Element get(int index) { return null; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}