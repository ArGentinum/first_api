package com.sigma.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class SampleController{
    
    @GetMapping(path="/sample")
    public String something(){
        return "why is <br><br><br><br> new line not occurring?";
    }
}