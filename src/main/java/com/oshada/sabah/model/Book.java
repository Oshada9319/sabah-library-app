package com.oshada.sabah.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "book")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "isBorrowed", columnDefinition = "boolean default 0")
    private boolean isBorrowed;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Book))
            return false;
        Book book = (Book) o;
        return Objects.equals(this.isbn, book.isbn) && Objects.equals(this.title, book.title)
                && Objects.equals(this.author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.isbn, this.title, this.author);
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + this.isbn + ", name='" + this.title + '\'' + ", author='" + this.author + '\'' + '}';
    }

}
