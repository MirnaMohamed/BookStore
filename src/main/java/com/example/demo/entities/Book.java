package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

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
    @NotBlank(message = "Author is mandatory")
    private String author;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private float price;
    @Column(name = "quantity")
    private int quantity;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
