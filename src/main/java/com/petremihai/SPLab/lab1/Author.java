package com.petremihai.SPLab.lab1;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void print(){
        System.out.println(name + " " + surname);
    }

    @Override
    public String toString(){
        return name + " " + surname;
    }
}
