package com.oshada.sabah.controller;

import com.oshada.sabah.model.Book;
import com.oshada.sabah.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/getAllBooks")
    public List<Book> findAllBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping(value = "/getAllBooksByTitle/{title}")
    public ResponseEntity<List<Book>> findByTitle(@PathVariable(value = "title") String title) {
        return ResponseEntity.ok(bookService.findByTitle(title));
    }

    @GetMapping(value = "/getAllBooksByAuthor/{author}")
    public ResponseEntity<List<Book>> findByAuthor(@PathVariable(value = "author") String author) {
        return ResponseEntity.ok(bookService.findByAuthor(author));
    }

    @PostMapping(value = "/borrowOrReturn")
    public ResponseEntity<?> borrowOrReturn(@RequestBody @Validated Book book) {
        Integer id = book.getId();
        boolean isBorrowed = book.isBorrowed();
        return bookService.borrowOrReturn(id, isBorrowed);
    }

    @PostMapping(value = "/addBook")
    public ResponseEntity<?> addBook(@Validated @RequestBody Book book) {
        return bookService.addBook(book);
    }

}
