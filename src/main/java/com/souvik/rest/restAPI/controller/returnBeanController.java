package com.souvik.rest.restAPI.controller;

import com.souvik.rest.restAPI.returnBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class returnBeanController {

//    http://localhost:8943/return-bean
    @GetMapping("/return-bean")
    public returnBean returnBean(){

        return new returnBean("Souvik","Karmakar");

    }


}
