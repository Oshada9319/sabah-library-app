package com.oshada.sabah.repository;

import com.oshada.sabah.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByTitle(String title);

    List<Book> findByAuthor(String title);

}
