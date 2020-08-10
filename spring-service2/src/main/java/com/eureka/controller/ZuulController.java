package com.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// zuul path로 연결했을때
@RestController
public class ZuulController {
    @GetMapping("")
    public String testWithZuul() {
        return "this is zuul service2";
    }
}
