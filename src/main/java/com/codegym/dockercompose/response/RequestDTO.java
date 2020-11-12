package com.codegym.dockercompose.response;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;

@Getter
@Setter
public class RequestDTO<T>{
    private String header;
    @Valid
    private Body<T> body;
}
