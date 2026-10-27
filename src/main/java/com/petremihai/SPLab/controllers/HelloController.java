package com.petremihai.SPLab.controllers;

import com.petremihai.SPLab.difexample.ClientComponent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Pasul 11: injectam doua "instante" de ClientComponent. Fiind singleton (scope implicit),
// containerul DI ofera de fiecare data aceeasi instanta, deci client1 == client2.
@RestController
public record HelloController(ClientComponent client1, ClientComponent client2) {

	@GetMapping("/")
	public String hello() {
		return "Hello from Spring Boot";
	}

	@GetMapping("/client")
	public String helloClient() {
		return "Hello from ClientComponent = " + client1;
	}

	@GetMapping("/clients")
	public String helloClients() {
		return "client1 = " + client1 + ", client2 = " + client2
				+ ", same instance: " + (client1 == client2);
	}
}
