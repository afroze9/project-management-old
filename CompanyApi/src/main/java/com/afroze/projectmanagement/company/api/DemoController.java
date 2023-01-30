package com.afroze.projectmanagement.company.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo")
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
