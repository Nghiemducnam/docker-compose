package com.codegym.dockercompose.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


public class Person {
    @Id
    private Long id;

    @NotNull(message="name không được rỗng!")
    private String name;

    @NotNull(message="Address không được rỗng!")
    private String address;
//    private String numberPhone;
//
//    public String getNumberPhone() {
//        return numberPhone;
//    }
//
//    public void setNumberPhone(String numberPhone) {
//        this.numberPhone = numberPhone;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public Person() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
