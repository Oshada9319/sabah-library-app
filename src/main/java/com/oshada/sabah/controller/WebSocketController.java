package com.oshada.sabah.controller;

import com.oshada.sabah.model.Book;
import com.oshada.sabah.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @Autowired
    BookService bookService;

    @MessageMapping("/addBook")
    @SendTo("/feed")
    public ResponseEntity<?> addBook(Book book) throws InterruptedException {
        Thread.sleep(1000);
        return bookService.addBook(book);
    }

}
