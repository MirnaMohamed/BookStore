package com.example.demo.repositories;

import com.example.demo.models.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findAll();
    List<Book> findByAuthor(String author);
    List<Book> findByTitleAndAuthor(String title, String author);

    Optional<Book> findByTitleLike(String title);

    @Query("SELECT t FROM Book t WHERE LOWER(t.title) LIKE LOWER(CONCAT('%', ?1,'%'))")
    List<Book> findByTitleLikeCaseInsensitive(String title);

}
