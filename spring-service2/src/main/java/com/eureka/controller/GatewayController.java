package com.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController extends CommonController {

    @GetMapping("")
    public String getSample5() {
        return "Second :: /";
    }

    @GetMapping("/sample")
    public String getSample2() {
        return "Second :: /sample";
    }

    @GetMapping("/sample/hello")
    public String getSample4() throws InterruptedException {
        Thread.sleep(10000);
        return "Second :: /sample/hello";
    }
}
