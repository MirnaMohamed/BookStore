package com.example.demo.mapper;

import com.example.demo.dtos.BookDto;
import com.example.demo.dtos.PhotoDto;
import com.example.demo.models.entities.Book;
import com.example.demo.models.entities.Photo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhotoMapper {
    PhotoDto photoToPhotoDto(Photo photo);
    Photo photoDtoToPhoto(PhotoDto photoDto);
}
