package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
    @RequestMapping("/animal")
    public Animal animal() {
        return new Animal("dog", 3);
    }
}
