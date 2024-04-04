package com.project1.demo.message;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project1.Response.Response;

@RestController
public class Message1 {
    @Value("${myname.name}")
    private String myname;

    @GetMapping("/welcome")
    public Response message()
    {
        Response obj= new Response(1, "ggs","GGS");
        return obj;
    }
}
