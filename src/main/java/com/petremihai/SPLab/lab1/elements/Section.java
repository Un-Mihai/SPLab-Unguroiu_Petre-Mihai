package com.petremihai.SPLab.lab1.elements;

import com.petremihai.SPLab.lab1.Element;
import com.petremihai.SPLab.lab1.Visitor;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Section extends BaseElement {
    private String title;
    @OneToMany(targetEntity = BaseElement.class, cascade = CascadeType.ALL)
    private List<Element> children = new ArrayList<>();

    protected Section() {}

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<Element> getChildren() {
        return children;
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element e : children) {
            e.print();
        }
    }

    @Override
    public void add(Element e) { children.add(e); }

    @Override
    public void remove(Element e) { children.remove(e); }

    @Override
    public Element get(int index) { return children.get(index); }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element e : children) {
            e.accept(visitor);
        }
    }
}