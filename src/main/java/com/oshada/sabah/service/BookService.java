package com.oshada.sabah.service;

import com.oshada.sabah.model.Book;
import com.oshada.sabah.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    private static final Logger log = LoggerFactory.getLogger(BookService.class);

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    public List<Book> findByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    public ResponseEntity<?> borrowOrReturn(Integer id, boolean isBorrowed) {
        try {
            Optional<Book> optionalBook = bookRepository.findById(id);
            if(optionalBook.isPresent()){
                Book bookPersisting = optionalBook.get();
                bookPersisting.setBorrowed(isBorrowed);
                Book bookPersisted = bookRepository.save(bookPersisting);
                return ResponseEntity.ok(bookPersisted);
            }
            return ResponseEntity.notFound().build();
        }
        catch (Exception e) {
            log.error("Error occurred while updating return or borrowed status of book with id " + id);
            return ResponseEntity.internalServerError().build();
        }
    }

    public ResponseEntity<?>  addBook(Book book) {
        try {
            book.setBorrowed(false);
            Book bookPersisted = bookRepository.save(book);
            return ResponseEntity.ok(bookPersisted);
        }
        catch (Exception e) {
            log.error("Error occurred while adding a book with book id " + book.getIsbn() + " title " + book.getTitle() + " author " + book.getAuthor());
            return ResponseEntity.internalServerError().build();
        }
    }

}
