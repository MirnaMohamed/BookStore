package com.example.demo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserGetDto {
    @JsonProperty("username")
    private String username;

    @JsonProperty("email")
    private String email;


}
