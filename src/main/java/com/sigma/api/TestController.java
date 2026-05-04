package com.sigma.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(path="sigma")
    public String testing(){
        return "sigma <br> dop dop <br> skibidi <br> dop dop<br> EHEHEHEHEH!!!";
    }
}
