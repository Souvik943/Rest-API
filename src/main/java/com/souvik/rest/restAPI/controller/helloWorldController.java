package com.souvik.rest.restAPI.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

//    http://localhost:8943/helloworld
    @GetMapping("/helloworld")
    public String helloWorld(){

        return "Hello from Hello World";

    }

}
