package com.jenkins.maven.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@RequestMapping("/")
    public String hello() {
        return "Hello Reddy. This is from a feature2 and version 1.2.0";
    }
}
