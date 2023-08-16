package com.example.demo.dtos;

import com.example.demo.models.entities.Photo;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class BookDto {

    private Integer id;
    private String title;
    private String author;
    private String description;
    private float price;
    private int quantity;
    private int photo_id;
//    private PhotoDto photo;

}
