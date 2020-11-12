package com.codegym.dockercompose.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class Person {
    @Id
    private Long id;

    @NotNull(message="name không được null!")
    @NotBlank(message="name không được rỗng!")
    private String name;

    @NotNull(message="Address không được null!")
    @NotBlank(message="Address không được rỗng!")
    private String address;

    public Person(Long id, @NotNull(message = "name không được null!") @NotBlank(message = "name không được rỗng!") String name, @NotNull(message = "Address không được null!") @NotBlank(message = "Address không được rỗng!") String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
