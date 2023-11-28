package com.souvik.rest.restAPI.controller;

import com.souvik.rest.restAPI.returnList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class returnListController {

//    http://localhost:8943/returnList
    @GetMapping("/returnList")
    public List<returnList> getList(){

        List<returnList> list = new ArrayList<>();
        list.add(new returnList("Souvik","Karmakar"));
        list.add(new returnList("Tanuka","Saha"));

        return list;
    }

}
