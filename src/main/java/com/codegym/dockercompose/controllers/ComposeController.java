package com.codegym.dockercompose.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ComposeController {
    @Autowired
    private  SimpMessagingTemplate template;
    @GetMapping("/api")
    public ResponseEntity<?> testApi(){
        this.template.convertAndSend("/message", "call api is success");
        return new ResponseEntity<>("good evening", HttpStatus.OK);
    }
}
