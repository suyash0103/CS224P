package com.bigdatahw1.controller;


import com.bigdatahw1.service.ConsumerComplaintsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class ConsumerComplaintsController {

    @Autowired
    private ConsumerComplaintsService consumerComplaintsService;

    @CrossOrigin
    @GetMapping(path = "/filltable")
    public void fillTable() {
        System.out.println("Inside /filltable");
        consumerComplaintsService.fillTable();
    }

}
