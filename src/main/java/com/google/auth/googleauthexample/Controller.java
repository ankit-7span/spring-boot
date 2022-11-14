package com.google.auth.googleauthexample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @GetMapping("/message")
    public ResponseEntity<String> method(){
        return ResponseEntity.ok("Hello World");
    }

}
