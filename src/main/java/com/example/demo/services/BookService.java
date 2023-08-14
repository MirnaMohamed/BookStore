package com.example.demo.services;

import com.example.demo.dtos.BookDto;
import com.example.demo.exceptions.BookNotFoundException;

import java.util.List;

public interface BookService {
    List<BookDto> getAllBooks();
    void save(BookDto book);
    BookDto findBookByTitle(String title);
    void update(BookDto book);
    BookDto getById(Integer id) throws BookNotFoundException;
    void deleteViaId(Integer id);
}
