package com.codegym.dockercompose.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ErrorDetails {
    private Date timestamp;
    private String code;
    private String message;
    private String details;

    public ErrorDetails(Date timestamp, String code, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
        this.code = code;
    }
}
