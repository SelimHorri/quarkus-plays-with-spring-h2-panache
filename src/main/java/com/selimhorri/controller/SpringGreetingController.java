package com.selimhorri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SpringGreetingController {
	
    @GetMapping
    public String hello() {
        return "Hello Spring";
    }
    
    
    
}





