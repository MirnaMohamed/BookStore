package com.example.demo.mapper;

import com.example.demo.entities.Book;
import com.example.demo.dtos.BookDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDto bookToBookDto(Book source);
    Book DtoToEntity(BookDto destination);
}
