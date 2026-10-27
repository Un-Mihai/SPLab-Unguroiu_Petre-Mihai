package com.petremihai.SPLab;

import com.petremihai.SPLab.difexample.ClientComponent;
import com.petremihai.SPLab.difexample.SingletonComponent;
import com.petremihai.SPLab.difexample.TransientComponent;
import com.petremihai.SPLab.lab1.elements.*;
import com.petremihai.SPLab.lab1.Book;
import com.petremihai.SPLab.lab1.GenerateToC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpLabApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(SpLabApplication.class, args);

		// La fiecare cerere, contextul DI creeaza o noua instanta de TransientComponent
		TransientComponent transientBean = context.getBean(TransientComponent.class);
		transientBean.operation();
		transientBean = context.getBean(TransientComponent.class);
		transientBean.operation();

		// SingletonComponent a fost creat la pornirea aplicatiei si este returnat mereu acelasi
		SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
		singletonBean.operation();
		singletonBean = context.getBean(SingletonComponent.class);
		singletonBean.operation();

		ClientComponent c = context.getBean(ClientComponent.class);
		c.operation();
		// Instanta poate fi ceruta si dupa nume
		c = (ClientComponent) context.getBean("clientComponent");
		c.operation();

		runBookDemo();
	}

	private static void runBookDemo() {
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
