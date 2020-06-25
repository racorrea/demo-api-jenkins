package com.racoservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class APIHealth {

    @GetMapping("/health")
    public String statusHealth(){
        return "{\"status\": \"UP\"}";
    }

}