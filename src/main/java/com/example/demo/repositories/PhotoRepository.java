package com.example.demo.repositories;

import com.example.demo.models.entities.Book;
import com.example.demo.models.entities.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PhotoRepository extends JpaRepository<Photo, Integer> {
    List<Photo> findAll();
}
