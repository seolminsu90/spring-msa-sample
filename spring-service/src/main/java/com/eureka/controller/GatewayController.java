package com.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// spring cloud gateway로 연결했을때.
@RestController
public class GatewayController extends CommonController {

    @GetMapping("")
    public String getSample5() {
        return "First :: /";
    }

    @GetMapping("/sample")
    public String getSample2() {
        return "First :: /sample";
    }

    @GetMapping("/sample/hello")
    public String getSample4() {
        return "First :: /sample/hello";
    }
}
