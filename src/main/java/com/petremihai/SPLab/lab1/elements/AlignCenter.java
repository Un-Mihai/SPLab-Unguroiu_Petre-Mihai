package com.petremihai.SPLab.lab1.elements;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(String text) {
        System.out.println("  **** " + text + " ****");
    }
}