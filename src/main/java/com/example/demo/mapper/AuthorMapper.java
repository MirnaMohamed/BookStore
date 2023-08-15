package com.example.demo.mapper;

import com.example.demo.dtos.AuthorDto;
import com.example.demo.dtos.BookDto;
import com.example.demo.models.entities.Book;

public interface AuthorMapper {
    AuthorDto authorToAuthorDto(Book source);
    Book DtoToEntity(BookDto destination);
}
