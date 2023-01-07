package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

}
