package com.example.demo.web.controller;

import com.example.demo.dtos.BookDto;
import com.example.demo.dtos.PhotoDto;
import com.example.demo.services.PhotoService;
import com.example.demo.services.PhotoServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/v1/api/photos")
public class PhotoController {
    @Autowired
    private PhotoService photoService;
    @PostMapping
    public ResponseEntity<String> addBook(@Valid @RequestBody PhotoDto photoDto) {
        photoService.save(photoDto);
        return ResponseEntity.ok("Photo added successfully");
    }

    @GetMapping
    public List<PhotoDto> findAllPhotos() {
        return photoService.getAllPhotos();
    }
}
