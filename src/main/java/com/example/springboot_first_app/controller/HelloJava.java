package com.example.springboot_first_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJava {
    @GetMapping("/get")
    public String Hello(){
        return "welcome to pubg";
    }

    @GetMapping("/getPubg")
    public String Pubg(){
        return "welcome to battle field";
    }


}
