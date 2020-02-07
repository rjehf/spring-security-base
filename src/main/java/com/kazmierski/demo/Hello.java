package com.kazmierski.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/hello2")
    public String sayHello2() {
        return "hello2";
    }




}
