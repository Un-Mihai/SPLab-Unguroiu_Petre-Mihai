package com.petremihai.SPLab.lab1.elements.alignments;

import com.petremihai.SPLab.lab1.elements.Paragraph;

public class AlignLeft implements Alignment{

    @Override
    public void render(Paragraph paragraph){
        System.out.println(paragraph.getText());
    }

}
