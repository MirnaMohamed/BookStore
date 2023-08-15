package com.example.demo.mapper;

import com.example.demo.models.entities.Book;
import com.example.demo.dtos.BookDto;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")

public interface BookMapper {
    BookDto bookToBookDto(Book book);
    Book bookDtoToBook(BookDto bookDto);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Book updateBookFromBookDto(BookDto bookDto, @MappingTarget Book book);
}
