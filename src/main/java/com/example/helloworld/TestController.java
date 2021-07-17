package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping
    public String helloWorld() {
        System.out.println("Testing...............................");
        System.out.println("Testing2...............................");
        System.out.println("Testing3...............................");
        System.out.println("Testing4...............................");
        return "Hello World";
    }
}
