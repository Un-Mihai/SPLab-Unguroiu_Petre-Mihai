package com.petremihai.SPLab.lab1;

import jakarta.persistence.*;

@Entity
public class Author {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String surname;

    protected Author() {}

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }

    public void print(){
        System.out.println(name + " " + surname);
    }

    @Override
    public String toString(){
        return name + " " + surname;
    }
}
