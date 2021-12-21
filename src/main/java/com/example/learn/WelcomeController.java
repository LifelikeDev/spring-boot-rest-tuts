package com.example.learn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller // handles HTTP requests
//@ResponseBody // converts the return message to a JSON format that can be easily accessible to the client
//@RestController // combination of @Controller and @ResponseBody annotations
@RestController
public class WelcomeController {

    // GET HTTP REQUEST
    @GetMapping("/greeting")
    public String greeting() {
        return "Hello there!!! \n Welcome to my first Springboot REST Application";
    }



}
