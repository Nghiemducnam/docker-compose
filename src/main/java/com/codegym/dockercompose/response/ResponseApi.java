package com.codegym.dockercompose.response;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import java.util.Date;

@Getter
@Setter
public class ResponseApi <T> {
    private Date timestamp;
    private String code;
    private String message;
    @Valid
    public T data;
}
