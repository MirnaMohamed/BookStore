package com.example.demo.mapper;

import com.example.demo.dtos.PhotoDto;
import com.example.demo.models.entities.Book;
import com.example.demo.dtos.BookDto;
import com.example.demo.models.entities.Photo;
import org.mapstruct.*;

@Mapper(componentModel = "spring")

public interface BookMapper {


//    Photo photoDtoToPhoto(PhotoDto photoDto);
    BookDto bookToBookDto(Book book);
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "photo_id", target = "photo", qualifiedByName = "convertPhotoIdToPhoto")
    Book bookDtoToBook(BookDto bookDto);
    @Mapping(target = "id", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Book updateBookFromBookDto(BookDto bookDto, @MappingTarget Book book);


    @Named("convertPhotoIdToPhoto")
    default Photo convertPhotoIdToPhoto(int photo_id){
        Photo photo = new Photo();
        photo.setId(photo_id);
        return photo;
    }
}
