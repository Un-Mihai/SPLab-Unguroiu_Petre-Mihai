package com.petremihai.SPLab.controllers;

import com.petremihai.SPLab.lab1.Book;
import com.petremihai.SPLab.observer.AllBooksSubject;
import com.petremihai.SPLab.persistence.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    private final CrudRepository<Book, Integer> booksRepository;
    private final AllBooksSubject allBooksSubject;

    public BooksController(CrudRepository<Book, Integer> booksRepository, AllBooksSubject allBooksSubject) {
        this.booksRepository = booksRepository;
        this.allBooksSubject = allBooksSubject;
    }

    @GetMapping
    public List<Book> getAll() {
        return booksRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable Integer id) {
        return ResponseEntity.of(booksRepository.findById(id));
    }

    @PostMapping
    public String create(@RequestBody Book book) {
        book = booksRepository.save(book);
        allBooksSubject.add(book);
        return "Book saved [" + book.getId() + "] " + book.getTitle();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> update(@PathVariable Integer id, @RequestBody Book changes) {
        return ResponseEntity.of(booksRepository.findById(id).map(book -> {
            book.setTitle(changes.getTitle());
            return booksRepository.save(book);
        }));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        booksRepository.deleteById(id);
    }
}
