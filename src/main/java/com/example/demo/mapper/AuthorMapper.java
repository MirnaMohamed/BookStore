package com.example.demo.mapper;

import com.example.demo.dtos.AuthorDto;
import com.example.demo.dtos.BookDto;
import com.example.demo.models.entities.Author;
import com.example.demo.models.entities.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    AuthorDto authorToAuthorDto(Author author);
    Author authorToAuthorDto(AuthorDto authorDto);
}
