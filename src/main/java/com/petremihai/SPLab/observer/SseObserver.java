package com.petremihai.SPLab.observer;

import com.petremihai.SPLab.lab1.Book;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

// ConcreteObserver: trimite cartea noua (JSON) catre clientul care asculta
public class SseObserver implements Observer {
    private final SseEmitter emitter;

    public SseObserver(SseEmitter emitter) {
        this.emitter = emitter;
    }

    @Override
    public void update(Book book) {
        try {
            emitter.send(book, MediaType.APPLICATION_JSON);
        } catch (Exception e) {
            emitter.completeWithError(e);
        }
    }
}
