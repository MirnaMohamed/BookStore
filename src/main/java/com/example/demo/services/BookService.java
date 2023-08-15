package com.example.demo.services;

import com.example.demo.dtos.BookDto;
import com.example.demo.exceptions.NotExistException;

import java.util.List;

public interface BookService {
    List<BookDto> getAllBooks();
    void save(BookDto book);
    BookDto findBookByTitle(String title);
    void update(Integer id, BookDto book);
    BookDto getById(Integer id) throws NotExistException;
    void deleteViaId(Integer id);
}
