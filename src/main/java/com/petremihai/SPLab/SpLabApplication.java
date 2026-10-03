package com.petremihai.SPLab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.petremihai.SPLab.lab1.*;
import com.petremihai.SPLab.lab1.elements.*;

@SpringBootApplication
public class SpLabApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpLabApplication.class, args);
		Book noapteBuna = new Book("Noapte buna, copii!");
		Author rpGheo = new Author("Radu Pavel", "Gheo");
		noapteBuna.addAuthor(rpGheo);

		Section cap1 = new Section("Capitolul 1");
		Section cap11 = new Section("Capitolul 1.1");
		Section cap111 = new Section("Capitolul 1.1.1");
		Section cap1111 = new Section("Subchapter 1.1.1.1");
		noapteBuna.addElement(new Paragraph("Multumesc celor care ..."));
		noapteBuna.addElement(cap1);
		cap1.addElement(new Paragraph("Moto capitol"));
		cap1.addElement(cap11);
		cap11.addElement(new Paragraph("Text from subchapter 1.1"));
		cap11.addElement(cap111);
		cap111.addElement(new Paragraph("Text from subchapter 1.1.1"));
		cap111.addElement(cap1111);
		cap1111.addElement(new Image("Image subchapter 1.1.1.1"));

		noapteBuna.print();

	}

}
