package com.harjoitus.springdockerharjoitus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/")
    @ResponseBody
    public String sayHello() {
        return "terve";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String sayHelloToSomeone() {
        return "no terve";
    }
}
