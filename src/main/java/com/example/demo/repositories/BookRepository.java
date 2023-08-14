package com.example.demo.repositories;

import com.example.demo.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
//    @Query("SELECT b FROM Book b")
    List<Book> findAll();
    //validation input from user inside the object

//    @Query("SELECT b FROM Book b WHERE LOWER(b.title) LIKE LOWER(CONCAT('%', ?1,'%')) ORDER BY b.title desc")
    Book findByTitle(String title);
//    @Query("SELECT b FROM Book b WHERE LOWER(b.author) LIKE LOWER(CONCAT('%', ?1,'%')) ORDER BY b.author desc")
    List<Book> findByAuthor(String author);

//    @Query("SELECT b FROM Book b WHERE LOWER(b.title) LIKE LOWER(CONCAT('%', ?1,'%')) AND LOWER(b.author) LIKE LOWER(CONCAT('%', ?2,'%'))")
    List<Book> findByTitleAndAuthor(String title, String author);

//    @Query("SELECT b FROM Book b WHERE b.title LIKE %?1%")
    List<Book> findByTitleLike(String title);

    @Query("SELECT t FROM Book t WHERE LOWER(t.title) LIKE LOWER(CONCAT('%', ?1,'%'))")
    List<Book> findByTitleLikeCaseInsensitive(String title);
//    List<Book> findByPublished(boolean published);
//    List<Book> findById(int id);
}