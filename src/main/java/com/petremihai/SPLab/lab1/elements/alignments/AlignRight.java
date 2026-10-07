package com.petremihai.SPLab.lab1.elements.alignments;

import com.petremihai.SPLab.lab1.elements.Paragraph;

public class AlignRight implements Alignment{
    @Override
    public void render(Paragraph paragraph){
        for(int i = 0; i < paragraph.getNumberOfElements(); i ++){
            System.out.println("            " + paragraph.getElement(i).toString());
        }
    }
}
