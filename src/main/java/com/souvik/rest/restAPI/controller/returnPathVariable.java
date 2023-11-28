package com.souvik.rest.restAPI.controller;

import com.souvik.rest.restAPI.pathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class returnPathVariable {

    @GetMapping("pathVariable/{firstName}/{lastName}")
    public pathVariable pathVariable(@PathVariable ("firstName") String firstName, @PathVariable ("lastName") String lastName){

        return new pathVariable(firstName,lastName);

    }

}
