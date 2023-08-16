package com.example.demo.services;

import com.example.demo.dtos.BookDto;
import com.example.demo.dtos.PhotoDto;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface PhotoService {
    List<PhotoDto> getAllPhotos();
    void save(PhotoDto photoDto);
    PhotoDto getPhotoById(Integer id);
}
