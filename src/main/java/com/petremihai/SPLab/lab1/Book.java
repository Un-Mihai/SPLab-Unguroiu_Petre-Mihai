package com.petremihai.SPLab.lab1;

import com.petremihai.SPLab.lab1.elements.BaseElement;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book implements Element {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;

    @OneToMany(targetEntity = BaseElement.class, cascade = CascadeType.ALL)
    private List<Element> contents = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Author> authors = new ArrayList<>();

    protected Book() {}

    public Book(String title) {
        this.title = title;
    }

    public Integer getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public List<Element> getContents() { return contents; }
    public List<Author> getAuthors() { return authors; }

    public void addContent(Element e) {
        contents.add(e);
    }

    public void addAuthor(Author a) {
        authors.add(a);
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
