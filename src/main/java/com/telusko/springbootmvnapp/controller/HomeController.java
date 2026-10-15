package com.telusko.springbootmvnapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home()
    {
        String s= "Telusko";
        return "index";
    }
}
