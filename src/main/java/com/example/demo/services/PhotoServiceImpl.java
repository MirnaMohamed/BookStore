package com.example.demo.services;

import com.example.demo.dtos.BookDto;
import com.example.demo.dtos.PhotoDto;
import com.example.demo.mapper.PhotoMapper;
import com.example.demo.models.entities.Photo;
import com.example.demo.repositories.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PhotoServiceImpl implements PhotoService{
    @Autowired
    private PhotoRepository photoRepo;
    @Autowired
    private PhotoMapper photoMapper;
    public List<PhotoDto> getAllPhotos()
    {
        List<Photo> photos = photoRepo.findAll();
        List<PhotoDto> photoDtos = new ArrayList<>();
        photos.forEach(photo -> photoDtos.add(photoMapper.photoToPhotoDto(photo)));
        return photoDtos;
    }
    public void save(PhotoDto photoDto)
    {
        Photo photo = photoMapper.photoDtoToPhoto(photoDto);
        photoRepo.save(photo);
    }

    @Override
    public PhotoDto getPhotoById(Integer id) {
        Photo photo = photoRepo.findById(id).get();
        PhotoDto photoDto = photoMapper.photoToPhotoDto(photo);
        return photoDto;
    }
}
