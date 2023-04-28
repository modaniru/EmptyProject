package com.example.emptyapplication2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class PingController {
    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }
}
