package com.project1.demo.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {
    @GetMapping("/welcomebro1")
    public String user()
    {
        return("Hello");
    }
}
