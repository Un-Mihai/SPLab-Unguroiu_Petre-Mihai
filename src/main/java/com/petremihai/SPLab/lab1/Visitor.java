package com.petremihai.SPLab.lab1;

import com.petremihai.SPLab.lab1.elements.*;

public interface Visitor {
    void visit(Book book);
    void visit(Section section);
    void visit(TableOfContents toc);
    void visit(Paragraph paragraph);
    void visit(ImageProxy imageProxy);
    void visit(Image image);
    void visit(Table table);
}