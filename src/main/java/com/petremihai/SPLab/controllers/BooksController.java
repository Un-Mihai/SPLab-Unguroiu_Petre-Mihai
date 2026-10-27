package com.petremihai.SPLab.controllers;

import com.petremihai.SPLab.lab1.Book;
import com.petremihai.SPLab.persistence.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    private final CrudRepository<Book, Integer> booksRepository;

    public BooksController(CrudRepository<Book, Integer> booksRepository) {
        this.booksRepository = booksRepository;
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
    public Integer create(@RequestBody Book book) {
        return booksRepository.save(book).getId();
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
