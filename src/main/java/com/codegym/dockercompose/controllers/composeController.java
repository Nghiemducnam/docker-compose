package com.codegym.dockercompose.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class composeController {
    @GetMapping("")
    public String getData(){
        return "good evening";
    }
}
