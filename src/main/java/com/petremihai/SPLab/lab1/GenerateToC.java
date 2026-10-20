package com.petremihai.SPLab.lab1;

import com.petremihai.SPLab.lab1.elements.*;

public class GenerateToC implements Visitor {
    private TableOfContents toc;
    private int pageNumber;

    public GenerateToC() {
        this.toc = new TableOfContents();
        this.pageNumber = 1;
    }

    public TableOfContents getToC() {
        return this.toc;
    }

    @Override
    public void visit(Book book) {
    }

    @Override
    public void visit(Section section) {
        toc.addEntry(section.getTitle(), pageNumber);
        pageNumber++;
    }

    @Override
    public void visit(TableOfContents toc) {}

    @Override
    public void visit(Paragraph paragraph) {}

    @Override
    public void visit(ImageProxy imageProxy) {}

    @Override
    public void visit(Image image) {}

    @Override
    public void visit(Table table) {}
}