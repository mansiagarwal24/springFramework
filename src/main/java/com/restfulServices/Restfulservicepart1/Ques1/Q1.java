package com.restfulServices.Restfulservicepart1.Ques1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Q1 {
   @GetMapping(path = "/welcome")
    public String getMessage(){
        return "Welcome to Spring Boot";
    }
}
