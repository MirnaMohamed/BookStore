package com.example.demo.dtos;

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
    //logger
}
