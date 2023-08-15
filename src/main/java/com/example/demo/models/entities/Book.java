package com.example.demo.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "book")
@Data
public class Book {
    //id, title, author, description, price, and quantity.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "title")
    @NotBlank(message = "Title is mandatory")
    private String title;
    @Column(name = "author")
//    @NotBlank(message = "Author is mandatory")
    private String author;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private float price;
    @Column(name = "quantity")
    private int quantity;
//    @ManyToMany(
//            fetch = FetchType.LAZY,
//            mappedBy = "books"
//    )
//    private Set<Author> authors = new HashSet<>();
//
//    @ManyToMany(
//            fetch = FetchType.LAZY,
//            mappedBy = "books"
//    )
//    private Set<User> users = new HashSet<>();
}
