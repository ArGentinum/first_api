package com.sigma.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyController {
    @GetMapping(path="/user")
    public String testing(){
        return "sigma it worked!!!!";
    }
}
