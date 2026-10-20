package com.petremihai.SPLab;

import com.petremihai.SPLab.lab1.elements.*;
import com.petremihai.SPLab.lab1.Book;
import com.petremihai.SPLab.lab1.GenerateToC;

public class SpLabApplication {

	public static void main(String[] args) throws Exception {

		Book myBook = new Book("Design Patterns Book");

		Section cap1 = new Section("Capitolul 1: Introducere");
		Section cap2 = new Section("Capitolul 2: Visitor Pattern");
		Section cap3 = new Section("Capitolul 3: Concluzii");

		cap1.add(new Paragraph("Acesta este primul paragraf din capitolul 1."));
		cap2.add(new Paragraph("Acesta este primul paragraf din capitolul 2."));
		cap2.add(new Image("Image1"));
		cap3.add(new Paragraph("Acesta este un paragraf de concluzie."));

		myBook.addContent(cap1);
		myBook.addContent(cap2);
		myBook.addContent(cap3);

		GenerateToC generateToC = new GenerateToC();

		myBook.accept(generateToC);

		TableOfContents toc = generateToC.getToC();

		toc.print();
	}
}