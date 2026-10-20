package com.petremihai.SPLab.lab1;

import com.petremihai.SPLab.lab1.elements.*;

import java.util.HashMap;
import java.util.Map;

public class BookStatistics implements Visitor{
    private Map<String, Integer>  statistics;

    public BookStatistics(){
        this.statistics = new HashMap<>();
    }

    public void printStatistics(){
        System.out.println("Statistics:");
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Override
    public void visit(Paragraph paragraph){
        this.statistics.put(paragraph.getClass().getSimpleName(), this.statistics.getOrDefault(paragraph.getClass().getSimpleName(), 0) + 1);
    }

    @Override
    public void visit(Section section){
        this.statistics.put(section.getClass().getSimpleName(), this.statistics.getOrDefault(section.getClass().getSimpleName(), 0) + 1);
    }

    @Override
    public void visit(Book book) {
        this.statistics.put(book.getClass().getSimpleName(), this.statistics.getOrDefault(book.getClass().getSimpleName(), 0) + 1);
    }

    @Override
    public void visit(Table table) {
        this.statistics.put(table.getClass().getSimpleName(), this.statistics.getOrDefault(table.getClass().getSimpleName(), 0) + 1);
    }

    @Override
    public void visit(Image image) {
        this.statistics.put(image.getClass().getSimpleName(), this.statistics.getOrDefault(image.getClass().getSimpleName(), 0) + 1);
    }

    @Override
    public void visit(ImageProxy imageProxy) {
        this.statistics.put(imageProxy.getClass().getSimpleName(), this.statistics.getOrDefault(imageProxy.getClass().getSimpleName(), 0) + 1);
    }

    @Override
    public void visit(TableOfContents tableOfContents) {
        this.statistics.put(tableOfContents.getClass().getSimpleName(), this.statistics.getOrDefault(tableOfContents.getClass().getSimpleName(), 0) + 1);
    }

}
