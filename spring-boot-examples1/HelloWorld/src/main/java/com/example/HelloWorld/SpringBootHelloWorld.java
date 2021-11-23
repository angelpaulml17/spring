package com.example.HelloWorld;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
 import org.springframework.context.annotation.ComponentScan;
@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootHelloWorld {
 
    @RequestMapping("/")
    String home() {
        return "Hello Spring Boot!!!";
    }
 
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootHelloWorld.class, args);
    }
 
}
