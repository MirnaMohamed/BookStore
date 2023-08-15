package com.example.demo.dtos;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class AuthorDto {
    private int id;

    private String name;

    private String surname;

    @Temporal(TemporalType.DATE)
    private Date birthDate;
}
