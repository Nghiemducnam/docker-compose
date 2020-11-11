package com.codegym.dockercompose.controllers;

import com.codegym.dockercompose.models.Person;
import com.codegym.dockercompose.response.ResponseApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
public class ComposeController {
    @Autowired
    private  SimpMessagingTemplate template;
    @GetMapping("/api")
    public ResponseEntity<?> testApi(@Valid @RequestBody ResponseApi<Person> res){
        if(res.getData() != null){
            this.template.convertAndSend("/message", "call api is success");

        }
        return new ResponseEntity<>("good evening", HttpStatus.OK);
    }
}
