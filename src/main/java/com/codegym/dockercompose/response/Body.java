package com.codegym.dockercompose.response;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;

@Getter
@Setter
public class Body <T>{
    private String command;
    @Valid
    private T data;

    public Body(String command, T data) {
        this.command = command;
        this.data = data;
    }
}
