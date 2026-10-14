package com.petremihai.SPLab;

import com.petremihai.SPLab.lab1.Book;
import com.petremihai.SPLab.lab1.BookStatistics;
import com.petremihai.SPLab.lab1.Visitor;
import com.petremihai.SPLab.lab1.elements.*;

public class SpLabApplication {

	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();

		ImageProxy img1 = new ImageProxy("Pamela Anderson");
		ImageProxy img2 = new ImageProxy("Kim Kardashian");
		ImageProxy img3 = new ImageProxy("Kirby Griffin");

		Section playboyS1 = new Section("Front Cover");
		playboyS1.add(img1);

		Section playboyS2 = new Section("Summer Girls");
		playboyS2.add(img2);
		playboyS2.add(img3);

		Book playboy = new Book("Playboy");
		playboy.addContent(playboyS1);
		playboy.addContent(playboyS2);

		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		playboy.addContent(cap1);

		System.out.println("Printing without Alignment");
		System.out.println();
		cap1.print();

		p1.setAlignStrategy(new AlignCenter());
		p2.setAlignStrategy(new AlignRight());
		p3.setAlignStrategy(new AlignLeft());

		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();

		BookStatistics visitor = new BookStatistics();
		playboy.accept(visitor);
		visitor.printStatistics();
	}
}