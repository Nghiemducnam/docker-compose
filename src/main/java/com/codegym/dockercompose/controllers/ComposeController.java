package com.codegym.dockercompose.controllers;

import com.codegym.dockercompose.models.Person;
import com.codegym.dockercompose.response.RequestDTO;
import com.codegym.dockercompose.response.ResponseApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
public class ComposeController {
    @Autowired
    private  SimpMessagingTemplate template;
    @PostMapping("/api")
    public ResponseEntity<?> testApi(@Valid @RequestBody ResponseApi<Person> res){

            this.template.convertAndSend("/message", "call api is success");


        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PostMapping("/api/1")
    public ResponseEntity<?> testApi1(@Valid @RequestBody RequestDTO<Person> res){

        this.template.convertAndSend("/message", "call api is success");


        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
