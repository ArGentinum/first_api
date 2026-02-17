package com.sigma.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(path="/hello")
    public String helloWorld(){
        return "hello world i am amazing!!!!!";
    }

}
