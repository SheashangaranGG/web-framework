package com.project1.demo.message;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class returname {
    @Value("${myname.name}")
    private String name;
    @GetMapping("/welcomebro")
    public String user()
    {
        return name;
    }
}
