package com.security_example_01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/users")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name ) {
        return String.format("User Hello %s!",name);
    }
}
