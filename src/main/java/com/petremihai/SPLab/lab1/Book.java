package com.petremihai.SPLab.lab1;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;
    private List<Element> elements;

    public Book(String title){
        this.title = title;
        this.authors = new ArrayList<>();
        this.elements = new ArrayList<>();
    }

    public void addAuthor(Author author){
        this.authors.add(author);
    }

    public void addElement(Element element){
        this.elements.add(element);
    }

    public void print(){
        System.out.println("Title: " + this.title);
        System.out.println("Authors: ");
        for(Author author : this.authors){
            author.print();
        }
        System.out.println("Elements: ");
        for(Element element : this.elements){
            element.print();
        }
    }
}
